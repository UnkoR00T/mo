package dk2;

import androidx.p016lifecycle.u0;
import cb4.DialogData;
import ck2.BiometricPinSetupData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J&\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+*\u0006\u0012\u0002\b\u00030(2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b-\u0010.J*\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020+2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR&\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030i8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010/\u001a\b\u0012\u0004\u0012\u0002040o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006t"}, d2 = {"Ldk2/u;", "Ll00/g;", "Ldk2/c;", "Ldk2/a;", "Ldk2/d;", "", "Lyy/a;", "stateMachineFactory", "Ldk2/b;", "loginViewLifecycleManager", "Lek2/c;", "mapper", "Luj2/b;", "loginToAppUseCase", "Lsj2/a;", "loginInteractor", "Li70/e;", "globalSnackBarManager", "La14/l;", "getImeVisibleStateUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lg04/f;", "checkBiometricRequirementsUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "Lg04/i;", "deactivateBiometricUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Luj2/a;", "biometricLoginToAppUseCase", "Lb14/b;", "getAppVersionUC", "Lac4/e;", "getPartOfTheDayUC", "Lax0/c;", "isAnyMainDocumentDownloadingUC", "<init>", "(Lyy/a;Ldk2/b;Lek2/c;Luj2/b;Lsj2/a;Li70/e;La14/l;Lib4/c;Lg04/f;Lg04/g;Lg04/i;Lac4/a;Luj2/a;Lb14/b;Lac4/e;Lax0/c;)V", "Lk10/c0;", "", "isBiometricEnabled", "Lk10/l;", "Ldk2/c$b$c;", "F9", "(Lk10/c0;ZLtq/e;)Ljava/lang/Object;", "state", "Ldx/b;", "domainError", "K9", "(Lk10/c0;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ldk2/d$a;", "I9", "(Ldk2/c;)Ldk2/d$a;", "Lfk2/a;", "loginRedirect", "Loq/i0;", "M9", "(Lfk2/a;)V", "b", "Lek2/c;", "c", "Luj2/b;", "d", "Lsj2/a;", "e", "Li70/e;", "f", "La14/l;", "g", "Lib4/c;", "h", "Lg04/f;", "j", "Lg04/g;", "k", "Lg04/i;", "l", "Lac4/a;", "m", "Luj2/a;", "n", "Lb14/b;", "p", "Lac4/e;", "q", "Lax0/c;", "Lxw/b;", "Ldk2/a$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Ldk2/c$a;", "s", "Ldk2/c$a;", "initialState", "Loz/j;", "t", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<dk2.c, dk2.a> implements dk2.d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ek2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uj2.b loginToAppUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sj2.a loginInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.l getImeVisibleStateUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g04.f checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g04.i deactivateBiometricUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final uj2.a biometricLoginToAppUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b14.b getAppVersionUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ac4.e getPartOfTheDayUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ax0.c isAnyMainDocumentDownloadingUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dk2.a.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final dk2.c.a initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<dk2.c, dk2.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<dk2.d.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ dk2.b f43239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f43240g;

        /* JADX INFO: renamed from: dk2.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0961a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f43241e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f43242f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u f43243g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0961a(u uVar, tq.e<? super C0961a> eVar) {
                super(2, eVar);
                this.f43243g = uVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f43242f;
                uq.b.e();
                if (this.f43241e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f43243g.d9(dk2.a.j.f43147a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C0961a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C0961a c0961a = new C0961a(this.f43243g, eVar);
                c0961a.f43242f = obj;
                return c0961a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dk2.b bVar, u uVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f43239f = bVar;
            this.f43240g = uVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43238e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(this.f43239f.x8(), new C0961a(this.f43240g, null));
                this.f43238e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f43239f, this.f43240g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43246f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f43248h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43246f = obj;
            this.f43248h |= PKIFailureInfo.systemUnavail;
            return u.this.K9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<dk2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f43249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f43250b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f43251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f43252b;

            /* JADX INFO: renamed from: dk2.u$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0962a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f43253d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f43254e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f43255f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f43257h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f43258j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f43259k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f43260l;

                public C0962a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f43253d = obj;
                    this.f43254e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f43251a = hVar;
                this.f43252b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0962a c0962a;
                if (eVar instanceof C0962a) {
                    c0962a = (C0962a) eVar;
                    int i15 = c0962a.f43254e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0962a.f43254e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0962a = new C0962a(eVar);
                    }
                } else {
                    c0962a = new C0962a(eVar);
                }
                Object obj2 = c0962a.f43253d;
                Object objE = uq.b.e();
                int i16 = c0962a.f43254e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f43251a;
                    dk2.d.a aVarI9 = this.f43252b.I9((dk2.c) obj);
                    c0962a.f43255f = vq.j.a(obj);
                    c0962a.f43257h = vq.j.a(c0962a);
                    c0962a.f43258j = vq.j.a(obj);
                    c0962a.f43259k = vq.j.a(hVar);
                    c0962a.f43260l = 0;
                    c0962a.f43254e = 1;
                    if (hVar.F(aVarI9, c0962a) == objE) {
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

        public c(mu.g gVar, u uVar) {
            this.f43249a = gVar;
            this.f43250b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dk2.d.a> hVar, tq.e eVar) {
            Object objA = this.f43249a.a(new a(hVar, this.f43250b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$a;", "<unused var>", "Ldk2/c;", "Loq/i0;", "<anonymous>", "(Ldk2/a$a;Ldk2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dk2.a.C0954a, dk2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43261e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43261e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.C0955a c0955a = dk2.a.e.C0955a.f43133a;
                this.f43261e = 1;
                if (uVar.F(c0955a, this) == objE) {
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
        public final Object w(dk2.a.C0954a c0954a, dk2.c cVar, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldk2/a$d;", "action", "Ldk2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldk2/a$d;Ldk2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dk2.a.Error, dk2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43264f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(ib4.c.b bVar) {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dk2.a.Error error = (dk2.a.Error) this.f43264f;
            Object objE = uq.b.e();
            int i15 = this.f43263e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.Error error2 = new dk2.a.e.Error(u.this.genericDomainErrorMapper.b(new ib4.c.Params(error.getDomainError(), false, new er.l() { // from class: dk2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.O((ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f43264f = vq.j.a(error);
                this.f43263e = 1;
                if (uVar.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.Error error, dk2.c cVar, tq.e<? super i0> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f43264f = error;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldk2/a$i;", "action", "Ldk2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldk2/a$i;Ldk2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<dk2.a.Setup, dk2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43267f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43269a;

            static {
                int[] iArr = new int[fk2.a.values().length];
                try {
                    iArr[fk2.a.PASSWORD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fk2.a.BIOMETRIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43269a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dk2.a.Setup setup = (dk2.a.Setup) this.f43267f;
            uq.b.e();
            if (this.f43266e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            fk2.a loginRedirect = setup.getLoginRedirect();
            int i15 = loginRedirect == null ? -1 : a.f43269a[loginRedirect.ordinal()];
            if (i15 == -1) {
                u.this.d9(dk2.a.h.f43145a);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    throw new oq.p();
                }
                u.this.d9(dk2.a.h.f43145a);
            } else {
                u.this.d9(dk2.a.b.f43130a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.Setup setup, dk2.c cVar, tq.e<? super i0> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f43267f = setup;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldk2/a$b;", "<unused var>", "Lk10/c0;", "Ldk2/c;", "state", "Lk10/l;", "<anonymous>", "(Ldk2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dk2.a.b, k10.c0<dk2.c>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f43271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43272g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f43272g;
            Object objE = uq.b.e();
            int i15 = this.f43271f;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.g gVar = u.this.checkBiometricStatusUseCase;
                g04.g.Params params = new g04.g.Params(true);
                this.f43272g = c0Var;
                this.f43271f = 1;
                obj = gVar.c(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            e04.e eVar = (e04.e) ((dx.i) obj).a();
            this.f43272g = vq.j.a(c0Var);
            this.f43270e = vq.j.a(eVar);
            this.f43271f = 2;
            Object objF9 = u.this.F9(c0Var, eVar instanceof e04.e.b, this);
            return objF9 == objE ? objE : objF9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.b bVar, k10.c0<dk2.c> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f43272g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldk2/a$k;", "action", "Ldk2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldk2/a$k;Ldk2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dk2.a.ShowBiometricErrorDialog, dk2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43275f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dk2.a.ShowBiometricErrorDialog showBiometricErrorDialog = (dk2.a.ShowBiometricErrorDialog) this.f43275f;
            Object objE = uq.b.e();
            int i15 = this.f43274e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.ShowDialog showDialog = new dk2.a.e.ShowDialog(showBiometricErrorDialog.getNavigationDialogModel());
                this.f43275f = vq.j.a(showBiometricErrorDialog);
                this.f43274e = 1;
                if (uVar.F(showDialog, this) == objE) {
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
        public final Object w(dk2.a.ShowBiometricErrorDialog showBiometricErrorDialog, dk2.c cVar, tq.e<? super i0> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f43275f = showBiometricErrorDialog;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk2/a$h;", "<unused var>", "Lk10/c0;", "Ldk2/c$a;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Ldk2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dk2.a.h, k10.c0<dk2.c.a>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43278f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldk2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends dk2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f43280e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f43281f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f43282g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f43283h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f43284j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f43285k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ u f43286l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<dk2.c.a> f43287m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<dk2.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f43286l = uVar;
                this.f43287m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final dk2.c.b.Biometric V(String str, u uVar, dk2.c.a aVar) {
                return new dk2.c.b.Biometric(str, uVar.getPartOfTheDayUC.a(gz.b.a.C1792a.f78542a));
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0097  */
            /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:37:0x00da  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:50:0x0119  */
            /* JADX WARN: Code duplicated, block: B:55:0x013b  */
            /* JADX WARN: Code duplicated, block: B:57:0x0141  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
            
                if (r10 == r0) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
            
                if (r10 == r0) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
            
                if (r10 == r0) goto L52;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 327
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dk2.u.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f43286l, this.f43287m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends dk2.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f43278f;
            Object objE = uq.b.e();
            int i15 = this.f43277e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f43278f = vq.j.a(c0Var);
            this.f43277e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.h hVar, k10.c0<dk2.c.a> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f43278f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$p;", "<unused var>", "Ldk2/c$b;", "Loq/i0;", "<anonymous>", "(Ldk2/a$p;Ldk2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<dk2.a.p, dk2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43288e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43288e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.f fVar = dk2.a.e.f.f43139a;
                this.f43288e = 1;
                if (uVar.F(fVar, this) == objE) {
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
        public final Object w(dk2.a.p pVar, dk2.c.b bVar, tq.e<? super i0> eVar) {
            return u.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$q;", "<unused var>", "Ldk2/c$b;", "Loq/i0;", "<anonymous>", "(Ldk2/a$q;Ldk2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dk2.a.q, dk2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43290e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43290e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.g gVar = dk2.a.e.g.f43140a;
                this.f43290e = 1;
                if (uVar.F(gVar, this) == objE) {
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
        public final Object w(dk2.a.q qVar, dk2.c.b bVar, tq.e<? super i0> eVar) {
            return u.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$m;", "<unused var>", "Ldk2/c$b;", "Loq/i0;", "<anonymous>", "(Ldk2/a$m;Ldk2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dk2.a.m, dk2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43292e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43292e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.d dVar = dk2.a.e.d.f43136a;
                this.f43292e = 1;
                if (uVar.F(dVar, this) == objE) {
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
        public final Object w(dk2.a.m mVar, dk2.c.b bVar, tq.e<? super i0> eVar) {
            return u.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$l;", "<unused var>", "Ldk2/c$b;", "Loq/i0;", "<anonymous>", "(Ldk2/a$l;Ldk2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<dk2.a.l, dk2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43294e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f43294e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(u.this.mapper.i(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.l lVar, dk2.c.b bVar, tq.e<? super i0> eVar) {
            return u.this.new m(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isImeVisible", "Lk10/c0;", "Ldk2/c$b$c;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<Boolean, k10.c0<dk2.c.b.Password>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f43297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43298g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Password O(boolean z15, dk2.c.b.Password password) {
            return dk2.c.b.Password.d(password, null, null, null, null, z15, false, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f43297f;
            k10.c0 c0Var = (k10.c0) this.f43298g;
            uq.b.e();
            if (this.f43296e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dk2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.n.O(z15, (c.b.Password) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<dk2.c.b.Password> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f43297f = z15;
            nVar.f43298g = c0Var;
            return nVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<dk2.c.b.Password> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk2/a$n;", "<unused var>", "Lk10/c0;", "Ldk2/c$b$c;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Ldk2/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<dk2.a.n, k10.c0<dk2.c.b.Password>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43300f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Biometric O(String str, u uVar, dk2.c.b.Password password) {
            return new dk2.c.b.Biometric(str, uVar.getPartOfTheDayUC.a(gz.b.a.C1792a.f78542a));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f43300f;
            uq.b.e();
            if (this.f43299e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = u.this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: dk2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.o.O(strA, uVar, (c.b.Password) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.n nVar, k10.c0<dk2.c.b.Password> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            o oVar = u.this.new o(eVar);
            oVar.f43300f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk2/a$f;", "action", "Lk10/c0;", "Ldk2/c$b$c;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Ldk2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<dk2.a.OnPasswordTyped, k10.c0<dk2.c.b.Password>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43304g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Password O(dk2.a.OnPasswordTyped onPasswordTyped, dk2.c.b.Password password) {
            return dk2.c.b.Password.d(password, null, null, hz.b.C2039b.f86846c, onPasswordTyped.getPassword(), false, false, 51, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dk2.a.OnPasswordTyped onPasswordTyped = (dk2.a.OnPasswordTyped) this.f43303f;
            k10.c0 c0Var = (k10.c0) this.f43304g;
            uq.b.e();
            if (this.f43302e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dk2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.p.O(onPasswordTyped, (c.b.Password) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.OnPasswordTyped onPasswordTyped, k10.c0<dk2.c.b.Password> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f43303f = onPasswordTyped;
            pVar.f43304g = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk2/a$c;", "<unused var>", "Lk10/c0;", "Ldk2/c$b$c;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Ldk2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<dk2.a.c, k10.c0<dk2.c.b.Password>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f43306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f43307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f43308h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f43309j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f43310k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f43311l;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Password V(u uVar, dk2.c.b.Password password) {
            return dk2.c.b.Password.d(password, null, null, new hz.b.Invalid(uVar.mapper.l()), null, false, false, 59, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Password X(u uVar, dk2.c.b.Password password) {
            return dk2.c.b.Password.d(password, null, null, new hz.b.Invalid(uVar.mapper.m()), null, false, false, 59, null);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0119  */
        /* JADX WARN: Code duplicated, block: B:39:0x0123  */
        /* JADX WARN: Code duplicated, block: B:40:0x0129 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x012b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0135  */
        /* JADX WARN: Code duplicated, block: B:52:0x0166  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            u uVar;
            final u uVar2;
            uj2.b.Result result;
            int i15;
            int i16;
            Object objC;
            u uVar3;
            boolean zBooleanValue;
            k10.c0 c0Var = (k10.c0) this.f43311l;
            Object objE = uq.b.e();
            int i17 = this.f43310k;
            if (i17 == 0) {
                oq.u.b(obj);
                if (fu.r.t0(iy.c0.e(((dk2.c.b.Password) c0Var.a()).getPassword()))) {
                    final u uVar4 = u.this;
                    return c0Var.b(new er.l() { // from class: dk2.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.q.V(uVar4, (c.b.Password) obj2);
                        }
                    });
                }
                uj2.b bVar = u.this.loginToAppUseCase;
                uj2.b.Params params = new uj2.b.Params(((dk2.c.b.Password) c0Var.a()).getPassword());
                this.f43311l = c0Var;
                this.f43310k = 1;
                obj = bVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 != 1) {
                if (i17 == 2) {
                    i15 = this.f43309j;
                    i16 = this.f43308h;
                    result = (uj2.b.Result) this.f43307g;
                    u uVar5 = (u) this.f43306f;
                    iVar = (dx.i) this.f43305e;
                    oq.u.b(obj);
                    uVar = uVar5;
                    ax0.c cVar = uVar.isAnyMainDocumentDownloadingUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f43311l = c0Var;
                    this.f43305e = vq.j.a(iVar);
                    this.f43306f = uVar;
                    this.f43307g = vq.j.a(result);
                    this.f43308h = i16;
                    this.f43309j = i15;
                    this.f43310k = 3;
                    objC = cVar.c(c1792a, this);
                    if (objC != objE) {
                        uVar3 = uVar;
                        obj = objC;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar2 = (u) this.f43306f;
                    oq.u.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        uVar2.d9(dk2.a.m.f43150a);
                    }
                    return c0Var.b(new er.l() { // from class: dk2.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.q.X(uVar2, (c.b.Password) obj2);
                        }
                    });
                }
                uVar3 = (u) this.f43306f;
                oq.u.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    uVar3.d9(dk2.a.q.f43155a);
                } else {
                    if (!zBooleanValue) {
                        throw new oq.p();
                    }
                    uVar3.d9(dk2.a.p.f43154a);
                }
                return c0Var.c();
            }
            oq.u.b(obj);
            iVar = (dx.i) obj;
            uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.d9(new dk2.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            uj2.b.Result result2 = (uj2.b.Result) ((dx.i.Right) iVar).b();
            if (result2.getIsSuccessful()) {
                sj2.a aVar = uVar.loginInteractor;
                this.f43311l = c0Var;
                this.f43305e = vq.j.a(iVar);
                this.f43306f = uVar;
                this.f43307g = vq.j.a(result2);
                this.f43308h = 0;
                this.f43309j = 0;
                this.f43310k = 2;
                if (aVar.a(this) != objE) {
                    result = result2;
                    i15 = 0;
                    i16 = 0;
                    ax0.c cVar2 = uVar.isAnyMainDocumentDownloadingUC;
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    this.f43311l = c0Var;
                    this.f43305e = vq.j.a(iVar);
                    this.f43306f = uVar;
                    this.f43307g = vq.j.a(result);
                    this.f43308h = i16;
                    this.f43309j = i15;
                    this.f43310k = 3;
                    objC = cVar2.c(c1792a2, this);
                    if (objC != objE) {
                        uVar3 = uVar;
                        obj = objC;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (zBooleanValue) {
                            uVar3.d9(dk2.a.q.f43155a);
                        } else {
                            if (!zBooleanValue) {
                                throw new oq.p();
                            }
                            uVar3.d9(dk2.a.p.f43154a);
                        }
                        return c0Var.c();
                    }
                }
            } else {
                sj2.a aVar2 = uVar.loginInteractor;
                this.f43311l = c0Var;
                this.f43305e = vq.j.a(iVar);
                this.f43306f = uVar;
                this.f43307g = vq.j.a(result2);
                this.f43308h = 0;
                this.f43309j = 0;
                this.f43310k = 4;
                Object objB = aVar2.b(this);
                if (objB != objE) {
                    uVar2 = uVar;
                    obj = objB;
                    if (((Boolean) obj).booleanValue()) {
                        uVar2.d9(dk2.a.m.f43150a);
                    }
                    return c0Var.b(new er.l() { // from class: dk2.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.q.X(uVar2, (c.b.Password) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.c cVar, k10.c0<dk2.c.b.Password> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            q qVar = u.this.new q(eVar);
            qVar.f43311l = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldk2/a$g;", "<unused var>", "Ldk2/c$b$c;", "Loq/i0;", "<anonymous>", "(Ldk2/a$g;Ldk2/c$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<dk2.a.g, dk2.c.b.Password, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43313e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f43313e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.h hVar = dk2.a.e.h.f43141a;
                this.f43313e = 1;
                if (uVar.F(hVar, this) == objE) {
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
        public final Object w(dk2.a.g gVar, dk2.c.b.Password password, tq.e<? super i0> eVar) {
            return u.this.new r(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldk2/a$j;", "<unused var>", "Lk10/c0;", "Ldk2/c$b$a;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Ldk2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<dk2.a.j, k10.c0<dk2.c.b.Biometric>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43316f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.BiometricAuthenticationInProgress O(k10.c0 c0Var, dk2.c.b.Biometric biometric) {
            return new dk2.c.b.BiometricAuthenticationInProgress(((dk2.c.b.Biometric) c0Var.a()).getAppVersion(), ((dk2.c.b.Biometric) c0Var.a()).getPartOfTheDay());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f43316f;
            uq.b.e();
            if (this.f43315e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: dk2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.s.O(c0Var, (c.b.Biometric) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dk2.a.j jVar, k10.c0<dk2.c.b.Biometric> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            s sVar = new s(eVar);
            sVar.f43316f = c0Var;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldk2/a$o;", "action", "Ldk2/c$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldk2/a$o;Ldk2/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<dk2.a.ToBiometricPin, dk2.c.b.BiometricAuthenticationInProgress, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43318f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dk2.a.ToBiometricPin toBiometricPin = (dk2.a.ToBiometricPin) this.f43318f;
            Object objE = uq.b.e();
            int i15 = this.f43317e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dk2.a.e.ToBiometricPin toBiometricPin2 = new dk2.a.e.ToBiometricPin(new BiometricPinSetupData(toBiometricPin.getBiometricResult()));
                this.f43318f = vq.j.a(toBiometricPin);
                this.f43317e = 1;
                if (uVar.F(toBiometricPin2, this) == objE) {
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
        public final Object w(dk2.a.ToBiometricPin toBiometricPin, dk2.c.b.BiometricAuthenticationInProgress biometricAuthenticationInProgress, tq.e<? super i0> eVar) {
            t tVar = u.this.new t(eVar);
            tVar.f43318f = toBiometricPin;
            return tVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: dk2.u$u, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ldk2/c$b$b;", "state", "Lk10/l;", "Ldk2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C0963u extends vq.k implements er.p<k10.c0<dk2.c.b.BiometricAuthenticationInProgress>, tq.e<? super k10.l<? extends dk2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f43321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f43322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f43323h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f43324j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f43325k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f43326l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f43327m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43328n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f43329p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f43330q;

        C0963u(tq.e<? super C0963u> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dk2.c.b.Biometric O(k10.c0 c0Var, dk2.c.b.BiometricAuthenticationInProgress biometricAuthenticationInProgress) {
            return new dk2.c.b.Biometric(((dk2.c.b.BiometricAuthenticationInProgress) c0Var.a()).getAppVersion(), ((dk2.c.b.BiometricAuthenticationInProgress) c0Var.a()).getPartOfTheDay());
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:22:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:27:0x0106  */
        /* JADX WARN: Code duplicated, block: B:30:0x0110  */
        /* JADX WARN: Code duplicated, block: B:35:0x014d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0151  */
        /* JADX WARN: Code duplicated, block: B:39:0x015e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0171  */
        /* JADX WARN: Code duplicated, block: B:43:0x0175  */
        /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:49:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:50:0x01b8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:54:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:56:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:61:0x0204  */
        /* JADX WARN: Code duplicated, block: B:64:0x020d  */
        /* JADX WARN: Code duplicated, block: B:66:0x0215  */
        /* JADX WARN: Code duplicated, block: B:68:0x021f  */
        /* JADX WARN: Code duplicated, block: B:70:0x0225  */
        /* JADX WARN: Code duplicated, block: B:72:0x022b  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
        
            if (r13 == r1) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0146, code lost:
        
            if (r13 == r1) goto L60;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 580
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dk2.u.C0963u.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<dk2.c.b.BiometricAuthenticationInProgress> c0Var, tq.e<? super k10.l<? extends dk2.c>> eVar) {
            return ((C0963u) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C0963u c0963u = u.this.new C0963u(eVar);
            c0963u.f43330q = obj;
            return c0963u;
        }
    }

    public u(yy.a aVar, dk2.b bVar, ek2.c cVar, uj2.b bVar2, sj2.a aVar2, i70.e eVar, a14.l lVar, ib4.c cVar2, g04.f fVar, g04.g gVar, g04.i iVar, ac4.a aVar3, uj2.a aVar4, b14.b bVar3, ac4.e eVar2, ax0.c cVar3) {
        this.mapper = cVar;
        this.loginToAppUseCase = bVar2;
        this.loginInteractor = aVar2;
        this.globalSnackBarManager = eVar;
        this.getImeVisibleStateUseCase = lVar;
        this.genericDomainErrorMapper = cVar2;
        this.checkBiometricRequirementsUseCase = fVar;
        this.checkBiometricStatusUseCase = gVar;
        this.deactivateBiometricUseCase = iVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.biometricLoginToAppUseCase = aVar4;
        this.getAppVersionUC = bVar3;
        this.getPartOfTheDayUC = eVar2;
        this.isAnyMainDocumentDownloadingUC = cVar3;
        dk2.c.a aVar5 = dk2.c.a.f43159a;
        this.initialState = aVar5;
        this.lifecycleConnector = bVar.a();
        ju.k.d(u0.a(this), null, null, new a(bVar, this, null), 3, null);
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: dk2.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9(this.f43209a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), I9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(k10.c0<?> c0Var, final boolean z15, tq.e<? super k10.l<dk2.c.b.Password>> eVar) {
        final String strA = this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
        return c0Var.d(new er.l() { // from class: dk2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f43216a, strA, z15, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk2.c.b.Password G9(u uVar, String str, boolean z15, Object obj) {
        return new dk2.c.b.Password(str, uVar.getPartOfTheDayUC.a(gz.b.a.C1792a.f78542a), hz.b.C2039b.f86846c, iy.b0.INSTANCE.a(), false, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dk2.d.a I9(dk2.c state) {
        return this.mapper.b(new ek2.c.Params(state, b9(dk2.a.b.f43130a), new er.l() { // from class: dk2.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f43210a, (iy.b0) obj);
            }
        }, b9(dk2.a.g.f43144a), b9(dk2.a.c.f43131a), b9(dk2.a.C0954a.f43129a), b9(dk2.a.j.f43147a), b9(dk2.a.n.f43151a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, iy.b0 b0Var) {
        uVar.d9(new dk2.a.OnPasswordTyped(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K9(k10.c0<?> c0Var, dx.b bVar, tq.e<? super k10.l<? extends dk2.c>> eVar) throws Throwable {
        b bVar2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f43248h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f43248h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object obj = bVar2.f43246f;
        Object objE = uq.b.e();
        int i16 = bVar2.f43248h;
        if (i16 == 0) {
            oq.u.b(obj);
            g04.i iVar = this.deactivateBiometricUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar2.f43244d = c0Var;
            bVar2.f43245e = bVar;
            bVar2.f43248h = 1;
            if (iVar.c(c1792a, bVar2) != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return obj;
        }
        bVar = (dx.b) bVar2.f43245e;
        c0Var = (k10.c0) bVar2.f43244d;
        oq.u.b(obj);
        DialogData dialogDataF = this.mapper.f(bVar);
        if (dialogDataF != null) {
            d9(new dk2.a.ShowBiometricErrorDialog(dialogDataF));
        } else {
            d9(new dk2.a.Error(bVar));
            c0Var.c();
        }
        bVar2.f43244d = vq.j.a(c0Var);
        bVar2.f43245e = vq.j.a(bVar);
        bVar2.f43248h = 2;
        Object objF9 = F9(c0Var, false, bVar2);
        return objF9 == objE ? objE : objF9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(dk2.c.class), new er.l() { // from class: dk2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.O9(this.f43211a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dk2.c.a.class), new er.l() { // from class: dk2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f43212a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dk2.c.b.class), new er.l() { // from class: dk2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f43213a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dk2.c.b.Password.class), new er.l() { // from class: dk2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f43214a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dk2.c.b.Biometric.class), new er.l() { // from class: dk2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.S9((k10.z) obj);
            }
        });
        vVar.c(q0.c(dk2.c.b.BiometricAuthenticationInProgress.class), new er.l() { // from class: dk2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.T9(this.f43215a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dk2.a.C0954a.class), oVar, dVar);
        zVar.x(q0.c(dk2.a.Error.class), oVar, uVar.new e(null));
        zVar.x(q0.c(dk2.a.Setup.class), oVar, uVar.new f(null));
        zVar.v(q0.c(dk2.a.b.class), oVar, uVar.new g(null));
        zVar.x(q0.c(dk2.a.ShowBiometricErrorDialog.class), oVar, uVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(u uVar, k10.z zVar) {
        i iVar = uVar.new i(null);
        zVar.v(q0.c(dk2.a.h.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(u uVar, k10.z zVar) {
        j jVar = uVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dk2.a.p.class), oVar, jVar);
        zVar.x(q0.c(dk2.a.q.class), oVar, uVar.new k(null));
        zVar.x(q0.c(dk2.a.m.class), oVar, uVar.new l(null));
        zVar.x(q0.c(dk2.a.l.class), oVar, uVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(u uVar, k10.z zVar) {
        k10.k.m(zVar, (mu.g) uVar.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new n(null), 2, null);
        o oVar = uVar.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(dk2.a.n.class), oVar2, oVar);
        zVar.v(q0.c(dk2.a.OnPasswordTyped.class), oVar2, new p(null));
        zVar.v(q0.c(dk2.a.c.class), oVar2, uVar.new q(null));
        zVar.x(q0.c(dk2.a.g.class), oVar2, uVar.new r(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(k10.z zVar) {
        s sVar = new s(null);
        zVar.v(q0.c(dk2.a.j.class), k10.o.CANCEL_PREVIOUS, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(u uVar, k10.z zVar) {
        t tVar = uVar.new t(null);
        zVar.x(q0.c(dk2.a.ToBiometricPin.class), k10.o.CANCEL_PREVIOUS, tVar);
        zVar.A(uVar.new C0963u(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dk2.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(dk2.d.a aVar) {
        super.P5(aVar);
    }

    public final void M9(fk2.a loginRedirect) {
        d9(new dk2.a.Setup(loginRedirect));
    }

    @Override // zx.b
    public xw.b<dk2.a.e> Y1() {
        return this.navAction;
    }

    @Override // dk2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<dk2.c, dk2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dk2.d.a> getState() {
        return this.state;
    }
}
