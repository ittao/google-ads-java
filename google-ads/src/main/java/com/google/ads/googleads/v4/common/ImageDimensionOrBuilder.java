// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/asset_types.proto

package com.google.ads.googleads.v4.common;

public interface ImageDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.ImageDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value height_pixels = 1;</code>
   * @return Whether the heightPixels field is set.
   */
  boolean hasHeightPixels();
  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value height_pixels = 1;</code>
   * @return The heightPixels.
   */
  com.google.protobuf.Int64Value getHeightPixels();
  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value height_pixels = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getHeightPixelsOrBuilder();

  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value width_pixels = 2;</code>
   * @return Whether the widthPixels field is set.
   */
  boolean hasWidthPixels();
  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value width_pixels = 2;</code>
   * @return The widthPixels.
   */
  com.google.protobuf.Int64Value getWidthPixels();
  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value width_pixels = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getWidthPixelsOrBuilder();

  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 3;</code>
   * @return The url.
   */
  com.google.protobuf.StringValue getUrl();
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>.google.protobuf.StringValue url = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getUrlOrBuilder();
}
