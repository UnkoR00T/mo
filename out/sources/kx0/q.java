package kx0;

import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lkx0/q;", "Ll00/g;", "Lkx0/g;", "", "Lkx0/h;", "Lyy/a;", "stateMachineFactory", "Llx0/a;", "screenMapper", "Lpq3/a;", "disableWhatsNewUseCase", "Lkx0/f;", "setupData", "<init>", "(Lyy/a;Llx0/a;Lpq3/a;Lkx0/f;)V", "state", "Lkx0/h$a;", "l9", "(Lkx0/g;)Lkx0/h$a;", "b", "Llx0/a;", "getScreenMapper", "()Llx0/a;", "c", "Lpq3/a;", "d", "Lkx0/f;", "e", "Lkx0/g;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lkx0/e;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lx0.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pq3.a disableWhatsNewUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kx0.e> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f112977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f112978b;

        /* JADX INFO: renamed from: kx0.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2735a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f112979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f112980b;

            /* JADX INFO: renamed from: kx0.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2736a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f112981d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f112982e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f112983f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f112985h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f112986j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f112987k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f112988l;

                public C2736a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f112981d = obj;
                    this.f112982e |= PKIFailureInfo.systemUnavail;
                    return C2735a.this.F(null, this);
                }
            }

            public C2735a(mu.h hVar, q qVar) {
                this.f112979a = hVar;
                this.f112980b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2736a c2736a;
                if (eVar instanceof C2736a) {
                    c2736a = (C2736a) eVar;
                    int i15 = c2736a.f112982e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2736a.f112982e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2736a = new C2736a(eVar);
                    }
                } else {
                    c2736a = new C2736a(eVar);
                }
                Object obj2 = c2736a.f112981d;
                Object objE = uq.b.e();
                int i16 = c2736a.f112982e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f112979a;
                    h.Data dataL9 = this.f112980b.l9((State) obj);
                    c2736a.f112983f = vq.j.a(obj);
                    c2736a.f112985h = vq.j.a(c2736a);
                    c2736a.f112986j = vq.j.a(obj);
                    c2736a.f112987k = vq.j.a(hVar);
                    c2736a.f112988l = 0;
                    c2736a.f112982e = 1;
                    if (hVar.F(dataL9, c2736a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f112977a = gVar;
            this.f112978b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f112977a.a(new C2735a(hVar, this.f112978b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkx0/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkx0/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112989e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112989e;
            if (i15 == 0) {
                u.b(obj);
                pq3.a aVar = q.this.disableWhatsNewUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f112989e = 1;
                if (aVar.c(c1792a, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((b) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkx0/a;", "<unused var>", "Lkx0/g;", "state", "Loq/i0;", "<anonymous>", "(Lkx0/a;Lkx0/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<kx0.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112992f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f112992f;
            Object objE = uq.b.e();
            int i15 = this.f112991e;
            if (i15 == 0) {
                u.b(obj);
                if (state.getCanNavigateBack()) {
                    xw.b<kx0.e> bVarY1 = q.this.Y1();
                    kx0.e.a aVar = kx0.e.a.f112949a;
                    this.f112992f = vq.j.a(state);
                    this.f112991e = 1;
                    if (bVarY1.F(aVar, this) == objE) {
                        return objE;
                    }
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
        public final Object w(kx0.a aVar, State state, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f112992f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkx0/d;", "<unused var>", "Lkx0/g;", "Loq/i0;", "<anonymous>", "(Lkx0/d;Lkx0/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kx0.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112994e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112994e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<kx0.e> bVarY1 = q.this.Y1();
                kx0.e.d dVar = kx0.e.d.f112952a;
                this.f112994e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(kx0.d dVar, State state, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkx0/c;", "<unused var>", "Lkx0/g;", "Loq/i0;", "<anonymous>", "(Lkx0/c;Lkx0/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kx0.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112996e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112996e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<kx0.e> bVarY1 = q.this.Y1();
                kx0.e.c cVar = kx0.e.c.f112951a;
                this.f112996e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(kx0.c cVar, State state, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkx0/b;", "<unused var>", "Lkx0/g;", "state", "Loq/i0;", "<anonymous>", "(Lkx0/b;Lkx0/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kx0.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112998e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112998e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<kx0.e> bVarY1 = q.this.Y1();
                kx0.e.b bVar = kx0.e.b.f112950a;
                this.f112998e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(kx0.b bVar, State state, tq.e<? super i0> eVar) {
            return q.this.new f(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, lx0.a aVar2, pq3.a aVar3, SetupData setupData) {
        this.screenMapper = aVar2;
        this.disableWhatsNewUseCase = aVar3;
        this.setupData = setupData;
        State state = new State(setupData.getCanNavigateBack());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: kx0.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.n9(this.f112969a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data l9(State state) {
        return this.screenMapper.b(new lx0.a.Params(state, b9(kx0.a.f112945a), b9(kx0.c.f112947a), b9(kx0.b.f112946a), b9(kx0.d.f112948a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: kx0.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f112967a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: kx0.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f112968a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, z zVar) {
        zVar.C(qVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kx0.a.class), oVar, cVar);
        zVar.x(q0.c(kx0.d.class), oVar, qVar.new d(null));
        zVar.x(q0.c(kx0.c.class), oVar, qVar.new e(null));
        zVar.x(q0.c(kx0.b.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kx0.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
