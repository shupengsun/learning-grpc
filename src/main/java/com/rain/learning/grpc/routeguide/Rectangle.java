// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.rain.learning.grpc.routeguide;

/**
 * <pre>
 * A latitude-longitude rectangle, represented as two diagonally opposite
 * points "lo" and "hi".
 * </pre>
 *
 * Protobuf type {@code routeguide.Rectangle}
 */
public  final class Rectangle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.Rectangle)
    RectangleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rectangle.newBuilder() to construct.
  private Rectangle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rectangle() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Rectangle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.rain.learning.grpc.routeguide.Point.Builder subBuilder = null;
            if (lo_ != null) {
              subBuilder = lo_.toBuilder();
            }
            lo_ = input.readMessage(com.rain.learning.grpc.routeguide.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lo_);
              lo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.rain.learning.grpc.routeguide.Point.Builder subBuilder = null;
            if (hi_ != null) {
              subBuilder = hi_.toBuilder();
            }
            hi_ = input.readMessage(com.rain.learning.grpc.routeguide.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hi_);
              hi_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rain.learning.grpc.routeguide.Rectangle.class, com.rain.learning.grpc.routeguide.Rectangle.Builder.class);
  }

  public static final int LO_FIELD_NUMBER = 1;
  private com.rain.learning.grpc.routeguide.Point lo_;
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  public boolean hasLo() {
    return lo_ != null;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  public com.rain.learning.grpc.routeguide.Point getLo() {
    return lo_ == null ? com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : lo_;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  public com.rain.learning.grpc.routeguide.PointOrBuilder getLoOrBuilder() {
    return getLo();
  }

  public static final int HI_FIELD_NUMBER = 2;
  private com.rain.learning.grpc.routeguide.Point hi_;
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  public boolean hasHi() {
    return hi_ != null;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  public com.rain.learning.grpc.routeguide.Point getHi() {
    return hi_ == null ? com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : hi_;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  public com.rain.learning.grpc.routeguide.PointOrBuilder getHiOrBuilder() {
    return getHi();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (lo_ != null) {
      output.writeMessage(1, getLo());
    }
    if (hi_ != null) {
      output.writeMessage(2, getHi());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLo());
    }
    if (hi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHi());
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
    if (!(obj instanceof com.rain.learning.grpc.routeguide.Rectangle)) {
      return super.equals(obj);
    }
    com.rain.learning.grpc.routeguide.Rectangle other = (com.rain.learning.grpc.routeguide.Rectangle) obj;

    boolean result = true;
    result = result && (hasLo() == other.hasLo());
    if (hasLo()) {
      result = result && getLo()
          .equals(other.getLo());
    }
    result = result && (hasHi() == other.hasHi());
    if (hasHi()) {
      result = result && getHi()
          .equals(other.getHi());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLo()) {
      hash = (37 * hash) + LO_FIELD_NUMBER;
      hash = (53 * hash) + getLo().hashCode();
    }
    if (hasHi()) {
      hash = (37 * hash) + HI_FIELD_NUMBER;
      hash = (53 * hash) + getHi().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rain.learning.grpc.routeguide.Rectangle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A latitude-longitude rectangle, represented as two diagonally opposite
   * points "lo" and "hi".
   * </pre>
   *
   * Protobuf type {@code routeguide.Rectangle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Rectangle)
      com.rain.learning.grpc.routeguide.RectangleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rain.learning.grpc.routeguide.Rectangle.class, com.rain.learning.grpc.routeguide.Rectangle.Builder.class);
    }

    // Construct using com.rain.learning.grpc.routeguide.Rectangle.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (loBuilder_ == null) {
        lo_ = null;
      } else {
        lo_ = null;
        loBuilder_ = null;
      }
      if (hiBuilder_ == null) {
        hi_ = null;
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    public com.rain.learning.grpc.routeguide.Rectangle getDefaultInstanceForType() {
      return com.rain.learning.grpc.routeguide.Rectangle.getDefaultInstance();
    }

    public com.rain.learning.grpc.routeguide.Rectangle build() {
      com.rain.learning.grpc.routeguide.Rectangle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.rain.learning.grpc.routeguide.Rectangle buildPartial() {
      com.rain.learning.grpc.routeguide.Rectangle result = new com.rain.learning.grpc.routeguide.Rectangle(this);
      if (loBuilder_ == null) {
        result.lo_ = lo_;
      } else {
        result.lo_ = loBuilder_.build();
      }
      if (hiBuilder_ == null) {
        result.hi_ = hi_;
      } else {
        result.hi_ = hiBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rain.learning.grpc.routeguide.Rectangle) {
        return mergeFrom((com.rain.learning.grpc.routeguide.Rectangle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rain.learning.grpc.routeguide.Rectangle other) {
      if (other == com.rain.learning.grpc.routeguide.Rectangle.getDefaultInstance()) return this;
      if (other.hasLo()) {
        mergeLo(other.getLo());
      }
      if (other.hasHi()) {
        mergeHi(other.getHi());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.rain.learning.grpc.routeguide.Rectangle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rain.learning.grpc.routeguide.Rectangle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.rain.learning.grpc.routeguide.Point lo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder> loBuilder_;
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public boolean hasLo() {
      return loBuilder_ != null || lo_ != null;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.rain.learning.grpc.routeguide.Point getLo() {
      if (loBuilder_ == null) {
        return lo_ == null ? com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : lo_;
      } else {
        return loBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(com.rain.learning.grpc.routeguide.Point value) {
      if (loBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lo_ = value;
        onChanged();
      } else {
        loBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(
        com.rain.learning.grpc.routeguide.Point.Builder builderForValue) {
      if (loBuilder_ == null) {
        lo_ = builderForValue.build();
        onChanged();
      } else {
        loBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder mergeLo(com.rain.learning.grpc.routeguide.Point value) {
      if (loBuilder_ == null) {
        if (lo_ != null) {
          lo_ =
            com.rain.learning.grpc.routeguide.Point.newBuilder(lo_).mergeFrom(value).buildPartial();
        } else {
          lo_ = value;
        }
        onChanged();
      } else {
        loBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder clearLo() {
      if (loBuilder_ == null) {
        lo_ = null;
        onChanged();
      } else {
        lo_ = null;
        loBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.rain.learning.grpc.routeguide.Point.Builder getLoBuilder() {
      
      onChanged();
      return getLoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.rain.learning.grpc.routeguide.PointOrBuilder getLoOrBuilder() {
      if (loBuilder_ != null) {
        return loBuilder_.getMessageOrBuilder();
      } else {
        return lo_ == null ?
            com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : lo_;
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder> 
        getLoFieldBuilder() {
      if (loBuilder_ == null) {
        loBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder>(
                getLo(),
                getParentForChildren(),
                isClean());
        lo_ = null;
      }
      return loBuilder_;
    }

    private com.rain.learning.grpc.routeguide.Point hi_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder> hiBuilder_;
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public boolean hasHi() {
      return hiBuilder_ != null || hi_ != null;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.rain.learning.grpc.routeguide.Point getHi() {
      if (hiBuilder_ == null) {
        return hi_ == null ? com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : hi_;
      } else {
        return hiBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(com.rain.learning.grpc.routeguide.Point value) {
      if (hiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hi_ = value;
        onChanged();
      } else {
        hiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(
        com.rain.learning.grpc.routeguide.Point.Builder builderForValue) {
      if (hiBuilder_ == null) {
        hi_ = builderForValue.build();
        onChanged();
      } else {
        hiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder mergeHi(com.rain.learning.grpc.routeguide.Point value) {
      if (hiBuilder_ == null) {
        if (hi_ != null) {
          hi_ =
            com.rain.learning.grpc.routeguide.Point.newBuilder(hi_).mergeFrom(value).buildPartial();
        } else {
          hi_ = value;
        }
        onChanged();
      } else {
        hiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder clearHi() {
      if (hiBuilder_ == null) {
        hi_ = null;
        onChanged();
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.rain.learning.grpc.routeguide.Point.Builder getHiBuilder() {
      
      onChanged();
      return getHiFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.rain.learning.grpc.routeguide.PointOrBuilder getHiOrBuilder() {
      if (hiBuilder_ != null) {
        return hiBuilder_.getMessageOrBuilder();
      } else {
        return hi_ == null ?
            com.rain.learning.grpc.routeguide.Point.getDefaultInstance() : hi_;
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder> 
        getHiFieldBuilder() {
      if (hiBuilder_ == null) {
        hiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rain.learning.grpc.routeguide.Point, com.rain.learning.grpc.routeguide.Point.Builder, com.rain.learning.grpc.routeguide.PointOrBuilder>(
                getHi(),
                getParentForChildren(),
                isClean());
        hi_ = null;
      }
      return hiBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:routeguide.Rectangle)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Rectangle)
  private static final com.rain.learning.grpc.routeguide.Rectangle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rain.learning.grpc.routeguide.Rectangle();
  }

  public static com.rain.learning.grpc.routeguide.Rectangle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rectangle>
      PARSER = new com.google.protobuf.AbstractParser<Rectangle>() {
    public Rectangle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Rectangle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Rectangle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rectangle> getParserForType() {
    return PARSER;
  }

  public com.rain.learning.grpc.routeguide.Rectangle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
