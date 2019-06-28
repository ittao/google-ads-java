// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan_keyword.proto

package com.google.ads.googleads.v2.resources;

public final class KeywordPlanKeywordProto {
  private KeywordPlanKeywordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v2/resources/keyw" +
      "ord_plan_keyword.proto\022!google.ads.googl" +
      "eads.v2.resources\0326google/ads/googleads/" +
      "v2/enums/keyword_match_type.proto\032\036googl" +
      "e/protobuf/wrappers.proto\032\034google/api/an" +
      "notations.proto\"\314\002\n\022KeywordPlanKeyword\022\025" +
      "\n\rresource_name\030\001 \001(\t\022;\n\025keyword_plan_ad" +
      "_group\030\002 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022\'\n\002id\030\003 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022*\n\004text\030\004 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022X\n\nmatch_type\030\005 \001(\0162D.google.ads" +
      ".googleads.v2.enums.KeywordMatchTypeEnum" +
      ".KeywordMatchType\0223\n\016cpc_bid_micros\030\006 \001(" +
      "\0132\033.google.protobuf.Int64ValueB\204\002\n%com.g" +
      "oogle.ads.googleads.v2.resourcesB\027Keywor" +
      "dPlanKeywordProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v2/reso" +
      "urces;resources\242\002\003GAA\252\002!Google.Ads.Googl" +
      "eAds.V2.Resources\312\002!Google\\Ads\\GoogleAds" +
      "\\V2\\Resources\352\002%Google::Ads::GoogleAds::" +
      "V2::Resourcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanAdGroup", "Id", "Text", "MatchType", "CpcBidMicros", });
    com.google.ads.googleads.v2.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}