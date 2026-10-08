package pc4;

import cb4.DialogData;
import fr0.BEDocumentConfigLabel;
import g24.AdditionalLogo;
import g24.BarcodeSchema;
import g24.DocumentActionAttribute;
import g24.DocumentBottomAnnotationSection;
import g24.DocumentDynamicSection;
import g24.DocumentSchemaAttribute;
import g24.DocumentSchemaForwardAttribute;
import g24.DocumentsGroup;
import g24.MissingDocumentAttribute;
import g24.QrCodeSchema;
import gr0.BeAdditionalLogo;
import gr0.DocumentSchemaLabel;
import gv1.DocumentBottomAnnotation;
import gv1.DocumentConfigLabel;
import gv1.DocumentSchema;
import gv1.DocumentSchemaBooleanTranslation;
import gv1.DocumentSchemaEnumTranslation;
import gv1.DocumentStaticSection;
import gv1.DocumentTopAnnotation;
import gv1.PictureSchema;
import h24.MultiDocumentView;
import hv1.MultiDocumentSchema;
import hv1.MultiDocumentSelectorLabel;
import hv1.VerificationSelector;
import i24.DynamicDocumentScope;
import i34.DocumentMaintenanceBreakError;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l34.DynamicDocumentDataContainer;
import lv1.UserDocumentData;
import mv1.Document;
import mv1.DynamicDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0002\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lpc4/s3;", "", "<init>", "()V", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/l;", "refreshDocumentsStatusesUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lez/c;", "dateConverter", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/w;", "deleteDocumentUseCase", "Lq34/u;", "legacyDeleteDocumentByIdUC", "Lk24/a;", "containersDeleteDocumentByIdUC", "Lw24/n;", "deleteDocumentByTypeUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lr34/b;", "getMaintenanceBreakDialogFromDocumentConfigUC", "Lq34/k1;", "isDocumentAddedUseCase", "Lw24/f2;", "isDocumentAddedByTypeUC", "Lq34/l1;", "isDocumentStoredByIdUC", "Lq34/n0;", "getDynamicDocumentFromContainerUseCase", "Lq34/d0;", "getByIdDynamicDocumentFromContainerUC", "Lq34/b0;", "getAllByIdDynamicDocumentsFromContainerUC", "Lq34/p0;", "getDynamicMultiDocumentFromContainerUC", "Lq34/s1;", "monitorDocumentsSummaryDataUC", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lw24/q0;", "getDynamicDocumentDataUC", "Lw24/o0;", "getDynamicDocumentDataByTypeUC", "Lw24/x;", "getAllDynamicDocumentsDataByTypeUC", "Lw24/b1;", "getMultiDynamicDocumentDataByTypeUC", "Lay/i;", "jsonFieldParser", "Lj34/d;", "getDocumentDeletionDialogUC", "Lkv1/a;", "a", "(Lg34/c;Lc54/b;Lk24/g;Lk24/l;Lq34/v1;Lq34/x0;Lw24/x0;Lez/c;Lq34/j0;Lw24/k0;Lq34/w;Lq34/u;Lk24/a;Lw24/n;Lr34/e;Lr34/b;Lq34/k1;Lw24/f2;Lq34/l1;Lq34/n0;Lq34/d0;Lq34/b0;Lq34/p0;Lq34/s1;Lq34/d;Lw24/q0;Lw24/o0;Lw24/x;Lw24/b1;Lay/i;Lj34/d;)Lkv1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f155901a = new s3();

    @Metadata(d1 = {"\u0000£\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00102\u001a\u000201*\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010B\u001a\u00020A*\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010F\u001a\u00020E*\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010N\u001a\u00020M*\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0013\u0010R\u001a\u00020Q*\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0013\u0010V\u001a\u00020U*\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0013\u0010Z\u001a\u00020Y*\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0013\u0010^\u001a\u00020]*\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010b\u001a\u00020a*\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u0013\u0010f\u001a\u00020e*\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u0013\u0010j\u001a\u00020i*\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010n\u001a\u00020m*\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0013\u0010r\u001a\u00020q*\u00020pH\u0002¢\u0006\u0004\br\u0010sJ\u0013\u0010v\u001a\u00020u*\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u0013\u0010z\u001a\u00020y*\u00020xH\u0002¢\u0006\u0004\bz\u0010{J\u0013\u0010~\u001a\u00020}*\u00020|H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u0001*\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0017\u0010\u008d\u0001\u001a\u00020\u0019*\u00030\u008c\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0017\u0010\u0090\u0001\u001a\u00020\u001d*\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0017\u0010\u0093\u0001\u001a\u00020!*\u00030\u0092\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0017\u0010\u0096\u0001\u001a\u00020%*\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0017\u0010\u0099\u0001\u001a\u00020)*\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u0001*\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0018\u0010¡\u0001\u001a\u00030 \u0001*\u00030\u009f\u0001H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0018\u0010¤\u0001\u001a\u00030\u009c\u0001*\u00030£\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0018\u0010§\u0001\u001a\u00030 \u0001*\u00030¦\u0001H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0017\u0010ª\u0001\u001a\u00020-*\u00030©\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0017\u0010\u00ad\u0001\u001a\u000205*\u00030¬\u0001H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0017\u0010°\u0001\u001a\u000209*\u00030¯\u0001H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0017\u0010³\u0001\u001a\u00020=*\u00030²\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0017\u0010¶\u0001\u001a\u00020A*\u00030µ\u0001H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0017\u0010¹\u0001\u001a\u00020E*\u00030¸\u0001H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0017\u0010¼\u0001\u001a\u00020I*\u00030»\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0017\u0010¿\u0001\u001a\u000201*\u00030¾\u0001H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0017\u0010Â\u0001\u001a\u00020M*\u00030Á\u0001H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0017\u0010Å\u0001\u001a\u00020Q*\u00030Ä\u0001H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0017\u0010È\u0001\u001a\u00020U*\u00030Ç\u0001H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0017\u0010Ë\u0001\u001a\u00020Y*\u00030Ê\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0017\u0010Î\u0001\u001a\u00020]*\u00030Í\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0017\u0010Ñ\u0001\u001a\u00020a*\u00030Ð\u0001H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0017\u0010Ô\u0001\u001a\u00020e*\u00030Ó\u0001H\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0017\u0010×\u0001\u001a\u00020i*\u00030Ö\u0001H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u0017\u0010Ú\u0001\u001a\u00020m*\u00030Ù\u0001H\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u0017\u0010Ý\u0001\u001a\u00020q*\u00030Ü\u0001H\u0002¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u0017\u0010à\u0001\u001a\u00020u*\u00030ß\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0017\u0010ã\u0001\u001a\u00020y*\u00030â\u0001H\u0002¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0017\u0010æ\u0001\u001a\u00020}*\u00030å\u0001H\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0017\u0010é\u0001\u001a\u00020A*\u00030è\u0001H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0018\u0010ì\u0001\u001a\u00030\u0081\u0001*\u00030ë\u0001H\u0002¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0018\u0010ï\u0001\u001a\u00030\u0085\u0001*\u00030î\u0001H\u0002¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u0018\u0010ò\u0001\u001a\u00030\u0089\u0001*\u00030ñ\u0001H\u0002¢\u0006\u0006\bò\u0001\u0010ó\u0001J\"\u0010÷\u0001\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030ö\u00010ô\u0001H\u0096@¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\"\u0010ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030ù\u00010ô\u0001H\u0096@¢\u0006\u0006\bú\u0001\u0010ø\u0001JB\u0010\u0080\u0002\u001a\u0010\u0012\u0005\u0012\u00030õ\u0001\u0012\u0004\u0012\u00020\u00030ô\u00012\n\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00012\b\u0010þ\u0001\u001a\u00030ý\u00012\t\u0010ÿ\u0001\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J7\u0010\u0082\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030ö\u00010ô\u00012\t\u0010ÿ\u0001\u001a\u0004\u0018\u00010\n2\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0096@¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J-\u0010\u0084\u0002\u001a\u0012\u0012\u0005\u0012\u00030õ\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0ô\u00012\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0096@¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J,\u0010\u0086\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030ö\u00010ô\u00012\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0096@¢\u0006\u0006\b\u0086\u0002\u0010\u0085\u0002J,\u0010\u0088\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030\u0087\u00020ô\u00012\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0096@¢\u0006\u0006\b\u0088\u0002\u0010\u0085\u0002J,\u0010\u0089\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030\u0087\u00020ô\u00012\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0096@¢\u0006\u0006\b\u0089\u0002\u0010\u0085\u0002J+\u0010\u008c\u0002\u001a\u0010\u0012\u0005\u0012\u00030õ\u0001\u0012\u0004\u0012\u00020\r0ô\u00012\b\u0010\u008b\u0002\u001a\u00030\u008a\u0002H\u0096@¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J4\u0010\u008e\u0002\u001a\u0010\u0012\u0005\u0012\u00030õ\u0001\u0012\u0004\u0012\u00020\r0ô\u00012\b\u0010\u008b\u0002\u001a\u00030\u008a\u00022\u0007\u0010ÿ\u0001\u001a\u00020\nH\u0096@¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J2\u0010\u0091\u0002\u001a\u0017\u0012\u0005\u0012\u00030õ\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\r0\u0090\u00020ô\u00012\b\u0010\u008b\u0002\u001a\u00030\u008a\u0002H\u0096@¢\u0006\u0006\b\u0091\u0002\u0010\u008d\u0002J,\u0010\u0095\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030\u0094\u00020ô\u00012\b\u0010\u0093\u0002\u001a\u00030\u0092\u0002H\u0096@¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001a\u0010\u0098\u0002\u001a\n\u0012\u0005\u0012\u00030\u008a\u00020\u0097\u0002H\u0016¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J1\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009c\u00022\b\u0010þ\u0001\u001a\u00030ý\u00012\u000f\u0010\u009b\u0002\u001a\n\u0012\u0005\u0012\u00030ö\u00010\u009a\u0002H\u0096@¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J,\u0010¡\u0002\u001a\u0011\u0012\u0005\u0012\u00030ö\u0001\u0012\u0005\u0012\u00030\u009c\u00020ô\u00012\b\u0010 \u0002\u001a\u00030\u009f\u0002H\u0096@¢\u0006\u0006\b¡\u0002\u0010¢\u0002J \u0010¤\u0002\u001a\u0005\u0018\u00010\u009c\u00022\b\u0010£\u0002\u001a\u00030õ\u0001H\u0096@¢\u0006\u0006\b¤\u0002\u0010¥\u0002J=\u0010§\u0002\u001a\u0011\u0012\u0005\u0012\u00030õ\u0001\u0012\u0005\u0012\u00030\u009c\u00020ô\u00012\b\u0010þ\u0001\u001a\u00030ý\u00012\u000f\u0010¦\u0002\u001a\n\u0012\u0005\u0012\u00030ö\u00010\u009a\u0002H\u0096@¢\u0006\u0006\b§\u0002\u0010\u009e\u0002¨\u0006¨\u0002"}, d2 = {"pc4/s3$a", "Lkv1/a;", "Lf24/h;", "Lmv1/b;", "O", "(Lf24/h;)Lmv1/b;", "Ler0/h;", "N", "(Ler0/h;)Lmv1/b;", "Li24/o;", "", "mainDocumentPhoto", "status", "Lmv1/c;", "R", "(Li24/o;Ljava/lang/String;Lmv1/b;)Lmv1/c;", "Lf24/e;", "Lmv1/a;", "K", "(Lf24/e;)Lmv1/a;", "Li24/p;", "Lgv1/t;", ip.a.f96137b, "(Li24/p;)Liy/b0;", "Lg24/h;", "Lgv1/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lg24/h;)Lgv1/i;", "Lg24/m;", "Lgv1/n;", "Z", "(Lg24/m;)Lgv1/n;", "Lg24/t;", "Lgv1/v;", "n0", "(Lg24/t;)Lgv1/v;", "Lg24/a;", "Lgv1/a;", "v", "(Lg24/a;)Lgv1/a;", "Lg24/i;", "Lgv1/j;", "t0", "(Lg24/i;)Lgv1/j;", "Lg24/r;", "Lgv1/s;", "I", "(Lg24/r;)Lgv1/s;", "Lg24/l;", "Lgv1/m;", "X", "(Lg24/l;)Lgv1/m;", "Lg24/s;", "Lgv1/u;", "d0", "(Lg24/s;)Lgv1/u;", "Lg24/s$a;", "Lgv1/u$a;", "l0", "(Lg24/s$a;)Lgv1/u$a;", "Lg24/n;", "Lgv1/o;", "v0", "(Lg24/n;)Lgv1/o;", "Lg24/g;", "Lgv1/h;", "b0", "(Lg24/g;)Lgv1/h;", "Lg24/k;", "Lgv1/l;", "V", "(Lg24/k;)Lgv1/l;", "Lg24/j;", "Lgv1/k;", "z", "(Lg24/j;)Lgv1/k;", "Lg24/p;", "Lgv1/q;", "D0", "(Lg24/p;)Lgv1/q;", "Lg24/o;", "Lgv1/p;", "B0", "(Lg24/o;)Lgv1/p;", "Lg24/f;", "Lgv1/g;", "T", "(Lg24/f;)Lgv1/g;", "Lg24/u;", "Lgv1/w;", "p0", "(Lg24/u;)Lgv1/w;", "Lg24/u$a;", "Lgv1/w$a;", "r0", "(Lg24/u$a;)Lgv1/w$a;", "Lg24/b;", "Lgv1/b;", "x", "(Lg24/b;)Lgv1/b;", "Lg24/d;", "Lgv1/d;", "B", "(Lg24/d;)Lgv1/d;", "Lg24/e;", "Lgv1/e;", ip.a.f96138c, "(Lg24/e;)Lgv1/e;", "Lh24/c;", "Lhv1/c;", "j0", "(Lh24/c;)Lhv1/c;", "Lh24/c$a;", "Lhv1/c$a;", "f0", "(Lh24/c$a;)Lhv1/c$a;", "Lh24/d;", "Lhv1/d;", "F0", "(Lh24/d;)Lhv1/d;", "Lh24/b;", "Lhv1/b;", "x0", "(Lh24/b;)Lhv1/b;", "Lf24/f;", "Lgv1/f;", "F", "(Lf24/f;)Lgv1/f;", "Lg24/q;", "Lgv1/r;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lg24/q;)Lgv1/r;", "Lg24/q$a;", "Lgv1/r$a;", "z0", "(Lg24/q$a;)Lgv1/r$a;", "Lh24/a;", "Lhv1/a;", "h0", "(Lh24/a;)Lhv1/a;", "Lgr0/h;", "M", "(Lgr0/h;)Lgv1/i;", "Lgr0/m;", "a0", "(Lgr0/m;)Lgv1/n;", "Lgr0/w;", "o0", "(Lgr0/w;)Lgv1/v;", "Lgr0/b;", "w", "(Lgr0/b;)Lgv1/a;", "Lgr0/i;", "u0", "(Lgr0/i;)Lgv1/j;", "Lg24/c;", "Lgv1/c;", "r", "(Lg24/c;)Lgv1/c;", "Lg24/c$a;", "Lgv1/c$a;", "t", "(Lg24/c$a;)Lgv1/c$a;", "Lgr0/d;", "s", "(Lgr0/d;)Lgv1/c;", "Lgr0/d$a;", "u", "(Lgr0/d$a;)Lgv1/c$a;", "Lgr0/s;", "J", "(Lgr0/s;)Lgv1/s;", "Lgr0/v;", "e0", "(Lgr0/v;)Lgv1/u;", "Lgr0/v$a;", "m0", "(Lgr0/v$a;)Lgv1/u$a;", "Lgr0/n;", "w0", "(Lgr0/n;)Lgv1/o;", "Lgr0/n$a;", "c0", "(Lgr0/n$a;)Lgv1/h;", "Lgr0/k;", "W", "(Lgr0/k;)Lgv1/l;", "Lgr0/j;", "A", "(Lgr0/j;)Lgv1/k;", "Lgr0/l;", "Y", "(Lgr0/l;)Lgv1/m;", "Lgr0/p;", "E0", "(Lgr0/p;)Lgv1/q;", "Lgr0/o;", "C0", "(Lgr0/o;)Lgv1/p;", "Lgr0/g;", "U", "(Lgr0/g;)Lgv1/g;", "Lgr0/x;", "q0", "(Lgr0/x;)Lgv1/w;", "Lgr0/x$a;", "s0", "(Lgr0/x$a;)Lgv1/w$a;", "Lgr0/a;", "y", "(Lgr0/a;)Lgv1/b;", "Lgr0/e;", "C", "(Lgr0/e;)Lgv1/d;", "Lgr0/f;", "E", "(Lgr0/f;)Lgv1/e;", "Lhr0/c;", "k0", "(Lhr0/c;)Lhv1/c;", "Lhr0/c$a;", "g0", "(Lhr0/c$a;)Lhv1/c$a;", "Lhr0/d;", "G0", "(Lhr0/d;)Lhv1/d;", "Lhr0/b;", "y0", "(Lhr0/b;)Lhv1/b;", "Lfr0/f;", "G", "(Lfr0/f;)Lgv1/f;", "Lfr0/f$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lfr0/f$a;)Lgv1/h;", "Lgr0/q;", "Q", "(Lgr0/q;)Lgv1/r;", "Lgr0/q$a;", "A0", "(Lgr0/q$a;)Lgv1/r$a;", "Lhr0/a;", "i0", "(Lhr0/a;)Lhv1/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Llv1/d;", "q", "Ljava/util/Date;", "expirationDate", "Lrq0/b;", "documentType", "documentId", "k", "(Ljava/util/Date;Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "o", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "n", "", "g", "e", "Lrq0/b$b;", "dynamicDocumentType", "i", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "h", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "p", "Lrq0/b$c;", "dynamicMultiDocumentType", "Lmv1/d;", "l", "(Lrq0/b$c;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "j", "()Lmu/g;", "Lkotlin/Function0;", "onCloseDialog", "Lcb4/d;", "m", "(Lrq0/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lrq0/c;", "service", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "onDelete", "f", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements kv1.a {
        final /* synthetic */ q34.s1 A;
        final /* synthetic */ r34.b B;
        final /* synthetic */ q34.d C;
        final /* synthetic */ j34.d D;
        final /* synthetic */ ay.i E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.g f155903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.l f155905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.v1 f155906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.x0 f155907f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.x0 f155908g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w24.k0 f155909h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q34.j0 f155910i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w24.n f155911j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ k24.a f155912k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.w f155913l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q34.u f155914m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ r34.e f155915n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ w24.f2 f155916o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q34.k1 f155917p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q34.l1 f155918q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ w24.o0 f155919r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ q34.n0 f155920s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ez.c f155921t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ w24.q0 f155922u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ q34.d0 f155923v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ w24.x f155924w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ q34.b0 f155925x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ w24.b1 f155926y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ q34.p0 f155927z;

        /* JADX INFO: renamed from: pc4.s3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3866a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155929b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f155930c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int[] f155931d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ int[] f155932e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ int[] f155933f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ int[] f155934g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final /* synthetic */ int[] f155935h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final /* synthetic */ int[] f155936i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ int[] f155937j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final /* synthetic */ int[] f155938k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int[] f155939l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final /* synthetic */ int[] f155940m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final /* synthetic */ int[] f155941n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final /* synthetic */ int[] f155942o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final /* synthetic */ int[] f155943p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final /* synthetic */ int[] f155944q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final /* synthetic */ int[] f155945r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final /* synthetic */ int[] f155946s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final /* synthetic */ int[] f155947t;

            static {
                int[] iArr = new int[f24.c.values().length];
                try {
                    iArr[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f155928a = iArr;
                int[] iArr2 = new int[f24.h.values().length];
                try {
                    iArr2[f24.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[f24.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f24.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[f24.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                f155929b = iArr2;
                int[] iArr3 = new int[er0.h.values().length];
                try {
                    iArr3[er0.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[er0.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[er0.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[er0.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[er0.h.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused12) {
                }
                f155930c = iArr3;
                int[] iArr4 = new int[g24.r.values().length];
                try {
                    iArr4[g24.r.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr4[g24.r.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr4[g24.r.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr4[g24.r.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr4[g24.r.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr4[g24.r.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr4[g24.r.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr4[g24.r.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr4[g24.r.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr4[g24.r.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused22) {
                }
                f155931d = iArr4;
                int[] iArr5 = new int[g24.l.values().length];
                try {
                    iArr5[g24.l.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr5[g24.l.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused24) {
                }
                f155932e = iArr5;
                int[] iArr6 = new int[MissingDocumentAttribute.a.values().length];
                try {
                    iArr6[MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr6[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr6[MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused27) {
                }
                f155933f = iArr6;
                int[] iArr7 = new int[g24.g.values().length];
                try {
                    iArr7[g24.g.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr7[g24.g.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr7[g24.g.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr7[g24.g.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused31) {
                }
                f155934g = iArr7;
                int[] iArr8 = new int[QrCodeSchema.a.values().length];
                try {
                    iArr8[QrCodeSchema.a.QR_CODE_V10.ordinal()] = 1;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr8[QrCodeSchema.a.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused33) {
                }
                f155935h = iArr8;
                int[] iArr9 = new int[MultiDocumentView.a.values().length];
                try {
                    iArr9[MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr9[MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr9[MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused36) {
                }
                f155936i = iArr9;
                int[] iArr10 = new int[DocumentsGroup.a.values().length];
                try {
                    iArr10[DocumentsGroup.a.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr10[DocumentsGroup.a.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr10[DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused39) {
                }
                f155937j = iArr10;
                int[] iArr11 = new int[DocumentActionAttribute.a.b.values().length];
                try {
                    iArr11[DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr11[DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_PHD_PDF_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr11[DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_DSC_PDF_LIST.ordinal()] = 3;
                } catch (NoSuchFieldError unused42) {
                }
                f155938k = iArr11;
                int[] iArr12 = new int[gr0.DocumentActionAttribute.a.b.values().length];
                try {
                    iArr12[gr0.DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr12[gr0.DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_PHD_PDF_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr12[gr0.DocumentActionAttribute.a.b.ELECTRONIC_DIPLOMA_DSC_PDF_LIST.ordinal()] = 3;
                } catch (NoSuchFieldError unused45) {
                }
                f155939l = iArr12;
                int[] iArr13 = new int[gr0.s.values().length];
                try {
                    iArr13[gr0.s.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr13[gr0.s.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr13[gr0.s.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr13[gr0.s.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr13[gr0.s.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr13[gr0.s.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr13[gr0.s.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr13[gr0.s.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr13[gr0.s.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr13[gr0.s.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused55) {
                }
                f155940m = iArr13;
                int[] iArr14 = new int[gr0.MissingDocumentAttribute.a.values().length];
                try {
                    iArr14[gr0.MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr14[gr0.MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr14[gr0.MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused58) {
                }
                f155941n = iArr14;
                int[] iArr15 = new int[DocumentSchemaLabel.a.values().length];
                try {
                    iArr15[DocumentSchemaLabel.a.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr15[DocumentSchemaLabel.a.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr15[DocumentSchemaLabel.a.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr15[DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused62) {
                }
                f155942o = iArr15;
                int[] iArr16 = new int[gr0.l.values().length];
                try {
                    iArr16[gr0.l.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr16[gr0.l.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused64) {
                }
                f155943p = iArr16;
                int[] iArr17 = new int[gr0.QrCodeSchema.a.values().length];
                try {
                    iArr17[gr0.QrCodeSchema.a.QR_CODE_V10.ordinal()] = 1;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr17[gr0.QrCodeSchema.a.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused66) {
                }
                f155944q = iArr17;
                int[] iArr18 = new int[hr0.MultiDocumentView.a.values().length];
                try {
                    iArr18[hr0.MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr18[hr0.MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr18[hr0.MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused69) {
                }
                f155945r = iArr18;
                int[] iArr19 = new int[BEDocumentConfigLabel.a.values().length];
                try {
                    iArr19[BEDocumentConfigLabel.a.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr19[BEDocumentConfigLabel.a.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr19[BEDocumentConfigLabel.a.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr19[BEDocumentConfigLabel.a.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused73) {
                }
                f155946s = iArr19;
                int[] iArr20 = new int[gr0.DocumentsGroup.a.values().length];
                try {
                    iArr20[gr0.DocumentsGroup.a.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr20[gr0.DocumentsGroup.a.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr20[gr0.DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused76) {
                }
                f155947t = iArr20;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155948d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155949e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155950f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155951g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155952h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155953j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155954k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155955l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155956m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155957n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155958p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155959q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155961s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155959q = obj;
                this.f155961s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155962d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155963e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155964f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155965g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155966h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155967j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155968k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155969l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155970m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155971n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155972p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155974r;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155972p = obj;
                this.f155974r |= PKIFailureInfo.systemUnavail;
                return a.this.n(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {
            int B;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155975d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155976e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155977f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155978g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155979h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155980j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155981k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155982l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155983m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f155984n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f155985p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f155986q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155987r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155988s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f155989t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f155990v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f155991w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f155992x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f155993y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            /* synthetic */ Object f155994z;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155994z = obj;
                this.B |= PKIFailureInfo.systemUnavail;
                return a.this.h(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {
            int A;
            int B;
            int C;
            int D;
            int E;
            int F;
            int G;
            int H;
            int I;
            /* synthetic */ Object K;
            int O;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155995d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155996e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155997f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155998g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155999h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156000j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156001k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156002l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156003m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f156004n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f156005p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f156006q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f156007r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f156008s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f156009t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f156010v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f156011w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f156012x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            Object f156013y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            int f156014z;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.K = obj;
                this.O |= PKIFailureInfo.systemUnavail;
                return a.this.p(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156015d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156016e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156017f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156018g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156019h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156020j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156021k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156022l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156023m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f156024n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156026q;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156024n = obj;
                this.f156026q |= PKIFailureInfo.systemUnavail;
                return a.this.o(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156027d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156028e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156029f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156030g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156031h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156032j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156033k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156034l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156035m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156036n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156037p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156038q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f156039r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f156041t;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156039r = obj;
                this.f156041t |= PKIFailureInfo.systemUnavail;
                return a.this.k(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {
            int A;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156042d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156043e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156044f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156045g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156046h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156047j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156048k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156049l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156050m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f156051n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f156052p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156053q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156054r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156055s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f156056t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f156057v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f156058w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f156059x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            /* synthetic */ Object f156060y;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156060y = obj;
                this.A |= PKIFailureInfo.systemUnavail;
                return a.this.i(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class i extends vq.d {
            int A;
            int B;
            int C;
            int D;
            int E;
            int F;
            int G;
            int H;
            /* synthetic */ Object I;
            int L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156062d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156063e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156064f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156065g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156066h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156067j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156068k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156069l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156070m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f156071n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f156072p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f156073q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f156074r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f156075s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f156076t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f156077v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f156078w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f156079x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f156080y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            int f156081z;

            i(tq.e<? super i> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.I = obj;
                this.L |= PKIFailureInfo.systemUnavail;
                return a.this.l(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class j extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156082d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156084f;

            j(tq.e<? super j> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156082d = obj;
                this.f156084f |= PKIFailureInfo.systemUnavail;
                return a.this.q(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class k extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156085d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156086e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156087f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156089h;

            k(tq.e<? super k> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156087f = obj;
                this.f156089h |= PKIFailureInfo.systemUnavail;
                return a.this.m(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class l extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156090d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156091e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156092f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156093g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156094h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156095j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156096k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156097l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156098m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156099n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156100p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156102r;

            l(tq.e<? super l> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156100p = obj;
                this.f156102r |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class m extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156103d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156104e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156105f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156106g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156107h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156108j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156109k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156110l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156111m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f156112n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156114q;

            m(tq.e<? super m> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156112n = obj;
                this.f156114q |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class n implements mu.g<rq0.b.EnumC4479b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f156115a;

            /* JADX INFO: renamed from: pc4.s3$a$n$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3867a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f156116a;

                /* JADX INFO: renamed from: pc4.s3$a$n$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C3868a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f156117d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f156118e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f156119f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f156121h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f156122j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f156123k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f156124l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    int f156125m;

                    public C3868a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f156117d = obj;
                        this.f156118e |= PKIFailureInfo.systemUnavail;
                        return C3867a.this.F(null, this);
                    }
                }

                public C3867a(mu.h hVar) {
                    this.f156116a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C3868a c3868a;
                    if (eVar instanceof C3868a) {
                        c3868a = (C3868a) eVar;
                        int i15 = c3868a.f156118e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c3868a.f156118e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c3868a = new C3868a(eVar);
                        }
                    } else {
                        c3868a = new C3868a(eVar);
                    }
                    Object obj2 = c3868a.f156117d;
                    Object objE = uq.b.e();
                    int i16 = c3868a.f156118e;
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        mu.h hVar = this.f156116a;
                        rq0.b documentType = ((k34.o) obj).getDocumentType();
                        rq0.b.EnumC4479b enumC4479b = documentType instanceof rq0.b.EnumC4479b ? (rq0.b.EnumC4479b) documentType : null;
                        if (enumC4479b != null) {
                            c3868a.f156119f = vq.j.a(obj);
                            c3868a.f156121h = vq.j.a(c3868a);
                            c3868a.f156122j = vq.j.a(obj);
                            c3868a.f156123k = vq.j.a(hVar);
                            c3868a.f156124l = vq.j.a(enumC4479b);
                            c3868a.f156125m = 0;
                            c3868a.f156118e = 1;
                            if (hVar.F(enumC4479b, c3868a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return oq.i0.f148189a;
                }
            }

            public n(mu.g gVar) {
                this.f156115a = gVar;
            }

            @Override // mu.g
            public Object a(mu.h<? super rq0.b.EnumC4479b> hVar, tq.e eVar) {
                Object objA = this.f156115a.a(new C3867a(hVar), eVar);
                return objA == uq.b.e() ? objA : oq.i0.f148189a;
            }
        }

        a(c54.b bVar, k24.g gVar, g34.c cVar, k24.l lVar, q34.v1 v1Var, w24.x0 x0Var, q34.x0 x0Var2, w24.k0 k0Var, q34.j0 j0Var, w24.n nVar, k24.a aVar, q34.w wVar, q34.u uVar, r34.e eVar, w24.f2 f2Var, q34.k1 k1Var, q34.l1 l1Var, w24.o0 o0Var, q34.n0 n0Var, ez.c cVar2, w24.q0 q0Var, q34.d0 d0Var, w24.x xVar, q34.b0 b0Var, w24.b1 b1Var, q34.p0 p0Var, q34.s1 s1Var, r34.b bVar2, q34.d dVar, j34.d dVar2, ay.i iVar) {
            this.f155902a = bVar;
            this.f155903b = gVar;
            this.f155904c = cVar;
            this.f155905d = lVar;
            this.f155906e = v1Var;
            this.f155907f = x0Var;
            this.f155908g = x0Var2;
            this.f155909h = k0Var;
            this.f155910i = j0Var;
            this.f155911j = nVar;
            this.f155912k = aVar;
            this.f155913l = wVar;
            this.f155914m = uVar;
            this.f155915n = eVar;
            this.f155916o = f2Var;
            this.f155917p = k1Var;
            this.f155918q = l1Var;
            this.f155919r = o0Var;
            this.f155920s = n0Var;
            this.f155921t = cVar2;
            this.f155922u = q0Var;
            this.f155923v = d0Var;
            this.f155924w = xVar;
            this.f155925x = b0Var;
            this.f155926y = b1Var;
            this.f155927z = p0Var;
            this.A = s1Var;
            this.B = bVar2;
            this.C = dVar;
            this.D = dVar2;
            this.E = iVar;
        }

        private final DocumentSchemaBooleanTranslation A(gr0.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            List<DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(w0((DocumentSchemaLabel) it4.next()));
            }
            return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final gv1.DocumentsGroup.a A0(gr0.DocumentsGroup.a aVar) {
            int i15 = C3866a.f155947t[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.DocumentsGroup.a.ASC;
            }
            if (i15 == 2) {
                return gv1.DocumentsGroup.a.DESC;
            }
            if (i15 == 3) {
                return gv1.DocumentsGroup.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final DocumentBottomAnnotation B(g24.DocumentBottomAnnotation documentBottomAnnotation) {
            List<DocumentBottomAnnotationSection> listA = documentBottomAnnotation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(D((DocumentBottomAnnotationSection) it.next()));
            }
            return new DocumentBottomAnnotation(arrayList);
        }

        private final DocumentStaticSection B0(g24.DocumentStaticSection documentStaticSection) {
            List<g24.DocumentSchemaLabel> listA = documentStaticSection.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new DocumentStaticSection(arrayList);
        }

        private final DocumentBottomAnnotation C(gr0.DocumentBottomAnnotation documentBottomAnnotation) {
            List<gr0.DocumentBottomAnnotationSection> listA = documentBottomAnnotation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(E((gr0.DocumentBottomAnnotationSection) it.next()));
            }
            return new DocumentBottomAnnotation(arrayList);
        }

        private final DocumentStaticSection C0(gr0.DocumentStaticSection documentStaticSection) {
            List<DocumentSchemaLabel> listA = documentStaticSection.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new DocumentStaticSection(arrayList);
        }

        private final gv1.DocumentBottomAnnotationSection D(DocumentBottomAnnotationSection documentBottomAnnotationSection) {
            ArrayList arrayList;
            List<g24.DocumentSchemaLabel> listA = documentBottomAnnotationSection.a();
            ArrayList arrayList2 = null;
            if (listA != null) {
                List<g24.DocumentSchemaLabel> list = listA;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
                }
            } else {
                arrayList = null;
            }
            String linkUrl = documentBottomAnnotationSection.getLinkUrl();
            List<g24.DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
            if (listB != null) {
                List<g24.DocumentSchemaLabel> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(v0((g24.DocumentSchemaLabel) it4.next()));
                }
            }
            return new gv1.DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
        }

        private final DocumentTopAnnotation D0(g24.DocumentTopAnnotation documentTopAnnotation) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<g24.DocumentSchemaLabel> listD = documentTopAnnotation.d();
            if (listD != null) {
                List<g24.DocumentSchemaLabel> list = listD;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<g24.DocumentSchemaLabel> listB = documentTopAnnotation.b();
            if (listB != null) {
                List<g24.DocumentSchemaLabel> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(v0((g24.DocumentSchemaLabel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            List<g24.DocumentStaticSection> listC = documentTopAnnotation.c();
            if (listC != null) {
                List<g24.DocumentStaticSection> list3 = listC;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(B0((g24.DocumentStaticSection) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
            return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? T(dynamicSections) : null);
        }

        private final gv1.DocumentBottomAnnotationSection E(gr0.DocumentBottomAnnotationSection documentBottomAnnotationSection) {
            ArrayList arrayList;
            List<DocumentSchemaLabel> listA = documentBottomAnnotationSection.a();
            ArrayList arrayList2 = null;
            if (listA != null) {
                List<DocumentSchemaLabel> list = listA;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(w0((DocumentSchemaLabel) it.next()));
                }
            } else {
                arrayList = null;
            }
            String linkUrl = documentBottomAnnotationSection.getLinkUrl();
            List<DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
            if (listB != null) {
                List<DocumentSchemaLabel> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(w0((DocumentSchemaLabel) it4.next()));
                }
            }
            return new gv1.DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
        }

        private final DocumentTopAnnotation E0(gr0.DocumentTopAnnotation documentTopAnnotation) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<DocumentSchemaLabel> listD = documentTopAnnotation.d();
            if (listD != null) {
                List<DocumentSchemaLabel> list = listD;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(w0((DocumentSchemaLabel) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<DocumentSchemaLabel> listB = documentTopAnnotation.b();
            if (listB != null) {
                List<DocumentSchemaLabel> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(w0((DocumentSchemaLabel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            List<gr0.DocumentStaticSection> listC = documentTopAnnotation.c();
            if (listC != null) {
                List<gr0.DocumentStaticSection> list3 = listC;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(C0((gr0.DocumentStaticSection) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            gr0.DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
            return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? U(dynamicSections) : null);
        }

        private final DocumentConfigLabel F(f24.DocumentConfigLabel documentConfigLabel) {
            g24.g language = documentConfigLabel.getLanguage();
            return new DocumentConfigLabel(language != null ? b0(language) : null, documentConfigLabel.getValue());
        }

        private final VerificationSelector F0(h24.VerificationSelector verificationSelector) {
            return new VerificationSelector(T(verificationSelector.getDynamicSections()), x0(verificationSelector.getLabel()));
        }

        private final DocumentConfigLabel G(BEDocumentConfigLabel bEDocumentConfigLabel) {
            BEDocumentConfigLabel.a language = bEDocumentConfigLabel.getLanguage();
            return new DocumentConfigLabel(language != null ? H(language) : null, bEDocumentConfigLabel.getValue());
        }

        private final VerificationSelector G0(hr0.VerificationSelector verificationSelector) {
            return new VerificationSelector(U(verificationSelector.getDynamicSections()), y0(verificationSelector.getLabel()));
        }

        private final gv1.h H(BEDocumentConfigLabel.a aVar) {
            int i15 = C3866a.f155946s[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.h.PL;
            }
            if (i15 == 2) {
                return gv1.h.EN;
            }
            if (i15 == 3) {
                return gv1.h.UK;
            }
            if (i15 == 4) {
                return gv1.h.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.s I(g24.r rVar) {
            switch (C3866a.f155931d[rVar.ordinal()]) {
                case 1:
                    return gv1.s.TEXT;
                case 2:
                    return gv1.s.NAME;
                case 3:
                    return gv1.s.DATE;
                case 4:
                    return gv1.s.DATE_TIME;
                case 5:
                    return gv1.s.NUMBER;
                case 6:
                    return gv1.s.NOTE;
                case 7:
                    return gv1.s.ENUM;
                case 8:
                    return gv1.s.BOOLEAN;
                case 9:
                    return gv1.s.MULTILINE_TEXT;
                case 10:
                    return gv1.s.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final gv1.s J(gr0.s sVar) {
            switch (C3866a.f155940m[sVar.ordinal()]) {
                case 1:
                    return gv1.s.TEXT;
                case 2:
                    return gv1.s.NAME;
                case 3:
                    return gv1.s.DATE;
                case 4:
                    return gv1.s.DATE_TIME;
                case 5:
                    return gv1.s.NUMBER;
                case 6:
                    return gv1.s.NOTE;
                case 7:
                    return gv1.s.ENUM;
                case 8:
                    return gv1.s.BOOLEAN;
                case 9:
                    return gv1.s.MULTILINE_TEXT;
                case 10:
                    return gv1.s.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final Document K(f24.Document document) {
            return new Document(document.getDocumentId(), r2.a(document.getDocumentType()), O(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
        }

        private final DocumentSchema L(g24.DocumentSchema documentSchema) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            String schemaId = documentSchema.getSchemaId();
            String schemaVersion = documentSchema.getSchemaVersion();
            String documentName = documentSchema.getDocumentName();
            PictureSchema pictureSchemaN0 = n0(documentSchema.getPicture());
            String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
            h24.VerificationSelector multiDocumentSelectorForVerification = documentSchema.getMultiDocumentSelectorForVerification();
            VerificationSelector verificationSelectorF0 = multiDocumentSelectorForVerification != null ? F0(multiDocumentSelectorForVerification) : null;
            g24.DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
            DocumentTopAnnotation documentTopAnnotationD0 = topAnnotation != null ? D0(topAnnotation) : null;
            QrCodeSchema qrCode = documentSchema.getQrCode();
            gv1.QrCodeSchema qrCodeSchemaP0 = qrCode != null ? p0(qrCode) : null;
            BarcodeSchema barcode = documentSchema.getBarcode();
            gv1.BarcodeSchema barcodeSchemaX = barcode != null ? x(barcode) : null;
            List<DocumentSchemaAttribute> listF = documentSchema.f();
            if (listF != null) {
                List<DocumentSchemaAttribute> list = listF;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(t0((DocumentSchemaAttribute) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<g24.DocumentSchemaLabel> listC = documentSchema.c();
            if (listC != null) {
                List<g24.DocumentSchemaLabel> list2 = listC;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(v0((g24.DocumentSchemaLabel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            List<DocumentSchemaAttribute> listB = documentSchema.b();
            if (listB != null) {
                List<DocumentSchemaAttribute> list3 = listB;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(t0((DocumentSchemaAttribute) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            List<DocumentActionAttribute> listA = documentSchema.a();
            if (listA != null) {
                List<DocumentActionAttribute> list4 = listA;
                arrayList4 = new ArrayList(pq.v.y(list4, 10));
                Iterator<T> it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(r((DocumentActionAttribute) it6.next()));
                }
            } else {
                arrayList4 = null;
            }
            g24.DocumentBottomAnnotation bottomAnnotation = documentSchema.getBottomAnnotation();
            DocumentBottomAnnotation documentBottomAnnotationB = bottomAnnotation != null ? B(bottomAnnotation) : null;
            MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
            hv1.MultiDocumentView multiDocumentViewJ0 = multiDocumentView != null ? j0(multiDocumentView) : null;
            List<DocumentSchemaForwardAttribute> listI = documentSchema.i();
            DocumentBottomAnnotation documentBottomAnnotation = documentBottomAnnotationB;
            if (listI != null) {
                List<DocumentSchemaForwardAttribute> list5 = listI;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list5, 10));
                Iterator<T> it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(Z((DocumentSchemaForwardAttribute) it7.next()));
                }
                arrayList5 = arrayList6;
            } else {
                arrayList5 = null;
            }
            return new DocumentSchema(schemaId, schemaVersion, documentName, arrayList5, pictureSchemaN0, documentPeselFieldReference, verificationSelectorF0, documentTopAnnotationD0, qrCodeSchemaP0, barcodeSchemaX, arrayList, arrayList2, arrayList3, arrayList4, documentBottomAnnotation, multiDocumentViewJ0);
        }

        private final DocumentSchema M(gr0.DocumentSchema documentSchema) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            String schemaId = documentSchema.getSchemaId();
            String schemaVersion = documentSchema.getSchemaVersion();
            String documentName = documentSchema.getDocumentName();
            PictureSchema pictureSchemaO0 = o0(documentSchema.getPicture());
            String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
            hr0.VerificationSelector multiDocumentSelectorForVerification = documentSchema.getMultiDocumentSelectorForVerification();
            VerificationSelector verificationSelectorG0 = multiDocumentSelectorForVerification != null ? G0(multiDocumentSelectorForVerification) : null;
            gr0.DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
            DocumentTopAnnotation documentTopAnnotationE0 = topAnnotation != null ? E0(topAnnotation) : null;
            gr0.QrCodeSchema qrCode = documentSchema.getQrCode();
            gv1.QrCodeSchema qrCodeSchemaQ0 = qrCode != null ? q0(qrCode) : null;
            gr0.BarcodeSchema barcode = documentSchema.getBarcode();
            gv1.BarcodeSchema barcodeSchemaY = barcode != null ? y(barcode) : null;
            List<gr0.DocumentSchemaAttribute> listF = documentSchema.f();
            if (listF != null) {
                List<gr0.DocumentSchemaAttribute> list = listF;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(u0((gr0.DocumentSchemaAttribute) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<DocumentSchemaLabel> listC = documentSchema.c();
            if (listC != null) {
                List<DocumentSchemaLabel> list2 = listC;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(w0((DocumentSchemaLabel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            List<gr0.DocumentSchemaAttribute> listB = documentSchema.b();
            if (listB != null) {
                List<gr0.DocumentSchemaAttribute> list3 = listB;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(u0((gr0.DocumentSchemaAttribute) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            List<gr0.DocumentActionAttribute> listA = documentSchema.a();
            if (listA != null) {
                List<gr0.DocumentActionAttribute> list4 = listA;
                arrayList4 = new ArrayList(pq.v.y(list4, 10));
                Iterator<T> it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(s((gr0.DocumentActionAttribute) it6.next()));
                }
            } else {
                arrayList4 = null;
            }
            gr0.DocumentBottomAnnotation bottomAnnotation = documentSchema.getBottomAnnotation();
            DocumentBottomAnnotation documentBottomAnnotationC = bottomAnnotation != null ? C(bottomAnnotation) : null;
            hr0.MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
            hv1.MultiDocumentView multiDocumentViewK0 = multiDocumentView != null ? k0(multiDocumentView) : null;
            List<gr0.DocumentSchemaForwardAttribute> listI = documentSchema.i();
            DocumentBottomAnnotation documentBottomAnnotation = documentBottomAnnotationC;
            if (listI != null) {
                List<gr0.DocumentSchemaForwardAttribute> list5 = listI;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list5, 10));
                Iterator<T> it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(a0((gr0.DocumentSchemaForwardAttribute) it7.next()));
                }
                arrayList5 = arrayList6;
            } else {
                arrayList5 = null;
            }
            return new DocumentSchema(schemaId, schemaVersion, documentName, arrayList5, pictureSchemaO0, documentPeselFieldReference, verificationSelectorG0, documentTopAnnotationE0, qrCodeSchemaQ0, barcodeSchemaY, arrayList, arrayList2, arrayList3, arrayList4, documentBottomAnnotation, multiDocumentViewK0);
        }

        private final mv1.b N(er0.h hVar) {
            int i15 = C3866a.f155930c[hVar.ordinal()];
            if (i15 == 1) {
                return mv1.b.ACTIVE;
            }
            if (i15 == 2) {
                return mv1.b.REVOKED;
            }
            if (i15 == 3) {
                return mv1.b.EXPIRED;
            }
            if (i15 == 4) {
                return mv1.b.INACTIVE;
            }
            if (i15 == 5) {
                return mv1.b.ACTIVE;
            }
            throw new oq.p();
        }

        private final mv1.b O(f24.h hVar) {
            int i15 = C3866a.f155929b[hVar.ordinal()];
            if (i15 == 1) {
                return mv1.b.ACTIVE;
            }
            if (i15 == 2) {
                return mv1.b.REVOKED;
            }
            if (i15 == 3) {
                return mv1.b.EXPIRED;
            }
            if (i15 == 4) {
                return mv1.b.INACTIVE;
            }
            throw new oq.p();
        }

        private final gv1.DocumentsGroup P(DocumentsGroup documentsGroup) {
            gv1.DocumentsGroup.a aVarZ0 = z0(documentsGroup.getSortOrder());
            List<g24.DocumentSchemaLabel> listA = documentsGroup.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentsGroup(aVarZ0, arrayList);
        }

        private final gv1.DocumentsGroup Q(gr0.DocumentsGroup documentsGroup) {
            gv1.DocumentsGroup.a aVarA0 = A0(documentsGroup.getSortOrder());
            List<DocumentSchemaLabel> listA = documentsGroup.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentsGroup(aVarA0, arrayList);
        }

        private final DynamicDocumentData R(i24.DynamicDocumentData dynamicDocumentData, String str, mv1.b bVar) {
            return new DynamicDocumentData(K(dynamicDocumentData.getDocument()), S(dynamicDocumentData.getScope()), L(dynamicDocumentData.getSchema()), str, bVar, dynamicDocumentData.getDocument().getDocumentId(), dynamicDocumentData.getDocument().getExpirationDate(), r2.a(dynamicDocumentData.getDocument().getDocumentType()), null);
        }

        private final iy.b0 S(DynamicDocumentScope dynamicDocumentScope) {
            return gv1.t.a(iy.c0.g(this.E.d(dynamicDocumentScope.a())));
        }

        private final gv1.DocumentDynamicSection T(DocumentDynamicSection documentDynamicSection) {
            return new gv1.DocumentDynamicSection(documentDynamicSection.c(), documentDynamicSection.a(), documentDynamicSection.b());
        }

        private final gv1.DocumentDynamicSection U(gr0.DocumentDynamicSection documentDynamicSection) {
            return new gv1.DocumentDynamicSection(documentDynamicSection.c(), documentDynamicSection.a(), documentDynamicSection.b());
        }

        private final DocumentSchemaEnumTranslation V(g24.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<g24.DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final DocumentSchemaEnumTranslation W(gr0.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final gv1.m X(g24.l lVar) {
            int i15 = C3866a.f155932e[lVar.ordinal()];
            if (i15 == 1) {
                return gv1.m.UPPERCASE;
            }
            if (i15 == 2) {
                return gv1.m.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.m Y(gr0.l lVar) {
            int i15 = C3866a.f155943p[lVar.ordinal()];
            if (i15 == 1) {
                return gv1.m.UPPERCASE;
            }
            if (i15 == 2) {
                return gv1.m.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.DocumentSchemaForwardAttribute Z(DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
            List<g24.DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentSchemaForwardAttribute(arrayList);
        }

        private final gv1.DocumentSchemaForwardAttribute a0(gr0.DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
            List<DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentSchemaForwardAttribute(arrayList);
        }

        private final gv1.h b0(g24.g gVar) {
            int i15 = C3866a.f155934g[gVar.ordinal()];
            if (i15 == 1) {
                return gv1.h.PL;
            }
            if (i15 == 2) {
                return gv1.h.EN;
            }
            if (i15 == 3) {
                return gv1.h.UK;
            }
            if (i15 == 4) {
                return gv1.h.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.h c0(DocumentSchemaLabel.a aVar) {
            int i15 = C3866a.f155942o[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.h.PL;
            }
            if (i15 == 2) {
                return gv1.h.EN;
            }
            if (i15 == 3) {
                return gv1.h.UK;
            }
            if (i15 == 4) {
                return gv1.h.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.MissingDocumentAttribute d0(MissingDocumentAttribute missingDocumentAttribute) {
            gv1.MissingDocumentAttribute.a aVarL0 = l0(missingDocumentAttribute.getOnMissing());
            g24.r dataType = missingDocumentAttribute.getDataType();
            return new gv1.MissingDocumentAttribute(aVarL0, dataType != null ? I(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final gv1.MissingDocumentAttribute e0(gr0.MissingDocumentAttribute missingDocumentAttribute) {
            gv1.MissingDocumentAttribute.a aVarM0 = m0(missingDocumentAttribute.getOnMissing());
            gr0.s dataType = missingDocumentAttribute.getDataType();
            return new gv1.MissingDocumentAttribute(aVarM0, dataType != null ? J(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final hv1.MultiDocumentView.a f0(MultiDocumentView.a aVar) {
            int i15 = C3866a.f155936i[aVar.ordinal()];
            if (i15 == 1) {
                return hv1.MultiDocumentView.a.LEFT_TAB;
            }
            if (i15 == 2) {
                return hv1.MultiDocumentView.a.RIGHT_TAB;
            }
            if (i15 == 3) {
                return hv1.MultiDocumentView.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final hv1.MultiDocumentView.a g0(hr0.MultiDocumentView.a aVar) {
            int i15 = C3866a.f155945r[aVar.ordinal()];
            if (i15 == 1) {
                return hv1.MultiDocumentView.a.LEFT_TAB;
            }
            if (i15 == 2) {
                return hv1.MultiDocumentView.a.RIGHT_TAB;
            }
            if (i15 == 3) {
                return hv1.MultiDocumentView.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final MultiDocumentSchema h0(h24.MultiDocumentSchema multiDocumentSchema) {
            DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
            gv1.DocumentsGroup documentsGroupP = leftTab != null ? P(leftTab) : null;
            DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
            gv1.DocumentsGroup documentsGroupP2 = rightTab != null ? P(rightTab) : null;
            h24.VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
            return new MultiDocumentSchema(documentsGroupP, documentsGroupP2, verificationSelector != null ? F0(verificationSelector) : null);
        }

        private final MultiDocumentSchema i0(hr0.MultiDocumentSchema multiDocumentSchema) {
            gr0.DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
            gv1.DocumentsGroup documentsGroupQ = leftTab != null ? Q(leftTab) : null;
            gr0.DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
            gv1.DocumentsGroup documentsGroupQ2 = rightTab != null ? Q(rightTab) : null;
            hr0.VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
            return new MultiDocumentSchema(documentsGroupQ, documentsGroupQ2, verificationSelector != null ? G0(verificationSelector) : null);
        }

        private final hv1.MultiDocumentView j0(MultiDocumentView multiDocumentView) {
            return new hv1.MultiDocumentView(T(multiDocumentView.getDynamicSections()), f0(multiDocumentView.getMultiDocumentGroup()));
        }

        private final hv1.MultiDocumentView k0(hr0.MultiDocumentView multiDocumentView) {
            return new hv1.MultiDocumentView(U(multiDocumentView.getDynamicSections()), g0(multiDocumentView.getMultiDocumentGroup()));
        }

        private final gv1.MissingDocumentAttribute.a l0(MissingDocumentAttribute.a aVar) {
            int i15 = C3866a.f155933f[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.MissingDocumentAttribute.a.HIDE;
            }
            if (i15 == 2) {
                return gv1.MissingDocumentAttribute.a.DEFAULT_VALUE;
            }
            if (i15 == 3) {
                return gv1.MissingDocumentAttribute.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.MissingDocumentAttribute.a m0(gr0.MissingDocumentAttribute.a aVar) {
            int i15 = C3866a.f155941n[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.MissingDocumentAttribute.a.HIDE;
            }
            if (i15 == 2) {
                return gv1.MissingDocumentAttribute.a.DEFAULT_VALUE;
            }
            if (i15 == 3) {
                return gv1.MissingDocumentAttribute.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final PictureSchema n0(g24.PictureSchema pictureSchema) {
            String pictureId = pictureSchema.getPictureId();
            String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
            String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
            String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
            List<DocumentSchemaAttribute> listB = pictureSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(t0((DocumentSchemaAttribute) it.next()));
            }
            String sourceContainerRef = pictureSchema.getSourceContainerRef();
            List<AdditionalLogo> listA = pictureSchema.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(v((AdditionalLogo) it4.next()));
            }
            return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, sourceContainerRef, arrayList2);
        }

        private final PictureSchema o0(gr0.PictureSchema pictureSchema) {
            String pictureId = pictureSchema.getPictureId();
            String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
            String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
            String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
            List<gr0.DocumentSchemaAttribute> listB = pictureSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(u0((gr0.DocumentSchemaAttribute) it.next()));
            }
            String sourceContainerRef = pictureSchema.getSourceContainerRef();
            List<BeAdditionalLogo> listA = pictureSchema.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(w((BeAdditionalLogo) it4.next()));
            }
            return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, sourceContainerRef, arrayList2);
        }

        private final gv1.QrCodeSchema p0(QrCodeSchema qrCodeSchema) {
            return new gv1.QrCodeSchema(r0(qrCodeSchema.getType()), qrCodeSchema.getFieldReference());
        }

        private final gv1.QrCodeSchema q0(gr0.QrCodeSchema qrCodeSchema) {
            return new gv1.QrCodeSchema(s0(qrCodeSchema.getType()), qrCodeSchema.getFieldReference());
        }

        private final gv1.DocumentActionAttribute r(DocumentActionAttribute documentActionAttribute) {
            gv1.DocumentActionAttribute.a aVarT = t(documentActionAttribute.getActionType());
            List<g24.DocumentSchemaLabel> listB = documentActionAttribute.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentActionAttribute(aVarT, arrayList);
        }

        private final gv1.QrCodeSchema.a r0(QrCodeSchema.a aVar) {
            int i15 = C3866a.f155935h[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.QrCodeSchema.a.QR_CODE_V10;
            }
            if (i15 == 2) {
                return gv1.QrCodeSchema.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.DocumentActionAttribute s(gr0.DocumentActionAttribute documentActionAttribute) {
            gv1.DocumentActionAttribute.a aVarU = u(documentActionAttribute.getActionType());
            List<DocumentSchemaLabel> listB = documentActionAttribute.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new gv1.DocumentActionAttribute(aVarU, arrayList);
        }

        private final gv1.QrCodeSchema.a s0(gr0.QrCodeSchema.a aVar) {
            int i15 = C3866a.f155944q[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.QrCodeSchema.a.QR_CODE_V10;
            }
            if (i15 == 2) {
                return gv1.QrCodeSchema.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.DocumentActionAttribute.a t(DocumentActionAttribute.a aVar) {
            if (!(aVar instanceof DocumentActionAttribute.a.b)) {
                if (aVar instanceof DocumentActionAttribute.a.Unknown) {
                    return gv1.DocumentActionAttribute.a.UNKNOWN;
                }
                throw new oq.p();
            }
            int i15 = C3866a.f155938k[((DocumentActionAttribute.a.b) aVar).ordinal()];
            if (i15 == 1) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST;
            }
            if (i15 == 2) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_PHD_PDF_LIST;
            }
            if (i15 == 3) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_DSC_PDF_LIST;
            }
            throw new oq.p();
        }

        private final gv1.DocumentSchemaAttribute t0(DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            gv1.s sVarI = I(documentSchemaAttribute.getDataType());
            MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            gv1.MissingDocumentAttribute missingDocumentAttributeD0 = onMissingAttribute != null ? d0(onMissingAttribute) : null;
            List<g24.DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<g24.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<g24.DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(V((g24.DocumentSchemaEnumTranslation) it4.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            List<g24.DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
            if (listA != null) {
                List<g24.DocumentSchemaBooleanTranslation> list2 = listA;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(z((g24.DocumentSchemaBooleanTranslation) it5.next()));
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            List<g24.l> listF = documentSchemaAttribute.f();
            if (listF != null) {
                List<g24.l> list3 = listF;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(X((g24.l) it6.next()));
                }
            }
            return new gv1.DocumentSchemaAttribute(sVarI, missingDocumentAttributeD0, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final gv1.DocumentActionAttribute.a u(gr0.DocumentActionAttribute.a aVar) {
            if (!(aVar instanceof gr0.DocumentActionAttribute.a.b)) {
                if (aVar instanceof gr0.DocumentActionAttribute.a.Unknown) {
                    return gv1.DocumentActionAttribute.a.UNKNOWN;
                }
                throw new oq.p();
            }
            int i15 = C3866a.f155939l[((gr0.DocumentActionAttribute.a.b) aVar).ordinal()];
            if (i15 == 1) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST;
            }
            if (i15 == 2) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_PHD_PDF_LIST;
            }
            if (i15 == 3) {
                return gv1.DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_DSC_PDF_LIST;
            }
            throw new oq.p();
        }

        private final gv1.DocumentSchemaAttribute u0(gr0.DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            gv1.s sVarJ = J(documentSchemaAttribute.getDataType());
            gr0.MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            gv1.MissingDocumentAttribute missingDocumentAttributeE0 = onMissingAttribute != null ? e0(onMissingAttribute) : null;
            List<DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(w0((DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<gr0.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<gr0.DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(W((gr0.DocumentSchemaEnumTranslation) it4.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            List<gr0.DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
            if (listA != null) {
                List<gr0.DocumentSchemaBooleanTranslation> list2 = listA;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(A((gr0.DocumentSchemaBooleanTranslation) it5.next()));
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            List<gr0.l> listF = documentSchemaAttribute.f();
            if (listF != null) {
                List<gr0.l> list3 = listF;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(Y((gr0.l) it6.next()));
                }
            }
            return new gv1.DocumentSchemaAttribute(sVarJ, missingDocumentAttributeE0, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final gv1.AdditionalLogo v(AdditionalLogo additionalLogo) {
            return new gv1.AdditionalLogo(additionalLogo.getId(), additionalLogo.getFieldReference());
        }

        private final gv1.DocumentSchemaLabel v0(g24.DocumentSchemaLabel documentSchemaLabel) {
            return new gv1.DocumentSchemaLabel(b0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final gv1.AdditionalLogo w(BeAdditionalLogo beAdditionalLogo) {
            return new gv1.AdditionalLogo(beAdditionalLogo.getId(), beAdditionalLogo.getFieldReference());
        }

        private final gv1.DocumentSchemaLabel w0(DocumentSchemaLabel documentSchemaLabel) {
            return new gv1.DocumentSchemaLabel(c0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final gv1.BarcodeSchema x(BarcodeSchema barcodeSchema) {
            String fieldReference = barcodeSchema.getFieldReference();
            List<g24.DocumentSchemaLabel> listB = barcodeSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            return new gv1.BarcodeSchema(fieldReference, arrayList);
        }

        private final MultiDocumentSelectorLabel x0(h24.MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
            ArrayList arrayList;
            List<f24.DocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(F((f24.DocumentConfigLabel) it.next()));
            }
            List<f24.DocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList3.add(F((f24.DocumentConfigLabel) it4.next()));
            }
            List<f24.DocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
            if (listC != null) {
                List<f24.DocumentConfigLabel> list = listC;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(F((f24.DocumentConfigLabel) it5.next()));
                }
            } else {
                arrayList = null;
            }
            return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
        }

        private final gv1.BarcodeSchema y(gr0.BarcodeSchema barcodeSchema) {
            String fieldReference = barcodeSchema.getFieldReference();
            List<DocumentSchemaLabel> listB = barcodeSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(w0((DocumentSchemaLabel) it.next()));
            }
            return new gv1.BarcodeSchema(fieldReference, arrayList);
        }

        private final MultiDocumentSelectorLabel y0(hr0.MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
            ArrayList arrayList;
            List<BEDocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(G((BEDocumentConfigLabel) it.next()));
            }
            List<BEDocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList3.add(G((BEDocumentConfigLabel) it4.next()));
            }
            List<BEDocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
            if (listC != null) {
                List<BEDocumentConfigLabel> list = listC;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(G((BEDocumentConfigLabel) it5.next()));
                }
            } else {
                arrayList = null;
            }
            return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
        }

        private final DocumentSchemaBooleanTranslation z(g24.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<g24.DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(v0((g24.DocumentSchemaLabel) it.next()));
            }
            List<g24.DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(v0((g24.DocumentSchemaLabel) it4.next()));
            }
            return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final gv1.DocumentsGroup.a z0(DocumentsGroup.a aVar) {
            int i15 = C3866a.f155937j[aVar.ordinal()];
            if (i15 == 1) {
                return gv1.DocumentsGroup.a.ASC;
            }
            if (i15 == 2) {
                return gv1.DocumentsGroup.a.DESC;
            }
            if (i15 == 3) {
                return gv1.DocumentsGroup.a.UNKNOWN;
            }
            throw new oq.p();
        }

        @Override // kv1.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // kv1.a
        public Object b(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar2;
            Object objB;
            ex.b bVar3;
            ex.b bVar4;
            ex.b bVar5;
            if (eVar instanceof b) {
                bVar2 = (b) eVar;
                int i15 = bVar2.f155961s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f155961s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar2 = new b(eVar);
                }
            } else {
                bVar2 = new b(eVar);
            }
            Object objC = bVar2.f155959q;
            ?? E = uq.b.e();
            int i16 = bVar2.f155961s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar6 = this.f155902a;
                            w24.n nVar = this.f155911j;
                            k24.a aVar = this.f155912k;
                            q34.w wVar = this.f155913l;
                            q34.u uVar = this.f155914m;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                boolean zBooleanValue = bVar6.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        w24.n.Params params = new w24.n.Params((f24.i) aVar2.a(j1.l(bVar)));
                                        bVar2.f155948d = vq.j.a(str);
                                        bVar2.f155949e = vq.j.a(bVar);
                                        bVar2.f155950f = jVarA;
                                        bVar2.f155951g = vq.j.a(aVar2);
                                        bVar2.f155952h = vq.j.a(aVar2);
                                        bVar2.f155953j = aVar2;
                                        bVar2.f155954k = 0;
                                        bVar2.f155955l = 0;
                                        bVar2.f155956m = 0;
                                        bVar2.f155957n = 0;
                                        bVar2.f155958p = 0;
                                        bVar2.f155961s = 1;
                                        objC = nVar.c(params, bVar2);
                                        if (objC != E) {
                                            bVar5 = aVar2;
                                            bVar5.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        bVar2.f155948d = vq.j.a(str);
                                        bVar2.f155949e = vq.j.a(bVar);
                                        bVar2.f155950f = jVarA;
                                        bVar2.f155951g = vq.j.a(aVar2);
                                        bVar2.f155952h = vq.j.a(aVar2);
                                        bVar2.f155953j = aVar2;
                                        bVar2.f155954k = 0;
                                        bVar2.f155955l = 0;
                                        bVar2.f155956m = 0;
                                        bVar2.f155957n = 0;
                                        bVar2.f155958p = 0;
                                        bVar2.f155961s = 2;
                                        objC = aVar.c(params2, bVar2);
                                        if (objC != E) {
                                            bVar4 = aVar2;
                                            bVar4.a((dx.i) objC);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    if (str == null) {
                                        q34.w.Params params3 = new q34.w.Params(bVar);
                                        bVar2.f155948d = vq.j.a(str);
                                        bVar2.f155949e = vq.j.a(bVar);
                                        bVar2.f155950f = jVarA;
                                        bVar2.f155951g = vq.j.a(aVar2);
                                        bVar2.f155952h = vq.j.a(aVar2);
                                        bVar2.f155954k = 0;
                                        bVar2.f155955l = 0;
                                        bVar2.f155956m = 0;
                                        bVar2.f155957n = 0;
                                        bVar2.f155958p = 0;
                                        bVar2.f155961s = 3;
                                        if (wVar.c(params3, bVar2) == E) {
                                        }
                                    } else {
                                        q34.u.Params params4 = new q34.u.Params(str);
                                        bVar2.f155948d = vq.j.a(str);
                                        bVar2.f155949e = vq.j.a(bVar);
                                        bVar2.f155950f = jVarA;
                                        bVar2.f155951g = vq.j.a(aVar2);
                                        bVar2.f155952h = vq.j.a(aVar2);
                                        bVar2.f155953j = aVar2;
                                        bVar2.f155954k = 0;
                                        bVar2.f155955l = 0;
                                        bVar2.f155956m = 0;
                                        bVar2.f155957n = 0;
                                        bVar2.f155958p = 0;
                                        bVar2.f155961s = 4;
                                        objC = uVar.c(params4, bVar2);
                                        if (objC != E) {
                                            bVar3 = aVar2;
                                            bVar3.a((dx.i) objC);
                                        }
                                    }
                                }
                                return E;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(E));
                                dx.i iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar5 = (ex.b) bVar2.f155953j;
                            oq.u.b(objC);
                            bVar5.a((dx.i) objC);
                        } else if (i16 == 2) {
                            bVar4 = (ex.b) bVar2.f155953j;
                            oq.u.b(objC);
                            bVar4.a((dx.i) objC);
                        } else if (i16 == 3) {
                            oq.u.b(objC);
                        } else {
                            if (i16 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar3 = (ex.b) bVar2.f155953j;
                            oq.u.b(objC);
                            bVar3.a((dx.i) objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // kv1.a
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            boolean zBooleanValue = this.f155902a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f155905d.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f155906e.c(gz.b.a.C1792a.f78542a, eVar);
        }

        @Override // kv1.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.C.c(new q34.d.Params(cVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // kv1.a
        public Object e(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            m mVar;
            Object objB;
            if (eVar instanceof m) {
                mVar = (m) eVar;
                int i15 = mVar.f156114q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    mVar.f156114q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    mVar = new m(eVar);
                }
            } else {
                mVar = new m(eVar);
            }
            Object objC = mVar.f156112n;
            Object objE = uq.b.e();
            int i16 = mVar.f156114q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        q34.l1 l1Var = this.f155918q;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.l1.Params params = new q34.l1.Params(bVar);
                            mVar.f156103d = vq.j.a(bVar);
                            mVar.f156104e = jVarA;
                            mVar.f156105f = vq.j.a(aVar);
                            mVar.f156106g = vq.j.a(aVar);
                            mVar.f156107h = 0;
                            mVar.f156108j = 0;
                            mVar.f156109k = 0;
                            mVar.f156110l = 0;
                            mVar.f156111m = 0;
                            mVar.f156114q = 1;
                            objC = l1Var.c(params, mVar);
                            if (objC == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            dx.i iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(vq.b.a(((Boolean) objC).booleanValue()));
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        @Override // kv1.a
        public Object f(rq0.b bVar, er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.D.c(new j34.d.Params(bVar, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0144  */
        /* JADX WARN: Code duplicated, block: B:67:0x0155  */
        /* JADX WARN: Code duplicated, block: B:68:0x0163  */
        /* JADX WARN: Code duplicated, block: B:70:0x0167  */
        /* JADX WARN: Code duplicated, block: B:73:0x0174  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v26 */
        @Override // kv1.a
        public Object g(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            l lVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            dx.j<dx.b> jVar2;
            ex.b bVar2;
            boolean zBooleanValue;
            if (eVar instanceof l) {
                lVar = (l) eVar;
                int i15 = lVar.f156102r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    lVar.f156102r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    lVar = new l(eVar);
                }
            } else {
                lVar = new l(eVar);
            }
            Object objC = lVar.f156100p;
            Object objE = uq.b.e();
            int i16 = lVar.f156102r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f155902a;
                        w24.f2 f2Var = this.f155916o;
                        q34.k1 k1Var = this.f155917p;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue2 = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                w24.f2.Params params = new w24.f2.Params((f24.i) aVar.a(j1.l(bVar)));
                                lVar.f156090d = vq.j.a(bVar);
                                lVar.f156091e = jVarA;
                                lVar.f156092f = vq.j.a(aVar);
                                lVar.f156093g = vq.j.a(aVar);
                                lVar.f156094h = aVar;
                                lVar.f156095j = 0;
                                lVar.f156096k = 0;
                                lVar.f156097l = 0;
                                lVar.f156098m = 0;
                                lVar.f156099n = 0;
                                lVar.f156102r = 1;
                                objC = f2Var.c(params, lVar);
                                if (objC != objE) {
                                    jVar2 = jVarA;
                                    bVar2 = aVar;
                                    zBooleanValue = ((Boolean) bVar2.a((dx.i) objC)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new oq.p();
                                }
                                q34.k1.Params params2 = new q34.k1.Params(bVar);
                                lVar.f156090d = vq.j.a(bVar);
                                lVar.f156091e = jVarA;
                                lVar.f156092f = vq.j.a(aVar);
                                lVar.f156093g = vq.j.a(aVar);
                                lVar.f156095j = 0;
                                lVar.f156096k = 0;
                                lVar.f156097l = 0;
                                lVar.f156098m = 0;
                                lVar.f156099n = 0;
                                lVar.f156102r = 2;
                                objC = k1Var.c(params2, lVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    jVar2 = jVar;
                                    zBooleanValue = ((Boolean) objC).booleanValue();
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) lVar.f156094h;
                        jVar2 = (dx.j) lVar.f156091e;
                        try {
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar2.a((dx.i) objC)).booleanValue();
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            bVar = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (dx.j) lVar.f156091e;
                        try {
                            oq.u.b(objC);
                            jVar2 = jVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zBooleanValue));
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:105:0x037d  */
        /* JADX WARN: Code duplicated, block: B:112:0x03c7  */
        /* JADX WARN: Code duplicated, block: B:136:0x0425  */
        /* JADX WARN: Code duplicated, block: B:147:0x044a  */
        /* JADX WARN: Code duplicated, block: B:150:0x045b  */
        /* JADX WARN: Code duplicated, block: B:151:0x0469  */
        /* JADX WARN: Code duplicated, block: B:153:0x046d  */
        /* JADX WARN: Code duplicated, block: B:156:0x047a  */
        /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x025d  */
        /* JADX WARN: Code duplicated, block: B:73:0x0260 A[Catch: Exception -> 0x0131, c -> 0x0136, CancellationException -> 0x013b, TryCatch #19 {c -> 0x0136, CancellationException -> 0x013b, Exception -> 0x0131, blocks: (B:39:0x0124, B:70:0x0257, B:73:0x0260, B:75:0x0264, B:83:0x02ee, B:84:0x02f3), top: B:160:0x0124 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0264 A[Catch: Exception -> 0x0131, c -> 0x0136, CancellationException -> 0x013b, TRY_LEAVE, TryCatch #19 {c -> 0x0136, CancellationException -> 0x013b, Exception -> 0x0131, blocks: (B:39:0x0124, B:70:0x0257, B:73:0x0260, B:75:0x0264, B:83:0x02ee, B:84:0x02f3), top: B:160:0x0124 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:83:0x02ee A[Catch: Exception -> 0x0131, c -> 0x0136, CancellationException -> 0x013b, TRY_ENTER, TryCatch #19 {c -> 0x0136, CancellationException -> 0x013b, Exception -> 0x0131, blocks: (B:39:0x0124, B:70:0x0257, B:73:0x0260, B:75:0x0264, B:83:0x02ee, B:84:0x02f3), top: B:160:0x0124 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x033e  */
        /* JADX WARN: Code duplicated, block: B:93:0x0342 A[Catch: Exception -> 0x0192, c -> 0x0197, CancellationException -> 0x019c, TryCatch #13 {c -> 0x0197, CancellationException -> 0x019c, Exception -> 0x0192, blocks: (B:90:0x0336, B:93:0x0342, B:95:0x0346, B:48:0x0178, B:64:0x01fd, B:66:0x0214, B:86:0x02f6), top: B:167:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x0346 A[Catch: Exception -> 0x0192, c -> 0x0197, CancellationException -> 0x019c, TRY_LEAVE, TryCatch #13 {c -> 0x0197, CancellationException -> 0x019c, Exception -> 0x0192, blocks: (B:90:0x0336, B:93:0x0342, B:95:0x0346, B:48:0x0178, B:64:0x01fd, B:66:0x0214, B:86:0x02f6), top: B:167:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0363 A[Catch: Exception -> 0x036e, c -> 0x0373, CancellationException -> 0x0378, TryCatch #17 {c -> 0x0373, CancellationException -> 0x0378, Exception -> 0x036e, blocks: (B:96:0x035d, B:98:0x0363, B:106:0x0380), top: B:161:0x035d }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v39 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v7, types: [dx.j, java.lang.Object] */
        @Override // kv1.a
        public Object h(rq0.b.EnumC4479b enumC4479b, String str, tq.e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar) throws Throwable {
            d dVar;
            dx.j<dx.b> jVar;
            String message;
            dx.i iVarA;
            Object objB;
            String str2;
            ez.c cVar;
            q34.d0 d0Var;
            ex.b bVar;
            ex.b bVar2;
            ex.b bVar3;
            int i15;
            int i16;
            int i17;
            c54.b bVar4;
            rq0.b.EnumC4479b enumC4479b2;
            w24.q0 q0Var;
            int i18;
            int i19;
            ez.c cVar2;
            String str3;
            UserDocumentData userDocumentData;
            int i25;
            ex.b bVar5;
            UserDocumentData userDocumentData2;
            ex.b bVar6;
            dx.j<dx.b> jVar2;
            String str4;
            rq0.b.EnumC4479b enumC4479b3;
            int i26;
            ex.b bVar7;
            dx.i right;
            i24.DynamicDocumentData dynamicDocumentData;
            i24.DynamicDocumentData dynamicDocumentData2;
            ex.b bVar8;
            DynamicDocumentData dynamicDocumentData3;
            dx.i iVar;
            String str5;
            DynamicDocumentDataContainer dynamicDocumentDataContainer;
            fz.b.LocalDate expirationDate;
            String documentId;
            Date dateF;
            a aVar;
            String str6;
            ex.b bVar9;
            fz.b.LocalDate localDate;
            ex.b bVar10;
            dx.j<dx.b> jVar3;
            rq0.b.EnumC4479b enumC4479b4;
            dx.i iVar2;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i27 = dVar.B;
                if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.B = i27 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objK = dVar.f155994z;
            Object objE = uq.b.e();
            int i28 = dVar.B;
            ?? r15 = 1;
            r15 = 1;
            try {
                try {
                    try {
                        try {
                            try {
                                if (i28 == 0) {
                                    oq.u.b(objK);
                                    c54.b bVar11 = this.f155902a;
                                    w24.q0 q0Var2 = this.f155922u;
                                    q34.d0 d0Var2 = this.f155923v;
                                    ez.c cVar3 = this.f155921t;
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    ex.a aVar2 = new ex.a();
                                    dVar.f155975d = enumC4479b;
                                    str2 = str;
                                    dVar.f155976e = str2;
                                    dVar.f155977f = bVar11;
                                    dVar.f155978g = q0Var2;
                                    dVar.f155979h = d0Var2;
                                    dVar.f155980j = cVar3;
                                    dVar.f155981k = jVarA;
                                    dVar.f155982l = vq.j.a(aVar2);
                                    dVar.f155983m = aVar2;
                                    dVar.f155984n = aVar2;
                                    dVar.f155987r = 0;
                                    dVar.f155988s = 0;
                                    dVar.f155989t = 0;
                                    dVar.f155990v = 0;
                                    dVar.f155991w = 0;
                                    dVar.B = 1;
                                    Object objQ = q(dVar);
                                    if (objQ != objE) {
                                        cVar = cVar3;
                                        jVar = jVarA;
                                        d0Var = d0Var2;
                                        objK = objQ;
                                        bVar = aVar2;
                                        bVar2 = bVar;
                                        bVar3 = bVar2;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        bVar4 = bVar11;
                                        enumC4479b2 = enumC4479b;
                                        q0Var = q0Var2;
                                        i18 = 0;
                                        i19 = 0;
                                    }
                                    return objE;
                                }
                                if (i28 == 1) {
                                    int i29 = dVar.f155991w;
                                    int i35 = dVar.f155990v;
                                    int i36 = dVar.f155989t;
                                    int i37 = dVar.f155988s;
                                    int i38 = dVar.f155987r;
                                    ex.b bVar12 = (ex.b) dVar.f155984n;
                                    ex.b bVar13 = (ex.b) dVar.f155983m;
                                    ex.b bVar14 = (ex.b) dVar.f155982l;
                                    jVar = (dx.j) dVar.f155981k;
                                    ez.c cVar4 = (ez.c) dVar.f155980j;
                                    q34.d0 d0Var3 = (q34.d0) dVar.f155979h;
                                    w24.q0 q0Var3 = (w24.q0) dVar.f155978g;
                                    c54.b bVar15 = (c54.b) dVar.f155977f;
                                    String str7 = (String) dVar.f155976e;
                                    enumC4479b2 = (rq0.b.EnumC4479b) dVar.f155975d;
                                    try {
                                        oq.u.b(objK);
                                        i18 = i29;
                                        cVar = cVar4;
                                        bVar3 = bVar14;
                                        bVar2 = bVar13;
                                        i17 = i38;
                                        i16 = i37;
                                        bVar = bVar12;
                                        q0Var = q0Var3;
                                        i19 = i36;
                                        str2 = str7;
                                        d0Var = d0Var3;
                                        i15 = i35;
                                        bVar4 = bVar15;
                                    } catch (ex.c e15) {
                                        e = e15;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e16) {
                                        e = e16;
                                        throw e;
                                    } catch (Exception e17) {
                                        e = e17;
                                        r15 = jVar;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                } else {
                                    if (i28 == 2) {
                                        i26 = dVar.f155991w;
                                        int i39 = dVar.f155990v;
                                        int i45 = dVar.f155989t;
                                        int i46 = dVar.f155988s;
                                        int i47 = dVar.f155987r;
                                        UserDocumentData userDocumentData3 = (UserDocumentData) dVar.f155981k;
                                        ex.b bVar16 = (ex.b) dVar.f155980j;
                                        bVar6 = (ex.b) dVar.f155979h;
                                        ex.b bVar17 = (ex.b) dVar.f155978g;
                                        jVar2 = (dx.j) dVar.f155977f;
                                        str4 = (String) dVar.f155976e;
                                        enumC4479b3 = (rq0.b.EnumC4479b) dVar.f155975d;
                                        try {
                                            oq.u.b(objK);
                                            bVar3 = bVar17;
                                            i17 = i47;
                                            i19 = i45;
                                            bVar7 = bVar16;
                                            i16 = i46;
                                            i15 = i39;
                                            userDocumentData2 = userDocumentData3;
                                            right = (dx.i) objK;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (right instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                dynamicDocumentData = (i24.DynamicDocumentData) ((dx.i.Right) right).b();
                                                rq0.b.EnumC4479b enumC4479b5 = enumC4479b3;
                                                String documentId2 = dynamicDocumentData.getDocument().getDocumentId();
                                                String str8 = str4;
                                                rq0.b bVarA = r2.a(dynamicDocumentData.getDocument().getDocumentType());
                                                dVar.f155975d = vq.j.a(enumC4479b5);
                                                dVar.f155976e = vq.j.a(str8);
                                                dVar.f155977f = jVar2;
                                                dVar.f155978g = vq.j.a(bVar3);
                                                dVar.f155979h = vq.j.a(bVar6);
                                                dVar.f155980j = bVar7;
                                                dVar.f155981k = userDocumentData2;
                                                dVar.f155982l = vq.j.a(right);
                                                dVar.f155983m = dynamicDocumentData;
                                                dVar.f155984n = bVar6;
                                                dVar.f155987r = i17;
                                                dVar.f155988s = i16;
                                                dVar.f155989t = i19;
                                                dVar.f155990v = i15;
                                                dVar.f155991w = i26;
                                                dVar.f155992x = 0;
                                                dVar.f155993y = 0;
                                                dVar.B = 3;
                                                objK = k(null, bVarA, documentId2, dVar);
                                                objE = objE;
                                                if (objK != objE) {
                                                    dynamicDocumentData2 = dynamicDocumentData;
                                                    bVar8 = bVar6;
                                                    right = new dx.i.Right(R(dynamicDocumentData2, userDocumentData2.getPhoto(), (mv1.b) bVar8.a((dx.i) objK)));
                                                }
                                                return objE;
                                            }
                                            dynamicDocumentData3 = (DynamicDocumentData) bVar7.a(right);
                                            return new dx.i.Right(dynamicDocumentData3);
                                        } catch (ex.c e18) {
                                            e = e18;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e19) {
                                            throw e19;
                                        } catch (Exception e25) {
                                            e = e25;
                                            r15 = jVar2;
                                            px.f fVar2 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar2.d(message, e, px.c.a(r15));
                                            iVarA = r15.a(e);
                                            if (iVarA instanceof dx.i.Left) {
                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                objB = ((dx.i.Right) iVarA).b();
                                            }
                                            return new dx.i.Left(objB);
                                        }
                                    }
                                    if (i28 == 3) {
                                        bVar8 = (ex.b) dVar.f155984n;
                                        dynamicDocumentData2 = (i24.DynamicDocumentData) dVar.f155983m;
                                        userDocumentData2 = (UserDocumentData) dVar.f155981k;
                                        bVar7 = (ex.b) dVar.f155980j;
                                        oq.u.b(objK);
                                        right = new dx.i.Right(R(dynamicDocumentData2, userDocumentData2.getPhoto(), (mv1.b) bVar8.a((dx.i) objK)));
                                        dynamicDocumentData3 = (DynamicDocumentData) bVar7.a(right);
                                        return new dx.i.Right(dynamicDocumentData3);
                                    }
                                    try {
                                        try {
                                            if (i28 == 4) {
                                                int i48 = dVar.f155991w;
                                                int i49 = dVar.f155990v;
                                                int i55 = dVar.f155989t;
                                                int i56 = dVar.f155988s;
                                                int i57 = dVar.f155987r;
                                                UserDocumentData userDocumentData4 = (UserDocumentData) dVar.f155982l;
                                                bVar5 = (ex.b) dVar.f155981k;
                                                bVar2 = (ex.b) dVar.f155980j;
                                                ex.b bVar18 = (ex.b) dVar.f155979h;
                                                dx.j<dx.b> jVar4 = (dx.j) dVar.f155978g;
                                                cVar2 = (ez.c) dVar.f155977f;
                                                String str9 = (String) dVar.f155976e;
                                                enumC4479b2 = (rq0.b.EnumC4479b) dVar.f155975d;
                                                oq.u.b(objK);
                                                bVar3 = bVar18;
                                                jVar = jVar4;
                                                i25 = i57;
                                                i19 = i55;
                                                userDocumentData = userDocumentData4;
                                                str3 = str9;
                                                i16 = i56;
                                                i15 = i49;
                                                i18 = i48;
                                                iVar = (dx.i) objK;
                                                str5 = str3;
                                                if (iVar instanceof dx.i.Left) {
                                                    iVar2 = iVar;
                                                } else {
                                                    if (iVar instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    dynamicDocumentDataContainer = (DynamicDocumentDataContainer) ((dx.i.Right) iVar).b();
                                                    expirationDate = dynamicDocumentDataContainer.getSchemaContainer().getExpirationDate();
                                                    try {
                                                        documentId = dynamicDocumentDataContainer.getSchemaContainer().getDocumentId();
                                                        if (expirationDate != null) {
                                                            dateF = cVar2.f(expirationDate.getDate());
                                                        } else {
                                                            dateF = null;
                                                        }
                                                        dVar.f155975d = enumC4479b2;
                                                        dVar.f155976e = vq.j.a(str5);
                                                        dVar.f155977f = jVar;
                                                        dVar.f155978g = vq.j.a(bVar3);
                                                        dVar.f155979h = vq.j.a(bVar2);
                                                        dVar.f155980j = bVar5;
                                                        dVar.f155981k = userDocumentData;
                                                        dVar.f155982l = vq.j.a(iVar);
                                                        dVar.f155983m = dynamicDocumentDataContainer;
                                                        dVar.f155984n = expirationDate;
                                                        dVar.f155985p = documentId;
                                                        dVar.f155986q = bVar2;
                                                        dVar.f155987r = i25;
                                                        dVar.f155988s = i16;
                                                        dVar.f155989t = i19;
                                                        dVar.f155990v = i15;
                                                        dVar.f155991w = i18;
                                                        dVar.f155992x = 0;
                                                        dVar.f155993y = 0;
                                                        dVar.B = 5;
                                                        aVar = this;
                                                        objK = aVar.k(dateF, enumC4479b2, documentId, dVar);
                                                        if (objK == objE) {
                                                            return objE;
                                                        }
                                                        ex.b bVar19 = bVar5;
                                                        str6 = documentId;
                                                        bVar9 = bVar19;
                                                        ex.b bVar20 = bVar2;
                                                        localDate = expirationDate;
                                                        bVar10 = bVar20;
                                                        jVar3 = jVar;
                                                        enumC4479b4 = enumC4479b2;
                                                    } catch (ex.c e26) {
                                                        e = e26;
                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                    } catch (CancellationException e27) {
                                                        e = e27;
                                                        throw e;
                                                    } catch (Exception e28) {
                                                        e = e28;
                                                        r15 = jVar;
                                                        px.f fVar3 = px.f.f163100a;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            message = "";
                                                        }
                                                        fVar3.d(message, e, px.c.a(r15));
                                                        iVarA = r15.a(e);
                                                        if (iVarA instanceof dx.i.Left) {
                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                        } else {
                                                            if (iVarA instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                }
                                                dynamicDocumentData3 = (DynamicDocumentData) bVar5.a(iVar2);
                                                return new dx.i.Right(dynamicDocumentData3);
                                            }
                                            if (i28 != 5) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            bVar10 = (ex.b) dVar.f155986q;
                                            String str10 = (String) dVar.f155985p;
                                            fz.b.LocalDate localDate2 = (fz.b.LocalDate) dVar.f155984n;
                                            DynamicDocumentDataContainer dynamicDocumentDataContainer2 = (DynamicDocumentDataContainer) dVar.f155983m;
                                            userDocumentData = (UserDocumentData) dVar.f155981k;
                                            ex.b bVar21 = (ex.b) dVar.f155980j;
                                            dx.j<dx.b> jVar5 = (dx.j) dVar.f155977f;
                                            rq0.b.EnumC4479b enumC4479b6 = (rq0.b.EnumC4479b) dVar.f155975d;
                                            oq.u.b(objK);
                                            enumC4479b4 = enumC4479b6;
                                            str6 = str10;
                                            localDate = localDate2;
                                            dynamicDocumentDataContainer = dynamicDocumentDataContainer2;
                                            jVar3 = jVar5;
                                            aVar = this;
                                            bVar9 = bVar21;
                                            dynamicDocumentData3 = (DynamicDocumentData) bVar5.a(iVar2);
                                            return new dx.i.Right(dynamicDocumentData3);
                                        } catch (ex.c e29) {
                                            e = e29;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        }
                                        dx.i.Right right2 = new dx.i.Right(new DynamicDocumentData(null, gv1.t.a(dynamicDocumentDataContainer.getData()), aVar.M(dynamicDocumentDataContainer.getSchemaContainer().getSchema()), userDocumentData.getPhoto(), (mv1.b) bVar10.a((dx.i) objK), str6, localDate, enumC4479b4, null));
                                        bVar5 = bVar9;
                                        iVar2 = right2;
                                    } catch (ex.c e36) {
                                        e = e36;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e37) {
                                        throw e37;
                                    } catch (Exception e38) {
                                        e = e38;
                                        r15 = jVar3;
                                        px.f fVar4 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar4.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                }
                                UserDocumentData userDocumentData5 = (UserDocumentData) bVar.a((dx.i) objK);
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.q0.Params params = new w24.q0.Params(str2);
                                    dVar.f155975d = vq.j.a(enumC4479b2);
                                    dVar.f155976e = vq.j.a(str2);
                                    dVar.f155977f = jVar;
                                    dVar.f155978g = vq.j.a(bVar3);
                                    dVar.f155979h = bVar2;
                                    dVar.f155980j = bVar2;
                                    dVar.f155981k = userDocumentData5;
                                    dVar.f155982l = null;
                                    dVar.f155983m = null;
                                    dVar.f155984n = null;
                                    dVar.f155987r = i17;
                                    dVar.f155988s = i16;
                                    dVar.f155989t = i19;
                                    dVar.f155990v = i15;
                                    dVar.f155991w = i18;
                                    dVar.B = 2;
                                    Object objC = q0Var.c(params, dVar);
                                    if (objC != objE) {
                                        userDocumentData2 = userDocumentData5;
                                        objK = objC;
                                        bVar6 = bVar2;
                                        jVar2 = jVar;
                                        str4 = str2;
                                        enumC4479b3 = enumC4479b2;
                                        i26 = i18;
                                        bVar7 = bVar6;
                                        right = (dx.i) objK;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            dynamicDocumentData = (i24.DynamicDocumentData) ((dx.i.Right) right).b();
                                            rq0.b.EnumC4479b enumC4479b7 = enumC4479b3;
                                            String documentId3 = dynamicDocumentData.getDocument().getDocumentId();
                                            String str11 = str4;
                                            rq0.b bVarA2 = r2.a(dynamicDocumentData.getDocument().getDocumentType());
                                            dVar.f155975d = vq.j.a(enumC4479b7);
                                            dVar.f155976e = vq.j.a(str11);
                                            dVar.f155977f = jVar2;
                                            dVar.f155978g = vq.j.a(bVar3);
                                            dVar.f155979h = vq.j.a(bVar6);
                                            dVar.f155980j = bVar7;
                                            dVar.f155981k = userDocumentData2;
                                            dVar.f155982l = vq.j.a(right);
                                            dVar.f155983m = dynamicDocumentData;
                                            dVar.f155984n = bVar6;
                                            dVar.f155987r = i17;
                                            dVar.f155988s = i16;
                                            dVar.f155989t = i19;
                                            dVar.f155990v = i15;
                                            dVar.f155991w = i26;
                                            dVar.f155992x = 0;
                                            dVar.f155993y = 0;
                                            dVar.B = 3;
                                            objK = k(null, bVarA2, documentId3, dVar);
                                            objE = objE;
                                            if (objK != objE) {
                                                dynamicDocumentData2 = dynamicDocumentData;
                                                bVar8 = bVar6;
                                                right = new dx.i.Right(R(dynamicDocumentData2, userDocumentData2.getPhoto(), (mv1.b) bVar8.a((dx.i) objK)));
                                            }
                                        }
                                        dynamicDocumentData3 = (DynamicDocumentData) bVar7.a(right);
                                        return new dx.i.Right(dynamicDocumentData3);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.d0.Params params2 = new q34.d0.Params(enumC4479b2, str2);
                                    dVar.f155975d = enumC4479b2;
                                    dVar.f155976e = vq.j.a(str2);
                                    cVar2 = cVar;
                                    dVar.f155977f = cVar2;
                                    dVar.f155978g = jVar;
                                    dVar.f155979h = vq.j.a(bVar3);
                                    dVar.f155980j = bVar2;
                                    dVar.f155981k = bVar2;
                                    dVar.f155982l = userDocumentData5;
                                    dVar.f155983m = null;
                                    dVar.f155984n = null;
                                    dVar.f155987r = i17;
                                    dVar.f155988s = i16;
                                    dVar.f155989t = i19;
                                    dVar.f155990v = i15;
                                    dVar.f155991w = i18;
                                    dVar.B = 4;
                                    Object objC2 = d0Var.c(params2, dVar);
                                    if (objC2 != objE) {
                                        str3 = str2;
                                        userDocumentData = userDocumentData5;
                                        objK = objC2;
                                        i25 = i17;
                                        bVar5 = bVar2;
                                        iVar = (dx.i) objK;
                                        str5 = str3;
                                        if (iVar instanceof dx.i.Left) {
                                            iVar2 = iVar;
                                        } else {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            dynamicDocumentDataContainer = (DynamicDocumentDataContainer) ((dx.i.Right) iVar).b();
                                            expirationDate = dynamicDocumentDataContainer.getSchemaContainer().getExpirationDate();
                                            documentId = dynamicDocumentDataContainer.getSchemaContainer().getDocumentId();
                                            if (expirationDate != null) {
                                                dateF = cVar2.f(expirationDate.getDate());
                                            } else {
                                                dateF = null;
                                            }
                                            dVar.f155975d = enumC4479b2;
                                            dVar.f155976e = vq.j.a(str5);
                                            dVar.f155977f = jVar;
                                            dVar.f155978g = vq.j.a(bVar3);
                                            dVar.f155979h = vq.j.a(bVar2);
                                            dVar.f155980j = bVar5;
                                            dVar.f155981k = userDocumentData;
                                            dVar.f155982l = vq.j.a(iVar);
                                            dVar.f155983m = dynamicDocumentDataContainer;
                                            dVar.f155984n = expirationDate;
                                            dVar.f155985p = documentId;
                                            dVar.f155986q = bVar2;
                                            dVar.f155987r = i25;
                                            dVar.f155988s = i16;
                                            dVar.f155989t = i19;
                                            dVar.f155990v = i15;
                                            dVar.f155991w = i18;
                                            dVar.f155992x = 0;
                                            dVar.f155993y = 0;
                                            dVar.B = 5;
                                            aVar = this;
                                            objK = aVar.k(dateF, enumC4479b2, documentId, dVar);
                                            if (objK == objE) {
                                                return objE;
                                            }
                                            ex.b bVar110 = bVar5;
                                            str6 = documentId;
                                            bVar9 = bVar110;
                                            ex.b bVar22 = bVar2;
                                            localDate = expirationDate;
                                            bVar10 = bVar22;
                                            jVar3 = jVar;
                                            enumC4479b4 = enumC4479b2;
                                            dx.i.Right right3 = new dx.i.Right(new DynamicDocumentData(null, gv1.t.a(dynamicDocumentDataContainer.getData()), aVar.M(dynamicDocumentDataContainer.getSchemaContainer().getSchema()), userDocumentData.getPhoto(), (mv1.b) bVar10.a((dx.i) objK), str6, localDate, enumC4479b4, null));
                                            bVar5 = bVar9;
                                            iVar2 = right3;
                                        }
                                        dynamicDocumentData3 = (DynamicDocumentData) bVar5.a(iVar2);
                                        return new dx.i.Right(dynamicDocumentData3);
                                    }
                                }
                                return objE;
                            } catch (CancellationException e39) {
                                throw e39;
                            }
                        } catch (Exception e45) {
                            e = e45;
                        }
                    } catch (ex.c e46) {
                        e = e46;
                    } catch (CancellationException e47) {
                        throw e47;
                    } catch (Exception e48) {
                        e = e48;
                    }
                } catch (ex.c e49) {
                    e = e49;
                } catch (CancellationException e55) {
                    e = e55;
                } catch (Exception e56) {
                    e = e56;
                }
            } catch (ex.c e57) {
                e = e57;
            } catch (CancellationException e58) {
                throw e58;
            } catch (Exception e59) {
                e = e59;
                r15 = 5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x031d  */
        /* JADX WARN: Code duplicated, block: B:102:0x0321 A[Catch: Exception -> 0x00b8, c -> 0x00bd, CancellationException -> 0x00c2, TryCatch #18 {c -> 0x00bd, CancellationException -> 0x00c2, Exception -> 0x00b8, blocks: (B:28:0x00a8, B:98:0x0317, B:102:0x0321, B:104:0x0325, B:61:0x0199), top: B:168:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0325 A[Catch: Exception -> 0x00b8, c -> 0x00bd, CancellationException -> 0x00c2, TRY_LEAVE, TryCatch #18 {c -> 0x00bd, CancellationException -> 0x00c2, Exception -> 0x00b8, blocks: (B:28:0x00a8, B:98:0x0317, B:102:0x0321, B:104:0x0325, B:61:0x0199), top: B:168:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x0342 A[Catch: Exception -> 0x034d, c -> 0x0352, CancellationException -> 0x0357, TryCatch #15 {c -> 0x0352, CancellationException -> 0x0357, Exception -> 0x034d, blocks: (B:105:0x033c, B:107:0x0342, B:115:0x035f), top: B:177:0x033c }] */
        /* JADX WARN: Code duplicated, block: B:114:0x035c  */
        /* JADX WARN: Code duplicated, block: B:120:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:138:0x03f5  */
        /* JADX WARN: Code duplicated, block: B:156:0x0423  */
        /* JADX WARN: Code duplicated, block: B:159:0x0434  */
        /* JADX WARN: Code duplicated, block: B:160:0x0442  */
        /* JADX WARN: Code duplicated, block: B:162:0x0446  */
        /* JADX WARN: Code duplicated, block: B:165:0x0453  */
        /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x0240  */
        /* JADX WARN: Code duplicated, block: B:74:0x0242 A[Catch: Exception -> 0x006e, c -> 0x0072, CancellationException -> 0x0076, TryCatch #14 {c -> 0x0072, CancellationException -> 0x0076, Exception -> 0x006e, blocks: (B:16:0x0061, B:40:0x00ec, B:80:0x02a8, B:81:0x02be, B:71:0x023a, B:74:0x0242, B:76:0x0246, B:82:0x02c7, B:83:0x02cc), top: B:168:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0246 A[Catch: Exception -> 0x006e, c -> 0x0072, CancellationException -> 0x0076, TryCatch #14 {c -> 0x0072, CancellationException -> 0x0076, Exception -> 0x006e, blocks: (B:16:0x0061, B:40:0x00ec, B:80:0x02a8, B:81:0x02be, B:71:0x023a, B:74:0x0242, B:76:0x0246, B:82:0x02c7, B:83:0x02cc), top: B:168:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:79:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:82:0x02c7 A[Catch: Exception -> 0x006e, c -> 0x0072, CancellationException -> 0x0076, TryCatch #14 {c -> 0x0072, CancellationException -> 0x0076, Exception -> 0x006e, blocks: (B:16:0x0061, B:40:0x00ec, B:80:0x02a8, B:81:0x02be, B:71:0x023a, B:74:0x0242, B:76:0x0246, B:82:0x02c7, B:83:0x02cc), top: B:168:0x0029 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v37 */
        /* JADX WARN: Type inference failed for: r5v39 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Type inference failed for: r5v41 */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r5v43 */
        /* JADX WARN: Type inference failed for: r5v44 */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v46 */
        /* JADX WARN: Type inference failed for: r5v47 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v43 */
        @Override // kv1.a
        public Object i(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar) throws Throwable {
            h hVar;
            String message;
            dx.i iVarA;
            Object objB;
            w24.o0 o0Var;
            ez.c cVar;
            Object obj;
            q34.n0 n0Var;
            ex.b bVar;
            ex.b bVar2;
            ex.b bVar3;
            int i15;
            int i16;
            int i17;
            int i18;
            c54.b bVar4;
            rq0.b.EnumC4479b enumC4479b2;
            int i19;
            UserDocumentData userDocumentData;
            ez.c cVar2;
            ex.b bVar5;
            UserDocumentData userDocumentData2;
            rq0.b.EnumC4479b enumC4479b3;
            int i25;
            ex.b bVar6;
            Object obj2;
            dx.i right;
            i24.DynamicDocumentData dynamicDocumentData;
            ex.b bVar7;
            i24.DynamicDocumentData dynamicDocumentData2;
            DynamicDocumentData dynamicDocumentData3;
            dx.i iVar;
            DynamicDocumentDataContainer dynamicDocumentDataContainer;
            fz.b.LocalDate expirationDate;
            String documentId;
            Date dateF;
            a aVar;
            fz.b.LocalDate localDate;
            rq0.b.EnumC4479b enumC4479b4;
            DynamicDocumentDataContainer dynamicDocumentDataContainer2;
            ex.b bVar8;
            String str;
            ?? r15;
            dx.i right2;
            a aVar2;
            ?? r16;
            if (eVar instanceof h) {
                hVar = (h) eVar;
                int i26 = hVar.A;
                if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.A = i26 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objK = hVar.f156060y;
            Object objE = uq.b.e();
            int i27 = hVar.A;
            ?? r17 = 5;
            r17 = 5;
            r17 = 5;
            r17 = 5;
            r17 = 5;
            r17 = 5;
            ?? r18 = 1;
            r18 = 1;
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i27 == 0) {
                                        oq.u.b(objK);
                                        c54.b bVar9 = this.f155902a;
                                        o0Var = this.f155919r;
                                        q34.n0 n0Var2 = this.f155920s;
                                        ez.c cVar3 = this.f155921t;
                                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                        ex.a aVar3 = new ex.a();
                                        hVar.f156042d = enumC4479b;
                                        hVar.f156043e = bVar9;
                                        hVar.f156044f = o0Var;
                                        hVar.f156045g = n0Var2;
                                        hVar.f156046h = cVar3;
                                        hVar.f156047j = jVarA;
                                        hVar.f156048k = vq.j.a(aVar3);
                                        hVar.f156049l = aVar3;
                                        hVar.f156050m = aVar3;
                                        hVar.f156053q = 0;
                                        hVar.f156054r = 0;
                                        hVar.f156055s = 0;
                                        hVar.f156056t = 0;
                                        hVar.f156057v = 0;
                                        hVar.A = 1;
                                        Object objQ = q(hVar);
                                        if (objQ != objE) {
                                            cVar = cVar3;
                                            obj = jVarA;
                                            objK = objQ;
                                            n0Var = n0Var2;
                                            bVar = aVar3;
                                            bVar2 = bVar;
                                            bVar3 = bVar2;
                                            i15 = 0;
                                            i16 = 0;
                                            i17 = 0;
                                            i18 = 0;
                                            bVar4 = bVar9;
                                            enumC4479b2 = enumC4479b;
                                            i19 = 0;
                                        }
                                        return objE;
                                    }
                                    if (i27 != 1) {
                                        if (i27 == 2) {
                                            i25 = hVar.f156057v;
                                            int i28 = hVar.f156056t;
                                            int i29 = hVar.f156055s;
                                            int i35 = hVar.f156054r;
                                            int i36 = hVar.f156053q;
                                            UserDocumentData userDocumentData3 = (UserDocumentData) hVar.f156047j;
                                            ex.b bVar10 = (ex.b) hVar.f156046h;
                                            ex.b bVar11 = (ex.b) hVar.f156045g;
                                            ex.b bVar12 = (ex.b) hVar.f156044f;
                                            dx.j jVar = (dx.j) hVar.f156043e;
                                            enumC4479b3 = (rq0.b.EnumC4479b) hVar.f156042d;
                                            try {
                                                oq.u.b(objK);
                                                i15 = i28;
                                                userDocumentData2 = userDocumentData3;
                                                bVar3 = bVar12;
                                                i16 = i29;
                                                i18 = i36;
                                                bVar6 = bVar10;
                                                obj2 = jVar;
                                                i17 = i35;
                                                bVar = bVar11;
                                                right = (dx.i) objK;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    dynamicDocumentData = (i24.DynamicDocumentData) ((dx.i.Right) right).b();
                                                    String documentId2 = dynamicDocumentData.getDocument().getDocumentId();
                                                    rq0.b.EnumC4479b enumC4479b5 = enumC4479b3;
                                                    rq0.b bVarA = r2.a(dynamicDocumentData.getDocument().getDocumentType());
                                                    hVar.f156042d = vq.j.a(enumC4479b5);
                                                    hVar.f156043e = obj2;
                                                    hVar.f156044f = vq.j.a(bVar3);
                                                    hVar.f156045g = vq.j.a(bVar);
                                                    hVar.f156046h = bVar6;
                                                    hVar.f156047j = userDocumentData2;
                                                    hVar.f156048k = vq.j.a(right);
                                                    hVar.f156049l = dynamicDocumentData;
                                                    hVar.f156050m = bVar;
                                                    hVar.f156053q = i18;
                                                    hVar.f156054r = i17;
                                                    hVar.f156055s = i16;
                                                    hVar.f156056t = i15;
                                                    hVar.f156057v = i25;
                                                    hVar.f156058w = 0;
                                                    hVar.f156059x = 0;
                                                    hVar.A = 3;
                                                    objK = k(null, bVarA, documentId2, hVar);
                                                    if (objK == objE) {
                                                        objE = objE;
                                                        obj = dynamicDocumentData;
                                                        obj = obj;
                                                        obj = obj;
                                                        return objE;
                                                    }
                                                    objE = objE;
                                                    bVar7 = bVar;
                                                    dynamicDocumentData2 = dynamicDocumentData;
                                                }
                                                dynamicDocumentData3 = (DynamicDocumentData) bVar6.a(right);
                                                return new dx.i.Right(dynamicDocumentData3);
                                            } catch (ex.c e15) {
                                                e = e15;
                                            } catch (CancellationException e16) {
                                                throw e16;
                                            } catch (Exception e17) {
                                                e = e17;
                                                r18 = jVar;
                                                px.f fVar = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                fVar.d(message, e, px.c.a(r18));
                                                iVarA = r18.a(e);
                                                if (iVarA instanceof dx.i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                } else {
                                                    if (iVarA instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVarA).b();
                                                }
                                                return new dx.i.Left(objB);
                                            }
                                        } else if (i27 != 3) {
                                            try {
                                                if (i27 == 4) {
                                                    int i37 = hVar.f156057v;
                                                    int i38 = hVar.f156056t;
                                                    int i39 = hVar.f156055s;
                                                    int i45 = hVar.f156054r;
                                                    int i46 = hVar.f156053q;
                                                    userDocumentData = (UserDocumentData) hVar.f156048k;
                                                    ex.b bVar13 = (ex.b) hVar.f156047j;
                                                    bVar5 = (ex.b) hVar.f156046h;
                                                    ex.b bVar14 = (ex.b) hVar.f156045g;
                                                    dx.j jVar2 = (dx.j) hVar.f156044f;
                                                    ez.c cVar4 = (ez.c) hVar.f156043e;
                                                    rq0.b.EnumC4479b enumC4479b6 = (rq0.b.EnumC4479b) hVar.f156042d;
                                                    oq.u.b(objK);
                                                    bVar3 = bVar14;
                                                    cVar2 = cVar4;
                                                    i16 = i39;
                                                    i15 = i38;
                                                    i19 = i37;
                                                    enumC4479b2 = enumC4479b6;
                                                    i17 = i45;
                                                    bVar = bVar13;
                                                    i18 = i46;
                                                    r17 = jVar2;
                                                    iVar = (dx.i) objK;
                                                    if (iVar instanceof dx.i.Left) {
                                                        if (iVar instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        dynamicDocumentDataContainer = (DynamicDocumentDataContainer) ((dx.i.Right) iVar).b();
                                                        expirationDate = dynamicDocumentDataContainer.getSchemaContainer().getExpirationDate();
                                                        try {
                                                            documentId = dynamicDocumentDataContainer.getSchemaContainer().getDocumentId();
                                                            if (expirationDate != null) {
                                                                dateF = cVar2.f(expirationDate.getDate());
                                                            } else {
                                                                dateF = null;
                                                            }
                                                            hVar.f156042d = enumC4479b2;
                                                            hVar.f156043e = r17;
                                                            hVar.f156044f = vq.j.a(bVar3);
                                                            hVar.f156045g = vq.j.a(bVar5);
                                                            hVar.f156046h = bVar;
                                                            hVar.f156047j = userDocumentData;
                                                            hVar.f156048k = vq.j.a(iVar);
                                                            hVar.f156049l = dynamicDocumentDataContainer;
                                                            hVar.f156050m = expirationDate;
                                                            hVar.f156051n = documentId;
                                                            hVar.f156052p = bVar5;
                                                            hVar.f156053q = i18;
                                                            hVar.f156054r = i17;
                                                            hVar.f156055s = i16;
                                                            hVar.f156056t = i15;
                                                            hVar.f156057v = i19;
                                                            hVar.f156058w = 0;
                                                            hVar.f156059x = 0;
                                                            hVar.A = 5;
                                                            aVar = this;
                                                            objK = aVar.k(dateF, enumC4479b2, documentId, hVar);
                                                            if (objK == objE) {
                                                                return objE;
                                                            }
                                                            localDate = expirationDate;
                                                            enumC4479b4 = enumC4479b2;
                                                            dynamicDocumentDataContainer2 = dynamicDocumentDataContainer;
                                                            bVar8 = bVar5;
                                                            str = documentId;
                                                            r16 = r17;
                                                            aVar2 = aVar;
                                                        } catch (ex.c e18) {
                                                            e = e18;
                                                        } catch (CancellationException e19) {
                                                            e = e19;
                                                            throw e;
                                                        } catch (Exception e25) {
                                                            e = e25;
                                                            r18 = r17;
                                                            px.f fVar2 = px.f.f163100a;
                                                            message = e.getMessage();
                                                            if (message == null) {
                                                                message = "";
                                                            }
                                                            fVar2.d(message, e, px.c.a(r18));
                                                            iVarA = r18.a(e);
                                                            if (iVarA instanceof dx.i.Left) {
                                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                            } else {
                                                                if (iVarA instanceof dx.i.Right) {
                                                                    throw new oq.p();
                                                                }
                                                                objB = ((dx.i.Right) iVarA).b();
                                                            }
                                                            return new dx.i.Left(objB);
                                                        }
                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                    }
                                                    right2 = iVar;
                                                    r15 = r17;
                                                    dynamicDocumentData3 = (DynamicDocumentData) bVar.a(right2);
                                                    return new dx.i.Right(dynamicDocumentData3);
                                                }
                                                if (i27 != 5) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                bVar8 = (ex.b) hVar.f156052p;
                                                String str2 = (String) hVar.f156051n;
                                                fz.b.LocalDate localDate2 = (fz.b.LocalDate) hVar.f156050m;
                                                dynamicDocumentDataContainer2 = (DynamicDocumentDataContainer) hVar.f156049l;
                                                UserDocumentData userDocumentData4 = (UserDocumentData) hVar.f156047j;
                                                bVar = (ex.b) hVar.f156046h;
                                                dx.j jVar3 = (dx.j) hVar.f156043e;
                                                rq0.b.EnumC4479b enumC4479b7 = (rq0.b.EnumC4479b) hVar.f156042d;
                                                oq.u.b(objK);
                                                enumC4479b4 = enumC4479b7;
                                                str = str2;
                                                localDate = localDate2;
                                                userDocumentData = userDocumentData4;
                                                r16 = jVar3;
                                                aVar2 = this;
                                                dynamicDocumentData3 = (DynamicDocumentData) bVar.a(right2);
                                                return new dx.i.Right(dynamicDocumentData3);
                                            } catch (ex.c e26) {
                                                e = e26;
                                            } catch (CancellationException e27) {
                                                throw e27;
                                            }
                                            ex.b bVar15 = bVar;
                                            bVar = bVar15;
                                            right2 = new dx.i.Right(new DynamicDocumentData(null, gv1.t.a(dynamicDocumentDataContainer2.getData()), aVar2.M(dynamicDocumentDataContainer2.getSchemaContainer().getSchema()), userDocumentData.getPhoto(), (mv1.b) bVar8.a((dx.i) objK), str, localDate, enumC4479b4, null));
                                            r15 = r16;
                                        } else {
                                            bVar7 = (ex.b) hVar.f156050m;
                                            i24.DynamicDocumentData dynamicDocumentData4 = (i24.DynamicDocumentData) hVar.f156049l;
                                            userDocumentData2 = (UserDocumentData) hVar.f156047j;
                                            bVar6 = (ex.b) hVar.f156046h;
                                            oq.u.b(objK);
                                            dynamicDocumentData2 = dynamicDocumentData4;
                                        }
                                        right = new dx.i.Right(R(dynamicDocumentData2, userDocumentData2.getPhoto(), (mv1.b) bVar7.a((dx.i) objK)));
                                        dynamicDocumentData3 = (DynamicDocumentData) bVar6.a(right);
                                        return new dx.i.Right(dynamicDocumentData3);
                                    }
                                    int i47 = hVar.f156057v;
                                    int i48 = hVar.f156056t;
                                    i16 = hVar.f156055s;
                                    i17 = hVar.f156054r;
                                    int i49 = hVar.f156053q;
                                    ex.b bVar16 = (ex.b) hVar.f156050m;
                                    ex.b bVar17 = (ex.b) hVar.f156049l;
                                    ex.b bVar18 = (ex.b) hVar.f156048k;
                                    dx.j jVar4 = (dx.j) hVar.f156047j;
                                    ez.c cVar5 = (ez.c) hVar.f156046h;
                                    q34.n0 n0Var3 = (q34.n0) hVar.f156045g;
                                    o0Var = (w24.o0) hVar.f156044f;
                                    c54.b bVar19 = (c54.b) hVar.f156043e;
                                    enumC4479b2 = (rq0.b.EnumC4479b) hVar.f156042d;
                                    try {
                                        oq.u.b(objK);
                                        i15 = i48;
                                        bVar4 = bVar19;
                                        n0Var = n0Var3;
                                        bVar = bVar17;
                                        cVar = cVar5;
                                        bVar3 = bVar18;
                                        bVar2 = bVar16;
                                        i18 = i49;
                                        obj = jVar4;
                                        i19 = i47;
                                    } catch (ex.c e28) {
                                        e = e28;
                                    } catch (CancellationException e29) {
                                        throw e29;
                                    } catch (Exception e35) {
                                        e = e35;
                                        r18 = jVar4;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar3.d(message, e, px.c.a(r18));
                                        iVarA = r18.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                    UserDocumentData userDocumentData5 = (UserDocumentData) bVar2.a((dx.i) objK);
                                    boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                    if (zBooleanValue) {
                                        w24.o0.Params params = new w24.o0.Params((f24.i) bVar.a(j1.l(enumC4479b2)));
                                        hVar.f156042d = vq.j.a(enumC4479b2);
                                        hVar.f156043e = obj;
                                        hVar.f156044f = vq.j.a(bVar3);
                                        hVar.f156045g = bVar;
                                        hVar.f156046h = bVar;
                                        hVar.f156047j = userDocumentData5;
                                        hVar.f156048k = null;
                                        hVar.f156049l = null;
                                        hVar.f156050m = null;
                                        hVar.f156053q = i18;
                                        hVar.f156054r = i17;
                                        hVar.f156055s = i16;
                                        hVar.f156056t = i15;
                                        hVar.f156057v = i19;
                                        hVar.A = 2;
                                        Object objC = o0Var.c(params, hVar);
                                        if (objC != objE) {
                                            obj = obj;
                                            userDocumentData2 = userDocumentData5;
                                            objK = objC;
                                            enumC4479b3 = enumC4479b2;
                                            i25 = i19;
                                            bVar6 = bVar;
                                            obj2 = obj;
                                            right = (dx.i) objK;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (right instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                dynamicDocumentData = (i24.DynamicDocumentData) ((dx.i.Right) right).b();
                                                String documentId3 = dynamicDocumentData.getDocument().getDocumentId();
                                                rq0.b.EnumC4479b enumC4479b8 = enumC4479b3;
                                                rq0.b bVarA2 = r2.a(dynamicDocumentData.getDocument().getDocumentType());
                                                hVar.f156042d = vq.j.a(enumC4479b8);
                                                hVar.f156043e = obj2;
                                                hVar.f156044f = vq.j.a(bVar3);
                                                hVar.f156045g = vq.j.a(bVar);
                                                hVar.f156046h = bVar6;
                                                hVar.f156047j = userDocumentData2;
                                                hVar.f156048k = vq.j.a(right);
                                                hVar.f156049l = dynamicDocumentData;
                                                hVar.f156050m = bVar;
                                                hVar.f156053q = i18;
                                                hVar.f156054r = i17;
                                                hVar.f156055s = i16;
                                                hVar.f156056t = i15;
                                                hVar.f156057v = i25;
                                                hVar.f156058w = 0;
                                                hVar.f156059x = 0;
                                                hVar.A = 3;
                                                objK = k(null, bVarA2, documentId3, hVar);
                                                if (objK == objE) {
                                                    objE = objE;
                                                    obj = dynamicDocumentData;
                                                } else {
                                                    objE = objE;
                                                    bVar7 = bVar;
                                                    dynamicDocumentData2 = dynamicDocumentData;
                                                    right = new dx.i.Right(R(dynamicDocumentData2, userDocumentData2.getPhoto(), (mv1.b) bVar7.a((dx.i) objK)));
                                                }
                                            }
                                            dynamicDocumentData3 = (DynamicDocumentData) bVar6.a(right);
                                            return new dx.i.Right(dynamicDocumentData3);
                                        }
                                    } else {
                                        if (zBooleanValue) {
                                            try {
                                                throw new oq.p();
                                            } catch (ex.c e36) {
                                                e = e36;
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            } catch (CancellationException e37) {
                                                e = e37;
                                                throw e;
                                            } catch (Exception e38) {
                                                e = e38;
                                                r18 = obj;
                                                px.f fVar4 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                fVar4.d(message, e, px.c.a(r18));
                                                iVarA = r18.a(e);
                                                if (iVarA instanceof dx.i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                } else {
                                                    if (iVarA instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVarA).b();
                                                }
                                                return new dx.i.Left(objB);
                                            }
                                        }
                                        q34.n0.Params params2 = new q34.n0.Params(enumC4479b2);
                                        hVar.f156042d = enumC4479b2;
                                        hVar.f156043e = cVar;
                                        hVar.f156044f = obj;
                                        hVar.f156045g = vq.j.a(bVar3);
                                        hVar.f156046h = bVar;
                                        hVar.f156047j = bVar;
                                        hVar.f156048k = userDocumentData5;
                                        hVar.f156049l = null;
                                        hVar.f156050m = null;
                                        hVar.f156053q = i18;
                                        hVar.f156054r = i17;
                                        hVar.f156055s = i16;
                                        hVar.f156056t = i15;
                                        hVar.f156057v = i19;
                                        hVar.A = 4;
                                        Object objC2 = n0Var.c(params2, hVar);
                                        if (objC2 != objE) {
                                            obj = obj;
                                            Object obj3 = obj;
                                            userDocumentData = userDocumentData5;
                                            objK = objC2;
                                            r17 = obj3;
                                            cVar2 = cVar;
                                            bVar5 = bVar;
                                            iVar = (dx.i) objK;
                                            if (iVar instanceof dx.i.Left) {
                                                if (iVar instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                dynamicDocumentDataContainer = (DynamicDocumentDataContainer) ((dx.i.Right) iVar).b();
                                                expirationDate = dynamicDocumentDataContainer.getSchemaContainer().getExpirationDate();
                                                documentId = dynamicDocumentDataContainer.getSchemaContainer().getDocumentId();
                                                if (expirationDate != null) {
                                                    dateF = cVar2.f(expirationDate.getDate());
                                                } else {
                                                    dateF = null;
                                                }
                                                hVar.f156042d = enumC4479b2;
                                                hVar.f156043e = r17;
                                                hVar.f156044f = vq.j.a(bVar3);
                                                hVar.f156045g = vq.j.a(bVar5);
                                                hVar.f156046h = bVar;
                                                hVar.f156047j = userDocumentData;
                                                hVar.f156048k = vq.j.a(iVar);
                                                hVar.f156049l = dynamicDocumentDataContainer;
                                                hVar.f156050m = expirationDate;
                                                hVar.f156051n = documentId;
                                                hVar.f156052p = bVar5;
                                                hVar.f156053q = i18;
                                                hVar.f156054r = i17;
                                                hVar.f156055s = i16;
                                                hVar.f156056t = i15;
                                                hVar.f156057v = i19;
                                                hVar.f156058w = 0;
                                                hVar.f156059x = 0;
                                                hVar.A = 5;
                                                aVar = this;
                                                objK = aVar.k(dateF, enumC4479b2, documentId, hVar);
                                                if (objK == objE) {
                                                    return objE;
                                                }
                                                localDate = expirationDate;
                                                enumC4479b4 = enumC4479b2;
                                                dynamicDocumentDataContainer2 = dynamicDocumentDataContainer;
                                                bVar8 = bVar5;
                                                str = documentId;
                                                r16 = r17;
                                                aVar2 = aVar;
                                                ex.b bVar110 = bVar;
                                                bVar = bVar110;
                                                right2 = new dx.i.Right(new DynamicDocumentData(null, gv1.t.a(dynamicDocumentDataContainer2.getData()), aVar2.M(dynamicDocumentDataContainer2.getSchemaContainer().getSchema()), userDocumentData.getPhoto(), (mv1.b) bVar8.a((dx.i) objK), str, localDate, enumC4479b4, null));
                                                r15 = r16;
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            }
                                            right2 = iVar;
                                            r15 = r17;
                                            dynamicDocumentData3 = (DynamicDocumentData) bVar.a(right2);
                                            return new dx.i.Right(dynamicDocumentData3);
                                        }
                                    }
                                    obj = obj;
                                    obj = obj;
                                    return objE;
                                } catch (ex.c e39) {
                                    e = e39;
                                } catch (CancellationException e45) {
                                    e = e45;
                                } catch (Exception e46) {
                                    e = e46;
                                }
                            } catch (CancellationException e47) {
                                throw e47;
                            }
                        } catch (Exception e48) {
                            e = e48;
                        }
                    } catch (ex.c e49) {
                        e = e49;
                    } catch (CancellationException e55) {
                        e = e55;
                    } catch (Exception e56) {
                        e = e56;
                    }
                } catch (ex.c e57) {
                    e = e57;
                } catch (CancellationException e58) {
                    e = e58;
                } catch (Exception e59) {
                    e = e59;
                }
            } catch (ex.c e65) {
                e = e65;
            } catch (CancellationException e66) {
                throw e66;
            } catch (Exception e67) {
                e = e67;
            }
        }

        @Override // kv1.a
        public mu.g<rq0.b.EnumC4479b> j() {
            return new n((mu.g) this.A.a(gz.b.a.C1792a.f78542a));
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e7 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0100 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0173  */
        /* JADX WARN: Code duplicated, block: B:62:0x0174 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0178 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0195 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:59:0x016d, B:65:0x0189, B:66:0x018f, B:62:0x0174, B:64:0x0178, B:67:0x0195, B:68:0x019a, B:71:0x01a1, B:74:0x01af, B:24:0x0076, B:34:0x00dc, B:40:0x00f8, B:37:0x00e3, B:39:0x00e7, B:41:0x0100, B:42:0x0105), top: B:89:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        @Override // kv1.a
        public Object k(Date date, rq0.b bVar, String str, tq.e<? super dx.i<? extends dx.b, ? extends mv1.b>> eVar) throws Throwable {
            g gVar;
            Object objB;
            ex.b bVar2;
            ex.b bVar3;
            Object right;
            mv1.b bVar4;
            Object right2;
            if (eVar instanceof g) {
                gVar = (g) eVar;
                int i15 = gVar.f156041t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar.f156041t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object objC = gVar.f156039r;
            Object objE = uq.b.e();
            int i16 = gVar.f156041t;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar5 = this.f155902a;
                            w24.k0 k0Var = this.f155909h;
                            q34.j0 j0Var = this.f155910i;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar5.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    gVar.f156027d = vq.j.a(date);
                                    gVar.f156028e = vq.j.a(bVar);
                                    gVar.f156029f = vq.j.a(str);
                                    gVar.f156030g = jVarA;
                                    gVar.f156031h = vq.j.a(aVar);
                                    gVar.f156032j = vq.j.a(aVar);
                                    gVar.f156033k = aVar;
                                    gVar.f156034l = 0;
                                    gVar.f156035m = 0;
                                    gVar.f156036n = 0;
                                    gVar.f156037p = 0;
                                    gVar.f156038q = 0;
                                    gVar.f156041t = 1;
                                    objC = k0Var.c(params, gVar);
                                    if (objC != objE) {
                                        bVar3 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(O((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        bVar4 = (mv1.b) bVar3.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a allDocumentStatus = str == null ? new q34.j0.a.AllDocumentStatus(bVar, date) : new q34.j0.a.SingleMultidocumentStatus(bVar, date, str);
                                    gVar.f156027d = vq.j.a(date);
                                    gVar.f156028e = vq.j.a(bVar);
                                    gVar.f156029f = vq.j.a(str);
                                    gVar.f156030g = jVarA;
                                    gVar.f156031h = vq.j.a(aVar);
                                    gVar.f156032j = vq.j.a(aVar);
                                    gVar.f156033k = aVar;
                                    gVar.f156034l = 0;
                                    gVar.f156035m = 0;
                                    gVar.f156036n = 0;
                                    gVar.f156037p = 0;
                                    gVar.f156038q = 0;
                                    gVar.f156041t = 2;
                                    objC = j0Var.c(allDocumentStatus, gVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(N((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        bVar4 = (mv1.b) bVar2.a(right2);
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                bVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(bVar));
                                dx.i iVarA = bVar.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar3 = (ex.b) gVar.f156033k;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(O((f24.h) ((dx.i.Right) right).b()));
                            }
                            bVar4 = (mv1.b) bVar3.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) gVar.f156033k;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(N((er0.h) ((dx.i.Right) right2).b()));
                            }
                            bVar4 = (mv1.b) bVar2.a(right2);
                        }
                        return new dx.i.Right(bVar4);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:144:0x058b A[Catch: Exception -> 0x06b7, c -> 0x06be, CancellationException -> 0x06c5, TRY_LEAVE, TryCatch #19 {c -> 0x06be, CancellationException -> 0x06c5, Exception -> 0x06b7, blocks: (B:142:0x0585, B:144:0x058b, B:150:0x05ac), top: B:239:0x0585 }] */
        /* JADX WARN: Code duplicated, block: B:146:0x059b  */
        /* JADX WARN: Code duplicated, block: B:149:0x05a8  */
        /* JADX WARN: Code duplicated, block: B:158:0x062a  */
        /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x0202: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:48:0x0202 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x0206: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:50:0x0206 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x020a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:52:0x020a */
        /* JADX WARN: Not initialized variable reg: 18, insn: 0x06f9: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:180:0x06f9 */
        /* JADX WARN: Not initialized variable reg: 18, insn: 0x06fd: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:182:0x06fd */
        /* JADX WARN: Not initialized variable reg: 18, insn: 0x0701: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:184:0x0701 */
        /* JADX WARN: Path cross not found for [B:10:0x002b, B:62:0x025e], limit reached: 249 */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v36 */
        /* JADX WARN: Type inference failed for: r11v37 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v26 */
        /* JADX WARN: Type inference failed for: r18v12 */
        /* JADX WARN: Type inference failed for: r18v14 */
        /* JADX WARN: Type inference failed for: r18v6 */
        /* JADX WARN: Type inference failed for: r18v7 */
        /* JADX WARN: Type inference failed for: r18v8 */
        /* JADX WARN: Type inference failed for: r28v0 */
        /* JADX WARN: Type inference failed for: r28v1 */
        /* JADX WARN: Type inference failed for: r28v10 */
        /* JADX WARN: Type inference failed for: r28v11 */
        /* JADX WARN: Type inference failed for: r28v12 */
        /* JADX WARN: Type inference failed for: r28v17 */
        /* JADX WARN: Type inference failed for: r28v18 */
        /* JADX WARN: Type inference failed for: r28v19 */
        /* JADX WARN: Type inference failed for: r28v2 */
        /* JADX WARN: Type inference failed for: r28v8 */
        /* JADX WARN: Type inference failed for: r28v9 */
        /* JADX WARN: Type inference failed for: r41v3 */
        /* JADX WARN: Type inference failed for: r41v4 */
        /* JADX WARN: Type inference failed for: r41v5 */
        /* JADX WARN: Type inference failed for: r41v6 */
        /* JADX WARN: Type inference failed for: r41v7 */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v117 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v20 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v34 */
        /* JADX WARN: Type inference failed for: r4v35 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v48 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v52 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v84 */
        /* JADX WARN: Type inference failed for: r4v87 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x062a -> B:159:0x0652). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0421 -> B:237:0x0447). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kv1.a
        public java.lang.Object l(rq0.b.c r41, tq.e<? super dx.i<? extends dx.b, mv1.DynamicMultiDocumentFullData>> r42) {
            /*
                Method dump skipped, instruction units count: 1909
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s3.a.l(rq0.b$c, tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kv1.a
        public Object m(rq0.b bVar, er.a<oq.i0> aVar, tq.e<? super DialogData> eVar) throws Throwable {
            k kVar;
            dx.b.Business error;
            if (eVar instanceof k) {
                kVar = (k) eVar;
                int i15 = kVar.f156089h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    kVar.f156089h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    kVar = new k(eVar);
                }
            } else {
                kVar = new k(eVar);
            }
            Object objC = kVar.f156087f;
            Object objE = uq.b.e();
            int i16 = kVar.f156089h;
            if (i16 == 0) {
                oq.u.b(objC);
                r34.b bVar2 = this.B;
                r34.b.Params params = new r34.b.Params(bVar, aVar);
                kVar.f156085d = vq.j.a(bVar);
                kVar.f156086e = vq.j.a(aVar);
                kVar.f156089h = 1;
                objC = bVar2.c(params, kVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            r34.b.Result result = (r34.b.Result) objC;
            if (result == null || (error = result.getError()) == null) {
                return null;
            }
            dx.b.Business.a type = error.getType();
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0133  */
        /* JADX WARN: Code duplicated, block: B:65:0x0144  */
        /* JADX WARN: Code duplicated, block: B:66:0x0152  */
        /* JADX WARN: Code duplicated, block: B:68:0x0156  */
        /* JADX WARN: Code duplicated, block: B:71:0x0162  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kv1.a
        public Object n(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            c cVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155974r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155974r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155972p;
            Object objE = uq.b.e();
            int i16 = cVar.f155974r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f155902a;
                        w24.n nVar = this.f155911j;
                        q34.w wVar = this.f155913l;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                w24.n.Params params = new w24.n.Params((f24.i) aVar.a(j1.l(bVar)));
                                cVar.f155962d = vq.j.a(bVar);
                                cVar.f155963e = jVarA;
                                cVar.f155964f = vq.j.a(aVar);
                                cVar.f155965g = vq.j.a(aVar);
                                cVar.f155966h = aVar;
                                cVar.f155967j = 0;
                                cVar.f155968k = 0;
                                cVar.f155969l = 0;
                                cVar.f155970m = 0;
                                cVar.f155971n = 0;
                                cVar.f155974r = 1;
                                objC = nVar.c(params, cVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar2 = aVar;
                                    bVar2.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(bVar);
                                cVar.f155962d = vq.j.a(bVar);
                                cVar.f155963e = jVarA;
                                cVar.f155964f = vq.j.a(aVar);
                                cVar.f155965g = vq.j.a(aVar);
                                cVar.f155967j = 0;
                                cVar.f155968k = 0;
                                cVar.f155969l = 0;
                                cVar.f155970m = 0;
                                cVar.f155971n = 0;
                                cVar.f155974r = 2;
                                if (wVar.c(params2, cVar) != objE) {
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) cVar.f155966h;
                        jVar = (dx.j) cVar.f155963e;
                        try {
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            bVar = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // kv1.a
        public Object o(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            f fVar;
            Object objB;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f156026q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f156026q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f156024n;
            Object objE = uq.b.e();
            int i16 = fVar.f156026q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.e eVar2 = this.f155915n;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, bVar);
                            fVar.f156015d = vq.j.a(bVar);
                            fVar.f156016e = jVarA;
                            fVar.f156017f = vq.j.a(aVar);
                            fVar.f156018g = vq.j.a(aVar);
                            fVar.f156019h = 0;
                            fVar.f156020j = 0;
                            fVar.f156021k = 0;
                            fVar.f156022l = 0;
                            fVar.f156023m = 0;
                            fVar.f156026q = 1;
                            objC = eVar2.c(params, fVar);
                            if (objC == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar2 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(bVar));
                            dx.i iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right((String) objC);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:148:0x053f A[Catch: Exception -> 0x068e, c -> 0x0695, CancellationException -> 0x069c, TRY_LEAVE, TryCatch #27 {c -> 0x0695, CancellationException -> 0x069c, Exception -> 0x068e, blocks: (B:146:0x0539, B:148:0x053f, B:160:0x057f), top: B:224:0x0539 }] */
        /* JADX WARN: Code duplicated, block: B:150:0x055f  */
        /* JADX WARN: Code duplicated, block: B:159:0x057c  */
        /* JADX WARN: Code duplicated, block: B:168:0x05fc  */
        /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v35 */
        /* JADX WARN: Type inference failed for: r4v39 */
        /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v48 */
        /* JADX WARN: Type inference failed for: r4v52 */
        /* JADX WARN: Type inference failed for: r4v83 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x05fc -> B:18:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x03f8 -> B:92:0x041a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kv1.a
        public java.lang.Object p(rq0.b.EnumC4479b r40, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<mv1.DynamicDocumentData>>> r41) {
            /*
                Method dump skipped, instruction units count: 1817
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s3.a.p(rq0.b$b, tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        
            if (r6 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object q(tq.e<? super dx.i<? extends dx.b, lv1.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s3.a.q(tq.e):java.lang.Object");
        }
    }

    private s3() {
    }

    public final kv1.a a(g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.g getMainCertificateTypeUC, k24.l refreshDocumentsStatusesUC, q34.v1 refreshDocumentsStatusesUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, ez.c dateConverter, q34.j0 getDocumentValidityStatusUseCase, w24.k0 getDocumentValidityStatusUC, q34.w deleteDocumentUseCase, q34.u legacyDeleteDocumentByIdUC, k24.a containersDeleteDocumentByIdUC, w24.n deleteDocumentByTypeUC, r34.e getValueFromDocumentConfigUC, r34.b getMaintenanceBreakDialogFromDocumentConfigUC, q34.k1 isDocumentAddedUseCase, w24.f2 isDocumentAddedByTypeUC, q34.l1 isDocumentStoredByIdUC, q34.n0 getDynamicDocumentFromContainerUseCase, q34.d0 getByIdDynamicDocumentFromContainerUC, q34.b0 getAllByIdDynamicDocumentsFromContainerUC, q34.p0 getDynamicMultiDocumentFromContainerUC, q34.s1 monitorDocumentsSummaryDataUC, q34.d checkServiceTemporaryInterruptionUC, w24.q0 getDynamicDocumentDataUC, w24.o0 getDynamicDocumentDataByTypeUC, w24.x getAllDynamicDocumentsDataByTypeUC, w24.b1 getMultiDynamicDocumentDataByTypeUC, ay.i jsonFieldParser, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getMainCertificateTypeUC, identityManager, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, deleteDocumentByTypeUC, containersDeleteDocumentByIdUC, deleteDocumentUseCase, legacyDeleteDocumentByIdUC, getValueFromDocumentConfigUC, isDocumentAddedByTypeUC, isDocumentAddedUseCase, isDocumentStoredByIdUC, getDynamicDocumentDataByTypeUC, getDynamicDocumentFromContainerUseCase, dateConverter, getDynamicDocumentDataUC, getByIdDynamicDocumentFromContainerUC, getAllDynamicDocumentsDataByTypeUC, getAllByIdDynamicDocumentsFromContainerUC, getMultiDynamicDocumentDataByTypeUC, getDynamicMultiDocumentFromContainerUC, monitorDocumentsSummaryDataUC, getMaintenanceBreakDialogFromDocumentConfigUC, checkServiceTemporaryInterruptionUC, getDocumentDeletionDialogUC, jsonFieldParser);
    }
}
