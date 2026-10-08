package pa1;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lpa1/n;", "Ll00/g;", "Lpa1/d;", "", "Lpa1/e;", "Lyy/a;", "stateMachineFactory", "Lqa1/a;", "mapper", "<init>", "(Lyy/a;Lqa1/a;)V", "state", "Lpa1/e$a;", "k9", "(Lpa1/d;)Lpa1/e$a;", "Lva1/a;", "data", "Loq/i0;", "l9", "(Lva1/a;)V", "b", "Lqa1/a;", "Lpa1/d$a;", "c", "Lpa1/d$a;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpa1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qa1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d.a initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pa1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f153821b;

        /* JADX INFO: renamed from: pa1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3806a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f153823b;

            /* JADX INFO: renamed from: pa1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3807a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153824d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153825e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153826f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153828h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153829j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153830k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153831l;

                public C3807a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153824d = obj;
                    this.f153825e |= PKIFailureInfo.systemUnavail;
                    return C3806a.this.F(null, this);
                }
            }

            public C3806a(mu.h hVar, n nVar) {
                this.f153822a = hVar;
                this.f153823b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3807a c3807a;
                if (eVar instanceof C3807a) {
                    c3807a = (C3807a) eVar;
                    int i15 = c3807a.f153825e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3807a.f153825e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3807a = new C3807a(eVar);
                    }
                } else {
                    c3807a = new C3807a(eVar);
                }
                Object obj2 = c3807a.f153824d;
                Object objE = uq.b.e();
                int i16 = c3807a.f153825e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f153822a;
                    e.a aVarK9 = this.f153823b.k9((d) obj);
                    c3807a.f153826f = vq.j.a(obj);
                    c3807a.f153828h = vq.j.a(c3807a);
                    c3807a.f153829j = vq.j.a(obj);
                    c3807a.f153830k = vq.j.a(hVar);
                    c3807a.f153831l = 0;
                    c3807a.f153825e = 1;
                    if (hVar.F(aVarK9, c3807a) == objE) {
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
            this.f153820a = gVar;
            this.f153821b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a> hVar, tq.e eVar) {
            Object objA = this.f153820a.a(new C3806a(hVar, this.f153821b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpa1/a;", "<unused var>", "Lpa1/d;", "Loq/i0;", "<anonymous>", "(Lpa1/a;Lpa1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<pa1.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153832e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153832e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<pa1.b> bVarY1 = n.this.Y1();
                pa1.b.a aVar = pa1.b.a.f153798a;
                this.f153832e = 1;
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
        public final Object w(pa1.a aVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpa1/c;", "action", "Lk10/c0;", "Lpa1/d$a;", "state", "Lk10/l;", "Lpa1/d;", "<anonymous>", "(Lpa1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<Setup, c0<d.a>, tq.e<? super k10.l<? extends d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153835f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f153836g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d.Initialized O(Setup setup, d.a aVar) {
            return new d.Initialized(setup.getCardListPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f153835f;
            c0 c0Var = (c0) this.f153836g;
            uq.b.e();
            if (this.f153834e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: pa1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(setup, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<d.a> c0Var, tq.e<? super k10.l<? extends d>> eVar) {
            c cVar = new c(eVar);
            cVar.f153835f = setup;
            cVar.f153836g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, qa1.a aVar2) {
        this.mapper = aVar2;
        d.a aVar3 = d.a.f153800a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: pa1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f153813a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a k9(d state) {
        return this.mapper.b(new qa1.a.Params(state, b9(pa1.a.f153797a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: pa1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f153814a, (z) obj);
            }
        });
        vVar.c(q0.c(d.a.class), new er.l() { // from class: pa1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(pa1.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(z zVar) {
        c cVar = new c(null);
        zVar.v(q0.c(Setup.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pa1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public void P5(va1.a data) {
        d9(new Setup(data));
    }
}
