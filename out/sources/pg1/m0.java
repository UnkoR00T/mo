package pg1;

import af1.PkdCodeMainSelectionContractData;
import bg1.CompanyShortNameContractData;
import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import df1.SocialInsuranceSelectionContractData;
import gf1.StatementContractData;
import jg1.CompanyManagementEntryPointContractData;
import ld1.KnownUserDataModel;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import lf1.TaxOfficeContractData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qg1.CompanySuspensionWizardData;
import rd1.EdorAddressData;
import rf1.CompanyDetailsContractData;
import st3.AddressFormData;
import vf1.EdorSectionStepResult;
import xe1.PkdCodeContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010$\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010$\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b0\u0010\u001fJ\u0017\u00102\u001a\u00020\u00182\u0006\u0010$\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010$\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00182\u0006\u0010$\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00182\u0006\u0010$\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00182\u0006\u0010$\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00182\u0006\u0010$\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00182\u0006\u0010$\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00182\u0006\u0010$\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR \u0010p\u001a\b\u0012\u0004\u0012\u00020k0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR \u0010s\u001a\b\u0012\u0004\u0012\u00020q0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010m\u001a\u0004\br\u0010oR\u001b\u0010y\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010~\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R+\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u007f8\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0012\u001a\t\u0012\u0004\u0012\u00020\u00130\u0085\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¢\u0001\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¥\u0001\u001a\u0004\u0018\u0001088VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¨\u0001\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0019\u0010¯\u0001\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010²\u0001\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0019\u0010µ\u0001\u001a\u0004\u0018\u00010Y8VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010\\8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010»\u0001\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006¼\u0001"}, d2 = {"Lpg1/m0;", "Ll00/g;", "Lpg1/g0;", "", "Lpg1/h0;", "Lpg1/f0;", "Lyy/a;", "stateMachineFactory", "Lrg1/b;", "mapper", "Lse1/b;", "dialogMapper", "Lqg1/b;", "nestedWizardDataSource", "Loa1/b;", "isCompanyEmailCollectingFFActiveUC", "<init>", "(Lyy/a;Lrg1/b;Lse1/b;Lqg1/b;Loa1/b;)V", "state", "Lpg1/h0$a;", "p9", "(Lpg1/g0;)Lpg1/h0$a;", "Lnf1/a;", "destination", "Loq/i0;", "B3", "(Lnf1/a;)V", "Lqg1/a;", "Q0", "()Lqg1/a;", "s9", "()V", "Lst3/d;", "f5", "()Lst3/d;", "Ljg1/d;", "data", "l5", "(Ljg1/d;)V", "Lrf1/b;", "t5", "(Lrf1/b;)V", "Lxe1/b;", "P1", "(Lxe1/b;)V", "Laf1/b;", "f0", "(Laf1/b;)V", "w4", "Lzd1/b;", "T2", "(Lzd1/b;)V", "Lrd1/c;", "answer", "y4", "(Lrd1/c;)V", "Lrd1/b;", "e6", "(Lrd1/b;)V", "Ldf1/b;", "p6", "(Ldf1/b;)V", "Lde1/f;", "K8", "(Lde1/f;)V", "Lld1/i;", "c8", "(Lld1/i;)V", "Lld1/r;", "F4", "(Lld1/r;)V", "Lde1/d;", "V3", "(Lde1/d;)V", "Lde1/b;", "Q3", "(Lde1/b;)V", "Lde1/c;", "M8", "(Lde1/c;)V", "Lde1/a;", "p4", "(Lde1/a;)V", "Llf1/b;", "j8", "(Llf1/b;)V", "Lbg1/b;", "B8", "(Lbg1/b;)V", "Ltf1/b;", "e1", "(Ltf1/b;)V", "Lgf1/b;", "l2", "(Lgf1/b;)V", "Ljg1/b;", "Z7", "(Ljg1/b;)V", "b", "Lrg1/b;", "c", "Lse1/b;", "d", "Lqg1/b;", "e", "Loa1/b;", "Lxw/b;", "Lpg1/f;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lpg1/g;", "g", "nestedNavAction", "", "h", "Loq/k;", "o9", "()Z", "companyNewContactEnabled", "j", "Lpg1/g0;", "getInitialState", "()Lpg1/g0;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lld1/l;", "m", "Lld1/l;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lld1/l;", "processType", "L0", "()Lrf1/b;", "companyDetails", "a8", "()Ljg1/d;", "suspensionPeriodData", "Lld1/h;", "q", "()Lld1/h;", "knownUserData", "j0", "()Lxe1/b;", "pkdCodeContractData", "k4", "()Laf1/b;", "pkdCodeMainSelectionContractData", "r", "()Lzd1/b;", "homeAddressData", "E1", "()Lrd1/b;", "edorAddressData", "C4", "()Ldf1/b;", "selectedSocialInsurance", "Lde1/e;", "m3", "()Lde1/e;", "krusData", "I6", "()Llf1/b;", "taxOfficeData", "A5", "()Lbg1/b;", "shortNameData", "N0", "()Ltf1/b;", "contactInfoData", "i5", "()Lgf1/b;", "statement", "f1", "()Ljg1/b;", "companyManagementEntryPointContract", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 extends l00.g<State, Object> implements h0, f0, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rg1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final se1.b dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qg1.b nestedWizardDataSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oa1.b isCompanyEmailCollectingFFActiveUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pg1.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pg1.g> nestedNavAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k companyNewContactEnabled = oq.l.a(new er.a() { // from class: pg1.i0
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(m0.n9(this.f157335a));
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<h0.Data> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ld1.l processType;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h0.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f157354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f157355b;

        /* JADX INFO: renamed from: pg1.m0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3894a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f157356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f157357b;

            /* JADX INFO: renamed from: pg1.m0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3895a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f157358d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f157359e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f157360f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f157362h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f157363j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f157364k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f157365l;

                public C3895a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f157358d = obj;
                    this.f157359e |= PKIFailureInfo.systemUnavail;
                    return C3894a.this.F(null, this);
                }
            }

            public C3894a(mu.h hVar, m0 m0Var) {
                this.f157356a = hVar;
                this.f157357b = m0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3895a c3895a;
                if (eVar instanceof C3895a) {
                    c3895a = (C3895a) eVar;
                    int i15 = c3895a.f157359e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3895a.f157359e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3895a = new C3895a(eVar);
                    }
                } else {
                    c3895a = new C3895a(eVar);
                }
                Object obj2 = c3895a.f157358d;
                Object objE = uq.b.e();
                int i16 = c3895a.f157359e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f157356a;
                    h0.Data dataP9 = this.f157357b.p9((State) obj);
                    c3895a.f157360f = vq.j.a(obj);
                    c3895a.f157362h = vq.j.a(c3895a);
                    c3895a.f157363j = vq.j.a(obj);
                    c3895a.f157364k = vq.j.a(hVar);
                    c3895a.f157365l = 0;
                    c3895a.f157359e = 1;
                    if (hVar.F(dataP9, c3895a) == objE) {
                        return objE;
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

        public a(mu.g gVar, m0 m0Var) {
            this.f157354a = gVar;
            this.f157355b = m0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super h0.Data> hVar, tq.e eVar) {
            Object objA = this.f157354a.a(new C3894a(hVar, this.f157355b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/a0;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/a0;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<SaveSuspensionPeriod, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157367f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveSuspensionPeriod saveSuspensionPeriod = (SaveSuspensionPeriod) this.f157367f;
            uq.b.e();
            if (this.f157366e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.q.f135745a, new jg1.e(saveSuspensionPeriod.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSuspensionPeriod saveSuspensionPeriod, State state, tq.e<? super oq.i0> eVar) {
            a0 a0Var = m0.this.new a0(eVar);
            a0Var.f157367f = saveSuspensionPeriod;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/n;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/n;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SaveHomeAddress, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157370f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveHomeAddress saveHomeAddress = (SaveHomeAddress) this.f157370f;
            uq.b.e();
            if (this.f157369e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.g.f135725a, new wf1.a(saveHomeAddress.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveHomeAddress saveHomeAddress, State state, tq.e<? super oq.i0> eVar) {
            b bVar = m0.this.new b(eVar);
            bVar.f157370f = saveHomeAddress;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/m;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/m;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SaveEdorAddressSelectionAnswer, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157373f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            EdorAddressData edorAddressData;
            SaveEdorAddressSelectionAnswer saveEdorAddressSelectionAnswer = (SaveEdorAddressSelectionAnswer) this.f157373f;
            uq.b.e();
            if (this.f157372e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.e eVar = nf1.a.e.f135721a;
            EdorAddressData edorAddressData2 = (EdorAddressData) bVar.b(eVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (edorAddressData2 == null || (edorAddressData = EdorAddressData.b(edorAddressData2, saveEdorAddressSelectionAnswer.getData(), null, null, 6, null)) == null) {
                edorAddressData = new EdorAddressData(saveEdorAddressSelectionAnswer.getData(), null, null, 6, null);
            }
            bVar2.a(eVar, new EdorSectionStepResult(edorAddressData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveEdorAddressSelectionAnswer saveEdorAddressSelectionAnswer, State state, tq.e<? super oq.i0> eVar) {
            c cVar = m0.this.new c(eVar);
            cVar.f157373f = saveEdorAddressSelectionAnswer;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/l;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/l;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SaveEdorAddressData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157376f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveEdorAddressData saveEdorAddressData = (SaveEdorAddressData) this.f157376f;
            uq.b.e();
            if (this.f157375e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.e.f135721a, new EdorSectionStepResult(saveEdorAddressData.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveEdorAddressData saveEdorAddressData, State state, tq.e<? super oq.i0> eVar) {
            d dVar = m0.this.new d(eVar);
            dVar.f157376f = saveEdorAddressData;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/y;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/y;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SaveSocialInsuranceSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157379f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveSocialInsuranceSelection saveSocialInsuranceSelection = (SaveSocialInsuranceSelection) this.f157379f;
            uq.b.e();
            if (this.f157378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.m.f135737a, new dg1.a(saveSocialInsuranceSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSocialInsuranceSelection saveSocialInsuranceSelection, State state, tq.e<? super oq.i0> eVar) {
            e eVar2 = m0.this.new e(eVar);
            eVar2.f157379f = saveSocialInsuranceSelection;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/s;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/s;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SaveKrusIncomeTaxExceededInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157382f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededInfo saveKrusIncomeTaxExceededInfo = (SaveKrusIncomeTaxExceededInfo) this.f157382f;
            uq.b.e();
            if (this.f157381e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, saveKrusIncomeTaxExceededInfo.getData(), null, null, null, null, null, 125, null)) == null) {
                krusData = new KrusData(null, saveKrusIncomeTaxExceededInfo.getData(), null, null, null, null, null, 125, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededInfo saveKrusIncomeTaxExceededInfo, State state, tq.e<? super oq.i0> eVar) {
            f fVar = m0.this.new f(eVar);
            fVar.f157382f = saveKrusIncomeTaxExceededInfo;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/q;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/q;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<SaveKrusIncomeTaxExceededCertificate, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157385f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededCertificate saveKrusIncomeTaxExceededCertificate = (SaveKrusIncomeTaxExceededCertificate) this.f157385f;
            uq.b.e();
            if (this.f157384e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, saveKrusIncomeTaxExceededCertificate.getData(), null, null, 111, null)) == null) {
                krusData = new KrusData(null, null, null, null, saveKrusIncomeTaxExceededCertificate.getData(), null, null, 111, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededCertificate saveKrusIncomeTaxExceededCertificate, State state, tq.e<? super oq.i0> eVar) {
            g gVar = m0.this.new g(eVar);
            gVar.f157385f = saveKrusIncomeTaxExceededCertificate;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/r;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/r;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<SaveKrusIncomeTaxExceededCertificateInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157388f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededCertificateInfo saveKrusIncomeTaxExceededCertificateInfo = (SaveKrusIncomeTaxExceededCertificateInfo) this.f157388f;
            uq.b.e();
            if (this.f157387e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, null, saveKrusIncomeTaxExceededCertificateInfo.getData(), null, 95, null)) == null) {
                krusData = new KrusData(null, null, null, null, null, saveKrusIncomeTaxExceededCertificateInfo.getData(), null, 95, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededCertificateInfo saveKrusIncomeTaxExceededCertificateInfo, State state, tq.e<? super oq.i0> eVar) {
            h hVar = m0.this.new h(eVar);
            hVar.f157388f = saveKrusIncomeTaxExceededCertificateInfo;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/u;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/u;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<SaveKrusQuestionsAnswers, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157391f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusQuestionsAnswers saveKrusQuestionsAnswers = (SaveKrusQuestionsAnswers) this.f157391f;
            uq.b.e();
            if (this.f157390e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, saveKrusQuestionsAnswers.getData(), null, null, null, null, null, null, 126, null)) == null) {
                krusData = new KrusData(saveKrusQuestionsAnswers.getData(), null, null, null, null, null, null, 126, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusQuestionsAnswers saveKrusQuestionsAnswers, State state, tq.e<? super oq.i0> eVar) {
            i iVar = m0.this.new i(eVar);
            iVar.f157391f = saveKrusQuestionsAnswers;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/t;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/t;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<SaveKrusOfficeSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157394f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusOfficeSelection saveKrusOfficeSelection = (SaveKrusOfficeSelection) this.f157394f;
            uq.b.e();
            if (this.f157393e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, saveKrusOfficeSelection.getData(), null, null, null, null, 123, null)) == null) {
                krusData = new KrusData(null, null, saveKrusOfficeSelection.getData(), null, null, null, null, 123, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusOfficeSelection saveKrusOfficeSelection, State state, tq.e<? super oq.i0> eVar) {
            j jVar = m0.this.new j(eVar);
            jVar.f157394f = saveKrusOfficeSelection;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/c0;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/c0;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<SaveTaxOfficeSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157397f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveTaxOfficeSelection saveTaxOfficeSelection = (SaveTaxOfficeSelection) this.f157397f;
            uq.b.e();
            if (this.f157396e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, saveTaxOfficeSelection.getData(), null, null, null, 119, null)) == null) {
                krusData = new KrusData(null, null, null, saveTaxOfficeSelection.getData(), null, null, null, 119, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveTaxOfficeSelection saveTaxOfficeSelection, State state, tq.e<? super oq.i0> eVar) {
            k kVar = m0.this.new k(eVar);
            kVar.f157397f = saveTaxOfficeSelection;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpg1/e0;", "action", "Lk10/c0;", "Lpg1/g0;", "state", "Lk10/l;", "<anonymous>", "(Lpg1/e0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<StepChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f157401g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(StepChanged stepChanged, State state) {
            return state.a(stepChanged.getDestination());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final StepChanged stepChanged = (StepChanged) this.f157400f;
            k10.c0 c0Var = (k10.c0) this.f157401g;
            uq.b.e();
            if (this.f157399e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: pg1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.l.O(stepChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(StepChanged stepChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f157400f = stepChanged;
            lVar.f157401g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/p;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/p;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<SaveKrusIncomeTaxExceededAddFile, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157403f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededAddFile saveKrusIncomeTaxExceededAddFile = (SaveKrusIncomeTaxExceededAddFile) this.f157403f;
            uq.b.e();
            if (this.f157402e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            qg1.b bVar = m0.this.nestedWizardDataSource;
            nf1.a.h hVar = nf1.a.h.f135727a;
            KrusData krusData2 = (KrusData) bVar.b(hVar);
            qg1.b bVar2 = m0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, null, null, saveKrusIncomeTaxExceededAddFile.getData(), 63, null)) == null) {
                krusData = new KrusData(null, null, null, null, null, null, saveKrusIncomeTaxExceededAddFile.getData(), 63, null);
            }
            bVar2.a(hVar, new xf1.a(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededAddFile saveKrusIncomeTaxExceededAddFile, State state, tq.e<? super oq.i0> eVar) {
            m mVar = m0.this.new m(eVar);
            mVar.f157403f = saveKrusIncomeTaxExceededAddFile;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/o;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/o;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<SaveKrusData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157406f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveKrusData saveKrusData = (SaveKrusData) this.f157406f;
            uq.b.e();
            if (this.f157405e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.h.f135727a, new xf1.a(saveKrusData.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusData saveKrusData, State state, tq.e<? super oq.i0> eVar) {
            n nVar = m0.this.new n(eVar);
            nVar.f157406f = saveKrusData;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/b0;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/b0;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<SaveTaxOffice, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157409f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveTaxOffice saveTaxOffice = (SaveTaxOffice) this.f157409f;
            uq.b.e();
            if (this.f157408e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.C3352a.f135713a, new lg1.a(saveTaxOffice.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveTaxOffice saveTaxOffice, State state, tq.e<? super oq.i0> eVar) {
            o oVar = m0.this.new o(eVar);
            oVar.f157409f = saveTaxOffice;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/x;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/x;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<SaveShortName, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157412f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveShortName saveShortName = (SaveShortName) this.f157412f;
            uq.b.e();
            if (this.f157411e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.l.f135735a, new bg1.c(saveShortName.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveShortName saveShortName, State state, tq.e<? super oq.i0> eVar) {
            p pVar = m0.this.new p(eVar);
            pVar.f157412f = saveShortName;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/k;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/k;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<SaveContactInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157415f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveContactInfo saveContactInfo = (SaveContactInfo) this.f157415f;
            uq.b.e();
            if (this.f157414e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.d.f135719a, new tf1.c(saveContactInfo.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveContactInfo saveContactInfo, State state, tq.e<? super oq.i0> eVar) {
            q qVar = m0.this.new q(eVar);
            qVar.f157415f = saveContactInfo;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/z;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/z;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<SaveStatement, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157418f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveStatement saveStatement = (SaveStatement) this.f157418f;
            uq.b.e();
            if (this.f157417e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.n.f135739a, new eg1.a(saveStatement.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveStatement saveStatement, State state, tq.e<? super oq.i0> eVar) {
            r rVar = m0.this.new r(eVar);
            rVar.f157418f = saveStatement;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/j;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/j;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<SaveCompanyManagementEntryPoint, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157421f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveCompanyManagementEntryPoint saveCompanyManagementEntryPoint = (SaveCompanyManagementEntryPoint) this.f157421f;
            uq.b.e();
            if (this.f157420e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.r.f135747a, new ng1.a(saveCompanyManagementEntryPoint.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCompanyManagementEntryPoint saveCompanyManagementEntryPoint, State state, tq.e<? super oq.i0> eVar) {
            s sVar = m0.this.new s(eVar);
            sVar.f157421f = saveCompanyManagementEntryPoint;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpg1/e;", "<unused var>", "Lpg1/g0;", "Loq/i0;", "<anonymous>", "(Lpg1/e;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<pg1.e, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157423e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157423e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<pg1.f> bVarY1 = m0.this.Y1();
                pg1.f.a aVar = pg1.f.a.f157327a;
                this.f157423e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg1.e eVar, State state, tq.e<? super oq.i0> eVar2) {
            return m0.this.new t(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/d;", "<unused var>", "Lpg1/g0;", "state", "Loq/i0;", "<anonymous>", "(Lpg1/d;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<pg1.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157426f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f157428a;

            static {
                int[] iArr = new int[ma1.l.values().length];
                try {
                    iArr[ma1.l.RESUME_COMPANY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f157428a = iArr;
            }
        }

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r8.F(r2, r7) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            if (r8.F(r2, r7) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        
            if (r8.F(r2, r7) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r8.F(r2, r7) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f157426f
                pg1.g0 r0 = (pg1.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f157425e
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L26
                if (r2 == r6) goto L21
                if (r2 == r5) goto L21
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                oq.u.b(r8)
                goto Lb5
            L26:
                oq.u.b(r8)
                nf1.a r8 = r0.getCurrentStep()
                nf1.a$r r2 = nf1.a.r.f135747a
                boolean r2 = fr.t.c(r8, r2)
                if (r2 == 0) goto L4c
                pg1.m0 r8 = pg1.m0.this
                xw.b r8 = r8.Y1()
                pg1.f$a r2 = pg1.f.a.f157327a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f157426f = r0
                r7.f157425e = r6
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb5
                goto Lb4
            L4c:
                nf1.a$q r2 = nf1.a.q.f135745a
                boolean r8 = fr.t.c(r8, r2)
                if (r8 == 0) goto L9e
                pg1.m0 r8 = pg1.m0.this
                jg1.b r8 = r8.f1()
                if (r8 == 0) goto L61
                ma1.l r8 = r8.getEntryPoint()
                goto L62
            L61:
                r8 = 0
            L62:
                if (r8 != 0) goto L66
                r8 = -1
                goto L6e
            L66:
                int[] r2 = pg1.m0.u.a.f157428a
                int r8 = r8.ordinal()
                r8 = r2[r8]
            L6e:
                if (r8 != r6) goto L87
                pg1.m0 r8 = pg1.m0.this
                xw.b r8 = r8.Y1()
                pg1.f$a r2 = pg1.f.a.f157327a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f157426f = r0
                r7.f157425e = r5
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb5
                goto Lb4
            L87:
                pg1.m0 r8 = pg1.m0.this
                xw.b r8 = r8.g()
                pg1.g$a r2 = pg1.g.a.f157329a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f157426f = r0
                r7.f157425e = r4
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb5
                goto Lb4
            L9e:
                pg1.m0 r8 = pg1.m0.this
                xw.b r8 = r8.g()
                pg1.g$a r2 = pg1.g.a.f157329a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f157426f = r0
                r7.f157425e = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto Lb5
            Lb4:
                return r1
            Lb5:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pg1.m0.u.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg1.d dVar, State state, tq.e<? super oq.i0> eVar) {
            u uVar = m0.this.new u(eVar);
            uVar.f157426f = state;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/d0;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/d0;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ShowDialog, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157430f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowDialog showDialog = (ShowDialog) this.f157430f;
            Object objE = uq.b.e();
            int i15 = this.f157429e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<pg1.f> bVarY1 = m0.this.Y1();
                pg1.f.ShowDialog showDialog2 = new pg1.f.ShowDialog(m0.this.dialogMapper.b(showDialog.getDialogType()));
                this.f157430f = vq.j.a(showDialog);
                this.f157429e = 1;
                if (bVarY1.F(showDialog2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, State state, tq.e<? super oq.i0> eVar) {
            v vVar = m0.this.new v(eVar);
            vVar.f157430f = showDialog;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/i;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/i;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<SaveCompanyDetails, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157433f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveCompanyDetails saveCompanyDetails = (SaveCompanyDetails) this.f157433f;
            uq.b.e();
            if (this.f157432e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.c.f135717a, new rf1.c(saveCompanyDetails.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCompanyDetails saveCompanyDetails, State state, tq.e<? super oq.i0> eVar) {
            w wVar = m0.this.new w(eVar);
            wVar.f157433f = saveCompanyDetails;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/w;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/w;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<SavePkdCodes, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157436f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SavePkdCodes savePkdCodes = (SavePkdCodes) this.f157436f;
            uq.b.e();
            if (this.f157435e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.i.f135729a, new yf1.a(savePkdCodes.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePkdCodes savePkdCodes, State state, tq.e<? super oq.i0> eVar) {
            x xVar = m0.this.new x(eVar);
            xVar.f157436f = savePkdCodes;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg1/v;", "action", "Lpg1/g0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg1/v;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<SavePkdCodeMainSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157439f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SavePkdCodeMainSelection savePkdCodeMainSelection = (SavePkdCodeMainSelection) this.f157439f;
            uq.b.e();
            if (this.f157438e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.a(nf1.a.j.f135731a, new zf1.a(savePkdCodeMainSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePkdCodeMainSelection savePkdCodeMainSelection, State state, tq.e<? super oq.i0> eVar) {
            y yVar = m0.this.new y(eVar);
            yVar.f157439f = savePkdCodeMainSelection;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpg1/h;", "<unused var>", "Lpg1/g0;", "Loq/i0;", "<anonymous>", "(Lpg1/h;Lpg1/g0;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<pg1.h, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157441e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f157441e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.nestedWizardDataSource.d(nf1.a.j.f135731a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg1.h hVar, State state, tq.e<? super oq.i0> eVar) {
            return m0.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public m0(yy.a aVar, rg1.b bVar, se1.b bVar2, qg1.b bVar3, oa1.b bVar4) {
        this.mapper = bVar;
        this.dialogMapper = bVar2;
        this.nestedWizardDataSource = bVar3;
        this.isCompanyEmailCollectingFFActiveUC = bVar4;
        State state = new State(nf1.a.r.f135747a);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: pg1.j0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.t9(this.f157337a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(state));
        this.processType = ld1.l.MANAGEMENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n9(m0 m0Var) {
        return m0Var.isCompanyEmailCollectingFFActiveUC.b(gz.b.a.C1792a.f78542a).booleanValue();
    }

    private final boolean o9() {
        return ((Boolean) this.companyNewContactEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0.Data p9(State state) {
        return this.mapper.b(new rg1.b.Params(state, b9(pg1.d.f157323a), b9(pg1.e.f157325a), new er.l() { // from class: pg1.k0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.q9(this.f157339a, (se1.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q9(m0 m0Var, se1.c cVar) {
        m0Var.d9(new ShowDialog(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t9(final m0 m0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: pg1.l0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.u9(this.f157341a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(m0 m0Var, k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(StepChanged.class), oVar, lVar);
        zVar.x(fr.q0.c(pg1.e.class), oVar, m0Var.new t(null));
        zVar.x(fr.q0.c(pg1.d.class), oVar, m0Var.new u(null));
        zVar.x(fr.q0.c(ShowDialog.class), oVar, m0Var.new v(null));
        zVar.x(fr.q0.c(SaveCompanyDetails.class), oVar, m0Var.new w(null));
        zVar.x(fr.q0.c(SavePkdCodes.class), oVar, m0Var.new x(null));
        zVar.x(fr.q0.c(SavePkdCodeMainSelection.class), oVar, m0Var.new y(null));
        zVar.x(fr.q0.c(pg1.h.class), oVar, m0Var.new z(null));
        zVar.x(fr.q0.c(SaveSuspensionPeriod.class), oVar, m0Var.new a0(null));
        zVar.x(fr.q0.c(SaveHomeAddress.class), oVar, m0Var.new b(null));
        zVar.x(fr.q0.c(SaveEdorAddressSelectionAnswer.class), oVar, m0Var.new c(null));
        zVar.x(fr.q0.c(SaveEdorAddressData.class), oVar, m0Var.new d(null));
        zVar.x(fr.q0.c(SaveSocialInsuranceSelection.class), oVar, m0Var.new e(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededInfo.class), oVar, m0Var.new f(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededCertificate.class), oVar, m0Var.new g(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededCertificateInfo.class), oVar, m0Var.new h(null));
        zVar.x(fr.q0.c(SaveKrusQuestionsAnswers.class), oVar, m0Var.new i(null));
        zVar.x(fr.q0.c(SaveKrusOfficeSelection.class), oVar, m0Var.new j(null));
        zVar.x(fr.q0.c(SaveTaxOfficeSelection.class), oVar, m0Var.new k(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededAddFile.class), oVar, m0Var.new m(null));
        zVar.x(fr.q0.c(SaveKrusData.class), oVar, m0Var.new n(null));
        zVar.x(fr.q0.c(SaveTaxOffice.class), oVar, m0Var.new o(null));
        zVar.x(fr.q0.c(SaveShortName.class), oVar, m0Var.new p(null));
        zVar.x(fr.q0.c(SaveContactInfo.class), oVar, m0Var.new q(null));
        zVar.x(fr.q0.c(SaveStatement.class), oVar, m0Var.new r(null));
        zVar.x(fr.q0.c(SaveCompanyManagementEntryPoint.class), oVar, m0Var.new s(null));
        return oq.i0.f148189a;
    }

    @Override // bg1.a
    public CompanyShortNameContractData A5() {
        return (CompanyShortNameContractData) this.nestedWizardDataSource.b(nf1.a.l.f135735a);
    }

    @Override // pg1.f0
    public void B3(nf1.a destination) {
        d9(new StepChanged(destination));
    }

    @Override // bg1.a
    public void B8(CompanyShortNameContractData data) {
        d9(new SaveShortName(data));
    }

    @Override // df1.a
    public SocialInsuranceSelectionContractData C4() {
        return (SocialInsuranceSelectionContractData) this.nestedWizardDataSource.b(nf1.a.m.f135737a);
    }

    @Override // od1.a
    public EdorAddressData E1() {
        return (EdorAddressData) this.nestedWizardDataSource.b(nf1.a.e.f135721a);
    }

    @Override // ce1.a
    public void F4(TaxOfficeModel data) {
        d9(new SaveTaxOfficeSelection(data));
    }

    @Override // od1.a
    /* JADX INFO: renamed from: H, reason: from getter */
    public ld1.l getProcessType() {
        return this.processType;
    }

    @Override // lf1.a
    public TaxOfficeContractData I6() {
        return (TaxOfficeContractData) this.nestedWizardDataSource.b(nf1.a.C3352a.f135713a);
    }

    @Override // ce1.a
    public void K8(SocialInsuranceQuestions data) {
        d9(new SaveKrusQuestionsAnswers(data));
    }

    @Override // rf1.a
    public CompanyDetailsContractData L0() {
        return (CompanyDetailsContractData) this.nestedWizardDataSource.b(nf1.a.c.f135717a);
    }

    @Override // ce1.a
    public void M8(de1.c data) {
        d9(new SaveKrusIncomeTaxExceededCertificateInfo(data));
    }

    @Override // tf1.a
    public tf1.b N0() {
        return (tf1.b) this.nestedWizardDataSource.b(nf1.a.d.f135719a);
    }

    @Override // xe1.a
    public void P1(PkdCodeContractData data) {
        d9(new SavePkdCodes(data));
    }

    @Override // pg1.f0
    public CompanySuspensionWizardData Q0() {
        return CompanySuspensionWizardData.b(this.nestedWizardDataSource.e(), null, null, null, null, null, null, null, null, null, null, null, null, o9(), 4095, null);
    }

    @Override // ce1.a
    public void Q3(de1.b data) {
        d9(new SaveKrusIncomeTaxExceededCertificate(data));
    }

    @Override // zd1.a
    public void T2(HomeAddressContractData data) {
        d9(new SaveHomeAddress(data));
    }

    @Override // ce1.a
    public void V3(de1.d data) {
        d9(new SaveKrusIncomeTaxExceededInfo(data));
    }

    @Override // zx.b
    public xw.b<pg1.f> Y1() {
        return this.navAction;
    }

    @Override // jg1.a
    public void Z7(CompanyManagementEntryPointContractData data) {
        d9(new SaveCompanyManagementEntryPoint(data));
    }

    @Override // jg1.c
    public jg1.d a8() {
        return (jg1.d) this.nestedWizardDataSource.b(nf1.a.q.f135745a);
    }

    @Override // ce1.a
    public void c8(KrusOfficeModel data) {
        d9(new SaveKrusOfficeSelection(data));
    }

    @Override // tf1.a
    public void e1(tf1.b data) {
        d9(new SaveContactInfo(data));
    }

    @Override // od1.a
    public void e6(EdorAddressData data) {
        d9(new SaveEdorAddressData(data));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // xe1.a, af1.a
    public void f0(PkdCodeMainSelectionContractData data) {
        d9(new SavePkdCodeMainSelection(data));
    }

    @Override // jg1.c
    public CompanyManagementEntryPointContractData f1() {
        return (CompanyManagementEntryPointContractData) this.nestedWizardDataSource.b(nf1.a.r.f135747a);
    }

    @Override // pg1.f0
    public AddressFormData f5() {
        return this.mapper.e();
    }

    @Override // pg1.f0
    public xw.b<pg1.g> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public mu.p0<h0.Data> getState() {
        return this.state;
    }

    @Override // gf1.a
    public StatementContractData i5() {
        return (StatementContractData) this.nestedWizardDataSource.b(nf1.a.n.f135739a);
    }

    @Override // xe1.a, af1.a
    public PkdCodeContractData j0() {
        return (PkdCodeContractData) this.nestedWizardDataSource.b(nf1.a.i.f135729a);
    }

    @Override // lf1.a
    public void j8(TaxOfficeContractData data) {
        d9(new SaveTaxOffice(data));
    }

    @Override // af1.a
    public PkdCodeMainSelectionContractData k4() {
        return (PkdCodeMainSelectionContractData) this.nestedWizardDataSource.b(nf1.a.j.f135731a);
    }

    @Override // gf1.a
    public void l2(StatementContractData data) {
        d9(new SaveStatement(data));
    }

    @Override // jg1.c
    public void l5(jg1.d data) {
        d9(new SaveSuspensionPeriod(data));
    }

    @Override // ce1.a
    public KrusData m3() {
        return (KrusData) this.nestedWizardDataSource.b(nf1.a.h.f135727a);
    }

    @Override // ce1.a
    public void p4(IncomeTaxExceededAddFileModel data) {
        d9(new SaveKrusIncomeTaxExceededAddFile(data));
    }

    @Override // df1.a
    public void p6(SocialInsuranceSelectionContractData data) {
        d9(new SaveSocialInsuranceSelection(data));
    }

    @Override // zd1.a, fc1.a, zb1.a, lc1.a, sb1.a
    public KnownUserDataModel q() {
        jg1.d dVarA8 = a8();
        if (dVarA8 != null) {
            return dVarA8.getKnownUserDataModel();
        }
        return null;
    }

    @Override // zd1.a, cc1.a, zb1.a, lc1.a, sb1.a
    public HomeAddressContractData r() {
        return (HomeAddressContractData) this.nestedWizardDataSource.b(nf1.a.g.f135725a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(h0.Data data) {
        super.P5(data);
    }

    public void s9() {
        d9(new ShowDialog(new se1.c.Close(b9(pg1.e.f157325a))));
    }

    @Override // jg1.c
    public void t5(CompanyDetailsContractData data) {
        d9(new SaveCompanyDetails(data));
    }

    @Override // xe1.a
    public void w4() {
        d9(pg1.h.f157331a);
    }

    @Override // od1.a
    public void y4(rd1.c answer) {
        d9(new SaveEdorAddressSelectionAnswer(answer));
    }
}
