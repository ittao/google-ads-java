// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/authorization_error.proto

package com.google.ads.googleads.v2.errors;

public final class AuthorizationErrorProto {
  private AuthorizationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_errors_AuthorizationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_errors_AuthorizationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v2/errors/authori" +
      "zation_error.proto\022\036google.ads.googleads" +
      ".v2.errors\032\034google/api/annotations.proto" +
      "\"\232\003\n\026AuthorizationErrorEnum\"\377\002\n\022Authoriz" +
      "ationError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001" +
      "\022\032\n\026USER_PERMISSION_DENIED\020\002\022#\n\037DEVELOPE" +
      "R_TOKEN_NOT_WHITELISTED\020\003\022\036\n\032DEVELOPER_T" +
      "OKEN_PROHIBITED\020\004\022\024\n\020PROJECT_DISABLED\020\005\022" +
      "\027\n\023AUTHORIZATION_ERROR\020\006\022\030\n\024ACTION_NOT_P" +
      "ERMITTED\020\007\022\025\n\021INCOMPLETE_SIGNUP\020\010\022\030\n\024CUS" +
      "TOMER_NOT_ENABLED\020\030\022\017\n\013MISSING_TOS\020\t\022 \n\034" +
      "DEVELOPER_TOKEN_NOT_APPROVED\020\n\022=\n9INVALI" +
      "D_LOGIN_CUSTOMER_ID_SERVING_CUSTOMER_ID_" +
      "COMBINATION\020\013B\362\001\n\"com.google.ads.googlea" +
      "ds.v2.errorsB\027AuthorizationErrorProtoP\001Z" +
      "Dgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v2/errors;errors\242\002\003GAA\252\002\036Go" +
      "ogle.Ads.GoogleAds.V2.Errors\312\002\036Google\\Ad" +
      "s\\GoogleAds\\V2\\Errors\352\002\"Google::Ads::Goo" +
      "gleAds::V2::Errorsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_errors_AuthorizationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_errors_AuthorizationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_errors_AuthorizationErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
