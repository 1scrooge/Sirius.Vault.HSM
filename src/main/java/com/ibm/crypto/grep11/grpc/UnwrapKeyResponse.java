// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

/** Protobuf type {@code grep11.UnwrapKeyResponse} */
public final class UnwrapKeyResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grep11.UnwrapKeyResponse)
    UnwrapKeyResponseOrBuilder {
  public static final int UNWRAPPED_FIELD_NUMBER = 7;
  public static final int CHECKSUM_FIELD_NUMBER = 8;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:grep11.UnwrapKeyResponse)
  private static final com.ibm.crypto.grep11.grpc.UnwrapKeyResponse DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<UnwrapKeyResponse> PARSER =
      new com.google.protobuf.AbstractParser<UnwrapKeyResponse>() {
        @java.lang.Override
        public UnwrapKeyResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UnwrapKeyResponse(input, extensionRegistry);
        }
      };

  static {
    DEFAULT_INSTANCE = new com.ibm.crypto.grep11.grpc.UnwrapKeyResponse();
  }

  private com.google.protobuf.ByteString unwrapped_;
  private com.google.protobuf.ByteString checkSum_;
  private byte memoizedIsInitialized = -1;
  // Use UnwrapKeyResponse.newBuilder() to construct.
  private UnwrapKeyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UnwrapKeyResponse() {
    unwrapped_ = com.google.protobuf.ByteString.EMPTY;
    checkSum_ = com.google.protobuf.ByteString.EMPTY;
  }

  private UnwrapKeyResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 58:
            {
              unwrapped_ = input.readBytes();
              break;
            }
          case 66:
            {
              checkSum_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_UnwrapKeyResponse_descriptor;
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.ibm.crypto.grep11.grpc.UnwrapKeyResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.ibm.crypto.grep11.grpc.UnwrapKeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<UnwrapKeyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UnwrapKeyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.crypto.grep11.grpc.Hsm
        .internal_static_grep11_UnwrapKeyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.class,
            com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.Builder.class);
  }

  /**
   * <code>bytes Unwrapped = 7;</code>
   *
   * @return The unwrapped.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUnwrapped() {
    return unwrapped_;
  }

  /**
   * <code>bytes CheckSum = 8;</code>
   *
   * @return The checkSum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCheckSum() {
    return checkSum_;
  }

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!unwrapped_.isEmpty()) {
      output.writeBytes(7, unwrapped_);
    }
    if (!checkSum_.isEmpty()) {
      output.writeBytes(8, checkSum_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!unwrapped_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(7, unwrapped_);
    }
    if (!checkSum_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(8, checkSum_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.ibm.crypto.grep11.grpc.UnwrapKeyResponse)) {
      return super.equals(obj);
    }
    com.ibm.crypto.grep11.grpc.UnwrapKeyResponse other =
        (com.ibm.crypto.grep11.grpc.UnwrapKeyResponse) obj;

    if (!getUnwrapped().equals(other.getUnwrapped())) return false;
    if (!getCheckSum().equals(other.getCheckSum())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UNWRAPPED_FIELD_NUMBER;
    hash = (53 * hash) + getUnwrapped().hashCode();
    hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
    hash = (53 * hash) + getCheckSum().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnwrapKeyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.UnwrapKeyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /** Protobuf type {@code grep11.UnwrapKeyResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grep11.UnwrapKeyResponse)
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponseOrBuilder {
    private com.google.protobuf.ByteString unwrapped_ = com.google.protobuf.ByteString.EMPTY;
    private com.google.protobuf.ByteString checkSum_ = com.google.protobuf.ByteString.EMPTY;

    // Construct using com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_UnwrapKeyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_UnwrapKeyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.class,
              com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      unwrapped_ = com.google.protobuf.ByteString.EMPTY;

      checkSum_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_UnwrapKeyResponse_descriptor;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.UnwrapKeyResponse getDefaultInstanceForType() {
      return com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.UnwrapKeyResponse build() {
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.UnwrapKeyResponse buildPartial() {
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponse result =
          new com.ibm.crypto.grep11.grpc.UnwrapKeyResponse(this);
      result.unwrapped_ = unwrapped_;
      result.checkSum_ = checkSum_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibm.crypto.grep11.grpc.UnwrapKeyResponse) {
        return mergeFrom((com.ibm.crypto.grep11.grpc.UnwrapKeyResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.crypto.grep11.grpc.UnwrapKeyResponse other) {
      if (other == com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.getDefaultInstance()) return this;
      if (other.getUnwrapped() != com.google.protobuf.ByteString.EMPTY) {
        setUnwrapped(other.getUnwrapped());
      }
      if (other.getCheckSum() != com.google.protobuf.ByteString.EMPTY) {
        setCheckSum(other.getCheckSum());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ibm.crypto.grep11.grpc.UnwrapKeyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <code>bytes Unwrapped = 7;</code>
     *
     * @return The unwrapped.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUnwrapped() {
      return unwrapped_;
    }

    /**
     * <code>bytes Unwrapped = 7;</code>
     *
     * @param value The unwrapped to set.
     * @return This builder for chaining.
     */
    public Builder setUnwrapped(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      unwrapped_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bytes Unwrapped = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnwrapped() {

      unwrapped_ = getDefaultInstance().getUnwrapped();
      onChanged();
      return this;
    }

    /**
     * <code>bytes CheckSum = 8;</code>
     *
     * @return The checkSum.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCheckSum() {
      return checkSum_;
    }
    /**
     * <code>bytes CheckSum = 8;</code>
     *
     * @param value The checkSum to set.
     * @return This builder for chaining.
     */
    public Builder setCheckSum(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      checkSum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes CheckSum = 8;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCheckSum() {

      checkSum_ = getDefaultInstance().getCheckSum();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grep11.UnwrapKeyResponse)
  }
}
