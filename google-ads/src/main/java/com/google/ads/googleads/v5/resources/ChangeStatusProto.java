// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/change_status.proto

package com.google.ads.googleads.v5.resources;

public final class ChangeStatusProto {
  private ChangeStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ChangeStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ChangeStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v5/resources/chan" +
      "ge_status.proto\022!google.ads.googleads.v5" +
      ".resources\032+google/ads/googleads/v5/enum" +
      "s/ad_type.proto\032@google/ads/googleads/v5" +
      "/enums/advertising_channel_sub_type.prot" +
      "o\032<google/ads/googleads/v5/enums/adverti" +
      "sing_channel_type.proto\032;google/ads/goog" +
      "leads/v5/enums/change_status_operation.p" +
      "roto\032?google/ads/googleads/v5/enums/chan" +
      "ge_status_resource_type.proto\0322google/ad" +
      "s/googleads/v5/enums/criterion_type.prot" +
      "o\032/google/ads/googleads/v5/enums/feed_or" +
      "igin.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032\036google/p" +
      "rotobuf/wrappers.proto\032\034google/api/annot" +
      "ations.proto\"\224\013\n\014ChangeStatus\022D\n\rresourc" +
      "e_name\030\001 \001(\tB-\340A\003\372A\'\n%googleads.googleap" +
      "is.com/ChangeStatus\022@\n\025last_change_date_" +
      "time\030\003 \001(\0132\034.google.protobuf.StringValue" +
      "B\003\340A\003\022p\n\rresource_type\030\004 \001(\0162T.google.ad" +
      "s.googleads.v5.enums.ChangeStatusResourc" +
      "eTypeEnum.ChangeStatusResourceTypeB\003\340A\003\022" +
      "@\n\010campaign\030\021 \001(\tB)\340A\003\372A#\n!googleads.goo" +
      "gleapis.com/CampaignH\000\210\001\001\022?\n\010ad_group\030\022 " +
      "\001(\tB(\340A\003\372A\"\n googleads.googleapis.com/Ad" +
      "GroupH\001\210\001\001\022l\n\017resource_status\030\010 \001(\0162N.go" +
      "ogle.ads.googleads.v5.enums.ChangeStatus" +
      "OperationEnum.ChangeStatusOperationB\003\340A\003" +
      "\022]\n\013ad_group_ad\030\t \001(\0132\034.google.protobuf." +
      "StringValueB*\340A\003\372A$\n\"googleads.googleapi" +
      "s.com/AdGroupAd\022k\n\022ad_group_criterion\030\n " +
      "\001(\0132\034.google.protobuf.StringValueB1\340A\003\372A" +
      "+\n)googleads.googleapis.com/AdGroupCrite" +
      "rion\022l\n\022campaign_criterion\030\013 \001(\0132\034.googl" +
      "e.protobuf.StringValueB2\340A\003\372A,\n*googlead" +
      "s.googleapis.com/CampaignCriterion\022Q\n\004fe" +
      "ed\030\014 \001(\0132\034.google.protobuf.StringValueB%" +
      "\340A\003\372A\037\n\035googleads.googleapis.com/Feed\022Z\n" +
      "\tfeed_item\030\r \001(\0132\034.google.protobuf.Strin" +
      "gValueB)\340A\003\372A#\n!googleads.googleapis.com" +
      "/FeedItem\022a\n\rad_group_feed\030\016 \001(\0132\034.googl" +
      "e.protobuf.StringValueB,\340A\003\372A&\n$googlead" +
      "s.googleapis.com/AdGroupFeed\022b\n\rcampaign" +
      "_feed\030\017 \001(\0132\034.google.protobuf.StringValu" +
      "eB-\340A\003\372A\'\n%googleads.googleapis.com/Camp" +
      "aignFeed\022p\n\025ad_group_bid_modifier\030\020 \001(\0132" +
      "\034.google.protobuf.StringValueB3\340A\003\372A-\n+g" +
      "oogleads.googleapis.com/AdGroupBidModifi" +
      "er:]\352AZ\n%googleads.googleapis.com/Change" +
      "Status\0221customers/{customer}/changeStatu" +
      "s/{change_status}B\013\n\t_campaignB\013\n\t_ad_gr" +
      "oupB\376\001\n%com.google.ads.googleads.v5.reso" +
      "urcesB\021ChangeStatusProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v5/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V5.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V5\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.AdTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ChangeStatusOperationProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ChangeStatusResourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.FeedOriginProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_ChangeStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ChangeStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ChangeStatus_descriptor,
        new java.lang.String[] { "ResourceName", "LastChangeDateTime", "ResourceType", "Campaign", "AdGroup", "ResourceStatus", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", "Campaign", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.AdTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ChangeStatusOperationProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ChangeStatusResourceTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.FeedOriginProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
