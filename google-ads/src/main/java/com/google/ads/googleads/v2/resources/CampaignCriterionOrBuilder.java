// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_criterion.proto

package com.google.ads.googleads.v2.resources;

public interface CampaignCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.CampaignCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign criterion.
   * Campaign criterion resource names have the form:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign criterion.
   * Campaign criterion resource names have the form:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign to which the criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored during mutate.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 5;</code>
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored during mutate.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 5;</code>
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * The ID of the criterion.
   * This field is ignored during mutate.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * The modifier for the bids when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue bid_modifier = 14;</code>
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bids when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue bid_modifier = 14;</code>
   */
  com.google.protobuf.FloatValue getBidModifier();
  /**
   * <pre>
   * The modifier for the bids when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * Use 0 to opt out of a Device type.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue bid_modifier = 14;</code>
   */
  com.google.protobuf.FloatValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Whether to target (`false`) or exclude (`true`) the criterion.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue negative = 7;</code>
   */
  boolean hasNegative();
  /**
   * <pre>
   * Whether to target (`false`) or exclude (`true`) the criterion.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue negative = 7;</code>
   */
  com.google.protobuf.BoolValue getNegative();
  /**
   * <pre>
   * Whether to target (`false`) or exclude (`true`) the criterion.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue negative = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getNegativeOrBuilder();

  /**
   * <pre>
   * The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType type = 6;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType type = 6;</code>
   */
  com.google.ads.googleads.v2.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * The status of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus status = 35;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus status = 35;</code>
   */
  com.google.ads.googleads.v2.enums.CampaignCriterionStatusEnum.CampaignCriterionStatus getStatus();

  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 8;</code>
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 8;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.KeywordInfo keyword = 8;</code>
   */
  com.google.ads.googleads.v2.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 9;</code>
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 9;</code>
   */
  com.google.ads.googleads.v2.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.PlacementInfo placement = 9;</code>
   */
  com.google.ads.googleads.v2.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 10;</code>
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 10;</code>
   */
  com.google.ads.googleads.v2.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Mobile app category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileAppCategoryInfo mobile_app_category = 10;</code>
   */
  com.google.ads.googleads.v2.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 11;</code>
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 11;</code>
   */
  com.google.ads.googleads.v2.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileApplicationInfo mobile_application = 11;</code>
   */
  com.google.ads.googleads.v2.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  /**
   * <pre>
   * Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationInfo location = 12;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationInfo location = 12;</code>
   */
  com.google.ads.googleads.v2.common.LocationInfo getLocation();
  /**
   * <pre>
   * Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationInfo location = 12;</code>
   */
  com.google.ads.googleads.v2.common.LocationInfoOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DeviceInfo device = 13;</code>
   */
  boolean hasDevice();
  /**
   * <pre>
   * Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DeviceInfo device = 13;</code>
   */
  com.google.ads.googleads.v2.common.DeviceInfo getDevice();
  /**
   * <pre>
   * Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.DeviceInfo device = 13;</code>
   */
  com.google.ads.googleads.v2.common.DeviceInfoOrBuilder getDeviceOrBuilder();

  /**
   * <pre>
   * Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 15;</code>
   */
  boolean hasAdSchedule();
  /**
   * <pre>
   * Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 15;</code>
   */
  com.google.ads.googleads.v2.common.AdScheduleInfo getAdSchedule();
  /**
   * <pre>
   * Ad Schedule.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AdScheduleInfo ad_schedule = 15;</code>
   */
  com.google.ads.googleads.v2.common.AdScheduleInfoOrBuilder getAdScheduleOrBuilder();

  /**
   * <pre>
   * Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AgeRangeInfo age_range = 16;</code>
   */
  boolean hasAgeRange();
  /**
   * <pre>
   * Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AgeRangeInfo age_range = 16;</code>
   */
  com.google.ads.googleads.v2.common.AgeRangeInfo getAgeRange();
  /**
   * <pre>
   * Age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.AgeRangeInfo age_range = 16;</code>
   */
  com.google.ads.googleads.v2.common.AgeRangeInfoOrBuilder getAgeRangeOrBuilder();

  /**
   * <pre>
   * Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.GenderInfo gender = 17;</code>
   */
  boolean hasGender();
  /**
   * <pre>
   * Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.GenderInfo gender = 17;</code>
   */
  com.google.ads.googleads.v2.common.GenderInfo getGender();
  /**
   * <pre>
   * Gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.GenderInfo gender = 17;</code>
   */
  com.google.ads.googleads.v2.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IncomeRangeInfo income_range = 18;</code>
   */
  boolean hasIncomeRange();
  /**
   * <pre>
   * Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IncomeRangeInfo income_range = 18;</code>
   */
  com.google.ads.googleads.v2.common.IncomeRangeInfo getIncomeRange();
  /**
   * <pre>
   * Income range.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IncomeRangeInfo income_range = 18;</code>
   */
  com.google.ads.googleads.v2.common.IncomeRangeInfoOrBuilder getIncomeRangeOrBuilder();

  /**
   * <pre>
   * Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ParentalStatusInfo parental_status = 19;</code>
   */
  boolean hasParentalStatus();
  /**
   * <pre>
   * Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ParentalStatusInfo parental_status = 19;</code>
   */
  com.google.ads.googleads.v2.common.ParentalStatusInfo getParentalStatus();
  /**
   * <pre>
   * Parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ParentalStatusInfo parental_status = 19;</code>
   */
  com.google.ads.googleads.v2.common.ParentalStatusInfoOrBuilder getParentalStatusOrBuilder();

  /**
   * <pre>
   * User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserListInfo user_list = 22;</code>
   */
  boolean hasUserList();
  /**
   * <pre>
   * User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserListInfo user_list = 22;</code>
   */
  com.google.ads.googleads.v2.common.UserListInfo getUserList();
  /**
   * <pre>
   * User List.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserListInfo user_list = 22;</code>
   */
  com.google.ads.googleads.v2.common.UserListInfoOrBuilder getUserListOrBuilder();

  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 20;</code>
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 20;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeVideoInfo youtube_video = 20;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 21;</code>
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 21;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.YouTubeChannelInfo youtube_channel = 21;</code>
   */
  com.google.ads.googleads.v2.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ProximityInfo proximity = 23;</code>
   */
  boolean hasProximity();
  /**
   * <pre>
   * Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ProximityInfo proximity = 23;</code>
   */
  com.google.ads.googleads.v2.common.ProximityInfo getProximity();
  /**
   * <pre>
   * Proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ProximityInfo proximity = 23;</code>
   */
  com.google.ads.googleads.v2.common.ProximityInfoOrBuilder getProximityOrBuilder();

  /**
   * <pre>
   * Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.TopicInfo topic = 24;</code>
   */
  boolean hasTopic();
  /**
   * <pre>
   * Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.TopicInfo topic = 24;</code>
   */
  com.google.ads.googleads.v2.common.TopicInfo getTopic();
  /**
   * <pre>
   * Topic.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.TopicInfo topic = 24;</code>
   */
  com.google.ads.googleads.v2.common.TopicInfoOrBuilder getTopicOrBuilder();

  /**
   * <pre>
   * Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingScopeInfo listing_scope = 25;</code>
   */
  boolean hasListingScope();
  /**
   * <pre>
   * Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingScopeInfo listing_scope = 25;</code>
   */
  com.google.ads.googleads.v2.common.ListingScopeInfo getListingScope();
  /**
   * <pre>
   * Listing scope.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingScopeInfo listing_scope = 25;</code>
   */
  com.google.ads.googleads.v2.common.ListingScopeInfoOrBuilder getListingScopeOrBuilder();

  /**
   * <pre>
   * Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LanguageInfo language = 26;</code>
   */
  boolean hasLanguage();
  /**
   * <pre>
   * Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LanguageInfo language = 26;</code>
   */
  com.google.ads.googleads.v2.common.LanguageInfo getLanguage();
  /**
   * <pre>
   * Language.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LanguageInfo language = 26;</code>
   */
  com.google.ads.googleads.v2.common.LanguageInfoOrBuilder getLanguageOrBuilder();

  /**
   * <pre>
   * IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IpBlockInfo ip_block = 27;</code>
   */
  boolean hasIpBlock();
  /**
   * <pre>
   * IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IpBlockInfo ip_block = 27;</code>
   */
  com.google.ads.googleads.v2.common.IpBlockInfo getIpBlock();
  /**
   * <pre>
   * IpBlock.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.IpBlockInfo ip_block = 27;</code>
   */
  com.google.ads.googleads.v2.common.IpBlockInfoOrBuilder getIpBlockOrBuilder();

  /**
   * <pre>
   * ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ContentLabelInfo content_label = 28;</code>
   */
  boolean hasContentLabel();
  /**
   * <pre>
   * ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ContentLabelInfo content_label = 28;</code>
   */
  com.google.ads.googleads.v2.common.ContentLabelInfo getContentLabel();
  /**
   * <pre>
   * ContentLabel.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ContentLabelInfo content_label = 28;</code>
   */
  com.google.ads.googleads.v2.common.ContentLabelInfoOrBuilder getContentLabelOrBuilder();

  /**
   * <pre>
   * Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CarrierInfo carrier = 29;</code>
   */
  boolean hasCarrier();
  /**
   * <pre>
   * Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CarrierInfo carrier = 29;</code>
   */
  com.google.ads.googleads.v2.common.CarrierInfo getCarrier();
  /**
   * <pre>
   * Carrier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CarrierInfo carrier = 29;</code>
   */
  com.google.ads.googleads.v2.common.CarrierInfoOrBuilder getCarrierOrBuilder();

  /**
   * <pre>
   * User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserInterestInfo user_interest = 30;</code>
   */
  boolean hasUserInterest();
  /**
   * <pre>
   * User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserInterestInfo user_interest = 30;</code>
   */
  com.google.ads.googleads.v2.common.UserInterestInfo getUserInterest();
  /**
   * <pre>
   * User Interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.UserInterestInfo user_interest = 30;</code>
   */
  com.google.ads.googleads.v2.common.UserInterestInfoOrBuilder getUserInterestOrBuilder();

  /**
   * <pre>
   * Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.WebpageInfo webpage = 31;</code>
   */
  boolean hasWebpage();
  /**
   * <pre>
   * Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.WebpageInfo webpage = 31;</code>
   */
  com.google.ads.googleads.v2.common.WebpageInfo getWebpage();
  /**
   * <pre>
   * Webpage.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.WebpageInfo webpage = 31;</code>
   */
  com.google.ads.googleads.v2.common.WebpageInfoOrBuilder getWebpageOrBuilder();

  /**
   * <pre>
   * Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.OperatingSystemVersionInfo operating_system_version = 32;</code>
   */
  boolean hasOperatingSystemVersion();
  /**
   * <pre>
   * Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.OperatingSystemVersionInfo operating_system_version = 32;</code>
   */
  com.google.ads.googleads.v2.common.OperatingSystemVersionInfo getOperatingSystemVersion();
  /**
   * <pre>
   * Operating system version.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.OperatingSystemVersionInfo operating_system_version = 32;</code>
   */
  com.google.ads.googleads.v2.common.OperatingSystemVersionInfoOrBuilder getOperatingSystemVersionOrBuilder();

  /**
   * <pre>
   * Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileDeviceInfo mobile_device = 33;</code>
   */
  boolean hasMobileDevice();
  /**
   * <pre>
   * Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileDeviceInfo mobile_device = 33;</code>
   */
  com.google.ads.googleads.v2.common.MobileDeviceInfo getMobileDevice();
  /**
   * <pre>
   * Mobile Device.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.MobileDeviceInfo mobile_device = 33;</code>
   */
  com.google.ads.googleads.v2.common.MobileDeviceInfoOrBuilder getMobileDeviceOrBuilder();

  /**
   * <pre>
   * Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationGroupInfo location_group = 34;</code>
   */
  boolean hasLocationGroup();
  /**
   * <pre>
   * Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationGroupInfo location_group = 34;</code>
   */
  com.google.ads.googleads.v2.common.LocationGroupInfo getLocationGroup();
  /**
   * <pre>
   * Location Group
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.LocationGroupInfo location_group = 34;</code>
   */
  com.google.ads.googleads.v2.common.LocationGroupInfoOrBuilder getLocationGroupOrBuilder();

  /**
   * <pre>
   * Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CustomAffinityInfo custom_affinity = 36;</code>
   */
  boolean hasCustomAffinity();
  /**
   * <pre>
   * Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CustomAffinityInfo custom_affinity = 36;</code>
   */
  com.google.ads.googleads.v2.common.CustomAffinityInfo getCustomAffinity();
  /**
   * <pre>
   * Custom Affinity.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.CustomAffinityInfo custom_affinity = 36;</code>
   */
  com.google.ads.googleads.v2.common.CustomAffinityInfoOrBuilder getCustomAffinityOrBuilder();

  public com.google.ads.googleads.v2.resources.CampaignCriterion.CriterionCase getCriterionCase();
}
