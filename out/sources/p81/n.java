package p81;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lp81/n;", "Ll00/g;", "Lp81/f;", "", "Lp81/g;", "Lyy/a;", "stateMachineFactory", "Lq81/a;", "mapper", "Lr81/a;", "setupData", "<init>", "(Lyy/a;Lq81/a;Lr81/a;)V", "state", "Lp81/g$a;", "l9", "(Lp81/f;)Lp81/g$a;", "b", "Lq81/a;", "c", "Lr81/a;", "d", "Lp81/f;", "initialState", "Lxw/b;", "Lp81/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<f, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q81.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r81.a setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p81.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f153441b;

        /* JADX INFO: renamed from: p81.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3785a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f153443b;

            /* JADX INFO: renamed from: p81.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3786a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153444d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153445e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153446f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153448h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153449j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153450k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153451l;

                public C3786a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153444d = obj;
                    this.f153445e |= PKIFailureInfo.systemUnavail;
                    return C3785a.this.F(null, this);
                }
            }

            public C3785a(mu.h hVar, n nVar) {
                this.f153442a = hVar;
                this.f153443b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3786a c3786a;
                if (eVar instanceof C3786a) {
                    c3786a = (C3786a) eVar;
                    int i15 = c3786a.f153445e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3786a.f153445e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3786a = new C3786a(eVar);
                    }
                } else {
                    c3786a = new C3786a(eVar);
                }
                Object obj2 = c3786a.f153444d;
                Object objE = uq.b.e();
                int i16 = c3786a.f153445e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f153442a;
                    g.Data dataL9 = this.f153443b.l9((f) obj);
                    c3786a.f153446f = vq.j.a(obj);
                    c3786a.f153448h = vq.j.a(c3786a);
                    c3786a.f153449j = vq.j.a(obj);
                    c3786a.f153450k = vq.j.a(hVar);
                    c3786a.f153451l = 0;
                    c3786a.f153445e = 1;
                    if (hVar.F(dataL9, c3786a) == objE) {
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
            this.f153440a = gVar;
            this.f153441b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f153440a.a(new C3785a(hVar, this.f153441b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp81/c;", "<unused var>", "Lp81/f;", "Loq/i0;", "<anonymous>", "(Lp81/c;Lp81/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<p81.c, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153452e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153452e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                p81.d.c cVar = p81.d.c.f153418a;
                this.f153452e = 1;
                if (nVar.F(cVar, this) == objE) {
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
        public final Object w(p81.c cVar, f fVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp81/a;", "<unused var>", "Lp81/f;", "Loq/i0;", "<anonymous>", "(Lp81/a;Lp81/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<p81.a, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153454e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153454e;
            if (i15 == 0) {
                u.b(obj);
                n.this.setupData.Y4(null);
                n nVar = n.this;
                p81.d.a aVar = p81.d.a.f153416a;
                this.f153454e = 1;
                if (nVar.F(aVar, this) == objE) {
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
        public final Object w(p81.a aVar, f fVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp81/e;", "<unused var>", "Lp81/f;", "Loq/i0;", "<anonymous>", "(Lp81/e;Lp81/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<p81.e, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153456e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153456e;
            if (i15 == 0) {
                u.b(obj);
                n.this.setupData.Y4(i61.q.a.f89801a);
                n nVar = n.this;
                p81.d.C3784d c3784d = p81.d.C3784d.f153419a;
                this.f153456e = 1;
                if (nVar.F(c3784d, this) == objE) {
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
        public final Object w(p81.e eVar, f fVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp81/b;", "<unused var>", "Lp81/f;", "Loq/i0;", "<anonymous>", "(Lp81/b;Lp81/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<p81.b, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153458e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153458e;
            if (i15 == 0) {
                u.b(obj);
                n.this.setupData.Y4(i61.q.b.f89802a);
                n nVar = n.this;
                p81.d.b bVar = p81.d.b.f153417a;
                this.f153458e = 1;
                if (nVar.F(bVar, this) == objE) {
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
        public final Object w(p81.b bVar, f fVar, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, q81.a aVar2, r81.a aVar3) {
        this.mapper = aVar2;
        this.setupData = aVar3;
        f fVar = f.f153421a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: p81.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f153433a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data l9(f state) {
        return this.mapper.b(new q81.a.Params(state, b9(p81.a.f153413a), b9(p81.c.f153415a), b9(p81.e.f153420a), b9(p81.b.f153414a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final n nVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: p81.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f153432a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p81.c.class), oVar, bVar);
        zVar.x(q0.c(p81.a.class), oVar, nVar.new c(null));
        zVar.x(q0.c(p81.e.class), oVar, nVar.new d(null));
        zVar.x(q0.c(p81.b.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p81.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p81.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(r81.a aVar) {
        super.P5(aVar);
    }
}
