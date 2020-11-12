// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/location_view.proto

package com.google.ads.googleads.v6.resources;

public interface LocationViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.resources.LocationView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the location view.
   * Location view resource names have the form:
   * `customers/{customer_id}/locationViews/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the location view.
   * Location view resource names have the form:
   * `customers/{customer_id}/locationViews/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();
}