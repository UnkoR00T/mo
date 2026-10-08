package sp1;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lsp1/r;", "Ll00/g;", "Lsp1/l;", "", "Lsp1/m;", "Lyy/a;", "stateMachineFactory", "Lsp1/e;", "mapper", "<init>", "(Lyy/a;Lsp1/e;)V", "state", "Lsp1/m$a;", "l9", "(Lsp1/l;)Lsp1/m$a;", "b", "Lsp1/e;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lsp1/k;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements m, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<m.Data> state = a9(new a(e9().getState(), this), l9(new State(null, null, 3, null)));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f183377b;

        /* JADX INFO: renamed from: sp1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4717a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183378a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f183379b;

            /* JADX INFO: renamed from: sp1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4718a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183380d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183381e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183382f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183384h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183385j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183386k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183387l;

                public C4718a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183380d = obj;
                    this.f183381e |= PKIFailureInfo.systemUnavail;
                    return C4717a.this.F(null, this);
                }
            }

            public C4717a(mu.h hVar, r rVar) {
                this.f183378a = hVar;
                this.f183379b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4718a c4718a;
                if (eVar instanceof C4718a) {
                    c4718a = (C4718a) eVar;
                    int i15 = c4718a.f183381e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4718a.f183381e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4718a = new C4718a(eVar);
                    }
                } else {
                    c4718a = new C4718a(eVar);
                }
                Object obj2 = c4718a.f183380d;
                Object objE = uq.b.e();
                int i16 = c4718a.f183381e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f183378a;
                    m.Data dataL9 = this.f183379b.l9((State) obj);
                    c4718a.f183382f = vq.j.a(obj);
                    c4718a.f183384h = vq.j.a(c4718a);
                    c4718a.f183385j = vq.j.a(obj);
                    c4718a.f183386k = vq.j.a(hVar);
                    c4718a.f183387l = 0;
                    c4718a.f183381e = 1;
                    if (hVar.F(dataL9, c4718a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f183376a = gVar;
            this.f183377b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.Data> hVar, tq.e eVar) {
            Object objA = this.f183376a.a(new C4717a(hVar, this.f183377b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsp1/h;", "<unused var>", "Lsp1/l;", "Loq/i0;", "<anonymous>", "(Lsp1/h;Lsp1/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183388e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183388e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<k> bVarY1 = r.this.Y1();
                k.a aVar = k.a.f183360a;
                this.f183388e = 1;
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
        public final Object w(h hVar, State state, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsp1/i;", "action", "Lk10/c0;", "Lsp1/l;", "state", "Lk10/l;", "<anonymous>", "(Lsp1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<MutateCardListSelectedIndex, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183392g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(MutateCardListSelectedIndex mutateCardListSelectedIndex, State state) {
            return State.b(state, Integer.valueOf(mutateCardListSelectedIndex.getIndex()), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final MutateCardListSelectedIndex mutateCardListSelectedIndex = (MutateCardListSelectedIndex) this.f183391f;
            c0 c0Var = (c0) this.f183392g;
            uq.b.e();
            if (this.f183390e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sp1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.O(mutateCardListSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(MutateCardListSelectedIndex mutateCardListSelectedIndex, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f183391f = mutateCardListSelectedIndex;
            cVar.f183392g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsp1/j;", "action", "Lk10/c0;", "Lsp1/l;", "state", "Lk10/l;", "<anonymous>", "(Lsp1/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<MutateErrorCardListSelectedIndex, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183395g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(MutateErrorCardListSelectedIndex mutateErrorCardListSelectedIndex, State state) {
            return State.b(state, null, Integer.valueOf(mutateErrorCardListSelectedIndex.getIndex()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final MutateErrorCardListSelectedIndex mutateErrorCardListSelectedIndex = (MutateErrorCardListSelectedIndex) this.f183394f;
            c0 c0Var = (c0) this.f183395g;
            uq.b.e();
            if (this.f183393e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sp1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(mutateErrorCardListSelectedIndex, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(MutateErrorCardListSelectedIndex mutateErrorCardListSelectedIndex, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f183394f = mutateErrorCardListSelectedIndex;
            dVar.f183395g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, e eVar) {
        this.mapper = eVar;
        this.stateMachine = aVar.a(new State(null, null, 3, null), new er.l() { // from class: sp1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.p9(this.f183368a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.Data l9(State state) {
        return this.mapper.b(new e.Params(state, b9(h.f183357a), new er.l() { // from class: sp1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.m9(this.f183369a, ((Integer) obj).intValue());
            }
        }, new er.l() { // from class: sp1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.n9(this.f183370a, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(r rVar, int i15) {
        rVar.d9(new MutateCardListSelectedIndex(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(r rVar, int i15) {
        rVar.d9(new MutateErrorCardListSelectedIndex(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sp1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.q9(this.f183371a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h.class), oVar, bVar);
        zVar.v(q0.c(MutateCardListSelectedIndex.class), oVar, new c(null));
        zVar.v(q0.c(MutateErrorCardListSelectedIndex.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<k> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m.Data data) {
        super.P5(data);
    }
}
