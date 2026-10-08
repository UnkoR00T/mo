package aq2;

import al0.s0;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Laq2/o;", "Ll00/g;", "Laq2/f;", "", "Laq2/g;", "Lyy/a;", "stateMachineFactory", "Lbq2/e;", "mapper", "Laq2/e;", "setupData", "<init>", "(Lyy/a;Lbq2/e;Laq2/e;)V", "state", "Laq2/g$a;", "l9", "(Laq2/f;)Laq2/g$a;", "b", "Lbq2/e;", "c", "Laq2/e;", "d", "Laq2/f;", "initialState", "Lxw/b;", "Laq2/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<f, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bq2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<aq2.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f14102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f14103b;

        /* JADX INFO: renamed from: aq2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0303a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f14104a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f14105b;

            /* JADX INFO: renamed from: aq2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0304a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f14106d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f14107e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f14108f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f14110h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f14111j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f14112k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f14113l;

                public C0304a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f14106d = obj;
                    this.f14107e |= PKIFailureInfo.systemUnavail;
                    return C0303a.this.F(null, this);
                }
            }

            public C0303a(mu.h hVar, o oVar) {
                this.f14104a = hVar;
                this.f14105b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0304a c0304a;
                if (eVar instanceof C0304a) {
                    c0304a = (C0304a) eVar;
                    int i15 = c0304a.f14107e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0304a.f14107e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0304a = new C0304a(eVar);
                    }
                } else {
                    c0304a = new C0304a(eVar);
                }
                Object obj2 = c0304a.f14106d;
                Object objE = uq.b.e();
                int i16 = c0304a.f14107e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f14104a;
                    g.Data dataL9 = this.f14105b.l9((f) obj);
                    c0304a.f14108f = vq.j.a(obj);
                    c0304a.f14110h = vq.j.a(c0304a);
                    c0304a.f14111j = vq.j.a(obj);
                    c0304a.f14112k = vq.j.a(hVar);
                    c0304a.f14113l = 0;
                    c0304a.f14107e = 1;
                    if (hVar.F(dataL9, c0304a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f14102a = gVar;
            this.f14103b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f14102a.a(new C0303a(hVar, this.f14103b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laq2/d;", "action", "Laq2/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Laq2/d;Laq2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Next, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14115f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Next next = (Next) this.f14115f;
            Object objE = uq.b.e();
            int i15 = this.f14114e;
            if (i15 == 0) {
                u.b(obj);
                o.this.setupData.getContract().l8(new cq2.a.PassportTypeData(next.getPassportType()));
                xw.b<aq2.c> bVarY1 = o.this.Y1();
                aq2.c.Next next2 = new aq2.c.Next(next.getPassportType());
                this.f14115f = vq.j.a(next);
                this.f14114e = 1;
                if (bVarY1.F(next2, this) == objE) {
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
        public final Object w(Next next, f fVar, tq.e<? super i0> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f14115f = next;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laq2/b;", "<unused var>", "Laq2/f;", "Loq/i0;", "<anonymous>", "(Laq2/b;Laq2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<aq2.b, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14117e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14117e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<aq2.c> bVarY1 = o.this.Y1();
                aq2.c.b bVar = aq2.c.b.f14078a;
                this.f14117e = 1;
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
        public final Object w(aq2.b bVar, f fVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laq2/a;", "<unused var>", "Laq2/f;", "Loq/i0;", "<anonymous>", "(Laq2/a;Laq2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<aq2.a, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14119e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14119e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<aq2.c> bVarY1 = o.this.Y1();
                aq2.c.a aVar = aq2.c.a.f14077a;
                this.f14119e = 1;
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
        public final Object w(aq2.a aVar, f fVar, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, bq2.e eVar, SetupData setupData) {
        this.mapper = eVar;
        this.setupData = setupData;
        f fVar = f.f14082a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: aq2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f14095a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data l9(f state) {
        return this.mapper.b(new bq2.e.Params(state, new er.l() { // from class: aq2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f14094a, (s0) obj);
            }
        }, b9(aq2.a.f14075a), b9(aq2.b.f14076a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, s0 s0Var) {
        oVar.d9(new Next(s0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final o oVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: aq2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f14093a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Next.class), oVar2, bVar);
        zVar.x(q0.c(aq2.b.class), oVar2, oVar.new c(null));
        zVar.x(q0.c(aq2.a.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<aq2.c> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
