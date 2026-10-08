package j93;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lj93/r;", "Ll00/g;", "Lj93/f;", "Lj93/e;", "Lj93/g;", "", "Lk93/a;", "screenMapper", "La14/w;", "openUrlIntentUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lk93/a;La14/w;Lhb4/d;Lib4/c;Lyy/a;)V", "state", "Lj93/g$a;", "o9", "(Lj93/f;)Lj93/g$a;", "b", "Lk93/a;", "c", "La14/w;", "d", "Lhb4/d;", "e", "Lib4/c;", "Lj93/f$b;", "f", "Lj93/f$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lj93/e$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<f, e> implements g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k93.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f.b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f, e> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f100499b;

        /* JADX INFO: renamed from: j93.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2361a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f100501b;

            /* JADX INFO: renamed from: j93.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2362a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100502d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100503e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f100504f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f100506h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f100507j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f100508k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f100509l;

                public C2362a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100502d = obj;
                    this.f100503e |= PKIFailureInfo.systemUnavail;
                    return C2361a.this.F(null, this);
                }
            }

            public C2361a(mu.h hVar, r rVar) {
                this.f100500a = hVar;
                this.f100501b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2362a c2362a;
                if (eVar instanceof C2362a) {
                    c2362a = (C2362a) eVar;
                    int i15 = c2362a.f100503e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2362a.f100503e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2362a = new C2362a(eVar);
                    }
                } else {
                    c2362a = new C2362a(eVar);
                }
                Object obj2 = c2362a.f100502d;
                Object objE = uq.b.e();
                int i16 = c2362a.f100503e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f100500a;
                    g.a aVarO9 = this.f100501b.o9((f) obj);
                    c2362a.f100504f = vq.j.a(obj);
                    c2362a.f100506h = vq.j.a(c2362a);
                    c2362a.f100507j = vq.j.a(obj);
                    c2362a.f100508k = vq.j.a(hVar);
                    c2362a.f100509l = 0;
                    c2362a.f100503e = 1;
                    if (hVar.F(aVarO9, c2362a) == objE) {
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
            this.f100498a = gVar;
            this.f100499b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a> hVar, tq.e eVar) {
            Object objA = this.f100498a.a(new C2361a(hVar, this.f100499b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj93/e$b;", "action", "Lj93/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj93/e$b;Lj93/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e.b, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100511f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e.b bVar = (e.b) this.f100511f;
            Object objE = uq.b.e();
            int i15 = this.f100510e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e.b> bVarY1 = r.this.Y1();
                this.f100511f = vq.j.a(bVar);
                this.f100510e = 1;
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
        public final Object w(e.b bVar, f fVar, tq.e<? super i0> eVar) {
            b bVar2 = r.this.new b(eVar);
            bVar2.f100511f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj93/e$c;", "<unused var>", "Lk10/c0;", "Lj93/f$b;", "state", "Lk10/l;", "Lj93/f;", "<anonymous>", "(Lj93/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e.c, c0<f.b>, tq.e<? super k10.l<? extends f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100514f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f.Error V(final r rVar, dx.b.Business business, f.b bVar) {
            return new f.Error(rVar.errorVMSFactory.a(rVar.errorMapper.b(new ib4.c.Params(business, false, new er.l() { // from class: j93.t
                @Override // er.l
                public final Object b(Object obj) {
                    return r.c.X(rVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(r rVar, ib4.c.b bVar) {
            rVar.d9(e.a.f100472a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f100514f;
            Object objE = uq.b.e();
            int i15 = this.f100513e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = r.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params("https://www.gov.pl/web/mobywatel-w-aplikacji/potencjalne", false, 2, null);
                this.f100514f = c0Var;
                this.f100513e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: j93.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.c.V(rVar, business, (f.b) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(e.c cVar, c0<f.b> c0Var, tq.e<? super k10.l<? extends f>> eVar) {
            c cVar2 = r.this.new c(eVar);
            cVar2.f100514f = c0Var;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj93/e$a;", "<unused var>", "Lk10/c0;", "Lj93/f$a;", "state", "Lk10/l;", "Lj93/f;", "<anonymous>", "(Lj93/e$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e.a, c0<f.Error>, tq.e<? super k10.l<? extends f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100517f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f.b O(f.Error error) {
            return f.b.f100476a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f100517f;
            uq.b.e();
            if (this.f100516e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: j93.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O((f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e.a aVar, c0<f.Error> c0Var, tq.e<? super k10.l<? extends f>> eVar) {
            d dVar = new d(eVar);
            dVar.f100517f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public r(k93.a aVar, a14.w wVar, hb4.d dVar, ib4.c cVar, yy.a aVar2) {
        this.screenMapper = aVar;
        this.openUrlIntentUseCase = wVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        f.b bVar = f.b.f100476a;
        this.initialState = bVar;
        this.stateMachine = aVar2.a(bVar, new er.l() { // from class: j93.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.q9(this.f100488a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.a o9(f state) {
        return this.screenMapper.b(new k93.a.Params(state, b9(e.b.a.f100473a), b9(e.c.f100474a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(f.b.class), new er.l() { // from class: j93.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.r9(this.f100489a, (z) obj);
            }
        });
        vVar.c(q0.c(f.Error.class), new er.l() { // from class: j93.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e.b.class), oVar, bVar);
        zVar.v(q0.c(e.c.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(e.a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<f, e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
