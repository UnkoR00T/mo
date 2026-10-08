package zr1;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lzr1/n;", "Ll00/g;", "Lzr1/d;", "", "Lzr1/e;", "Lyy/a;", "stateMachineFactory", "Las1/a;", "mapper", "Lno1/c;", "sendPublicRequestUC", "<init>", "(Lyy/a;Las1/a;Lno1/c;)V", "Lzr1/e$a;", "l9", "(Lzr1/d;)Lzr1/e$a;", "b", "Las1/a;", "c", "Lno1/c;", "d", "Lzr1/d;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzr1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final as1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final no1.c sendPublicRequestUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zr1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f236462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f236463b;

        /* JADX INFO: renamed from: zr1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6392a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f236464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f236465b;

            /* JADX INFO: renamed from: zr1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6393a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f236466d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f236467e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f236468f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f236470h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f236471j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f236472k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f236473l;

                public C6393a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f236466d = obj;
                    this.f236467e |= PKIFailureInfo.systemUnavail;
                    return C6392a.this.F(null, this);
                }
            }

            public C6392a(mu.h hVar, n nVar) {
                this.f236464a = hVar;
                this.f236465b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6393a c6393a;
                if (eVar instanceof C6393a) {
                    c6393a = (C6393a) eVar;
                    int i15 = c6393a.f236467e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6393a.f236467e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6393a = new C6393a(eVar);
                    }
                } else {
                    c6393a = new C6393a(eVar);
                }
                Object obj2 = c6393a.f236466d;
                Object objE = uq.b.e();
                int i16 = c6393a.f236467e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f236464a;
                    e.Data dataL9 = this.f236465b.l9((State) obj);
                    c6393a.f236468f = vq.j.a(obj);
                    c6393a.f236470h = vq.j.a(c6393a);
                    c6393a.f236471j = vq.j.a(obj);
                    c6393a.f236472k = vq.j.a(hVar);
                    c6393a.f236473l = 0;
                    c6393a.f236467e = 1;
                    if (hVar.F(dataL9, c6393a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f236462a = gVar;
            this.f236463b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f236462a.a(new C6392a(hVar, this.f236463b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzr1/a;", "action", "Lzr1/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzr1/a;Lzr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zr1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236475f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zr1.a aVar = (zr1.a) this.f236475f;
            Object objE = uq.b.e();
            int i15 = this.f236474e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<zr1.a> bVarY1 = n.this.Y1();
                this.f236475f = vq.j.a(aVar);
                this.f236474e = 1;
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
        public final Object w(zr1.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f236475f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr1/c;", "action", "Lk10/c0;", "Lzr1/d;", "state", "Lk10/l;", "<anonymous>", "(Lzr1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<UrlChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236479g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(UrlChanged urlChanged, State state) {
            return State.b(state, urlChanged.getValue(), false, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UrlChanged urlChanged = (UrlChanged) this.f236478f;
            c0 c0Var = (c0) this.f236479g;
            uq.b.e();
            if (this.f236477e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: zr1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(urlChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UrlChanged urlChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f236478f = urlChanged;
            cVar.f236479g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzr1/b;", "<unused var>", "Lk10/c0;", "Lzr1/d;", "state", "Lk10/l;", "<anonymous>", "(Lzr1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<zr1.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f236480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236482g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(State state) {
            return State.b(state, null, true, null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(String str, State state) {
            return State.b(state, null, false, str, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f236482g;
            Object objE = uq.b.e();
            int i15 = this.f236481f;
            if (i15 == 0) {
                u.b(obj);
                String url = ((State) c0Var.a()).getUrl();
                if (((State) c0Var.a()).getIsSending() || fu.r.t0(url)) {
                    return c0Var.c();
                }
                c0Var.b(new er.l() { // from class: zr1.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.d.V((State) obj2);
                    }
                });
                no1.c cVar = n.this.sendPublicRequestUC;
                no1.c.Params params = new no1.c.Params(url);
                this.f236482g = c0Var;
                this.f236480e = vq.j.a(url);
                this.f236481f = 1;
                obj = cVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final String str = (String) obj;
            return c0Var.b(new er.l() { // from class: zr1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.X(str, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(zr1.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f236482g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, as1.a aVar2, no1.c cVar) {
        this.mapper = aVar2;
        this.sendPublicRequestUC = cVar;
        State state = new State("", false, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: zr1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f236453a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(State state) {
        return this.mapper.b(new as1.a.Params(state, b9(zr1.a.C6391a.f236434a), new er.l() { // from class: zr1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f236455a, (String) obj);
            }
        }, b9(zr1.b.f236435a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, String str) {
        nVar.d9(new UrlChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: zr1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f236454a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zr1.a.class), oVar, bVar);
        zVar.v(q0.c(UrlChanged.class), oVar, new c(null));
        zVar.v(q0.c(zr1.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<zr1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
