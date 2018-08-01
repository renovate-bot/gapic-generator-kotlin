/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.kotlin.generator.grpc

import com.google.api.kotlin.GeneratorContext
import com.google.api.kotlin.generator.AbstractGenerator
import com.google.api.kotlin.types.GrpcTypes
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

// creates a nested type that will be used to hold the gRPC stubs used by the client
internal class Stubs : AbstractGenerator() {
    companion object {
        const val PROP_STUBS_STREAM = "stream"
        const val PROP_STUBS_FUTURE = "future"
        const val PROP_STUBS_OPERATION = "operation"

        const val CLASS_NAME = "Stubs"
    }

    fun generateHolderType(ctx: GeneratorContext): TypeSpec {
        val streamType = getStreamStubType(ctx)
        val futureType = getFutureStubType(ctx)
        val opType = getOperationsStubType(ctx)

        return TypeSpec.classBuilder(CLASS_NAME)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(PROP_STUBS_STREAM, streamType)
                    .addParameter(PROP_STUBS_FUTURE, futureType)
                    .addParameter(PROP_STUBS_OPERATION, opType)
                    .build()
            )
            .addProperty(
                PropertySpec.builder(PROP_STUBS_STREAM, streamType)
                    .initializer(PROP_STUBS_STREAM)
                    .build()
            )
            .addProperty(
                PropertySpec.builder(PROP_STUBS_FUTURE, futureType)
                    .initializer(PROP_STUBS_FUTURE)
                    .build()
            )
            .addProperty(
                PropertySpec.builder(PROP_STUBS_OPERATION, opType)
                    .initializer(PROP_STUBS_OPERATION)
                    .build()
            )
            .addType(
                TypeSpec.interfaceBuilder("Factory")
                    .addFunction(
                        FunSpec.builder("create")
                            .addModifiers(KModifier.ABSTRACT)
                            .returns(
                                ClassName("",
                                    CLASS_NAME
                                )
                            )
                            .addParameter(Properties.PROP_CHANNEL, GrpcTypes.ManagedChannel)
                            .addParameter(Properties.PROP_CALL_OPTS, GrpcTypes.Support.ClientCallOptions)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    fun getStreamStubType(ctx: GeneratorContext) = GrpcTypes.Support.GrpcClientStub(
        ctx.typeMap.getKotlinGrpcTypeInnerClass(
            ctx.proto, ctx.service, "Grpc", "${ctx.service.name}Stub"
        )
    )

    fun getFutureStubType(ctx: GeneratorContext) = GrpcTypes.Support.GrpcClientStub(
        ctx.typeMap.getKotlinGrpcTypeInnerClass(
            ctx.proto, ctx.service, "Grpc", "${ctx.service.name}FutureStub"
        )
    )

    fun getOperationsStubType(ctx: GeneratorContext) =
        GrpcTypes.Support.GrpcClientStub(GrpcTypes.OperationsFutureStub)
}
