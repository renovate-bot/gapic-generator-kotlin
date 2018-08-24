// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/hello.proto

package google.example;

/** Protobuf type {@code google.example.HiResponse} */
public final class HiResponse
    extends com.google.protobuf.GeneratedMessageLite<HiResponse, HiResponse.Builder>
    implements
    // @@protoc_insertion_point(message_implements:google.example.HiResponse)
    HiResponseOrBuilder {
  private HiResponse() {
    result_ = "";
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private java.lang.String result_;
  /** <code>optional string result = 1;</code> */
  public java.lang.String getResult() {
    return result_;
  }
  /** <code>optional string result = 1;</code> */
  public com.google.protobuf.ByteString getResultBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(result_);
  }
  /** <code>optional string result = 1;</code> */
  private void setResult(java.lang.String value) {
    if (value == null) {
      throw new NullPointerException();
    }

    result_ = value;
  }
  /** <code>optional string result = 1;</code> */
  private void clearResult() {

    result_ = getDefaultInstance().getResult();
  }
  /** <code>optional string result = 1;</code> */
  private void setResultBytes(com.google.protobuf.ByteString value) {
    if (value == null) {
      throw new NullPointerException();
    }
    checkByteStringIsUtf8(value);

    result_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!result_.isEmpty()) {
      output.writeString(1, getResult());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!result_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeStringSize(1, getResult());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static google.example.HiResponse parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
  }

  public static google.example.HiResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

  public static google.example.HiResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
  }

  public static google.example.HiResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }

  public static google.example.HiResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
  }

  public static google.example.HiResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static google.example.HiResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static google.example.HiResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static google.example.HiResponse parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
  }

  public static google.example.HiResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(google.example.HiResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /** Protobuf type {@code google.example.HiResponse} */
  public static final class Builder
      extends com.google.protobuf.GeneratedMessageLite.Builder<google.example.HiResponse, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.example.HiResponse)
      google.example.HiResponseOrBuilder {
    // Construct using google.example.HiResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    /** <code>optional string result = 1;</code> */
    public java.lang.String getResult() {
      return instance.getResult();
    }
    /** <code>optional string result = 1;</code> */
    public com.google.protobuf.ByteString getResultBytes() {
      return instance.getResultBytes();
    }
    /** <code>optional string result = 1;</code> */
    public Builder setResult(java.lang.String value) {
      copyOnWrite();
      instance.setResult(value);
      return this;
    }
    /** <code>optional string result = 1;</code> */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }
    /** <code>optional string result = 1;</code> */
    public Builder setResultBytes(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResultBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.example.HiResponse)
  }

  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE:
        {
          return new google.example.HiResponse();
        }
      case IS_INITIALIZED:
        {
          return DEFAULT_INSTANCE;
        }
      case MAKE_IMMUTABLE:
        {
          return null;
        }
      case NEW_BUILDER:
        {
          return new Builder();
        }
      case VISIT:
        {
          Visitor visitor = (Visitor) arg0;
          google.example.HiResponse other = (google.example.HiResponse) arg1;
          result_ =
              visitor.visitString(
                  !result_.isEmpty(), result_, !other.result_.isEmpty(), other.result_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor.INSTANCE) {}
          return this;
        }
      case MERGE_FROM_STREAM:
        {
          com.google.protobuf.CodedInputStream input = (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default:
                  {
                    if (!input.skipField(tag)) {
                      done = true;
                    }
                    break;
                  }
                case 10:
                  {
                    String s = input.readStringRequireUtf8();

                    result_ = s;
                    break;
                  }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
                    .setUnfinishedMessage(this));
          } finally {
          }
        }
      case GET_DEFAULT_INSTANCE:
        {
          return DEFAULT_INSTANCE;
        }
      case GET_PARSER:
        {
          if (PARSER == null) {
            synchronized (google.example.HiResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
    }
    throw new UnsupportedOperationException();
  }

  // @@protoc_insertion_point(class_scope:google.example.HiResponse)
  private static final google.example.HiResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new HiResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static google.example.HiResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<HiResponse> PARSER;

  public static com.google.protobuf.Parser<HiResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}