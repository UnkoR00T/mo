package ps1;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lps1/p;", "Ll00/g;", "Lps1/f;", "", "Lps1/g;", "Lyy/a;", "stateMachineFactory", "Lqs1/a;", "mapper", "Lps1/e;", "setupData", "<init>", "(Lyy/a;Lqs1/a;Lps1/e;)V", "Lps1/g$a;", "j9", "(Lps1/f;)Lps1/g$a;", "data", "Loq/i0;", "k9", "(Lps1/e;)V", "b", "Lqs1/a;", "c", "Lps1/e;", "d", "Lps1/f;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lps1/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qs1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ps1.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f162251b;

        /* JADX INFO: renamed from: ps1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3999a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f162253b;

            /* JADX INFO: renamed from: ps1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4000a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162254d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162255e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162256f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162258h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162259j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162260k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162261l;

                public C4000a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162254d = obj;
                    this.f162255e |= PKIFailureInfo.systemUnavail;
                    return C3999a.this.F(null, this);
                }
            }

            public C3999a(mu.h hVar, p pVar) {
                this.f162252a = hVar;
                this.f162253b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4000a c4000a;
                if (eVar instanceof C4000a) {
                    c4000a = (C4000a) eVar;
                    int i15 = c4000a.f162255e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4000a.f162255e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4000a = new C4000a(eVar);
                    }
                } else {
                    c4000a = new C4000a(eVar);
                }
                Object obj2 = c4000a.f162254d;
                Object objE = uq.b.e();
                int i16 = c4000a.f162255e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f162252a;
                    g.Data dataJ9 = this.f162253b.j9((State) obj);
                    c4000a.f162256f = vq.j.a(obj);
                    c4000a.f162258h = vq.j.a(c4000a);
                    c4000a.f162259j = vq.j.a(obj);
                    c4000a.f162260k = vq.j.a(hVar);
                    c4000a.f162261l = 0;
                    c4000a.f162255e = 1;
                    if (hVar.F(dataJ9, c4000a) == objE) {
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
            this.f162250a = gVar;
            this.f162251b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f162250a.a(new C3999a(hVar, this.f162251b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps1/a;", "<unused var>", "Lps1/f;", "Loq/i0;", "<anonymous>", "(Lps1/a;Lps1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ps1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162262e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162262e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ps1.b> bVarY1 = p.this.Y1();
                ps1.b.a aVar = ps1.b.a.f162219a;
                this.f162262e = 1;
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
        public final Object w(ps1.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lps1/c;", "<unused var>", "Lps1/f;", "Loq/i0;", "<anonymous>", "(Lps1/c;Lps1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ps1.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162264e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162264e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ps1.b> bVarY1 = p.this.Y1();
                ps1.b.C3998b c3998b = ps1.b.C3998b.f162220a;
                this.f162264e = 1;
                if (bVarY1.F(c3998b, this) == objE) {
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
        public final Object w(ps1.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lps1/d;", "action", "Lk10/c0;", "Lps1/f;", "state", "Lk10/l;", "<anonymous>", "(Lps1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<UpdateDataFromSetup, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162268g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(UpdateDataFromSetup updateDataFromSetup, State state) {
            return state.a(updateDataFromSetup.getTextValueFromSetup());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDataFromSetup updateDataFromSetup = (UpdateDataFromSetup) this.f162267f;
            c0 c0Var = (c0) this.f162268g;
            uq.b.e();
            if (this.f162266e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ps1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(updateDataFromSetup, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDataFromSetup updateDataFromSetup, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f162267f = updateDataFromSetup;
            dVar.f162268g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, qs1.a aVar2, SetupData setupData) {
        this.mapper = aVar2;
        this.setupData = setupData;
        State state = new State("");
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ps1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.l9(this.f162243a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data j9(State state) {
        return this.mapper.b(new qs1.a.Params(state, this.setupData.getText(), b9(ps1.a.f162218a), b9(ps1.c.f162221a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ps1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f162242a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ps1.a.class), oVar, bVar);
        zVar.x(q0.c(ps1.c.class), oVar, pVar.new c(null));
        zVar.v(q0.c(UpdateDataFromSetup.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ps1.b> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        d9(new UpdateDataFromSetup(data.getText()));
    }
}
