package ta0;

import cf0.AsyncDocumentToGenerate;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pf0.LoadAccessTokenResult;
import vf0.Document;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BÁ\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H\u0082@¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0002*\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010>\u001a\u0002062\u0006\u0010=\u001a\u00020<H\u0082@¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0002H\u0002¢\u0006\u0004\bB\u0010CJ\u0018\u0010F\u001a\u0002062\u0006\u0010E\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u000206H\u0096\u0001¢\u0006\u0004\bH\u0010IR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010rR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010{\u001a\b\u0012\u0004\u0012\u00020v0u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR(\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030|8\u0014X\u0094\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R%\u0010@\u001a\t\u0012\u0004\u0012\u00020A0\u0082\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001e\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bX\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"Lta0/o0;", "Ll00/g;", "Lta0/b;", "Lta0/a;", "Lta0/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lqg0/d;", "deactivateAppUC", "Leg0/q;", "observeAllDocumentsUC", "Leg0/r;", "observeUserCertStatusUC", "Lib4/c;", "genericDomainError", "Lqf0/a;", "loadAccessTokenUC", "Lqf0/b;", "renewJuniorCertificateUC", "Lua0/q;", "mapper", "Lsa0/g;", "dialogMapper", "Lqg0/h;", "logoutFromAppUC", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Leg0/x;", "shouldShowUserAgreementsUC", "Leg0/v;", "saveUserAgreementsUC", "Lba0/a;", "getAvailableDocumentsToAddUC", "Ldf0/k;", "observeDocumentsToGenerateUC", "Lua0/r;", "documentDesktopModelMapper", "Ldf0/h;", "manageDownloadTasksUC", "Lc54/b;", "isFeatureEnabledUseCase", "Ldf0/p;", "resumeDownloadTasksUC", "Lna0/a;", "fetchAndCacheJuniorSettingsUC", "Ldf0/n;", "requestDocumentUpdateUC", "Lla0/a;", "notificationsInteractor", "<init>", "(Lyy/a;Lqg0/d;Leg0/q;Leg0/r;Lib4/c;Lqf0/a;Lqf0/b;Lua0/q;Lsa0/g;Lqg0/h;La14/w;Li70/n;Leg0/x;Leg0/v;Lba0/a;Ldf0/k;Lua0/r;Ldf0/h;Lc54/b;Ldf0/p;Lna0/a;Ldf0/n;Lla0/a;)V", "Loq/i0;", "Z9", "(Ltq/e;)Ljava/lang/Object;", "Lta0/b$e;", "ia", "(Lta0/b$e;)Lta0/b;", "Ldx/b;", "domainError", "Q9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "state", "Lta0/c$a;", "S9", "(Lta0/b;)Lta0/c$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lqg0/d;", "c", "Leg0/q;", "d", "Leg0/r;", "e", "Lib4/c;", "f", "Lqf0/a;", "g", "Lqf0/b;", "h", "Lua0/q;", "j", "Lsa0/g;", "k", "Lqg0/h;", "l", "La14/w;", "m", "Li70/n;", "n", "Leg0/x;", "p", "Leg0/v;", "q", "Lba0/a;", "r", "Ldf0/k;", "s", "Lua0/r;", "t", "Ldf0/h;", "v", "Lc54/b;", "w", "Ldf0/p;", "x", "Lna0/a;", "Ldf0/n;", "z", "Lla0/a;", "Lxw/b;", "Lta0/a$f;", "A", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "B", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "C", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends l00.g<ta0.b, ta0.a> implements ta0.c, zx.b, i70.n {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final xw.b<ta0.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final k10.t<ta0.b, ta0.a> stateMachine;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final mu.p0<ta0.c.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qg0.d deactivateAppUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eg0.q observeAllDocumentsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eg0.r observeUserCertStatusUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final qf0.a loadAccessTokenUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qf0.b renewJuniorCertificateUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ua0.q mapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final sa0.g dialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final qg0.h logoutFromAppUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final eg0.x shouldShowUserAgreementsUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final eg0.v saveUserAgreementsUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ba0.a getAvailableDocumentsToAddUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final df0.k observeDocumentsToGenerateUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ua0.r documentDesktopModelMapper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final df0.h manageDownloadTasksUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final df0.p resumeDownloadTasksUC;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final na0.a fetchAndCacheJuniorSettingsUC;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final df0.n requestDocumentUpdateUC;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final la0.a notificationsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f189237d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189239f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189237d = obj;
            this.f189239f |= PKIFailureInfo.systemUnavail;
            return o0.this.Z9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ta0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f189240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f189241b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f189242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f189243b;

            /* JADX INFO: renamed from: ta0.o0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4920a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f189244d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189245e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f189246f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f189248h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f189249j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f189250k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f189251l;

                public C4920a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f189244d = obj;
                    this.f189245e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o0 o0Var) {
                this.f189242a = hVar;
                this.f189243b = o0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4920a c4920a;
                if (eVar instanceof C4920a) {
                    c4920a = (C4920a) eVar;
                    int i15 = c4920a.f189245e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4920a.f189245e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4920a = new C4920a(eVar);
                    }
                } else {
                    c4920a = new C4920a(eVar);
                }
                Object obj2 = c4920a.f189244d;
                Object objE = uq.b.e();
                int i16 = c4920a.f189245e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f189242a;
                    ta0.c.a aVarS9 = this.f189243b.S9((ta0.b) obj);
                    c4920a.f189246f = vq.j.a(obj);
                    c4920a.f189248h = vq.j.a(c4920a);
                    c4920a.f189249j = vq.j.a(obj);
                    c4920a.f189250k = vq.j.a(hVar);
                    c4920a.f189251l = 0;
                    c4920a.f189245e = 1;
                    if (hVar.F(aVarS9, c4920a) == objE) {
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

        public b(mu.g gVar, o0 o0Var) {
            this.f189240a = gVar;
            this.f189241b = o0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ta0.c.a> hVar, tq.e eVar) {
            Object objA = this.f189240a.a(new a(hVar, this.f189241b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta0/a$e;", "<unused var>", "Lta0/b;", "Loq/i0;", "<anonymous>", "(Lta0/a$e;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ta0.a.e, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189252e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f189252e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ta0.o0 r5 = ta0.o0.this
                qg0.h r5 = ta0.o0.B9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f189252e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                ta0.o0 r5 = ta0.o0.this
                xw.b r5 = r5.Y1()
                ta0.a$f$m r1 = ta0.a.f.m.f189124a
                r4.f189252e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.e eVar, ta0.b bVar, tq.e<? super oq.i0> eVar2) {
            return o0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta0/a$c;", "<unused var>", "Lta0/b;", "Loq/i0;", "<anonymous>", "(Lta0/a$c;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ta0.a.c, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189254e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f189254e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ta0.o0 r5 = ta0.o0.this
                qg0.d r5 = ta0.o0.v9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f189254e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                ta0.o0 r5 = ta0.o0.this
                xw.b r5 = r5.Y1()
                ta0.a$f$a r1 = ta0.a.f.C4915a.f189111a
                r4.f189254e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.c cVar, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            return o0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lta0/b;", "it", "Loq/i0;", "<anonymous>", "(Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189256e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f189256e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o0.this.d9(ta0.a.d.f189109a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ta0.b bVar, tq.e<? super oq.i0> eVar) {
            return ((e) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return o0.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta0/a$d;", "<unused var>", "Lta0/b;", "Loq/i0;", "<anonymous>", "(Lta0/a$d;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ta0.a.d, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f189260g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189261h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189262j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f189263k;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o0 o0Var;
            Object objE = uq.b.e();
            int i15 = this.f189263k;
            if (i15 == 0) {
                oq.u.b(obj);
                qf0.a aVar = o0.this.loadAccessTokenUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f189263k = 1;
                obj = aVar.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0Var = (o0) this.f189259f;
                oq.u.b(obj);
            }
            o0Var.d9(ta0.a.m.f189132a);
            return oq.i0.f148189a;
            dx.i iVar = (dx.i) obj;
            o0 o0Var2 = o0.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                this.f189258e = vq.j.a(iVar);
                this.f189259f = o0Var2;
                this.f189260g = vq.j.a(bVar);
                this.f189261h = 0;
                this.f189262j = 0;
                this.f189263k = 2;
                if (o0Var2.Q9(bVar, this) != objE) {
                    o0Var = o0Var2;
                    o0Var.d9(ta0.a.m.f189132a);
                }
                return objE;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            LoadAccessTokenResult loadAccessTokenResult = (LoadAccessTokenResult) ((dx.i.Right) iVar).b();
            if (loadAccessTokenResult.getCertificateRenewalRequired()) {
                o0Var2.d9(new ta0.a.RenewCertAndReloadAccessToken(loadAccessTokenResult.c()));
            } else {
                o0Var2.d9(new ta0.a.RefreshDocuments(loadAccessTokenResult.c()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.d dVar, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            return o0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta0/a$m;", "<unused var>", "Lta0/b;", "Loq/i0;", "<anonymous>", "(Lta0/a$m;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ta0.a.m, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189265e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r6.c(r1, r5) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f189265e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r6)
                goto L5b
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                goto L4a
            L21:
                oq.u.b(r6)
                goto L39
            L25:
                oq.u.b(r6)
                ta0.o0 r6 = ta0.o0.this
                na0.a r6 = ta0.o0.y9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f189265e = r4
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L39
                goto L5a
            L39:
                ta0.o0 r6 = ta0.o0.this
                df0.h r6 = ta0.o0.C9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f189265e = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L4a
                goto L5a
            L4a:
                ta0.o0 r6 = ta0.o0.this
                df0.p r6 = ta0.o0.H9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f189265e = r2
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L5b
            L5a:
                return r0
            L5b:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.m mVar, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            return o0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$j;", "action", "Lta0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$j;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ta0.a.RenewCertAndReloadAccessToken, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f189269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189270h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f189272k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f189273l;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x009b  */
        /* JADX WARN: Code duplicated, block: B:27:0x009f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            o0 o0Var;
            dx.b bVar;
            o0 o0Var2;
            ta0.a.RenewCertAndReloadAccessToken renewCertAndReloadAccessToken = (ta0.a.RenewCertAndReloadAccessToken) this.f189273l;
            Object objE = uq.b.e();
            int i15 = this.f189272k;
            if (i15 == 0) {
                oq.u.b(obj);
                qf0.b bVar2 = o0.this.renewJuniorCertificateUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f189273l = renewCertAndReloadAccessToken;
                this.f189272k = 1;
                if (bVar2.c(c1792a, this) != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    oq.u.b(obj);
                    iVar = (dx.i) obj;
                    o0Var = o0.this;
                    if (iVar instanceof dx.i.Left) {
                        bVar = (dx.b) ((dx.i.Left) iVar).b();
                        this.f189273l = renewCertAndReloadAccessToken;
                        this.f189267e = vq.j.a(iVar);
                        this.f189268f = o0Var;
                        this.f189269g = vq.j.a(bVar);
                        this.f189270h = 0;
                        this.f189271j = 0;
                        this.f189272k = 3;
                        if (o0Var.Q9(bVar, this) != objE) {
                            o0Var2 = o0Var;
                        }
                        return objE;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    o0Var.d9(new ta0.a.RefreshDocuments(((LoadAccessTokenResult) ((dx.i.Right) iVar).b()).c()));
                    return oq.i0.f148189a;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0Var2 = (o0) this.f189268f;
                oq.u.b(obj);
            }
            o0Var2.d9(new ta0.a.RefreshDocuments(renewCertAndReloadAccessToken.a()));
            return oq.i0.f148189a;
            qf0.a aVar = o0.this.loadAccessTokenUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f189273l = renewCertAndReloadAccessToken;
            this.f189272k = 2;
            obj = aVar.c(c1792a2, this);
            if (obj != objE) {
                iVar = (dx.i) obj;
                o0Var = o0.this;
                if (iVar instanceof dx.i.Left) {
                    bVar = (dx.b) ((dx.i.Left) iVar).b();
                    this.f189273l = renewCertAndReloadAccessToken;
                    this.f189267e = vq.j.a(iVar);
                    this.f189268f = o0Var;
                    this.f189269g = vq.j.a(bVar);
                    this.f189270h = 0;
                    this.f189271j = 0;
                    this.f189272k = 3;
                    if (o0Var.Q9(bVar, this) != objE) {
                        o0Var2 = o0Var;
                        o0Var2.d9(new ta0.a.RefreshDocuments(renewCertAndReloadAccessToken.a()));
                    }
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    o0Var.d9(new ta0.a.RefreshDocuments(((LoadAccessTokenResult) ((dx.i.Right) iVar).b()).c()));
                }
                return oq.i0.f148189a;
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.RenewCertAndReloadAccessToken renewCertAndReloadAccessToken, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            h hVar = o0.this.new h(eVar);
            hVar.f189273l = renewCertAndReloadAccessToken;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$i;", "action", "Lta0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$i;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ta0.a.RefreshDocuments, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f189277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f189278h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f189279j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f189280k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f189281l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f189282m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f189283n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f189284p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f189285q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f189286r;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189288a;

            static {
                int[] iArr = new int[vf0.d.values().length];
                try {
                    iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[vf0.d.UUT_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f189288a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0074  */
        /* JADX WARN: Code duplicated, block: B:17:0x0091  */
        /* JADX WARN: Code duplicated, block: B:18:0x0093  */
        /* JADX WARN: Code duplicated, block: B:20:0x0096  */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:24:0x009c  */
        /* JADX WARN: Code duplicated, block: B:25:0x009f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00eb -> B:35:0x00ee). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.RefreshDocuments refreshDocuments, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            i iVar = o0.this.new i(eVar);
            iVar.f189286r = refreshDocuments;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lvf0/a;", "documents", "Lwf0/a;", "status", "Lcf0/b;", "asyncDocuments", "Loq/x;", "<anonymous>", "(Ljava/util/List;Lwf0/a;Ljava/util/List;)Loq/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.r<List<? extends Document>, wf0.a, List<? extends AsyncDocumentToGenerate>, tq.e<? super oq.x<? extends List<? extends Document>, ? extends wf0.a, ? extends List<? extends AsyncDocumentToGenerate>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f189292h;

        j(tq.e<? super j> eVar) {
            super(4, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list = (List) this.f189290f;
            wf0.a aVar = (wf0.a) this.f189291g;
            List list2 = (List) this.f189292h;
            uq.b.e();
            if (this.f189289e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return new oq.x(list, aVar, list2);
        }

        @Override // er.r
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object g(List<Document> list, wf0.a aVar, List<AsyncDocumentToGenerate> list2, tq.e<? super oq.x<? extends List<Document>, ? extends wf0.a, ? extends List<AsyncDocumentToGenerate>>> eVar) {
            j jVar = new j(eVar);
            jVar.f189290f = list;
            jVar.f189291g = aVar;
            jVar.f189292h = list2;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2&\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Loq/x;", "", "Lvf0/a;", "Lwf0/a;", "Lcf0/b;", "pair", "Lk10/c0;", "Lta0/b;", "state", "Lk10/l;", "<anonymous>", "(Loq/x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<oq.x<? extends List<? extends Document>, ? extends wf0.a, ? extends List<? extends AsyncDocumentToGenerate>>, k10.c0<ta0.b>, tq.e<? super k10.l<? extends ta0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189295g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189297a;

            static {
                int[] iArr = new int[wf0.a.values().length];
                try {
                    iArr[wf0.a.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wf0.a.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[wf0.a.NOT_ACTIVATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f189297a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.C4917b a0(ta0.b bVar) {
            return ta0.b.C4917b.f189138a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.UserAgreements b0(o0 o0Var, oq.x xVar, ta0.b bVar) {
            return new ta0.b.UserAgreements(o0Var.documentDesktopModelMapper.b(new ua0.r.Params((List) xVar.d(), (List) xVar.f())), false, false, false, null, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.DocumentsLoaded c0(o0 o0Var, oq.x xVar, ta0.b bVar) {
            return new ta0.b.DocumentsLoaded(o0Var.documentDesktopModelMapper.b(new ua0.r.Params((List) xVar.d(), (List) xVar.f())), o0Var.isFeatureEnabledUseCase.a(b54.c.MJUNIOR_TEMPORARY_DRIVING_LICENCE).booleanValue(), false, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.d d0(ta0.b bVar) {
            return ta0.b.d.f189140a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.C4917b e0(ta0.b bVar) {
            return ta0.b.C4917b.f189138a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.C4917b f0(ta0.b bVar) {
            return ta0.b.C4917b.f189138a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        
            if (r8 == r2) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Object w(oq.x<? extends List<Document>, ? extends wf0.a, ? extends List<AsyncDocumentToGenerate>> xVar, k10.c0<ta0.b> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            k kVar = o0.this.new k(eVar);
            kVar.f189294f = xVar;
            kVar.f189295g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$f;", "action", "Lta0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$f;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ta0.a.f, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189299f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ta0.a.f fVar = (ta0.a.f) this.f189299f;
            Object objE = uq.b.e();
            int i15 = this.f189298e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ta0.a.f> bVarY1 = o0.this.Y1();
                this.f189299f = vq.j.a(fVar);
                this.f189298e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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
        public final Object w(ta0.a.f fVar, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            l lVar = o0.this.new l(eVar);
            lVar.f189299f = fVar;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$k;", "action", "Lta0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$k;Lta0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ta0.a.ShowDialog, ta0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189302f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ta0.a.ShowDialog showDialog = (ta0.a.ShowDialog) this.f189302f;
            Object objE = uq.b.e();
            int i15 = this.f189301e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ta0.a.f> bVarY1 = o0.this.Y1();
                ta0.a.f.ShowDialog showDialog2 = new ta0.a.f.ShowDialog(showDialog.getDialogData());
                this.f189302f = vq.j.a(showDialog);
                this.f189301e = 1;
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
        public final Object w(ta0.a.ShowDialog showDialog, ta0.b bVar, tq.e<? super oq.i0> eVar) {
            m mVar = o0.this.new m(eVar);
            mVar.f189302f = showDialog;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "hasUnread", "Lk10/c0;", "Lta0/b$a;", "state", "Lk10/l;", "Lta0/b;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<Boolean, k10.c0<ta0.b.DocumentsLoaded>, tq.e<? super k10.l<? extends ta0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f189305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189306g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.DocumentsLoaded O(boolean z15, ta0.b.DocumentsLoaded documentsLoaded) {
            return ta0.b.DocumentsLoaded.b(documentsLoaded, null, false, z15, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f189305f;
            k10.c0 c0Var = (k10.c0) this.f189306g;
            uq.b.e();
            if (this.f189304e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ta0.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.n.O(z15, (b.DocumentsLoaded) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<ta0.b.DocumentsLoaded> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f189305f = z15;
            nVar.f189306g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<ta0.b.DocumentsLoaded> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$l;", "action", "Lta0/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$l;Lta0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ta0.a.ShowDocument, ta0.b.DocumentsLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189308f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f189311b;

            static {
                int[] iArr = new int[vf0.d.values().length];
                try {
                    iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[vf0.d.UUT_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f189310a = iArr;
                int[] iArr2 = new int[ta0.e.values().length];
                try {
                    iArr2[ta0.e.ALREADY_DOWNLOADED.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[ta0.e.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[ta0.e.NOT_READY.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[ta0.e.TAKES_TOO_LONG.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[ta0.e.NONE.ordinal()] = 5;
                } catch (NoSuchFieldError unused10) {
                }
                f189311b = iArr2;
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            if (r12.F(r2, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        
            if (r12.F(r3, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
        
            if (r12.F(r2, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
        
            if (r12.F(r2, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
        
            if (r12.F(r2, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
        
            if (r12.F(r7, r11) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.ShowDocument showDocument, ta0.b.DocumentsLoaded documentsLoaded, tq.e<? super oq.i0> eVar) {
            o oVar = o0.this.new o(eVar);
            oVar.f189308f = showDocument;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$b;", "<unused var>", "Lta0/b$a;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lta0/a$b;Lta0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ta0.a.b, ta0.b.DocumentsLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189314g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189316a;

            static {
                int[] iArr = new int[vf0.d.values().length];
                try {
                    iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[vf0.d.UUT_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f189316a = iArr;
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        
            if (r2.F(r4, r8) == r1) goto L37;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta0.o0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.b bVar, ta0.b.DocumentsLoaded documentsLoaded, tq.e<? super oq.i0> eVar) {
            p pVar = o0.this.new p(eVar);
            pVar.f189314g = documentsLoaded;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lta0/a$g;", "action", "Lta0/b$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lta0/a$g;Lta0/b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ta0.a.OpenUrl, ta0.b.UserAgreements, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189318f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ta0.a.OpenUrl openUrl = (ta0.a.OpenUrl) this.f189318f;
            Object objE = uq.b.e();
            int i15 = this.f189317e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = o0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f189318f = vq.j.a(openUrl);
                this.f189317e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            o0 o0Var = o0.this;
            if (iVar instanceof dx.i.Left) {
                o0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.OpenUrl openUrl, ta0.b.UserAgreements userAgreements, tq.e<? super oq.i0> eVar) {
            q qVar = o0.this.new q(eVar);
            qVar.f189318f = openUrl;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lta0/a$n;", "action", "Lk10/c0;", "Lta0/b$e;", "state", "Lk10/l;", "Lta0/b;", "<anonymous>", "(Lta0/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ta0.a.TermsSwitchChanged, k10.c0<ta0.b.UserAgreements>, tq.e<? super k10.l<? extends ta0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189322g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b O(o0 o0Var, ta0.a.TermsSwitchChanged termsSwitchChanged, ta0.b.UserAgreements userAgreements) {
            return o0Var.ia(ta0.b.UserAgreements.b(userAgreements, null, termsSwitchChanged.getIsChecked(), false, false, null, 29, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ta0.a.TermsSwitchChanged termsSwitchChanged = (ta0.a.TermsSwitchChanged) this.f189321f;
            k10.c0 c0Var = (k10.c0) this.f189322g;
            uq.b.e();
            if (this.f189320e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: ta0.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.r.O(o0Var, termsSwitchChanged, (b.UserAgreements) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.TermsSwitchChanged termsSwitchChanged, k10.c0<ta0.b.UserAgreements> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            r rVar = o0.this.new r(eVar);
            rVar.f189321f = termsSwitchChanged;
            rVar.f189322g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lta0/a$h;", "action", "Lk10/c0;", "Lta0/b$e;", "state", "Lk10/l;", "Lta0/b;", "<anonymous>", "(Lta0/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ta0.a.PolicySwitchChanged, k10.c0<ta0.b.UserAgreements>, tq.e<? super k10.l<? extends ta0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f189326g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b O(o0 o0Var, ta0.a.PolicySwitchChanged policySwitchChanged, ta0.b.UserAgreements userAgreements) {
            return o0Var.ia(ta0.b.UserAgreements.b(userAgreements, null, false, policySwitchChanged.getIsChecked(), false, null, 27, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ta0.a.PolicySwitchChanged policySwitchChanged = (ta0.a.PolicySwitchChanged) this.f189325f;
            k10.c0 c0Var = (k10.c0) this.f189326g;
            uq.b.e();
            if (this.f189324e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: ta0.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.s.O(o0Var, policySwitchChanged, (b.UserAgreements) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.PolicySwitchChanged policySwitchChanged, k10.c0<ta0.b.UserAgreements> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            s sVar = o0.this.new s(eVar);
            sVar.f189325f = policySwitchChanged;
            sVar.f189326g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lta0/a$a;", "<unused var>", "Lk10/c0;", "Lta0/b$e;", "state", "Lk10/l;", "Lta0/b;", "<anonymous>", "(Lta0/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ta0.a.C4914a, k10.c0<ta0.b.UserAgreements>, tq.e<? super k10.l<? extends ta0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189329f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.UserAgreements V(ta0.b.UserAgreements userAgreements) {
            return ta0.b.UserAgreements.b(userAgreements, null, false, false, true, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ta0.b.DocumentsLoaded X(k10.c0 c0Var, o0 o0Var, ta0.b.UserAgreements userAgreements) {
            return new ta0.b.DocumentsLoaded(((ta0.b.UserAgreements) c0Var.a()).c(), o0Var.isFeatureEnabledUseCase.a(b54.c.MJUNIOR_TEMPORARY_DRIVING_LICENCE).booleanValue(), false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f189329f;
            Object objE = uq.b.e();
            int i15 = this.f189328e;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean zA = ((ta0.b.UserAgreements) c0Var.a()).getValidationState().a();
                if (!zA) {
                    return c0Var.b(new er.l() { // from class: ta0.a1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.t.V((b.UserAgreements) obj2);
                        }
                    });
                }
                if (!zA) {
                    throw new oq.p();
                }
                eg0.v vVar = o0.this.saveUserAgreementsUC;
                eg0.v.Params params = new eg0.v.Params(true);
                this.f189329f = c0Var;
                this.f189328e = 1;
                if (vVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: ta0.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.t.X(c0Var, o0Var, (b.UserAgreements) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ta0.a.C4914a c4914a, k10.c0<ta0.b.UserAgreements> c0Var, tq.e<? super k10.l<? extends ta0.b>> eVar) {
            t tVar = o0.this.new t(eVar);
            tVar.f189329f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    public o0(yy.a aVar, qg0.d dVar, eg0.q qVar, eg0.r rVar, ib4.c cVar, qf0.a aVar2, qf0.b bVar, ua0.q qVar2, sa0.g gVar, qg0.h hVar, a14.w wVar, i70.n nVar, eg0.x xVar, eg0.v vVar, ba0.a aVar3, df0.k kVar, ua0.r rVar2, df0.h hVar2, c54.b bVar2, df0.p pVar, na0.a aVar4, df0.n nVar2, la0.a aVar5) {
        this.deactivateAppUC = dVar;
        this.observeAllDocumentsUC = qVar;
        this.observeUserCertStatusUC = rVar;
        this.genericDomainError = cVar;
        this.loadAccessTokenUC = aVar2;
        this.renewJuniorCertificateUC = bVar;
        this.mapper = qVar2;
        this.dialogMapper = gVar;
        this.logoutFromAppUC = hVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.shouldShowUserAgreementsUC = xVar;
        this.saveUserAgreementsUC = vVar;
        this.getAvailableDocumentsToAddUC = aVar3;
        this.observeDocumentsToGenerateUC = kVar;
        this.documentDesktopModelMapper = rVar2;
        this.manageDownloadTasksUC = hVar2;
        this.isFeatureEnabledUseCase = bVar2;
        this.resumeDownloadTasksUC = pVar;
        this.fetchAndCacheJuniorSettingsUC = aVar4;
        this.requestDocumentUpdateUC = nVar2;
        this.notificationsInteractor = aVar5;
        ta0.b.c cVar2 = ta0.b.c.f189139a;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: ta0.a0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ba(this.f189134a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), S9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF;
        return (((bVar instanceof dx.b.g.SslCertificate) || (bVar instanceof dx.b.AppUpdateRequired)) && (objF = F(new ta0.a.f.Error(this.genericDomainError.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ta0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.R9((ib4.c.b) obj);
            }
        }, 2, null))), eVar)) == uq.b.e()) ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(ib4.c.b bVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ta0.c.a S9(ta0.b state) {
        return this.mapper.b(new ua0.q.Params(state, b9(ta0.a.f.c.f189113a), b9(ta0.a.c.f189108a), b9(ta0.a.f.i.f189120a), b9(ta0.a.C4914a.f189106a), new er.l() { // from class: ta0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.T9(this.f189197a, (String) obj);
            }
        }, new er.l() { // from class: ta0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.U9(this.f189200a, (sa0.a) obj);
            }
        }, new er.l() { // from class: ta0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.W9(this.f189202a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: ta0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.X9(this.f189204a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: ta0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Y9(this.f189206a, (DesktopDocumentModel) obj);
            }
        }, b9(ta0.a.b.f189107a), b9(ta0.a.f.j.f189121a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(o0 o0Var, String str) {
        o0Var.d9(new ta0.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(final o0 o0Var, sa0.a aVar) {
        o0Var.d9(new ta0.a.ShowDialog(o0Var.dialogMapper.b(new sa0.g.Params(aVar, new er.a() { // from class: ta0.e0
            @Override // er.a
            public final Object a() {
                return o0.V9(this.f189193a);
            }
        }, o0Var.b9(ta0.a.c.f189108a)))));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(o0 o0Var) {
        o0Var.d9(ta0.a.e.f189110a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(o0 o0Var, boolean z15) {
        o0Var.d9(new ta0.a.TermsSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(o0 o0Var, boolean z15) {
        o0Var.d9(new ta0.a.PolicySwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(o0 o0Var, DesktopDocumentModel desktopDocumentModel) {
        o0Var.d9(new ta0.a.ShowDocument(desktopDocumentModel));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.c(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z9(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ta0.o0.a
            if (r0 == 0) goto L13
            r0 = r6
            ta0.o0$a r0 = (ta0.o0.a) r0
            int r1 = r0.f189239f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189239f = r1
            goto L18
        L13:
            ta0.o0$a r0 = new ta0.o0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f189237d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f189239f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L46
        L38:
            oq.u.b(r6)
            la0.a r6 = r5.notificationsInteractor
            r0.f189239f = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            la0.a r6 = r5.notificationsInteractor
            r0.f189239f = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.o0.Z9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(final o0 o0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ta0.b.class), new er.l() { // from class: ta0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ca(this.f189209a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ta0.b.C4917b.class), new er.l() { // from class: ta0.l0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.da((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ta0.b.d.class), new er.l() { // from class: ta0.m0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ea((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ta0.b.c.class), new er.l() { // from class: ta0.n0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.fa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ta0.b.DocumentsLoaded.class), new er.l() { // from class: ta0.b0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ga(this.f189146a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ta0.b.UserAgreements.class), new er.l() { // from class: ta0.c0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ha(this.f189180a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(o0 o0Var, k10.z zVar) {
        zVar.C(o0Var.new e(null));
        f fVar = o0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ta0.a.d.class), oVar, fVar);
        zVar.x(fr.q0.c(ta0.a.m.class), oVar, o0Var.new g(null));
        zVar.x(fr.q0.c(ta0.a.RenewCertAndReloadAccessToken.class), oVar, o0Var.new h(null));
        zVar.x(fr.q0.c(ta0.a.RefreshDocuments.class), oVar, o0Var.new i(null));
        eg0.q qVar = o0Var.observeAllDocumentsUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        k10.k.m(zVar, mu.i.l((mu.g) qVar.a(c1792a), (mu.g) o0Var.observeUserCertStatusUC.a(c1792a), (mu.g) o0Var.observeDocumentsToGenerateUC.a(c1792a), new j(null)), null, o0Var.new k(null), 2, null);
        zVar.x(fr.q0.c(ta0.a.f.class), oVar, o0Var.new l(null));
        zVar.x(fr.q0.c(ta0.a.ShowDialog.class), oVar, o0Var.new m(null));
        zVar.x(fr.q0.c(ta0.a.e.class), oVar, o0Var.new c(null));
        zVar.x(fr.q0.c(ta0.a.c.class), oVar, o0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(k10.z zVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(k10.z zVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(k10.z zVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(o0 o0Var, k10.z zVar) {
        k10.k.m(zVar, o0Var.notificationsInteractor.b(), null, new n(null), 2, null);
        o oVar = o0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ta0.a.ShowDocument.class), oVar2, oVar);
        zVar.x(fr.q0.c(ta0.a.b.class), oVar2, o0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(o0 o0Var, k10.z zVar) {
        q qVar = o0Var.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ta0.a.OpenUrl.class), oVar, qVar);
        zVar.v(fr.q0.c(ta0.a.TermsSwitchChanged.class), oVar, o0Var.new r(null));
        zVar.v(fr.q0.c(ta0.a.PolicySwitchChanged.class), oVar, o0Var.new s(null));
        zVar.v(fr.q0.c(ta0.a.C4914a.class), oVar, o0Var.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ta0.b ia(ta0.b.UserAgreements userAgreements) {
        hz.b invalid;
        boolean z15 = userAgreements.getIsTermsChecked() && userAgreements.getIsPolicyChecked();
        if (z15) {
            invalid = hz.b.d.f86848c;
        } else {
            if (z15) {
                throw new oq.p();
            }
            invalid = new hz.b.Invalid(null, 1, null);
        }
        return ta0.b.UserAgreements.b(userAgreements, null, false, false, false, invalid, 7, null);
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ta0.a.f fVar, tq.e<? super oq.i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    public xw.b<ta0.a.f> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: aa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // l00.g
    protected k10.t<ta0.b, ta0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ta0.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
