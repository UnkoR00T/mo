package po1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lpo1/g0;", "Ll00/g;", "Lpo1/s;", "", "Lpo1/t;", "Lyy/a;", "stateMachineFactory", "Lpo1/c0;", "mapper", "Lb14/b;", "getAppVersionUC", "<init>", "(Lyy/a;Lpo1/c0;Lb14/b;)V", "Lpo1/t$a;", "l9", "(Lpo1/s;)Lpo1/t$a;", "b", "Lpo1/c0;", "c", "Lb14/b;", "d", "Lpo1/s;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpo1/r;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<State, Object> implements t, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b14.b getAppVersionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<t.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f161421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f161422b;

        /* JADX INFO: renamed from: po1.g0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3973a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f161423a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f161424b;

            /* JADX INFO: renamed from: po1.g0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3974a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f161425d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f161426e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f161427f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f161429h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f161430j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f161431k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f161432l;

                public C3974a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f161425d = obj;
                    this.f161426e |= PKIFailureInfo.systemUnavail;
                    return C3973a.this.F(null, this);
                }
            }

            public C3973a(mu.h hVar, g0 g0Var) {
                this.f161423a = hVar;
                this.f161424b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3974a c3974a;
                if (eVar instanceof C3974a) {
                    c3974a = (C3974a) eVar;
                    int i15 = c3974a.f161426e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3974a.f161426e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3974a = new C3974a(eVar);
                    }
                } else {
                    c3974a = new C3974a(eVar);
                }
                Object obj2 = c3974a.f161425d;
                Object objE = uq.b.e();
                int i16 = c3974a.f161426e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f161423a;
                    t.Data dataL9 = this.f161424b.l9((State) obj);
                    c3974a.f161427f = vq.j.a(obj);
                    c3974a.f161429h = vq.j.a(c3974a);
                    c3974a.f161430j = vq.j.a(obj);
                    c3974a.f161431k = vq.j.a(hVar);
                    c3974a.f161432l = 0;
                    c3974a.f161426e = 1;
                    if (hVar.F(dataL9, c3974a) == objE) {
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

        public a(mu.g gVar, g0 g0Var) {
            this.f161421a = gVar;
            this.f161422b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super t.Data> hVar, tq.e eVar) {
            Object objA = this.f161421a.a(new C3973a(hVar, this.f161422b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lpo1/s;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161434f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(String str, State state) {
            return State.b(state, str, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f161434f;
            uq.b.e();
            if (this.f161433e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = g0.this.getAppVersionUC.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: po1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.b.O(strA, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = g0.this.new b(eVar);
            bVar.f161434f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpo1/r;", "action", "Lpo1/s;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpo1/r;Lpo1/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161437f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r rVar = (r) this.f161437f;
            Object objE = uq.b.e();
            int i15 = this.f161436e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r> bVarY1 = g0.this.Y1();
                this.f161437f = vq.j.a(rVar);
                this.f161436e = 1;
                if (bVarY1.F(rVar, this) == objE) {
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
        public final Object w(r rVar, State state, tq.e<? super oq.i0> eVar) {
            c cVar = g0.this.new c(eVar);
            cVar.f161437f = rVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar, c0 c0Var, b14.b bVar) {
        this.mapper = c0Var;
        this.getAppVersionUC = bVar;
        State state = new State(null, null, null, 7, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: po1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.o9(this.f161408a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t.Data l9(State state) {
        return this.mapper.b(new c0.Params(state, b9(r.a.f161483a), new er.l() { // from class: po1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.m9(this.f161412a, (p094oo1.p) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m9(g0 g0Var, p094oo1.p pVar) {
        g0Var.d9(new r.GoToDestination(pVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(final g0 g0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: po1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.p9(this.f161410a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new b(null));
        c cVar = g0Var.new c(null);
        zVar.x(fr.q0.c(r.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<t.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
