package mc0;

import androidx.p016lifecycle.u0;
import cf0.DownloadTaskData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0081\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020501H\u0096\u0001¢\u0006\u0004\b6\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR \u0010(\u001a\b\u0012\u0004\u0012\u00020.0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006o"}, d2 = {"Lmc0/t;", "Ll00/g;", "Lmc0/j;", "Lmc0/i;", "Lmc0/k;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lb14/b;", "getAppVersionUC", "Lqg0/g;", "loginToAppUC", "Lnc0/c;", "mapper", "Lmx/c;", "labelProvider", "Lac4/a;", "callActionWithLoaderUseCase", "Ldf0/d;", "getMainDocumentActiveTaskDataUC", "Lsc0/a;", "getLockStateAfterAuthorizationFailedUC", "Lsc0/c;", "resetLoginLockCountsUC", "Lqb4/h;", "logInWithBiometricUseCase", "Lqb4/g;", "getBiometricStatusUseCase", "Lqb4/e;", "deactivateBiometricUseCase", "Lcb4/j;", "dialogVMSFactory", "Lqb4/c;", "checkBiometricRequirementsUseCase", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Lyy/a;Lb14/b;Lqg0/g;Lnc0/c;Lmx/c;Lac4/a;Ldf0/d;Lsc0/a;Lsc0/c;Lqb4/h;Lqb4/g;Lqb4/e;Lcb4/j;Lqb4/c;Loz/q;)V", "Lk10/c0;", "state", "Ldx/b;", "domainError", "Lk10/l;", "D9", "(Lk10/c0;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lmc0/k$a;", "B9", "(Lmc0/j;)Lmc0/k$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lb14/b;", "c", "Lqg0/g;", "d", "Lnc0/c;", "e", "Lmx/c;", "f", "Lac4/a;", "g", "Ldf0/d;", "h", "Lsc0/a;", "j", "Lsc0/c;", "k", "Lqb4/h;", "l", "Lqb4/g;", "m", "Lqb4/e;", "n", "Lcb4/j;", "p", "Lqb4/c;", "q", "Loz/q;", "Lmc0/j$a;", "r", "Lmc0/j$a;", "initialState", "Lxw/b;", "Lmc0/i$d;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loz/j;", "t", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<mc0.j, mc0.i> implements mc0.k, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b14.b getAppVersionUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qg0.g loginToAppUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nc0.c mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final df0.d getMainDocumentActiveTaskDataUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sc0.a getLockStateAfterAuthorizationFailedUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final sc0.c resetLoginLockCountsUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final qb4.h logInWithBiometricUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final qb4.g getBiometricStatusUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final qb4.e deactivateBiometricUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final qb4.c checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mc0.j.a initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mc0.i.d> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mc0.j, mc0.i> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<mc0.k.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125456e;

        /* JADX INFO: renamed from: mc0.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3089a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f125458e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f125459f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ t f125460g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3089a(t tVar, tq.e<? super C3089a> eVar) {
                super(2, eVar);
                this.f125460g = tVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f125459f;
                uq.b.e();
                if (this.f125458e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f125460g.d9(mc0.i.g.f125396a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C3089a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C3089a c3089a = new C3089a(this.f125460g, eVar);
                c3089a.f125459f = obj;
                return c3089a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f125456e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(t.this.x8(), new C3089a(t.this, null));
                this.f125456e = 1;
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
            return t.this.new a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f125461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f125462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125463f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f125465h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f125463f = obj;
            this.f125465h |= PKIFailureInfo.systemUnavail;
            return t.this.D9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<mc0.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f125466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f125467b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f125468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f125469b;

            /* JADX INFO: renamed from: mc0.t$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3090a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f125470d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f125471e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f125472f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f125474h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f125475j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f125476k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f125477l;

                public C3090a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f125470d = obj;
                    this.f125471e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f125468a = hVar;
                this.f125469b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3090a c3090a;
                if (eVar instanceof C3090a) {
                    c3090a = (C3090a) eVar;
                    int i15 = c3090a.f125471e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3090a.f125471e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3090a = new C3090a(eVar);
                    }
                } else {
                    c3090a = new C3090a(eVar);
                }
                Object obj2 = c3090a.f125470d;
                Object objE = uq.b.e();
                int i16 = c3090a.f125471e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f125468a;
                    mc0.k.a aVarB9 = this.f125469b.B9((mc0.j) obj);
                    c3090a.f125472f = vq.j.a(obj);
                    c3090a.f125474h = vq.j.a(c3090a);
                    c3090a.f125475j = vq.j.a(obj);
                    c3090a.f125476k = vq.j.a(hVar);
                    c3090a.f125477l = 0;
                    c3090a.f125471e = 1;
                    if (hVar.F(aVarB9, c3090a) == objE) {
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

        public c(mu.g gVar, t tVar) {
            this.f125466a = gVar;
            this.f125467b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mc0.k.a> hVar, tq.e eVar) {
            Object objA = this.f125466a.a(new a(hVar, this.f125467b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmc0/j$a;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<mc0.j.a>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f125478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f125479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f125480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f125481h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f125482j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f125483k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f125484l;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.BiometricAuthenticationInProgress V(String str, mc0.j.a aVar) {
            return new mc0.j.b.BiometricAuthenticationInProgress(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.Password X(String str, mc0.j.a aVar) {
            return new mc0.j.b.Password(str, null, null, false, null, 22, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
        
            if (r10 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
        
            if (r10 == r1) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mc0.t.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mc0.j.a> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f125484l = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$f;", "action", "Lk10/c0;", "Lmc0/j$b$c;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mc0.i.OnPinChanged, k10.c0<mc0.j.b.Password>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f125488g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.Password V(mc0.i.OnPinChanged onPinChanged, mc0.j.b.Password password) {
            return mc0.j.b.Password.c(password, null, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, false, null, 25, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.Password X(mc0.i.OnPinChanged onPinChanged, mc0.j.b.Password password) {
            return mc0.j.b.Password.c(password, null, onPinChanged.getPinValue(), null, false, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mc0.i.OnPinChanged onPinChanged = (mc0.i.OnPinChanged) this.f125487f;
            k10.c0 c0Var = (k10.c0) this.f125488g;
            uq.b.e();
            if (this.f125486e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (onPinChanged.getPinValue().getData().length < 6) {
                return c0Var.b(new er.l() { // from class: mc0.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.e.V(onPinChanged, (j.b.Password) obj2);
                    }
                });
            }
            t.this.d9(mc0.i.c.f125387a);
            return c0Var.b(new er.l() { // from class: mc0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.X(onPinChanged, (j.b.Password) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.OnPinChanged onPinChanged, k10.c0<mc0.j.b.Password> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f125487f = onPinChanged;
            eVar2.f125488g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$c;", "<unused var>", "Lk10/c0;", "Lmc0/j$b$c;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mc0.i.c, k10.c0<mc0.j.b.Password>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125491f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmc0/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends mc0.j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f125493e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f125494f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f125495g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f125496h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f125497j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f125498k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f125499l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f125500m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f125501n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f125502p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ t f125503q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k10.c0<mc0.j.b.Password> f125504r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, k10.c0<mc0.j.b.Password> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f125503q = tVar;
                this.f125504r = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mc0.j.b.Password V(t tVar, mc0.j.b.Password password) {
                return mc0.j.b.Password.c(password, null, iy.b0.INSTANCE.a(), new hz.b.Invalid(tVar.labelProvider.c(jc0.a.f101403j)), false, null, 25, null);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:21:0x0115  */
            /* JADX WARN: Code duplicated, block: B:24:0x0121  */
            /* JADX WARN: Code duplicated, block: B:27:0x014e  */
            /* JADX WARN: Code duplicated, block: B:31:0x015a  */
            /* JADX WARN: Code duplicated, block: B:33:0x015e  */
            /* JADX WARN: Code duplicated, block: B:36:0x018c  */
            /* JADX WARN: Code duplicated, block: B:40:0x01b5 A[PHI: r1 r3 r4 r5 r6 r7 r12
              0x01b5: PHI (r1v24 int) = (r1v22 int), (r1v25 int) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r3v16 int) = (r3v14 int), (r3v17 int) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r4v12 oq.i0) = (r4v9 oq.i0), (r4v16 oq.i0) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r5v9 k10.c0<mc0.j$b$c>) = (r5v6 k10.c0<mc0.j$b$c>), (r5v11 k10.c0<mc0.j$b$c>) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r6v17 mc0.t) = (r6v14 mc0.t), (r6v21 mc0.t) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r7v9 dx.i) = (r7v6 dx.i), (r7v13 dx.i) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x01b5: PHI (r12v17 java.lang.Object) = (r12v16 java.lang.Object), (r12v0 java.lang.Object) binds: [B:38:0x01b1, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:42:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:45:0x01f6  */
            /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
            /* JADX WARN: Code duplicated, block: B:50:0x0200  */
            /* JADX WARN: Code duplicated, block: B:53:0x023b  */
            /* JADX WARN: Code duplicated, block: B:56:0x0241  */
            /* JADX WARN: Code duplicated, block: B:58:0x0247  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                t tVar;
                k10.c0<mc0.j.b.Password> c0Var;
                i0 i0Var;
                sc0.c cVar;
                gz.b.a.C1792a c1792a;
                t tVar2;
                i0 i0Var2;
                int i15;
                int i16;
                dx.b bVar;
                Object objC;
                final t tVar3;
                int i17;
                dx.b bVar2;
                int i18;
                rc0.b bVar3;
                xw.b<mc0.i.d> bVarY1;
                mc0.i.d.C3085d c3085d;
                k10.c0<mc0.j.b.Password> c0Var2;
                dx.i iVar2;
                xw.b<mc0.i.d> bVarY2;
                mc0.i.d.b bVar4;
                k10.c0<mc0.j.b.Password> c0Var3;
                xw.b<mc0.i.d> bVarY3;
                mc0.i.d.c cVar2;
                k10.c0<mc0.j.b.Password> c0Var4;
                Object objE = uq.b.e();
                switch (this.f125502p) {
                    case 0:
                        oq.u.b(obj);
                        qg0.g gVar = this.f125503q.loginToAppUC;
                        qg0.g.Params params = new qg0.g.Params(this.f125504r.a().getPinValue());
                        this.f125502p = 1;
                        obj = gVar.c(params, this);
                        if (obj != objE) {
                            iVar = (dx.i) obj;
                            tVar = this.f125503q;
                            c0Var = this.f125504r;
                            if (iVar instanceof dx.i.Left) {
                                bVar = (dx.b) ((dx.i.Left) iVar).b();
                                sc0.a aVar = tVar.getLockStateAfterAuthorizationFailedUC;
                                sc0.a.Params params2 = new sc0.a.Params(rc0.a.PIN);
                                this.f125493e = vq.j.a(iVar);
                                this.f125494f = tVar;
                                this.f125495g = c0Var;
                                this.f125496h = vq.j.a(bVar);
                                this.f125498k = 0;
                                this.f125499l = 0;
                                this.f125502p = 2;
                                objC = aVar.c(params2, this);
                                if (objC != objE) {
                                    tVar3 = tVar;
                                    obj = objC;
                                    i17 = 0;
                                    bVar2 = bVar;
                                    i18 = 0;
                                    bVar3 = (rc0.b) obj;
                                    if (bVar3 == rc0.b.EXCEEDED) {
                                        bVarY1 = tVar3.Y1();
                                        c3085d = mc0.i.d.C3085d.f125391a;
                                        this.f125493e = vq.j.a(iVar);
                                        this.f125494f = tVar3;
                                        this.f125495g = c0Var;
                                        this.f125496h = vq.j.a(bVar2);
                                        this.f125497j = vq.j.a(bVar3);
                                        this.f125498k = i18;
                                        this.f125499l = i17;
                                        this.f125500m = 0;
                                        this.f125502p = 3;
                                        if (bVarY1.F(c3085d, this) != objE) {
                                            c0Var2 = c0Var;
                                            c0Var = c0Var2;
                                        }
                                    }
                                    return c0Var.b(new er.l() { // from class: mc0.y
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return t.f.a.V(tVar3, (j.b.Password) obj2);
                                        }
                                    });
                                }
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i0Var = (i0) ((dx.i.Right) iVar).b();
                                cVar = tVar.resetLoginLockCountsUC;
                                c1792a = gz.b.a.C1792a.f78542a;
                                this.f125493e = vq.j.a(iVar);
                                this.f125494f = tVar;
                                this.f125495g = c0Var;
                                this.f125496h = vq.j.a(i0Var);
                                this.f125498k = 0;
                                this.f125499l = 0;
                                this.f125502p = 4;
                                if (cVar.c(c1792a, this) != objE) {
                                    tVar2 = tVar;
                                    i0Var2 = i0Var;
                                    i15 = 0;
                                    i16 = 0;
                                    df0.d dVar = tVar2.getMainDocumentActiveTaskDataUC;
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    this.f125493e = vq.j.a(iVar);
                                    this.f125494f = tVar2;
                                    this.f125495g = c0Var;
                                    this.f125496h = vq.j.a(i0Var2);
                                    this.f125498k = i16;
                                    this.f125499l = i15;
                                    this.f125502p = 5;
                                    obj = dVar.c(c1792a2, this);
                                    if (obj != objE) {
                                        iVar2 = (dx.i) obj;
                                        if (iVar2 instanceof dx.i.Left) {
                                            dx.b bVar5 = (dx.b) ((dx.i.Left) iVar2).b();
                                            bVarY3 = tVar2.Y1();
                                            cVar2 = mc0.i.d.c.f125390a;
                                            this.f125493e = vq.j.a(iVar);
                                            this.f125494f = c0Var;
                                            this.f125495g = vq.j.a(i0Var2);
                                            this.f125496h = vq.j.a(iVar2);
                                            this.f125497j = vq.j.a(bVar5);
                                            this.f125498k = i16;
                                            this.f125499l = i15;
                                            this.f125500m = 0;
                                            this.f125501n = 0;
                                            this.f125502p = 6;
                                            if (bVarY3.F(cVar2, this) != objE) {
                                                c0Var4 = c0Var;
                                                return c0Var4.c();
                                            }
                                        } else {
                                            if (iVar2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            DownloadTaskData downloadTaskData = (DownloadTaskData) ((dx.i.Right) iVar2).b();
                                            bVarY2 = tVar2.Y1();
                                            bVar4 = mc0.i.d.b.f125389a;
                                            this.f125493e = vq.j.a(iVar);
                                            this.f125494f = c0Var;
                                            this.f125495g = vq.j.a(i0Var2);
                                            this.f125496h = vq.j.a(iVar2);
                                            this.f125497j = vq.j.a(downloadTaskData);
                                            this.f125498k = i16;
                                            this.f125499l = i15;
                                            this.f125500m = 0;
                                            this.f125501n = 0;
                                            this.f125502p = 7;
                                            if (bVarY2.F(bVar4, this) != objE) {
                                                c0Var3 = c0Var;
                                                return c0Var3.c();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return objE;
                    case 1:
                        oq.u.b(obj);
                        iVar = (dx.i) obj;
                        tVar = this.f125503q;
                        c0Var = this.f125504r;
                        if (iVar instanceof dx.i.Left) {
                            bVar = (dx.b) ((dx.i.Left) iVar).b();
                            sc0.a aVar2 = tVar.getLockStateAfterAuthorizationFailedUC;
                            sc0.a.Params params3 = new sc0.a.Params(rc0.a.PIN);
                            this.f125493e = vq.j.a(iVar);
                            this.f125494f = tVar;
                            this.f125495g = c0Var;
                            this.f125496h = vq.j.a(bVar);
                            this.f125498k = 0;
                            this.f125499l = 0;
                            this.f125502p = 2;
                            objC = aVar2.c(params3, this);
                            if (objC != objE) {
                                tVar3 = tVar;
                                obj = objC;
                                i17 = 0;
                                bVar2 = bVar;
                                i18 = 0;
                                bVar3 = (rc0.b) obj;
                                if (bVar3 == rc0.b.EXCEEDED) {
                                    bVarY1 = tVar3.Y1();
                                    c3085d = mc0.i.d.C3085d.f125391a;
                                    this.f125493e = vq.j.a(iVar);
                                    this.f125494f = tVar3;
                                    this.f125495g = c0Var;
                                    this.f125496h = vq.j.a(bVar2);
                                    this.f125497j = vq.j.a(bVar3);
                                    this.f125498k = i18;
                                    this.f125499l = i17;
                                    this.f125500m = 0;
                                    this.f125502p = 3;
                                    if (bVarY1.F(c3085d, this) != objE) {
                                        c0Var2 = c0Var;
                                        c0Var = c0Var2;
                                    }
                                }
                                return c0Var.b(new er.l() { // from class: mc0.y
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return t.f.a.V(tVar3, (j.b.Password) obj2);
                                    }
                                });
                            }
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            i0Var = (i0) ((dx.i.Right) iVar).b();
                            cVar = tVar.resetLoginLockCountsUC;
                            c1792a = gz.b.a.C1792a.f78542a;
                            this.f125493e = vq.j.a(iVar);
                            this.f125494f = tVar;
                            this.f125495g = c0Var;
                            this.f125496h = vq.j.a(i0Var);
                            this.f125498k = 0;
                            this.f125499l = 0;
                            this.f125502p = 4;
                            if (cVar.c(c1792a, this) != objE) {
                                tVar2 = tVar;
                                i0Var2 = i0Var;
                                i15 = 0;
                                i16 = 0;
                                df0.d dVar2 = tVar2.getMainDocumentActiveTaskDataUC;
                                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                this.f125493e = vq.j.a(iVar);
                                this.f125494f = tVar2;
                                this.f125495g = c0Var;
                                this.f125496h = vq.j.a(i0Var2);
                                this.f125498k = i16;
                                this.f125499l = i15;
                                this.f125502p = 5;
                                obj = dVar2.c(c1792a3, this);
                                if (obj != objE) {
                                    iVar2 = (dx.i) obj;
                                    if (iVar2 instanceof dx.i.Left) {
                                        dx.b bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                        bVarY3 = tVar2.Y1();
                                        cVar2 = mc0.i.d.c.f125390a;
                                        this.f125493e = vq.j.a(iVar);
                                        this.f125494f = c0Var;
                                        this.f125495g = vq.j.a(i0Var2);
                                        this.f125496h = vq.j.a(iVar2);
                                        this.f125497j = vq.j.a(bVar6);
                                        this.f125498k = i16;
                                        this.f125499l = i15;
                                        this.f125500m = 0;
                                        this.f125501n = 0;
                                        this.f125502p = 6;
                                        if (bVarY3.F(cVar2, this) != objE) {
                                            c0Var4 = c0Var;
                                            return c0Var4.c();
                                        }
                                    } else {
                                        if (iVar2 instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        DownloadTaskData downloadTaskData2 = (DownloadTaskData) ((dx.i.Right) iVar2).b();
                                        bVarY2 = tVar2.Y1();
                                        bVar4 = mc0.i.d.b.f125389a;
                                        this.f125493e = vq.j.a(iVar);
                                        this.f125494f = c0Var;
                                        this.f125495g = vq.j.a(i0Var2);
                                        this.f125496h = vq.j.a(iVar2);
                                        this.f125497j = vq.j.a(downloadTaskData2);
                                        this.f125498k = i16;
                                        this.f125499l = i15;
                                        this.f125500m = 0;
                                        this.f125501n = 0;
                                        this.f125502p = 7;
                                        if (bVarY2.F(bVar4, this) != objE) {
                                            c0Var3 = c0Var;
                                            return c0Var3.c();
                                        }
                                    }
                                }
                            }
                        }
                        return objE;
                    case 2:
                        int i19 = this.f125499l;
                        int i25 = this.f125498k;
                        dx.b bVar7 = (dx.b) this.f125496h;
                        c0Var = (k10.c0) this.f125495g;
                        t tVar4 = (t) this.f125494f;
                        iVar = (dx.i) this.f125493e;
                        oq.u.b(obj);
                        i17 = i19;
                        tVar3 = tVar4;
                        bVar2 = bVar7;
                        i18 = i25;
                        bVar3 = (rc0.b) obj;
                        if (bVar3 == rc0.b.EXCEEDED) {
                            bVarY1 = tVar3.Y1();
                            c3085d = mc0.i.d.C3085d.f125391a;
                            this.f125493e = vq.j.a(iVar);
                            this.f125494f = tVar3;
                            this.f125495g = c0Var;
                            this.f125496h = vq.j.a(bVar2);
                            this.f125497j = vq.j.a(bVar3);
                            this.f125498k = i18;
                            this.f125499l = i17;
                            this.f125500m = 0;
                            this.f125502p = 3;
                            if (bVarY1.F(c3085d, this) != objE) {
                                c0Var2 = c0Var;
                                c0Var = c0Var2;
                            }
                            return objE;
                        }
                        return c0Var.b(new er.l() { // from class: mc0.y
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.f.a.V(tVar3, (j.b.Password) obj2);
                            }
                        });
                    case 3:
                        c0Var2 = (k10.c0) this.f125495g;
                        tVar3 = (t) this.f125494f;
                        oq.u.b(obj);
                        c0Var = c0Var2;
                        return c0Var.b(new er.l() { // from class: mc0.y
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.f.a.V(tVar3, (j.b.Password) obj2);
                            }
                        });
                    case 4:
                        i15 = this.f125499l;
                        i16 = this.f125498k;
                        i0Var2 = (i0) this.f125496h;
                        c0Var = (k10.c0) this.f125495g;
                        tVar2 = (t) this.f125494f;
                        iVar = (dx.i) this.f125493e;
                        oq.u.b(obj);
                        df0.d dVar3 = tVar2.getMainDocumentActiveTaskDataUC;
                        gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                        this.f125493e = vq.j.a(iVar);
                        this.f125494f = tVar2;
                        this.f125495g = c0Var;
                        this.f125496h = vq.j.a(i0Var2);
                        this.f125498k = i16;
                        this.f125499l = i15;
                        this.f125502p = 5;
                        obj = dVar3.c(c1792a4, this);
                        if (obj != objE) {
                            iVar2 = (dx.i) obj;
                            if (iVar2 instanceof dx.i.Left) {
                                dx.b bVar8 = (dx.b) ((dx.i.Left) iVar2).b();
                                bVarY3 = tVar2.Y1();
                                cVar2 = mc0.i.d.c.f125390a;
                                this.f125493e = vq.j.a(iVar);
                                this.f125494f = c0Var;
                                this.f125495g = vq.j.a(i0Var2);
                                this.f125496h = vq.j.a(iVar2);
                                this.f125497j = vq.j.a(bVar8);
                                this.f125498k = i16;
                                this.f125499l = i15;
                                this.f125500m = 0;
                                this.f125501n = 0;
                                this.f125502p = 6;
                                if (bVarY3.F(cVar2, this) != objE) {
                                    c0Var4 = c0Var;
                                    return c0Var4.c();
                                }
                            } else {
                                if (iVar2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                DownloadTaskData downloadTaskData3 = (DownloadTaskData) ((dx.i.Right) iVar2).b();
                                bVarY2 = tVar2.Y1();
                                bVar4 = mc0.i.d.b.f125389a;
                                this.f125493e = vq.j.a(iVar);
                                this.f125494f = c0Var;
                                this.f125495g = vq.j.a(i0Var2);
                                this.f125496h = vq.j.a(iVar2);
                                this.f125497j = vq.j.a(downloadTaskData3);
                                this.f125498k = i16;
                                this.f125499l = i15;
                                this.f125500m = 0;
                                this.f125501n = 0;
                                this.f125502p = 7;
                                if (bVarY2.F(bVar4, this) != objE) {
                                    c0Var3 = c0Var;
                                    return c0Var3.c();
                                }
                            }
                        }
                        return objE;
                    case 5:
                        i15 = this.f125499l;
                        i16 = this.f125498k;
                        i0Var2 = (i0) this.f125496h;
                        c0Var = (k10.c0) this.f125495g;
                        tVar2 = (t) this.f125494f;
                        iVar = (dx.i) this.f125493e;
                        oq.u.b(obj);
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            dx.b bVar9 = (dx.b) ((dx.i.Left) iVar2).b();
                            bVarY3 = tVar2.Y1();
                            cVar2 = mc0.i.d.c.f125390a;
                            this.f125493e = vq.j.a(iVar);
                            this.f125494f = c0Var;
                            this.f125495g = vq.j.a(i0Var2);
                            this.f125496h = vq.j.a(iVar2);
                            this.f125497j = vq.j.a(bVar9);
                            this.f125498k = i16;
                            this.f125499l = i15;
                            this.f125500m = 0;
                            this.f125501n = 0;
                            this.f125502p = 6;
                            if (bVarY3.F(cVar2, this) != objE) {
                                c0Var4 = c0Var;
                                return c0Var4.c();
                            }
                        } else {
                            if (iVar2 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            DownloadTaskData downloadTaskData4 = (DownloadTaskData) ((dx.i.Right) iVar2).b();
                            bVarY2 = tVar2.Y1();
                            bVar4 = mc0.i.d.b.f125389a;
                            this.f125493e = vq.j.a(iVar);
                            this.f125494f = c0Var;
                            this.f125495g = vq.j.a(i0Var2);
                            this.f125496h = vq.j.a(iVar2);
                            this.f125497j = vq.j.a(downloadTaskData4);
                            this.f125498k = i16;
                            this.f125499l = i15;
                            this.f125500m = 0;
                            this.f125501n = 0;
                            this.f125502p = 7;
                            if (bVarY2.F(bVar4, this) != objE) {
                                c0Var3 = c0Var;
                                return c0Var3.c();
                            }
                        }
                        return objE;
                    case 6:
                        c0Var4 = (k10.c0) this.f125494f;
                        oq.u.b(obj);
                        return c0Var4.c();
                    case 7:
                        c0Var3 = (k10.c0) this.f125494f;
                        oq.u.b(obj);
                        return c0Var3.c();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f125503q, this.f125504r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends mc0.j>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f125491f;
            Object objE = uq.b.e();
            int i15 = this.f125490e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f125491f = vq.j.a(c0Var);
            this.f125490e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.c cVar, k10.c0<mc0.j.b.Password> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f125491f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$h;", "<unused var>", "Lk10/c0;", "Lmc0/j$b$c;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mc0.i.h, k10.c0<mc0.j.b.Password>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125506f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.BiometricAuthenticationInProgress O(k10.c0 c0Var, mc0.j.b.Password password) {
            return new mc0.j.b.BiometricAuthenticationInProgress(((mc0.j.b.Password) c0Var.a()).getAppVersion());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f125506f;
            uq.b.e();
            if (this.f125505e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mc0.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, (j.b.Password) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.h hVar, k10.c0<mc0.j.b.Password> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            g gVar = new g(eVar);
            gVar.f125506f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$a;", "<unused var>", "Lk10/c0;", "Lmc0/j$b$c;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mc0.i.a, k10.c0<mc0.j.b.Password>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125508f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.Password O(mc0.j.b.Password password) {
            return mc0.j.b.Password.c(password, null, null, null, false, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f125508f;
            uq.b.e();
            if (this.f125507e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mc0.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O((j.b.Password) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.a aVar, k10.c0<mc0.j.b.Password> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            h hVar = new h(eVar);
            hVar.f125508f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmc0/i$b;", "<unused var>", "Lmc0/j$b$c;", "Loq/i0;", "<anonymous>", "(Lmc0/i$b;Lmc0/j$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mc0.i.b, mc0.j.b.Password, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125509e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f125509e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mc0.i.d> bVarY1 = t.this.Y1();
                mc0.i.d.e eVar = mc0.i.d.e.f125392a;
                this.f125509e = 1;
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
        public final Object w(mc0.i.b bVar, mc0.j.b.Password password, tq.e<? super i0> eVar) {
            return t.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$g;", "<unused var>", "Lk10/c0;", "Lmc0/j$b$a;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mc0.i.g, k10.c0<mc0.j.b.Biometric>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125512f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.BiometricAuthenticationInProgress O(k10.c0 c0Var, mc0.j.b.Biometric biometric) {
            return new mc0.j.b.BiometricAuthenticationInProgress(((mc0.j.b.Biometric) c0Var.a()).getAppVersion());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f125512f;
            uq.b.e();
            if (this.f125511e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mc0.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.j.O(c0Var, (j.b.Biometric) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.g gVar, k10.c0<mc0.j.b.Biometric> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            j jVar = new j(eVar);
            jVar.f125512f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmc0/i$i;", "<unused var>", "Lk10/c0;", "Lmc0/j$b$a;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lmc0/i$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mc0.i.C3086i, k10.c0<mc0.j.b.Biometric>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125514f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc0.j.b.Password O(k10.c0 c0Var, mc0.j.b.Biometric biometric) {
            return new mc0.j.b.Password(((mc0.j.b.Biometric) c0Var.a()).getAppVersion(), null, null, true, null, 22, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f125514f;
            uq.b.e();
            if (this.f125513e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mc0.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.k.O(c0Var, (j.b.Biometric) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mc0.i.C3086i c3086i, k10.c0<mc0.j.b.Biometric> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            k kVar = new k(eVar);
            kVar.f125514f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmc0/j$b$b;", "state", "Lk10/l;", "Lmc0/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<mc0.j.b.BiometricAuthenticationInProgress>, tq.e<? super k10.l<? extends mc0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125516f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmc0/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends mc0.j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f125518e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f125519f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f125520g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f125521h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f125522j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f125523k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f125524l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f125525m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f125526n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f125527p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f125528q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f125529r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f125530s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f125531t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ t f125532v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ k10.c0<mc0.j.b.BiometricAuthenticationInProgress> f125533w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, k10.c0<mc0.j.b.BiometricAuthenticationInProgress> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f125532v = tVar;
                this.f125533w = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mc0.j.b.Password X(k10.c0 c0Var, mc0.j.b.BiometricAuthenticationInProgress biometricAuthenticationInProgress) {
                return new mc0.j.b.Password(((mc0.j.b.BiometricAuthenticationInProgress) c0Var.a()).getAppVersion(), null, null, false, null, 22, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mc0.j.b.Biometric Y(k10.c0 c0Var, mc0.j.b.BiometricAuthenticationInProgress biometricAuthenticationInProgress) {
                return new mc0.j.b.Biometric(((mc0.j.b.BiometricAuthenticationInProgress) c0Var.a()).getAppVersion());
            }

            /* JADX WARN: Code duplicated, block: B:21:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:26:0x0121  */
            /* JADX WARN: Code duplicated, block: B:28:0x0125  */
            /* JADX WARN: Code duplicated, block: B:31:0x0154  */
            /* JADX WARN: Code duplicated, block: B:34:0x015e  */
            /* JADX WARN: Code duplicated, block: B:39:0x0195  */
            /* JADX WARN: Code duplicated, block: B:41:0x0199  */
            /* JADX WARN: Code duplicated, block: B:43:0x01a6  */
            /* JADX WARN: Code duplicated, block: B:46:0x01db  */
            /* JADX WARN: Code duplicated, block: B:50:0x0219 A[PHI: r1 r3 r4 r5 r6 r7 r8 r9 r10 r11 r15
              0x0219: PHI (r1v19 int) = (r1v17 int), (r1v20 int) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r3v10 int) = (r3v8 int), (r3v11 int) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r5v18 int) = (r5v16 int), (r5v19 int) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r6v8 pb4.a) = (r6v5 pb4.a), (r6v12 pb4.a) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r7v11 dx.i) = (r7v8 dx.i), (r7v15 dx.i) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r8v15 oq.i0) = (r8v12 oq.i0), (r8v19 oq.i0) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r9v6 k10.c0<mc0.j$b$b>) = (r9v3 k10.c0<mc0.j$b$b>), (r9v8 k10.c0<mc0.j$b$b>) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r10v5 mc0.t) = (r10v2 mc0.t), (r10v9 mc0.t) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r11v9 dx.i) = (r11v6 dx.i), (r11v13 dx.i) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x0219: PHI (r15v31 java.lang.Object) = (r15v30 java.lang.Object), (r15v0 java.lang.Object) binds: [B:48:0x0215, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:52:0x021f  */
            /* JADX WARN: Code duplicated, block: B:56:0x026d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0271  */
            /* JADX WARN: Code duplicated, block: B:63:0x02c2  */
            /* JADX WARN: Code duplicated, block: B:65:0x02c8  */
            /* JADX WARN: Code duplicated, block: B:67:0x02d0  */
            /* JADX WARN: Code duplicated, block: B:69:0x02da  */
            /* JADX WARN: Code duplicated, block: B:71:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:73:0x02ec  */
            /* JADX WARN: Code duplicated, block: B:75:0x02f0  */
            /* JADX WARN: Code duplicated, block: B:80:0x0325  */
            /* JADX WARN: Code duplicated, block: B:82:0x032b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0331  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x011a, code lost:
            
                if (r15 == r0) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x018e, code lost:
            
                if (r15 == r0) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0267, code lost:
            
                if (r10.F(r13, r14) == r0) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x026b, code lost:
            
                r0 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x02ba, code lost:
            
                if (r10.F(r13, r14) == r0) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x031f, code lost:
            
                if (r15 == r0) goto L77;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 848
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: mc0.t.l.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f125532v, this.f125533w, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends mc0.j>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f125516f;
            Object objE = uq.b.e();
            int i15 = this.f125515e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, c0Var, null);
            this.f125516f = vq.j.a(c0Var);
            this.f125515e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mc0.j.b.BiometricAuthenticationInProgress> c0Var, tq.e<? super k10.l<? extends mc0.j>> eVar) {
            return ((l) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f125516f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmc0/i$e;", "<unused var>", "Lmc0/j;", "Loq/i0;", "<anonymous>", "(Lmc0/i$e;Lmc0/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<mc0.i.e, mc0.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125534e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f125534e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mc0.i.d> bVarY1 = t.this.Y1();
                mc0.i.d.a aVar = mc0.i.d.a.f125388a;
                this.f125534e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(mc0.i.e eVar, mc0.j jVar, tq.e<? super i0> eVar2) {
            return t.this.new m(eVar2).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, b14.b bVar, qg0.g gVar, nc0.c cVar, mx.c cVar2, ac4.a aVar2, df0.d dVar, sc0.a aVar3, sc0.c cVar3, qb4.h hVar, qb4.g gVar2, qb4.e eVar, cb4.j jVar, qb4.c cVar4, oz.q qVar) {
        this.getAppVersionUC = bVar;
        this.loginToAppUC = gVar;
        this.mapper = cVar;
        this.labelProvider = cVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.getMainDocumentActiveTaskDataUC = dVar;
        this.getLockStateAfterAuthorizationFailedUC = aVar3;
        this.resetLoginLockCountsUC = cVar3;
        this.logInWithBiometricUseCase = hVar;
        this.getBiometricStatusUseCase = gVar2;
        this.deactivateBiometricUseCase = eVar;
        this.dialogVMSFactory = jVar;
        this.checkBiometricRequirementsUseCase = cVar4;
        this.ownerViewLifecycleManager = qVar;
        mc0.j.a aVar4 = mc0.j.a.f125399a;
        this.initialState = aVar4;
        this.navAction = new xw.b<>();
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: mc0.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f125428a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), B9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mc0.k.a B9(mc0.j state) {
        return this.mapper.b(new nc0.c.Params(state, new er.l() { // from class: mc0.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f125429a, (iy.b0) obj);
            }
        }, b9(mc0.i.b.f125386a), b9(mc0.i.e.f125393a), b9(mc0.i.g.f125396a), b9(mc0.i.h.f125397a), b9(mc0.i.C3086i.f125398a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, iy.b0 b0Var) {
        tVar.d9(new mc0.i.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(k10.c0<?> c0Var, final dx.b bVar, tq.e<? super k10.l<? extends mc0.j>> eVar) throws Throwable {
        b bVar2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f125465h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f125465h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object obj = bVar2.f125463f;
        Object objE = uq.b.e();
        int i16 = bVar2.f125465h;
        if (i16 == 0) {
            oq.u.b(obj);
            qb4.e eVar2 = this.deactivateBiometricUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar2.f125461d = c0Var;
            bVar2.f125462e = bVar;
            bVar2.f125465h = 1;
            if (eVar2.c(c1792a, bVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (dx.b) bVar2.f125462e;
            c0Var = (k10.c0) bVar2.f125461d;
            oq.u.b(obj);
        }
        final String strA = this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
        return c0Var.d(new er.l() { // from class: mc0.s
            @Override // er.l
            public final Object b(Object obj2) {
                return t.E9(strA, this, bVar, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mc0.j.b.Password E9(String str, t tVar, dx.b bVar, Object obj) {
        return new mc0.j.b.Password(str, null, null, false, tVar.dialogVMSFactory.a(tVar.mapper.f(bVar, tVar.b9(mc0.i.a.f125385a))), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(mc0.j.a.class), new er.l() { // from class: mc0.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f125430a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mc0.j.b.Password.class), new er.l() { // from class: mc0.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.I9(this.f125431a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mc0.j.b.Biometric.class), new er.l() { // from class: mc0.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9((k10.z) obj);
            }
        });
        vVar.c(q0.c(mc0.j.b.BiometricAuthenticationInProgress.class), new er.l() { // from class: mc0.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(this.f125432a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mc0.j.class), new er.l() { // from class: mc0.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.L9(this.f125433a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, k10.z zVar) {
        zVar.A(tVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(t tVar, k10.z zVar) {
        e eVar = tVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mc0.i.OnPinChanged.class), oVar, eVar);
        zVar.v(q0.c(mc0.i.c.class), oVar, tVar.new f(null));
        zVar.v(q0.c(mc0.i.h.class), oVar, new g(null));
        zVar.v(q0.c(mc0.i.a.class), oVar, new h(null));
        zVar.x(q0.c(mc0.i.b.class), oVar, tVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mc0.i.g.class), oVar, jVar);
        zVar.v(q0.c(mc0.i.C3086i.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(t tVar, k10.z zVar) {
        zVar.A(tVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(t tVar, k10.z zVar) {
        m mVar = tVar.new m(null);
        zVar.x(q0.c(mc0.i.e.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mc0.k.a aVar) {
        super.P5(aVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<mc0.i.d> Y1() {
        return this.navAction;
    }

    @Override // mc0.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<mc0.j, mc0.i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mc0.k.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
