package iq2;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Liq2/n;", "Ll00/g;", "Liq2/e;", "", "Liq2/f;", "Lyy/a;", "stateMachineFactory", "Ljq2/c;", "mapper", "Lkq2/a;", "dataContract", "<init>", "(Lyy/a;Ljq2/c;Lkq2/a;)V", "state", "Liq2/f$a;", "m9", "(Liq2/e;)Liq2/f$a;", "b", "Ljq2/c;", "c", "Lkq2/a;", "d", "Liq2/e;", "initialState", "Lxw/b;", "Liq2/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jq2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kq2.a dataContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<iq2.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f96521b;

        /* JADX INFO: renamed from: iq2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2253a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f96523b;

            /* JADX INFO: renamed from: iq2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2254a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96524d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96525e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96526f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96528h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96529j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96530k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96531l;

                public C2254a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96524d = obj;
                    this.f96525e |= PKIFailureInfo.systemUnavail;
                    return C2253a.this.F(null, this);
                }
            }

            public C2253a(mu.h hVar, n nVar) {
                this.f96522a = hVar;
                this.f96523b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2254a c2254a;
                if (eVar instanceof C2254a) {
                    c2254a = (C2254a) eVar;
                    int i15 = c2254a.f96525e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2254a.f96525e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2254a = new C2254a(eVar);
                    }
                } else {
                    c2254a = new C2254a(eVar);
                }
                Object obj2 = c2254a.f96524d;
                Object objE = uq.b.e();
                int i16 = c2254a.f96525e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f96522a;
                    f.Data dataM9 = this.f96523b.m9((e) obj);
                    c2254a.f96526f = vq.j.a(obj);
                    c2254a.f96528h = vq.j.a(c2254a);
                    c2254a.f96529j = vq.j.a(obj);
                    c2254a.f96530k = vq.j.a(hVar);
                    c2254a.f96531l = 0;
                    c2254a.f96525e = 1;
                    if (hVar.F(dataM9, c2254a) == objE) {
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
            this.f96520a = gVar;
            this.f96521b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f96520a.a(new C2253a(hVar, this.f96521b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq2/d;", "action", "Liq2/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liq2/d;Liq2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Next, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96533f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Next next = (Next) this.f96533f;
            Object objE = uq.b.e();
            int i15 = this.f96532e;
            if (i15 == 0) {
                u.b(obj);
                n.this.dataContract.M7(new kq2.a.WhoAgreesData(next.getWhoAgrees()));
                n nVar = n.this;
                iq2.c.Next next2 = new iq2.c.Next(next.getWhoAgrees());
                this.f96533f = vq.j.a(next);
                this.f96532e = 1;
                if (nVar.F(next2, this) == objE) {
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
        public final Object w(Next next, e eVar, tq.e<? super i0> eVar2) {
            b bVar = n.this.new b(eVar2);
            bVar.f96533f = next;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq2/a;", "<unused var>", "Liq2/e;", "Loq/i0;", "<anonymous>", "(Liq2/a;Liq2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<iq2.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96535e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96535e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<iq2.c> bVarY1 = n.this.Y1();
                iq2.c.a aVar = iq2.c.a.f96496a;
                this.f96535e = 1;
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
        public final Object w(iq2.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq2/b;", "<unused var>", "Liq2/e;", "Loq/i0;", "<anonymous>", "(Liq2/b;Liq2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<iq2.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96537e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96537e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<iq2.c> bVarY1 = n.this.Y1();
                iq2.c.b bVar = iq2.c.b.f96497a;
                this.f96537e = 1;
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
        public final Object w(iq2.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, jq2.c cVar, kq2.a aVar2) {
        this.mapper = cVar;
        this.dataContract = aVar2;
        e eVar = e.f96500a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: iq2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f96513a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(e state) {
        return this.mapper.b(new jq2.c.Params(state, new er.l() { // from class: iq2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f96511a, (kq2.b) obj);
            }
        }, b9(iq2.a.f96494a), b9(iq2.b.f96495a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, kq2.b bVar) {
        nVar.d9(new Next(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: iq2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f96512a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Next.class), oVar, bVar);
        zVar.x(q0.c(iq2.a.class), oVar, nVar.new c(null));
        zVar.x(q0.c(iq2.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<iq2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(iq2.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kq2.a aVar) {
        super.P5(aVar);
    }
}
