package e92;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Le92/p;", "Ll00/g;", "Le92/f;", "", "Le92/g;", "Lyy/a;", "stateMachineFactory", "Lg92/a;", "violationSummaryMapper", "Ly82/b;", "domainErrorMapper", "Le82/m;", "sendReportUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Ljq0/b;", "getEnvironmentViolationImageSettingsUC", "Lf92/a;", "contract", "<init>", "(Lyy/a;Lg92/a;Ly82/b;Le82/m;Lac4/a;Ljq0/b;Lf92/a;)V", "state", "Le92/g$a;", "r9", "(Le92/f;)Le92/g$a;", "Ldx/b;", "domainError", "Ljb4/b;", "p9", "(Ldx/b;)Ljb4/b;", "b", "Lg92/a;", "c", "Ly82/b;", "d", "Le82/m;", "e", "Lac4/a;", "f", "Ljq0/b;", "g", "Lf92/a;", "h", "Le92/f;", "initialState", "Lxw/b;", "Le92/a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g92.a violationSummaryMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y82.b domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e82.m sendReportUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jq0.b getEnvironmentViolationImageSettingsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f92.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e92.a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f48747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f48748b;

        /* JADX INFO: renamed from: e92.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1135a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f48749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f48750b;

            /* JADX INFO: renamed from: e92.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1136a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f48751d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f48752e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f48753f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f48755h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f48756j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f48757k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f48758l;

                public C1136a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f48751d = obj;
                    this.f48752e |= PKIFailureInfo.systemUnavail;
                    return C1135a.this.F(null, this);
                }
            }

            public C1135a(mu.h hVar, p pVar) {
                this.f48749a = hVar;
                this.f48750b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1136a c1136a;
                if (eVar instanceof C1136a) {
                    c1136a = (C1136a) eVar;
                    int i15 = c1136a.f48752e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1136a.f48752e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1136a = new C1136a(eVar);
                    }
                } else {
                    c1136a = new C1136a(eVar);
                }
                Object obj2 = c1136a.f48751d;
                Object objE = uq.b.e();
                int i16 = c1136a.f48752e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f48749a;
                    g.Data dataR9 = this.f48750b.r9((State) obj);
                    c1136a.f48753f = vq.j.a(obj);
                    c1136a.f48755h = vq.j.a(c1136a);
                    c1136a.f48756j = vq.j.a(obj);
                    c1136a.f48757k = vq.j.a(hVar);
                    c1136a.f48758l = 0;
                    c1136a.f48752e = 1;
                    if (hVar.F(dataR9, c1136a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f48747a = gVar;
            this.f48748b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f48747a.a(new C1135a(hVar, this.f48748b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le92/e;", "<unused var>", "Lk10/c0;", "Le92/f;", "state", "Lk10/l;", "<anonymous>", "(Le92/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e92.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48760f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Le92/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f48762e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f48763f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f48764g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f48765h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f48766j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f48767k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f48768l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ p f48769m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<State> f48770n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f48769m = pVar;
                this.f48770n = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
            /* JADX WARN: Code duplicated, block: B:32:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:39:0x0139  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00f8, code lost:
            
                if (r9.F(r10, r24) == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
            
                if (r8.F(r9, r24) == r1) goto L36;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 319
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e92.p.b.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f48769m, this.f48770n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, true, true, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f48760f;
            Object objE = uq.b.e();
            int i15 = this.f48759e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!((State) c0Var.a()).getIsIadChecked()) {
                    return c0Var.b(new er.l() { // from class: e92.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.b.O((State) obj2);
                        }
                    });
                }
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, c0Var, null);
                this.f48760f = vq.j.a(c0Var);
                this.f48759e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e92.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            b bVar = p.this.new b(eVar2);
            bVar.f48760f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le92/c;", "<unused var>", "Lk10/c0;", "Le92/f;", "state", "Lk10/l;", "<anonymous>", "(Le92/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e92.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48772f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, false, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f48772f;
            uq.b.e();
            if (this.f48771e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e92.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e92.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar2 = new c(eVar);
            cVar2.f48772f = c0Var;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le92/d;", "<unused var>", "Le92/f;", "Loq/i0;", "<anonymous>", "(Le92/d;Le92/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e92.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48773e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f48773e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e92.a> bVarY1 = p.this.Y1();
                e92.a.b bVar = e92.a.b.f48705a;
                this.f48773e = 1;
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
        public final Object w(e92.d dVar, State state, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le92/b;", "action", "Lk10/c0;", "Le92/f;", "state", "Lk10/l;", "<anonymous>", "(Le92/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnIadChecked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48777g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnIadChecked onIadChecked, State state) {
            return State.b(state, null, onIadChecked.getChecked(), false, false, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnIadChecked onIadChecked = (OnIadChecked) this.f48776f;
            c0 c0Var = (c0) this.f48777g;
            uq.b.e();
            if (this.f48775e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e92.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(onIadChecked, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnIadChecked onIadChecked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f48776f = onIadChecked;
            eVar2.f48777g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, g92.a aVar2, y82.b bVar, e82.m mVar, ac4.a aVar3, jq0.b bVar2, f92.a aVar4) {
        this.violationSummaryMapper = aVar2;
        this.domainErrorMapper = bVar;
        this.sendReportUseCase = mVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.getEnvironmentViolationImageSettingsUC = bVar2;
        this.contract = aVar4;
        State state = new State(aVar4.c(), false, false, false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: e92.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f48736a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b p9(dx.b domainError) {
        return this.domainErrorMapper.b(new y82.b.Params(new ib4.c.Params(domainError, false, new er.l() { // from class: e92.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f48735a, (ib4.c.b) obj);
            }
        }, 2, null), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, ib4.c.b bVar) {
        ib4.c.b.a aVar = bVar instanceof ib4.c.b.a ? (ib4.c.b.a) bVar : null;
        if ((aVar != null ? aVar.getType() : null) != y82.a.TRY_AGAIN && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            bVar = null;
        }
        if (bVar != null) {
            pVar.d9(e92.e.f48710a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data r9(State state) {
        return this.violationSummaryMapper.b(new g92.a.Params(state, new er.l() { // from class: e92.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f48733a, ((Boolean) obj).booleanValue());
            }
        }, b9(e92.c.f48708a), b9(e92.d.f48709a), b9(e92.e.f48710a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, boolean z15) {
        pVar.d9(new OnIadChecked(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: e92.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f48734a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(e92.e.class), oVar, bVar);
        zVar.v(q0.c(e92.c.class), oVar, new c(null));
        zVar.x(q0.c(e92.d.class), oVar, pVar.new d(null));
        zVar.v(q0.c(OnIadChecked.class), oVar, new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e92.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(f92.a aVar) {
        super.P5(aVar);
    }
}
