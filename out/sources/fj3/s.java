package fj3;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tj3.AbroadDetailsPayload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lfj3/s;", "Ll00/g;", "Lfj3/e;", "", "Lfj3/f;", "Lhj3/a;", "vehicleHistoryAbroadDetailsMapper", "Ltj3/a;", "payload", "Lyy/a;", "stateMachineFactory", "<init>", "(Lhj3/a;Ltj3/a;Lyy/a;)V", "state", "Lfj3/f$a;", "l9", "(Lfj3/e;)Lfj3/f$a;", "b", "Lhj3/a;", "c", "Ltj3/a;", "d", "Lfj3/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lfj3/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hj3.a vehicleHistoryAbroadDetailsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbroadDetailsPayload payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fj3.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f64327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f64328b;

        /* JADX INFO: renamed from: fj3.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1436a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f64329a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f64330b;

            /* JADX INFO: renamed from: fj3.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1437a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f64331d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f64332e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f64333f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f64335h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f64336j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f64337k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f64338l;

                public C1437a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f64331d = obj;
                    this.f64332e |= PKIFailureInfo.systemUnavail;
                    return C1436a.this.F(null, this);
                }
            }

            public C1436a(mu.h hVar, s sVar) {
                this.f64329a = hVar;
                this.f64330b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1437a c1437a;
                if (eVar instanceof C1437a) {
                    c1437a = (C1437a) eVar;
                    int i15 = c1437a.f64332e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1437a.f64332e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1437a = new C1437a(eVar);
                    }
                } else {
                    c1437a = new C1437a(eVar);
                }
                Object obj2 = c1437a.f64331d;
                Object objE = uq.b.e();
                int i16 = c1437a.f64332e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f64329a;
                    f.Data dataL9 = this.f64330b.l9((State) obj);
                    c1437a.f64333f = vq.j.a(obj);
                    c1437a.f64335h = vq.j.a(c1437a);
                    c1437a.f64336j = vq.j.a(obj);
                    c1437a.f64337k = vq.j.a(hVar);
                    c1437a.f64338l = 0;
                    c1437a.f64332e = 1;
                    if (hVar.F(dataL9, c1437a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f64327a = gVar;
            this.f64328b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f64327a.a(new C1436a(hVar, this.f64328b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfj3/a;", "<unused var>", "Lfj3/e;", "Loq/i0;", "<anonymous>", "(Lfj3/a;Lfj3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<fj3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64339e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f64339e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fj3.b> bVarY1 = s.this.Y1();
                fj3.b.a aVar = fj3.b.a.f64281a;
                this.f64339e = 1;
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
        public final Object w(fj3.a aVar, State state, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfj3/d;", "action", "Lk10/c0;", "Lfj3/e;", "state", "Lk10/l;", "<anonymous>", "(Lfj3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnTechnicalDataExpandedChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64343g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnTechnicalDataExpandedChange onTechnicalDataExpandedChange, State state) {
            return State.b(state, null, onTechnicalDataExpandedChange.getIsExpanded(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnTechnicalDataExpandedChange onTechnicalDataExpandedChange = (OnTechnicalDataExpandedChange) this.f64342f;
            c0 c0Var = (c0) this.f64343g;
            uq.b.e();
            if (this.f64341e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fj3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.c.O(onTechnicalDataExpandedChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnTechnicalDataExpandedChange onTechnicalDataExpandedChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f64342f = onTechnicalDataExpandedChange;
            cVar.f64343g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfj3/c;", "action", "Lk10/c0;", "Lfj3/e;", "state", "Lk10/l;", "<anonymous>", "(Lfj3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnOdometerExpandedChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f64345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f64346g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnOdometerExpandedChange onOdometerExpandedChange, State state) {
            return State.b(state, null, false, onOdometerExpandedChange.getIsExpanded(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnOdometerExpandedChange onOdometerExpandedChange = (OnOdometerExpandedChange) this.f64345f;
            c0 c0Var = (c0) this.f64346g;
            uq.b.e();
            if (this.f64344e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fj3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(onOdometerExpandedChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnOdometerExpandedChange onOdometerExpandedChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f64345f = onOdometerExpandedChange;
            dVar.f64346g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public s(hj3.a aVar, AbroadDetailsPayload abroadDetailsPayload, yy.a aVar2) {
        this.vehicleHistoryAbroadDetailsMapper = aVar;
        this.payload = abroadDetailsPayload;
        State state = new State(abroadDetailsPayload, false, false);
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: fj3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.p9(this.f64320a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.vehicleHistoryAbroadDetailsMapper.b(new hj3.a.Params(state, b9(fj3.a.f64280a), new er.l() { // from class: fj3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.m9(this.f64317a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: fj3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.n9(this.f64318a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(s sVar, boolean z15) {
        sVar.d9(new OnTechnicalDataExpandedChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(s sVar, boolean z15) {
        sVar.d9(new OnOdometerExpandedChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fj3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.q9(this.f64319a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fj3.a.class), oVar, bVar);
        zVar.v(q0.c(OnTechnicalDataExpandedChange.class), oVar, new c(null));
        zVar.v(q0.c(OnOdometerExpandedChange.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fj3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AbroadDetailsPayload abroadDetailsPayload) {
        super.P5(abroadDetailsPayload);
    }
}
