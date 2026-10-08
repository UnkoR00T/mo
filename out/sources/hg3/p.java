package hg3;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lhg3/p;", "Ll00/g;", "Lhg3/d;", "", "Lhg3/e;", "Lyy/a;", "stateMachineFactory", "Lig3/a;", "mapper", "<init>", "(Lyy/a;Lig3/a;)V", "Lhg3/e$a;", "m9", "(Lhg3/d;)Lhg3/e$a;", "b", "Lig3/a;", "Lhg3/d$a;", "c", "Lhg3/d$a;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhg3/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<hg3.d, Object> implements hg3.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ig3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg3.d.a initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hg3.d, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hg3.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<hg3.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<hg3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f84608b;

        /* JADX INFO: renamed from: hg3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1964a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f84610b;

            /* JADX INFO: renamed from: hg3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1965a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84611d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84612e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84613f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84615h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84616j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84617k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84618l;

                public C1965a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84611d = obj;
                    this.f84612e |= PKIFailureInfo.systemUnavail;
                    return C1964a.this.F(null, this);
                }
            }

            public C1964a(mu.h hVar, p pVar) {
                this.f84609a = hVar;
                this.f84610b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1965a c1965a;
                if (eVar instanceof C1965a) {
                    c1965a = (C1965a) eVar;
                    int i15 = c1965a.f84612e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1965a.f84612e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1965a = new C1965a(eVar);
                    }
                } else {
                    c1965a = new C1965a(eVar);
                }
                Object obj2 = c1965a.f84611d;
                Object objE = uq.b.e();
                int i16 = c1965a.f84612e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f84609a;
                    hg3.e.a aVarM9 = this.f84610b.m9((hg3.d) obj);
                    c1965a.f84613f = vq.j.a(obj);
                    c1965a.f84615h = vq.j.a(c1965a);
                    c1965a.f84616j = vq.j.a(obj);
                    c1965a.f84617k = vq.j.a(hVar);
                    c1965a.f84618l = 0;
                    c1965a.f84612e = 1;
                    if (hVar.F(aVarM9, c1965a) == objE) {
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
            this.f84607a = gVar;
            this.f84608b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hg3.e.a> hVar, tq.e eVar) {
            Object objA = this.f84607a.a(new C1964a(hVar, this.f84608b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg3/b;", "action", "Lhg3/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhg3/b;Lhg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hg3.b, hg3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84620f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hg3.b bVar = (hg3.b) this.f84620f;
            Object objE = uq.b.e();
            int i15 = this.f84619e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                this.f84620f = vq.j.a(bVar);
                this.f84619e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(hg3.b bVar, hg3.d dVar, tq.e<? super i0> eVar) {
            b bVar2 = p.this.new b(eVar);
            bVar2.f84620f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhg3/d$a;", "state", "Lk10/l;", "Lhg3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<hg3.d.a>, tq.e<? super k10.l<? extends hg3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84623f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg3.d.b O(hg3.d.a aVar) {
            return hg3.d.b.f84585a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84623f;
            uq.b.e();
            if (this.f84622e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: hg3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O((d.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<hg3.d.a> c0Var, tq.e<? super k10.l<? extends hg3.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f84623f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg3/a;", "<unused var>", "Lhg3/d$b;", "Loq/i0;", "<anonymous>", "(Lhg3/a;Lhg3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hg3.a, hg3.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84624e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84624e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<hg3.b> bVarY1 = p.this.Y1();
                hg3.b.C1962b c1962b = hg3.b.C1962b.f84581a;
                this.f84624e = 1;
                if (bVarY1.F(c1962b, this) == objE) {
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
        public final Object w(hg3.a aVar, hg3.d.b bVar, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg3/c;", "<unused var>", "Lhg3/d$b;", "Loq/i0;", "<anonymous>", "(Lhg3/c;Lhg3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hg3.c, hg3.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84626e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84626e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<hg3.b> bVarY1 = p.this.Y1();
                hg3.b.c cVar = hg3.b.c.f84582a;
                this.f84626e = 1;
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
        public final Object w(hg3.c cVar, hg3.d.b bVar, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ig3.a aVar2) {
        this.mapper = aVar2;
        hg3.d.a aVar3 = hg3.d.a.f84584a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: hg3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f84599a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hg3.e.a m9(hg3.d dVar) {
        return this.mapper.b(new ig3.a.Params(dVar, b9(hg3.a.f84579a), b9(hg3.c.f84583a), b9(hg3.b.a.f84580a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final p pVar, v vVar) {
        vVar.c(q0.c(hg3.d.class), new er.l() { // from class: hg3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f84600a, (z) obj);
            }
        });
        vVar.c(q0.c(hg3.d.a.class), new er.l() { // from class: hg3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9((z) obj);
            }
        });
        vVar.c(q0.c(hg3.d.b.class), new er.l() { // from class: hg3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f84601a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(hg3.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(z zVar) {
        zVar.A(new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hg3.a.class), oVar, dVar);
        zVar.x(q0.c(hg3.c.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hg3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hg3.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hg3.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hg3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
