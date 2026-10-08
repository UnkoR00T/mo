package gw0;

import fw0.ConfigurationForPhotosCompressionMobileResponse;
import fw0.CreateVehicleCollisionRequest;
import fw0.CreateVehicleCollisionResponse;
import fw0.FillVehicleCollisionDescriptionRequest;
import fw0.FillVehicleCollisionParticipantStatementDataRequest;
import fw0.GetAllInsuranceProvidersDataResponse;
import fw0.GetCollisionParticipantVehiclesResponse;
import fw0.GetCollisionVehicleResponse;
import fw0.GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto;
import fw0.GetReadyToSignVehicleCollisionStatementDataResponse;
import fw0.GetVehicleCollisionDescriptionWithOtherSideDataResponse;
import fw0.GetVehicleCollisionInitialDataConfirmedResponse;
import fw0.GetVehicleCollisionJoinedResponse;
import fw0.InsuranceProviderDataDto;
import fw0.JoinVehicleCollisionRequest;
import fw0.JoinVehicleCollisionResponse;
import fw0.RefreshVehicleCollisionParticipantImagesResponse;
import fw0.ReportVehicleCollisionToInsurerRequest;
import fw0.ReportVehicleCollisionToInsurerResponse;
import fw0.UserVehicleCollisionsFirstPageResponse;
import fw0.UserVehicleCollisionsNextPageResponse;
import fw0.VehicleCollisionConfirmStatementDataSignedRequest;
import fw0.VehicleCollisionFinishedDetailsResponse;
import fw0.VehicleCollisionRegeneratedStatementDetailsResponse;
import fw0.VehicleCollisionReportedToUfgDetailsResponse;
import fw0.VehicleCollisionUfgFormReportDetailsResponse;
import fw0.VehicleCollisionVerifyStatusResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpServiceParameters;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import sv0.AutomaticReportRequest;
import sv0.AutomaticReportSuccessResponse;
import sv0.BEVehicleData;
import sv0.CollisionCreatedDescription;
import sv0.FileImageConfiguration;
import sv0.InsuranceProviderData;
import sv0.NewCollision;
import sv0.NewVehicleCollisionDescription;
import sv0.ProcessId;
import sv0.ProcessNewCollision;
import sv0.StatementPersonalData;
import sv0.StatementVehicleData;
import sv0.UfgFormReportDetails;
import sv0.VehicleCollisionFileName;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u0018\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J$\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b&\u0010 J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b'\u0010 J,\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020,0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b-\u0010 J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b/\u0010 J4\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002030\u00122\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b4\u00105J$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002060\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b7\u0010 J\"\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u0012H\u0096@¢\u0006\u0004\b:\u0010;J4\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\b@\u0010AJ$\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020B0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bC\u0010 J$\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bD\u0010 J,\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010E\u001a\u000200H\u0096@¢\u0006\u0004\bF\u0010GJ$\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020H0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bI\u0010 J$\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020J0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bK\u0010 J,\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020LH\u0096@¢\u0006\u0004\bN\u0010OJ\u001c\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020P0\u0012H\u0096@¢\u0006\u0004\bQ\u0010;J$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020R0\u00122\u0006\u0010M\u001a\u00020LH\u0096@¢\u0006\u0004\bS\u0010TJ$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020U0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bV\u0010 J,\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020Y0\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020WH\u0096@¢\u0006\u0004\bZ\u0010[J8\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\080\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\08H\u0096@¢\u0006\u0004\b^\u0010_J$\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020`0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\ba\u0010 J$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020b0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\bc\u0010 J$\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020d0\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\be\u0010 J0\u0010h\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0f0\u00122\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001c0fH\u0096@¢\u0006\u0004\bh\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010jR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010lR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010q\u001a\u0004\br\u0010sR\u001b\u0010x\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010q\u001a\u0004\bv\u0010wR\u001b\u0010z\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010q\u001a\u0004\by\u0010wR\u001b\u0010~\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010q\u001a\u0004\b|\u0010}R\u001c\u0010\u0080\u0001\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010q\u001a\u0004\b\u007f\u0010}R\u001f\u0010\u0084\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b@\u0010q\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0086\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bI\u0010q\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001f\u0010\u008a\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bZ\u0010q\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b:\u0010q\u001a\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001f\u0010\u0090\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b&\u0010q\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010\u0094\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bV\u0010q\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0098\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bc\u0010q\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u009c\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b/\u0010q\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010 \u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bh\u0010q\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010¤\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b'\u0010q\u001a\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010¨\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bC\u0010q\u001a\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010¬\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b^\u0010q\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lgw0/z;", "Ljw0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/a;", "currentTimeProvider", "Lez/c;", "dateConverter", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/a;Lez/c;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;)V", "Lsv0/v;", "newCollision", "Ldx/i;", "Ldx/b;", "Lsv0/z;", "e", "(Lsv0/v;Ltq/e;)Ljava/lang/Object;", "Lsv0/t;", "data", "Lsv0/u;", "i", "(Lsv0/t;Ltq/e;)Ljava/lang/Object;", "Lsv0/y;", "processId", "Lsv0/h0;", "d", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/w;", "Loq/i0;", "g", "(Lsv0/w;Ltq/e;)Ljava/lang/Object;", "Lsv0/i;", "n", "s", "Lsv0/a0;", "rejectionReason", "w", "(Lsv0/y;Lsv0/a0;Ltq/e;)Ljava/lang/Object;", "Lsv0/o;", "B", "Lsv0/f;", "q", "Liy/b0;", "registrationNumber", "vin", "Lsv0/e;", "c", "(Liy/b0;Liy/b0;Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/q;", "v", "", "Lsv0/s;", "m", "(Ltq/e;)Ljava/lang/Object;", "Lsv0/e0;", "statementPersonalData", "Lsv0/i0;", "statementVehicleData", "j", "(Lsv0/y;Lsv0/e0;Lsv0/i0;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0;", "t", "f", "signedRequest", "y", "(Lsv0/y;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0$b$a;", "k", "Lsv0/c0$a;", "b", "", "pageId", "z", "(Lsv0/y;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsv0/m$a;", "h", "Lsv0/m$b;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsv0/b;", "o", "Lsv0/c;", "automaticReportRequest", "Lsv0/d;", "l", "(Lsv0/y;Lsv0/c;Ltq/e;)Ljava/lang/Object;", "Lsv0/o0;", "fileName", "u", "(Lsv0/y;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0$b$c;", "x", "Lsv0/l0;", "p", "Lsv0/c0$b$b;", "A", "", "listProcess", "r", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lez/a;", "Lez/c;", "Lay/j;", "Lay/j;", "offsetDateTimeSerialize", "Ldw0/j;", "Loq/k;", "D0", "()Ldw0/j;", "clientStep1", "Ldw0/k;", "F0", "()Ldw0/k;", "clientStep2", "G0", "clientStep2LongPoll", "Ldw0/l;", "I0", "()Ldw0/l;", "clientStep3LongPoll", "H0", "clientStep3", "Ldw0/m;", "J0", "()Ldw0/m;", "clientStep4", "K0", "clientStep4LongPoll", "Ldw0/n;", "L0", "()Ldw0/n;", "clientStep5", "M0", "clientStep5LongPool", "Ldw0/o;", "N0", "()Ldw0/o;", "clientStep6", "Ldw0/p;", "O0", "()Ldw0/p;", "clientStep8", "Ldw0/a;", "B0", "()Ldw0/a;", "clientAllUserCollisions", "Ldw0/q;", "P0", "()Ldw0/q;", "clientStep9", "Ldw0/i;", "E0", "()Ldw0/i;", "clientStep10", "Ldw0/g;", "Q0", "()Ldw0/g;", "clientVehicleCollisionDetailsController", "Ldw0/d;", "C0", "()Ldw0/d;", "clientRefreshVehicleCollisionImagesController", "Ldw0/h;", "R0", "()Ldw0/h;", "vehicleCollisionRegenerateStatementController", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements jw0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay.j offsetDateTimeSerialize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep2LongPoll;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep3LongPoll;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep3;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep4;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep4LongPoll;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep5;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep5LongPool;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep6;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep8;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientAllUserCollisions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep9;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientStep10;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientVehicleCollisionDetailsController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientRefreshVehicleCollisionImagesController;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final oq.k vehicleCollisionRegenerateStatementController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77520e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77522g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77520e = obj;
            this.f77522g |= PKIFailureInfo.systemUnavail;
            return z.this.B(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/l3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.l<tq.e<? super ge4.x<VehicleCollisionUfgFormReportDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77523e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(ProcessId processId, tq.e<? super a0> eVar) {
            super(1, eVar);
            this.f77525g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77523e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.g gVarQ0 = z.this.Q0();
            String processId = this.f77525g.getProcessId();
            this.f77523e = 1;
            Object objB = gVarQ0.b(processId, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new a0(this.f77525g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleCollisionUfgFormReportDetailsResponse>> eVar) {
            return ((a0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/t0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<GetVehicleCollisionJoinedResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77526e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ProcessId processId, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f77528g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77526e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.k kVarG0 = z.this.G0();
            String processId = this.f77528g.getProcessId();
            this.f77526e = 1;
            Object objB = kVarG0.b(processId, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new b(this.f77528g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetVehicleCollisionJoinedResponse>> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77530e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77532g;

        b0(tq.e<? super b0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77530e = obj;
            this.f77532g |= PKIFailureInfo.systemUnavail;
            return z.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77533e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77535g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ProcessId processId, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f77535g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77533e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.m mVarJ0 = z.this.J0();
            String processId = this.f77535g.getProcessId();
            this.f77533e = 1;
            Object objC = mVarJ0.c(processId, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new c(this.f77535g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/z1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.l<tq.e<? super ge4.x<UserVehicleCollisionsNextPageResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77536e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77538g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, tq.e<? super c0> eVar) {
            super(1, eVar);
            this.f77538g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77536e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.a aVarB0 = z.this.B0();
            String str = this.f77538g;
            this.f77536e = 1;
            Object objA = aVarB0.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new c0(this.f77538g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<UserVehicleCollisionsNextPageResponse>> eVar) {
            return ((c0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77540e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77542g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77540e = obj;
            this.f77542g |= PKIFailureInfo.systemUnavail;
            return z.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77544e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77546g;

        d0(tq.e<? super d0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77544e = obj;
            this.f77546g |= PKIFailureInfo.systemUnavail;
            return z.this.q(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super ge4.x<CreateVehicleCollisionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77547e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ NewCollision f77549g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NewCollision newCollision, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f77549g = newCollision;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77547e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.j jVarD0 = z.this.D0();
            CreateVehicleCollisionRequest createVehicleCollisionRequestZ = ew0.d.Z(this.f77549g);
            this.f77547e = 1;
            Object objA = jVarD0.a(createVehicleCollisionRequestZ, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new e(this.f77549g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<CreateVehicleCollisionResponse>> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/n0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.l<tq.e<? super ge4.x<GetCollisionParticipantVehiclesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77550e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77552g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(ProcessId processId, tq.e<? super e0> eVar) {
            super(1, eVar);
            this.f77552g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77550e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            String processId = this.f77552g.getProcessId();
            this.f77550e = 1;
            Object objB = nVarL0.b(processId, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new e0(this.f77552g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetCollisionParticipantVehiclesResponse>> eVar) {
            return ((e0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77554e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77556g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77554e = obj;
            this.f77556g |= PKIFailureInfo.systemUnavail;
            return z.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77560g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77562j;

        f0(tq.e<? super f0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77560g = obj;
            this.f77562j |= PKIFailureInfo.systemUnavail;
            return z.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/v2;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super ge4.x<VehicleCollisionFinishedDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77563e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77565g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ProcessId processId, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f77565g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77563e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.g gVarQ0 = z.this.Q0();
            String processId = this.f77565g.getProcessId();
            this.f77563e = 1;
            Object objD = gVarQ0.d(processId, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new g(this.f77565g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleCollisionFinishedDetailsResponse>> eVar) {
            return ((g) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/o0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.l<tq.e<? super ge4.x<GetCollisionVehicleResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77566e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77569h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ProcessId f77570j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(iy.b0 b0Var, iy.b0 b0Var2, ProcessId processId, tq.e<? super g0> eVar) {
            super(1, eVar);
            this.f77568g = b0Var;
            this.f77569h = b0Var2;
            this.f77570j = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77566e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            String strE = iy.c0.e(this.f77568g);
            String strE2 = iy.c0.e(this.f77569h);
            String processId = this.f77570j.getProcessId();
            this.f77566e = 1;
            Object objG = nVarL0.g(processId, strE2, strE, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new g0(this.f77568g, this.f77569h, this.f77570j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetCollisionVehicleResponse>> eVar) {
            return ((g0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77572e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77574g;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77572e = obj;
            this.f77574g |= PKIFailureInfo.systemUnavail;
            return z.this.v(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77576e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77578g;

        h0(tq.e<? super h0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77576e = obj;
            this.f77578g |= PKIFailureInfo.systemUnavail;
            return z.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/q;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super ge4.x<ConfigurationForPhotosCompressionMobileResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77579e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77581g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ProcessId processId, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f77581g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77579e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            String processId = this.f77581g.getProcessId();
            this.f77579e = 1;
            Object objD = nVarL0.d(processId, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new i(this.f77581g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ConfigurationForPhotosCompressionMobileResponse>> eVar) {
            return ((i) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/z0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.l<tq.e<? super ge4.x<JoinVehicleCollisionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77582e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ sv0.t f77584g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(sv0.t tVar, tq.e<? super i0> eVar) {
            super(1, eVar);
            this.f77584g = tVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77582e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.k kVarF0 = z.this.F0();
            JoinVehicleCollisionRequest joinVehicleCollisionRequestG0 = ew0.d.g0(this.f77584g);
            this.f77582e = 1;
            Object objA = kVarF0.a(joinVehicleCollisionRequestG0, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new i0(this.f77584g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<JoinVehicleCollisionResponse>> eVar) {
            return ((i0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f77585d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77587f;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77585d = obj;
            this.f77587f |= PKIFailureInfo.systemUnavail;
            return z.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77588e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77591h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(ProcessId processId, iy.b0 b0Var, tq.e<? super j0> eVar) {
            super(1, eVar);
            this.f77590g = processId;
            this.f77591h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77588e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.p pVarO0 = z.this.O0();
            String processId = this.f77590g.getProcessId();
            VehicleCollisionConfirmStatementDataSignedRequest vehicleCollisionConfirmStatementDataSignedRequest = new VehicleCollisionConfirmStatementDataSignedRequest(iy.c0.e(this.f77591h));
            this.f77588e = 1;
            Object objB = pVarO0.b(processId, vehicleCollisionConfirmStatementDataSignedRequest, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new j0(this.f77590g, this.f77591h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((j0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/y1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.l<tq.e<? super ge4.x<UserVehicleCollisionsFirstPageResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77592e;

        k(tq.e<? super k> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77592e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.a aVarB0 = z.this.B0();
            this.f77592e = 1;
            Object objB = aVarB0.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new k(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<UserVehicleCollisionsFirstPageResponse>> eVar) {
            return ((k) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77594e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ StatementPersonalData f77597h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ StatementVehicleData f77598j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(ProcessId processId, StatementPersonalData statementPersonalData, StatementVehicleData statementVehicleData, tq.e<? super k0> eVar) {
            super(1, eVar);
            this.f77596g = processId;
            this.f77597h = statementPersonalData;
            this.f77598j = statementVehicleData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77594e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.o oVarN0 = z.this.N0();
            String processId = this.f77596g.getProcessId();
            FillVehicleCollisionParticipantStatementDataRequest fillVehicleCollisionParticipantStatementDataRequest = new FillVehicleCollisionParticipantStatementDataRequest(ew0.d.e0(this.f77597h), ew0.d.f0(this.f77598j));
            this.f77594e = 1;
            Object objA = oVarN0.a(processId, fillVehicleCollisionParticipantStatementDataRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new k0(this.f77596g, this.f77597h, this.f77598j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((k0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f77599d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f77601f;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77599d = obj;
            this.f77601f |= PKIFailureInfo.systemUnavail;
            return z.this.m(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77604f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77606h;

        l0(tq.e<? super l0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77604f = obj;
            this.f77606h |= PKIFailureInfo.systemUnavail;
            return z.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/m0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super ge4.x<GetAllInsuranceProvidersDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77607e;

        m(tq.e<? super m> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77607e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            this.f77607e = 1;
            Object objA = nVarL0.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new m(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetAllInsuranceProvidersDataResponse>> eVar) {
            return ((m) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/l1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.l<tq.e<? super ge4.x<RefreshVehicleCollisionParticipantImagesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77609e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<VehicleCollisionFileName> f77612h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(ProcessId processId, List<VehicleCollisionFileName> list, tq.e<? super m0> eVar) {
            super(1, eVar);
            this.f77611g = processId;
            this.f77612h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77609e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.d dVarC0 = z.this.C0();
            String processId = this.f77611g.getProcessId();
            List<VehicleCollisionFileName> list = this.f77612h;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((VehicleCollisionFileName) it.next()).a());
            }
            String strS0 = ew0.d.s0(arrayList);
            this.f77609e = 1;
            Object objA = dVarC0.a(processId, strS0, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new m0(this.f77611g, this.f77612h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<RefreshVehicleCollisionParticipantImagesResponse>> eVar) {
            return ((m0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77614e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77616g;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77614e = obj;
            this.f77616g |= PKIFailureInfo.systemUnavail;
            return z.this.o(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77618e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77620g;

        n0(tq.e<? super n0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77618e = obj;
            this.f77620g |= PKIFailureInfo.systemUnavail;
            return z.this.A(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/p0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.l<tq.e<? super ge4.x<GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77621e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77623g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ProcessId processId, tq.e<? super o> eVar) {
            super(1, eVar);
            this.f77623g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77621e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.q qVarP0 = z.this.P0();
            String processId = this.f77623g.getProcessId();
            this.f77621e = 1;
            Object objA = qVarP0.a(processId, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new o(this.f77623g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto>> eVar) {
            return ((o) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/e3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.l<tq.e<? super ge4.x<VehicleCollisionRegeneratedStatementDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77624e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(ProcessId processId, tq.e<? super o0> eVar) {
            super(1, eVar);
            this.f77626g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77624e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.h hVarR0 = z.this.R0();
            String processId = this.f77626g.getProcessId();
            this.f77624e = 1;
            Object objA = hVarR0.a(processId, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new o0(this.f77626g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleCollisionRegeneratedStatementDetailsResponse>> eVar) {
            return ((o0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77628e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77630g;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77628e = obj;
            this.f77630g |= PKIFailureInfo.systemUnavail;
            return z.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77631e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ sv0.a0 f77634h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(ProcessId processId, sv0.a0 a0Var, tq.e<? super p0> eVar) {
            super(1, eVar);
            this.f77633g = processId;
            this.f77634h = a0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77631e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.m mVarJ0 = z.this.J0();
            String processId = this.f77633g.getProcessId();
            String strQ0 = ew0.d.q0(this.f77634h);
            this.f77631e = 1;
            Object objA = mVarJ0.a(processId, strQ0, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new p0(this.f77633g, this.f77634h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((p0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/s0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.l<tq.e<? super ge4.x<GetVehicleCollisionInitialDataConfirmedResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77635e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ProcessId processId, tq.e<? super q> eVar) {
            super(1, eVar);
            this.f77637g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77635e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.m mVarK0 = z.this.K0();
            String processId = this.f77637g.getProcessId();
            this.f77635e = 1;
            Object objD = dw0.m.d(mVarK0, processId, null, this, 2, null);
            return objD == objE ? objE : objD;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new q(this.f77637g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetVehicleCollisionInitialDataConfirmedResponse>> eVar) {
            return ((q) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class q0 extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77638e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77640g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(ProcessId processId, tq.e<? super q0> eVar) {
            super(1, eVar);
            this.f77640g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77638e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.p pVarO0 = z.this.O0();
            String processId = this.f77640g.getProcessId();
            this.f77638e = 1;
            Object objA = pVarO0.a(processId, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new q0(this.f77640g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((q0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77643f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77645h;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77643f = obj;
            this.f77645h |= PKIFailureInfo.systemUnavail;
            return z.this.z(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77648f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77650h;

        r0(tq.e<? super r0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77648f = obj;
            this.f77650h |= PKIFailureInfo.systemUnavail;
            return z.this.l(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/n0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.l<tq.e<? super ge4.x<GetCollisionParticipantVehiclesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77651e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f77654h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(ProcessId processId, String str, tq.e<? super s> eVar) {
            super(1, eVar);
            this.f77653g = processId;
            this.f77654h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77651e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            String processId = this.f77653g.getProcessId();
            String str = this.f77654h;
            this.f77651e = 1;
            Object objC = nVarL0.c(processId, str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new s(this.f77653g, this.f77654h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetCollisionParticipantVehiclesResponse>> eVar) {
            return ((s) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/p1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class s0 extends vq.k implements er.l<tq.e<? super ge4.x<ReportVehicleCollisionToInsurerResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77655e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ AutomaticReportRequest f77658h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(ProcessId processId, AutomaticReportRequest automaticReportRequest, tq.e<? super s0> eVar) {
            super(1, eVar);
            this.f77657g = processId;
            this.f77658h = automaticReportRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77655e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.i iVarE0 = z.this.E0();
            String processId = this.f77657g.getProcessId();
            ReportVehicleCollisionToInsurerRequest reportVehicleCollisionToInsurerRequestH0 = ew0.d.h0(this.f77658h);
            this.f77655e = 1;
            Object objA = iVarE0.a(processId, reportVehicleCollisionToInsurerRequestH0, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new s0(this.f77657g, this.f77658h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<ReportVehicleCollisionToInsurerResponse>> eVar) {
            return ((s0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77660e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77662g;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77660e = obj;
            this.f77662g |= PKIFailureInfo.systemUnavail;
            return z.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class t0 extends vq.k implements er.l<tq.e<? super ge4.x<oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77663e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ NewVehicleCollisionDescription f77665g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(NewVehicleCollisionDescription newVehicleCollisionDescription, tq.e<? super t0> eVar) {
            super(1, eVar);
            this.f77665g = newVehicleCollisionDescription;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77663e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.l lVarH0 = z.this.H0();
            String processId = this.f77665g.getProcessId().getProcessId();
            FillVehicleCollisionDescriptionRequest fillVehicleCollisionDescriptionRequestC0 = ew0.d.c0(this.f77665g, z.this.dateConverter);
            this.f77663e = 1;
            Object objB = lVarH0.b(processId, fillVehicleCollisionDescriptionRequestC0, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new t0(this.f77665g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<oq.i0>> eVar) {
            return ((t0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/q0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.l<tq.e<? super ge4.x<GetReadyToSignVehicleCollisionStatementDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77666e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77668g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(ProcessId processId, tq.e<? super u> eVar) {
            super(1, eVar);
            this.f77668g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77666e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarL0 = z.this.L0();
            String processId = this.f77668g.getProcessId();
            this.f77666e = 1;
            Object objF = dw0.n.f(nVarL0, processId, null, this, 2, null);
            return objF == objE ? objE : objF;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new u(this.f77668g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetReadyToSignVehicleCollisionStatementDataResponse>> eVar) {
            return ((u) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77670e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77672g;

        u0(tq.e<? super u0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77670e = obj;
            this.f77672g |= PKIFailureInfo.systemUnavail;
            return z.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class v extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77674e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77676g;

        v(tq.e<? super v> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77674e = obj;
            this.f77676g |= PKIFailureInfo.systemUnavail;
            return z.this.x(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/r0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class v0 extends vq.k implements er.l<tq.e<? super ge4.x<GetVehicleCollisionDescriptionWithOtherSideDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77677e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77679g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v0(ProcessId processId, tq.e<? super v0> eVar) {
            super(1, eVar);
            this.f77679g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77677e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.l lVarI0 = z.this.I0();
            String processId = this.f77679g.getProcessId();
            this.f77677e = 1;
            Object objC = dw0.l.c(lVarI0, processId, null, this, 2, null);
            return objC == objE ? objE : objC;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new v0(this.f77679g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetVehicleCollisionDescriptionWithOtherSideDataResponse>> eVar) {
            return ((v0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/g3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.l<tq.e<? super ge4.x<VehicleCollisionReportedToUfgDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77680e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(ProcessId processId, tq.e<? super w> eVar) {
            super(1, eVar);
            this.f77682g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77680e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.g gVarQ0 = z.this.Q0();
            String processId = this.f77682g.getProcessId();
            this.f77680e = 1;
            Object objA = gVarQ0.a(processId, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new w(this.f77682g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleCollisionReportedToUfgDetailsResponse>> eVar) {
            return ((w) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class w0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77684e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77686g;

        w0(tq.e<? super w0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77684e = obj;
            this.f77686g |= PKIFailureInfo.systemUnavail;
            return z.this.r(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class x extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77688e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77690g;

        x(tq.e<? super x> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77688e = obj;
            this.f77690g |= PKIFailureInfo.systemUnavail;
            return z.this.t(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/n3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class x0 extends vq.k implements er.l<tq.e<? super ge4.x<VehicleCollisionVerifyStatusResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77691e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<ProcessId> f77693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(Set<ProcessId> set, tq.e<? super x0> eVar) {
            super(1, eVar);
            this.f77693g = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77691e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.g gVarQ0 = z.this.Q0();
            Set<ProcessId> set = this.f77693g;
            ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProcessId) it.next()).getProcessId());
            }
            Set<String> setK1 = pq.v.k1(arrayList);
            this.f77691e = 1;
            Object objC = gVarQ0.c(setK1, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new x0(this.f77693g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleCollisionVerifyStatusResponse>> eVar) {
            return ((x0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/q0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.l<tq.e<? super ge4.x<GetReadyToSignVehicleCollisionStatementDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77694e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f77696g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(ProcessId processId, tq.e<? super y> eVar) {
            super(1, eVar);
            this.f77696g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77694e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.n nVarM0 = z.this.M0();
            String processId = this.f77696g.getProcessId();
            this.f77694e = 1;
            Object objF = dw0.n.f(nVarM0, processId, null, this, 2, null);
            return objF == objE ? objE : objF;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return z.this.new y(this.f77696g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<GetReadyToSignVehicleCollisionStatementDataResponse>> eVar) {
            return ((y) M(eVar)).J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: gw0.z$z, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1760z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f77698e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f77700g;

        C1760z(tq.e<? super C1760z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77698e = obj;
            this.f77700g |= PKIFailureInfo.systemUnavail;
            return z.this.p(null, this);
        }
    }

    public z(final pl.gov.coi.common.network.w wVar, pl.gov.coi.common.network.g0 g0Var, ez.a aVar, ez.c cVar, ZonedDateTimeSerializer zonedDateTimeSerializer, ay.h hVar) {
        this.networkCallMediator = g0Var;
        this.currentTimeProvider = aVar;
        this.dateConverter = cVar;
        this.offsetDateTimeSerialize = hVar.c(OffsetDateTime.class, zonedDateTimeSerializer);
        this.clientStep1 = oq.l.a(new er.a() { // from class: gw0.i
            @Override // er.a
            public final Object a() {
                return z.o0(this.f77479a, wVar);
            }
        });
        this.clientStep2 = oq.l.a(new er.a() { // from class: gw0.x
            @Override // er.a
            public final Object a() {
                return z.q0(wVar);
            }
        });
        this.clientStep2LongPoll = oq.l.a(new er.a() { // from class: gw0.y
            @Override // er.a
            public final Object a() {
                return z.p0(wVar);
            }
        });
        this.clientStep3LongPoll = oq.l.a(new er.a() { // from class: gw0.j
            @Override // er.a
            public final Object a() {
                return z.r0(wVar);
            }
        });
        this.clientStep3 = oq.l.a(new er.a() { // from class: gw0.k
            @Override // er.a
            public final Object a() {
                return z.s0(this.f77482a, wVar);
            }
        });
        this.clientStep4 = oq.l.a(new er.a() { // from class: gw0.l
            @Override // er.a
            public final Object a() {
                return z.u0(wVar);
            }
        });
        this.clientStep4LongPoll = oq.l.a(new er.a() { // from class: gw0.m
            @Override // er.a
            public final Object a() {
                return z.t0(wVar);
            }
        });
        this.clientStep5 = oq.l.a(new er.a() { // from class: gw0.n
            @Override // er.a
            public final Object a() {
                return z.w0(wVar);
            }
        });
        this.clientStep5LongPool = oq.l.a(new er.a() { // from class: gw0.o
            @Override // er.a
            public final Object a() {
                return z.v0(wVar);
            }
        });
        this.clientStep6 = oq.l.a(new er.a() { // from class: gw0.p
            @Override // er.a
            public final Object a() {
                return z.x0(wVar);
            }
        });
        this.clientStep8 = oq.l.a(new er.a() { // from class: gw0.q
            @Override // er.a
            public final Object a() {
                return z.y0(wVar);
            }
        });
        this.clientAllUserCollisions = oq.l.a(new er.a() { // from class: gw0.r
            @Override // er.a
            public final Object a() {
                return z.l0(wVar);
            }
        });
        this.clientStep9 = oq.l.a(new er.a() { // from class: gw0.s
            @Override // er.a
            public final Object a() {
                return z.z0(wVar);
            }
        });
        this.clientStep10 = oq.l.a(new er.a() { // from class: gw0.t
            @Override // er.a
            public final Object a() {
                return z.n0(wVar);
            }
        });
        this.clientVehicleCollisionDetailsController = oq.l.a(new er.a() { // from class: gw0.u
            @Override // er.a
            public final Object a() {
                return z.A0(wVar);
            }
        });
        this.clientRefreshVehicleCollisionImagesController = oq.l.a(new er.a() { // from class: gw0.v
            @Override // er.a
            public final Object a() {
                return z.m0(wVar);
            }
        });
        this.vehicleCollisionRegenerateStatementController = oq.l.a(new er.a() { // from class: gw0.w
            @Override // er.a
            public final Object a() {
                return z.S0(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.g A0(pl.gov.coi.common.network.w wVar) {
        return (dw0.g) pl.gov.coi.common.network.w.b(wVar, null, dw0.g.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.a B0() {
        return (dw0.a) this.clientAllUserCollisions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.d C0() {
        return (dw0.d) this.clientRefreshVehicleCollisionImagesController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.j D0() {
        return (dw0.j) this.clientStep1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.i E0() {
        return (dw0.i) this.clientStep10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.k F0() {
        return (dw0.k) this.clientStep2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.k G0() {
        return (dw0.k) this.clientStep2LongPoll.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.l H0() {
        return (dw0.l) this.clientStep3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.l I0() {
        return (dw0.l) this.clientStep3LongPoll.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.m J0() {
        return (dw0.m) this.clientStep4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.m K0() {
        return (dw0.m) this.clientStep4LongPoll.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.n L0() {
        return (dw0.n) this.clientStep5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.n M0() {
        return (dw0.n) this.clientStep5LongPool.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.o N0() {
        return (dw0.o) this.clientStep6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.p O0() {
        return (dw0.p) this.clientStep8.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.q P0() {
        return (dw0.q) this.clientStep9.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.g Q0() {
        return (dw0.g) this.clientVehicleCollisionDetailsController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.h R0() {
        return (dw0.h) this.vehicleCollisionRegenerateStatementController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.h S0(pl.gov.coi.common.network.w wVar) {
        return (dw0.h) pl.gov.coi.common.network.w.b(wVar, null, dw0.h.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.a l0(pl.gov.coi.common.network.w wVar) {
        return (dw0.a) pl.gov.coi.common.network.w.b(wVar, null, dw0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.d m0(pl.gov.coi.common.network.w wVar) {
        return (dw0.d) pl.gov.coi.common.network.w.b(wVar, null, dw0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.i n0(pl.gov.coi.common.network.w wVar) {
        return (dw0.i) pl.gov.coi.common.network.w.b(wVar, null, dw0.i.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.j o0(z zVar, pl.gov.coi.common.network.w wVar) {
        return (dw0.j) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(null, zVar.offsetDateTimeSerialize, 1, null))), dw0.j.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.k p0(pl.gov.coi.common.network.w wVar) {
        return (dw0.k) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(gu.b.o(ov0.b.f150213a.a()), null, 2, null))), dw0.k.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.k q0(pl.gov.coi.common.network.w wVar) {
        return (dw0.k) pl.gov.coi.common.network.w.b(wVar, null, dw0.k.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.l r0(pl.gov.coi.common.network.w wVar) {
        return (dw0.l) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(gu.b.o(ov0.b.f150213a.a()), null, 2, null))), dw0.l.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.l s0(z zVar, pl.gov.coi.common.network.w wVar) {
        return (dw0.l) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(null, zVar.offsetDateTimeSerialize, 1, null))), dw0.l.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.m t0(pl.gov.coi.common.network.w wVar) {
        return (dw0.m) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(gu.b.o(ov0.b.f150213a.a()), null, 2, null))), dw0.m.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.m u0(pl.gov.coi.common.network.w wVar) {
        return (dw0.m) pl.gov.coi.common.network.w.b(wVar, null, dw0.m.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.n v0(pl.gov.coi.common.network.w wVar) {
        return (dw0.n) wVar.a(new pl.gov.coi.common.network.y.Backend(new pl.gov.coi.common.network.y.b.C3925b(new HttpServiceParameters(gu.b.o(ov0.b.f150213a.b()), null, 2, null))), dw0.n.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.n w0(pl.gov.coi.common.network.w wVar) {
        return (dw0.n) pl.gov.coi.common.network.w.b(wVar, null, dw0.n.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.o x0(pl.gov.coi.common.network.w wVar) {
        return (dw0.o) pl.gov.coi.common.network.w.b(wVar, null, dw0.o.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.p y0(pl.gov.coi.common.network.w wVar) {
        return (dw0.p) pl.gov.coi.common.network.w.b(wVar, null, dw0.p.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.q z0(pl.gov.coi.common.network.w wVar) {
        return (dw0.q) pl.gov.coi.common.network.w.b(wVar, null, dw0.q.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object A(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.c0.b.RegeneratedStatement>> eVar) throws Throwable {
        n0 n0Var;
        if (eVar instanceof n0) {
            n0Var = (n0) eVar;
            int i15 = n0Var.f77620g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                n0Var.f77620g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                n0Var = new n0(eVar);
            }
        } else {
            n0Var = new n0(eVar);
        }
        Object objB = n0Var.f77618e;
        Object objE = uq.b.e();
        int i16 = n0Var.f77620g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            o0 o0Var = new o0(processId, null);
            n0Var.f77617d = processId;
            n0Var.f77620g = 1;
            objB = g0Var.b(o0Var, n0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            processId = (ProcessId) n0Var.f77617d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.r((VehicleCollisionRegeneratedStatementDetailsResponse) ((dx.i.Right) iVar).b(), processId);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object B(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends sv0.o>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f77522g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f77522g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f77520e;
        Object objE = uq.b.e();
        int i16 = aVar.f77522g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            b bVar = new b(processId, null);
            aVar.f77519d = vq.j.a(processId);
            aVar.f77522g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.F((GetVehicleCollisionJoinedResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, sv0.m.Next>> eVar) throws Throwable {
        b0 b0Var;
        if (eVar instanceof b0) {
            b0Var = (b0) eVar;
            int i15 = b0Var.f77532g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                b0Var.f77532g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                b0Var = new b0(eVar);
            }
        } else {
            b0Var = new b0(eVar);
        }
        Object objB = b0Var.f77530e;
        Object objE = uq.b.e();
        int i16 = b0Var.f77532g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            c0 c0Var = new c0(str, null);
            b0Var.f77529d = str;
            b0Var.f77532g = 1;
            objB = g0Var.b(c0Var, b0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) b0Var.f77529d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.n((UserVehicleCollisionsNextPageResponse) ((dx.i.Right) iVar).b(), str);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object b(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.c0.ReadyToSign>> eVar) throws Throwable {
        t tVar;
        if (eVar instanceof t) {
            tVar = (t) eVar;
            int i15 = tVar.f77662g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f77662g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(eVar);
            }
        } else {
            tVar = new t(eVar);
        }
        Object objB = tVar.f77660e;
        Object objE = uq.b.e();
        int i16 = tVar.f77662g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            u uVar = new u(processId, null);
            tVar.f77659d = processId;
            tVar.f77662g = 1;
            objB = g0Var.b(uVar, tVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            processId = (ProcessId) tVar.f77659d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.g((GetReadyToSignVehicleCollisionStatementDataResponse) ((dx.i.Right) iVar).b(), processId);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object c(iy.b0 b0Var, iy.b0 b0Var2, ProcessId processId, tq.e<? super dx.i<? extends dx.b, BEVehicleData>> eVar) throws Throwable {
        f0 f0Var;
        if (eVar instanceof f0) {
            f0Var = (f0) eVar;
            int i15 = f0Var.f77562j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                f0Var.f77562j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                f0Var = new f0(eVar);
            }
        } else {
            f0Var = new f0(eVar);
        }
        Object objB = f0Var.f77560g;
        Object objE = uq.b.e();
        int i16 = f0Var.f77562j;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            g0 g0Var2 = new g0(b0Var, b0Var2, processId, null);
            f0Var.f77557d = vq.j.a(b0Var);
            f0Var.f77558e = vq.j.a(b0Var2);
            f0Var.f77559f = vq.j.a(processId);
            f0Var.f77562j = 1;
            objB = g0Var.b(g0Var2, f0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.f((GetCollisionVehicleResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object d(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends sv0.h0>> eVar) throws Throwable {
        p pVar;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i15 = pVar.f77630g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f77630g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object objB = pVar.f77628e;
        Object objE = uq.b.e();
        int i16 = pVar.f77630g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            q qVar = new q(processId, null);
            pVar.f77627d = vq.j.a(processId);
            pVar.f77630g = 1;
            objB = g0Var.b(qVar, pVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.h((GetVehicleCollisionInitialDataConfirmedResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object e(NewCollision newCollision, tq.e<? super dx.i<? extends dx.b, ProcessNewCollision>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f77542g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f77542g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f77540e;
        Object objE = uq.b.e();
        int i16 = dVar.f77542g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(newCollision, null);
            dVar.f77539d = vq.j.a(newCollision);
            dVar.f77542g = 1;
            objB = g0Var.b(eVar2, dVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.M((CreateVehicleCollisionResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // jw0.e
    public Object f(ProcessId processId, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new q0(processId, null), eVar);
    }

    @Override // jw0.e
    public Object g(NewVehicleCollisionDescription newVehicleCollisionDescription, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new t0(newVehicleCollisionDescription, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object h(tq.e<? super dx.i<? extends dx.b, sv0.m.First>> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f77587f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f77587f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objB = jVar.f77585d;
        Object objE = uq.b.e();
        int i16 = jVar.f77587f;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            k kVar = new k(null);
            jVar.f77587f = 1;
            objB = g0Var.b(kVar, jVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.m((UserVehicleCollisionsFirstPageResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object i(sv0.t tVar, tq.e<? super dx.i<? extends dx.b, sv0.u>> eVar) throws Throwable {
        h0 h0Var;
        if (eVar instanceof h0) {
            h0Var = (h0) eVar;
            int i15 = h0Var.f77578g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                h0Var.f77578g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                h0Var = new h0(eVar);
            }
        } else {
            h0Var = new h0(eVar);
        }
        Object objB = h0Var.f77576e;
        Object objE = uq.b.e();
        int i16 = h0Var.f77578g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            i0 i0Var = new i0(tVar, null);
            h0Var.f77575d = vq.j.a(tVar);
            h0Var.f77578g = 1;
            objB = g0Var.b(i0Var, h0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.L((JoinVehicleCollisionResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // jw0.e
    public Object j(ProcessId processId, StatementPersonalData statementPersonalData, StatementVehicleData statementVehicleData, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new k0(processId, statementPersonalData, statementVehicleData, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object k(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.c0.b.Finished>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f77556g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f77556g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f77554e;
        Object objE = uq.b.e();
        int i16 = fVar.f77556g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            g gVar = new g(processId, null);
            fVar.f77553d = processId;
            fVar.f77556g = 1;
            objB = g0Var.b(gVar, fVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            processId = (ProcessId) fVar.f77553d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.p((VehicleCollisionFinishedDetailsResponse) ((dx.i.Right) iVar).b(), processId);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object l(ProcessId processId, AutomaticReportRequest automaticReportRequest, tq.e<? super dx.i<? extends dx.b, AutomaticReportSuccessResponse>> eVar) throws Throwable {
        r0 r0Var;
        if (eVar instanceof r0) {
            r0Var = (r0) eVar;
            int i15 = r0Var.f77650h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                r0Var.f77650h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                r0Var = new r0(eVar);
            }
        } else {
            r0Var = new r0(eVar);
        }
        Object objB = r0Var.f77648f;
        Object objE = uq.b.e();
        int i16 = r0Var.f77650h;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            s0 s0Var = new s0(processId, automaticReportRequest, null);
            r0Var.f77646d = vq.j.a(processId);
            r0Var.f77647e = vq.j.a(automaticReportRequest);
            r0Var.f77650h = 1;
            objB = g0Var.b(s0Var, r0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.B((ReportVehicleCollisionToInsurerResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object m(tq.e<? super dx.i<? extends dx.b, ? extends List<InsuranceProviderData>>> eVar) throws Throwable {
        l lVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f77601f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f77601f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object objB = lVar.f77599d;
        Object objE = uq.b.e();
        int i16 = lVar.f77601f;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            m mVar = new m(null);
            lVar.f77601f = 1;
            objB = g0Var.b(mVar, lVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List<InsuranceProviderDataDto> listA = ((GetAllInsuranceProvidersDataResponse) ((dx.i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(ew0.d.K((InsuranceProviderDataDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object n(ProcessId processId, tq.e<? super dx.i<? extends dx.b, CollisionCreatedDescription>> eVar) throws Throwable {
        u0 u0Var;
        if (eVar instanceof u0) {
            u0Var = (u0) eVar;
            int i15 = u0Var.f77672g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                u0Var.f77672g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                u0Var = new u0(eVar);
            }
        } else {
            u0Var = new u0(eVar);
        }
        Object objB = u0Var.f77670e;
        Object objE = uq.b.e();
        int i16 = u0Var.f77672g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            v0 v0Var = new v0(processId, null);
            u0Var.f77669d = vq.j.a(processId);
            u0Var.f77672g = 1;
            objB = g0Var.b(v0Var, u0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.D((GetVehicleCollisionDescriptionWithOtherSideDataResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object o(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends sv0.b>> eVar) throws Throwable {
        n nVar;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f77616g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f77616g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object objB = nVar.f77614e;
        Object objE = uq.b.e();
        int i16 = nVar.f77616g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            o oVar = new o(processId, null);
            nVar.f77613d = vq.j.a(processId);
            nVar.f77616g = 1;
            objB = g0Var.b(oVar, nVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.A((GetInsuranceProvidersToAutomaticallyReportVehicleCollisionDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object p(ProcessId processId, tq.e<? super dx.i<? extends dx.b, UfgFormReportDetails>> eVar) throws Throwable {
        C1760z c1760z;
        if (eVar instanceof C1760z) {
            c1760z = (C1760z) eVar;
            int i15 = c1760z.f77700g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1760z.f77700g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1760z = new C1760z(eVar);
            }
        } else {
            c1760z = new C1760z(eVar);
        }
        Object objB = c1760z.f77698e;
        Object objE = uq.b.e();
        int i16 = c1760z.f77700g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            a0 a0Var = new a0(processId, null);
            c1760z.f77697d = vq.j.a(processId);
            c1760z.f77700g = 1;
            objB = g0Var.b(a0Var, c1760z);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.Q((VehicleCollisionUfgFormReportDetailsResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object q(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.f>> eVar) throws Throwable {
        d0 d0Var;
        if (eVar instanceof d0) {
            d0Var = (d0) eVar;
            int i15 = d0Var.f77546g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                d0Var.f77546g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                d0Var = new d0(eVar);
            }
        } else {
            d0Var = new d0(eVar);
        }
        Object objB = d0Var.f77544e;
        Object objE = uq.b.e();
        int i16 = d0Var.f77546g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            e0 e0Var = new e0(processId, null);
            d0Var.f77543d = vq.j.a(processId);
            d0Var.f77546g = 1;
            objB = g0Var.b(e0Var, d0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.e((GetCollisionParticipantVehiclesResponse) ((dx.i.Right) iVar).b(), "INITIAL_PAGE");
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object r(Set<ProcessId> set, tq.e<? super dx.i<? extends dx.b, ? extends Set<ProcessId>>> eVar) throws Throwable {
        w0 w0Var;
        if (eVar instanceof w0) {
            w0Var = (w0) eVar;
            int i15 = w0Var.f77686g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                w0Var.f77686g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                w0Var = new w0(eVar);
            }
        } else {
            w0Var = new w0(eVar);
        }
        Object objB = w0Var.f77684e;
        Object objE = uq.b.e();
        int i16 = w0Var.f77686g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            x0 x0Var = new x0(set, null);
            w0Var.f77683d = vq.j.a(set);
            w0Var.f77686g = 1;
            objB = g0Var.b(x0Var, w0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Set<String> setA = ((VehicleCollisionVerifyStatusResponse) ((dx.i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(pq.v.y(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProcessId((String) it.next()));
        }
        return new dx.i.Right(pq.v.k1(arrayList));
    }

    @Override // jw0.e
    public Object s(ProcessId processId, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new c(processId, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object t(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends sv0.c0>> eVar) throws Throwable {
        x xVar;
        if (eVar instanceof x) {
            xVar = (x) eVar;
            int i15 = xVar.f77690g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                xVar.f77690g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                xVar = new x(eVar);
            }
        } else {
            xVar = new x(eVar);
        }
        Object objB = xVar.f77688e;
        Object objE = uq.b.e();
        int i16 = xVar.f77690g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            y yVar = new y(processId, null);
            xVar.f77687d = processId;
            xVar.f77690g = 1;
            objB = g0Var.b(yVar, xVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            processId = (ProcessId) xVar.f77687d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.g((GetReadyToSignVehicleCollisionStatementDataResponse) ((dx.i.Right) iVar).b(), processId);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object u(ProcessId processId, List<VehicleCollisionFileName> list, tq.e<? super dx.i<? extends dx.b, ? extends List<VehicleCollisionFileName>>> eVar) throws Throwable {
        l0 l0Var;
        if (eVar instanceof l0) {
            l0Var = (l0) eVar;
            int i15 = l0Var.f77606h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                l0Var.f77606h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                l0Var = new l0(eVar);
            }
        } else {
            l0Var = new l0(eVar);
        }
        Object objB = l0Var.f77604f;
        Object objE = uq.b.e();
        int i16 = l0Var.f77606h;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            m0 m0Var = new m0(processId, list, null);
            l0Var.f77602d = vq.j.a(processId);
            l0Var.f77603e = vq.j.a(list);
            l0Var.f77606h = 1;
            objB = g0Var.b(m0Var, l0Var);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.x((RefreshVehicleCollisionParticipantImagesResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object v(ProcessId processId, tq.e<? super dx.i<? extends dx.b, FileImageConfiguration>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f77574g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f77574g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f77572e;
        Object objE = uq.b.e();
        int i16 = hVar.f77574g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            i iVar = new i(processId, null);
            hVar.f77571d = vq.j.a(processId);
            hVar.f77574g = 1;
            objB = g0Var.b(iVar, hVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(ew0.d.H((ConfigurationForPhotosCompressionMobileResponse) ((dx.i.Right) iVar2).b(), this.currentTimeProvider));
        }
        throw new oq.p();
    }

    @Override // jw0.e
    public Object w(ProcessId processId, sv0.a0 a0Var, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new p0(processId, a0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object x(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.c0.b.ReportedToUfo>> eVar) throws Throwable {
        v vVar;
        if (eVar instanceof v) {
            vVar = (v) eVar;
            int i15 = vVar.f77676g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                vVar.f77676g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                vVar = new v(eVar);
            }
        } else {
            vVar = new v(eVar);
        }
        Object objB = vVar.f77674e;
        Object objE = uq.b.e();
        int i16 = vVar.f77676g;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            w wVar = new w(processId, null);
            vVar.f77673d = processId;
            vVar.f77676g = 1;
            objB = g0Var.b(wVar, vVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            processId = (ProcessId) vVar.f77673d;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.s((VehicleCollisionReportedToUfgDetailsResponse) ((dx.i.Right) iVar).b(), processId);
        }
        throw new oq.p();
    }

    @Override // jw0.e
    public Object y(ProcessId processId, iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return this.networkCallMediator.b(new j0(processId, b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.e
    public Object z(ProcessId processId, String str, tq.e<? super dx.i<? extends dx.b, sv0.f>> eVar) throws Throwable {
        r rVar;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i15 = rVar.f77645h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f77645h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object objB = rVar.f77643f;
        Object objE = uq.b.e();
        int i16 = rVar.f77645h;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            s sVar = new s(processId, str, null);
            rVar.f77641d = vq.j.a(processId);
            rVar.f77642e = str;
            rVar.f77645h = 1;
            objB = g0Var.b(sVar, rVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) rVar.f77642e;
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ew0.d.e((GetCollisionParticipantVehiclesResponse) ((dx.i.Right) iVar).b(), str);
        }
        throw new oq.p();
    }
}
