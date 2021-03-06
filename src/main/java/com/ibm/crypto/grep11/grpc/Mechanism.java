// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

/** Protobuf type {@code grep11.Mechanism} */
public final class Mechanism extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grep11.Mechanism)
    MechanismOrBuilder {
  public static final int MECHANISM_FIELD_NUMBER = 1;
  public static final int PARAMETER_FIELD_NUMBER = 2;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:grep11.Mechanism)
  private static final com.ibm.crypto.grep11.grpc.Mechanism DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<Mechanism> PARSER =
      new com.google.protobuf.AbstractParser<Mechanism>() {
        @java.lang.Override
        public Mechanism parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Mechanism(input, extensionRegistry);
        }
      };

  static {
    DEFAULT_INSTANCE = new com.ibm.crypto.grep11.grpc.Mechanism();
  }

  private long mechanism_;
  private com.google.protobuf.ByteString parameter_;
  private byte memoizedIsInitialized = -1;
  // Use Mechanism.newBuilder() to construct.
  private Mechanism(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Mechanism() {
    parameter_ = com.google.protobuf.ByteString.EMPTY;
  }

  private Mechanism(
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
          case 8:
            {
              mechanism_ = input.readUInt64();
              break;
            }
          case 18:
            {
              parameter_ = input.readBytes();
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
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_Mechanism_descriptor;
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.ibm.crypto.grep11.grpc.Mechanism prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.ibm.crypto.grep11.grpc.Mechanism getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<Mechanism> parser() {
    return PARSER;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Mechanism();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_Mechanism_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.crypto.grep11.grpc.Mechanism.class,
            com.ibm.crypto.grep11.grpc.Mechanism.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * [(gogoproto.casttype) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Mechanism"];
   * </pre>
   *
   * <code>uint64 Mechanism = 1;</code>
   *
   * @return The mechanism.
   */
  @java.lang.Override
  public long getMechanism() {
    return mechanism_;
  }

  /**
   *
   *
   * <pre>
   * optional
   * </pre>
   *
   * <code>bytes Parameter = 2;</code>
   *
   * @return The parameter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParameter() {
    return parameter_;
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
    if (mechanism_ != 0L) {
      output.writeUInt64(1, mechanism_);
    }
    if (!parameter_.isEmpty()) {
      output.writeBytes(2, parameter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mechanism_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, mechanism_);
    }
    if (!parameter_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, parameter_);
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
    if (!(obj instanceof com.ibm.crypto.grep11.grpc.Mechanism)) {
      return super.equals(obj);
    }
    com.ibm.crypto.grep11.grpc.Mechanism other = (com.ibm.crypto.grep11.grpc.Mechanism) obj;

    if (getMechanism() != other.getMechanism()) return false;
    if (!getParameter().equals(other.getParameter())) return false;
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
    hash = (37 * hash) + MECHANISM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMechanism());
    hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
    hash = (53 * hash) + getParameter().hashCode();
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
  public com.google.protobuf.Parser<Mechanism> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.Mechanism getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /** Protobuf type {@code grep11.Mechanism} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grep11.Mechanism)
      com.ibm.crypto.grep11.grpc.MechanismOrBuilder {
    private long mechanism_;
    private com.google.protobuf.ByteString parameter_ = com.google.protobuf.ByteString.EMPTY;

    // Construct using com.ibm.crypto.grep11.grpc.Mechanism.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_Mechanism_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_Mechanism_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.crypto.grep11.grpc.Mechanism.class,
              com.ibm.crypto.grep11.grpc.Mechanism.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      mechanism_ = 0L;

      parameter_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_Mechanism_descriptor;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.Mechanism getDefaultInstanceForType() {
      return com.ibm.crypto.grep11.grpc.Mechanism.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.Mechanism build() {
      com.ibm.crypto.grep11.grpc.Mechanism result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.Mechanism buildPartial() {
      com.ibm.crypto.grep11.grpc.Mechanism result = new com.ibm.crypto.grep11.grpc.Mechanism(this);
      result.mechanism_ = mechanism_;
      result.parameter_ = parameter_;
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
      if (other instanceof com.ibm.crypto.grep11.grpc.Mechanism) {
        return mergeFrom((com.ibm.crypto.grep11.grpc.Mechanism) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.crypto.grep11.grpc.Mechanism other) {
      if (other == com.ibm.crypto.grep11.grpc.Mechanism.getDefaultInstance()) return this;
      if (other.getMechanism() != 0L) {
        setMechanism(other.getMechanism());
      }
      if (other.getParameter() != com.google.protobuf.ByteString.EMPTY) {
        setParameter(other.getParameter());
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
      com.ibm.crypto.grep11.grpc.Mechanism parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ibm.crypto.grep11.grpc.Mechanism) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * [(gogoproto.casttype) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Mechanism"];
     * </pre>
     *
     * <code>uint64 Mechanism = 1;</code>
     *
     * @return The mechanism.
     */
    @java.lang.Override
    public long getMechanism() {
      return mechanism_;
    }

    /**
     *
     *
     * <pre>
     * [(gogoproto.casttype) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Mechanism"];
     * </pre>
     *
     * <code>uint64 Mechanism = 1;</code>
     *
     * @param value The mechanism to set.
     * @return This builder for chaining.
     */
    public Builder setMechanism(long value) {

      mechanism_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [(gogoproto.casttype) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Mechanism"];
     * </pre>
     *
     * <code>uint64 Mechanism = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMechanism() {

      mechanism_ = 0L;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * optional
     * </pre>
     *
     * <code>bytes Parameter = 2;</code>
     *
     * @return The parameter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getParameter() {
      return parameter_;
    }
    /**
     *
     *
     * <pre>
     * optional
     * </pre>
     *
     * <code>bytes Parameter = 2;</code>
     *
     * @param value The parameter to set.
     * @return This builder for chaining.
     */
    public Builder setParameter(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parameter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * optional
     * </pre>
     *
     * <code>bytes Parameter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParameter() {

      parameter_ = getDefaultInstance().getParameter();
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

    // @@protoc_insertion_point(builder_scope:grep11.Mechanism)
  }
}
