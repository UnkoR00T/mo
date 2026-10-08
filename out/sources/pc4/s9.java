package pc4;

import do3.NipipCardData;
import do3.RailwayCardMemberData;
import do3.RefugeeFamilyData;
import eo3.DocumentConfigLabel;
import eo3.DocumentDynamicSection;
import eo3.DocumentSchemaForwardAttribute;
import eo3.DynamicDocumentSchema;
import eo3.DynamicSection;
import eo3.MultiDocumentSchema;
import eo3.MultiDocumentSelectorLabel;
import eo3.MultiDynamicDocumentData;
import eo3.PictureSchema;
import eo3.StaticSection;
import eo3.TopAnnotation;
import eo3.VerificationSelector;
import fr0.BEDocumentConfigLabel;
import g24.DocumentSchema;
import g24.DocumentSchemaAttribute;
import g24.DocumentSchemaBooleanTranslation;
import g24.DocumentStaticSection;
import g24.DocumentTopAnnotation;
import g24.DocumentsGroup;
import g24.MissingDocumentAttribute;
import gr0.DocumentSchemaLabel;
import gr0.DynamicDocument;
import gv1.DocumentSchemaEnumTranslation;
import h24.MultiDocumentView;
import i24.DynamicDocumentData;
import i24.DynamicMultiDocumentFullData;
import i24.NipipCardContainerData;
import i24.RailwayCardContainerData;
import i24.RefugeeCardData;
import i24.RefugeeChildrenCardFullData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jr0.NipipDataContainer;
import k34.RailwayCardDataModel;
import l34.DynamicDocumentDataContainer;
import m34.DynamicMultiDocumentFullDataContainer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJÇ\u0002\u0010X\u001a\u00020W2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lpc4/s9;", "", "<init>", "()V", "Lab4/c;", "handleFailedAttemptUseCase", "Lun3/c;", "b", "(Lab4/c;)Lun3/c;", "Lk24/c;", "getCertificatePeselTicketUC", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/b;", "getCertKeyPairUC", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/d;", "getCertificateTypeForParentDocumentUC", "Lq34/t0;", "getGodfatherDocumentTypeUseCase", "Lq34/u0;", "getIdentityTypeByDocumentTypeUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/c0;", "getBase64EncodedDocumentDataByScopeUseCase", "Lw24/g0;", "getDocumentEncodedScopeUC", "Lq34/g0;", "getDiiaChildrenDocumentsUseCase", "Lw24/l1;", "getRefugeeCardDataUC", "Lq34/h0;", "getDiiaDocumentUseCase", "Lq34/r0;", "getEncodedBase64DocumentUseCase", "Lw24/e0;", "getDocumentEncodedScopeByDocumentIdUC", "Lw24/n1;", "getRefugeeChildrenCardDataUC", "Lw24/m0;", "getDrivingLicenceDataUC", "Lq34/m0;", "getDrivingLicenceDocumentsFromContainerUseCase", "Lw24/x;", "getAllDynamicDocumentsDataByTypeUC", "Lw24/o0;", "getDynamicDocumentDataByTypeUC", "Lw24/q0;", "getDynamicDocumentDataUC", "Lw24/b1;", "getMultiDynamicDocumentDataByTypeUC", "Lq34/p0;", "getDynamicMultiDocumentFromContainerUC", "Lq34/b0;", "getAllByIdDynamicDocumentsFromContainerUC", "Lq34/d0;", "getByIdDynamicDocumentFromContainerUC", "Lq34/n0;", "getDynamicDocumentFromContainerUseCase", "Lq34/o0;", "getDynamicDocumentMemberDocumentUC", "Lq34/q0;", "getDynamicMultiDocumentMemberDocumentUC", "Lev1/a;", "dynamicDocumentSchemaDecoder", "Lay/i;", "jsonFieldParser", "Lq34/s0;", "getFamilyCardDataUC", "Lq34/d1;", "getUutCardDataUC", "Lw24/j1;", "getRailwayCardDataUC", "Lw24/s0;", "containersGetFamilyCardDataUC", "Lq34/a1;", "getPwzNurseCardFromContainerUseCase", "Lw24/z0;", "getMidwifeCardDataUC", "Lw24/d1;", "getNurseCardDataUC", "Lbo3/a;", "a", "(Lk24/c;Lg34/c;Lc54/b;Lk24/b;Lk24/g;Lk24/d;Lq34/t0;Lq34/u0;Lq34/x0;Lw24/x0;Lq34/c0;Lw24/g0;Lq34/g0;Lw24/l1;Lq34/h0;Lq34/r0;Lw24/e0;Lw24/n1;Lw24/m0;Lq34/m0;Lw24/x;Lw24/o0;Lw24/q0;Lw24/b1;Lq34/p0;Lq34/b0;Lq34/d0;Lq34/n0;Lq34/o0;Lq34/q0;Lev1/a;Lay/i;Lq34/s0;Lq34/d1;Lw24/j1;Lw24/s0;Lq34/a1;Lw24/z0;Lw24/d1;)Lbo3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s9 f156202a = new s9();

    @Metadata(d1 = {"\u0000×\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00103\u001a\u000202*\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00107\u001a\u000206*\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0013\u0010;\u001a\u00020:*\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010?\u001a\u00020>*\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010C\u001a\u00020B*\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0013\u0010G\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010K\u001a\u00020J*\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0013\u0010O\u001a\u00020N*\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010S\u001a\u00020R*\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010W\u001a\u00020V*\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0013\u0010[\u001a\u00020Z*\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u0013\u0010_\u001a\u00020^*\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u001b\u0010d\u001a\u00020\n*\u00020a2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0013\u0010g\u001a\u00020\u000e*\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u0013\u0010j\u001a\u00020\u0012*\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010m\u001a\u00020\u0016*\u00020lH\u0002¢\u0006\u0004\bm\u0010nJ\u0013\u0010p\u001a\u00020\u001a*\u00020oH\u0002¢\u0006\u0004\bp\u0010qJ\u0013\u0010s\u001a\u00020\u001e*\u00020rH\u0002¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\"*\u00020u2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bv\u0010wJ\u001b\u0010z\u001a\u00020\"*\u00020x2\u0006\u0010c\u001a\u00020yH\u0002¢\u0006\u0004\bz\u0010{J\u0013\u0010}\u001a\u00020&*\u00020|H\u0002¢\u0006\u0004\b}\u0010~J\u0016\u0010\u0080\u0001\u001a\u00020**\u00020\u007fH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0083\u0001\u001a\u00020.*\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0017\u0010\u0086\u0001\u001a\u000202*\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0017\u0010\u0089\u0001\u001a\u000206*\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0017\u0010\u008c\u0001\u001a\u00020:*\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0017\u0010\u008f\u0001\u001a\u00020>*\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0017\u0010\u0092\u0001\u001a\u00020B*\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0017\u0010\u0095\u0001\u001a\u00020F*\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0017\u0010\u0098\u0001\u001a\u00020J*\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0017\u0010\u009b\u0001\u001a\u00020N*\u00030\u009a\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0017\u0010\u009e\u0001\u001a\u00020R*\u00030\u009d\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0017\u0010¡\u0001\u001a\u00020V*\u00030 \u0001H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0017\u0010¤\u0001\u001a\u00020Z*\u00030£\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0017\u0010§\u0001\u001a\u00020^*\u00030¦\u0001H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0018\u0010«\u0001\u001a\u00030ª\u0001*\u00030©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0018\u0010®\u0001\u001a\u00030ª\u0001*\u00030\u00ad\u0001H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0017\u0010±\u0001\u001a\u00030°\u0001*\u00020>H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0017\u0010³\u0001\u001a\u00020>*\u00030°\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0017\u0010¶\u0001\u001a\u00030µ\u0001*\u00020BH\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0017\u0010¸\u0001\u001a\u00020B*\u00030µ\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0017\u0010»\u0001\u001a\u00030º\u0001*\u00020FH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0017\u0010½\u0001\u001a\u00020F*\u00030º\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0017\u0010À\u0001\u001a\u00030¿\u0001*\u00020JH\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0017\u0010Â\u0001\u001a\u00020J*\u00030¿\u0001H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0017\u0010Å\u0001\u001a\u00030Ä\u0001*\u00020NH\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0017\u0010Ç\u0001\u001a\u00020N*\u00030Ä\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0017\u0010Ê\u0001\u001a\u00030É\u0001*\u00020RH\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0017\u0010Ì\u0001\u001a\u00020R*\u00030É\u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0017\u0010Ï\u0001\u001a\u00030Î\u0001*\u00020VH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0017\u0010Ñ\u0001\u001a\u00020V*\u00030Î\u0001H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0017\u0010Ô\u0001\u001a\u00030Ó\u0001*\u00020ZH\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0017\u0010Ö\u0001\u001a\u00020Z*\u00030Ó\u0001H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0017\u0010Ù\u0001\u001a\u00030Ø\u0001*\u00020^H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0017\u0010Û\u0001\u001a\u00020^*\u00030Ø\u0001H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0018\u0010ß\u0001\u001a\u00030Þ\u0001*\u00030Ý\u0001H\u0002¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0018\u0010â\u0001\u001a\u00030Þ\u0001*\u00030á\u0001H\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0018\u0010æ\u0001\u001a\u00030å\u0001*\u00030ä\u0001H\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0018\u0010ê\u0001\u001a\u00030é\u0001*\u00030è\u0001H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u0018\u0010í\u0001\u001a\u00030å\u0001*\u00030ì\u0001H\u0002¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0018\u0010ð\u0001\u001a\u00030é\u0001*\u00030ï\u0001H\u0002¢\u0006\u0006\bð\u0001\u0010ñ\u0001J*\u0010õ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030ô\u00010\u00052\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0096@¢\u0006\u0006\bõ\u0001\u0010ö\u0001J*\u0010ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030÷\u00010\u00052\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0096@¢\u0006\u0006\bø\u0001\u0010ö\u0001J \u0010ú\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030ù\u00010\u0005H\u0096@¢\u0006\u0006\bú\u0001\u0010û\u0001J\u001f\u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00012\u0007\u0010c\u001a\u00030ù\u0001H\u0096@¢\u0006\u0006\bü\u0001\u0010ý\u0001J*\u0010\u0080\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030ò\u00010\u00052\b\u0010ÿ\u0001\u001a\u00030þ\u0001H\u0096@¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J)\u0010\u0082\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030ò\u00010\u00052\u0007\u0010c\u001a\u00030ù\u0001H\u0096@¢\u0006\u0006\b\u0082\u0002\u0010ý\u0001J\u001f\u0010\u0083\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0096@¢\u0006\u0006\b\u0083\u0002\u0010û\u0001J2\u0010\u0085\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0007\u0010\u0084\u0002\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J(\u0010\u0088\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0007\u0010\u0087\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J \u0010\u008b\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u008a\u00020\u0005H\u0096@¢\u0006\u0006\b\u008b\u0002\u0010û\u0001J \u0010\u008d\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u008c\u00020\u0005H\u0096@¢\u0006\u0006\b\u008d\u0002\u0010û\u0001J'\u0010\u008e\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010c\u001a\u00020bH\u0096@¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J.\u0010\u0091\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\"0\u0090\u00020\u00052\u0006\u0010c\u001a\u00020yH\u0096@¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J3\u0010\u0095\u0002\u001a\t\u0012\u0004\u0012\u00020>0\u0090\u00022\u000e\u0010\u0093\u0002\u001a\t\u0012\u0004\u0012\u00020>0\u0090\u00022\b\u0010\u0094\u0002\u001a\u00030ô\u0001H\u0016¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J&\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0097\u0002\u001a\u000b\u0012\u0004\u0012\u00020N\u0018\u00010\u0090\u0002H\u0016¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J&\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u00032\u0007\u0010\u009a\u0002\u001a\u00020>2\u0007\u0010\u009b\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J'\u0010\u009e\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010c\u001a\u00020yH\u0096@¢\u0006\u0006\b\u009e\u0002\u0010\u0092\u0002J0\u0010\u009f\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010c\u001a\u00020y2\u0007\u0010\u0087\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0006\b\u009f\u0002\u0010 \u0002J1\u0010¡\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0007\u0010\u0084\u0002\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0006\b¡\u0002\u0010\u0086\u0002J1\u0010¢\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0007\u0010\u0084\u0002\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u0003H\u0096@¢\u0006\u0006\b¢\u0002\u0010\u0086\u0002J%\u0010¤\u0002\u001a\u00030þ\u00012\u0007\u0010£\u0002\u001a\u00020\u00032\u0007\u0010\u009b\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0006\b¤\u0002\u0010¥\u0002J-\u0010¨\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0005\u0012\u00030§\u00020¦\u00020\u0005H\u0096@¢\u0006\u0006\b¨\u0002\u0010û\u0001J-\u0010ª\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0005\u0012\u00030©\u00020¦\u00020\u0005H\u0096@¢\u0006\u0006\bª\u0002\u0010û\u0001J*\u0010®\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00ad\u00020\u00052\b\u0010¬\u0002\u001a\u00030«\u0002H\u0096@¢\u0006\u0006\b®\u0002\u0010¯\u0002¨\u0006°\u0002"}, d2 = {"pc4/s9$a", "Lbo3/a;", "Lk34/a0;", "", "documentPredicate", "Ldx/i;", "Ldx/b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lk34/a0;Ljava/lang/String;)Ldx/i;", "Li24/q;", "Leo3/r;", "D0", "(Li24/q;)Leo3/r;", "Lh24/a;", "Leo3/o;", "x0", "(Lh24/a;)Leo3/o;", "Lh24/d;", "Leo3/v;", "S0", "(Lh24/d;)Leo3/v;", "Lh24/b;", "Leo3/p;", "z0", "(Lh24/b;)Leo3/p;", "Lf24/f;", "Leo3/a;", "M", "(Lf24/f;)Leo3/a;", "Lg24/q;", "Leo3/i;", "i0", "(Lg24/q;)Leo3/i;", "Li24/o;", "Leo3/j;", "l0", "(Li24/o;)Leo3/j;", "Lg24/h;", "Leo3/l;", "q0", "(Lg24/h;)Leo3/l;", "Lg24/m;", "Leo3/g;", "a0", "(Lg24/m;)Leo3/g;", "Lg24/p;", "Leo3/u;", "Q0", "(Lg24/p;)Leo3/u;", "Lg24/o;", "Leo3/t;", "O0", "(Lg24/o;)Leo3/t;", "Lg24/f;", "Leo3/m;", "s0", "(Lg24/f;)Leo3/m;", "Lg24/t;", "Leo3/s;", "I0", "(Lg24/t;)Leo3/s;", "Lg24/i;", "Leo3/c;", "O", "(Lg24/i;)Leo3/c;", "Lg24/r;", "Leo3/k;", "n0", "(Lg24/r;)Leo3/k;", "Lg24/s;", "Leo3/n;", "u0", "(Lg24/s;)Leo3/n;", "Lg24/s$a;", "Leo3/n$a;", "F0", "(Lg24/s$a;)Leo3/n$a;", "Lg24/n;", "Leo3/h;", "c0", "(Lg24/n;)Leo3/h;", "Lg24/g;", "Leo3/h$a;", "f0", "(Lg24/g;)Leo3/h$a;", "Lg24/k;", "Leo3/e;", "U", "(Lg24/k;)Leo3/e;", "Lg24/j;", "Leo3/d;", "R", "(Lg24/j;)Leo3/d;", "Lg24/l;", "Leo3/f;", "X", "(Lg24/l;)Leo3/f;", "Lm34/a;", "Lrq0/b$c;", "documentType", "E0", "(Lm34/a;Lrq0/b$c;)Leo3/r;", "Lhr0/a;", "y0", "(Lhr0/a;)Leo3/o;", "Lhr0/d;", "T0", "(Lhr0/d;)Leo3/v;", "Lhr0/b;", "A0", "(Lhr0/b;)Leo3/p;", "Lfr0/f;", "N", "(Lfr0/f;)Leo3/a;", "Lgr0/q;", "j0", "(Lgr0/q;)Leo3/i;", "Lgr0/r;", "k0", "(Lgr0/r;Lrq0/b$c;)Leo3/j;", "Ll34/a;", "Lrq0/b$b;", "m0", "(Ll34/a;Lrq0/b$b;)Leo3/j;", "Lgr0/h;", "r0", "(Lgr0/h;)Leo3/l;", "Lgr0/m;", "b0", "(Lgr0/m;)Leo3/g;", "Lgr0/p;", "R0", "(Lgr0/p;)Leo3/u;", "Lgr0/o;", "P0", "(Lgr0/o;)Leo3/t;", "Lgr0/g;", "t0", "(Lgr0/g;)Leo3/m;", "Lgr0/w;", "J0", "(Lgr0/w;)Leo3/s;", "Lgr0/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lgr0/i;)Leo3/c;", "Lgr0/s;", "o0", "(Lgr0/s;)Leo3/k;", "Lgr0/v;", "v0", "(Lgr0/v;)Leo3/n;", "Lgr0/v$a;", "G0", "(Lgr0/v$a;)Leo3/n$a;", "Lgr0/n;", "d0", "(Lgr0/n;)Leo3/h;", "Lgr0/n$a;", "g0", "(Lgr0/n$a;)Leo3/h$a;", "Lgr0/k;", "V", "(Lgr0/k;)Leo3/e;", "Lgr0/j;", ip.a.f96137b, "(Lgr0/j;)Leo3/d;", "Lgr0/l;", "Y", "(Lgr0/l;)Leo3/f;", "Lh24/c;", "Leo3/q;", "B0", "(Lh24/c;)Leo3/q;", "Lhr0/c;", "C0", "(Lhr0/c;)Leo3/q;", "Lgv1/j;", "c", "(Leo3/c;)Lgv1/j;", "Q", "(Lgv1/j;)Leo3/c;", "Lgv1/s;", "G", "(Leo3/k;)Lgv1/s;", "p0", "(Lgv1/s;)Leo3/k;", "Lgv1/u;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Leo3/n;)Lgv1/u;", "w0", "(Lgv1/u;)Leo3/n;", "Lgv1/u$a;", "I", "(Leo3/n$a;)Lgv1/u$a;", "H0", "(Lgv1/u$a;)Leo3/n$a;", "Lgv1/o;", "E", "(Leo3/h;)Lgv1/o;", "e0", "(Lgv1/o;)Leo3/h;", "Lgv1/h;", "F", "(Leo3/h$a;)Lgv1/h;", "h0", "(Lgv1/h;)Leo3/h$a;", "Lgv1/l;", "C", "(Leo3/e;)Lgv1/l;", "W", "(Lgv1/l;)Leo3/e;", "Lgv1/k;", "d", "(Leo3/d;)Lgv1/k;", "T", "(Lgv1/k;)Leo3/d;", "Lgv1/m;", ip.a.f96138c, "(Leo3/f;)Lgv1/m;", "Z", "(Lgv1/m;)Leo3/f;", "Lk34/y$a;", "Ldo3/d$a;", "K", "(Lk34/y$a;)Ldo3/d$a;", "Li24/j0$a;", "J", "(Li24/j0$a;)Ldo3/d$a;", "Li24/z$b;", "Ldo3/c$b;", "K0", "(Li24/z$b;)Ldo3/c$b;", "Li24/z$c;", "Ldo3/c$c;", "M0", "(Li24/z$c;)Ldo3/c$c;", "Ljr0/i$b;", "L0", "(Ljr0/i$b;)Ldo3/c$b;", "Ljr0/i$c;", "N0", "(Ljr0/i$c;)Ldo3/c$c;", "Lk34/u;", "identityType", "Liy/b0;", "g", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "b", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "y", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "k", "f", "scope", "p", "(Lk34/a0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentId", "n", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldo3/f;", "j", "Ldo3/a;", "w", "s", "(Lrq0/b$c;Ltq/e;)Ljava/lang/Object;", "", "t", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "documentSchemaAttributes", "data", "u", "(Ljava/util/List;Liy/b0;)Ljava/util/List;", AnnotatedPrivateKey.LABEL, "z", "(Ljava/util/List;)Ljava/lang/String;", "attribute", "jsonValue", "q", "(Leo3/c;Ljava/lang/String;)Ljava/lang/String;", "i", "h", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "B", "o", "fieldReference", "x", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "Ldo3/b;", "r", "Ldo3/d;", "l", "Ldo3/c$a;", "pwzType", "Ldo3/c;", "m", "(Ldo3/c$a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements bo3.a {
        final /* synthetic */ q34.n0 A;
        final /* synthetic */ w24.q0 B;
        final /* synthetic */ q34.d0 C;
        final /* synthetic */ q34.o0 D;
        final /* synthetic */ q34.q0 E;
        final /* synthetic */ w24.s0 F;
        final /* synthetic */ q34.s0 G;
        final /* synthetic */ w24.j1 H;
        final /* synthetic */ q34.d1 I;
        final /* synthetic */ w24.d1 J;
        final /* synthetic */ w24.z0 K;
        final /* synthetic */ q34.a1 L;
        final /* synthetic */ ay.i M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.c f156204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f156205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.b f156206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k24.g f156207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.d f156208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.t0 f156209g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.u0 f156210h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.x0 f156211i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.x0 f156212j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.g0 f156213k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.c0 f156214l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w24.e0 f156215m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q34.r0 f156216n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ w24.l1 f156217o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q34.h0 f156218p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w24.n1 f156219q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q34.g0 f156220r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ w24.m0 f156221s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ q34.m0 f156222t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ w24.b1 f156223u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ q34.p0 f156224v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ w24.x f156225w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ q34.b0 f156226x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ ev1.a f156227y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ w24.o0 f156228z;

        /* JADX INFO: renamed from: pc4.s9$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3870a {
            public static final /* synthetic */ int[] A;
            public static final /* synthetic */ int[] B;
            public static final /* synthetic */ int[] C;
            public static final /* synthetic */ int[] D;
            public static final /* synthetic */ int[] E;
            public static final /* synthetic */ int[] F;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f156230b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f156231c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int[] f156232d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ int[] f156233e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ int[] f156234f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ int[] f156235g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final /* synthetic */ int[] f156236h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final /* synthetic */ int[] f156237i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ int[] f156238j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final /* synthetic */ int[] f156239k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int[] f156240l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final /* synthetic */ int[] f156241m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final /* synthetic */ int[] f156242n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final /* synthetic */ int[] f156243o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final /* synthetic */ int[] f156244p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final /* synthetic */ int[] f156245q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final /* synthetic */ int[] f156246r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final /* synthetic */ int[] f156247s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final /* synthetic */ int[] f156248t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final /* synthetic */ int[] f156249u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final /* synthetic */ int[] f156250v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final /* synthetic */ int[] f156251w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final /* synthetic */ int[] f156252x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final /* synthetic */ int[] f156253y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final /* synthetic */ int[] f156254z;

            static {
                int[] iArr = new int[k34.u.values().length];
                try {
                    iArr[k34.u.MOBYWATEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k34.u.DIIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k34.u.STUDENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f156229a = iArr;
                int[] iArr2 = new int[f24.c.values().length];
                try {
                    iArr2[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                f156230b = iArr2;
                int[] iArr3 = new int[NipipCardData.a.values().length];
                try {
                    iArr3[NipipCardData.a.NURSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[NipipCardData.a.MIDWIFE.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                f156231c = iArr3;
                int[] iArr4 = new int[rq0.b.EnumC4479b.values().length];
                try {
                    iArr4[rq0.b.EnumC4479b.DOCTOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.DENTIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.ATTORNEY_AT_LAW.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.CIVIL_ENGINEER.ordinal()] = 5;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.TAX_ADVISOR.ordinal()] = 6;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 7;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.AUDITOR.ordinal()] = 8;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SOLIDARITY_CARD.ordinal()] = 9;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.PHD_STUDENT.ordinal()] = 10;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.PHYSIOTHERAPIST.ordinal()] = 11;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.PHARMACIST.ordinal()] = 12;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SHOOTING_LICENCE.ordinal()] = 13;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 14;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 15;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 16;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 17;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 18;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 19;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 20;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.PENSIONER_MSWIA.ordinal()] = 21;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr4[rq0.b.EnumC4479b.DEFAULT.ordinal()] = 22;
                } catch (NoSuchFieldError unused30) {
                }
                f156232d = iArr4;
                int[] iArr5 = new int[rq0.b.c.values().length];
                try {
                    iArr5[rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr5[rq0.b.c.TEACHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr5[rq0.b.c.BAILIFF_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr5[rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 4;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr5[rq0.b.c.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 5;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr5[rq0.b.c.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 6;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr5[rq0.b.c.DEFAULT.ordinal()] = 7;
                } catch (NoSuchFieldError unused37) {
                }
                f156233e = iArr5;
                int[] iArr6 = new int[g24.g.values().length];
                try {
                    iArr6[g24.g.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr6[g24.g.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr6[g24.g.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr6[g24.g.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused41) {
                }
                f156234f = iArr6;
                int[] iArr7 = new int[DocumentsGroup.a.values().length];
                try {
                    iArr7[DocumentsGroup.a.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr7[DocumentsGroup.a.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr7[DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused44) {
                }
                f156235g = iArr7;
                int[] iArr8 = new int[g24.r.values().length];
                try {
                    iArr8[g24.r.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr8[g24.r.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr8[g24.r.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr8[g24.r.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr8[g24.r.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr8[g24.r.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr8[g24.r.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr8[g24.r.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr8[g24.r.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr8[g24.r.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused54) {
                }
                f156236h = iArr8;
                int[] iArr9 = new int[MissingDocumentAttribute.a.values().length];
                try {
                    iArr9[MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr9[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr9[MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused57) {
                }
                f156237i = iArr9;
                int[] iArr10 = new int[g24.l.values().length];
                try {
                    iArr10[g24.l.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr10[g24.l.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused59) {
                }
                f156238j = iArr10;
                int[] iArr11 = new int[BEDocumentConfigLabel.a.values().length];
                try {
                    iArr11[BEDocumentConfigLabel.a.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr11[BEDocumentConfigLabel.a.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr11[BEDocumentConfigLabel.a.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr11[BEDocumentConfigLabel.a.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused63) {
                }
                f156239k = iArr11;
                int[] iArr12 = new int[gr0.DocumentsGroup.a.values().length];
                try {
                    iArr12[gr0.DocumentsGroup.a.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr12[gr0.DocumentsGroup.a.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr12[gr0.DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused66) {
                }
                f156240l = iArr12;
                int[] iArr13 = new int[DocumentSchemaLabel.a.values().length];
                try {
                    iArr13[DocumentSchemaLabel.a.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr13[DocumentSchemaLabel.a.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr13[DocumentSchemaLabel.a.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr13[DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused70) {
                }
                f156241m = iArr13;
                int[] iArr14 = new int[gr0.s.values().length];
                try {
                    iArr14[gr0.s.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr14[gr0.s.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr14[gr0.s.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr14[gr0.s.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr14[gr0.s.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr14[gr0.s.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr14[gr0.s.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr14[gr0.s.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr14[gr0.s.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr14[gr0.s.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused80) {
                }
                f156242n = iArr14;
                int[] iArr15 = new int[gr0.MissingDocumentAttribute.a.values().length];
                try {
                    iArr15[gr0.MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr15[gr0.MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr15[gr0.MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused83) {
                }
                f156243o = iArr15;
                int[] iArr16 = new int[gr0.l.values().length];
                try {
                    iArr16[gr0.l.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr16[gr0.l.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused85) {
                }
                f156244p = iArr16;
                int[] iArr17 = new int[MultiDocumentView.a.values().length];
                try {
                    iArr17[MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr17[MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr17[MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused88) {
                }
                f156245q = iArr17;
                int[] iArr18 = new int[hr0.MultiDocumentView.a.values().length];
                try {
                    iArr18[hr0.MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr18[hr0.MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr18[hr0.MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused91) {
                }
                f156246r = iArr18;
                int[] iArr19 = new int[eo3.k.values().length];
                try {
                    iArr19[eo3.k.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr19[eo3.k.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr19[eo3.k.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr19[eo3.k.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr19[eo3.k.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr19[eo3.k.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr19[eo3.k.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr19[eo3.k.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr19[eo3.k.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr19[eo3.k.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused101) {
                }
                f156247s = iArr19;
                int[] iArr20 = new int[gv1.s.values().length];
                try {
                    iArr20[gv1.s.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr20[gv1.s.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr20[gv1.s.DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr20[gv1.s.DATE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr20[gv1.s.NUMBER.ordinal()] = 5;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr20[gv1.s.NOTE.ordinal()] = 6;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr20[gv1.s.ENUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr20[gv1.s.BOOLEAN.ordinal()] = 8;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr20[gv1.s.MULTILINE_TEXT.ordinal()] = 9;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr20[gv1.s.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused111) {
                }
                f156248t = iArr20;
                int[] iArr21 = new int[eo3.MissingDocumentAttribute.a.values().length];
                try {
                    iArr21[eo3.MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr21[eo3.MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr21[eo3.MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused114) {
                }
                f156249u = iArr21;
                int[] iArr22 = new int[gv1.MissingDocumentAttribute.a.values().length];
                try {
                    iArr22[gv1.MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr22[gv1.MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr22[gv1.MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused117) {
                }
                f156250v = iArr22;
                int[] iArr23 = new int[eo3.DocumentSchemaLabel.a.values().length];
                try {
                    iArr23[eo3.DocumentSchemaLabel.a.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr23[eo3.DocumentSchemaLabel.a.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr23[eo3.DocumentSchemaLabel.a.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr23[eo3.DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused121) {
                }
                f156251w = iArr23;
                int[] iArr24 = new int[gv1.h.values().length];
                try {
                    iArr24[gv1.h.PL.ordinal()] = 1;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr24[gv1.h.EN.ordinal()] = 2;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr24[gv1.h.UK.ordinal()] = 3;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr24[gv1.h.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused125) {
                }
                f156252x = iArr24;
                int[] iArr25 = new int[eo3.f.values().length];
                try {
                    iArr25[eo3.f.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr25[eo3.f.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused127) {
                }
                f156253y = iArr25;
                int[] iArr26 = new int[gv1.m.values().length];
                try {
                    iArr26[gv1.m.UPPERCASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr26[gv1.m.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused129) {
                }
                f156254z = iArr26;
                int[] iArr27 = new int[RailwayCardDataModel.a.values().length];
                try {
                    iArr27[RailwayCardDataModel.a.WORKER.ordinal()] = 1;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.PENSIONER_I_PACKAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.PENSIONER_II_PACKAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.ANNUITY_I_PACKAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.ANNUITY_II_PACKAGE.ordinal()] = 5;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.CHILD.ordinal()] = 6;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.SPOUSE.ordinal()] = 7;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.SCHOLAR.ordinal()] = 8;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr27[RailwayCardDataModel.a.UNKNOWN.ordinal()] = 9;
                } catch (NoSuchFieldError unused138) {
                }
                A = iArr27;
                int[] iArr28 = new int[RailwayCardContainerData.a.values().length];
                try {
                    iArr28[RailwayCardContainerData.a.WORKER.ordinal()] = 1;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.PENSIONER_I_PACKAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.PENSIONER_II_PACKAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.ANNUITY_I_PACKAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.ANNUITY_II_PACKAGE.ordinal()] = 5;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.CHILD.ordinal()] = 6;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.SPOUSE.ordinal()] = 7;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.SCHOLAR.ordinal()] = 8;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr28[RailwayCardContainerData.a.UNKNOWN.ordinal()] = 9;
                } catch (NoSuchFieldError unused147) {
                }
                B = iArr28;
                int[] iArr29 = new int[NipipCardContainerData.b.values().length];
                try {
                    iArr29[NipipCardContainerData.b.FULL.ordinal()] = 1;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr29[NipipCardContainerData.b.PARTIAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr29[NipipCardContainerData.b.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused150) {
                }
                C = iArr29;
                int[] iArr30 = new int[NipipCardContainerData.c.values().length];
                try {
                    iArr30[NipipCardContainerData.c.RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr30[NipipCardContainerData.c.INDIVIDUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr30[NipipCardContainerData.c.UNDER_SUPERVISION.ordinal()] = 3;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr30[NipipCardContainerData.c.FIXED_TERM.ordinal()] = 4;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr30[NipipCardContainerData.c.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused155) {
                }
                D = iArr30;
                int[] iArr31 = new int[NipipDataContainer.b.values().length];
                try {
                    iArr31[NipipDataContainer.b.FULL.ordinal()] = 1;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr31[NipipDataContainer.b.PARTIAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr31[NipipDataContainer.b.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused158) {
                }
                E = iArr31;
                int[] iArr32 = new int[NipipDataContainer.c.values().length];
                try {
                    iArr32[NipipDataContainer.c.RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr32[NipipDataContainer.c.INDIVIDUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr32[NipipDataContainer.c.UNDER_SUPERVISION.ordinal()] = 3;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr32[NipipDataContainer.c.FIXED_TERM.ordinal()] = 4;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr32[NipipDataContainer.c.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused163) {
                }
                F = iArr32;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156255d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156256e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156257f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156258g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156259h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156260j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156261k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156262l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156263m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156264n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156265p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156267r;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156265p = obj;
                this.f156267r |= PKIFailureInfo.systemUnavail;
                return a.this.t(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156268d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156269e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156270f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156271g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156272h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156273j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156274k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156275l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156276m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156277n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156278p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156279q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156281s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156279q = obj;
                this.f156281s |= PKIFailureInfo.systemUnavail;
                return a.this.h(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156282d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156284f;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156282d = obj;
                this.f156284f |= PKIFailureInfo.systemUnavail;
                return a.this.w(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156285d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156286e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156287f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156288g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156289h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156290j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156291k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156292l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156293m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156294n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156295p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156297r;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156295p = obj;
                this.f156297r |= PKIFailureInfo.systemUnavail;
                return a.this.i(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156298d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156299e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156300f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156301g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156302h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156303j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156304k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156305l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156306m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156307n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156308p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156310r;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156308p = obj;
                this.f156310r |= PKIFailureInfo.systemUnavail;
                return a.this.s(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156311d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156312e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156313f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f156314g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156316j;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156314g = obj;
                this.f156316j |= PKIFailureInfo.systemUnavail;
                return a.this.n(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156317d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156318e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156319f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156320g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156321h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156322j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156323k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156324l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156325m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156326n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156327p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156328q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156330s;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156328q = obj;
                this.f156330s |= PKIFailureInfo.systemUnavail;
                return a.this.p(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class i extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156331d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156333f;

            i(tq.e<? super i> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156331d = obj;
                this.f156333f |= PKIFailureInfo.systemUnavail;
                return a.this.r(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class j extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156334d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156336f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156337g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156338h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156339j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156340k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156341l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156342m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f156343n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156345q;

            j(tq.e<? super j> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156343n = obj;
                this.f156345q |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class k extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f156346d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156347e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156349g;

            k(tq.e<? super k> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156347e = obj;
                this.f156349g |= PKIFailureInfo.systemUnavail;
                return a.this.a(false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class l extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156350d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156352f;

            l(tq.e<? super l> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156350d = obj;
                this.f156352f |= PKIFailureInfo.systemUnavail;
                return a.this.f(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class m extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156353d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156354e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156356g;

            m(tq.e<? super m> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156354e = obj;
                this.f156356g |= PKIFailureInfo.systemUnavail;
                return a.this.y(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class n extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156357d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156358e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156360g;

            n(tq.e<? super n> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156358e = obj;
                this.f156360g |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class o extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156361d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156362e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156364g;

            o(tq.e<? super o> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156362e = obj;
                this.f156364g |= PKIFailureInfo.systemUnavail;
                return a.this.m(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class p extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156365d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156367f;

            p(tq.e<? super p> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156365d = obj;
                this.f156367f |= PKIFailureInfo.systemUnavail;
                return a.this.l(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class q extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156368d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156369e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156370f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156371g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f156372h;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156374k;

            q(tq.e<? super q> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156372h = obj;
                this.f156374k |= PKIFailureInfo.systemUnavail;
                return a.this.j(this);
            }
        }

        a(c54.b bVar, k24.c cVar, g34.c cVar2, k24.b bVar2, k24.g gVar, k24.d dVar, q34.t0 t0Var, q34.u0 u0Var, w24.x0 x0Var, q34.x0 x0Var2, w24.g0 g0Var, q34.c0 c0Var, w24.e0 e0Var, q34.r0 r0Var, w24.l1 l1Var, q34.h0 h0Var, w24.n1 n1Var, q34.g0 g0Var2, w24.m0 m0Var, q34.m0 m0Var2, w24.b1 b1Var, q34.p0 p0Var, w24.x xVar, q34.b0 b0Var, ev1.a aVar, w24.o0 o0Var, q34.n0 n0Var, w24.q0 q0Var, q34.d0 d0Var, q34.o0 o0Var2, q34.q0 q0Var2, w24.s0 s0Var, q34.s0 s0Var2, w24.j1 j1Var, q34.d1 d1Var, w24.d1 d1Var2, w24.z0 z0Var, q34.a1 a1Var, ay.i iVar) {
            this.f156203a = bVar;
            this.f156204b = cVar;
            this.f156205c = cVar2;
            this.f156206d = bVar2;
            this.f156207e = gVar;
            this.f156208f = dVar;
            this.f156209g = t0Var;
            this.f156210h = u0Var;
            this.f156211i = x0Var;
            this.f156212j = x0Var2;
            this.f156213k = g0Var;
            this.f156214l = c0Var;
            this.f156215m = e0Var;
            this.f156216n = r0Var;
            this.f156217o = l1Var;
            this.f156218p = h0Var;
            this.f156219q = n1Var;
            this.f156220r = g0Var2;
            this.f156221s = m0Var;
            this.f156222t = m0Var2;
            this.f156223u = b1Var;
            this.f156224v = p0Var;
            this.f156225w = xVar;
            this.f156226x = b0Var;
            this.f156227y = aVar;
            this.f156228z = o0Var;
            this.A = n0Var;
            this.B = q0Var;
            this.C = d0Var;
            this.D = o0Var2;
            this.E = q0Var2;
            this.F = s0Var;
            this.G = s0Var2;
            this.H = j1Var;
            this.I = d1Var;
            this.J = d1Var2;
            this.K = z0Var;
            this.L = a1Var;
            this.M = iVar;
        }

        private final MultiDocumentSelectorLabel A0(hr0.MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
            ArrayList arrayList;
            List<BEDocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(N((BEDocumentConfigLabel) it.next()));
            }
            List<BEDocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList3.add(N((BEDocumentConfigLabel) it4.next()));
            }
            List<BEDocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
            if (listC != null) {
                List<BEDocumentConfigLabel> list = listC;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(N((BEDocumentConfigLabel) it5.next()));
                }
            } else {
                arrayList = null;
            }
            return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
        }

        private final eo3.MultiDocumentView B0(MultiDocumentView multiDocumentView) {
            eo3.MultiDocumentView.a aVar;
            DocumentDynamicSection documentDynamicSection = new DocumentDynamicSection(multiDocumentView.getDynamicSections().c(), multiDocumentView.getDynamicSections().a(), multiDocumentView.getDynamicSections().b());
            int i15 = C3870a.f156245q[multiDocumentView.getMultiDocumentGroup().ordinal()];
            if (i15 == 1) {
                aVar = eo3.MultiDocumentView.a.LEFT_TAB;
            } else if (i15 == 2) {
                aVar = eo3.MultiDocumentView.a.RIGHT_TAB;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                aVar = eo3.MultiDocumentView.a.UNKNOWN;
            }
            return new eo3.MultiDocumentView(documentDynamicSection, aVar);
        }

        private final DocumentSchemaEnumTranslation C(eo3.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<eo3.DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(E((eo3.DocumentSchemaLabel) it.next()));
            }
            return new DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final eo3.MultiDocumentView C0(hr0.MultiDocumentView multiDocumentView) {
            eo3.MultiDocumentView.a aVar;
            DocumentDynamicSection documentDynamicSection = new DocumentDynamicSection(multiDocumentView.getDynamicSections().c(), multiDocumentView.getDynamicSections().a(), multiDocumentView.getDynamicSections().b());
            int i15 = C3870a.f156246r[multiDocumentView.getMultiDocumentGroup().ordinal()];
            if (i15 == 1) {
                aVar = eo3.MultiDocumentView.a.LEFT_TAB;
            } else if (i15 == 2) {
                aVar = eo3.MultiDocumentView.a.RIGHT_TAB;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                aVar = eo3.MultiDocumentView.a.UNKNOWN;
            }
            return new eo3.MultiDocumentView(documentDynamicSection, aVar);
        }

        private final gv1.m D(eo3.f fVar) {
            int i15 = C3870a.f156253y[fVar.ordinal()];
            if (i15 == 1) {
                return gv1.m.UPPERCASE;
            }
            if (i15 == 2) {
                return gv1.m.UNKNOWN;
            }
            throw new oq.p();
        }

        private final MultiDynamicDocumentData D0(DynamicMultiDocumentFullData dynamicMultiDocumentFullData) {
            MultiDocumentSchema multiDocumentSchemaX0 = x0(dynamicMultiDocumentFullData.getMultiDocumentSchema());
            List<DynamicDocumentData> listA = dynamicMultiDocumentFullData.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(l0((DynamicDocumentData) it.next()));
            }
            return new MultiDynamicDocumentData(multiDocumentSchemaX0, arrayList);
        }

        private final gv1.DocumentSchemaLabel E(eo3.DocumentSchemaLabel documentSchemaLabel) {
            return new gv1.DocumentSchemaLabel(F(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final MultiDynamicDocumentData E0(DynamicMultiDocumentFullDataContainer dynamicMultiDocumentFullDataContainer, rq0.b.c cVar) {
            MultiDocumentSchema multiDocumentSchemaY0 = y0(dynamicMultiDocumentFullDataContainer.getMultiDocumentSchema());
            List<DynamicDocument> listB = dynamicMultiDocumentFullDataContainer.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(k0((DynamicDocument) it.next(), cVar));
            }
            return new MultiDynamicDocumentData(multiDocumentSchemaY0, arrayList);
        }

        private final gv1.h F(eo3.DocumentSchemaLabel.a aVar) {
            int i15 = C3870a.f156251w[aVar.ordinal()];
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

        private final eo3.MissingDocumentAttribute.a F0(MissingDocumentAttribute.a aVar) {
            int i15 = C3870a.f156237i[aVar.ordinal()];
            if (i15 == 1) {
                return eo3.MissingDocumentAttribute.a.HIDE;
            }
            if (i15 == 2) {
                return eo3.MissingDocumentAttribute.a.DEFAULT_VALUE;
            }
            if (i15 == 3) {
                return eo3.MissingDocumentAttribute.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.s G(eo3.k kVar) {
            switch (C3870a.f156247s[kVar.ordinal()]) {
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

        private final eo3.MissingDocumentAttribute.a G0(gr0.MissingDocumentAttribute.a aVar) {
            int i15 = C3870a.f156243o[aVar.ordinal()];
            if (i15 == 1) {
                return eo3.MissingDocumentAttribute.a.HIDE;
            }
            if (i15 == 2) {
                return eo3.MissingDocumentAttribute.a.DEFAULT_VALUE;
            }
            if (i15 == 3) {
                return eo3.MissingDocumentAttribute.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.MissingDocumentAttribute H(eo3.MissingDocumentAttribute missingDocumentAttribute) {
            gv1.MissingDocumentAttribute.a aVarI = I(missingDocumentAttribute.getOnMissing());
            eo3.k dataType = missingDocumentAttribute.getDataType();
            return new gv1.MissingDocumentAttribute(aVarI, dataType != null ? G(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final eo3.MissingDocumentAttribute.a H0(gv1.MissingDocumentAttribute.a aVar) {
            int i15 = C3870a.f156250v[aVar.ordinal()];
            if (i15 == 1) {
                return eo3.MissingDocumentAttribute.a.HIDE;
            }
            if (i15 == 2) {
                return eo3.MissingDocumentAttribute.a.DEFAULT_VALUE;
            }
            if (i15 == 3) {
                return eo3.MissingDocumentAttribute.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final gv1.MissingDocumentAttribute.a I(eo3.MissingDocumentAttribute.a aVar) {
            int i15 = C3870a.f156249u[aVar.ordinal()];
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

        private final PictureSchema I0(g24.PictureSchema pictureSchema) {
            String pictureId = pictureSchema.getPictureId();
            String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
            String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
            String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
            List<DocumentSchemaAttribute> listB = pictureSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(O((DocumentSchemaAttribute) it.next()));
            }
            return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, pictureSchema.getSourceContainerRef());
        }

        private final RailwayCardMemberData.a J(RailwayCardContainerData.a aVar) {
            switch (C3870a.B[aVar.ordinal()]) {
                case 1:
                    return RailwayCardMemberData.a.WORKER;
                case 2:
                    return RailwayCardMemberData.a.PENSIONER_I_PACKAGE;
                case 3:
                    return RailwayCardMemberData.a.PENSIONER_II_PACKAGE;
                case 4:
                    return RailwayCardMemberData.a.ANNUITY_I_PACKAGE;
                case 5:
                    return RailwayCardMemberData.a.ANNUITY_II_PACKAGE;
                case 6:
                    return RailwayCardMemberData.a.CHILD;
                case 7:
                    return RailwayCardMemberData.a.SPOUSE;
                case 8:
                    return RailwayCardMemberData.a.SCHOLAR;
                case 9:
                    return RailwayCardMemberData.a.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final PictureSchema J0(gr0.PictureSchema pictureSchema) {
            String pictureId = pictureSchema.getPictureId();
            String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
            String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
            String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
            List<gr0.DocumentSchemaAttribute> listB = pictureSchema.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(P((gr0.DocumentSchemaAttribute) it.next()));
            }
            return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, pictureSchema.getSourceContainerRef());
        }

        private final RailwayCardMemberData.a K(RailwayCardDataModel.a aVar) {
            switch (C3870a.A[aVar.ordinal()]) {
                case 1:
                    return RailwayCardMemberData.a.WORKER;
                case 2:
                    return RailwayCardMemberData.a.PENSIONER_I_PACKAGE;
                case 3:
                    return RailwayCardMemberData.a.PENSIONER_II_PACKAGE;
                case 4:
                    return RailwayCardMemberData.a.ANNUITY_I_PACKAGE;
                case 5:
                    return RailwayCardMemberData.a.ANNUITY_II_PACKAGE;
                case 6:
                    return RailwayCardMemberData.a.CHILD;
                case 7:
                    return RailwayCardMemberData.a.SPOUSE;
                case 8:
                    return RailwayCardMemberData.a.SCHOLAR;
                case 9:
                    return RailwayCardMemberData.a.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final NipipCardData.b K0(NipipCardContainerData.b bVar) {
            int i15 = C3870a.C[bVar.ordinal()];
            if (i15 == 1) {
                return NipipCardData.b.FULL;
            }
            if (i15 == 2) {
                return NipipCardData.b.PARTIAL;
            }
            if (i15 == 3) {
                return NipipCardData.b.UNKNOWN;
            }
            throw new oq.p();
        }

        private final dx.i<dx.b, String> L(k34.a0 a0Var, String str) {
            Object objB;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        if (fr.t.c(a0Var, k34.a0.n.f107880a)) {
                            str = "PERSONAL_DATA_SCOPE_1";
                        } else if (fr.t.c(a0Var, k34.a0.o.f107882a)) {
                            str = "PERSONAL_DATA_SCOPE_2";
                        } else if (fr.t.c(a0Var, k34.a0.p.f107884a)) {
                            str = "PERSONAL_DATA_SCOPE_3";
                        } else if (fr.t.c(a0Var, k34.a0.q.f107886a)) {
                            str = "PERSONAL_DATA_SCOPE_4";
                        } else if (fr.t.c(a0Var, k34.a0.r.f107888a)) {
                            str = "PERSONAL_DATA_SCOPE_5";
                        } else if (fr.t.c(a0Var, k34.a0.s.f107890a)) {
                            str = "PERSONAL_DATA_SCOPE_6";
                        } else if (fr.t.c(a0Var, k34.a0.t.f107892a)) {
                            str = "PERSONAL_DATA_SCOPE_7";
                        } else if (fr.t.c(a0Var, k34.a0.u.f107894a)) {
                            str = "PERSONAL_DATA_SCOPE_8";
                        } else if (fr.t.c(a0Var, k34.a0.v.f107896a)) {
                            str = "PERSONAL_DATA_SCOPE_9";
                        } else if (fr.t.c(a0Var, k34.a0.C2570a0.f107847a)) {
                            str = "fullStudentData";
                        } else if (fr.t.c(a0Var, k34.a0.b0.f107850a)) {
                            str = "basicStudentData";
                        } else if (fr.t.c(a0Var, k34.a0.a.f107846a)) {
                            str = "ADVOCATE_SCOPE_ZERO";
                        } else if (fr.t.c(a0Var, k34.a0.f.f107861a)) {
                            str = "DEPUTY_SCOPE_ZERO";
                        } else if (a0Var instanceof k34.a0.DynamicDocument) {
                            switch (C3870a.f156232d[((k34.a0.DynamicDocument) a0Var).getDocumentType().ordinal()]) {
                                case 1:
                                    str = "DOCTOR";
                                    break;
                                case 2:
                                    str = "DENTIST";
                                    break;
                                case 3:
                                    str = "ATTORNEY_AT_LAW";
                                    break;
                                case 4:
                                    str = "TRAINEE_ATTORNEY_AT_LAW";
                                    break;
                                case 5:
                                    str = "CIVIL_ENGINEER";
                                    break;
                                case 6:
                                    str = "TAX_ADVISOR";
                                    break;
                                case 7:
                                    str = "JUNIOR_SCHOOL_CARD_MOBYWATEL_APP";
                                    break;
                                case 8:
                                    str = "AUDITOR";
                                    break;
                                case 9:
                                    str = "SOLIDARITY_CARD";
                                    break;
                                case 10:
                                    str = "PHD_STUDENT";
                                    break;
                                case 11:
                                    str = "PHYSIOTHERAPIST";
                                    break;
                                case 12:
                                    str = "PHARMACIST";
                                    break;
                                case 13:
                                    str = "SHOOTING_LICENCE";
                                    break;
                                case 14:
                                    str = "SPORT_SHOOTING_COMPETITOR_LICENCE";
                                    break;
                                case 15:
                                    str = "SPORT_SHOOTING_COACH_LICENCE";
                                    break;
                                case 16:
                                    str = "SPORT_SHOOTING_INSTRUCTOR_LICENCE";
                                    break;
                                case 17:
                                    str = "SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING";
                                    break;
                                case 18:
                                    str = "SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING";
                                    break;
                                case 19:
                                    str = "SPORT_SHOOTING_RANGE_OFFICER_LICENCE";
                                    break;
                                case 20:
                                    str = "LABORATORY_DIAGNOSTICIAN";
                                    break;
                                case 21:
                                    str = "PENSIONER_MSWIA";
                                    break;
                                case 22:
                                    aVar.b(new dx.b.Generic(new UnsupportedOperationException(a0Var.getClass().getName() + " scope is not supported")));
                                    throw new oq.g();
                                default:
                                    throw new oq.p();
                            }
                        } else if (a0Var instanceof k34.a0.DynamicMultiDocument) {
                            switch (C3870a.f156233e[((k34.a0.DynamicMultiDocument) a0Var).getDocumentType().ordinal()]) {
                                case 1:
                                    str = "DISABLED_PERSON";
                                    break;
                                case 2:
                                    str = "TEACHER";
                                    break;
                                case 3:
                                    str = "BAILIFF";
                                    break;
                                case 4:
                                    str = "ELECTRONIC_DIPLOMA_GRADUATION";
                                    break;
                                case 5:
                                    str = "ELECTRONIC_DIPLOMA_PHD";
                                    break;
                                case 6:
                                    str = "ELECTRONIC_DIPLOMA_DSC";
                                    break;
                                case 7:
                                    aVar.b(new dx.b.Generic(new UnsupportedOperationException(a0Var.getClass().getName() + " scope is not supported")));
                                    throw new oq.g();
                                default:
                                    throw new oq.p();
                            }
                        } else if (fr.t.c(a0Var, k34.a0.i.f107870a)) {
                            if (str == null) {
                                str = "FAMILY_CARD_DOCUMENT_OWNER";
                            }
                        } else if (fr.t.c(a0Var, k34.a0.x.f107900a)) {
                            str = "REFUGEE_SCOPE_3001";
                        } else if (fr.t.c(a0Var, k34.a0.y.f107902a)) {
                            str = "REFUGEE_SCOPE_3002";
                        } else if (fr.t.c(a0Var, k34.a0.z.f107904a)) {
                            str = fr.t.c(str, wn3.a.TEMPORARY.getValue()) ? "ACTIVE_TEMPORARY_DRIVING_LICENCE" : "DRIVING_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.h0.f107868a)) {
                            str = "ENCRYPTION_NIPIP_MIDWIFE";
                        } else if (fr.t.c(a0Var, k34.a0.n0.f107881a)) {
                            str = "ENCRYPTION_NIPIP_NURSE";
                        } else if (fr.t.c(a0Var, k34.a0.s0.f107891a)) {
                            str = "PENSIONER_DATA_KEY";
                        } else if (fr.t.c(a0Var, k34.a0.x0.f107901a)) {
                            if (str == null) {
                                str = "RAILWAY_CARD_DOCUMENT_OWNER";
                            }
                        } else if (fr.t.c(a0Var, k34.a0.b.f107849a)) {
                            str = "licenseData_BYDGOSZCZ_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.c.f107852a)) {
                            str = "licenseData_CHELM_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.d.f107855a)) {
                            str = "licenseData_CHELM_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.e.f107858a)) {
                            str = "licenseData_CHELM_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.j.f107872a)) {
                            str = "licenseData_FIREFIGHTER_OSP_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.k.f107874a)) {
                            str = "licenseData_GIZYCKA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.c0.f107853a)) {
                            str = "licenseData_JASTRZEBIA_GORA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.d0.f107856a)) {
                            str = "licenseData_KOBYLKA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.e0.f107859a)) {
                            str = "licenseData_KOLEJE_DOLNOSLASKIE_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.f0.f107862a)) {
                            str = "licenseData_LODZ_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.g0.f107865a)) {
                            str = "licenseData_LODZ_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.i0.f107871a)) {
                            str = "licenseData_MIEJSKA_AUGUSTOW_TOURIST_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.j0.f107873a)) {
                            str = "licenseData_MIEKINIA_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.k0.f107875a)) {
                            str = "licenseData_MIEKINIA_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.l0.f107877a)) {
                            str = "licenseData_MAZOVIA_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.l.f107876a)) {
                            str = "licenseData_GENERAL_COUNSEL_LICENCE_SCOPE";
                        } else if (fr.t.c(a0Var, k34.a0.m0.f107879a)) {
                            str = "licenseData_MICHALOWICE_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.o0.f107883a)) {
                            str = "licenseData_OLAWA_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.p0.f107885a)) {
                            str = "licenseData_OLAWA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.q0.f107887a)) {
                            str = "licenseData_OLAWA_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.r0.f107889a)) {
                            str = "licenseData_OLECKO_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.t0.f107893a)) {
                            str = "licenseData_PZPN_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.u0.f107895a)) {
                            str = "licenseData_RACIBORSKA_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.v0.f107897a)) {
                            str = "licenseData_RACIBORSKA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.w0.f107899a)) {
                            str = "licenseData_RACIBORSKA_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.y0.f107903a)) {
                            str = "licenseData_RASKA_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.z0.f107905a)) {
                            str = "licenseData_SENATOR_CARD";
                        } else if (fr.t.c(a0Var, k34.a0.a1.f107848a)) {
                            str = "licenseData_SUCHY_LAS_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.b1.f107851a)) {
                            str = "licenseData_TOPR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.c1.f107854a)) {
                            str = "licenseData_WROCLAWSKA_SENIOR_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.d1.f107857a)) {
                            str = "licenseData_WISLA_RESIDENT_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.e1.f107860a)) {
                            str = "licenseData_WODZISLAW_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.f1.f107863a)) {
                            str = "licenseData_ZDUNSKOWOLSKA_FAMILY_LICENCE";
                        } else if (fr.t.c(a0Var, k34.a0.g1.f107866a)) {
                            str = "licenseData_ZDUNSKOWOLSKA_RESIDENT_LICENCE";
                        } else {
                            if (!fr.t.c(a0Var, k34.a0.h1.f107869a)) {
                                if (!fr.t.c(a0Var, k34.a0.w.f107898a) && !fr.t.c(a0Var, k34.a0.m.f107878a)) {
                                    throw new oq.p();
                                }
                                aVar.b(new dx.b.Generic(new UnsupportedOperationException(a0Var.getClass().getName() + " scope is not supported")));
                                throw new oq.g();
                            }
                            str = "licenseData_ZDUNSKOWOLSKA_SENIOR_LICENCE";
                        }
                        return new dx.i.Right(str);
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
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        private final NipipCardData.b L0(NipipDataContainer.b bVar) {
            int i15 = C3870a.E[bVar.ordinal()];
            if (i15 == 1) {
                return NipipCardData.b.FULL;
            }
            if (i15 == 2) {
                return NipipCardData.b.PARTIAL;
            }
            if (i15 == 3) {
                return NipipCardData.b.UNKNOWN;
            }
            throw new oq.p();
        }

        private final DocumentConfigLabel M(f24.DocumentConfigLabel documentConfigLabel) {
            eo3.DocumentSchemaLabel.a aVar;
            g24.g language = documentConfigLabel.getLanguage();
            int i15 = language == null ? -1 : C3870a.f156234f[language.ordinal()];
            if (i15 == -1) {
                aVar = null;
            } else if (i15 == 1) {
                aVar = eo3.DocumentSchemaLabel.a.PL;
            } else if (i15 == 2) {
                aVar = eo3.DocumentSchemaLabel.a.EN;
            } else if (i15 == 3) {
                aVar = eo3.DocumentSchemaLabel.a.UK;
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                aVar = eo3.DocumentSchemaLabel.a.UNKNOWN;
            }
            return new DocumentConfigLabel(aVar, documentConfigLabel.getValue());
        }

        private final NipipCardData.EnumC0978c M0(NipipCardContainerData.c cVar) {
            int i15 = C3870a.D[cVar.ordinal()];
            if (i15 == 1) {
                return NipipCardData.EnumC0978c.RANGE;
            }
            if (i15 == 2) {
                return NipipCardData.EnumC0978c.INDIVIDUAL;
            }
            if (i15 == 3) {
                return NipipCardData.EnumC0978c.UNDER_SUPERVISION;
            }
            if (i15 == 4) {
                return NipipCardData.EnumC0978c.FIXED_TERM;
            }
            if (i15 == 5) {
                return NipipCardData.EnumC0978c.UNKNOWN;
            }
            throw new oq.p();
        }

        private final DocumentConfigLabel N(BEDocumentConfigLabel bEDocumentConfigLabel) {
            eo3.DocumentSchemaLabel.a aVar;
            BEDocumentConfigLabel.a language = bEDocumentConfigLabel.getLanguage();
            int i15 = language == null ? -1 : C3870a.f156239k[language.ordinal()];
            if (i15 == -1) {
                aVar = null;
            } else if (i15 == 1) {
                aVar = eo3.DocumentSchemaLabel.a.PL;
            } else if (i15 == 2) {
                aVar = eo3.DocumentSchemaLabel.a.EN;
            } else if (i15 == 3) {
                aVar = eo3.DocumentSchemaLabel.a.UK;
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                aVar = eo3.DocumentSchemaLabel.a.UNKNOWN;
            }
            return new DocumentConfigLabel(aVar, bEDocumentConfigLabel.getValue());
        }

        private final NipipCardData.EnumC0978c N0(NipipDataContainer.c cVar) {
            int i15 = C3870a.F[cVar.ordinal()];
            if (i15 == 1) {
                return NipipCardData.EnumC0978c.RANGE;
            }
            if (i15 == 2) {
                return NipipCardData.EnumC0978c.INDIVIDUAL;
            }
            if (i15 == 3) {
                return NipipCardData.EnumC0978c.UNDER_SUPERVISION;
            }
            if (i15 == 4) {
                return NipipCardData.EnumC0978c.FIXED_TERM;
            }
            if (i15 == 5) {
                return NipipCardData.EnumC0978c.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.DocumentSchemaAttribute O(DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            eo3.k kVarN0 = n0(documentSchemaAttribute.getDataType());
            MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            eo3.MissingDocumentAttribute missingDocumentAttributeU0 = onMissingAttribute != null ? u0(onMissingAttribute) : null;
            List<g24.DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(c0((g24.DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<g24.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<g24.DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(U((g24.DocumentSchemaEnumTranslation) it4.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            List<DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
            if (listA != null) {
                List<DocumentSchemaBooleanTranslation> list2 = listA;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(R((DocumentSchemaBooleanTranslation) it5.next()));
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
            return new eo3.DocumentSchemaAttribute(kVarN0, missingDocumentAttributeU0, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final StaticSection O0(DocumentStaticSection documentStaticSection) {
            List<g24.DocumentSchemaLabel> listA = documentStaticSection.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(c0((g24.DocumentSchemaLabel) it.next()));
            }
            return new StaticSection(arrayList);
        }

        private final eo3.DocumentSchemaAttribute P(gr0.DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            eo3.k kVarO0 = o0(documentSchemaAttribute.getDataType());
            gr0.MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            eo3.MissingDocumentAttribute missingDocumentAttributeV0 = onMissingAttribute != null ? v0(onMissingAttribute) : null;
            List<DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(d0((DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<gr0.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<gr0.DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(V((gr0.DocumentSchemaEnumTranslation) it4.next()));
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
                    arrayList6.add(S((gr0.DocumentSchemaBooleanTranslation) it5.next()));
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
            return new eo3.DocumentSchemaAttribute(kVarO0, missingDocumentAttributeV0, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final StaticSection P0(gr0.DocumentStaticSection documentStaticSection) {
            List<DocumentSchemaLabel> listA = documentStaticSection.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(d0((DocumentSchemaLabel) it.next()));
            }
            return new StaticSection(arrayList);
        }

        private final eo3.DocumentSchemaAttribute Q(gv1.DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            eo3.k kVarP0 = p0(documentSchemaAttribute.getDataType());
            gv1.MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            eo3.MissingDocumentAttribute missingDocumentAttributeW0 = onMissingAttribute != null ? w0(onMissingAttribute) : null;
            List<gv1.DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(e0((gv1.DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(W((DocumentSchemaEnumTranslation) it4.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            List<gv1.DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
            if (listA != null) {
                List<gv1.DocumentSchemaBooleanTranslation> list2 = listA;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(T((gv1.DocumentSchemaBooleanTranslation) it5.next()));
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            List<gv1.m> listF = documentSchemaAttribute.f();
            if (listF != null) {
                List<gv1.m> list3 = listF;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(Z((gv1.m) it6.next()));
                }
            }
            return new eo3.DocumentSchemaAttribute(kVarP0, missingDocumentAttributeW0, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final TopAnnotation Q0(DocumentTopAnnotation documentTopAnnotation) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<g24.DocumentSchemaLabel> listD = documentTopAnnotation.d();
            if (listD != null) {
                List<g24.DocumentSchemaLabel> list = listD;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c0((g24.DocumentSchemaLabel) it.next()));
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
                    arrayList2.add(c0((g24.DocumentSchemaLabel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            List<DocumentStaticSection> listC = documentTopAnnotation.c();
            if (listC != null) {
                List<DocumentStaticSection> list3 = listC;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(O0((DocumentStaticSection) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            g24.DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
            return new TopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? s0(dynamicSections) : null);
        }

        private final eo3.DocumentSchemaBooleanTranslation R(DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<g24.DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(c0((g24.DocumentSchemaLabel) it.next()));
            }
            List<g24.DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(c0((g24.DocumentSchemaLabel) it4.next()));
            }
            return new eo3.DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final TopAnnotation R0(gr0.DocumentTopAnnotation documentTopAnnotation) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<DocumentSchemaLabel> listD = documentTopAnnotation.d();
            if (listD != null) {
                List<DocumentSchemaLabel> list = listD;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(d0((DocumentSchemaLabel) it.next()));
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
                    arrayList2.add(d0((DocumentSchemaLabel) it4.next()));
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
                    arrayList3.add(P0((gr0.DocumentStaticSection) it5.next()));
                }
            } else {
                arrayList3 = null;
            }
            gr0.DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
            return new TopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? t0(dynamicSections) : null);
        }

        private final eo3.DocumentSchemaBooleanTranslation S(gr0.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(d0((DocumentSchemaLabel) it.next()));
            }
            List<DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(d0((DocumentSchemaLabel) it4.next()));
            }
            return new eo3.DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final VerificationSelector S0(h24.VerificationSelector verificationSelector) {
            return new VerificationSelector(new DocumentDynamicSection(verificationSelector.getDynamicSections().c(), verificationSelector.getDynamicSections().a(), verificationSelector.getDynamicSections().b()), z0(verificationSelector.getLabel()));
        }

        private final eo3.DocumentSchemaBooleanTranslation T(gv1.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<gv1.DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(e0((gv1.DocumentSchemaLabel) it.next()));
            }
            List<gv1.DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(e0((gv1.DocumentSchemaLabel) it4.next()));
            }
            return new eo3.DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final VerificationSelector T0(hr0.VerificationSelector verificationSelector) {
            return new VerificationSelector(new DocumentDynamicSection(verificationSelector.getDynamicSections().c(), verificationSelector.getDynamicSections().a(), verificationSelector.getDynamicSections().b()), A0(verificationSelector.getLabel()));
        }

        private final eo3.DocumentSchemaEnumTranslation U(g24.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<g24.DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(c0((g24.DocumentSchemaLabel) it.next()));
            }
            return new eo3.DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final eo3.DocumentSchemaEnumTranslation V(gr0.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(d0((DocumentSchemaLabel) it.next()));
            }
            return new eo3.DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final eo3.DocumentSchemaEnumTranslation W(DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
            String enumValue = documentSchemaEnumTranslation.getEnumValue();
            List<gv1.DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(e0((gv1.DocumentSchemaLabel) it.next()));
            }
            return new eo3.DocumentSchemaEnumTranslation(enumValue, arrayList);
        }

        private final eo3.f X(g24.l lVar) {
            int i15 = C3870a.f156238j[lVar.ordinal()];
            if (i15 == 1) {
                return eo3.f.UPPERCASE;
            }
            if (i15 == 2) {
                return eo3.f.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.f Y(gr0.l lVar) {
            int i15 = C3870a.f156244p[lVar.ordinal()];
            if (i15 == 1) {
                return eo3.f.UPPERCASE;
            }
            if (i15 == 2) {
                return eo3.f.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.f Z(gv1.m mVar) {
            int i15 = C3870a.f156254z[mVar.ordinal()];
            if (i15 == 1) {
                return eo3.f.UPPERCASE;
            }
            if (i15 == 2) {
                return eo3.f.UNKNOWN;
            }
            throw new oq.p();
        }

        private final DocumentSchemaForwardAttribute a0(g24.DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
            List<g24.DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(c0((g24.DocumentSchemaLabel) it.next()));
            }
            return new DocumentSchemaForwardAttribute(arrayList);
        }

        private final DocumentSchemaForwardAttribute b0(gr0.DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
            List<DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(d0((DocumentSchemaLabel) it.next()));
            }
            return new DocumentSchemaForwardAttribute(arrayList);
        }

        private final gv1.DocumentSchemaAttribute c(eo3.DocumentSchemaAttribute documentSchemaAttribute) {
            ArrayList arrayList;
            ArrayList arrayList2;
            gv1.s sVarG = G(documentSchemaAttribute.getDataType());
            eo3.MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
            ArrayList arrayList3 = null;
            gv1.MissingDocumentAttribute missingDocumentAttributeH = onMissingAttribute != null ? H(onMissingAttribute) : null;
            List<eo3.DocumentSchemaLabel> listG = documentSchemaAttribute.g();
            ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList4.add(E((eo3.DocumentSchemaLabel) it.next()));
            }
            List<String> listE = documentSchemaAttribute.e();
            String fieldReference = documentSchemaAttribute.getFieldReference();
            List<eo3.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
            if (listC != null) {
                List<eo3.DocumentSchemaEnumTranslation> list = listC;
                ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(C((eo3.DocumentSchemaEnumTranslation) it4.next()));
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            List<eo3.DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
            if (listA != null) {
                List<eo3.DocumentSchemaBooleanTranslation> list2 = listA;
                ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(d((eo3.DocumentSchemaBooleanTranslation) it5.next()));
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            List<eo3.f> listF = documentSchemaAttribute.f();
            if (listF != null) {
                List<eo3.f> list3 = listF;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(D((eo3.f) it6.next()));
                }
            }
            return new gv1.DocumentSchemaAttribute(sVarG, missingDocumentAttributeH, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
        }

        private final eo3.DocumentSchemaLabel c0(g24.DocumentSchemaLabel documentSchemaLabel) {
            return new eo3.DocumentSchemaLabel(f0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final gv1.DocumentSchemaBooleanTranslation d(eo3.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
            List<eo3.DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(E((eo3.DocumentSchemaLabel) it.next()));
            }
            List<eo3.DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it4 = listA.iterator();
            while (it4.hasNext()) {
                arrayList2.add(E((eo3.DocumentSchemaLabel) it4.next()));
            }
            return new gv1.DocumentSchemaBooleanTranslation(arrayList, arrayList2);
        }

        private final eo3.DocumentSchemaLabel d0(DocumentSchemaLabel documentSchemaLabel) {
            return new eo3.DocumentSchemaLabel(g0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final eo3.DocumentSchemaLabel e0(gv1.DocumentSchemaLabel documentSchemaLabel) {
            return new eo3.DocumentSchemaLabel(h0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
        }

        private final eo3.DocumentSchemaLabel.a f0(g24.g gVar) {
            int i15 = C3870a.f156234f[gVar.ordinal()];
            if (i15 == 1) {
                return eo3.DocumentSchemaLabel.a.PL;
            }
            if (i15 == 2) {
                return eo3.DocumentSchemaLabel.a.EN;
            }
            if (i15 == 3) {
                return eo3.DocumentSchemaLabel.a.UK;
            }
            if (i15 == 4) {
                return eo3.DocumentSchemaLabel.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.DocumentSchemaLabel.a g0(DocumentSchemaLabel.a aVar) {
            int i15 = C3870a.f156241m[aVar.ordinal()];
            if (i15 == 1) {
                return eo3.DocumentSchemaLabel.a.PL;
            }
            if (i15 == 2) {
                return eo3.DocumentSchemaLabel.a.EN;
            }
            if (i15 == 3) {
                return eo3.DocumentSchemaLabel.a.UK;
            }
            if (i15 == 4) {
                return eo3.DocumentSchemaLabel.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.DocumentSchemaLabel.a h0(gv1.h hVar) {
            int i15 = C3870a.f156252x[hVar.ordinal()];
            if (i15 == 1) {
                return eo3.DocumentSchemaLabel.a.PL;
            }
            if (i15 == 2) {
                return eo3.DocumentSchemaLabel.a.EN;
            }
            if (i15 == 3) {
                return eo3.DocumentSchemaLabel.a.UK;
            }
            if (i15 == 4) {
                return eo3.DocumentSchemaLabel.a.UNKNOWN;
            }
            throw new oq.p();
        }

        private final eo3.DocumentsGroup i0(DocumentsGroup documentsGroup) {
            eo3.DocumentsGroup.a aVar;
            eo3.DocumentSchemaLabel.a aVar2;
            int i15 = C3870a.f156235g[documentsGroup.getSortOrder().ordinal()];
            if (i15 == 1) {
                aVar = eo3.DocumentsGroup.a.ASC;
            } else if (i15 == 2) {
                aVar = eo3.DocumentsGroup.a.DESC;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                aVar = eo3.DocumentsGroup.a.UNKNOWN;
            }
            List<g24.DocumentSchemaLabel> listA = documentsGroup.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            for (g24.DocumentSchemaLabel documentSchemaLabel : listA) {
                int i16 = C3870a.f156234f[documentSchemaLabel.getLanguage().ordinal()];
                if (i16 == 1) {
                    aVar2 = eo3.DocumentSchemaLabel.a.PL;
                } else if (i16 == 2) {
                    aVar2 = eo3.DocumentSchemaLabel.a.EN;
                } else if (i16 == 3) {
                    aVar2 = eo3.DocumentSchemaLabel.a.UK;
                } else {
                    if (i16 != 4) {
                        throw new oq.p();
                    }
                    aVar2 = eo3.DocumentSchemaLabel.a.UNKNOWN;
                }
                arrayList.add(new eo3.DocumentSchemaLabel(aVar2, documentSchemaLabel.getValue()));
            }
            return new eo3.DocumentsGroup(aVar, arrayList);
        }

        private final eo3.DocumentsGroup j0(gr0.DocumentsGroup documentsGroup) {
            eo3.DocumentsGroup.a aVar;
            eo3.DocumentSchemaLabel.a aVar2;
            int i15 = C3870a.f156240l[documentsGroup.getSortOrder().ordinal()];
            if (i15 == 1) {
                aVar = eo3.DocumentsGroup.a.ASC;
            } else if (i15 == 2) {
                aVar = eo3.DocumentsGroup.a.DESC;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                aVar = eo3.DocumentsGroup.a.UNKNOWN;
            }
            List<DocumentSchemaLabel> listA = documentsGroup.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            for (DocumentSchemaLabel documentSchemaLabel : listA) {
                int i16 = C3870a.f156241m[documentSchemaLabel.getLanguage().ordinal()];
                if (i16 == 1) {
                    aVar2 = eo3.DocumentSchemaLabel.a.PL;
                } else if (i16 == 2) {
                    aVar2 = eo3.DocumentSchemaLabel.a.EN;
                } else if (i16 == 3) {
                    aVar2 = eo3.DocumentSchemaLabel.a.UK;
                } else {
                    if (i16 != 4) {
                        throw new oq.p();
                    }
                    aVar2 = eo3.DocumentSchemaLabel.a.UNKNOWN;
                }
                arrayList.add(new eo3.DocumentSchemaLabel(aVar2, documentSchemaLabel.getValue()));
            }
            return new eo3.DocumentsGroup(aVar, arrayList);
        }

        private final eo3.DynamicDocumentData k0(DynamicDocument dynamicDocument, rq0.b.c cVar) {
            String strE = iy.c0.e(dynamicDocument.getSignedAndEncryptedDocumentBase64());
            String documentId = dynamicDocument.getDocumentId();
            DynamicDocumentSchema dynamicDocumentSchemaR0 = r0(dynamicDocument.getSchema());
            rq0.b documentType = dynamicDocument.getDocumentType();
            rq0.b bVar = cVar;
            if (documentType != null) {
                bVar = documentType;
            }
            return new eo3.DynamicDocumentData(strE, documentId, dynamicDocumentSchemaR0, bVar);
        }

        private final eo3.DynamicDocumentData l0(DynamicDocumentData dynamicDocumentData) {
            return new eo3.DynamicDocumentData(this.M.d(dynamicDocumentData.getScope().a()), dynamicDocumentData.getDocument().getDocumentId(), q0(dynamicDocumentData.getSchema()), r2.a(dynamicDocumentData.getDocument().getDocumentType()));
        }

        private final eo3.DynamicDocumentData m0(DynamicDocumentDataContainer dynamicDocumentDataContainer, rq0.b.EnumC4479b enumC4479b) {
            return new eo3.DynamicDocumentData(iy.c0.e(dynamicDocumentDataContainer.getData()), dynamicDocumentDataContainer.getSchemaContainer().getDocumentId(), r0(dynamicDocumentDataContainer.getSchemaContainer().getSchema()), enumC4479b);
        }

        private final eo3.k n0(g24.r rVar) {
            switch (C3870a.f156236h[rVar.ordinal()]) {
                case 1:
                    return eo3.k.TEXT;
                case 2:
                    return eo3.k.NAME;
                case 3:
                    return eo3.k.DATE;
                case 4:
                    return eo3.k.DATE_TIME;
                case 5:
                    return eo3.k.NUMBER;
                case 6:
                    return eo3.k.NOTE;
                case 7:
                    return eo3.k.ENUM;
                case 8:
                    return eo3.k.BOOLEAN;
                case 9:
                    return eo3.k.MULTILINE_TEXT;
                case 10:
                    return eo3.k.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final eo3.k o0(gr0.s sVar) {
            switch (C3870a.f156242n[sVar.ordinal()]) {
                case 1:
                    return eo3.k.TEXT;
                case 2:
                    return eo3.k.NAME;
                case 3:
                    return eo3.k.DATE;
                case 4:
                    return eo3.k.DATE_TIME;
                case 5:
                    return eo3.k.NUMBER;
                case 6:
                    return eo3.k.NOTE;
                case 7:
                    return eo3.k.ENUM;
                case 8:
                    return eo3.k.BOOLEAN;
                case 9:
                    return eo3.k.MULTILINE_TEXT;
                case 10:
                    return eo3.k.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final eo3.k p0(gv1.s sVar) {
            switch (C3870a.f156248t[sVar.ordinal()]) {
                case 1:
                    return eo3.k.TEXT;
                case 2:
                    return eo3.k.NAME;
                case 3:
                    return eo3.k.DATE;
                case 4:
                    return eo3.k.DATE_TIME;
                case 5:
                    return eo3.k.NUMBER;
                case 6:
                    return eo3.k.NOTE;
                case 7:
                    return eo3.k.ENUM;
                case 8:
                    return eo3.k.BOOLEAN;
                case 9:
                    return eo3.k.MULTILINE_TEXT;
                case 10:
                    return eo3.k.UNKNOWN;
                default:
                    throw new oq.p();
            }
        }

        private final DynamicDocumentSchema q0(DocumentSchema documentSchema) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String schemaId = documentSchema.getSchemaId();
            String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
            DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
            ArrayList arrayList3 = null;
            TopAnnotation topAnnotationQ0 = topAnnotation != null ? Q0(topAnnotation) : null;
            PictureSchema pictureSchemaI0 = I0(documentSchema.getPicture());
            List<DocumentSchemaAttribute> listF = documentSchema.f();
            if (listF != null) {
                List<DocumentSchemaAttribute> list = listF;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(O((DocumentSchemaAttribute) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<DocumentSchemaAttribute> listB = documentSchema.b();
            if (listB != null) {
                List<DocumentSchemaAttribute> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(O((DocumentSchemaAttribute) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
            eo3.MultiDocumentView multiDocumentViewB0 = multiDocumentView != null ? B0(multiDocumentView) : null;
            List<g24.DocumentSchemaForwardAttribute> listI = documentSchema.i();
            if (listI != null) {
                List<g24.DocumentSchemaForwardAttribute> list3 = listI;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(a0((g24.DocumentSchemaForwardAttribute) it5.next()));
                }
            }
            return new DynamicDocumentSchema(schemaId, arrayList3, documentPeselFieldReference, topAnnotationQ0, pictureSchemaI0, arrayList, arrayList2, multiDocumentViewB0);
        }

        private final DynamicDocumentSchema r0(gr0.DocumentSchema documentSchema) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String schemaId = documentSchema.getSchemaId();
            String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
            gr0.DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
            ArrayList arrayList3 = null;
            TopAnnotation topAnnotationR0 = topAnnotation != null ? R0(topAnnotation) : null;
            PictureSchema pictureSchemaJ0 = J0(documentSchema.getPicture());
            List<gr0.DocumentSchemaAttribute> listF = documentSchema.f();
            if (listF != null) {
                List<gr0.DocumentSchemaAttribute> list = listF;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(P((gr0.DocumentSchemaAttribute) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<gr0.DocumentSchemaAttribute> listB = documentSchema.b();
            if (listB != null) {
                List<gr0.DocumentSchemaAttribute> list2 = listB;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(P((gr0.DocumentSchemaAttribute) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            hr0.MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
            eo3.MultiDocumentView multiDocumentViewC0 = multiDocumentView != null ? C0(multiDocumentView) : null;
            List<gr0.DocumentSchemaForwardAttribute> listI = documentSchema.i();
            if (listI != null) {
                List<gr0.DocumentSchemaForwardAttribute> list3 = listI;
                arrayList3 = new ArrayList(pq.v.y(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(b0((gr0.DocumentSchemaForwardAttribute) it5.next()));
                }
            }
            return new DynamicDocumentSchema(schemaId, arrayList3, documentPeselFieldReference, topAnnotationR0, pictureSchemaJ0, arrayList, arrayList2, multiDocumentViewC0);
        }

        private final DynamicSection s0(g24.DocumentDynamicSection documentDynamicSection) {
            return new DynamicSection(documentDynamicSection.a());
        }

        private final DynamicSection t0(gr0.DocumentDynamicSection documentDynamicSection) {
            return new DynamicSection(documentDynamicSection.a());
        }

        private final eo3.MissingDocumentAttribute u0(MissingDocumentAttribute missingDocumentAttribute) {
            eo3.MissingDocumentAttribute.a aVarF0 = F0(missingDocumentAttribute.getOnMissing());
            g24.r dataType = missingDocumentAttribute.getDataType();
            return new eo3.MissingDocumentAttribute(aVarF0, dataType != null ? n0(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final eo3.MissingDocumentAttribute v0(gr0.MissingDocumentAttribute missingDocumentAttribute) {
            eo3.MissingDocumentAttribute.a aVarG0 = G0(missingDocumentAttribute.getOnMissing());
            gr0.s dataType = missingDocumentAttribute.getDataType();
            return new eo3.MissingDocumentAttribute(aVarG0, dataType != null ? o0(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final eo3.MissingDocumentAttribute w0(gv1.MissingDocumentAttribute missingDocumentAttribute) {
            eo3.MissingDocumentAttribute.a aVarH0 = H0(missingDocumentAttribute.getOnMissing());
            gv1.s dataType = missingDocumentAttribute.getDataType();
            return new eo3.MissingDocumentAttribute(aVarH0, dataType != null ? p0(dataType) : null, missingDocumentAttribute.getDefaultValue());
        }

        private final MultiDocumentSchema x0(h24.MultiDocumentSchema multiDocumentSchema) {
            DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
            eo3.DocumentsGroup documentsGroupI0 = leftTab != null ? i0(leftTab) : null;
            DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
            eo3.DocumentsGroup documentsGroupI1 = rightTab != null ? i0(rightTab) : null;
            h24.VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
            return new MultiDocumentSchema(documentsGroupI0, documentsGroupI1, verificationSelector != null ? S0(verificationSelector) : null);
        }

        private final MultiDocumentSchema y0(hr0.MultiDocumentSchema multiDocumentSchema) {
            gr0.DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
            eo3.DocumentsGroup documentsGroupJ0 = leftTab != null ? j0(leftTab) : null;
            gr0.DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
            eo3.DocumentsGroup documentsGroupJ1 = rightTab != null ? j0(rightTab) : null;
            hr0.VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
            return new MultiDocumentSchema(documentsGroupJ0, documentsGroupJ1, verificationSelector != null ? T0(verificationSelector) : null);
        }

        private final MultiDocumentSelectorLabel z0(h24.MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
            ArrayList arrayList;
            List<f24.DocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(M((f24.DocumentConfigLabel) it.next()));
            }
            List<f24.DocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList3.add(M((f24.DocumentConfigLabel) it4.next()));
            }
            List<f24.DocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
            if (listC != null) {
                List<f24.DocumentConfigLabel> list = listC;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(M((f24.DocumentConfigLabel) it5.next()));
                }
            } else {
                arrayList = null;
            }
            return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
        }

        @Override // bo3.a
        public Object B(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
            boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156215m.c(new w24.e0.Params(str), eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.D.c(new q34.o0.Params(a0Var, str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // bo3.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            k kVar;
            k34.u uVar;
            if (eVar instanceof k) {
                kVar = (k) eVar;
                int i15 = kVar.f156349g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    kVar.f156349g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    kVar = new k(eVar);
                }
            } else {
                kVar = new k(eVar);
            }
            Object objC = kVar.f156347e;
            Object objE = uq.b.e();
            int i16 = kVar.f156349g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f156205c.g(z15);
                }
                k24.g gVar = this.f156207e;
                k24.g.Params params = new k24.g.Params(z15);
                kVar.f156346d = z15;
                kVar.f156349g = 1;
                objC = gVar.c(params, kVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            int i17 = C3870a.f156230b[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
            if (i17 == 1) {
                uVar = k34.u.MOBYWATEL;
            } else if (i17 == 2) {
                uVar = k34.u.DIIA;
            } else {
                if (i17 != 3) {
                    throw new oq.p();
                }
                uVar = k34.u.STUDENT;
            }
            return new dx.i.Right(uVar);
        }

        @Override // bo3.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f156205c.m(uVar);
            }
            k24.b bVar = this.f156206d;
            int i15 = C3870a.f156229a[uVar.ordinal()];
            if (i15 == 1) {
                cVar = f24.c.CITIZEN;
            } else if (i15 == 2) {
                cVar = f24.c.REFUGEE;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                cVar = f24.c.UNIVERSITY;
            }
            return bVar.c(new k24.b.Params(cVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.s9$a$j, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // bo3.a
        public Object e(tq.e<? super dx.i<? extends dx.b, ? extends rq0.b>> eVar) throws Throwable {
            ?? jVar;
            Object objB;
            rq0.b bVarO;
            ex.b bVar;
            dx.i right;
            int i15;
            rq0.b.d dVar;
            if (eVar instanceof j) {
                j jVar2 = (j) eVar;
                int i16 = jVar2.f156345q;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    jVar2.f156345q = i16 - PKIFailureInfo.systemUnavail;
                    jVar = jVar2;
                } else {
                    jVar = new j(eVar);
                }
            } else {
                jVar = new j(eVar);
            }
            Object objC = jVar.f156343n;
            Object objE = uq.b.e();
            int i17 = jVar.f156345q;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f156203a;
                        k24.g gVar = this.f156207e;
                        g34.c cVar = this.f156205c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.g.Params params = new k24.g.Params(false, 1, null);
                                jVar.f156339j = jVarA;
                                jVar.f156340k = vq.j.a(aVar);
                                jVar.f156341l = vq.j.a(aVar);
                                jVar.f156342m = aVar;
                                jVar.f156334d = 0;
                                jVar.f156335e = 0;
                                jVar.f156336f = 0;
                                jVar.f156337g = 0;
                                jVar.f156338h = 0;
                                jVar.f156345q = 1;
                                objC = gVar.c(params, jVar);
                                if (objC == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                right = (dx.i) objC;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    i15 = C3870a.f156230b[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                    if (i15 != 1) {
                                        dVar = rq0.b.d.ID_CARD;
                                    } else if (i15 != 2) {
                                        dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                    } else {
                                        if (i15 == 3) {
                                            throw new oq.p();
                                        }
                                        dVar = rq0.b.d.STUDENT_CARD;
                                    }
                                    right = new dx.i.Right(dVar);
                                }
                                bVarO = (rq0.b) bVar.a(right);
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                bVarO = g34.c.o(cVar, false, 1, null);
                                if (bVarO == null) {
                                    aVar.b(new dx.b.Generic(new NullPointerException("Main identity document type not found")));
                                    throw new oq.g();
                                }
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            jVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(jVar));
                            dx.i iVarA = jVar.a(e);
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
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) jVar.f156342m;
                        try {
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3870a.f156230b[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                if (i15 != 1) {
                                    dVar = rq0.b.d.ID_CARD;
                                } else if (i15 != 2) {
                                    dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                } else {
                                    if (i15 == 3) {
                                        throw new oq.p();
                                    }
                                    dVar = rq0.b.d.STUDENT_CARD;
                                }
                                right = new dx.i.Right(dVar);
                            }
                            bVarO = (rq0.b) bVar.a(right);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(bVarO);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(tq.e<? super dx.i<? extends dx.b, java.lang.String>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.s9.a.l
                if (r0 == 0) goto L13
                r0 = r6
                pc4.s9$a$l r0 = (pc4.s9.a.l) r0
                int r1 = r0.f156352f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156352f = r1
                goto L18
            L13:
                pc4.s9$a$l r0 = new pc4.s9$a$l
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f156350d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156352f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r6)
                goto L8a
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L34:
                oq.u.b(r6)
                goto L58
            L38:
                oq.u.b(r6)
                c54.b r6 = r5.f156203a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                w24.x0 r6 = r5.f156211i
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156352f = r4
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L58
                goto L89
            L58:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L5f
                return r6
            L5f:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L75
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                u24.c r6 = (u24.UserDocumentData) r6
                java.lang.String r6 = r6.getPesel()
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L75:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7b:
                if (r6 != 0) goto Lb1
                q34.x0 r6 = r5.f156212j
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156352f = r3
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L8a
            L89:
                return r1
            L8a:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L91
                return r6
            L91:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto Lab
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                k34.f0 r6 = (k34.UserDocumentData) r6
                iy.b0 r6 = r6.getPesel()
                java.lang.String r6 = iy.c0.e(r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            Lab:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            Lb1:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.f(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r7 == r1) goto L26;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(k34.u r6, tq.e<? super dx.i<? extends dx.b, iy.b0>> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pc4.s9.a.n
                if (r0 == 0) goto L13
                r0 = r7
                pc4.s9$a$n r0 = (pc4.s9.a.n) r0
                int r1 = r0.f156360g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156360g = r1
                goto L18
            L13:
                pc4.s9$a$n r0 = new pc4.s9$a$n
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f156358e
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156360g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f156357d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                goto L7a
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.f156357d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                return r7
            L40:
                oq.u.b(r7)
                c54.b r7 = r5.f156203a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r7 = r7.a(r2)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r4) goto L67
                k24.c r7 = r5.f156204b
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r6 = vq.j.a(r6)
                r0.f156357d = r6
                r0.f156360g = r4
                java.lang.Object r6 = r7.c(r2, r0)
                if (r6 != r1) goto L66
                goto L79
            L66:
                return r6
            L67:
                if (r7 != 0) goto L9d
                g34.c r7 = r5.f156205c
                java.lang.Object r2 = vq.j.a(r6)
                r0.f156357d = r2
                r0.f156360g = r3
                java.lang.Object r7 = r7.l(r6, r0)
                if (r7 != r1) goto L7a
            L79:
                return r1
            L7a:
                dx.i r7 = (dx.i) r7
                boolean r6 = r7 instanceof dx.i.Left
                if (r6 == 0) goto L81
                return r7
            L81:
                boolean r6 = r7 instanceof dx.i.Right
                if (r6 == 0) goto L97
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r6 = r7.b()
                java.lang.String r6 = (java.lang.String) r6
                iy.b0 r6 = iy.c0.g(r6)
                dx.i$c r7 = new dx.i$c
                r7.<init>(r6)
                return r7
            L97:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L9d:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.g(k34.u, tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d7 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x013e  */
        /* JADX WARN: Code duplicated, block: B:56:0x013f A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0143 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0161 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:53:0x0138, B:59:0x0155, B:60:0x015b, B:56:0x013f, B:58:0x0143, B:61:0x0161, B:62:0x0166, B:65:0x016d, B:68:0x017b, B:24:0x006e, B:33:0x00cc, B:39:0x00e9, B:36:0x00d3, B:38:0x00d7, B:40:0x00f1, B:41:0x00f6), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        @Override // bo3.a
        public Object h(rq0.b.EnumC4479b enumC4479b, String str, tq.e<? super dx.i<? extends dx.b, eo3.DynamicDocumentData>> eVar) throws Throwable {
            c cVar;
            Object objB;
            rq0.b.EnumC4479b enumC4479b2;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            eo3.DynamicDocumentData dynamicDocumentData;
            dx.i right2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f156281s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156281s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f156279q;
            Object objE = uq.b.e();
            int i16 = cVar.f156281s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f156203a;
                            w24.q0 q0Var = this.B;
                            q34.d0 d0Var = this.C;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.q0.Params params = new w24.q0.Params(str);
                                    cVar.f156268d = vq.j.a(enumC4479b);
                                    cVar.f156269e = vq.j.a(str);
                                    cVar.f156270f = jVarA;
                                    cVar.f156271g = vq.j.a(aVar);
                                    cVar.f156272h = vq.j.a(aVar);
                                    cVar.f156273j = aVar;
                                    cVar.f156274k = 0;
                                    cVar.f156275l = 0;
                                    cVar.f156276m = 0;
                                    cVar.f156277n = 0;
                                    cVar.f156278p = 0;
                                    cVar.f156281s = 1;
                                    objC = q0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(l0((DynamicDocumentData) ((dx.i.Right) right).b()));
                                        }
                                        dynamicDocumentData = (eo3.DynamicDocumentData) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.d0.Params params2 = new q34.d0.Params(enumC4479b, str);
                                    cVar.f156268d = enumC4479b;
                                    cVar.f156269e = vq.j.a(str);
                                    cVar.f156270f = jVarA;
                                    cVar.f156271g = vq.j.a(aVar);
                                    cVar.f156272h = vq.j.a(aVar);
                                    cVar.f156273j = aVar;
                                    cVar.f156274k = 0;
                                    cVar.f156275l = 0;
                                    cVar.f156276m = 0;
                                    cVar.f156277n = 0;
                                    cVar.f156278p = 0;
                                    cVar.f156281s = 2;
                                    objC = d0Var.c(params2, cVar);
                                    if (objC != objE) {
                                        enumC4479b2 = enumC4479b;
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(m0((DynamicDocumentDataContainer) ((dx.i.Right) right2).b(), enumC4479b2));
                                        }
                                        dynamicDocumentData = (eo3.DynamicDocumentData) bVar.a(right2);
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
                                str = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(str));
                                dx.i iVarA = str.a(e);
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
                            bVar2 = (ex.b) cVar.f156273j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(l0((DynamicDocumentData) ((dx.i.Right) right).b()));
                            }
                            dynamicDocumentData = (eo3.DynamicDocumentData) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f156273j;
                            enumC4479b2 = (rq0.b.EnumC4479b) cVar.f156268d;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(m0((DynamicDocumentDataContainer) ((dx.i.Right) right2).b(), enumC4479b2));
                            }
                            dynamicDocumentData = (eo3.DynamicDocumentData) bVar.a(right2);
                        }
                        return new dx.i.Right(dynamicDocumentData);
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

        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ce A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00eb A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0131  */
        /* JADX WARN: Code duplicated, block: B:56:0x0132 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0136 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0154 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // bo3.a
        public Object i(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, eo3.DynamicDocumentData>> eVar) throws Throwable {
            e eVar2;
            Object objB;
            rq0.b.EnumC4479b enumC4479b2;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            eo3.DynamicDocumentData dynamicDocumentData;
            dx.i right2;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f156297r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f156297r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f156295p;
            ?? E = uq.b.e();
            int i16 = eVar2.f156297r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f156203a;
                            w24.o0 o0Var = this.f156228z;
                            q34.n0 n0Var = this.A;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.o0.Params params = new w24.o0.Params((f24.i) aVar.a(j1.l(enumC4479b)));
                                    eVar2.f156285d = vq.j.a(enumC4479b);
                                    eVar2.f156286e = jVarA;
                                    eVar2.f156287f = vq.j.a(aVar);
                                    eVar2.f156288g = vq.j.a(aVar);
                                    eVar2.f156289h = aVar;
                                    eVar2.f156290j = 0;
                                    eVar2.f156291k = 0;
                                    eVar2.f156292l = 0;
                                    eVar2.f156293m = 0;
                                    eVar2.f156294n = 0;
                                    eVar2.f156297r = 1;
                                    objC = o0Var.c(params, eVar2);
                                    if (objC != E) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(l0((DynamicDocumentData) ((dx.i.Right) right).b()));
                                        }
                                        dynamicDocumentData = (eo3.DynamicDocumentData) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.n0.Params params2 = new q34.n0.Params(enumC4479b);
                                    eVar2.f156285d = enumC4479b;
                                    eVar2.f156286e = jVarA;
                                    eVar2.f156287f = vq.j.a(aVar);
                                    eVar2.f156288g = vq.j.a(aVar);
                                    eVar2.f156289h = aVar;
                                    eVar2.f156290j = 0;
                                    eVar2.f156291k = 0;
                                    eVar2.f156292l = 0;
                                    eVar2.f156293m = 0;
                                    eVar2.f156294n = 0;
                                    eVar2.f156297r = 2;
                                    objC = n0Var.c(params2, eVar2);
                                    if (objC != E) {
                                        enumC4479b2 = enumC4479b;
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(m0((DynamicDocumentDataContainer) ((dx.i.Right) right2).b(), enumC4479b2));
                                        }
                                        dynamicDocumentData = (eo3.DynamicDocumentData) bVar.a(right2);
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
                            bVar2 = (ex.b) eVar2.f156289h;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(l0((DynamicDocumentData) ((dx.i.Right) right).b()));
                            }
                            dynamicDocumentData = (eo3.DynamicDocumentData) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) eVar2.f156289h;
                            enumC4479b2 = (rq0.b.EnumC4479b) eVar2.f156285d;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(m0((DynamicDocumentDataContainer) ((dx.i.Right) right2).b(), enumC4479b2));
                            }
                            dynamicDocumentData = (eo3.DynamicDocumentData) bVar.a(right2);
                        }
                        return new dx.i.Right(dynamicDocumentData);
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

        /* JADX WARN: Code duplicated, block: B:100:0x0233  */
        /* JADX WARN: Code duplicated, block: B:101:0x0238  */
        /* JADX WARN: Code duplicated, block: B:105:0x0253  */
        /* JADX WARN: Code duplicated, block: B:107:0x0259  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0084  */
        /* JADX WARN: Code duplicated, block: B:30:0x0088  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:50:0x010f  */
        /* JADX WARN: Code duplicated, block: B:52:0x012d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0132  */
        /* JADX WARN: Code duplicated, block: B:56:0x0141  */
        /* JADX WARN: Code duplicated, block: B:57:0x0146  */
        /* JADX WARN: Code duplicated, block: B:61:0x0165  */
        /* JADX WARN: Code duplicated, block: B:63:0x016b  */
        /* JADX WARN: Code duplicated, block: B:71:0x0188 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:72:0x0189  */
        /* JADX WARN: Code duplicated, block: B:74:0x018d  */
        /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x01b4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:83:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:86:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:94:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:96:0x0223  */
        /* JADX WARN: Code duplicated, block: B:97:0x0228  */
        @Override // bo3.a
        public Object j(tq.e<? super dx.i<? extends dx.b, RefugeeFamilyData>> eVar) throws Throwable {
            q qVar;
            dx.i iVar;
            w24.n1 n1Var;
            RefugeeCardData refugeeCardData;
            RefugeeCardData refugeeCardData2;
            dx.i iVar2;
            iy.b0 firstName;
            String strE;
            iy.b0 surname;
            String strE2;
            LinkedHashMap linkedHashMap;
            iy.b0 firstName2;
            String strE3;
            iy.b0 surname2;
            String strE4;
            dx.i iVar3;
            q34.g0 g0Var;
            o34.c cVar;
            o34.c cVar2;
            dx.i iVar4;
            iy.b0 firstName3;
            String strE5;
            iy.b0 surname3;
            String strE6;
            ArrayList arrayList;
            iy.b0 firstName4;
            String strE7;
            iy.b0 surname4;
            String strE8;
            if (eVar instanceof q) {
                qVar = (q) eVar;
                int i15 = qVar.f156374k;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    qVar.f156374k = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    qVar = new q(eVar);
                }
            } else {
                qVar = new q(eVar);
            }
            Object objC = qVar.f156372h;
            Object objE = uq.b.e();
            int i16 = qVar.f156374k;
            if (i16 != 0) {
                if (i16 == 1) {
                    oq.u.b(objC);
                    iVar = (dx.i) objC;
                    n1Var = this.f156219q;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    refugeeCardData = (RefugeeCardData) ((dx.i.Right) iVar).b();
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    qVar.f156368d = vq.j.a(iVar);
                    qVar.f156369e = refugeeCardData;
                    qVar.f156370f = 0;
                    qVar.f156371g = 0;
                    qVar.f156374k = 2;
                    objC = n1Var.c(c1792a, qVar);
                    if (objC != objE) {
                        refugeeCardData2 = refugeeCardData;
                    }
                    return objE;
                }
                if (i16 != 2) {
                    if (i16 == 3) {
                        oq.u.b(objC);
                        iVar3 = (dx.i) objC;
                        g0Var = this.f156220r;
                        if (iVar3 instanceof dx.i.Left) {
                            return iVar3;
                        }
                        if (iVar3 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        cVar = (o34.c) ((dx.i.Right) iVar3).b();
                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                        qVar.f156368d = vq.j.a(iVar3);
                        qVar.f156369e = cVar;
                        qVar.f156370f = 0;
                        qVar.f156371g = 0;
                        qVar.f156374k = 4;
                        objC = g0Var.c(c1792a2, qVar);
                        if (objC != objE) {
                            cVar2 = cVar;
                        }
                        return objE;
                    }
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = (o34.c) qVar.f156369e;
                    oq.u.b(objC);
                    iVar4 = (dx.i) objC;
                    if (iVar4 instanceof dx.i.Left) {
                        return iVar4;
                    }
                    if (iVar4 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    Map map = (Map) ((dx.i.Right) iVar4).b();
                    firstName3 = cVar2.getDataContainer().getFirstName();
                    if (firstName3 != null) {
                        strE5 = iy.c0.e(firstName3);
                    } else {
                        strE5 = null;
                    }
                    surname3 = cVar2.getDataContainer().getSurname();
                    if (surname3 != null) {
                        strE6 = iy.c0.e(surname3);
                    } else {
                        strE6 = null;
                    }
                    do3.RefugeeCardData refugeeCardData3 = new do3.RefugeeCardData(strE5, strE6);
                    arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        o34.c cVar3 = (o34.c) entry.getValue();
                        String strValueOf = String.valueOf(iIntValue);
                        firstName4 = cVar3.getDataContainer().getFirstName();
                        if (firstName4 != null) {
                            strE7 = iy.c0.e(firstName4);
                        } else {
                            strE7 = null;
                        }
                        surname4 = cVar3.getDataContainer().getSurname();
                        if (surname4 != null) {
                            strE8 = iy.c0.e(surname4);
                        } else {
                            strE8 = null;
                        }
                        arrayList.add(oq.y.a(strValueOf, new do3.RefugeeCardData(strE7, strE8)));
                    }
                    return new dx.i.Right(new RefugeeFamilyData(refugeeCardData3, pq.v0.s(arrayList)));
                }
                refugeeCardData2 = (RefugeeCardData) qVar.f156369e;
                oq.u.b(objC);
                iVar2 = (dx.i) objC;
                if (iVar2 instanceof dx.i.Left) {
                    return iVar2;
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                RefugeeChildrenCardFullData refugeeChildrenCardFullData = (RefugeeChildrenCardFullData) ((dx.i.Right) iVar2).b();
                firstName = refugeeCardData2.getScope().getData().getFirstName();
                if (firstName != null) {
                    strE = iy.c0.e(firstName);
                } else {
                    strE = null;
                }
                surname = refugeeCardData2.getScope().getData().getSurname();
                if (surname != null) {
                    strE2 = iy.c0.e(surname);
                } else {
                    strE2 = null;
                }
                do3.RefugeeCardData refugeeCardData4 = new do3.RefugeeCardData(strE, strE2);
                List<RefugeeCardData> listA = refugeeChildrenCardFullData.a();
                linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(listA, 10)), 16));
                for (RefugeeCardData refugeeCardData5 : listA) {
                    String documentId = refugeeCardData5.getDocument().getDocumentId();
                    firstName2 = refugeeCardData5.getScope().getData().getFirstName();
                    if (firstName2 != null) {
                        strE3 = iy.c0.e(firstName2);
                    } else {
                        strE3 = null;
                    }
                    surname2 = refugeeCardData5.getScope().getData().getSurname();
                    if (surname2 != null) {
                        strE4 = iy.c0.e(surname2);
                    } else {
                        strE4 = null;
                    }
                    oq.r rVarA = oq.y.a(documentId, new do3.RefugeeCardData(strE3, strE4));
                    linkedHashMap.put(rVarA.c(), rVarA.d());
                }
                return new dx.i.Right(new RefugeeFamilyData(refugeeCardData4, linkedHashMap));
            }
            oq.u.b(objC);
            boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                w24.l1 l1Var = this.f156217o;
                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                qVar.f156374k = 1;
                objC = l1Var.c(c1792a3, qVar);
                if (objC != objE) {
                    iVar = (dx.i) objC;
                    n1Var = this.f156219q;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    refugeeCardData = (RefugeeCardData) ((dx.i.Right) iVar).b();
                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                    qVar.f156368d = vq.j.a(iVar);
                    qVar.f156369e = refugeeCardData;
                    qVar.f156370f = 0;
                    qVar.f156371g = 0;
                    qVar.f156374k = 2;
                    objC = n1Var.c(c1792a4, qVar);
                    if (objC != objE) {
                        refugeeCardData2 = refugeeCardData;
                        iVar2 = (dx.i) objC;
                        if (iVar2 instanceof dx.i.Left) {
                            return iVar2;
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        RefugeeChildrenCardFullData refugeeChildrenCardFullData2 = (RefugeeChildrenCardFullData) ((dx.i.Right) iVar2).b();
                        firstName = refugeeCardData2.getScope().getData().getFirstName();
                        if (firstName != null) {
                            strE = iy.c0.e(firstName);
                        } else {
                            strE = null;
                        }
                        surname = refugeeCardData2.getScope().getData().getSurname();
                        if (surname != null) {
                            strE2 = iy.c0.e(surname);
                        } else {
                            strE2 = null;
                        }
                        do3.RefugeeCardData refugeeCardData6 = new do3.RefugeeCardData(strE, strE2);
                        List<RefugeeCardData> listA2 = refugeeChildrenCardFullData2.a();
                        linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(listA2, 10)), 16));
                        while (r10.hasNext()) {
                            String documentId2 = refugeeCardData5.getDocument().getDocumentId();
                            firstName2 = refugeeCardData5.getScope().getData().getFirstName();
                            if (firstName2 != null) {
                                strE3 = iy.c0.e(firstName2);
                            } else {
                                strE3 = null;
                            }
                            surname2 = refugeeCardData5.getScope().getData().getSurname();
                            if (surname2 != null) {
                                strE4 = iy.c0.e(surname2);
                            } else {
                                strE4 = null;
                            }
                            oq.r rVarA2 = oq.y.a(documentId2, new do3.RefugeeCardData(strE3, strE4));
                            linkedHashMap.put(rVarA2.c(), rVarA2.d());
                        }
                        return new dx.i.Right(new RefugeeFamilyData(refugeeCardData6, linkedHashMap));
                    }
                }
            } else {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                q34.h0 h0Var = this.f156218p;
                gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                qVar.f156374k = 3;
                objC = h0Var.c(c1792a5, qVar);
                if (objC != objE) {
                    iVar3 = (dx.i) objC;
                    g0Var = this.f156220r;
                    if (iVar3 instanceof dx.i.Left) {
                        return iVar3;
                    }
                    if (iVar3 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    cVar = (o34.c) ((dx.i.Right) iVar3).b();
                    gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                    qVar.f156368d = vq.j.a(iVar3);
                    qVar.f156369e = cVar;
                    qVar.f156370f = 0;
                    qVar.f156371g = 0;
                    qVar.f156374k = 4;
                    objC = g0Var.c(c1792a6, qVar);
                    if (objC != objE) {
                        cVar2 = cVar;
                        iVar4 = (dx.i) objC;
                        if (iVar4 instanceof dx.i.Left) {
                            return iVar4;
                        }
                        if (iVar4 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        Map map2 = (Map) ((dx.i.Right) iVar4).b();
                        firstName3 = cVar2.getDataContainer().getFirstName();
                        if (firstName3 != null) {
                            strE5 = iy.c0.e(firstName3);
                        } else {
                            strE5 = null;
                        }
                        surname3 = cVar2.getDataContainer().getSurname();
                        if (surname3 != null) {
                            strE6 = iy.c0.e(surname3);
                        } else {
                            strE6 = null;
                        }
                        do3.RefugeeCardData refugeeCardData7 = new do3.RefugeeCardData(strE5, strE6);
                        arrayList = new ArrayList(map2.size());
                        while (r10.hasNext()) {
                            int iIntValue2 = ((Number) entry.getKey()).intValue();
                            o34.c cVar4 = (o34.c) entry.getValue();
                            String strValueOf2 = String.valueOf(iIntValue2);
                            firstName4 = cVar4.getDataContainer().getFirstName();
                            if (firstName4 != null) {
                                strE7 = iy.c0.e(firstName4);
                            } else {
                                strE7 = null;
                            }
                            surname4 = cVar4.getDataContainer().getSurname();
                            if (surname4 != null) {
                                strE8 = iy.c0.e(surname4);
                            } else {
                                strE8 = null;
                            }
                            arrayList.add(oq.y.a(strValueOf2, new do3.RefugeeCardData(strE7, strE8)));
                        }
                        return new dx.i.Right(new RefugeeFamilyData(refugeeCardData7, pq.v0.s(arrayList)));
                    }
                }
            }
            return objE;
        }

        @Override // bo3.a
        public Object k(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) {
            boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f156210h.c(new q34.u0.Params(bVar, false, 2, null), eVar);
            }
            if (bVar == rq0.b.d.ID_CARD) {
                return new dx.i.Right(k34.u.MOBYWATEL);
            }
            if (bVar == rq0.b.d.STUDENT_CARD) {
                return new dx.i.Right(k34.u.STUDENT);
            }
            return bVar == rq0.b.d.DIIA_REFUGEE_CARD ? new dx.i.Right(k34.u.DIIA) : bo3.a.A(this, false, eVar, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r12 == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
        
            if (r12 == r1) goto L37;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object l(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<java.lang.String, do3.RailwayCardMemberData>>> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.l(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r10 == r1) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
        
            if (r10 == r1) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
        
            if (r10 == r1) goto L65;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object m(do3.NipipCardData.a r9, tq.e<? super dx.i<? extends dx.b, do3.NipipCardData>> r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.m(do3.c$a, tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (r7 == r1) goto L28;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object n(java.lang.String r6, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pc4.s9.a.g
                if (r0 == 0) goto L13
                r0 = r7
                pc4.s9$a$g r0 = (pc4.s9.a.g) r0
                int r1 = r0.f156316j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156316j = r1
                goto L18
            L13:
                pc4.s9$a$g r0 = new pc4.s9$a$g
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f156314g
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156316j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f156311d
                java.lang.String r6 = (java.lang.String) r6
                oq.u.b(r7)
                goto L8d
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.f156311d
                java.lang.String r6 = (java.lang.String) r6
                oq.u.b(r7)
                return r7
            L40:
                oq.u.b(r7)
                c54.b r7 = r5.f156203a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r7 = r7.a(r2)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r4) goto L6a
                w24.e0 r7 = r5.f156215m
                w24.e0$a r2 = new w24.e0$a
                r2.<init>(r6)
                java.lang.Object r6 = vq.j.a(r6)
                r0.f156311d = r6
                r0.f156316j = r4
                java.lang.Object r6 = r7.c(r2, r0)
                if (r6 != r1) goto L69
                goto L8c
            L69:
                return r6
            L6a:
                if (r7 != 0) goto Lb4
                java.lang.Integer r7 = fu.r.u(r6)
                if (r7 == 0) goto L93
                q34.r0 r2 = r5.f156216n
                int r7 = r7.intValue()
                q34.r0$a r4 = new q34.r0$a
                r4.<init>(r7)
                r0.f156311d = r6
                r0.f156312e = r7
                r7 = 0
                r0.f156313f = r7
                r0.f156316j = r3
                java.lang.Object r7 = r2.c(r4, r0)
                if (r7 != r1) goto L8d
            L8c:
                return r1
            L8d:
                dx.i r7 = (dx.i) r7
                if (r7 != 0) goto L92
                goto L93
            L92:
                return r7
            L93:
                dx.i$b r7 = new dx.i$b
                dx.b$e r0 = new dx.b$e
                java.lang.Exception r1 = new java.lang.Exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid bundleId: "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6)
                r0.<init>(r1)
                r7.<init>(r0)
                return r7
            Lb4:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.n(java.lang.String, tq.e):java.lang.Object");
        }

        @Override // bo3.a
        public Object o(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
            boolean zBooleanValue = this.f156203a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156215m.c(new w24.e0.Params(str), eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.E.c(new q34.q0.Params(a0Var, str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        @Override // bo3.a
        public Object p(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            h hVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            if (eVar instanceof h) {
                hVar = (h) eVar;
                int i15 = hVar.f156330s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.f156330s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objC = hVar.f156328q;
            Object objE = uq.b.e();
            int i16 = hVar.f156330s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f156203a;
                            w24.g0 g0Var = this.f156213k;
                            q34.c0 c0Var = this.f156214l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.g0.Params params = new w24.g0.Params((String) aVar.a(L(a0Var, str)));
                                    hVar.f156317d = vq.j.a(a0Var);
                                    hVar.f156318e = vq.j.a(str);
                                    hVar.f156319f = jVarA;
                                    hVar.f156320g = vq.j.a(aVar);
                                    hVar.f156321h = vq.j.a(aVar);
                                    hVar.f156322j = aVar;
                                    hVar.f156323k = 0;
                                    hVar.f156324l = 0;
                                    hVar.f156325m = 0;
                                    hVar.f156326n = 0;
                                    hVar.f156327p = 0;
                                    hVar.f156330s = 1;
                                    objC = g0Var.c(params, hVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.c0.Params params2 = new q34.c0.Params(a0Var, str);
                                    hVar.f156317d = vq.j.a(a0Var);
                                    hVar.f156318e = vq.j.a(str);
                                    hVar.f156319f = jVarA;
                                    hVar.f156320g = vq.j.a(aVar);
                                    hVar.f156321h = vq.j.a(aVar);
                                    hVar.f156322j = aVar;
                                    hVar.f156323k = 0;
                                    hVar.f156324l = 0;
                                    hVar.f156325m = 0;
                                    hVar.f156326n = 0;
                                    hVar.f156327p = 0;
                                    hVar.f156330s = 2;
                                    objC = c0Var.c(params2, hVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
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
                                str = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(str));
                                dx.i iVarA = str.a(e);
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
                            bVar = (ex.b) hVar.f156322j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) hVar.f156322j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        }
                        return new dx.i.Right((String) bVar.a(iVar));
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

        @Override // bo3.a
        public String q(eo3.DocumentSchemaAttribute attribute, String jsonValue) {
            ArrayList arrayList;
            gv1.s sVarG = G(attribute.getDataType());
            String fieldReference = attribute.getFieldReference();
            List<String> listE = attribute.e();
            iy.b0 b0VarA = gv1.t.a(iy.c0.g(jsonValue));
            List<eo3.DocumentSchemaEnumTranslation> listC = attribute.c();
            if (listC != null) {
                List<eo3.DocumentSchemaEnumTranslation> list = listC;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C((eo3.DocumentSchemaEnumTranslation) it.next()));
                }
            } else {
                arrayList = null;
            }
            return ev1.a.f(this.f156227y, sVarG, fieldReference, listE, arrayList, b0VarA, null, 32, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r11 == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
        
            if (r11 == r1) goto L37;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object r(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<java.lang.String, do3.FamilyCardMemberData>>> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.r(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ce A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00eb A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0131  */
        /* JADX WARN: Code duplicated, block: B:56:0x0132 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0136 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0154 A[Catch: Exception -> 0x0041, c -> 0x0044, CancellationException -> 0x0047, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:53:0x012b, B:59:0x0148, B:60:0x014e, B:56:0x0132, B:58:0x0136, B:61:0x0154, B:62:0x0159, B:65:0x0160, B:68:0x016e, B:24:0x0066, B:33:0x00c7, B:39:0x00e4, B:36:0x00ce, B:38:0x00d2, B:40:0x00eb, B:41:0x00f0), top: B:83:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // bo3.a
        public Object s(rq0.b.c cVar, tq.e<? super dx.i<? extends dx.b, MultiDynamicDocumentData>> eVar) throws Throwable {
            f fVar;
            Object objB;
            rq0.b.c cVar2;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            MultiDynamicDocumentData multiDynamicDocumentData;
            dx.i right2;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f156310r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f156310r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f156308p;
            ?? E = uq.b.e();
            int i16 = fVar.f156310r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f156203a;
                            w24.b1 b1Var = this.f156223u;
                            q34.p0 p0Var = this.f156224v;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.b1.Params params = new w24.b1.Params((f24.i) aVar.a(j1.l(cVar)));
                                    fVar.f156298d = vq.j.a(cVar);
                                    fVar.f156299e = jVarA;
                                    fVar.f156300f = vq.j.a(aVar);
                                    fVar.f156301g = vq.j.a(aVar);
                                    fVar.f156302h = aVar;
                                    fVar.f156303j = 0;
                                    fVar.f156304k = 0;
                                    fVar.f156305l = 0;
                                    fVar.f156306m = 0;
                                    fVar.f156307n = 0;
                                    fVar.f156310r = 1;
                                    objC = b1Var.c(params, fVar);
                                    if (objC != E) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(D0((DynamicMultiDocumentFullData) ((dx.i.Right) right).b()));
                                        }
                                        multiDynamicDocumentData = (MultiDynamicDocumentData) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.p0.Params params2 = new q34.p0.Params(cVar);
                                    fVar.f156298d = cVar;
                                    fVar.f156299e = jVarA;
                                    fVar.f156300f = vq.j.a(aVar);
                                    fVar.f156301g = vq.j.a(aVar);
                                    fVar.f156302h = aVar;
                                    fVar.f156303j = 0;
                                    fVar.f156304k = 0;
                                    fVar.f156305l = 0;
                                    fVar.f156306m = 0;
                                    fVar.f156307n = 0;
                                    fVar.f156310r = 2;
                                    objC = p0Var.c(params2, fVar);
                                    if (objC != E) {
                                        cVar2 = cVar;
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(E0((DynamicMultiDocumentFullDataContainer) ((dx.i.Right) right2).b(), cVar2));
                                        }
                                        multiDynamicDocumentData = (MultiDynamicDocumentData) bVar.a(right2);
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
                                px.f fVar2 = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
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
                            bVar2 = (ex.b) fVar.f156302h;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(D0((DynamicMultiDocumentFullData) ((dx.i.Right) right).b()));
                            }
                            multiDynamicDocumentData = (MultiDynamicDocumentData) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) fVar.f156302h;
                            cVar2 = (rq0.b.c) fVar.f156298d;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(E0((DynamicMultiDocumentFullDataContainer) ((dx.i.Right) right2).b(), cVar2));
                            }
                            multiDynamicDocumentData = (MultiDynamicDocumentData) bVar.a(right2);
                        }
                        return new dx.i.Right(multiDynamicDocumentData);
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

        /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, LOOP:1: B:39:0x00ec->B:41:0x00f2, LOOP_END, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x010d A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0154  */
        /* JADX WARN: Code duplicated, block: B:60:0x0155 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x0159 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0176 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, LOOP:0: B:63:0x0170->B:65:0x0176, LOOP_END, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0195 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:57:0x014e, B:67:0x0189, B:68:0x018f, B:60:0x0155, B:62:0x0159, B:63:0x0170, B:65:0x0176, B:66:0x0184, B:69:0x0195, B:70:0x019a, B:73:0x01a1, B:76:0x01af, B:24:0x0068, B:33:0x00ca, B:43:0x0105, B:36:0x00d1, B:38:0x00d5, B:39:0x00ec, B:41:0x00f2, B:42:0x0100, B:44:0x010d, B:45:0x0112), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // bo3.a
        public Object t(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, ? extends List<eo3.DynamicDocumentData>>> eVar) throws Throwable {
            b bVar;
            Object objB;
            rq0.b.EnumC4479b enumC4479b2;
            ex.b bVar2;
            ex.b bVar3;
            Object right;
            ArrayList arrayList;
            Iterator it;
            List list;
            Object right2;
            ArrayList arrayList2;
            Iterator it4;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156267r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156267r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f156265p;
            ?? E = uq.b.e();
            int i16 = bVar.f156267r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f156203a;
                            w24.x xVar = this.f156225w;
                            q34.b0 b0Var = this.f156226x;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.x.Params params = new w24.x.Params((f24.i) aVar.a(j1.l(enumC4479b)));
                                    bVar.f156255d = vq.j.a(enumC4479b);
                                    bVar.f156256e = jVarA;
                                    bVar.f156257f = vq.j.a(aVar);
                                    bVar.f156258g = vq.j.a(aVar);
                                    bVar.f156259h = aVar;
                                    bVar.f156260j = 0;
                                    bVar.f156261k = 0;
                                    bVar.f156262l = 0;
                                    bVar.f156263m = 0;
                                    bVar.f156264n = 0;
                                    bVar.f156267r = 1;
                                    objC = xVar.c(params, bVar);
                                    if (objC != E) {
                                        bVar3 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            List list2 = (List) ((dx.i.Right) right).b();
                                            arrayList = new ArrayList(pq.v.y(list2, 10));
                                            it = list2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(l0((DynamicDocumentData) it.next()));
                                            }
                                            right = new dx.i.Right(arrayList);
                                        }
                                        list = (List) bVar3.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.b0.Params params2 = new q34.b0.Params(enumC4479b);
                                    bVar.f156255d = enumC4479b;
                                    bVar.f156256e = jVarA;
                                    bVar.f156257f = vq.j.a(aVar);
                                    bVar.f156258g = vq.j.a(aVar);
                                    bVar.f156259h = aVar;
                                    bVar.f156260j = 0;
                                    bVar.f156261k = 0;
                                    bVar.f156262l = 0;
                                    bVar.f156263m = 0;
                                    bVar.f156264n = 0;
                                    bVar.f156267r = 2;
                                    objC = b0Var.c(params2, bVar);
                                    if (objC != E) {
                                        enumC4479b2 = enumC4479b;
                                        bVar2 = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            List list3 = (List) ((dx.i.Right) right2).b();
                                            arrayList2 = new ArrayList(pq.v.y(list3, 10));
                                            it4 = list3.iterator();
                                            while (it4.hasNext()) {
                                                arrayList2.add(m0((DynamicDocumentDataContainer) it4.next(), enumC4479b2));
                                            }
                                            right2 = new dx.i.Right(arrayList2);
                                        }
                                        list = (List) bVar2.a(right2);
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
                            bVar3 = (ex.b) bVar.f156259h;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                List list4 = (List) ((dx.i.Right) right).b();
                                arrayList = new ArrayList(pq.v.y(list4, 10));
                                it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(l0((DynamicDocumentData) it.next()));
                                }
                                right = new dx.i.Right(arrayList);
                            }
                            list = (List) bVar3.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) bVar.f156259h;
                            enumC4479b2 = (rq0.b.EnumC4479b) bVar.f156255d;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                List list5 = (List) ((dx.i.Right) right2).b();
                                arrayList2 = new ArrayList(pq.v.y(list5, 10));
                                it4 = list5.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(m0((DynamicDocumentDataContainer) it4.next(), enumC4479b2));
                                }
                                right2 = new dx.i.Right(arrayList2);
                            }
                            list = (List) bVar2.a(right2);
                        }
                        return new dx.i.Right(list);
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

        @Override // bo3.a
        public List<eo3.DocumentSchemaAttribute> u(List<eo3.DocumentSchemaAttribute> documentSchemaAttributes, iy.b0 data) {
            ev1.a aVar = this.f156227y;
            List<eo3.DocumentSchemaAttribute> list = documentSchemaAttributes;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((eo3.DocumentSchemaAttribute) it.next()));
            }
            List<gv1.DocumentSchemaAttribute> listB = aVar.b(arrayList, gv1.t.a(data));
            ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                arrayList2.add(Q((gv1.DocumentSchemaAttribute) it4.next()));
            }
            return arrayList2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object w(tq.e<? super dx.i<? extends dx.b, do3.DrivingLicencesData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.w(tq.e):java.lang.Object");
        }

        @Override // bo3.a
        public boolean x(String fieldReference, String jsonValue) {
            return this.f156227y.d(fieldReference, gv1.t.a(iy.c0.g(jsonValue)));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        
            if (r8 == r1) goto L53;
         */
        @Override // bo3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object y(rq0.b r7, tq.e<? super rq0.b> r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s9.a.y(rq0.b, tq.e):java.lang.Object");
        }

        @Override // bo3.a
        public String z(List<eo3.DocumentSchemaLabel> label) {
            ArrayList arrayList;
            ev1.a aVar = this.f156227y;
            if (label != null) {
                List<eo3.DocumentSchemaLabel> list = label;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(E((eo3.DocumentSchemaLabel) it.next()));
                }
            } else {
                arrayList = null;
            }
            return aVar.a(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/s9$b", "Lun3/c;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements un3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ab4.c f156375a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156376a;

            static {
                int[] iArr = new int[za4.b.values().length];
                try {
                    iArr[za4.b.WITHIN_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[za4.b.EXCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f156376a = iArr;
            }
        }

        /* JADX INFO: renamed from: pc4.s9$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3871b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156377d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156379f;

            C3871b(tq.e<? super C3871b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156377d = obj;
                this.f156379f |= PKIFailureInfo.systemUnavail;
                return b.this.b(this);
            }
        }

        b(ab4.c cVar) {
            this.f156375a = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // un3.c
        public Object b(tq.e<? super Boolean> eVar) throws Throwable {
            C3871b c3871b;
            if (eVar instanceof C3871b) {
                c3871b = (C3871b) eVar;
                int i15 = c3871b.f156379f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3871b.f156379f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3871b = new C3871b(eVar);
                }
            } else {
                c3871b = new C3871b(eVar);
            }
            Object objA = c3871b.f156377d;
            Object objE = uq.b.e();
            int i16 = c3871b.f156379f;
            boolean z15 = true;
            if (i16 == 0) {
                oq.u.b(objA);
                ab4.c cVar = this.f156375a;
                c3871b.f156379f = 1;
                objA = cVar.a(c3871b);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            int i17 = a.f156376a[((za4.b) objA).ordinal()];
            if (i17 == 1) {
                z15 = false;
            } else if (i17 != 2) {
                throw new oq.p();
            }
            return vq.b.a(z15);
        }
    }

    private s9() {
    }

    public final bo3.a a(k24.c getCertificatePeselTicketUC, g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.b getCertKeyPairUC, k24.g getMainCertificateTypeUC, k24.d getCertificateTypeForParentDocumentUC, q34.t0 getGodfatherDocumentTypeUseCase, q34.u0 getIdentityTypeByDocumentTypeUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.c0 getBase64EncodedDocumentDataByScopeUseCase, w24.g0 getDocumentEncodedScopeUC, q34.g0 getDiiaChildrenDocumentsUseCase, w24.l1 getRefugeeCardDataUC, q34.h0 getDiiaDocumentUseCase, q34.r0 getEncodedBase64DocumentUseCase, w24.e0 getDocumentEncodedScopeByDocumentIdUC, w24.n1 getRefugeeChildrenCardDataUC, w24.m0 getDrivingLicenceDataUC, q34.m0 getDrivingLicenceDocumentsFromContainerUseCase, w24.x getAllDynamicDocumentsDataByTypeUC, w24.o0 getDynamicDocumentDataByTypeUC, w24.q0 getDynamicDocumentDataUC, w24.b1 getMultiDynamicDocumentDataByTypeUC, q34.p0 getDynamicMultiDocumentFromContainerUC, q34.b0 getAllByIdDynamicDocumentsFromContainerUC, q34.d0 getByIdDynamicDocumentFromContainerUC, q34.n0 getDynamicDocumentFromContainerUseCase, q34.o0 getDynamicDocumentMemberDocumentUC, q34.q0 getDynamicMultiDocumentMemberDocumentUC, ev1.a dynamicDocumentSchemaDecoder, ay.i jsonFieldParser, q34.s0 getFamilyCardDataUC, q34.d1 getUutCardDataUC, w24.j1 getRailwayCardDataUC, w24.s0 containersGetFamilyCardDataUC, q34.a1 getPwzNurseCardFromContainerUseCase, w24.z0 getMidwifeCardDataUC, w24.d1 getNurseCardDataUC) {
        return new a(isFeatureEnabledUseCase, getCertificatePeselTicketUC, identityManager, getCertKeyPairUC, getMainCertificateTypeUC, getCertificateTypeForParentDocumentUC, getGodfatherDocumentTypeUseCase, getIdentityTypeByDocumentTypeUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getDocumentEncodedScopeUC, getBase64EncodedDocumentDataByScopeUseCase, getDocumentEncodedScopeByDocumentIdUC, getEncodedBase64DocumentUseCase, getRefugeeCardDataUC, getDiiaDocumentUseCase, getRefugeeChildrenCardDataUC, getDiiaChildrenDocumentsUseCase, getDrivingLicenceDataUC, getDrivingLicenceDocumentsFromContainerUseCase, getMultiDynamicDocumentDataByTypeUC, getDynamicMultiDocumentFromContainerUC, getAllDynamicDocumentsDataByTypeUC, getAllByIdDynamicDocumentsFromContainerUC, dynamicDocumentSchemaDecoder, getDynamicDocumentDataByTypeUC, getDynamicDocumentFromContainerUseCase, getDynamicDocumentDataUC, getByIdDynamicDocumentFromContainerUC, getDynamicDocumentMemberDocumentUC, getDynamicMultiDocumentMemberDocumentUC, containersGetFamilyCardDataUC, getFamilyCardDataUC, getRailwayCardDataUC, getUutCardDataUC, getNurseCardDataUC, getMidwifeCardDataUC, getPwzNurseCardFromContainerUseCase, jsonFieldParser);
    }

    public final un3.c b(ab4.c handleFailedAttemptUseCase) {
        return new b(handleFailedAttemptUseCase);
    }
}
