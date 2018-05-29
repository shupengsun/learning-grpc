// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.rain.learning.grpc.routeguide;

/**
 * <pre>
 * A RouteSummary is received in response to a RecordRoute rpc.
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 * </pre>
 *
 * Protobuf type {@code routeguide.RouteSummary}
 */
public  final class RouteSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.RouteSummary)
    RouteSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteSummary.newBuilder() to construct.
  private RouteSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteSummary() {
    pointCount_ = 0;
    featureCount_ = 0;
    distance_ = 0;
    elapsedTime_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteSummary(
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
          case 8: {

            pointCount_ = input.readInt32();
            break;
          }
          case 16: {

            featureCount_ = input.readInt32();
            break;
          }
          case 24: {

            distance_ = input.readInt32();
            break;
          }
          case 32: {

            elapsedTime_ = input.readInt32();
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
    return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_RouteSummary_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_RouteSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rain.learning.grpc.routeguide.RouteSummary.class, com.rain.learning.grpc.routeguide.RouteSummary.Builder.class);
  }

  public static final int POINT_COUNT_FIELD_NUMBER = 1;
  private int pointCount_;
  /**
   * <pre>
   * The number of points received.
   * </pre>
   *
   * <code>int32 point_count = 1;</code>
   */
  public int getPointCount() {
    return pointCount_;
  }

  public static final int FEATURE_COUNT_FIELD_NUMBER = 2;
  private int featureCount_;
  /**
   * <pre>
   * The number of known features passed while traversing the route.
   * </pre>
   *
   * <code>int32 feature_count = 2;</code>
   */
  public int getFeatureCount() {
    return featureCount_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private int distance_;
  /**
   * <pre>
   * The distance covered in metres.
   * </pre>
   *
   * <code>int32 distance = 3;</code>
   */
  public int getDistance() {
    return distance_;
  }

  public static final int ELAPSED_TIME_FIELD_NUMBER = 4;
  private int elapsedTime_;
  /**
   * <pre>
   * The duration of the traversal in seconds.
   * </pre>
   *
   * <code>int32 elapsed_time = 4;</code>
   */
  public int getElapsedTime() {
    return elapsedTime_;
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
    if (pointCount_ != 0) {
      output.writeInt32(1, pointCount_);
    }
    if (featureCount_ != 0) {
      output.writeInt32(2, featureCount_);
    }
    if (distance_ != 0) {
      output.writeInt32(3, distance_);
    }
    if (elapsedTime_ != 0) {
      output.writeInt32(4, elapsedTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pointCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pointCount_);
    }
    if (featureCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, featureCount_);
    }
    if (distance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, distance_);
    }
    if (elapsedTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, elapsedTime_);
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
    if (!(obj instanceof com.rain.learning.grpc.routeguide.RouteSummary)) {
      return super.equals(obj);
    }
    com.rain.learning.grpc.routeguide.RouteSummary other = (com.rain.learning.grpc.routeguide.RouteSummary) obj;

    boolean result = true;
    result = result && (getPointCount()
        == other.getPointCount());
    result = result && (getFeatureCount()
        == other.getFeatureCount());
    result = result && (getDistance()
        == other.getDistance());
    result = result && (getElapsedTime()
        == other.getElapsedTime());
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
    hash = (37 * hash) + POINT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPointCount();
    hash = (37 * hash) + FEATURE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureCount();
    hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getDistance();
    hash = (37 * hash) + ELAPSED_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getElapsedTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rain.learning.grpc.routeguide.RouteSummary parseFrom(
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
  public static Builder newBuilder(com.rain.learning.grpc.routeguide.RouteSummary prototype) {
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
   * A RouteSummary is received in response to a RecordRoute rpc.
   * It contains the number of individual points received, the number of
   * detected features, and the total distance covered as the cumulative sum of
   * the distance between each point.
   * </pre>
   *
   * Protobuf type {@code routeguide.RouteSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.RouteSummary)
      com.rain.learning.grpc.routeguide.RouteSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_RouteSummary_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_RouteSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rain.learning.grpc.routeguide.RouteSummary.class, com.rain.learning.grpc.routeguide.RouteSummary.Builder.class);
    }

    // Construct using com.rain.learning.grpc.routeguide.RouteSummary.newBuilder()
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
      pointCount_ = 0;

      featureCount_ = 0;

      distance_ = 0;

      elapsedTime_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rain.learning.grpc.routeguide.RouteGuideProto.internal_static_routeguide_RouteSummary_descriptor;
    }

    public com.rain.learning.grpc.routeguide.RouteSummary getDefaultInstanceForType() {
      return com.rain.learning.grpc.routeguide.RouteSummary.getDefaultInstance();
    }

    public com.rain.learning.grpc.routeguide.RouteSummary build() {
      com.rain.learning.grpc.routeguide.RouteSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.rain.learning.grpc.routeguide.RouteSummary buildPartial() {
      com.rain.learning.grpc.routeguide.RouteSummary result = new com.rain.learning.grpc.routeguide.RouteSummary(this);
      result.pointCount_ = pointCount_;
      result.featureCount_ = featureCount_;
      result.distance_ = distance_;
      result.elapsedTime_ = elapsedTime_;
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
      if (other instanceof com.rain.learning.grpc.routeguide.RouteSummary) {
        return mergeFrom((com.rain.learning.grpc.routeguide.RouteSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rain.learning.grpc.routeguide.RouteSummary other) {
      if (other == com.rain.learning.grpc.routeguide.RouteSummary.getDefaultInstance()) return this;
      if (other.getPointCount() != 0) {
        setPointCount(other.getPointCount());
      }
      if (other.getFeatureCount() != 0) {
        setFeatureCount(other.getFeatureCount());
      }
      if (other.getDistance() != 0) {
        setDistance(other.getDistance());
      }
      if (other.getElapsedTime() != 0) {
        setElapsedTime(other.getElapsedTime());
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
      com.rain.learning.grpc.routeguide.RouteSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rain.learning.grpc.routeguide.RouteSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pointCount_ ;
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     */
    public int getPointCount() {
      return pointCount_;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     */
    public Builder setPointCount(int value) {
      
      pointCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     */
    public Builder clearPointCount() {
      
      pointCount_ = 0;
      onChanged();
      return this;
    }

    private int featureCount_ ;
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     */
    public int getFeatureCount() {
      return featureCount_;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     */
    public Builder setFeatureCount(int value) {
      
      featureCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     */
    public Builder clearFeatureCount() {
      
      featureCount_ = 0;
      onChanged();
      return this;
    }

    private int distance_ ;
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     */
    public int getDistance() {
      return distance_;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     */
    public Builder setDistance(int value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     */
    public Builder clearDistance() {
      
      distance_ = 0;
      onChanged();
      return this;
    }

    private int elapsedTime_ ;
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4;</code>
     */
    public int getElapsedTime() {
      return elapsedTime_;
    }
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4;</code>
     */
    public Builder setElapsedTime(int value) {
      
      elapsedTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4;</code>
     */
    public Builder clearElapsedTime() {
      
      elapsedTime_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:routeguide.RouteSummary)
  }

  // @@protoc_insertion_point(class_scope:routeguide.RouteSummary)
  private static final com.rain.learning.grpc.routeguide.RouteSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rain.learning.grpc.routeguide.RouteSummary();
  }

  public static com.rain.learning.grpc.routeguide.RouteSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteSummary>
      PARSER = new com.google.protobuf.AbstractParser<RouteSummary>() {
    public RouteSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteSummary> getParserForType() {
    return PARSER;
  }

  public com.rain.learning.grpc.routeguide.RouteSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

