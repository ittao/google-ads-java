// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_draft_service.proto

package com.google.ads.googleads.v6.services;

public final class CampaignDraftServiceProto {
  private CampaignDraftServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetCampaignDraftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetCampaignDraftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_PromoteCampaignDraftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_PromoteCampaignDraftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_CampaignDraftOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CampaignDraftOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignDraftResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v6/services/campa" +
      "ign_draft_service.proto\022 google.ads.goog" +
      "leads.v6.services\0329google/ads/googleads/" +
      "v6/enums/response_content_type.proto\0326go" +
      "ogle/ads/googleads/v6/resources/campaign" +
      "_draft.proto\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032#google/longrunning/operations.p" +
      "roto\032 google/protobuf/field_mask.proto\032\027" +
      "google/rpc/status.proto\"`\n\027GetCampaignDr" +
      "aftRequest\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372A" +
      "(\n&googleads.googleapis.com/CampaignDraf" +
      "t\"\245\002\n\033MutateCampaignDraftsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022Q\n\noperations\030\002 \003(\0132" +
      "8.google.ads.googleads.v6.services.Campa" +
      "ignDraftOperationB\003\340A\002\022\027\n\017partial_failur" +
      "e\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025respon" +
      "se_content_type\030\005 \001(\0162J.google.ads.googl" +
      "eads.v6.enums.ResponseContentTypeEnum.Re" +
      "sponseContentType\":\n\033PromoteCampaignDraf" +
      "tRequest\022\033\n\016campaign_draft\030\001 \001(\tB\003\340A\002\"\360\001" +
      "\n\026CampaignDraftOperation\022/\n\013update_mask\030" +
      "\004 \001(\0132\032.google.protobuf.FieldMask\022B\n\006cre" +
      "ate\030\001 \001(\01320.google.ads.googleads.v6.reso" +
      "urces.CampaignDraftH\000\022B\n\006update\030\002 \001(\01320." +
      "google.ads.googleads.v6.resources.Campai" +
      "gnDraftH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation" +
      "\"\237\001\n\034MutateCampaignDraftsResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022L\n\007results\030\002 \003(\0132;.google.ads.googl" +
      "eads.v6.services.MutateCampaignDraftResu" +
      "lt\"|\n\031MutateCampaignDraftResult\022\025\n\rresou" +
      "rce_name\030\001 \001(\t\022H\n\016campaign_draft\030\002 \001(\01320" +
      ".google.ads.googleads.v6.resources.Campa" +
      "ignDraft\"\223\001\n#ListCampaignDraftAsyncError" +
      "sRequest\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372A(\n" +
      "&googleads.googleapis.com/CampaignDraft\022" +
      "\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"c" +
      "\n$ListCampaignDraftAsyncErrorsResponse\022\"" +
      "\n\006errors\030\001 \003(\0132\022.google.rpc.Status\022\027\n\017ne" +
      "xt_page_token\030\002 \001(\t2\244\010\n\024CampaignDraftSer" +
      "vice\022\311\001\n\020GetCampaignDraft\0229.google.ads.g" +
      "oogleads.v6.services.GetCampaignDraftReq" +
      "uest\0320.google.ads.googleads.v6.resources" +
      ".CampaignDraft\"H\202\323\344\223\0022\0220/v6/{resource_na" +
      "me=customers/*/campaignDrafts/*}\332A\rresou" +
      "rce_name\022\356\001\n\024MutateCampaignDrafts\022=.goog" +
      "le.ads.googleads.v6.services.MutateCampa" +
      "ignDraftsRequest\032>.google.ads.googleads." +
      "v6.services.MutateCampaignDraftsResponse" +
      "\"W\202\323\344\223\0028\"3/v6/customers/{customer_id=*}/" +
      "campaignDrafts:mutate:\001*\332A\026customer_id,o" +
      "perations\022\375\001\n\024PromoteCampaignDraft\022=.goo" +
      "gle.ads.googleads.v6.services.PromoteCam" +
      "paignDraftRequest\032\035.google.longrunning.O" +
      "peration\"\206\001\202\323\344\223\002>\"9/v6/{campaign_draft=c" +
      "ustomers/*/campaignDrafts/*}:promote:\001*\332" +
      "A\016campaign_draft\312A.\n\025google.protobuf.Emp" +
      "ty\022\025google.protobuf.Empty\022\207\002\n\034ListCampai" +
      "gnDraftAsyncErrors\022E.google.ads.googlead" +
      "s.v6.services.ListCampaignDraftAsyncErro" +
      "rsRequest\032F.google.ads.googleads.v6.serv" +
      "ices.ListCampaignDraftAsyncErrorsRespons" +
      "e\"X\202\323\344\223\002B\022@/v6/{resource_name=customers/" +
      "*/campaignDrafts/*}:listAsyncErrors\332A\rre" +
      "source_name\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\200\002\n$com.google.ads.googleads.v6.servi" +
      "cesB\031CampaignDraftServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v6/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V6.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V6\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.CampaignDraftProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetCampaignDraftRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetCampaignDraftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetCampaignDraftRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_PromoteCampaignDraftRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_PromoteCampaignDraftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_PromoteCampaignDraftRequest_descriptor,
        new java.lang.String[] { "CampaignDraft", });
    internal_static_google_ads_googleads_v6_services_CampaignDraftOperation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_CampaignDraftOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_CampaignDraftOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignDraftsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_services_MutateCampaignDraftResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignDraftResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignDraft", });
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_ListCampaignDraftAsyncErrorsResponse_descriptor,
        new java.lang.String[] { "Errors", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v6.resources.CampaignDraftProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
