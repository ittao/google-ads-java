// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_criterion.proto

package com.google.ads.googleads.v1.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v1/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v1.resources\032-google/ads/googleads/v1" +
      "/common/criteria.proto\0322google/ads/googl" +
      "eads/v1/enums/criterion_type.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\304\020\n\021CampaignCriterion\022\025" +
      "\n\rresource_name\030\001 \001(\t\022.\n\010campaign\030\004 \001(\0132" +
      "\034.google.protobuf.StringValue\0221\n\014criteri" +
      "on_id\030\005 \001(\0132\033.google.protobuf.Int64Value" +
      "\0221\n\014bid_modifier\030\016 \001(\0132\033.google.protobuf" +
      ".FloatValue\022,\n\010negative\030\007 \001(\0132\032.google.p" +
      "rotobuf.BoolValue\022L\n\004type\030\006 \001(\0162>.google" +
      ".ads.googleads.v1.enums.CriterionTypeEnu" +
      "m.CriterionType\022>\n\007keyword\030\010 \001(\0132+.googl" +
      "e.ads.googleads.v1.common.KeywordInfoH\000\022" +
      "B\n\tplacement\030\t \001(\0132-.google.ads.googlead" +
      "s.v1.common.PlacementInfoH\000\022T\n\023mobile_ap" +
      "p_category\030\n \001(\01325.google.ads.googleads." +
      "v1.common.MobileAppCategoryInfoH\000\022S\n\022mob" +
      "ile_application\030\013 \001(\01325.google.ads.googl" +
      "eads.v1.common.MobileApplicationInfoH\000\022@" +
      "\n\010location\030\014 \001(\0132,.google.ads.googleads." +
      "v1.common.LocationInfoH\000\022<\n\006device\030\r \001(\013" +
      "2*.google.ads.googleads.v1.common.Device" +
      "InfoH\000\022E\n\013ad_schedule\030\017 \001(\0132..google.ads" +
      ".googleads.v1.common.AdScheduleInfoH\000\022A\n" +
      "\tage_range\030\020 \001(\0132,.google.ads.googleads." +
      "v1.common.AgeRangeInfoH\000\022<\n\006gender\030\021 \001(\013" +
      "2*.google.ads.googleads.v1.common.Gender" +
      "InfoH\000\022G\n\014income_range\030\022 \001(\0132/.google.ad" +
      "s.googleads.v1.common.IncomeRangeInfoH\000\022" +
      "M\n\017parental_status\030\023 \001(\01322.google.ads.go" +
      "ogleads.v1.common.ParentalStatusInfoH\000\022A" +
      "\n\tuser_list\030\026 \001(\0132,.google.ads.googleads" +
      ".v1.common.UserListInfoH\000\022I\n\ryoutube_vid" +
      "eo\030\024 \001(\01320.google.ads.googleads.v1.commo" +
      "n.YouTubeVideoInfoH\000\022M\n\017youtube_channel\030" +
      "\025 \001(\01322.google.ads.googleads.v1.common.Y" +
      "ouTubeChannelInfoH\000\022B\n\tproximity\030\027 \001(\0132-" +
      ".google.ads.googleads.v1.common.Proximit" +
      "yInfoH\000\022:\n\005topic\030\030 \001(\0132).google.ads.goog" +
      "leads.v1.common.TopicInfoH\000\022I\n\rlisting_s" +
      "cope\030\031 \001(\01320.google.ads.googleads.v1.com" +
      "mon.ListingScopeInfoH\000\022@\n\010language\030\032 \001(\013" +
      "2,.google.ads.googleads.v1.common.Langua" +
      "geInfoH\000\022?\n\010ip_block\030\033 \001(\0132+.google.ads." +
      "googleads.v1.common.IpBlockInfoH\000\022I\n\rcon" +
      "tent_label\030\034 \001(\01320.google.ads.googleads." +
      "v1.common.ContentLabelInfoH\000\022>\n\007carrier\030" +
      "\035 \001(\0132+.google.ads.googleads.v1.common.C" +
      "arrierInfoH\000\022I\n\ruser_interest\030\036 \001(\01320.go" +
      "ogle.ads.googleads.v1.common.UserInteres" +
      "tInfoH\000\022>\n\007webpage\030\037 \001(\0132+.google.ads.go" +
      "ogleads.v1.common.WebpageInfoH\000\022^\n\030opera" +
      "ting_system_version\030  \001(\0132:.google.ads.g" +
      "oogleads.v1.common.OperatingSystemVersio" +
      "nInfoH\000\022I\n\rmobile_device\030! \001(\01320.google." +
      "ads.googleads.v1.common.MobileDeviceInfo" +
      "H\000B\013\n\tcriterionB\203\002\n%com.google.ads.googl" +
      "eads.v1.resourcesB\026CampaignCriterionProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v1/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V1\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V1::Resourcesb\006p" +
      "roto3"
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
          com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "Criterion", });
    com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
