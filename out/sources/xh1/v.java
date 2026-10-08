package xh1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import ch1.f0;
import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B«\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J \u0010:\u001a\u0002012\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J\u0013\u0010=\u001a\u00020<*\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000201H\u0002¢\u0006\u0004\b?\u00105J&\u0010D\u001a\u0002012\f\u0010A\u001a\b\u0012\u0004\u0012\u0002010@2\u0006\u0010C\u001a\u00020BH\u0082@¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u0002012\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020JH\u0002¢\u0006\u0004\bN\u0010LJ\u000f\u0010O\u001a\u00020JH\u0002¢\u0006\u0004\bO\u0010LJ\u000f\u0010P\u001a\u00020JH\u0002¢\u0006\u0004\bP\u0010LJ\u000f\u0010Q\u001a\u00020JH\u0002¢\u0006\u0004\bQ\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR!\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002080{8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR3\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0081\u00018\u0014X\u0094\u0004¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u00105\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020<0\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, d2 = {"Lxh1/v;", "Ll00/g;", "Lxh1/c;", "Lxh1/a;", "Lxh1/d;", "", "Lyy/a;", "stateMachineFactory", "Lyh1/b;", "mapper", "Lmx/c;", "labelProvider", "Lch1/f0;", "isContactDetailsRegistryFeatureFlagActiveUseCase", "Lib4/c;", "genericDomainErrorHandler", "Lc21/a;", "isChatBotFeatureFlagActiveUseCase", "Lf01/a;", "isAppRatingFeatureFlagActiveUC", "Lip3/a;", "isVoteIdeaFeatureFlagActiveUC", "Lq34/p1;", "loadCachedAddedDocumentsInfoUC", "Lg04/f;", "checkBiometricRequirementsUseCase", "Lg04/e;", "checkBiometricActivatedUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "Lv64/l;", "deactivateAppUseCase", "Lay/k;", "networkConnectionManager", "Lch1/r;", "getDocumentCertificateExpiredUseCase", "Lch1/a;", "checkFeatureTemporaryInterruptionUC", "Lyg1/a;", "dashboardContainersInteractor", "Lyg1/b;", "dashboardMobileInteractor", "Lyg1/d;", "dashboardUserDataInteractor", "Lxh1/b;", "contract", "<init>", "(Lyy/a;Lyh1/b;Lmx/c;Lch1/f0;Lib4/c;Lc21/a;Lf01/a;Lip3/a;Lq34/p1;Lg04/f;Lg04/e;Lg04/g;Lv64/l;Lay/k;Lch1/r;Lch1/a;Lyg1/a;Lyg1/b;Lyg1/d;Lxh1/b;)V", "data", "Loq/i0;", "ia", "(Lxh1/b;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()V", "Liq0/v;", "featureType", "Lxh1/a$s;", "navigateAction", "ha", "(Liq0/v;Lxh1/a$s;Ltq/e;)Ljava/lang/Object;", "Lxh1/d$a;", "la", "(Lxh1/c;)Lxh1/d$a;", "ea", "Lkotlin/Function0;", "resultAction", "Ldx/b;", "domainError", "fa", "(Ler/a;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lt64/a;", "deactivationType", "O9", "(Lt64/a;)V", "Lcb4/d;", "aa", "()Lcb4/d;", "S9", "V9", "Q9", "ca", "Y9", "b", "Lyh1/b;", "c", "Lmx/c;", "d", "Lch1/f0;", "e", "Lib4/c;", "f", "Lc21/a;", "g", "Lf01/a;", "h", "Lip3/a;", "j", "Lq34/p1;", "k", "Lg04/f;", "l", "Lg04/e;", "m", "Lg04/g;", "n", "Lv64/l;", "p", "Lay/k;", "q", "Lch1/r;", "r", "Lch1/a;", "s", "Lyg1/a;", "t", "Lyg1/b;", "v", "Lyg1/d;", "w", "Lxh1/b;", "x", "Lxh1/c;", "initialState", "Lxw/b;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "z", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lmu/p0;", "A", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State, xh1.a> implements xh1.d, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final p0<xh1.d.Data> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yh1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0 isContactDetailsRegistryFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c21.a isChatBotFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f01.a isAppRatingFeatureFlagActiveUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ip3.a isVoteIdeaFeatureFlagActiveUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 loadCachedAddedDocumentsInfoUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g04.f checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final g04.e checkBiometricActivatedUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final v64.l deactivateAppUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ch1.r getDocumentCertificateExpiredUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ch1.a checkFeatureTemporaryInterruptionUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final yg1.b dashboardMobileInteractor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final yg1.d dashboardUserDataInteractor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final SetupData contract;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xh1.a.s> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, xh1.a> stateMachine;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218806e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218806e;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.d dVar = v.this.dashboardUserDataInteractor;
                this.f218806e = 1;
                obj = dVar.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            boolean z15 = ((Boolean) obj).booleanValue() || v.this.dashboardMobileInteractor.a();
            if (z15) {
                v.this.d9(xh1.a.o.f218733a);
            } else {
                if (z15) {
                    throw new oq.p();
                }
                v.this.d9(xh1.a.x.f218762a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxh1/a$g;", "action", "Lxh1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxh1/a$g;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<xh1.a.GoToChangePassword, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f218809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f218811h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f218812j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f218813k;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x0068 A[PHI: r8
          0x0068: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:18:0x0064, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0070  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:35:0x0106  */
        /* JADX WARN: Code duplicated, block: B:37:0x010c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x010e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0129  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r2.fa(r5, r3, r7) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
        
            if (r5.F(r6, r7) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
        
            if (r2.F(r5, r7) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
        
            if (r8.F(r2, r7) == r1) goto L40;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xh1.v.a0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.GoToChangePassword goToChangePassword, State state, tq.e<? super i0> eVar) {
            a0 a0Var = v.this.new a0(eVar);
            a0Var.f218813k = goToChangePassword;
            return a0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f218815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f218817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f218818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f218819h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f218820j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f218821k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f218823m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f218821k = obj;
            this.f218823m |= PKIFailureInfo.systemUnavail;
            return v.this.ha(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$t;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$t;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<xh1.a.t, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f218825f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f218827h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f218828j;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        
            if (r1.fa(r4, r2, r6) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
        
            if (r1.F(r4, r6) == r0) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f218828j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f218825f
                e04.e r0 = (e04.e) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f218825f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r6.f218824e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto Laf
            L2b:
                oq.u.b(r7)
                goto L46
            L2f:
                oq.u.b(r7)
                xh1.v r7 = xh1.v.this
                g04.g r7 = xh1.v.x9(r7)
                g04.g$a r1 = new g04.g$a
                r1.<init>(r4)
                r6.f218828j = r4
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L46
                goto La5
            L46:
                dx.i r7 = (dx.i) r7
                xh1.v r1 = xh1.v.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L76
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                xh1.z r4 = new xh1.z
                r4.<init>()
                java.lang.Object r7 = vq.j.a(r7)
                r6.f218824e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f218825f = r7
                r6.f218826g = r5
                r6.f218827h = r5
                r6.f218828j = r3
                java.lang.Object r7 = xh1.v.L9(r1, r4, r2, r6)
                if (r7 != r0) goto Laf
                goto La5
            L76:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto Lb8
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                e04.e r3 = (e04.e) r3
                boolean r4 = r3 instanceof e04.e.b
                if (r4 == 0) goto La6
                xw.b r1 = r1.Y1()
                xh1.a$s$h r4 = xh1.a.s.h.f218744a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f218824e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f218825f = r7
                r6.f218826g = r5
                r6.f218827h = r5
                r6.f218828j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto Laf
            La5:
                return r0
            La6:
                boolean r7 = r3 instanceof e04.e.a
                if (r7 == 0) goto Lb2
                xh1.a$a r7 = xh1.a.C5844a.f218719a
                xh1.v.t9(r1, r7)
            Laf:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            Lb2:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            Lb8:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xh1.v.b0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.t tVar, State state, tq.e<? super i0> eVar) {
            return v.this.new b0(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<xh1.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f218830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f218831b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f218832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f218833b;

            /* JADX INFO: renamed from: xh1.v$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5847a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f218834d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f218835e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f218836f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f218838h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f218839j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f218840k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f218841l;

                public C5847a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f218834d = obj;
                    this.f218835e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f218832a = hVar;
                this.f218833b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5847a c5847a;
                if (eVar instanceof C5847a) {
                    c5847a = (C5847a) eVar;
                    int i15 = c5847a.f218835e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5847a.f218835e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5847a = new C5847a(eVar);
                    }
                } else {
                    c5847a = new C5847a(eVar);
                }
                Object obj2 = c5847a.f218834d;
                Object objE = uq.b.e();
                int i16 = c5847a.f218835e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f218832a;
                    xh1.d.Data dataLa = this.f218833b.la((State) obj);
                    c5847a.f218836f = vq.j.a(obj);
                    c5847a.f218838h = vq.j.a(c5847a);
                    c5847a.f218839j = vq.j.a(obj);
                    c5847a.f218840k = vq.j.a(hVar);
                    c5847a.f218841l = 0;
                    c5847a.f218835e = 1;
                    if (hVar.F(dataLa, c5847a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, v vVar) {
            this.f218830a = gVar;
            this.f218831b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xh1.d.Data> hVar, tq.e eVar) {
            Object objA = this.f218830a.a(new a(hVar, this.f218831b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$a;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$a;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<xh1.a.C5844a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f218843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218844g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f218845h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f218846j;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (r4.F(r6, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f218846j
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L30
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r7.f218843f
                oq.i0 r0 = (oq.i0) r0
                goto L23
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r0 = r7.f218843f
                dx.b r0 = (dx.b) r0
            L23:
                java.lang.Object r0 = r7.f218842e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto Laa
            L2c:
                oq.u.b(r8)
                goto L47
            L30:
                oq.u.b(r8)
                xh1.v r8 = xh1.v.this
                g04.f r8 = xh1.v.w9(r8)
                g04.f$a r1 = new g04.f$a
                r1.<init>(r4, r5)
                r7.f218846j = r4
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L47
                goto La9
            L47:
                dx.i r8 = (dx.i) r8
                xh1.v r1 = xh1.v.this
                boolean r4 = r8 instanceof dx.i.Left
                if (r4 == 0) goto L7e
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                xw.b r4 = r1.Y1()
                xh1.a$s$d r6 = new xh1.a$s$d
                cb4.d r1 = xh1.v.I9(r1)
                r6.<init>(r1)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f218842e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f218843f = r8
                r7.f218844g = r5
                r7.f218845h = r5
                r7.f218846j = r3
                java.lang.Object r8 = r4.F(r6, r7)
                if (r8 != r0) goto Laa
                goto La9
            L7e:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto Lad
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                xw.b r1 = r1.Y1()
                xh1.a$s$u r4 = xh1.a.s.u.f218757a
                java.lang.Object r8 = vq.j.a(r8)
                r7.f218842e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f218843f = r8
                r7.f218844g = r5
                r7.f218845h = r5
                r7.f218846j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto Laa
            La9:
                return r0
            Laa:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            Lad:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xh1.v.c0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.C5844a c5844a, State state, tq.e<? super i0> eVar) {
            return v.this.new c0(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$u;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$u;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xh1.a.u, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218848e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218848e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.p pVar = xh1.a.s.p.f218752a;
                this.f218848e = 1;
                if (bVarY1.F(pVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.u uVar, State state, tq.e<? super i0> eVar) {
            return v.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$f;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$f;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xh1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218850e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218850e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.i iVar = xh1.a.s.i.f218745a;
                this.f218850e = 1;
                if (bVarY1.F(iVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.f fVar, State state, tq.e<? super i0> eVar) {
            return v.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxh1/a$j;", "<unused var>", "Lxh1/c;", "state", "Loq/i0;", "<anonymous>", "(Lxh1/a$j;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xh1.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218853f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f218853f;
            Object objE = uq.b.e();
            int i15 = this.f218852e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.ToHistory toHistory = new xh1.a.s.ToHistory(state.c().isEmpty());
                this.f218853f = vq.j.a(state);
                this.f218852e = 1;
                if (bVarY1.F(toHistory, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.j jVar, State state, tq.e<? super i0> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f218853f = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$c;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$c;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xh1.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218855e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218855e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.e eVar = xh1.a.s.e.f218741a;
                this.f218855e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.c cVar, State state, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$n;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$n;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xh1.a.n, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218857e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218857e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.r rVar = xh1.a.s.r.f218754a;
                this.f218857e = 1;
                if (bVarY1.F(rVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.n nVar, State state, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$v;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$v;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xh1.a.v, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f218860f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f218862a;

            static {
                int[] iArr = new int[t64.a.values().length];
                try {
                    iArr[t64.a.ONLINE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t64.a.OFFLINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f218862a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t64.a aVar;
            DialogData dialogDataS9;
            Object objE = uq.b.e();
            int i15 = this.f218860f;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean zE = v.this.networkConnectionManager.e();
                if (zE) {
                    aVar = t64.a.ONLINE;
                } else {
                    if (zE) {
                        throw new oq.p();
                    }
                    aVar = t64.a.OFFLINE;
                }
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                int i16 = a.f218862a[aVar.ordinal()];
                if (i16 == 1) {
                    dialogDataS9 = v.this.S9();
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    dialogDataS9 = v.this.V9();
                }
                xh1.a.s.ShowNavigationDialog showNavigationDialog = new xh1.a.s.ShowNavigationDialog(dialogDataS9);
                this.f218859e = vq.j.a(aVar);
                this.f218860f = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.v vVar, State state, tq.e<? super i0> eVar) {
            return v.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$i;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$i;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<xh1.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218863e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218863e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                iq0.v vVar2 = iq0.v.CONTACT_DETAILS_REGISTRY;
                xh1.a.s.l lVar = xh1.a.s.l.f218748a;
                this.f218863e = 1;
                if (vVar.ha(vVar2, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.i iVar, State state, tq.e<? super i0> eVar) {
            return v.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$m;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$m;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xh1.a.m, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218865e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218865e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                iq0.v vVar2 = iq0.v.REGISTERED_ADDRESS;
                xh1.a.s.q qVar = xh1.a.s.q.f218753a;
                this.f218865e = 1;
                if (vVar.ha(vVar2, qVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.m mVar, State state, tq.e<? super i0> eVar) {
            return v.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$o;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$o;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<xh1.a.o, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218867e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218867e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.C5846s c5846s = xh1.a.s.C5846s.f218755a;
                this.f218867e = 1;
                if (bVarY1.F(c5846s, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.o oVar, State state, tq.e<? super i0> eVar) {
            return v.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$x;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$x;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<xh1.a.x, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218869e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218869e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.ShowNavigationDialog showNavigationDialog = new xh1.a.s.ShowNavigationDialog(v.this.ca());
                this.f218869e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.x xVar, State state, tq.e<? super i0> eVar) {
            return v.this.new m(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lxh1/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f218872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f218874h;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, boolean z15, boolean z16, State state) {
            return State.b(state, list, z15, z16, null, 8, null);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
        /* JADX WARN: Code duplicated, block: B:29:0x0093  */
        /* JADX WARN: Code duplicated, block: B:31:0x0097  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list;
            int i15;
            Object objD;
            int i16;
            dx.i iVar;
            Object objB;
            k10.c0 c0Var = (k10.c0) this.f218874h;
            Object objE = uq.b.e();
            int i17 = this.f218873g;
            if (i17 == 0) {
                oq.u.b(obj);
                p1 p1Var = v.this.loadCachedAddedDocumentsInfoUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f218874h = c0Var;
                this.f218873g = 1;
                obj = p1Var.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    list = (List) this.f218871e;
                    oq.u.b(obj);
                    if (obj != null) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    yg1.a aVar = v.this.dashboardContainersInteractor;
                    this.f218874h = c0Var;
                    this.f218871e = list;
                    this.f218872f = i15;
                    this.f218873g = 3;
                    objD = aVar.d(this);
                    if (objD != objE) {
                        i16 = i15;
                        obj = objD;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i16 = this.f218872f;
                list = (List) this.f218871e;
                oq.u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar).b();
            }
            final boolean zBooleanValue = ((Boolean) objB).booleanValue();
            final boolean z15 = i16 != 0;
            return c0Var.b(new er.l() { // from class: xh1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.n.O(list, zBooleanValue, z15, (State) obj2);
                }
            });
            List list2 = (List) obj;
            ch1.r rVar = v.this.getDocumentCertificateExpiredUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f218874h = c0Var;
            this.f218871e = list2;
            this.f218873g = 2;
            Object objA = rVar.a(c1792a2, this);
            if (objA != objE) {
                list = list2;
                obj = objA;
                if (obj != null) {
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                yg1.a aVar2 = v.this.dashboardContainersInteractor;
                this.f218874h = c0Var;
                this.f218871e = list;
                this.f218872f = i15;
                this.f218873g = 3;
                objD = aVar2.d(this);
                if (objD != objE) {
                    i16 = i15;
                    obj = objD;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        objB = vq.b.a(false);
                    } else {
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVar).b();
                    }
                    final boolean zBooleanValue2 = ((Boolean) objB).booleanValue();
                    if (i16 != 0) {
                    }
                    return c0Var.b(new er.l() { // from class: xh1.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.n.O(list, zBooleanValue2, z15, (State) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((n) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            n nVar = v.this.new n(eVar);
            nVar.f218874h = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$d;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$d;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<xh1.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218876e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218876e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.f fVar = xh1.a.s.f.f218742a;
                this.f218876e = 1;
                if (bVarY1.F(fVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.d dVar, State state, tq.e<? super i0> eVar) {
            return v.this.new o(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$h;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$h;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<xh1.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218878e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218878e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                iq0.v vVar2 = iq0.v.CHATBOT;
                xh1.a.s.k kVar = xh1.a.s.k.f218747a;
                this.f218878e = 1;
                if (vVar.ha(vVar2, kVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.h hVar, State state, tq.e<? super i0> eVar) {
            return v.this.new p(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$p;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$p;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<xh1.a.p, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218880e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218880e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.t tVar = xh1.a.s.t.f218756a;
                this.f218880e = 1;
                if (bVarY1.F(tVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.p pVar, State state, tq.e<? super i0> eVar) {
            return v.this.new q(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$l;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$l;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<xh1.a.l, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218882e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218882e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.o oVar = xh1.a.s.o.f218751a;
                this.f218882e = 1;
                if (bVarY1.F(oVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.l lVar, State state, tq.e<? super i0> eVar) {
            return v.this.new r(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxh1/a$b;", "action", "Lxh1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxh1/a$b;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<xh1.a.Deactivate, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218885f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f218885f
                xh1.a$b r0 = (xh1.a.Deactivate) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f218884e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L5a
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L43
            L22:
                oq.u.b(r7)
                xh1.v r7 = xh1.v.this
                v64.l r7 = xh1.v.D9(r7)
                v64.l$a r2 = new v64.l$a
                t64.a r5 = r0.getDeactivationType()
                r2.<init>(r5)
                java.lang.Object r5 = vq.j.a(r0)
                r6.f218885f = r5
                r6.f218884e = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L43
                goto L59
            L43:
                xh1.v r7 = xh1.v.this
                xw.b r7 = r7.Y1()
                xh1.a$s$n r2 = xh1.a.s.n.f218750a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f218885f = r0
                r6.f218884e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L5a
            L59:
                return r1
            L5a:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xh1.v.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.Deactivate deactivate, State state, tq.e<? super i0> eVar) {
            s sVar = v.this.new s(eVar);
            sVar.f218885f = deactivate;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$w;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$w;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<xh1.a.w, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218887e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218887e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.ShowNavigationDialog showNavigationDialog = new xh1.a.s.ShowNavigationDialog(v.this.Y9());
                this.f218887e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.w wVar, State state, tq.e<? super i0> eVar) {
            return v.this.new t(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$y;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$y;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<xh1.a.y, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218889e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218889e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.g gVar = xh1.a.s.g.f218743a;
                this.f218889e = 1;
                if (bVarY1.F(gVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.y yVar, State state, tq.e<? super i0> eVar) {
            return v.this.new u(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: xh1.v$v, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxh1/a$q;", "action", "Lk10/c0;", "Lxh1/c;", "state", "Lk10/l;", "<anonymous>", "(Lxh1/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5848v extends vq.k implements er.q<xh1.a.HandleAppMenuItem, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f218893g;

        C5848v(tq.e<? super C5848v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xh1.a.HandleAppMenuItem handleAppMenuItem, State state) {
            return State.b(state, null, false, false, new d60.j(handleAppMenuItem.getItem()), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xh1.a.HandleAppMenuItem handleAppMenuItem = (xh1.a.HandleAppMenuItem) this.f218892f;
            k10.c0 c0Var = (k10.c0) this.f218893g;
            uq.b.e();
            if (this.f218891e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(new xh1.a.GoToItem(handleAppMenuItem.getItem()));
            return c0Var.b(new er.l() { // from class: xh1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.C5848v.O(handleAppMenuItem, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.HandleAppMenuItem handleAppMenuItem, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C5848v c5848v = v.this.new C5848v(eVar);
            c5848v.f218892f = handleAppMenuItem;
            c5848v.f218893g = c0Var;
            return c5848v.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxh1/a$k;", "action", "Lxh1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxh1/a$k;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<xh1.a.GoToItem, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218896f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f218898a;

            static {
                int[] iArr = new int[ah1.a.b.values().length];
                try {
                    iArr[ah1.a.b.LOGOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ah1.a.b.CHANGE_PASSWORD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ah1.a.b.BIOMETRIC_LOGIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ah1.a.b.NOTIFICATIONS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ah1.a.b.CERTIFICATES_ISSUED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ah1.a.b.HISTORY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ah1.a.b.ABOUT_APP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ah1.a.b.TECHNICAL_SUPPORT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ah1.a.b.DEACTIVATE_APP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ah1.a.b.CONTACT_DETAILS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ah1.a.b.PASSPORT_DETAILS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ah1.a.b.APP_RATING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ah1.a.b.CHAT_BOT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ah1.a.b.VOTE_IDEA.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ah1.a.b.LANGUAGE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ah1.a.b.REGISTERED_ADDRESS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ah1.a.b.APPEARANCE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f218898a = iArr;
            }
        }

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xh1.a.GoToItem goToItem = (xh1.a.GoToItem) this.f218896f;
            uq.b.e();
            if (this.f218895e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            switch (a.f218898a[goToItem.getItem().ordinal()]) {
                case 1:
                    v.this.d9(xh1.a.w.f218761a);
                    break;
                case 2:
                    v.this.d9(new xh1.a.GoToChangePassword(false, 1, null));
                    break;
                case 3:
                    v.this.d9(xh1.a.t.f218758a);
                    break;
                case 4:
                    v.this.d9(xh1.a.u.f218759a);
                    break;
                case 5:
                    v.this.d9(xh1.a.f.f218724a);
                    break;
                case 6:
                    v.this.d9(xh1.a.j.f218728a);
                    break;
                case 7:
                    v.this.d9(xh1.a.c.f218721a);
                    break;
                case 8:
                    v.this.d9(xh1.a.n.f218732a);
                    break;
                case 9:
                    v.this.d9(xh1.a.v.f218760a);
                    break;
                case 10:
                    v.this.d9(xh1.a.i.f218727a);
                    break;
                case 11:
                    v.this.ea();
                    break;
                case 12:
                    v.this.d9(xh1.a.d.f218722a);
                    break;
                case 13:
                    v.this.d9(xh1.a.h.f218726a);
                    break;
                case 14:
                    v.this.d9(xh1.a.p.f218734a);
                    break;
                case 15:
                    v.this.d9(xh1.a.l.f218730a);
                    break;
                case 16:
                    v.this.d9(xh1.a.m.f218731a);
                    break;
                case 17:
                    v.this.d9(xh1.a.y.f218763a);
                    break;
                default:
                    throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.GoToItem goToItem, State state, tq.e<? super i0> eVar) {
            w wVar = v.this.new w(eVar);
            wVar.f218896f = goToItem;
            return wVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loq/i0;", "<unused var>", "Lk10/c0;", "Lxh1/c;", "state", "Lk10/l;", "<anonymous>", "(VLpl/gov/coi/common/statemachine/State;)Lpl/gov/coi/common/statemachine/ChangedState;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<i0, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f218900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f218901g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, boolean z15, boolean z16, State state) {
            return State.b((State) c0Var.a(), null, z15, z16, null, 9, null);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005b  */
        /* JADX WARN: Code duplicated, block: B:23:0x0068  */
        /* JADX WARN: Code duplicated, block: B:25:0x006c  */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0085  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            dx.i iVar;
            Object objB;
            final k10.c0 c0Var = (k10.c0) this.f218901g;
            Object objE = uq.b.e();
            int i16 = this.f218900f;
            if (i16 == 0) {
                oq.u.b(obj);
                ch1.r rVar = v.this.getDocumentCertificateExpiredUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f218901g = c0Var;
                this.f218900f = 1;
                obj = rVar.a(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                oq.u.b(obj);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = this.f218899e;
                oq.u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar).b();
            }
            final boolean zBooleanValue = ((Boolean) objB).booleanValue();
            final boolean z15 = i15 != 0;
            return c0Var.b(new er.l() { // from class: xh1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.x.O(c0Var, zBooleanValue, z15, (State) obj2);
                }
            });
            int i17 = obj != null ? 1 : 0;
            yg1.a aVar = v.this.dashboardContainersInteractor;
            this.f218901g = c0Var;
            this.f218899e = i17;
            this.f218900f = 2;
            Object objD = aVar.d(this);
            if (objD != objE) {
                i15 = i17;
                obj = objD;
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    objB = vq.b.a(false);
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVar).b();
                }
                final boolean zBooleanValue2 = ((Boolean) objB).booleanValue();
                if (i15 != 0) {
                }
                return c0Var.b(new er.l() { // from class: xh1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.x.O(c0Var, zBooleanValue2, z15, (State) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i0 i0Var, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            x xVar = v.this.new x(eVar);
            xVar.f218901g = c0Var;
            return xVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$r;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$r;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<xh1.a.r, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218903e;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218903e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.b bVar = xh1.a.s.b.f218738a;
                this.f218903e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.r rVar, State state, tq.e<? super i0> eVar) {
            return v.this.new y(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxh1/a$e;", "<unused var>", "Lxh1/c;", "Loq/i0;", "<anonymous>", "(Lxh1/a$e;Lxh1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<xh1.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218905e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218905e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xh1.a.s> bVarY1 = v.this.Y1();
                xh1.a.s.C5845a c5845a = xh1.a.s.C5845a.f218737a;
                this.f218905e = 1;
                if (bVarY1.F(c5845a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xh1.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return v.this.new z(eVar2).J(i0.f148189a);
        }
    }

    public v(yy.a aVar, yh1.b bVar, mx.c cVar, f0 f0Var, ib4.c cVar2, c21.a aVar2, f01.a aVar3, ip3.a aVar4, p1 p1Var, g04.f fVar, g04.e eVar, g04.g gVar, v64.l lVar, ay.k kVar, ch1.r rVar, ch1.a aVar5, yg1.a aVar6, yg1.b bVar2, yg1.d dVar, SetupData setupData) {
        this.mapper = bVar;
        this.labelProvider = cVar;
        this.isContactDetailsRegistryFeatureFlagActiveUseCase = f0Var;
        this.genericDomainErrorHandler = cVar2;
        this.isChatBotFeatureFlagActiveUseCase = aVar2;
        this.isAppRatingFeatureFlagActiveUC = aVar3;
        this.isVoteIdeaFeatureFlagActiveUC = aVar4;
        this.loadCachedAddedDocumentsInfoUC = p1Var;
        this.checkBiometricRequirementsUseCase = fVar;
        this.checkBiometricActivatedUseCase = eVar;
        this.checkBiometricStatusUseCase = gVar;
        this.deactivateAppUseCase = lVar;
        this.networkConnectionManager = kVar;
        this.getDocumentCertificateExpiredUseCase = rVar;
        this.checkFeatureTemporaryInterruptionUC = aVar5;
        this.dashboardContainersInteractor = aVar6;
        this.dashboardMobileInteractor = bVar2;
        this.dashboardUserDataInteractor = dVar;
        this.contract = setupData;
        State state = new State(null, false, false, null, 15, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: xh1.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.ja(this.f218779a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), la(state));
    }

    private final void O9(t64.a deactivationType) {
        d9(new xh1.a.Deactivate(deactivationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData Q9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.P1), this.labelProvider.c(sg1.a.N1), new DialogButtonTextData(this.labelProvider.c(sg1.a.O1), null, b9(new xh1.a.GoToChangePassword(false)), 2, null), new DialogButtonTextData(this.labelProvider.c(sg1.a.L), null, new er.a() { // from class: xh1.r
            @Override // er.a
            public final Object a() {
                return v.R9();
            }
        }, 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData S9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.S1), this.labelProvider.c(sg1.a.R1), new DialogButtonTextData(this.labelProvider.c(sg1.a.Q1), null, new er.a() { // from class: xh1.t
            @Override // er.a
            public final Object a() {
                return v.T9(this.f218783a);
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(sg1.a.L), null, new er.a() { // from class: xh1.u
            @Override // er.a
            public final Object a() {
                return v.U9();
            }
        }, 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(v vVar) {
        vVar.O9(t64.a.ONLINE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData V9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.U1), this.labelProvider.c(sg1.a.T1), new DialogButtonTextData(this.labelProvider.c(sg1.a.Q1), null, new er.a() { // from class: xh1.p
            @Override // er.a
            public final Object a() {
                return v.W9(this.f218782a);
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(sg1.a.L), null, new er.a() { // from class: xh1.q
            @Override // er.a
            public final Object a() {
                return v.X9();
            }
        }, 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(v vVar) {
        vVar.O9(t64.a.OFFLINE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData Y9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.O0), null, new DialogButtonTextData(this.labelProvider.c(sg1.a.f181466e2), null, b9(xh1.a.r.f218736a), 2, null), new DialogButtonTextData(this.labelProvider.c(sg1.a.f181523v), null, new er.a() { // from class: xh1.s
            @Override // er.a
            public final Object a() {
                return v.Z9();
            }
        }, 2, null), null, null, 100, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData aa() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.M1), this.labelProvider.c(sg1.a.L1), new DialogButtonTextData(this.labelProvider.c(sg1.a.f181526w), null, new er.a() { // from class: xh1.k
            @Override // er.a
            public final Object a() {
                return v.ba();
            }
        }, 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ba() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData ca() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(sg1.a.f181462d2), this.labelProvider.c(sg1.a.f181458c2), new DialogButtonTextData(this.labelProvider.c(sg1.a.f181526w), null, new er.a() { // from class: xh1.n
            @Override // er.a
            public final Object a() {
                return v.da();
            }
        }, 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 da() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ea() {
        i00.a.a(this, new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fa(final er.a<i0> aVar, dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new xh1.a.s.NavigateToErrorScreen(this.genericDomainErrorHandler.b(new ib4.c.Params(bVar, false, new er.l() { // from class: xh1.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.ga(aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ga(er.a aVar, ib4.c.b bVar) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (F(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (F(r4, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ha(iq0.v r8, xh1.a.s r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.v.ha(iq0.v, xh1.a$s, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ja(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(State.class), new er.l() { // from class: xh1.j
            @Override // er.l
            public final Object b(Object obj) {
                return v.ka(this.f218778a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ka(v vVar, k10.z zVar) {
        zVar.A(vVar.new n(null));
        C5848v c5848v = vVar.new C5848v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(xh1.a.HandleAppMenuItem.class), oVar, c5848v);
        zVar.x(q0.c(xh1.a.GoToItem.class), oVar, vVar.new w(null));
        k10.k.m(zVar, vVar.dashboardContainersInteractor.i(), null, vVar.new x(null), 2, null);
        zVar.x(q0.c(xh1.a.r.class), oVar, vVar.new y(null));
        zVar.x(q0.c(xh1.a.e.class), oVar, vVar.new z(null));
        zVar.x(q0.c(xh1.a.GoToChangePassword.class), oVar, vVar.new a0(null));
        zVar.x(q0.c(xh1.a.t.class), oVar, vVar.new b0(null));
        zVar.x(q0.c(xh1.a.C5844a.class), oVar, vVar.new c0(null));
        zVar.x(q0.c(xh1.a.u.class), oVar, vVar.new d(null));
        zVar.x(q0.c(xh1.a.f.class), oVar, vVar.new e(null));
        zVar.x(q0.c(xh1.a.j.class), oVar, vVar.new f(null));
        zVar.x(q0.c(xh1.a.c.class), oVar, vVar.new g(null));
        zVar.x(q0.c(xh1.a.n.class), oVar, vVar.new h(null));
        zVar.x(q0.c(xh1.a.v.class), oVar, vVar.new i(null));
        zVar.x(q0.c(xh1.a.i.class), oVar, vVar.new j(null));
        zVar.x(q0.c(xh1.a.m.class), oVar, vVar.new k(null));
        zVar.x(q0.c(xh1.a.o.class), oVar, vVar.new l(null));
        zVar.x(q0.c(xh1.a.x.class), oVar, vVar.new m(null));
        zVar.x(q0.c(xh1.a.d.class), oVar, vVar.new o(null));
        zVar.x(q0.c(xh1.a.h.class), oVar, vVar.new p(null));
        zVar.x(q0.c(xh1.a.p.class), oVar, vVar.new q(null));
        zVar.x(q0.c(xh1.a.l.class), oVar, vVar.new r(null));
        zVar.x(q0.c(xh1.a.Deactivate.class), oVar, vVar.new s(null));
        zVar.x(q0.c(xh1.a.w.class), oVar, vVar.new t(null));
        zVar.x(q0.c(xh1.a.y.class), oVar, vVar.new u(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xh1.d.Data la(State state) {
        yh1.b bVar = this.mapper;
        f0 f0Var = this.isContactDetailsRegistryFeatureFlagActiveUseCase;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        return bVar.b(new yh1.b.Params(state, new er.l() { // from class: xh1.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.ma(this.f218780a, (ah1.a.b) obj);
            }
        }, f0Var.b(c1792a).booleanValue(), this.isChatBotFeatureFlagActiveUseCase.a(c1792a).booleanValue(), this.isVoteIdeaFeatureFlagActiveUC.a(c1792a).booleanValue(), this.isAppRatingFeatureFlagActiveUC.a(c1792a).booleanValue(), this.dashboardMobileInteractor.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ma(v vVar, ah1.a.b bVar) {
        vVar.d9(new xh1.a.GoToItem(bVar));
        return i0.f148189a;
    }

    @Override // xh1.d
    public void P() {
        d9(xh1.a.e.f218723a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xh1.a.s sVar, tq.e<? super i0> eVar) {
        return super.F(sVar, eVar);
    }

    @Override // zx.b
    public xw.b<xh1.a.s> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, xh1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xh1.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ia, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        ah1.a.b navigateTo = data.getNavigateTo();
        if (navigateTo != null) {
            d9(new xh1.a.HandleAppMenuItem(navigateTo));
        }
    }
}
