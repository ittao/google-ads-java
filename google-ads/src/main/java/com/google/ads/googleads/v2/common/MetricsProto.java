// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/metrics.proto

package com.google.ads.googleads.v2.common;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v2/common/metrics" +
      ".proto\022\036google.ads.googleads.v2.common\032:" +
      "google/ads/googleads/v2/enums/interactio" +
      "n_event_type.proto\0328google/ads/googleads" +
      "/v2/enums/quality_score_bucket.proto\032\036go" +
      "ogle/protobuf/wrappers.proto\032\034google/api" +
      "/annotations.proto\"\3759\n\007Metrics\022H\n\"absolu" +
      "te_top_impression_percentage\030_ \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\0225\n\017active_view_" +
      "cpm\030\001 \001(\0132\034.google.protobuf.DoubleValue\022" +
      "5\n\017active_view_ctr\030O \001(\0132\034.google.protob" +
      "uf.DoubleValue\022<\n\027active_view_impression" +
      "s\030\002 \001(\0132\033.google.protobuf.Int64Value\022?\n\031" +
      "active_view_measurability\030` \001(\0132\034.google" +
      ".protobuf.DoubleValue\022G\n\"active_view_mea" +
      "surable_cost_micros\030\003 \001(\0132\033.google.proto" +
      "buf.Int64Value\022G\n\"active_view_measurable" +
      "_impressions\030\004 \001(\0132\033.google.protobuf.Int" +
      "64Value\022=\n\027active_view_viewability\030a \001(\013" +
      "2\034.google.protobuf.DoubleValue\022L\n&all_co" +
      "nversions_from_interactions_rate\030A \001(\0132\034" +
      ".google.protobuf.DoubleValue\022;\n\025all_conv" +
      "ersions_value\030B \001(\0132\034.google.protobuf.Do" +
      "ubleValue\0225\n\017all_conversions\030\007 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\022D\n\036all_conversi" +
      "ons_value_per_cost\030> \001(\0132\034.google.protob" +
      "uf.DoubleValue\022H\n\"all_conversions_from_c" +
      "lick_to_call\030v \001(\0132\034.google.protobuf.Dou" +
      "bleValue\022E\n\037all_conversions_from_directi" +
      "ons\030w \001(\0132\034.google.protobuf.DoubleValue\022" +
      "]\n7all_conversions_from_interactions_val" +
      "ue_per_interaction\030C \001(\0132\034.google.protob" +
      "uf.DoubleValue\022?\n\031all_conversions_from_m" +
      "enu\030x \001(\0132\034.google.protobuf.DoubleValue\022" +
      "@\n\032all_conversions_from_order\030y \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022K\n%all_convers" +
      "ions_from_other_engagement\030z \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\022F\n all_conversion" +
      "s_from_store_visit\030{ \001(\0132\034.google.protob" +
      "uf.DoubleValue\022H\n\"all_conversions_from_s" +
      "tore_website\030| \001(\0132\034.google.protobuf.Dou" +
      "bleValue\0222\n\014average_cost\030\010 \001(\0132\034.google." +
      "protobuf.DoubleValue\0221\n\013average_cpc\030\t \001(" +
      "\0132\034.google.protobuf.DoubleValue\0221\n\013avera" +
      "ge_cpe\030b \001(\0132\034.google.protobuf.DoubleVal" +
      "ue\0221\n\013average_cpm\030\n \001(\0132\034.google.protobu" +
      "f.DoubleValue\0221\n\013average_cpv\030\013 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\0228\n\022average_page" +
      "_views\030c \001(\0132\034.google.protobuf.DoubleVal" +
      "ue\022:\n\024average_time_on_site\030T \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\022?\n\031benchmark_aver" +
      "age_max_cpc\030\016 \001(\0132\034.google.protobuf.Doub" +
      "leValue\0223\n\rbenchmark_ctr\030M \001(\0132\034.google." +
      "protobuf.DoubleValue\0221\n\013bounce_rate\030\017 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022+\n\006click" +
      "s\030\023 \001(\0132\033.google.protobuf.Int64Value\0224\n\017" +
      "combined_clicks\030s \001(\0132\033.google.protobuf." +
      "Int64Value\022?\n\031combined_clicks_per_query\030" +
      "t \001(\0132\034.google.protobuf.DoubleValue\0225\n\020c" +
      "ombined_queries\030u \001(\0132\033.google.protobuf." +
      "Int64Value\022J\n$content_budget_lost_impres" +
      "sion_share\030\024 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\022>\n\030content_impression_share\030\025 \001(\013" +
      "2\034.google.protobuf.DoubleValue\022P\n*conver" +
      "sion_last_received_request_date_time\030I \001" +
      "(\0132\034.google.protobuf.StringValue\022E\n\037conv" +
      "ersion_last_conversion_date\030J \001(\0132\034.goog" +
      "le.protobuf.StringValue\022H\n\"content_rank_" +
      "lost_impression_share\030\026 \001(\0132\034.google.pro" +
      "tobuf.DoubleValue\022H\n\"conversions_from_in" +
      "teractions_rate\030E \001(\0132\034.google.protobuf." +
      "DoubleValue\0227\n\021conversions_value\030F \001(\0132\034" +
      ".google.protobuf.DoubleValue\022@\n\032conversi" +
      "ons_value_per_cost\030G \001(\0132\034.google.protob" +
      "uf.DoubleValue\022Y\n3conversions_from_inter" +
      "actions_value_per_interaction\030H \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\0221\n\013conversions" +
      "\030\031 \001(\0132\034.google.protobuf.DoubleValue\0220\n\013" +
      "cost_micros\030\032 \001(\0132\033.google.protobuf.Int6" +
      "4Value\022>\n\030cost_per_all_conversions\030D \001(\013" +
      "2\034.google.protobuf.DoubleValue\0229\n\023cost_p" +
      "er_conversion\030\034 \001(\0132\034.google.protobuf.Do" +
      "ubleValue\022R\n,cost_per_current_model_attr" +
      "ibuted_conversion\030j \001(\0132\034.google.protobu" +
      "f.DoubleValue\022>\n\030cross_device_conversion" +
      "s\030\035 \001(\0132\034.google.protobuf.DoubleValue\022)\n" +
      "\003ctr\030\036 \001(\0132\034.google.protobuf.DoubleValue" +
      "\022J\n$current_model_attributed_conversions" +
      "\030e \001(\0132\034.google.protobuf.DoubleValue\022a\n;" +
      "current_model_attributed_conversions_fro" +
      "m_interactions_rate\030f \001(\0132\034.google.proto" +
      "buf.DoubleValue\022r\nLcurrent_model_attribu" +
      "ted_conversions_from_interactions_value_" +
      "per_interaction\030g \001(\0132\034.google.protobuf." +
      "DoubleValue\022P\n*current_model_attributed_" +
      "conversions_value\030h \001(\0132\034.google.protobu" +
      "f.DoubleValue\022Y\n3current_model_attribute" +
      "d_conversions_value_per_cost\030i \001(\0132\034.goo" +
      "gle.protobuf.DoubleValue\0225\n\017engagement_r" +
      "ate\030\037 \001(\0132\034.google.protobuf.DoubleValue\022" +
      "0\n\013engagements\030  \001(\0132\033.google.protobuf.I" +
      "nt64Value\022E\n\037hotel_average_lead_value_mi" +
      "cros\030K \001(\0132\034.google.protobuf.DoubleValue" +
      "\022H\n!hotel_price_difference_percentage\030\201\001" +
      " \001(\0132\034.google.protobuf.DoubleValue\022s\n!hi" +
      "storical_creative_quality_score\030P \001(\0162H." +
      "google.ads.googleads.v2.enums.QualitySco" +
      "reBucketEnum.QualityScoreBucket\022w\n%histo" +
      "rical_landing_page_quality_score\030Q \001(\0162H" +
      ".google.ads.googleads.v2.enums.QualitySc" +
      "oreBucketEnum.QualityScoreBucket\022=\n\030hist" +
      "orical_quality_score\030R \001(\0132\033.google.prot" +
      "obuf.Int64Value\022q\n\037historical_search_pre" +
      "dicted_ctr\030S \001(\0162H.google.ads.googleads." +
      "v2.enums.QualityScoreBucketEnum.QualityS" +
      "coreBucket\0223\n\016gmail_forwards\030U \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\0220\n\013gmail_saves\030V" +
      " \001(\0132\033.google.protobuf.Int64Value\022;\n\026gma" +
      "il_secondary_clicks\030W \001(\0132\033.google.proto" +
      "buf.Int64Value\022A\n\034impressions_from_store" +
      "_reach\030} \001(\0132\033.google.protobuf.Int64Valu" +
      "e\0220\n\013impressions\030% \001(\0132\033.google.protobuf" +
      ".Int64Value\0226\n\020interaction_rate\030& \001(\0132\034." +
      "google.protobuf.DoubleValue\0221\n\014interacti" +
      "ons\030\' \001(\0132\033.google.protobuf.Int64Value\022m" +
      "\n\027interaction_event_types\030d \003(\0162L.google" +
      ".ads.googleads.v2.enums.InteractionEvent" +
      "TypeEnum.InteractionEventType\0228\n\022invalid" +
      "_click_rate\030( \001(\0132\034.google.protobuf.Doub" +
      "leValue\0223\n\016invalid_clicks\030) \001(\0132\033.google" +
      ".protobuf.Int64Value\0222\n\rmessage_chats\030~ " +
      "\001(\0132\033.google.protobuf.Int64Value\0228\n\023mess" +
      "age_impressions\030\177 \001(\0132\033.google.protobuf." +
      "Int64Value\0228\n\021message_chat_rate\030\200\001 \001(\0132\034" +
      ".google.protobuf.DoubleValue\022G\n!mobile_f" +
      "riendly_clicks_percentage\030m \001(\0132\034.google" +
      ".protobuf.DoubleValue\0223\n\016organic_clicks\030" +
      "n \001(\0132\033.google.protobuf.Int64Value\022>\n\030or" +
      "ganic_clicks_per_query\030o \001(\0132\034.google.pr" +
      "otobuf.DoubleValue\0228\n\023organic_impression" +
      "s\030p \001(\0132\033.google.protobuf.Int64Value\022C\n\035" +
      "organic_impressions_per_query\030q \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\0224\n\017organic_que" +
      "ries\030r \001(\0132\033.google.protobuf.Int64Value\022" +
      ":\n\024percent_new_visitors\030* \001(\0132\034.google.p" +
      "rotobuf.DoubleValue\0220\n\013phone_calls\030+ \001(\013" +
      "2\033.google.protobuf.Int64Value\0226\n\021phone_i" +
      "mpressions\030, \001(\0132\033.google.protobuf.Int64" +
      "Value\0228\n\022phone_through_rate\030- \001(\0132\034.goog" +
      "le.protobuf.DoubleValue\0222\n\014relative_ctr\030" +
      ". \001(\0132\034.google.protobuf.DoubleValue\022J\n$s" +
      "earch_absolute_top_impression_share\030N \001(" +
      "\0132\034.google.protobuf.DoubleValue\022V\n0searc" +
      "h_budget_lost_absolute_top_impression_sh" +
      "are\030X \001(\0132\034.google.protobuf.DoubleValue\022" +
      "I\n#search_budget_lost_impression_share\030/" +
      " \001(\0132\034.google.protobuf.DoubleValue\022M\n\'se" +
      "arch_budget_lost_top_impression_share\030Y " +
      "\001(\0132\034.google.protobuf.DoubleValue\0228\n\022sea" +
      "rch_click_share\0300 \001(\0132\034.google.protobuf." +
      "DoubleValue\022I\n#search_exact_match_impres" +
      "sion_share\0301 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\022=\n\027search_impression_share\0302 \001(\0132" +
      "\034.google.protobuf.DoubleValue\022T\n.search_" +
      "rank_lost_absolute_top_impression_share\030" +
      "Z \001(\0132\034.google.protobuf.DoubleValue\022G\n!s" +
      "earch_rank_lost_impression_share\0303 \001(\0132\034" +
      ".google.protobuf.DoubleValue\022K\n%search_r" +
      "ank_lost_top_impression_share\030[ \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022A\n\033search_top_" +
      "impression_share\030\\ \001(\0132\034.google.protobuf" +
      ".DoubleValue\0220\n\013speed_score\030k \001(\0132\033.goog" +
      "le.protobuf.Int64Value\022?\n\031top_impression" +
      "_percentage\030] \001(\0132\034.google.protobuf.Doub" +
      "leValue\022V\n0valid_accelerated_mobile_page" +
      "s_clicks_percentage\030l \001(\0132\034.google.proto" +
      "buf.DoubleValue\022?\n\031value_per_all_convers" +
      "ions\0304 \001(\0132\034.google.protobuf.DoubleValue" +
      "\022:\n\024value_per_conversion\0305 \001(\0132\034.google." +
      "protobuf.DoubleValue\022S\n-value_per_curren" +
      "t_model_attributed_conversion\030^ \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022=\n\027video_quart" +
      "ile_100_rate\0306 \001(\0132\034.google.protobuf.Dou" +
      "bleValue\022<\n\026video_quartile_25_rate\0307 \001(\013" +
      "2\034.google.protobuf.DoubleValue\022<\n\026video_" +
      "quartile_50_rate\0308 \001(\0132\034.google.protobuf" +
      ".DoubleValue\022<\n\026video_quartile_75_rate\0309" +
      " \001(\0132\034.google.protobuf.DoubleValue\0225\n\017vi" +
      "deo_view_rate\030: \001(\0132\034.google.protobuf.Do" +
      "ubleValue\0220\n\013video_views\030; \001(\0132\033.google." +
      "protobuf.Int64Value\022=\n\030view_through_conv" +
      "ersions\030< \001(\0132\033.google.protobuf.Int64Val" +
      "ueB\347\001\n\"com.google.ads.googleads.v2.commo" +
      "nB\014MetricsProtoP\001ZDgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v2/common" +
      ";common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V2." +
      "Common\312\002\036Google\\Ads\\GoogleAds\\V2\\Common\352" +
      "\002\"Google::Ads::GoogleAds::V2::Commonb\006pr" +
      "oto3"
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
          com.google.ads.googleads.v2.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelPriceDifferencePercentage", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerConversion", "ValuePerCurrentModelAttributedConversion", "VideoQuartile100Rate", "VideoQuartile25Rate", "VideoQuartile50Rate", "VideoQuartile75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", });
    com.google.ads.googleads.v2.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.QualityScoreBucketProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
