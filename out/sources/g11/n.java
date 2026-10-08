package g11;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi0.MyCase;
import vi0.MyCaseAdditionalData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0012028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lg11/n;", "Ll00/g;", "Lg11/c;", "", "Lg11/d;", "Ldj0/a;", "getCaseAdditionalDataUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lh11/a;", "caseDetailsScreenMapper", "Lvi0/b;", "myCase", "Lyy/a;", "stateMachineFactory", "<init>", "(Ldj0/a;Lac4/a;Lh11/a;Lvi0/b;Lyy/a;)V", "state", "Lg11/d$a;", "o9", "(Lg11/c;)Lg11/d$a;", "Lk10/c0;", "Lg11/c$a;", "Lk10/l;", "n9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "b", "Ldj0/a;", "c", "Lac4/a;", "d", "Lh11/a;", "e", "Lvi0/b;", "f", "Lg11/c$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lg11/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<g11.c, Object> implements g11.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dj0.a getCaseAdditionalDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h11.a caseDetailsScreenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MyCase myCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g11.c.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<g11.c, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g11.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g11.d.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lg11/c$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends g11.c.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69577e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c0<g11.c.a> f69579g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<g11.c.a> c0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f69579g = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g11.c.Initialized X(n nVar, g11.c.a aVar) {
            return new g11.c.Initialized(nVar.myCase, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g11.c.Initialized Y(n nVar, MyCaseAdditionalData myCaseAdditionalData, g11.c.a aVar) {
            return new g11.c.Initialized(nVar.myCase, myCaseAdditionalData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69577e;
            if (i15 == 0) {
                u.b(obj);
                dj0.a aVar = n.this.getCaseAdditionalDataUseCase;
                dj0.a.Params params = new dj0.a.Params(n.this.myCase.getId());
                this.f69577e = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            c0<g11.c.a> c0Var = this.f69579g;
            final n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: g11.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.a.X(nVar, (c.a) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final MyCaseAdditionalData myCaseAdditionalData = (MyCaseAdditionalData) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: g11.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.a.Y(nVar, myCaseAdditionalData, (c.a) obj2);
                }
            });
        }

        public final tq.e<i0> O(tq.e<?> eVar) {
            return n.this.new a(this.f69579g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<g11.c.Initialized>> eVar) {
            return ((a) O(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g11.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f69580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f69581b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f69582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f69583b;

            /* JADX INFO: renamed from: g11.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1560a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f69584d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f69585e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f69586f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f69588h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f69589j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f69590k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f69591l;

                public C1560a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f69584d = obj;
                    this.f69585e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f69582a = hVar;
                this.f69583b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1560a c1560a;
                if (eVar instanceof C1560a) {
                    c1560a = (C1560a) eVar;
                    int i15 = c1560a.f69585e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1560a.f69585e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1560a = new C1560a(eVar);
                    }
                } else {
                    c1560a = new C1560a(eVar);
                }
                Object obj2 = c1560a.f69584d;
                Object objE = uq.b.e();
                int i16 = c1560a.f69585e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f69582a;
                    g11.d.a aVarO9 = this.f69583b.o9((g11.c) obj);
                    c1560a.f69586f = vq.j.a(obj);
                    c1560a.f69588h = vq.j.a(c1560a);
                    c1560a.f69589j = vq.j.a(obj);
                    c1560a.f69590k = vq.j.a(hVar);
                    c1560a.f69591l = 0;
                    c1560a.f69585e = 1;
                    if (hVar.F(aVarO9, c1560a) == objE) {
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

        public b(mu.g gVar, n nVar) {
            this.f69580a = gVar;
            this.f69581b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g11.d.a> hVar, tq.e eVar) {
            Object objA = this.f69580a.a(new a(hVar, this.f69581b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg11/a;", "<unused var>", "Lg11/c;", "Loq/i0;", "<anonymous>", "(Lg11/a;Lg11/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g11.a, g11.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69592e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69592e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g11.b> bVarY1 = n.this.Y1();
                g11.b.a aVar = g11.b.a.f69549a;
                this.f69592e = 1;
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
        public final Object w(g11.a aVar, g11.c cVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lg11/c$a;", "state", "Lk10/l;", "Lg11/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<g11.c.a>, tq.e<? super k10.l<? extends g11.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69595f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f69595f;
            Object objE = uq.b.e();
            int i15 = this.f69594e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            n nVar = n.this;
            this.f69595f = vq.j.a(c0Var);
            this.f69594e = 1;
            Object objN9 = nVar.n9(c0Var, this);
            return objN9 == objE ? objE : objN9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<g11.c.a> c0Var, tq.e<? super k10.l<? extends g11.c>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f69595f = obj;
            return dVar;
        }
    }

    public n(dj0.a aVar, ac4.a aVar2, h11.a aVar3, MyCase myCase, yy.a aVar4) {
        this.getCaseAdditionalDataUseCase = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.caseDetailsScreenMapper = aVar3;
        this.myCase = myCase;
        g11.c.a aVar5 = g11.c.a.f69550a;
        this.initialState = aVar5;
        this.stateMachine = aVar4.a(aVar5, new er.l() { // from class: g11.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f69565a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), g11.d.a.C1559a.f69553a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n9(c0<g11.c.a> c0Var, tq.e<? super k10.l<? extends g11.c>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g11.d.a o9(g11.c state) {
        return this.caseDetailsScreenMapper.b(new h11.a.Params(state, b9(g11.a.f69548a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final n nVar, v vVar) {
        vVar.c(q0.c(g11.c.class), new er.l() { // from class: g11.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f69563a, (z) obj);
            }
        });
        vVar.c(q0.c(g11.c.a.class), new er.l() { // from class: g11.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f69564a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(g11.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, z zVar) {
        zVar.A(nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g11.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g11.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g11.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(MyCase myCase) {
        super.P5(myCase);
    }
}
