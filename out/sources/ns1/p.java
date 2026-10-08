package ns1;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lns1/p;", "Ll00/g;", "Lns1/e;", "", "Lns1/f;", "Lyy/a;", "stateMachineFactory", "Los1/a;", "mapper", "<init>", "(Lyy/a;Los1/a;)V", "Lns1/f$a;", "k9", "(Lns1/e;)Lns1/f$a;", "b", "Los1/a;", "c", "Lns1/e;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lns1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final os1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ns1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f138223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f138224b;

        /* JADX INFO: renamed from: ns1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3409a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f138225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f138226b;

            /* JADX INFO: renamed from: ns1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3410a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f138227d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f138228e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f138229f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f138231h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f138232j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f138233k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f138234l;

                public C3410a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f138227d = obj;
                    this.f138228e |= PKIFailureInfo.systemUnavail;
                    return C3409a.this.F(null, this);
                }
            }

            public C3409a(mu.h hVar, p pVar) {
                this.f138225a = hVar;
                this.f138226b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3410a c3410a;
                if (eVar instanceof C3410a) {
                    c3410a = (C3410a) eVar;
                    int i15 = c3410a.f138228e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3410a.f138228e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3410a = new C3410a(eVar);
                    }
                } else {
                    c3410a = new C3410a(eVar);
                }
                Object obj2 = c3410a.f138227d;
                Object objE = uq.b.e();
                int i16 = c3410a.f138228e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f138225a;
                    f.Data dataK9 = this.f138226b.k9((State) obj);
                    c3410a.f138229f = vq.j.a(obj);
                    c3410a.f138231h = vq.j.a(c3410a);
                    c3410a.f138232j = vq.j.a(obj);
                    c3410a.f138233k = vq.j.a(hVar);
                    c3410a.f138234l = 0;
                    c3410a.f138228e = 1;
                    if (hVar.F(dataK9, c3410a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f138223a = gVar;
            this.f138224b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f138223a.a(new C3409a(hVar, this.f138224b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lns1/a;", "<unused var>", "Lns1/e;", "Loq/i0;", "<anonymous>", "(Lns1/a;Lns1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ns1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138235e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138235e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ns1.b> bVarY1 = p.this.Y1();
                ns1.b.a aVar = ns1.b.a.f138197a;
                this.f138235e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ns1.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lns1/c;", "<unused var>", "Lns1/e;", "state", "Loq/i0;", "<anonymous>", "(Lns1/c;Lns1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ns1.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138238f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f138238f;
            Object objE = uq.b.e();
            int i15 = this.f138237e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ns1.b> bVarY1 = p.this.Y1();
                ns1.b.Next next = new ns1.b.Next(state.getText());
                this.f138238f = vq.j.a(state);
                this.f138237e = 1;
                if (bVarY1.F(next, this) == objE) {
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
        public final Object w(ns1.c cVar, State state, tq.e<? super i0> eVar) {
            c cVar2 = p.this.new c(eVar);
            cVar2.f138238f = state;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lns1/d;", "action", "Lk10/c0;", "Lns1/e;", "state", "Lk10/l;", "<anonymous>", "(Lns1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<TextChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138242g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(TextChanged textChanged, State state) {
            return state.a(textChanged.getText());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final TextChanged textChanged = (TextChanged) this.f138241f;
            c0 c0Var = (c0) this.f138242g;
            uq.b.e();
            if (this.f138240e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ns1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(textChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(TextChanged textChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f138241f = textChanged;
            dVar.f138242g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, os1.a aVar2) {
        this.mapper = aVar2;
        State state = new State(null, 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ns1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f138215a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(State state) {
        return this.mapper.b(new os1.a.Params(state, b9(ns1.a.f138196a), b9(ns1.c.f138199a), new er.l() { // from class: ns1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.l9(this.f138216a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(p pVar, String str) {
        pVar.d9(new TextChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ns1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f138217a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ns1.a.class), oVar, bVar);
        zVar.x(q0.c(ns1.c.class), oVar, pVar.new c(null));
        zVar.v(q0.c(TextChanged.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ns1.b> Y1() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
