package n71;

import er.q;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ln71/l;", "Ll00/g;", "Ln71/d;", "", "Ln71/e;", "Lyy/a;", "stateMachineFactory", "Lo71/a;", "mapper", "Lm71/a;", "contract", "<init>", "(Lyy/a;Lo71/a;Lm71/a;)V", "state", "Ln71/e$a;", "k9", "(Ln71/d;)Ln71/e$a;", "b", "Lo71/a;", "c", "Lm71/a;", "d", "Ln71/d;", "initialState", "Lxw/b;", "Ln71/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<n71.d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o71.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m71.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n71.d initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n71.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<n71.d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f133420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f133421b;

        /* JADX INFO: renamed from: n71.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3297a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f133422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f133423b;

            /* JADX INFO: renamed from: n71.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3298a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f133424d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f133425e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f133426f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f133428h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f133429j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f133430k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f133431l;

                public C3298a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f133424d = obj;
                    this.f133425e |= PKIFailureInfo.systemUnavail;
                    return C3297a.this.F(null, this);
                }
            }

            public C3297a(mu.h hVar, l lVar) {
                this.f133422a = hVar;
                this.f133423b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3298a c3298a;
                if (eVar instanceof C3298a) {
                    c3298a = (C3298a) eVar;
                    int i15 = c3298a.f133425e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3298a.f133425e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3298a = new C3298a(eVar);
                    }
                } else {
                    c3298a = new C3298a(eVar);
                }
                Object obj2 = c3298a.f133424d;
                Object objE = uq.b.e();
                int i16 = c3298a.f133425e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f133422a;
                    e.Data dataK9 = this.f133423b.k9((n71.d) obj);
                    c3298a.f133426f = vq.j.a(obj);
                    c3298a.f133428h = vq.j.a(c3298a);
                    c3298a.f133429j = vq.j.a(obj);
                    c3298a.f133430k = vq.j.a(hVar);
                    c3298a.f133431l = 0;
                    c3298a.f133425e = 1;
                    if (hVar.F(dataK9, c3298a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f133420a = gVar;
            this.f133421b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f133420a.a(new C3297a(hVar, this.f133421b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln71/b;", "action", "Ln71/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln71/b;Ln71/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<n71.b, n71.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133433f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n71.b bVar = (n71.b) this.f133433f;
            Object objE = uq.b.e();
            int i15 = this.f133432e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n71.b> bVarY1 = l.this.Y1();
                this.f133433f = vq.j.a(bVar);
                this.f133432e = 1;
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
        public final Object w(n71.b bVar, n71.d dVar, tq.e<? super i0> eVar) {
            b bVar2 = l.this.new b(eVar);
            bVar2.f133433f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln71/a;", "<unused var>", "Ln71/d;", "Loq/i0;", "<anonymous>", "(Ln71/a;Ln71/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<n71.a, n71.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133435e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133435e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n71.b> bVarY1 = l.this.Y1();
                n71.b.c cVar = n71.b.c.f133397a;
                this.f133435e = 1;
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
        public final Object w(n71.a aVar, n71.d dVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln71/c;", "<unused var>", "Ln71/d;", "Loq/i0;", "<anonymous>", "(Ln71/c;Ln71/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<n71.c, n71.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133437e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133437e;
            if (i15 == 0) {
                u.b(obj);
                l.this.contract.q3(null);
                xw.b<n71.b> bVarY1 = l.this.Y1();
                n71.b.d dVar = n71.b.d.f133398a;
                this.f133437e = 1;
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
        public final Object w(n71.c cVar, n71.d dVar, tq.e<? super i0> eVar) {
            return l.this.new d(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, o71.a aVar2, m71.a aVar3) {
        this.mapper = aVar2;
        this.contract = aVar3;
        n71.d dVar = n71.d.f133400a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: n71.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f133413a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(n71.d state) {
        return this.mapper.b(new o71.a.Params(state, b9(n71.b.a.f133395a), b9(n71.b.C3296b.f133396a), b9(n71.a.f133394a), b9(n71.c.f133399a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(n71.d.class), new er.l() { // from class: n71.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f133412a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n71.b.class), oVar, bVar);
        zVar.x(q0.c(n71.a.class), oVar, lVar.new c(null));
        zVar.x(q0.c(n71.c.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n71.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<n71.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m71.a aVar) {
        super.P5(aVar);
    }
}
