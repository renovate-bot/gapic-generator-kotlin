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

package com.google.api.kotlin.config

import com.google.api.kotlin.BaseGeneratorTest
import com.google.api.kotlin.generator.GRPCGenerator
import com.google.common.truth.Truth.assertThat
import kotlin.test.Test

internal class ConfigurationTest : BaseGeneratorTest(GRPCGenerator()) {

    @Test
    fun `can use default for file level proto annotations`() {
        val factory = AnnotationConfigurationFactory()
        val config = factory.fromProto(testProto)

        assertThat(config.branding.name).isEqualTo("")
        assertThat(config.branding.url).isEqualTo("")
        assertThat(config.packageName).isEqualTo("google.example")
    }

    @Test
    fun `can parse file level proto annotations`() {
        val factory = AnnotationConfigurationFactory()
        val config = factory.fromProto(testAnnotationsProto)

        assertThat(config.branding.name).isEqualTo("The Test Product")
        assertThat(config.branding.url).isEqualTo("https://github.com/googleapis/gapic-generator-kotlin")
        assertThat(config.packageName).isEqualTo("a.name.space")
    }
}