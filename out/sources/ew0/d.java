package ew0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dx.j;
import fu.r;
import fw0.CollisionParticipantVehicleDataDto;
import fw0.CollisionParticipantVehiclesByKindDto;
import fw0.CollisionVehicleImageFileDto;
import fw0.CollisionVehicleImageWithThumbnailFileDto;
import fw0.CollisionVehicleInsuranceDataDto;
import fw0.ConfigurationForPhotosCompressionMobileResponse;
import fw0.CreateVehicleCollisionRequest;
import fw0.CreateVehicleCollisionResponse;
import fw0.FillCollisionCompanyOwnerDto;
import fw0.FillCollisionPhysicalOwnerDto;
import fw0.FillVehicleCollisionDescriptionRequest;
import fw0.FillVehicleCollisionParticipantImageDto;
import fw0.FillVehicleCollisionParticipantImageWithThumbnailDto;
import fw0.FillVehicleCollisionParticipantStatementInsuranceDataDto;
import fw0.FillVehicleCollisionParticipantStatementPersonalDataDto;
import fw0.FillVehicleCollisionParticipantStatementVehicleDataDto;
import fw0.FillVehicleCollisionPhoneNumberDataDto;
import fw0.GetCollisionParticipantVehiclesResponse;
import fw0.GetCollisionVehicleResponse;
import fw0.GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto;
import fw0.GetReadyToSignVehicleCollisionStatementDataResponse;
import fw0.GetVehicleCollisionDescriptionWithOtherSideDataResponse;
import fw0.GetVehicleCollisionInitialDataConfirmedResponse;
import fw0.GetVehicleCollisionJoinedResponse;
import fw0.GroupedUserVehicleCollisionsDto;
import fw0.InsuranceProviderDataDto;
import fw0.InsuranceProviderToAutomaticallyReportDataDto;
import fw0.JoinVehicleCollisionRequest;
import fw0.JoinVehicleCollisionResponse;
import fw0.ReadyToSignVehicleCollisionStatementInsuranceDataDto;
import fw0.ReadyToSignVehicleCollisionStatementParticipantDataDto;
import fw0.ReadyToSignVehicleCollisionStatementPersonalDataDto;
import fw0.ReadyToSignVehicleCollisionStatementVehicleDataDto;
import fw0.RefreshVehicleCollisionParticipantImagesResponse;
import fw0.ReportVehicleCollisionToInsurerRequest;
import fw0.ReportVehicleCollisionToInsurerResponse;
import fw0.StartedUserVehicleCollisionDataDto;
import fw0.SubscribeVehicleCollisionStatementReadyResponse;
import fw0.UserVehicleCollisionDataDto;
import fw0.UserVehicleCollisionsFirstPageResponse;
import fw0.UserVehicleCollisionsNextPageResponse;
import fw0.VehicleCollisionCircumstancesDto;
import fw0.VehicleCollisionCompanyOwnerDto;
import fw0.VehicleCollisionConfirmationCompanyOwnerDataDto;
import fw0.VehicleCollisionConfirmationImageDataDto;
import fw0.VehicleCollisionConfirmationImageWithThumbnailDataDto;
import fw0.VehicleCollisionConfirmationParticipantDrivingLicenseDto;
import fw0.VehicleCollisionConfirmationPhoneNumberDataDto;
import fw0.VehicleCollisionConfirmationPhysicalOwnerDataDto;
import fw0.VehicleCollisionConfirmationStatementDto;
import fw0.VehicleCollisionConfirmationStatementInsuranceDataDto;
import fw0.VehicleCollisionConfirmationStatementParticipantDataDto;
import fw0.VehicleCollisionConfirmationStatementPersonalDataDto;
import fw0.VehicleCollisionConfirmationStatementVehicleDataDto;
import fw0.VehicleCollisionCreatedStatementInsuranceDataDto;
import fw0.VehicleCollisionDescriptionDto;
import fw0.VehicleCollisionDescriptionParticipantDto;
import fw0.VehicleCollisionFileDto;
import fw0.VehicleCollisionFileServiceConfigDto;
import fw0.VehicleCollisionFinishedDetailsResponse;
import fw0.VehicleCollisionOtherSidePersonalDataDto;
import fw0.VehicleCollisionParticipantDetailsDto;
import fw0.VehicleCollisionParticipantDrivingLicenseDto;
import fw0.VehicleCollisionPersonalDetailsDto;
import fw0.VehicleCollisionPhoneNumberDataDto;
import fw0.VehicleCollisionPhysicalOwnerDto;
import fw0.VehicleCollisionRegeneratedStatementDetailsResponse;
import fw0.VehicleCollisionReportedStatementDetailsDto;
import fw0.VehicleCollisionReportedToUfgDetailsResponse;
import fw0.VehicleCollisionSubscriptionErrorDto;
import fw0.VehicleCollisionSubscriptionReadyStatementDto;
import fw0.VehicleCollisionUfgFormReportDetailsResponse;
import fw0.VehicleCollisionVehicleDetailsDto;
import fw0.a2;
import fw0.a3;
import fw0.h3;
import fw0.k3;
import fw0.o3;
import fw0.w2;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import sv0.AutomaticReportInsurerDetails;
import sv0.AutomaticReportRequest;
import sv0.AutomaticReportSuccessResponse;
import sv0.BEVehicleData;
import sv0.CollisionCircumstances;
import sv0.CollisionCreatedDescription;
import sv0.CollisionGroup;
import sv0.CollisionOtherSidePersonalData;
import sv0.Download;
import sv0.DrivingLicence;
import sv0.FileImageConfiguration;
import sv0.Insurance;
import sv0.InsuranceProviderData;
import sv0.NewCollision;
import sv0.NewVehicleCollisionDescription;
import sv0.PdfFile;
import sv0.ProcessId;
import sv0.ProcessNewCollision;
import sv0.ReportedToUFGStatementDetail;
import sv0.StatementParticipantDetails;
import sv0.StatementPersonalData;
import sv0.StatementPersonalDetails;
import sv0.StatementReady;
import sv0.StatementVehicleData;
import sv0.StatementVehicleDetails;
import sv0.UfgFormReportDetails;
import sv0.Uploader;
import sv0.VehicleCollisionDescriptionParticipant;
import sv0.VehicleCollisionFileName;
import sv0.VehicleCollisionFileToDownload;
import sv0.VehicleCollisionUploadedFile;
import sv0.VehicleCompanyOwner;
import sv0.VehiclePhysicalOwner;
import sv0.a0;
import sv0.h0;
import sv0.k0;
import sv0.l;
import sv0.m;
import sv0.m0;
import sv0.o;
import sv0.s0;
import sv0.t;
import sv0.u;
import sv0.v0;
import vy.Coordinates;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¦\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#*\u00020\"¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020)0#*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020-0#*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a\u0015\u00106\u001a\u0004\u0018\u000105*\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a#\u0010C\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0#*\u00020@¢\u0006\u0004\bC\u0010D\u001a\u0013\u0010G\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\bG\u0010H\u001a\u001f\u0010I\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0#*\u00020FH\u0000¢\u0006\u0004\bI\u0010J\u001a\u0013\u0010M\u001a\u00020L*\u00020KH\u0002¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010O\u001a\u00020K*\u00020LH\u0000¢\u0006\u0004\bO\u0010P\u001a\u001b\u0010U\u001a\u00020T*\u00020Q2\u0006\u0010S\u001a\u00020RH\u0000¢\u0006\u0004\bU\u0010V\u001a\u0013\u0010Y\u001a\u00020X*\u00020WH\u0000¢\u0006\u0004\bY\u0010Z\u001a\u0013\u0010]\u001a\u00020\\*\u00020[H\u0000¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010a\u001a\u00020`*\u00020_H\u0000¢\u0006\u0004\ba\u0010b\u001a\u0013\u0010e\u001a\u00020d*\u00020cH\u0000¢\u0006\u0004\be\u0010f\u001a\u0013\u0010i\u001a\u00020h*\u00020gH\u0000¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010m\u001a\u00020l*\u00020kH\u0000¢\u0006\u0004\bm\u0010n\u001a\u001f\u0010q\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020p0#*\u00020oH\u0000¢\u0006\u0004\bq\u0010r\u001a\u0013\u0010u\u001a\u00020t*\u00020sH\u0000¢\u0006\u0004\bu\u0010v\u001a\u0013\u0010y\u001a\u00020x*\u00020wH\u0000¢\u0006\u0004\by\u0010z\u001a\u001f\u0010}\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020|0#*\u00020{H\u0000¢\u0006\u0004\b}\u0010~\u001a-\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030\u0082\u00010#*\u00020\u007f2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u0001*\u00030\u0085\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a#\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020B0#*\u00030\u0089\u0001H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0015\u0010\u008d\u0001\u001a\u00020x*\u00030\u008c\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0016\u0010\u0091\u0001\u001a\u00030\u0090\u0001*\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0017\u0010\u0094\u0001\u001a\u00020s*\u00030\u0093\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a%\u0010\u0098\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0005\u0012\u00030\u0093\u00010#*\u00030\u0096\u0001H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0016\u0010\u009c\u0001\u001a\u00030\u009b\u0001*\u00030\u009a\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0017\u0010\u009f\u0001\u001a\u00030\u009e\u0001*\u00020|H\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0017\u0010¢\u0001\u001a\u00030¡\u0001*\u00020lH\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0017\u0010¥\u0001\u001a\u00030¤\u0001*\u00020pH\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001\u001a\u0017\u0010¨\u0001\u001a\u00030§\u0001*\u00020xH\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001a$\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030«\u00010A*\t\u0012\u0005\u0012\u00030ª\u00010AH\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0018\u0010°\u0001\u001a\u00030¯\u0001*\u00030®\u0001H\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001\u001a\u0017\u0010³\u0001\u001a\u00030²\u0001*\u00020cH\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001\u001a\u0017\u0010¶\u0001\u001a\u00030µ\u0001*\u00020_H\u0000¢\u0006\u0006\b¶\u0001\u0010·\u0001\u001a$\u0010º\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030¹\u00010#*\u00030¸\u0001H\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001\u001a\u0018\u0010¾\u0001\u001a\u00030½\u0001*\u00030¼\u0001H\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001\u001a\u0018\u0010Â\u0001\u001a\u00030Á\u0001*\u00030À\u0001H\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0018\u0010Æ\u0001\u001a\u00030Å\u0001*\u00030Ä\u0001H\u0000¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0018\u0010Ê\u0001\u001a\u00030É\u0001*\u00030È\u0001H\u0000¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001\u001a-\u0010Ï\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030Î\u00010#*\u00030Ì\u00012\u0007\u0010Í\u0001\u001a\u00020sH\u0000¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001\u001a.\u0010Ó\u0001\u001a\u0015\u0012\u0004\u0012\u00020$\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ò\u00010A0#*\t\u0012\u0005\u0012\u00030Ñ\u00010A¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001\u001a\"\u0010×\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030Ö\u00010#*\u00030Õ\u0001¢\u0006\u0006\b×\u0001\u0010Ø\u0001\u001a.\u0010Û\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030Ú\u00010#*\u00030Ù\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0000¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001\u001a$\u0010ß\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030Þ\u00010#*\u00030Ý\u0001H\u0000¢\u0006\u0006\bß\u0001\u0010à\u0001\u001a#\u0010â\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020|0#*\u00030á\u0001H\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001\u001a\u0017\u0010å\u0001\u001a\u00020l*\u00030ä\u0001H\u0000¢\u0006\u0006\bå\u0001\u0010æ\u0001\u001a#\u0010è\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020p0#*\u00030ç\u0001H\u0000¢\u0006\u0006\bè\u0001\u0010é\u0001\u001a.\u0010ì\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030ë\u00010#*\u00030ê\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0000¢\u0006\u0006\bì\u0001\u0010í\u0001\u001a\u0018\u0010ð\u0001\u001a\u00030ï\u0001*\u00030î\u0001H\u0000¢\u0006\u0006\bð\u0001\u0010ñ\u0001\u001a.\u0010ô\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030ó\u00010#*\u00030ò\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0000¢\u0006\u0006\bô\u0001\u0010õ\u0001\u001a\u0018\u0010ø\u0001\u001a\u00030÷\u0001*\u00030ö\u0001H\u0000¢\u0006\u0006\bø\u0001\u0010ù\u0001\u001a\u0018\u0010ü\u0001\u001a\u00030û\u0001*\u00030ú\u0001H\u0000¢\u0006\u0006\bü\u0001\u0010ý\u0001\u001a\u0018\u0010ÿ\u0001\u001a\u00030®\u0001*\u00030þ\u0001H\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002\u001a(\u0010\u0082\u0002\u001a\u000b\u0012\u0005\u0012\u00030ª\u0001\u0018\u00010A*\u000b\u0012\u0005\u0012\u00030\u0081\u0002\u0018\u00010AH\u0000¢\u0006\u0006\b\u0082\u0002\u0010\u00ad\u0001\u001a\u0018\u0010\u0084\u0002\u001a\u00030®\u0001*\u00030\u0083\u0002H\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0017\u0010\u0087\u0002\u001a\u00020x*\u00030\u0086\u0002H\u0000¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0017\u0010\u008a\u0002\u001a\u00020c*\u00030\u0089\u0002H\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0017\u0010\u008d\u0002\u001a\u00020_*\u00030\u008c\u0002H\u0000¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a-\u0010\u0091\u0002\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030\u0090\u00020#*\u00030\u008f\u00022\u0007\u0010Í\u0001\u001a\u00020sH\u0000¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a!\u0010\u0094\u0002\u001a\u00020s2\r\u0010\u0093\u0002\u001a\b\u0012\u0004\u0012\u00020s0AH\u0000¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u001d\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020t0A*\u00030\u0096\u0002H\u0000¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002¨\u0006\u0099\u0002"}, d2 = {"Lsv0/v;", "Lfw0/r;", "Z", "(Lsv0/v;)Lfw0/r;", "Lsv0/t;", "Lfw0/y0;", "g0", "(Lsv0/t;)Lfw0/y0;", "Lsv0/w;", "Lez/c;", "dateConverter", "Lfw0/e0;", "c0", "(Lsv0/w;Lez/c;)Lfw0/e0;", "Lfw0/s;", "Lsv0/z;", "M", "(Lfw0/s;)Lsv0/z;", "Lfw0/z0;", "Lsv0/u;", i.f37094u, "(Lfw0/z0;)Lsv0/u;", "Lfw0/r0;", "Lsv0/i;", ip.a.f96138c, "(Lfw0/r0;)Lsv0/i;", "Lfw0/s2;", "Lsv0/n0;", "R", "(Lfw0/s2;)Lsv0/n0;", "Lfw0/t0;", "Lsv0/o;", "F", "(Lfw0/t0;)Lsv0/o;", "Lfw0/s0;", "Ldx/i;", "Ldx/b;", "Lsv0/h0;", "h", "(Lfw0/s0;)Ldx/i;", "Lfw0/v1;", "Lsv0/k0;", "l", "(Lfw0/v1;)Ldx/i;", "Lfw0/j3;", "Lsv0/g0;", "u", "(Lfw0/j3;)Ldx/i;", "Lfw0/a3;", "Lsv0/s0;", "V", "(Lfw0/a3;)Lsv0/s0;", "Lfw0/r2;", "Lvy/c;", "a", "(Lfw0/r2;)Lvy/c;", "Lfw0/x2;", "Lsv0/k;", "E", "(Lfw0/x2;)Lsv0/k;", "Lfw0/z2;", "Lsv0/p;", "G", "(Lfw0/z2;)Lsv0/p;", "Lfw0/m;", "", "Lsv0/e;", "d", "(Lfw0/m;)Ldx/i;", "Lsv0/m0;", "Lfw0/a2;", "i0", "(Lsv0/m0;)Lfw0/a2;", "o", "(Lfw0/a2;)Ldx/i;", "Lsv0/v0;", "Lfw0/o3;", "p0", "(Lsv0/v0;)Lfw0/o3;", "X", "(Lfw0/o3;)Lsv0/v0;", "Lfw0/q;", "Lez/a;", "currentTimeProvider", "Lsv0/q;", i.f37087n, "(Lfw0/q;Lez/a;)Lsv0/q;", "Lsv0/i0;", "Lfw0/k0;", "f0", "(Lsv0/i0;)Lfw0/k0;", "Lsv0/t0;", "Lfw0/f0;", "d0", "(Lsv0/t0;)Lfw0/f0;", "Lsv0/w0;", "Lfw0/d0;", "b0", "(Lsv0/w0;)Lfw0/d0;", "Lsv0/u0;", "Lfw0/c0;", "a0", "(Lsv0/u0;)Lfw0/c0;", "Lsv0/e0;", "Lfw0/j0;", "e0", "(Lsv0/e0;)Lfw0/j0;", "Lfw0/j1;", "Lsv0/f0;", "O", "(Lfw0/j1;)Lsv0/f0;", "Lfw0/k1;", "Lsv0/j0;", "j", "(Lfw0/k1;)Ldx/i;", "", "Lsv0/o0;", "t0", "(Ljava/lang/String;)Lsv0/o0;", "Lfw0/h1;", "Lsv0/r;", "I", "(Lfw0/h1;)Lsv0/r;", "Lfw0/i1;", "Lsv0/d0;", "i", "(Lfw0/i1;)Ldx/i;", "Lfw0/q0;", "Lsv0/y;", "processId", "Lsv0/c0$a;", "g", "(Lfw0/q0;Lsv0/y;)Ldx/i;", "Lfw0/u2;", "Lsv0/p0;", ip.a.f96137b, "(Lfw0/u2;)Lsv0/p0;", "Lfw0/o0;", "f", "(Lfw0/o0;)Ldx/i;", "Lfw0/p;", "u0", "(Lfw0/p;)Lsv0/r;", "Lfw0/w0;", "Lsv0/s;", "K", "(Lfw0/w0;)Lsv0/s;", "Lsv0/a0;", "q0", "(Lsv0/a0;)Ljava/lang/String;", "Lfw0/w2;", "Ldx/b$e;", "v0", "(Lfw0/w2;)Ldx/i;", "Lsv0/c0;", "Lfw0/l2;", "k0", "(Lsv0/c0;)Lfw0/l2;", "Lfw0/n2;", "m0", "(Lsv0/d0;)Lfw0/n2;", "Lfw0/o2;", "n0", "(Lsv0/f0;)Lfw0/o2;", "Lfw0/p2;", "o0", "(Lsv0/j0;)Lfw0/p2;", "Lfw0/m2;", "l0", "(Lsv0/r;)Lfw0/m2;", "Lsv0/j0$a;", "Lfw0/h2;", "r0", "(Ljava/util/List;)Ljava/util/List;", "Lsv0/r0;", "Lfw0/g2;", "j0", "(Lsv0/r0;)Lfw0/g2;", "Lfw0/f2;", "b", "(Lsv0/u0;)Lfw0/f2;", "Lfw0/k2;", "c", "(Lsv0/w0;)Lfw0/k2;", "Lfw0/y1;", "Lsv0/m$a;", "m", "(Lfw0/y1;)Ldx/i;", "Lfw0/p0;", "Lsv0/b;", "A", "(Lfw0/p0;)Lsv0/b;", "Lsv0/c;", "Lfw0/o1;", "h0", "(Lsv0/c;)Lfw0/o1;", "Lfw0/p1;", "Lsv0/d;", "B", "(Lfw0/p1;)Lsv0/d;", "Lfw0/x0;", "Lsv0/a;", "z", "(Lfw0/x0;)Lsv0/a;", "Lfw0/z1;", "currentPage", "Lsv0/m$b;", "n", "(Lfw0/z1;Ljava/lang/String;)Ldx/i;", "Lfw0/u0;", "Lsv0/j;", "w", "(Ljava/util/List;)Ldx/i;", "Lfw0/r1;", "Lsv0/g$b;", "k", "(Lfw0/r1;)Ldx/i;", "Lfw0/v2;", "Lsv0/c0$b$a;", "p", "(Lfw0/v2;Lsv0/y;)Ldx/i;", "Lfw0/h3;", "Lsv0/l;", "t", "(Lfw0/h3;)Ldx/i;", "Lfw0/y2;", "q", "(Lfw0/y2;)Ldx/i;", "Lfw0/b3;", i.f37086m, "(Lfw0/b3;)Lsv0/f0;", "Lfw0/m3;", "v", "(Lfw0/m3;)Ldx/i;", "Lfw0/e3;", "Lsv0/c0$b$b;", "r", "(Lfw0/e3;Lsv0/y;)Ldx/i;", "Lfw0/b2;", "Lsv0/h;", "C", "(Lfw0/b2;)Lsv0/h;", "Lfw0/g3;", "Lsv0/c0$b$c;", "s", "(Lfw0/g3;Lsv0/y;)Ldx/i;", "Lfw0/l3;", "Lsv0/l0;", "Q", "(Lfw0/l3;)Lsv0/l0;", "Lfw0/f3;", "Lsv0/b0;", "N", "(Lfw0/f3;)Lsv0/b0;", "Lfw0/t2;", "U", "(Lfw0/t2;)Lsv0/r0;", "Lfw0/o;", "y", "Lfw0/n;", "T", "(Lfw0/n;)Lsv0/r0;", "Lfw0/q2;", "J", "(Lfw0/q2;)Lsv0/r;", "Lfw0/c2;", "W", "(Lfw0/c2;)Lsv0/u0;", "Lfw0/d3;", "Y", "(Lfw0/d3;)Lsv0/w0;", "Lfw0/n0;", "Lsv0/f;", "e", "(Lfw0/n0;Ljava/lang/String;)Ldx/i;", "list", "s0", "(Ljava/util/List;)Ljava/lang/String;", "Lfw0/l1;", "x", "(Lfw0/l1;)Ljava/util/List;", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f53842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f53843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f53844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f53845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f53846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f53847h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f53848i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f53849j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f53850k;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53840a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.VICTIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[l.PERPETRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f53841b = iArr2;
            int[] iArr3 = new int[a3.values().length];
            try {
                iArr3[a3.INITIAL_INFO_CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[a3.INITIAL_INFO_REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[a3.STATEMENT_CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[a3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[a3.CREATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[a3.INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[a3.READY_TO_SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[a3.READY_TO_SIGN_CONFIRMED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[a3.STATEMENT_CREATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[a3.INITIAL_INFO_CONFIRMED_BY_ME.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[a3.STATEMENT_FILLED_BY_ME.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[a3.READY_TO_SIGN_CONFIRMED_BY_ME.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[a3.READY_TO_SIGN_REJECTED_BY_ME.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[a3.READY_TO_SIGN_REJECTED_BY_OTHER.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[a3.REPORTED_TO_UFG.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[a3.STATEMENT_CREATED_NOT_REPORTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[a3.REPORTED_TO_UFG_TO_FILL_FORM.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[a3.REPORTED_TO_UFG_FORM_FILLED.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            f53842c = iArr3;
            int[] iArr4 = new int[k3.values().length];
            try {
                iArr4[k3.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[k3.RETRY_GLOBAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[k3.TERMINAL_GLOBAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[k3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            f53843d = iArr4;
            int[] iArr5 = new int[h3.values().length];
            try {
                iArr5[h3.PERPETRATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[h3.VICTIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[h3.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            f53844e = iArr5;
            int[] iArr6 = new int[m0.values().length];
            try {
                iArr6[m0.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[m0.CO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[m0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            f53845f = iArr6;
            int[] iArr7 = new int[a2.values().length];
            try {
                iArr7[a2.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[a2.CO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[a2.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[a2.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            f53846g = iArr7;
            int[] iArr8 = new int[v0.values().length];
            try {
                iArr8[v0.FRONT_DAMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[v0.BACK_DAMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[v0.TOP_DAMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[v0.LEFT_FRONT_DAMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[v0.RIGHT_FRONT_DAMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[v0.LEFT_SIDE_DAMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr8[v0.RIGHT_SIDE_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr8[v0.LEFT_BACK_DAMAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr8[v0.RIGHT_BACK_DAMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr8[v0.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused46) {
            }
            f53847h = iArr8;
            int[] iArr9 = new int[o3.values().length];
            try {
                iArr9[o3.FRONT_DAMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr9[o3.BACK_DAMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr9[o3.LEFT_SIDE_DAMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr9[o3.RIGHT_SIDE_DAMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr9[o3.LEFT_FRONT_DAMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr9[o3.RIGHT_FRONT_DAMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr9[o3.LEFT_BACK_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr9[o3.RIGHT_BACK_DAMAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr9[o3.TOP_DAMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr9[o3.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused56) {
            }
            f53848i = iArr9;
            int[] iArr10 = new int[a0.values().length];
            try {
                iArr10[a0.IDENTITY_REJECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr10[a0.DESCRIPTION_REJECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            f53849j = iArr10;
            int[] iArr11 = new int[w2.values().length];
            try {
                iArr11[w2.IDENTITY_REJECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr11[w2.DESCRIPTION_REJECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            f53850k = iArr11;
        }
    }

    public static final sv0.b A(GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto getInsuranceProvidersToAutomaticallyReportVehicleCollisionDto) {
        if (getInsuranceProvidersToAutomaticallyReportVehicleCollisionDto.b().isEmpty()) {
            List<InsuranceProviderToAutomaticallyReportDataDto> listA = getInsuranceProvidersToAutomaticallyReportVehicleCollisionDto.a();
            ArrayList arrayList = new ArrayList(v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(z((InsuranceProviderToAutomaticallyReportDataDto) it.next()));
            }
            return new sv0.b.AllInsurers(arrayList);
        }
        List<InsuranceProviderToAutomaticallyReportDataDto> listB = getInsuranceProvidersToAutomaticallyReportVehicleCollisionDto.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(z((InsuranceProviderToAutomaticallyReportDataDto) it4.next()));
        }
        List<InsuranceProviderToAutomaticallyReportDataDto> listC = getInsuranceProvidersToAutomaticallyReportVehicleCollisionDto.c();
        ArrayList arrayList3 = new ArrayList(v.y(listC, 10));
        Iterator<T> it5 = listC.iterator();
        while (it5.hasNext()) {
            arrayList3.add(z((InsuranceProviderToAutomaticallyReportDataDto) it5.next()));
        }
        return new sv0.b.InvolvedPartiesInsurers(arrayList2, arrayList3);
    }

    public static final AutomaticReportSuccessResponse B(ReportVehicleCollisionToInsurerResponse reportVehicleCollisionToInsurerResponse) {
        return new AutomaticReportSuccessResponse(reportVehicleCollisionToInsurerResponse.getFillFormClaimUrl(), reportVehicleCollisionToInsurerResponse.getPhoneNumber());
    }

    public static final CollisionCircumstances C(VehicleCollisionCircumstancesDto vehicleCollisionCircumstancesDto) {
        b0 b0VarG = c0.g(vehicleCollisionCircumstancesDto.getCollisionDescription());
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(vehicleCollisionCircumstancesDto.getCollisionDate());
        Double dS = r.s(vehicleCollisionCircumstancesDto.getLongitude());
        double dDoubleValue = dS != null ? dS.doubleValue() : 0.0d;
        Double dS2 = r.s(vehicleCollisionCircumstancesDto.getLatitude());
        return new CollisionCircumstances(b0VarG, vehicleCollisionCircumstancesDto.getLocalizationDescription(), new Coordinates(dS2 != null ? dS2.doubleValue() : 0.0d, dDoubleValue), offsetDateTime);
    }

    public static final CollisionCreatedDescription D(GetVehicleCollisionDescriptionWithOtherSideDataResponse getVehicleCollisionDescriptionWithOtherSideDataResponse) {
        o oVar;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription().getCollisionDate());
        Coordinates coordinatesA = a(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription());
        b0 b0VarG = c0.g(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription().getLocalizationDescription());
        b0 b0VarG2 = c0.g(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription().getCollisionDescription());
        CollisionOtherSidePersonalData collisionOtherSidePersonalDataE = E(getVehicleCollisionDescriptionWithOtherSideDataResponse.getOtherSidePersonalData());
        boolean userAsDescriptionAuthor = getVehicleCollisionDescriptionWithOtherSideDataResponse.getUserAsDescriptionAuthor();
        if (userAsDescriptionAuthor) {
            oVar = o.ME;
        } else {
            if (userAsDescriptionAuthor) {
                throw new p();
            }
            oVar = o.OTHER;
        }
        return new CollisionCreatedDescription(offsetDateTime, coordinatesA, b0VarG, b0VarG2, collisionOtherSidePersonalDataE, oVar, R(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription().getPerpetrator()), R(getVehicleCollisionDescriptionWithOtherSideDataResponse.getCollisionDescription().getVictim()));
    }

    private static final CollisionOtherSidePersonalData E(VehicleCollisionOtherSidePersonalDataDto vehicleCollisionOtherSidePersonalDataDto) {
        b0 b0VarG = c0.g(vehicleCollisionOtherSidePersonalDataDto.getFirstName());
        b0 b0VarG2 = c0.g(vehicleCollisionOtherSidePersonalDataDto.getSurname());
        b0 b0VarG3 = c0.g(vehicleCollisionOtherSidePersonalDataDto.getPesel());
        b0 b0VarG4 = c0.g(vehicleCollisionOtherSidePersonalDataDto.getPicture());
        String secondName = vehicleCollisionOtherSidePersonalDataDto.getSecondName();
        b0 b0VarG5 = secondName != null ? c0.g(secondName) : null;
        List<VehicleCollisionParticipantDrivingLicenseDto> listA = vehicleCollisionOtherSidePersonalDataDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(G((VehicleCollisionParticipantDrivingLicenseDto) it.next()));
        }
        return new CollisionOtherSidePersonalData(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, arrayList);
    }

    public static final o F(GetVehicleCollisionJoinedResponse getVehicleCollisionJoinedResponse) {
        boolean descriptionAuthor = getVehicleCollisionJoinedResponse.getDescriptionAuthor();
        if (descriptionAuthor) {
            return o.ME;
        }
        if (descriptionAuthor) {
            throw new p();
        }
        return o.OTHER;
    }

    public static final DrivingLicence G(VehicleCollisionParticipantDrivingLicenseDto vehicleCollisionParticipantDrivingLicenseDto) {
        return new DrivingLicence(vehicleCollisionParticipantDrivingLicenseDto.getCategory());
    }

    public static final FileImageConfiguration H(ConfigurationForPhotosCompressionMobileResponse configurationForPhotosCompressionMobileResponse, ez.a aVar) {
        wx.d.Companion companion = wx.d.INSTANCE;
        return new FileImageConfiguration(e1.i(wx.d.j0(companion.v()), wx.d.j0(companion.u())), configurationForPhotosCompressionMobileResponse.getCompressionLevel(), configurationForPhotosCompressionMobileResponse.getMaxFileAmount(), configurationForPhotosCompressionMobileResponse.getMaxImageResolution(), new Uploader(configurationForPhotosCompressionMobileResponse.getPathToFileSaveDirectory(), c0.g(configurationForPhotosCompressionMobileResponse.getJwtFileService().getToken()), new fz.b.OffsetDateTime(aVar.f().plusSeconds(configurationForPhotosCompressionMobileResponse.getJwtFileService().getValidityInSeconds())), ry.a.b(c0.g(configurationForPhotosCompressionMobileResponse.getFileEncryptionKey())), ry.a.b(c0.g(configurationForPhotosCompressionMobileResponse.getFileSaveDirectoryUrlDomainCertificateBase64())), null));
    }

    public static final Insurance I(ReadyToSignVehicleCollisionStatementInsuranceDataDto readyToSignVehicleCollisionStatementInsuranceDataDto) {
        String insurerId = readyToSignVehicleCollisionStatementInsuranceDataDto.getInsurerId();
        String insurerName = readyToSignVehicleCollisionStatementInsuranceDataDto.getInsurerName();
        String insuranceNumber = readyToSignVehicleCollisionStatementInsuranceDataDto.getInsuranceNumber();
        return new Insurance(insurerId, insurerName, insuranceNumber != null ? c0.g(insuranceNumber) : null, readyToSignVehicleCollisionStatementInsuranceDataDto.getInsuranceAddedManually());
    }

    public static final Insurance J(VehicleCollisionCreatedStatementInsuranceDataDto vehicleCollisionCreatedStatementInsuranceDataDto) {
        String insurerId = vehicleCollisionCreatedStatementInsuranceDataDto.getInsurerId();
        String insurerName = vehicleCollisionCreatedStatementInsuranceDataDto.getInsurerName();
        String insuranceNumber = vehicleCollisionCreatedStatementInsuranceDataDto.getInsuranceNumber();
        return new Insurance(insurerId, insurerName, insuranceNumber != null ? c0.g(insuranceNumber) : null, vehicleCollisionCreatedStatementInsuranceDataDto.getInsuranceAddedManually());
    }

    public static final InsuranceProviderData K(InsuranceProviderDataDto insuranceProviderDataDto) {
        return new InsuranceProviderData(insuranceProviderDataDto.getInsurerId(), insuranceProviderDataDto.getInsurerName(), insuranceProviderDataDto.getInsurerNameAdditionalDescription());
    }

    public static final u L(JoinVehicleCollisionResponse joinVehicleCollisionResponse) {
        o oVar;
        ProcessId processId = new ProcessId(joinVehicleCollisionResponse.getProcessId());
        boolean userAsDescriptionAuthor = joinVehicleCollisionResponse.getUserAsDescriptionAuthor();
        if (userAsDescriptionAuthor) {
            oVar = o.ME;
        } else {
            if (userAsDescriptionAuthor) {
                throw new p();
            }
            oVar = o.OTHER;
        }
        return new u(processId, oVar);
    }

    public static final ProcessNewCollision M(CreateVehicleCollisionResponse createVehicleCollisionResponse) {
        return new ProcessNewCollision(new ProcessId(createVehicleCollisionResponse.getProcessId()), createVehicleCollisionResponse.getProcessCode());
    }

    public static final ReportedToUFGStatementDetail N(VehicleCollisionReportedStatementDetailsDto vehicleCollisionReportedStatementDetailsDto) {
        String insurerId = vehicleCollisionReportedStatementDetailsDto.getInsurerId();
        b0 b0VarG = c0.g(vehicleCollisionReportedStatementDetailsDto.getInsurerName());
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(vehicleCollisionReportedStatementDetailsDto.getReportAcceptanceDate());
        String fillFormClaimUrl = vehicleCollisionReportedStatementDetailsDto.getFillFormClaimUrl();
        String phoneNumber = vehicleCollisionReportedStatementDetailsDto.getPhoneNumber();
        return new ReportedToUFGStatementDetail(insurerId, b0VarG, offsetDateTime, fillFormClaimUrl, phoneNumber != null ? c0.g(phoneNumber) : null);
    }

    public static final StatementPersonalDetails O(ReadyToSignVehicleCollisionStatementPersonalDataDto readyToSignVehicleCollisionStatementPersonalDataDto) {
        b0 b0VarG = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getPesel());
        b0 b0VarG2 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getFirstName());
        String secondName = readyToSignVehicleCollisionStatementPersonalDataDto.getSecondName();
        b0 b0VarG3 = secondName != null ? c0.g(secondName) : null;
        b0 b0VarG4 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getSurname());
        b0 b0VarG5 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getEmail());
        PhoneNumber phoneNumber = new PhoneNumber(PhoneNumber.c.c(c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getFullPhoneNumber().getPrefix())), PhoneNumber.b.c(c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getFullPhoneNumber().getNumber())), null);
        List<VehicleCollisionParticipantDrivingLicenseDto> listC = readyToSignVehicleCollisionStatementPersonalDataDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(G((VehicleCollisionParticipantDrivingLicenseDto) it.next()));
        }
        b0 b0VarG6 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getCity());
        b0 b0VarG7 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getPostCode());
        b0 b0VarG8 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getStreet());
        b0 b0VarG9 = c0.g(readyToSignVehicleCollisionStatementPersonalDataDto.getHouseNumber());
        String apartmentNumber = readyToSignVehicleCollisionStatementPersonalDataDto.getApartmentNumber();
        return new StatementPersonalDetails(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, phoneNumber, arrayList, b0VarG6, b0VarG7, b0VarG8, b0VarG9, apartmentNumber != null ? c0.g(apartmentNumber) : null);
    }

    public static final StatementPersonalDetails P(VehicleCollisionPersonalDetailsDto vehicleCollisionPersonalDetailsDto) {
        b0 b0VarG = c0.g(vehicleCollisionPersonalDetailsDto.getPesel());
        b0 b0VarG2 = c0.g(vehicleCollisionPersonalDetailsDto.getFirstName());
        String secondName = vehicleCollisionPersonalDetailsDto.getSecondName();
        b0 b0VarG3 = secondName != null ? c0.g(secondName) : null;
        b0 b0VarG4 = c0.g(vehicleCollisionPersonalDetailsDto.getSurname());
        b0 b0VarG5 = c0.g(vehicleCollisionPersonalDetailsDto.getEmail());
        PhoneNumber phoneNumber = new PhoneNumber(PhoneNumber.c.c(c0.g(vehicleCollisionPersonalDetailsDto.getFullPhoneNumber().getPrefix())), PhoneNumber.b.c(c0.g(vehicleCollisionPersonalDetailsDto.getFullPhoneNumber().getNumber())), null);
        List<VehicleCollisionParticipantDrivingLicenseDto> listC = vehicleCollisionPersonalDetailsDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(G((VehicleCollisionParticipantDrivingLicenseDto) it.next()));
        }
        b0 b0VarG6 = c0.g(vehicleCollisionPersonalDetailsDto.getCity());
        b0 b0VarG7 = c0.g(vehicleCollisionPersonalDetailsDto.getPostCode());
        b0 b0VarG8 = c0.g(vehicleCollisionPersonalDetailsDto.getStreet());
        b0 b0VarG9 = c0.g(vehicleCollisionPersonalDetailsDto.getHouseNumber());
        String apartmentNumber = vehicleCollisionPersonalDetailsDto.getApartmentNumber();
        return new StatementPersonalDetails(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, phoneNumber, arrayList, b0VarG6, b0VarG7, b0VarG8, b0VarG9, apartmentNumber != null ? c0.g(apartmentNumber) : null);
    }

    public static final UfgFormReportDetails Q(VehicleCollisionUfgFormReportDetailsResponse vehicleCollisionUfgFormReportDetailsResponse) {
        return new UfgFormReportDetails(vehicleCollisionUfgFormReportDetailsResponse.getFillFormClaimUrl());
    }

    public static final VehicleCollisionDescriptionParticipant R(VehicleCollisionDescriptionParticipantDto vehicleCollisionDescriptionParticipantDto) {
        b0 b0VarG = c0.g(vehicleCollisionDescriptionParticipantDto.getFirstName());
        b0 b0VarG2 = c0.g(vehicleCollisionDescriptionParticipantDto.getSurname());
        String secondName = vehicleCollisionDescriptionParticipantDto.getSecondName();
        return new VehicleCollisionDescriptionParticipant(b0VarG, b0VarG2, secondName != null ? c0.g(secondName) : null);
    }

    public static final Download S(VehicleCollisionFileServiceConfigDto vehicleCollisionFileServiceConfigDto) {
        return new Download(ry.a.b(c0.g(vehicleCollisionFileServiceConfigDto.getFileEncryptionKey())), ry.a.b(c0.g(vehicleCollisionFileServiceConfigDto.getFileSaveDirectoryUrlDomainCertificateBase64())), null);
    }

    public static final VehicleCollisionFileToDownload T(CollisionVehicleImageFileDto collisionVehicleImageFileDto) {
        return new VehicleCollisionFileToDownload(collisionVehicleImageFileDto.getUrl(), t0(collisionVehicleImageFileDto.getFileName()), ry.a.b(c0.g(collisionVehicleImageFileDto.getFileEncryptionIV())), c0.g(collisionVehicleImageFileDto.getAccessToken()), null);
    }

    public static final VehicleCollisionFileToDownload U(VehicleCollisionFileDto vehicleCollisionFileDto) {
        return new VehicleCollisionFileToDownload(vehicleCollisionFileDto.getUrl(), t0(vehicleCollisionFileDto.getFileName()), ry.a.b(c0.g(vehicleCollisionFileDto.getFileEncryptionIV())), c0.g(vehicleCollisionFileDto.getAccessToken()), null);
    }

    public static final s0 V(a3 a3Var) {
        switch (a.f53842c[a3Var.ordinal()]) {
            case 1:
                return s0.InitialInfoConfirmed;
            case 2:
                return s0.InitialInfoRejected;
            case 3:
                return s0.StatementCreatingError;
            case 4:
                return s0.Unknown;
            case 5:
                return s0.Created;
            case 6:
                return s0.Initialized;
            case 7:
                return s0.ReadyToSign;
            case 8:
                return s0.ReadyToSignConfirmed;
            case 9:
                return s0.StatementCreated;
            case 10:
                return s0.InitialInfoConfirmedByMe;
            case 11:
                return s0.StatementFilledByMe;
            case 12:
                return s0.ReadyToSignConfirmedByMe;
            case 13:
                return s0.ReadyToSignRejectedByMe;
            case 14:
                return s0.ReadyToSignRejectedByOther;
            case 15:
                return s0.ReportedToUfg;
            case 16:
                return s0.StatementCreatedNotReported;
            case 17:
                return s0.ReportedToUfgToFillForm;
            case 18:
                return s0.ReportedToUfgFormFilled;
            default:
                throw new p();
        }
    }

    public static final VehicleCompanyOwner W(VehicleCollisionCompanyOwnerDto vehicleCollisionCompanyOwnerDto) {
        b0 b0VarG = c0.g(vehicleCollisionCompanyOwnerDto.getName());
        VehicleCollisionPhoneNumberDataDto phoneNumber = vehicleCollisionCompanyOwnerDto.getPhoneNumber();
        PhoneNumber phoneNumber2 = phoneNumber != null ? new PhoneNumber(PhoneNumber.c.c(c0.g(phoneNumber.getPrefix())), PhoneNumber.b.c(c0.g(phoneNumber.getNumber())), null) : null;
        String email = vehicleCollisionCompanyOwnerDto.getEmail();
        return new VehicleCompanyOwner(b0VarG, phoneNumber2, email != null ? c0.g(email) : null);
    }

    public static final v0 X(o3 o3Var) {
        switch (a.f53848i[o3Var.ordinal()]) {
            case 1:
                return v0.FRONT_DAMAGE;
            case 2:
                return v0.BACK_DAMAGE;
            case 3:
                return v0.LEFT_SIDE_DAMAGE;
            case 4:
                return v0.RIGHT_SIDE_DAMAGE;
            case 5:
                return v0.LEFT_FRONT_DAMAGE;
            case 6:
                return v0.RIGHT_FRONT_DAMAGE;
            case 7:
                return v0.LEFT_BACK_DAMAGE;
            case 8:
                return v0.RIGHT_BACK_DAMAGE;
            case 9:
                return v0.TOP_DAMAGE;
            case 10:
                return v0.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final VehiclePhysicalOwner Y(VehicleCollisionPhysicalOwnerDto vehicleCollisionPhysicalOwnerDto) {
        b0 b0VarG = c0.g(vehicleCollisionPhysicalOwnerDto.getName());
        b0 b0VarG2 = c0.g(vehicleCollisionPhysicalOwnerDto.getSurname());
        VehicleCollisionPhoneNumberDataDto phoneNumber = vehicleCollisionPhysicalOwnerDto.getPhoneNumber();
        PhoneNumber phoneNumber2 = phoneNumber != null ? new PhoneNumber(PhoneNumber.c.c(c0.g(phoneNumber.getPrefix())), PhoneNumber.b.c(c0.g(phoneNumber.getNumber())), null) : null;
        String email = vehicleCollisionPhysicalOwnerDto.getEmail();
        return new VehiclePhysicalOwner(b0VarG, b0VarG2, phoneNumber2, email != null ? c0.g(email) : null);
    }

    public static final CreateVehicleCollisionRequest Z(NewCollision newCollision) {
        boolean z15;
        h3 h3Var;
        int i15 = a.f53840a[newCollision.getDescriptionAuthor().ordinal()];
        if (i15 == 1) {
            z15 = true;
        } else {
            if (i15 != 2) {
                throw new p();
            }
            z15 = false;
        }
        int i16 = a.f53841b[newCollision.getRole().ordinal()];
        if (i16 == 1) {
            h3Var = h3.VICTIM;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            h3Var = h3.PERPETRATOR;
        }
        return new CreateVehicleCollisionRequest(z15, h3Var);
    }

    private static final Coordinates a(VehicleCollisionDescriptionDto vehicleCollisionDescriptionDto) {
        Double dS = r.s(vehicleCollisionDescriptionDto.getLatitude());
        Double dS2 = r.s(vehicleCollisionDescriptionDto.getLongitude());
        if (dS == null || dS2 == null) {
            return null;
        }
        return new Coordinates(dS.doubleValue(), dS2.doubleValue());
    }

    public static final FillCollisionCompanyOwnerDto a0(VehicleCompanyOwner vehicleCompanyOwner) {
        String strE = c0.e(vehicleCompanyOwner.getName());
        PhoneNumber phoneNumber = vehicleCompanyOwner.getPhoneNumber();
        FillVehicleCollisionPhoneNumberDataDto fillVehicleCollisionPhoneNumberDataDto = phoneNumber != null ? new FillVehicleCollisionPhoneNumberDataDto(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null;
        b0 email = vehicleCompanyOwner.getEmail();
        return new FillCollisionCompanyOwnerDto(strE, email != null ? c0.e(email) : null, fillVehicleCollisionPhoneNumberDataDto);
    }

    public static final VehicleCollisionConfirmationCompanyOwnerDataDto b(VehicleCompanyOwner vehicleCompanyOwner) {
        String strE = c0.e(vehicleCompanyOwner.getName());
        PhoneNumber phoneNumber = vehicleCompanyOwner.getPhoneNumber();
        VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto = phoneNumber != null ? new VehicleCollisionConfirmationPhoneNumberDataDto(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null;
        b0 email = vehicleCompanyOwner.getEmail();
        return new VehicleCollisionConfirmationCompanyOwnerDataDto(strE, email != null ? c0.e(email) : null, vehicleCollisionConfirmationPhoneNumberDataDto);
    }

    public static final FillCollisionPhysicalOwnerDto b0(VehiclePhysicalOwner vehiclePhysicalOwner) {
        String strE = c0.e(vehiclePhysicalOwner.getName());
        String strE2 = c0.e(vehiclePhysicalOwner.getSurname());
        PhoneNumber phoneNumber = vehiclePhysicalOwner.getPhoneNumber();
        FillVehicleCollisionPhoneNumberDataDto fillVehicleCollisionPhoneNumberDataDto = phoneNumber != null ? new FillVehicleCollisionPhoneNumberDataDto(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null;
        b0 email = vehiclePhysicalOwner.getEmail();
        return new FillCollisionPhysicalOwnerDto(strE, strE2, email != null ? c0.e(email) : null, fillVehicleCollisionPhoneNumberDataDto);
    }

    public static final VehicleCollisionConfirmationPhysicalOwnerDataDto c(VehiclePhysicalOwner vehiclePhysicalOwner) {
        String strE = c0.e(vehiclePhysicalOwner.getName());
        String strE2 = c0.e(vehiclePhysicalOwner.getSurname());
        PhoneNumber phoneNumber = vehiclePhysicalOwner.getPhoneNumber();
        VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto = phoneNumber != null ? new VehicleCollisionConfirmationPhoneNumberDataDto(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null;
        b0 email = vehiclePhysicalOwner.getEmail();
        return new VehicleCollisionConfirmationPhysicalOwnerDataDto(strE, strE2, email != null ? c0.e(email) : null, vehicleCollisionConfirmationPhoneNumberDataDto);
    }

    public static final FillVehicleCollisionDescriptionRequest c0(NewVehicleCollisionDescription newVehicleCollisionDescription, ez.c cVar) {
        return new FillVehicleCollisionDescriptionRequest(cVar.j(newVehicleCollisionDescription.getDate()).getDate(), c0.e(newVehicleCollisionDescription.getCollisionDescription()), String.valueOf(newVehicleCollisionDescription.getCoordinates().getLatitude()), String.valueOf(newVehicleCollisionDescription.getCoordinates().getLongitude()), c0.e(newVehicleCollisionDescription.getLocalizationDescription()));
    }

    public static final dx.i<dx.b, List<BEVehicleData>> d(CollisionParticipantVehiclesByKindDto collisionParticipantVehiclesByKindDto) {
        Object objB;
        List listN;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<CollisionParticipantVehicleDataDto> listB = collisionParticipantVehiclesByKindDto.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    for (CollisionParticipantVehicleDataDto collisionParticipantVehicleDataDto : listB) {
                        String kind = collisionParticipantVehiclesByKindDto.getKind();
                        b0 b0VarG = c0.g(collisionParticipantVehicleDataDto.getRegistrationNumber());
                        b0 b0VarG2 = c0.g(collisionParticipantVehicleDataDto.getVin());
                        String productionYear = collisionParticipantVehicleDataDto.getProductionYear();
                        String brand = collisionParticipantVehicleDataDto.getBrand();
                        String model = collisionParticipantVehicleDataDto.getModel();
                        String vehicleSignature = collisionParticipantVehicleDataDto.getVehicleSignature();
                        List<CollisionVehicleInsuranceDataDto> listF = collisionParticipantVehicleDataDto.f();
                        if (listF != null) {
                            List<CollisionVehicleInsuranceDataDto> list = listF;
                            listN = new ArrayList(v.y(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                listN.add(u0((CollisionVehicleInsuranceDataDto) it.next()));
                            }
                        } else {
                            listN = v.n();
                        }
                        arrayList.add(new BEVehicleData(kind, b0VarG, b0VarG2, brand, model, vehicleSignature, productionYear, listN, false, (m0) aVar.a(o(collisionParticipantVehicleDataDto.getVehicleCardOwnershipType()))));
                    }
                    return new dx.i.Right(arrayList);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final FillVehicleCollisionParticipantImageDto d0(VehicleCollisionUploadedFile vehicleCollisionUploadedFile) {
        return new FillVehicleCollisionParticipantImageDto(c0.e(vehicleCollisionUploadedFile.getEncryptionIV()), vehicleCollisionUploadedFile.getFileName().a());
    }

    public static final dx.i<dx.b, sv0.f> e(GetCollisionParticipantVehiclesResponse getCollisionParticipantVehiclesResponse, String str) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String pageId = getCollisionParticipantVehiclesResponse.getPageId();
                    List<CollisionParticipantVehiclesByKindDto> listB = getCollisionParticipantVehiclesResponse.b();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        v.D(arrayList, (Iterable) aVar.a(d((CollisionParticipantVehiclesByKindDto) it.next())));
                    }
                    return new dx.i.Right(new sv0.f(str, pageId, arrayList));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final FillVehicleCollisionParticipantStatementPersonalDataDto e0(StatementPersonalData statementPersonalData) {
        FillVehicleCollisionPhoneNumberDataDto fillVehicleCollisionPhoneNumberDataDto = new FillVehicleCollisionPhoneNumberDataDto(c0.e(statementPersonalData.getPhoneNumber().g()), c0.e(statementPersonalData.getPhoneNumber().h()));
        String strE = c0.e(statementPersonalData.getEmail());
        String strE2 = c0.e(statementPersonalData.getPostCode());
        String strE3 = c0.e(statementPersonalData.getCity());
        String strE4 = c0.e(statementPersonalData.getStreet());
        String strE5 = c0.e(statementPersonalData.getHouseNumber());
        b0 apartmentNumber = statementPersonalData.getApartmentNumber();
        return new FillVehicleCollisionParticipantStatementPersonalDataDto(strE3, strE, fillVehicleCollisionPhoneNumberDataDto, strE5, strE2, strE4, apartmentNumber != null ? c0.e(apartmentNumber) : null);
    }

    public static final dx.i<dx.b, BEVehicleData> f(GetCollisionVehicleResponse getCollisionVehicleResponse) {
        Object objB;
        List listN;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String kind = getCollisionVehicleResponse.getKind();
                    b0 b0VarG = c0.g(getCollisionVehicleResponse.getRegistrationNumber());
                    b0 b0VarG2 = c0.g(getCollisionVehicleResponse.getVin());
                    String productionYear = getCollisionVehicleResponse.getProductionYear();
                    String brand = getCollisionVehicleResponse.getBrand();
                    String model = getCollisionVehicleResponse.getModel();
                    String vehicleSignature = getCollisionVehicleResponse.getVehicleSignature();
                    List<CollisionVehicleInsuranceDataDto> listG = getCollisionVehicleResponse.g();
                    if (listG != null) {
                        List<CollisionVehicleInsuranceDataDto> list = listG;
                        listN = new ArrayList(v.y(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            listN.add(u0((CollisionVehicleInsuranceDataDto) it.next()));
                        }
                    } else {
                        listN = v.n();
                    }
                    return new dx.i.Right(new BEVehicleData(kind, b0VarG, b0VarG2, brand, model, vehicleSignature, productionYear, listN, true, (m0) aVar.a(o(getCollisionVehicleResponse.getVehicleCardOwnershipType()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final FillVehicleCollisionParticipantStatementVehicleDataDto f0(StatementVehicleData statementVehicleData) {
        String strE = c0.e(statementVehicleData.getVehicleData().getVin());
        String strE2 = c0.e(statementVehicleData.getVehicleData().getRegistrationNumber());
        String kind = statementVehicleData.getVehicleData().getKind();
        String brand = statementVehicleData.getVehicleData().getBrand();
        String model = statementVehicleData.getVehicleData().getModel();
        String productionYear = statementVehicleData.getVehicleData().getProductionYear();
        String vehicleSignature = statementVehicleData.getVehicleData().getVehicleSignature();
        a2 a2VarI0 = i0(statementVehicleData.getVehicleData().getVehicleCardOwnershipType());
        List<v0> listB = statementVehicleData.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(p0((v0) it.next()));
        }
        List<Insurance> listC = statementVehicleData.c();
        ArrayList arrayList2 = new ArrayList(v.y(listC, 10));
        Iterator<T> it4 = listC.iterator();
        while (true) {
            String strE3 = null;
            if (!it4.hasNext()) {
                break;
            }
            Insurance insurance = (Insurance) it4.next();
            String insurerId = insurance.getInsurerId();
            b0 insuranceNumber = insurance.getInsuranceNumber();
            if (insuranceNumber != null) {
                strE3 = c0.e(insuranceNumber);
            }
            arrayList2.add(new FillVehicleCollisionParticipantStatementInsuranceDataDto(insurance.getInsuranceAddedManually(), insurerId, insurance.getInsurerName(), strE3));
        }
        List<VehiclePhysicalOwner> listD = statementVehicleData.d();
        ArrayList arrayList3 = new ArrayList(v.y(listD, 10));
        Iterator<T> it5 = listD.iterator();
        while (it5.hasNext()) {
            arrayList3.add(b0((VehiclePhysicalOwner) it5.next()));
        }
        VehicleCompanyOwner companyOwner = statementVehicleData.getCompanyOwner();
        FillCollisionCompanyOwnerDto fillCollisionCompanyOwnerDtoA0 = companyOwner != null ? a0(companyOwner) : null;
        List<StatementVehicleData.StatementImage> listE = statementVehicleData.e();
        ArrayList arrayList4 = new ArrayList(v.y(listE, 10));
        for (Iterator it6 = listE.iterator(); it6.hasNext(); it6 = it6) {
            StatementVehicleData.StatementImage statementImage = (StatementVehicleData.StatementImage) it6.next();
            arrayList4.add(new FillVehicleCollisionParticipantImageWithThumbnailDto(d0(statementImage.getOriginal()), d0(statementImage.getThumbnail())));
        }
        return new FillVehicleCollisionParticipantStatementVehicleDataDto(brand, a2VarI0, arrayList, kind, model, productionYear, strE2, vehicleSignature, strE, fillCollisionCompanyOwnerDtoA0, null, arrayList4, arrayList2, arrayList3, 1024, null);
    }

    public static final dx.i<dx.b, sv0.c0.ReadyToSign> g(GetReadyToSignVehicleCollisionStatementDataResponse getReadyToSignVehicleCollisionStatementDataResponse, ProcessId processId) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    b0 b0VarG = c0.g(getReadyToSignVehicleCollisionStatementDataResponse.getCollisionDescription());
                    String localizationDescription = getReadyToSignVehicleCollisionStatementDataResponse.getLocalizationDescription();
                    Double dS = r.s(getReadyToSignVehicleCollisionStatementDataResponse.getLongitude());
                    double dDoubleValue = dS != null ? dS.doubleValue() : 0.0d;
                    Double dS2 = r.s(getReadyToSignVehicleCollisionStatementDataResponse.getLatitude());
                    return new dx.i.Right(new sv0.c0.ReadyToSign(processId, new CollisionCircumstances(b0VarG, localizationDescription, new Coordinates(dS2 != null ? dS2.doubleValue() : 0.0d, dDoubleValue), new fz.b.OffsetDateTime(getReadyToSignVehicleCollisionStatementDataResponse.getCollisionDate())), (StatementParticipantDetails) aVar.a(i(getReadyToSignVehicleCollisionStatementDataResponse.getPerpetrator())), (StatementParticipantDetails) aVar.a(i(getReadyToSignVehicleCollisionStatementDataResponse.getVictim())), null, S(getReadyToSignVehicleCollisionStatementDataResponse.getFileServiceConfig())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final JoinVehicleCollisionRequest g0(t tVar) {
        h3 h3Var;
        String code = tVar.getCode();
        int i15 = a.f53841b[tVar.getRole().ordinal()];
        if (i15 == 1) {
            h3Var = h3.VICTIM;
        } else {
            if (i15 != 2) {
                throw new p();
            }
            h3Var = h3.PERPETRATOR;
        }
        return new JoinVehicleCollisionRequest(code, h3Var);
    }

    public static final dx.i<dx.b, h0> h(GetVehicleCollisionInitialDataConfirmedResponse getVehicleCollisionInitialDataConfirmedResponse) {
        dx.i<dx.b.Generic, a0> iVarV0;
        switch (a.f53842c[getVehicleCollisionInitialDataConfirmedResponse.getStatus().ordinal()]) {
            case 1:
                return new dx.i.Right(h0.a.f184540a);
            case 2:
                w2 rejectionReason = getVehicleCollisionInitialDataConfirmedResponse.getRejectionReason();
                if (rejectionReason == null || (iVarV0 = v0(rejectionReason)) == null) {
                    return new dx.i.Left(new dx.b.Parsing(new IllegalArgumentException("cannot parse")));
                }
                if (iVarV0 instanceof dx.i.Left) {
                    return iVarV0;
                }
                if (iVarV0 instanceof dx.i.Right) {
                    return new dx.i.Right(new h0.Rejected((a0) ((dx.i.Right) iVarV0).b()));
                }
                throw new p();
            case 3:
            case 4:
                return new dx.i.Left(new dx.b.Parsing(new IllegalArgumentException("Cannot parse UNKNOWN to toDomain")));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return new dx.i.Left(new dx.b.Parsing(new IllegalArgumentException("cannot parse")));
            default:
                throw new p();
        }
    }

    public static final ReportVehicleCollisionToInsurerRequest h0(AutomaticReportRequest automaticReportRequest) {
        return new ReportVehicleCollisionToInsurerRequest(automaticReportRequest.getInsurerId());
    }

    public static final dx.i<dx.b, StatementParticipantDetails> i(ReadyToSignVehicleCollisionStatementParticipantDataDto readyToSignVehicleCollisionStatementParticipantDataDto) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new StatementParticipantDetails(O(readyToSignVehicleCollisionStatementParticipantDataDto.getPersonalData()), (StatementVehicleDetails) new ex.a().a(j(readyToSignVehicleCollisionStatementParticipantDataDto.getVehicleData()))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private static final a2 i0(m0 m0Var) {
        int i15 = a.f53845f[m0Var.ordinal()];
        if (i15 == 1) {
            return a2.OWNER;
        }
        if (i15 == 2) {
            return a2.CO_OWNER;
        }
        if (i15 == 3) {
            return a2.NONE;
        }
        throw new p();
    }

    public static final dx.i<dx.b, StatementVehicleDetails> j(ReadyToSignVehicleCollisionStatementVehicleDataDto readyToSignVehicleCollisionStatementVehicleDataDto) {
        Object objB;
        List listN;
        List listN2;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    b0 b0VarG = c0.g(readyToSignVehicleCollisionStatementVehicleDataDto.getRegistrationNumber());
                    b0 b0VarG2 = c0.g(readyToSignVehicleCollisionStatementVehicleDataDto.getVinNumber());
                    String productionYear = readyToSignVehicleCollisionStatementVehicleDataDto.getProductionYear();
                    String kind = readyToSignVehicleCollisionStatementVehicleDataDto.getKind();
                    String brand = readyToSignVehicleCollisionStatementVehicleDataDto.getBrand();
                    String model = readyToSignVehicleCollisionStatementVehicleDataDto.getModel();
                    m0 m0Var = (m0) aVar.a(o(readyToSignVehicleCollisionStatementVehicleDataDto.getCardOwnershipType()));
                    List<o3> listD = readyToSignVehicleCollisionStatementVehicleDataDto.d();
                    ArrayList arrayList = new ArrayList(v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(X((o3) it.next()));
                    }
                    List<ReadyToSignVehicleCollisionStatementInsuranceDataDto> listF = readyToSignVehicleCollisionStatementVehicleDataDto.f();
                    if (listF != null) {
                        List<ReadyToSignVehicleCollisionStatementInsuranceDataDto> list = listF;
                        listN = new ArrayList(v.y(list, 10));
                        Iterator<T> it4 = list.iterator();
                        while (it4.hasNext()) {
                            listN.add(I((ReadyToSignVehicleCollisionStatementInsuranceDataDto) it4.next()));
                        }
                    } else {
                        listN = v.n();
                    }
                    List list2 = listN;
                    VehicleCollisionCompanyOwnerDto companyOwner = readyToSignVehicleCollisionStatementVehicleDataDto.getCompanyOwner();
                    VehicleCompanyOwner vehicleCompanyOwnerW = companyOwner != null ? W(companyOwner) : null;
                    List<VehicleCollisionPhysicalOwnerDto> listI = readyToSignVehicleCollisionStatementVehicleDataDto.i();
                    if (listI != null) {
                        List<VehicleCollisionPhysicalOwnerDto> list3 = listI;
                        listN2 = new ArrayList(v.y(list3, 10));
                        Iterator<T> it5 = list3.iterator();
                        while (it5.hasNext()) {
                            listN2.add(Y((VehicleCollisionPhysicalOwnerDto) it5.next()));
                        }
                    } else {
                        listN2 = v.n();
                    }
                    return new dx.i.Right(new StatementVehicleDetails(b0VarG, b0VarG2, productionYear, kind, brand, model, m0Var, arrayList, list2, vehicleCompanyOwnerW, listN2, y(readyToSignVehicleCollisionStatementVehicleDataDto.e())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final VehicleCollisionConfirmationImageDataDto j0(VehicleCollisionFileToDownload vehicleCollisionFileToDownload) {
        return new VehicleCollisionConfirmationImageDataDto(c0.e(vehicleCollisionFileToDownload.getFileEncryptionIV()), vehicleCollisionFileToDownload.getFileName().a());
    }

    public static final dx.i<dx.b, sv0.g.Started> k(StartedUserVehicleCollisionDataDto startedUserVehicleCollisionDataDto) {
        Object objB;
        o oVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    ProcessId processId = new ProcessId(startedUserVehicleCollisionDataDto.getProcessId());
                    s0 s0VarV = V(startedUserVehicleCollisionDataDto.getCollisionStatus());
                    boolean descriptionAuthor = startedUserVehicleCollisionDataDto.getDescriptionAuthor();
                    if (descriptionAuthor) {
                        oVar = o.ME;
                    } else {
                        if (descriptionAuthor) {
                            throw new p();
                        }
                        oVar = o.OTHER;
                    }
                    return new dx.i.Right(new sv0.g.Started(processId, s0VarV, oVar, startedUserVehicleCollisionDataDto.getWorkingCopyValidityDaysLeft()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final VehicleCollisionConfirmationStatementDto k0(sv0.c0 c0Var) {
        String localizationDescription = c0Var.getCollisionCircumstances().getLocalizationDescription();
        String strValueOf = String.valueOf(c0Var.getCollisionCircumstances().getCoordinates().getLongitude());
        return new VehicleCollisionConfirmationStatementDto(c0Var.getCollisionCircumstances().getDate().getDate(), c0.e(c0Var.getCollisionCircumstances().getCollisionDescription()), String.valueOf(c0Var.getCollisionCircumstances().getCoordinates().getLatitude()), localizationDescription, strValueOf, m0(c0Var.getPerpetrator()), m0(c0Var.getVictim()));
    }

    public static final dx.i<dx.b, k0> l(SubscribeVehicleCollisionStatementReadyResponse subscribeVehicleCollisionStatementReadyResponse) {
        Object objB;
        Object success;
        dx.i<dx.b, StatementReady> iVarU;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f53843d[subscribeVehicleCollisionStatementReadyResponse.getStatus().ordinal()];
                    if (i15 == 1) {
                        VehicleCollisionSubscriptionReadyStatementDto statement = subscribeVehicleCollisionStatementReadyResponse.getStatement();
                        StatementReady statementReady = (statement == null || (iVarU = u(statement)) == null) ? null : (StatementReady) aVar.a(iVarU);
                        if (statementReady == null) {
                            aVar.b(new dx.b.Generic(new IllegalStateException("If status is SUCCESS then statement has to exist")));
                            throw new oq.g();
                        }
                        success = new k0.Success(statementReady);
                    } else if (i15 == 2) {
                        success = k0.b.f184582a;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(new IllegalStateException("can not parse status: " + subscribeVehicleCollisionStatementReadyResponse.getStatus())));
                            throw new oq.g();
                        }
                        VehicleCollisionSubscriptionErrorDto errorMessage = subscribeVehicleCollisionStatementReadyResponse.getErrorMessage();
                        if (errorMessage == null) {
                            aVar.b(new dx.b.Generic(new IllegalStateException("If status is TERMINAL_GLOBAL_ERROR then error has to exist")));
                            throw new oq.g();
                        }
                        success = new k0.Error(errorMessage.getTitle(), errorMessage.getMessage());
                    }
                    return new dx.i.Right(success);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final VehicleCollisionConfirmationStatementInsuranceDataDto l0(Insurance insurance) {
        boolean insuranceAddedManually = insurance.getInsuranceAddedManually();
        String insurerId = insurance.getInsurerId();
        b0 insuranceNumber = insurance.getInsuranceNumber();
        return new VehicleCollisionConfirmationStatementInsuranceDataDto(insuranceAddedManually, insurerId, insuranceNumber != null ? c0.e(insuranceNumber) : null);
    }

    public static final dx.i<dx.b, m.First> m(UserVehicleCollisionsFirstPageResponse userVehicleCollisionsFirstPageResponse) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String nextPageId = userVehicleCollisionsFirstPageResponse.getNextPageId();
                    List<StartedUserVehicleCollisionDataDto> listD = userVehicleCollisionsFirstPageResponse.d();
                    ArrayList arrayList = new ArrayList(v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add((sv0.g.Started) aVar.a(k((StartedUserVehicleCollisionDataDto) it.next())));
                    }
                    return new dx.i.Right(new m.First(nextPageId, arrayList, (List) aVar.a(w(userVehicleCollisionsFirstPageResponse.a())), userVehicleCollisionsFirstPageResponse.getNewStatementEnabled(), userVehicleCollisionsFirstPageResponse.getWorkingCopyValidityDays()));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final VehicleCollisionConfirmationStatementParticipantDataDto m0(StatementParticipantDetails statementParticipantDetails) {
        return new VehicleCollisionConfirmationStatementParticipantDataDto(n0(statementParticipantDetails.getPersonalData()), o0(statementParticipantDetails.getVehicleData()));
    }

    public static final dx.i<dx.b, m.Next> n(UserVehicleCollisionsNextPageResponse userVehicleCollisionsNextPageResponse, String str) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String nextPageId = userVehicleCollisionsNextPageResponse.getNextPageId();
                    List<StartedUserVehicleCollisionDataDto> listC = userVehicleCollisionsNextPageResponse.c();
                    ArrayList arrayList = new ArrayList(v.y(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add((sv0.g.Started) aVar.a(k((StartedUserVehicleCollisionDataDto) it.next())));
                    }
                    return new dx.i.Right(new m.Next(str, nextPageId, arrayList, (List) aVar.a(w(userVehicleCollisionsNextPageResponse.a()))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final VehicleCollisionConfirmationStatementPersonalDataDto n0(StatementPersonalDetails statementPersonalDetails) {
        String strE = c0.e(statementPersonalDetails.getPesel());
        String strE2 = c0.e(statementPersonalDetails.getEmail());
        VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto = new VehicleCollisionConfirmationPhoneNumberDataDto(c0.e(statementPersonalDetails.getPhoneNumber().g()), c0.e(statementPersonalDetails.getPhoneNumber().h()));
        String strE3 = c0.e(statementPersonalDetails.getCity());
        String strE4 = c0.e(statementPersonalDetails.getPostCode());
        String strE5 = c0.e(statementPersonalDetails.getStreet());
        String strE6 = c0.e(statementPersonalDetails.getHouseNumber());
        b0 apartmentNumber = statementPersonalDetails.getApartmentNumber();
        String strE7 = apartmentNumber != null ? c0.e(apartmentNumber) : null;
        List<DrivingLicence> listD = statementPersonalDetails.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new VehicleCollisionConfirmationParticipantDrivingLicenseDto(((DrivingLicence) it.next()).getCategory()));
        }
        return new VehicleCollisionConfirmationStatementPersonalDataDto(strE3, arrayList, strE2, vehicleCollisionConfirmationPhoneNumberDataDto, strE6, strE, strE4, strE5, strE7);
    }

    public static final dx.i<dx.b, m0> o(a2 a2Var) {
        Object objB;
        m0 m0Var;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f53846g[a2Var.ordinal()];
                    if (i15 == 1) {
                        m0Var = m0.OWNER;
                    } else if (i15 == 2) {
                        m0Var = m0.CO_OWNER;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(new Exception("UNKNOWN is not support")));
                            throw new oq.g();
                        }
                        m0Var = m0.NONE;
                    }
                    return new dx.i.Right(m0Var);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final VehicleCollisionConfirmationStatementVehicleDataDto o0(StatementVehicleDetails statementVehicleDetails) {
        String strE = c0.e(statementVehicleDetails.getRegistrationNumber());
        String strE2 = c0.e(statementVehicleDetails.getVinNumber());
        String productionYear = statementVehicleDetails.getProductionYear();
        String kind = statementVehicleDetails.getKind();
        String brand = statementVehicleDetails.getBrand();
        String model = statementVehicleDetails.getModel();
        a2 a2VarI0 = i0(statementVehicleDetails.getCardOwnershipType());
        List<v0> listD = statementVehicleDetails.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(p0((v0) it.next()));
        }
        List<Insurance> listG = statementVehicleDetails.g();
        ArrayList arrayList2 = new ArrayList(v.y(listG, 10));
        Iterator<T> it4 = listG.iterator();
        while (it4.hasNext()) {
            arrayList2.add(l0((Insurance) it4.next()));
        }
        VehicleCompanyOwner companyOwner = statementVehicleDetails.getCompanyOwner();
        VehicleCollisionConfirmationCompanyOwnerDataDto vehicleCollisionConfirmationCompanyOwnerDataDtoB = companyOwner != null ? b(companyOwner) : null;
        List<VehiclePhysicalOwner> listJ = statementVehicleDetails.j();
        ArrayList arrayList3 = new ArrayList(v.y(listJ, 10));
        Iterator<T> it5 = listJ.iterator();
        while (it5.hasNext()) {
            arrayList3.add(c((VehiclePhysicalOwner) it5.next()));
        }
        List<StatementVehicleDetails.Image> listF = statementVehicleDetails.f();
        return new VehicleCollisionConfirmationStatementVehicleDataDto(brand, a2VarI0, arrayList, kind, model, productionYear, strE, strE2, vehicleCollisionConfirmationCompanyOwnerDataDtoB, null, listF != null ? r0(listF) : null, arrayList2, arrayList3, 512, null);
    }

    public static final dx.i<dx.b, sv0.c0.b.Finished> p(VehicleCollisionFinishedDetailsResponse vehicleCollisionFinishedDetailsResponse, ProcessId processId) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right(new sv0.c0.b.Finished(processId, C(vehicleCollisionFinishedDetailsResponse.getCircumstances()), (StatementParticipantDetails) aVar.a(q(vehicleCollisionFinishedDetailsResponse.getPerpetrator())), (StatementParticipantDetails) aVar.a(q(vehicleCollisionFinishedDetailsResponse.getVictim())), (l) aVar.a(t(vehicleCollisionFinishedDetailsResponse.getCircumstances().getUserInRole())), S(vehicleCollisionFinishedDetailsResponse.getFileServiceConfig()), vehicleCollisionFinishedDetailsResponse.getStatementNumber(), vehicleCollisionFinishedDetailsResponse.getPdfStatementFile() != null ? new PdfFile(new Download(ry.a.b(c0.g(vehicleCollisionFinishedDetailsResponse.getFileServiceConfig().getFileEncryptionKey())), ry.a.b(c0.g(vehicleCollisionFinishedDetailsResponse.getFileServiceConfig().getFileSaveDirectoryUrlDomainCertificateBase64())), null), new VehicleCollisionFileToDownload(vehicleCollisionFinishedDetailsResponse.getPdfStatementFile().getUrl(), t0(vehicleCollisionFinishedDetailsResponse.getPdfStatementFile().getFileName()), ry.a.b(c0.g(vehicleCollisionFinishedDetailsResponse.getPdfStatementFile().getFileEncryptionIV())), c0.g(vehicleCollisionFinishedDetailsResponse.getPdfStatementFile().getAccessToken()), null)) : null, vehicleCollisionFinishedDetailsResponse.getRegenerateStatement()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private static final o3 p0(v0 v0Var) {
        switch (a.f53847h[v0Var.ordinal()]) {
            case 1:
                return o3.FRONT_DAMAGE;
            case 2:
                return o3.BACK_DAMAGE;
            case 3:
                return o3.TOP_DAMAGE;
            case 4:
                return o3.LEFT_FRONT_DAMAGE;
            case 5:
                return o3.RIGHT_FRONT_DAMAGE;
            case 6:
                return o3.LEFT_SIDE_DAMAGE;
            case 7:
                return o3.RIGHT_SIDE_DAMAGE;
            case 8:
                return o3.LEFT_BACK_DAMAGE;
            case 9:
                return o3.RIGHT_BACK_DAMAGE;
            case 10:
                return o3.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final dx.i<dx.b, StatementParticipantDetails> q(VehicleCollisionParticipantDetailsDto vehicleCollisionParticipantDetailsDto) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new StatementParticipantDetails(P(vehicleCollisionParticipantDetailsDto.getPersonalData()), (StatementVehicleDetails) new ex.a().a(v(vehicleCollisionParticipantDetailsDto.getVehicleData()))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final String q0(a0 a0Var) {
        int i15 = a.f53849j[a0Var.ordinal()];
        if (i15 == 1) {
            return w2.IDENTITY_REJECTION.getValue();
        }
        if (i15 == 2) {
            return w2.DESCRIPTION_REJECTION.getValue();
        }
        throw new p();
    }

    public static final dx.i<dx.b, sv0.c0.b.RegeneratedStatement> r(VehicleCollisionRegeneratedStatementDetailsResponse vehicleCollisionRegeneratedStatementDetailsResponse, ProcessId processId) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right(new sv0.c0.b.RegeneratedStatement(processId, C(vehicleCollisionRegeneratedStatementDetailsResponse.getCircumstances()), (StatementParticipantDetails) aVar.a(q(vehicleCollisionRegeneratedStatementDetailsResponse.getPerpetrator())), (StatementParticipantDetails) aVar.a(q(vehicleCollisionRegeneratedStatementDetailsResponse.getVictim())), (l) aVar.a(t(vehicleCollisionRegeneratedStatementDetailsResponse.getCircumstances().getUserInRole())), S(vehicleCollisionRegeneratedStatementDetailsResponse.getFileServiceConfig()), vehicleCollisionRegeneratedStatementDetailsResponse.getStatementNumber(), new PdfFile(new Download(ry.a.b(c0.g(vehicleCollisionRegeneratedStatementDetailsResponse.getFileServiceConfig().getFileEncryptionKey())), ry.a.b(c0.g(vehicleCollisionRegeneratedStatementDetailsResponse.getFileServiceConfig().getFileSaveDirectoryUrlDomainCertificateBase64())), null), new VehicleCollisionFileToDownload(vehicleCollisionRegeneratedStatementDetailsResponse.getPdfStatementFile().getUrl(), t0(vehicleCollisionRegeneratedStatementDetailsResponse.getPdfStatementFile().getFileName()), ry.a.b(c0.g(vehicleCollisionRegeneratedStatementDetailsResponse.getPdfStatementFile().getFileEncryptionIV())), c0.g(vehicleCollisionRegeneratedStatementDetailsResponse.getPdfStatementFile().getAccessToken()), null))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final List<VehicleCollisionConfirmationImageWithThumbnailDataDto> r0(List<StatementVehicleDetails.Image> list) {
        List<StatementVehicleDetails.Image> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (StatementVehicleDetails.Image image : list2) {
            arrayList.add(new VehicleCollisionConfirmationImageWithThumbnailDataDto(j0(image.getOriginal()), j0(image.getThumbnail())));
        }
        return arrayList;
    }

    public static final dx.i<dx.b, sv0.c0.b.ReportedToUfo> s(VehicleCollisionReportedToUfgDetailsResponse vehicleCollisionReportedToUfgDetailsResponse, ProcessId processId) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right(new sv0.c0.b.ReportedToUfo(processId, C(vehicleCollisionReportedToUfgDetailsResponse.getCircumstances()), (StatementParticipantDetails) aVar.a(q(vehicleCollisionReportedToUfgDetailsResponse.getPerpetrator())), (StatementParticipantDetails) aVar.a(q(vehicleCollisionReportedToUfgDetailsResponse.getVictim())), l.VICTIM, S(vehicleCollisionReportedToUfgDetailsResponse.getFileServiceConfig()), vehicleCollisionReportedToUfgDetailsResponse.getStatementNumber(), new PdfFile(S(vehicleCollisionReportedToUfgDetailsResponse.getFileServiceConfig()), U(vehicleCollisionReportedToUfgDetailsResponse.getPdfStatementFile())), N(vehicleCollisionReportedToUfgDetailsResponse.getReportedStatement()), V(vehicleCollisionReportedToUfgDetailsResponse.getCollisionStatus())));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final String s0(List<String> list) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append((String) obj);
            if (list.size() - 1 != i15) {
                sb5.append(",");
            }
            i15 = i16;
        }
        return sb5.toString();
    }

    public static final dx.i<dx.b, l> t(h3 h3Var) {
        Object objB;
        l lVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f53844e[h3Var.ordinal()];
                    if (i15 == 1) {
                        lVar = l.PERPETRATOR;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(new IllegalStateException("userInRole is UNKNOWN")));
                            throw new oq.g();
                        }
                        lVar = l.VICTIM;
                    }
                    return new dx.i.Right(lVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final VehicleCollisionFileName t0(String str) {
        List listV0 = r.V0(str, new String[]{"."}, false, 0, 6, null);
        String str2 = (String) v.o0(listV0, 0);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) v.o0(listV0, 1);
        return new VehicleCollisionFileName(str2, str3 != null ? str3 : "");
    }

    public static final dx.i<dx.b, StatementReady> u(VehicleCollisionSubscriptionReadyStatementDto vehicleCollisionSubscriptionReadyStatementDto) {
        Object objB;
        l lVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    boolean regenerateStatement = vehicleCollisionSubscriptionReadyStatementDto.getRegenerateStatement();
                    s0 s0VarV = V(vehicleCollisionSubscriptionReadyStatementDto.getStatus());
                    int i15 = a.f53844e[vehicleCollisionSubscriptionReadyStatementDto.getUserInRole().ordinal()];
                    if (i15 == 1) {
                        lVar = l.PERPETRATOR;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            throw new IllegalArgumentException("Cannot parse UNKNOWN to toDomain");
                        }
                        lVar = l.VICTIM;
                    }
                    l lVar2 = lVar;
                    PdfFile pdfFile = null;
                    if (vehicleCollisionSubscriptionReadyStatementDto.getPdfStatementFile() != null && vehicleCollisionSubscriptionReadyStatementDto.getFileServiceConfig() != null) {
                        pdfFile = new PdfFile(new Download(ry.a.b(c0.g(vehicleCollisionSubscriptionReadyStatementDto.getFileServiceConfig().getFileEncryptionKey())), ry.a.b(c0.g(vehicleCollisionSubscriptionReadyStatementDto.getFileServiceConfig().getFileSaveDirectoryUrlDomainCertificateBase64())), null), new VehicleCollisionFileToDownload(vehicleCollisionSubscriptionReadyStatementDto.getPdfStatementFile().getUrl(), t0(vehicleCollisionSubscriptionReadyStatementDto.getPdfStatementFile().getFileName()), ry.a.b(c0.g(vehicleCollisionSubscriptionReadyStatementDto.getPdfStatementFile().getFileEncryptionIV())), c0.g(vehicleCollisionSubscriptionReadyStatementDto.getPdfStatementFile().getAccessToken()), null));
                    }
                    return new dx.i.Right(new StatementReady(regenerateStatement, s0VarV, lVar2, pdfFile, vehicleCollisionSubscriptionReadyStatementDto.getStatementNumber()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final Insurance u0(CollisionVehicleInsuranceDataDto collisionVehicleInsuranceDataDto) {
        return new Insurance(collisionVehicleInsuranceDataDto.getInsurerId(), collisionVehicleInsuranceDataDto.getInsurerName(), c0.g(collisionVehicleInsuranceDataDto.getInsuranceNumber()), false);
    }

    public static final dx.i<dx.b, StatementVehicleDetails> v(VehicleCollisionVehicleDetailsDto vehicleCollisionVehicleDetailsDto) {
        Object objB;
        List listN;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    b0 b0VarG = c0.g(vehicleCollisionVehicleDetailsDto.getRegistrationNumber());
                    b0 b0VarG2 = c0.g(vehicleCollisionVehicleDetailsDto.getVinNumber());
                    String productionYear = vehicleCollisionVehicleDetailsDto.getProductionYear();
                    String kind = vehicleCollisionVehicleDetailsDto.getKind();
                    String brand = vehicleCollisionVehicleDetailsDto.getBrand();
                    String model = vehicleCollisionVehicleDetailsDto.getModel();
                    m0 m0Var = (m0) aVar.a(o(vehicleCollisionVehicleDetailsDto.getCardOwnershipType()));
                    List<o3> listD = vehicleCollisionVehicleDetailsDto.d();
                    ArrayList arrayList = new ArrayList(v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(X((o3) it.next()));
                    }
                    List<VehicleCollisionCreatedStatementInsuranceDataDto> listF = vehicleCollisionVehicleDetailsDto.f();
                    ArrayList arrayList2 = new ArrayList(v.y(listF, 10));
                    Iterator<T> it4 = listF.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(J((VehicleCollisionCreatedStatementInsuranceDataDto) it4.next()));
                    }
                    VehicleCollisionCompanyOwnerDto companyOwner = vehicleCollisionVehicleDetailsDto.getCompanyOwner();
                    VehicleCompanyOwner vehicleCompanyOwnerW = companyOwner != null ? W(companyOwner) : null;
                    List<VehicleCollisionPhysicalOwnerDto> listI = vehicleCollisionVehicleDetailsDto.i();
                    if (listI != null) {
                        List<VehicleCollisionPhysicalOwnerDto> list = listI;
                        listN = new ArrayList(v.y(list, 10));
                        Iterator<T> it5 = list.iterator();
                        while (it5.hasNext()) {
                            listN.add(Y((VehicleCollisionPhysicalOwnerDto) it5.next()));
                        }
                    } else {
                        listN = v.n();
                    }
                    return new dx.i.Right(new StatementVehicleDetails(b0VarG, b0VarG2, productionYear, kind, brand, model, m0Var, arrayList, arrayList2, vehicleCompanyOwnerW, listN, y(vehicleCollisionVehicleDetailsDto.e())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b.Generic, a0> v0(w2 w2Var) {
        int i15 = a.f53850k[w2Var.ordinal()];
        if (i15 == 1) {
            return new dx.i.Right(a0.IDENTITY_REJECTION);
        }
        if (i15 == 2) {
            return new dx.i.Right(a0.DESCRIPTION_REJECTION);
        }
        return new dx.i.Left(new dx.b.Generic(new Exception(w2Var + " is not supported")));
    }

    public static final dx.i<dx.b, List<CollisionGroup>> w(List<GroupedUserVehicleCollisionsDto> list) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    List<GroupedUserVehicleCollisionsDto> list2 = list;
                    int i15 = 10;
                    ArrayList arrayList = new ArrayList(v.y(list2, 10));
                    for (GroupedUserVehicleCollisionsDto groupedUserVehicleCollisionsDto : list2) {
                        fz.b.LocalDate localDate = new fz.b.LocalDate(groupedUserVehicleCollisionsDto.getDate());
                        List<UserVehicleCollisionDataDto> listA = groupedUserVehicleCollisionsDto.a();
                        ArrayList arrayList2 = new ArrayList(v.y(listA, i15));
                        for (Iterator it = listA.iterator(); it.hasNext(); it = it) {
                            UserVehicleCollisionDataDto userVehicleCollisionDataDto = (UserVehicleCollisionDataDto) it.next();
                            ProcessId processId = new ProcessId(userVehicleCollisionDataDto.getProcessId());
                            s0 s0VarV = V(userVehicleCollisionDataDto.getCollisionStatus());
                            String localizationDescription = userVehicleCollisionDataDto.getLocalizationDescription();
                            Double dS = r.s(userVehicleCollisionDataDto.getLatitude());
                            double dDoubleValue = 0.0d;
                            double dDoubleValue2 = dS != null ? dS.doubleValue() : 0.0d;
                            Double dS2 = r.s(userVehicleCollisionDataDto.getLongitude());
                            if (dS2 != null) {
                                dDoubleValue = dS2.doubleValue();
                            }
                            arrayList2.add(new sv0.g.Grouped(processId, s0VarV, localizationDescription, new Coordinates(dDoubleValue2, dDoubleValue), userVehicleCollisionDataDto.getStatementNumber(), userVehicleCollisionDataDto.getWorkingCopyValidityDaysLeft()));
                        }
                        arrayList.add(new CollisionGroup(localDate, arrayList2));
                        i15 = 10;
                    }
                    return new dx.i.Right(arrayList);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final List<VehicleCollisionFileName> x(RefreshVehicleCollisionParticipantImagesResponse refreshVehicleCollisionParticipantImagesResponse) {
        List<String> listA = refreshVehicleCollisionParticipantImagesResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(t0((String) it.next()));
        }
        return arrayList;
    }

    public static final List<StatementVehicleDetails.Image> y(List<CollisionVehicleImageWithThumbnailFileDto> list) {
        VehicleCollisionFileToDownload vehicleCollisionFileToDownload;
        if (list == null) {
            return null;
        }
        List<CollisionVehicleImageWithThumbnailFileDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (CollisionVehicleImageWithThumbnailFileDto collisionVehicleImageWithThumbnailFileDto : list2) {
            VehicleCollisionFileToDownload vehicleCollisionFileToDownloadT = T(collisionVehicleImageWithThumbnailFileDto.getFileOriginal());
            CollisionVehicleImageFileDto fileThumbnail = collisionVehicleImageWithThumbnailFileDto.getFileThumbnail();
            if (fileThumbnail == null || (vehicleCollisionFileToDownload = T(fileThumbnail)) == null) {
                vehicleCollisionFileToDownload = new VehicleCollisionFileToDownload("", t0(""), ry.a.b(c0.g("")), c0.g(""), null);
            }
            arrayList.add(new StatementVehicleDetails.Image(vehicleCollisionFileToDownloadT, vehicleCollisionFileToDownload));
        }
        return arrayList;
    }

    public static final AutomaticReportInsurerDetails z(InsuranceProviderToAutomaticallyReportDataDto insuranceProviderToAutomaticallyReportDataDto) {
        return new AutomaticReportInsurerDetails(insuranceProviderToAutomaticallyReportDataDto.getId(), insuranceProviderToAutomaticallyReportDataDto.getShortName(), insuranceProviderToAutomaticallyReportDataDto.getAdditionalDescription());
    }
}
