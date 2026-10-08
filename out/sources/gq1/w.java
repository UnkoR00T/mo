package gq1;

import androidx.p016lifecycle.u0;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lgq1/w;", "Ll00/g;", "Lgq1/s;", "Lgq1/r;", "Lgq1/t;", "", "Lyy/a;", "stateMachineFactory", "Lgq1/i;", "mapper", "<init>", "(Lyy/a;Lgq1/i;)V", "state", "Lgq1/t$a;", "l9", "(Lgq1/s;)Lgq1/t$a;", "b", "Lgq1/i;", "Ls70/n$a;", "c", "Ls70/n$a;", "deps", "Ls70/n;", "d", "Ls70/n;", "illustrationPageViewModelSegment", "e", "Lgq1/s;", "initialState", "Lg00/a;", "Lgq1/r$b;", "f", "Lg00/a;", "k9", "()Lg00/a;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<State, r> implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s70.n.a deps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s70.n illustrationPageViewModelSegment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g00.a<r.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, r> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<t.Initialized> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f76205b;

        /* JADX INFO: renamed from: gq1.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1720a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f76207b;

            /* JADX INFO: renamed from: gq1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1721a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76208d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76209e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76210f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76212h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76213j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76214k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76215l;

                public C1721a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76208d = obj;
                    this.f76209e |= PKIFailureInfo.systemUnavail;
                    return C1720a.this.F(null, this);
                }
            }

            public C1720a(mu.h hVar, w wVar) {
                this.f76206a = hVar;
                this.f76207b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1721a c1721a;
                if (eVar instanceof C1721a) {
                    c1721a = (C1721a) eVar;
                    int i15 = c1721a.f76209e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1721a.f76209e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1721a = new C1721a(eVar);
                    }
                } else {
                    c1721a = new C1721a(eVar);
                }
                Object obj2 = c1721a.f76208d;
                Object objE = uq.b.e();
                int i16 = c1721a.f76209e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f76206a;
                    t.Initialized initializedL9 = this.f76207b.l9((State) obj);
                    c1721a.f76210f = vq.j.a(obj);
                    c1721a.f76212h = vq.j.a(c1721a);
                    c1721a.f76213j = vq.j.a(obj);
                    c1721a.f76214k = vq.j.a(hVar);
                    c1721a.f76215l = 0;
                    c1721a.f76209e = 1;
                    if (hVar.F(initializedL9, c1721a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f76204a = gVar;
            this.f76205b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super t.Initialized> hVar, tq.e eVar) {
            Object objA = this.f76204a.a(new C1720a(hVar, this.f76205b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgq1/s;", "it", "Loq/i0;", "<anonymous>", "(Lgq1/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76216e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Loq/i0;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<Integer, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f76218e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ int f76219f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w f76220g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f76220g = wVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Integer num, tq.e<? super i0> eVar) {
                return M(num.intValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                int i15 = this.f76219f;
                uq.b.e();
                if (this.f76218e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f76220g.d9(new r.PageChange(i15));
                return i0.f148189a;
            }

            public final Object M(int i15, tq.e<? super i0> eVar) {
                return ((a) v(Integer.valueOf(i15), eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f76220g, eVar);
                aVar.f76219f = ((Number) obj).intValue();
                return aVar;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f76216e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0<Integer> p0VarB = w.this.illustrationPageViewModelSegment.b();
                a aVar = new a(w.this, null);
                this.f76216e = 1;
                if (mu.i.j(p0VarB, aVar, this) == objE) {
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
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((b) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgq1/r$a;", "<unused var>", "Lgq1/s;", "Loq/i0;", "<anonymous>", "(Lgq1/r$a;Lgq1/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76221e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f76221e;
            if (i15 == 0) {
                oq.u.b(obj);
                g00.a<r.b> aVarK9 = w.this.k9();
                r.b.a aVar = r.b.a.f76185a;
                this.f76221e = 1;
                if (aVarK9.F(aVar, this) == objE) {
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
        public final Object w(r.a aVar, State state, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgq1/r$c;", "action", "Lk10/c0;", "Lgq1/s;", "state", "Lk10/l;", "<anonymous>", "(Lgq1/r$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r.PageChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76225g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r.PageChange pageChange, State state) {
            return state.a(pageChange.getIndex());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r.PageChange pageChange = (r.PageChange) this.f76224f;
            c0 c0Var = (c0) this.f76225g;
            uq.b.e();
            if (this.f76223e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gq1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.d.O(pageChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r.PageChange pageChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f76224f = pageChange;
            dVar.f76225g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, i iVar) {
        this.mapper = iVar;
        s70.n.a aVar2 = new s70.n.a(3, 0);
        this.deps = aVar2;
        this.illustrationPageViewModelSegment = new s70.n(aVar2, u0.a(this));
        State state = new State(0, 1, null);
        this.initialState = state;
        this.navAction = new g00.a<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: gq1.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.m9(this.f76195a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: gq1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.n9(this.f76196a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(w wVar, k10.z zVar) {
        zVar.C(wVar.new b(null));
        c cVar = wVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(r.a.class), oVar, cVar);
        zVar.v(q0.c(r.PageChange.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // l00.g
    protected k10.t<State, r> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<t.Initialized> getState() {
        return this.state;
    }

    public g00.a<r.b> k9() {
        return this.navAction;
    }

    public final t.Initialized l9(State state) {
        return this.mapper.b(new i.Params(this.illustrationPageViewModelSegment, state, b9(r.a.f76184a)));
    }
}
