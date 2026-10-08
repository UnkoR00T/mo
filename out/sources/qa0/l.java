package qa0;

import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'H\u0096\u0001¢\u0006\u0004\b,\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030M8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020$0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lqa0/l;", "Ll00/g;", "Lqa0/b;", "Lqa0/a;", "Lqa0/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lra0/b;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lqb4/a;", "activateBiometricUseCase", "Lqb4/e;", "deactivateBiometricUseCase", "Lqb4/g;", "getBiometricStatusUseCase", "Li70/n;", "snackBarManagerStateHolder", "Loz/q;", "ownerViewLifecycleManager", "Lac4/m;", "openBiometricEnrollmentSettingsUC", "<init>", "(Lyy/a;Lra0/b;Lcb4/j;Lqb4/a;Lqb4/e;Lqb4/g;Li70/n;Loz/q;Lac4/m;)V", "Lk10/c0;", "state", "Lk10/l;", "A9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "x9", "(Lk10/c0;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lqa0/c$a;", "w9", "(Lqa0/b;)Lqa0/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lra0/b;", "c", "Lcb4/j;", "d", "Lqb4/a;", "e", "Lqb4/e;", "f", "Lqb4/g;", "g", "Li70/n;", "h", "Loz/q;", "j", "Lac4/m;", "k", "Lqa0/b;", "initialState", "Loz/j;", "l", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lqa0/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, qa0.a> implements qa0.c, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ra0.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qb4.a activateBiometricUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qb4.e deactivateBiometricUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final qb4.g getBiometricStatusUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.m openBiometricEnrollmentSettingsUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qa0.a.e> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, qa0.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<qa0.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165607f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165609h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165607f = obj;
            this.f165609h |= PKIFailureInfo.systemUnavail;
            return l.this.x9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<qa0.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f165610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f165611b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f165612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f165613b;

            /* JADX INFO: renamed from: qa0.l$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4134a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f165614d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f165615e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f165616f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f165618h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f165619j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f165620k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f165621l;

                public C4134a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f165614d = obj;
                    this.f165615e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l lVar) {
                this.f165612a = hVar;
                this.f165613b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4134a c4134a;
                if (eVar instanceof C4134a) {
                    c4134a = (C4134a) eVar;
                    int i15 = c4134a.f165615e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4134a.f165615e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4134a = new C4134a(eVar);
                    }
                } else {
                    c4134a = new C4134a(eVar);
                }
                Object obj2 = c4134a.f165614d;
                Object objE = uq.b.e();
                int i16 = c4134a.f165615e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f165612a;
                    qa0.c.Data dataW9 = this.f165613b.w9((State) obj);
                    c4134a.f165616f = vq.j.a(obj);
                    c4134a.f165618h = vq.j.a(c4134a);
                    c4134a.f165619j = vq.j.a(obj);
                    c4134a.f165620k = vq.j.a(hVar);
                    c4134a.f165621l = 0;
                    c4134a.f165615e = 1;
                    if (hVar.F(dataW9, c4134a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, l lVar) {
            this.f165610a = gVar;
            this.f165611b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qa0.c.Data> hVar, tq.e eVar) {
            Object objA = this.f165610a.a(new a(hVar, this.f165611b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnx/a;", "viewLifecycle", "Lk10/c0;", "Lqa0/b;", "state", "Lk10/l;", "<anonymous>", "(Lnx/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nx.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165625h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f165627k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f165628l;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(pb4.e eVar, State state) {
            return State.b(state, null, eVar, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        
            if (r9 == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
        
            if (r9 == r2) goto L32;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qa0.l.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f165627k = aVar;
            cVar.f165628l = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqa0/a$e;", "action", "Lqa0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqa0/a$e;Lqa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qa0.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165631f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qa0.a.e eVar = (qa0.a.e) this.f165631f;
            Object objE = uq.b.e();
            int i15 = this.f165630e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qa0.a.e> bVarY1 = l.this.Y1();
                this.f165631f = vq.j.a(eVar);
                this.f165630e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.e eVar, State state, tq.e<? super i0> eVar2) {
            d dVar = l.this.new d(eVar2);
            dVar.f165631f = eVar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqa0/a$b;", "<unused var>", "Lk10/c0;", "Lqa0/b;", "state", "Lk10/l;", "<anonymous>", "(Lqa0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qa0.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165634f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f165634f;
            uq.b.e();
            if (this.f165633e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: qa0.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f165634f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqa0/a$f;", "<unused var>", "Lqa0/b;", "Loq/i0;", "<anonymous>", "(Lqa0/a$f;Lqa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qa0.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165635e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165635e;
            if (i15 == 0) {
                u.b(obj);
                ac4.m mVar = l.this.openBiometricEnrollmentSettingsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f165635e = 1;
                if (mVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            l.this.d9(qa0.a.b.f165566a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.f fVar, State state, tq.e<? super i0> eVar) {
            return l.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqa0/a$a;", "<unused var>", "Lk10/c0;", "Lqa0/b;", "state", "Lk10/l;", "<anonymous>", "(Lqa0/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qa0.a.C4132a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165640h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f165641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f165642k;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, pb4.e.b.f154093a, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
        
            if (r11 == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
        
            if (r11 == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
        
            if (r11 == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
        
            if (r11 == r1) goto L59;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qa0.l.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.C4132a c4132a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = l.this.new g(eVar);
            gVar.f165642k = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqa0/a$h;", "<unused var>", "Lk10/c0;", "Lqa0/b;", "state", "Lk10/l;", "<anonymous>", "(Lqa0/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qa0.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165645f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(l lVar, DialogData dialogData, State state) {
            return State.b(state, lVar.dialogVMSFactory.a(dialogData), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f165645f;
            uq.b.e();
            if (this.f165644e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final DialogData dialogDataI = l.this.mapper.i(l.this.b9(qa0.a.b.f165566a), l.this.b9(qa0.a.c.f165567a));
            final l lVar = l.this;
            return c0Var.b(new er.l() { // from class: qa0.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.h.O(lVar, dialogDataI, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar2 = l.this.new h(eVar);
            hVar2.f165645f = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqa0/a$c;", "<unused var>", "Lk10/c0;", "Lqa0/b;", "state", "Lk10/l;", "<anonymous>", "(Lqa0/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qa0.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165648f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(null, pb4.e.a.C3815a.f154090a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f165648f;
            Object objE = uq.b.e();
            int i15 = this.f165647e;
            if (i15 == 0) {
                u.b(obj);
                qb4.e eVar = l.this.deactivateBiometricUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f165648f = c0Var;
                this.f165647e = 1;
                if (eVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            l.this.d9(new qa0.a.ShowBiometricSnackBar(pb4.e.a.C3815a.f154090a));
            return c0Var.b(new er.l() { // from class: qa0.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = l.this.new i(eVar);
            iVar.f165648f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqa0/a$g;", "action", "Lqa0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqa0/a$g;Lqa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qa0.a.ShowBiometricSnackBar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165651f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qa0.a.ShowBiometricSnackBar showBiometricSnackBar = (qa0.a.ShowBiometricSnackBar) this.f165651f;
            uq.b.e();
            if (this.f165650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.snackBarManagerStateHolder.y(l.this.mapper.h(showBiometricSnackBar.getBiometricStatus()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.ShowBiometricSnackBar showBiometricSnackBar, State state, tq.e<? super i0> eVar) {
            j jVar = l.this.new j(eVar);
            jVar.f165651f = showBiometricSnackBar;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqa0/a$d;", "<unused var>", "Lqa0/b;", "Loq/i0;", "<anonymous>", "(Lqa0/a$d;Lqa0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qa0.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165653e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f165653e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qa0.a.d dVar, State state, tq.e<? super i0> eVar) {
            return l.this.new k(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, ra0.b bVar, cb4.j jVar, qb4.a aVar2, qb4.e eVar, qb4.g gVar, i70.n nVar, oz.q qVar, ac4.m mVar) {
        this.mapper = bVar;
        this.dialogVMSFactory = jVar;
        this.activateBiometricUseCase = aVar2;
        this.deactivateBiometricUseCase = eVar;
        this.getBiometricStatusUseCase = gVar;
        this.snackBarManagerStateHolder = nVar;
        this.ownerViewLifecycleManager = qVar;
        this.openBiometricEnrollmentSettingsUC = mVar;
        State state = new State(null, null, 3, null);
        this.initialState = state;
        this.lifecycleConnector = qVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: qa0.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.C9(this.f165586a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
        final DialogData dialogDataE = this.mapper.e(b9(qa0.a.b.f165566a), b9(qa0.a.f.f165570a));
        return c0Var.b(new er.l() { // from class: qa0.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.B9(this.f165590a, dialogDataE, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State B9(l lVar, DialogData dialogData, State state) {
        return State.b(state, lVar.dialogVMSFactory.a(dialogData), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qa0.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.D9(this.f165587a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(l lVar, z zVar) {
        k10.k.m(zVar, lVar.x8(), null, lVar.new c(null), 2, null);
        d dVar = lVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qa0.a.e.class), oVar, dVar);
        zVar.v(q0.c(qa0.a.b.class), oVar, new e(null));
        zVar.x(q0.c(qa0.a.f.class), oVar, lVar.new f(null));
        zVar.v(q0.c(qa0.a.C4132a.class), oVar, lVar.new g(null));
        zVar.v(q0.c(qa0.a.h.class), oVar, lVar.new h(null));
        zVar.v(q0.c(qa0.a.c.class), oVar, lVar.new i(null));
        zVar.x(q0.c(qa0.a.ShowBiometricSnackBar.class), oVar, lVar.new j(null));
        zVar.x(q0.c(qa0.a.d.class), oVar, lVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qa0.c.Data w9(State state) {
        return this.mapper.b(new ra0.b.Params(state, this.snackBarManagerStateHolder, b9(qa0.a.e.C4133a.f165569a), b9(qa0.a.C4132a.f165565a), b9(qa0.a.h.f165572a), b9(qa0.a.d.f165568a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x9(c0<State> c0Var, final dx.b bVar, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f165609h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f165609h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f165607f;
        Object objE = uq.b.e();
        int i16 = aVar.f165609h;
        if (i16 == 0) {
            u.b(obj);
            qb4.e eVar2 = this.deactivateBiometricUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f165605d = c0Var;
            aVar.f165606e = bVar;
            aVar.f165609h = 1;
            if (eVar2.c(c1792a, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (dx.b) aVar.f165606e;
            c0Var = (c0) aVar.f165605d;
            u.b(obj);
        }
        return c0Var.d(new er.l() { // from class: qa0.j
            @Override // er.l
            public final Object b(Object obj2) {
                return l.y9(this.f165588a, bVar, (State) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State y9(l lVar, dx.b bVar, State state) {
        return new State(lVar.dialogVMSFactory.a(lVar.mapper.f(bVar, lVar.b9(qa0.a.b.f165566a))), pb4.e.a.C3815a.f154090a);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<qa0.a.e> Y1() {
        return this.navAction;
    }

    @Override // qa0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<State, qa0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qa0.c.Data> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
