package p91;

import cl0.g0;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lp91/n;", "Ll00/g;", "Lp91/e;", "", "Lp91/f;", "Lyy/a;", "stateMachineFactory", "Lq91/c;", "mapper", "Lr91/a;", "dataContract", "<init>", "(Lyy/a;Lq91/c;Lr91/a;)V", "state", "Lp91/f$a;", "l9", "(Lp91/e;)Lp91/f$a;", "b", "Lq91/c;", "c", "Lr91/a;", "d", "Lp91/e;", "initialState", "Lxw/b;", "Lp91/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q91.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r91.a dataContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p91.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f153593b;

        /* JADX INFO: renamed from: p91.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3794a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f153595b;

            /* JADX INFO: renamed from: p91.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3795a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153596d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153597e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153598f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153600h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153601j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153602k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153603l;

                public C3795a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153596d = obj;
                    this.f153597e |= PKIFailureInfo.systemUnavail;
                    return C3794a.this.F(null, this);
                }
            }

            public C3794a(mu.h hVar, n nVar) {
                this.f153594a = hVar;
                this.f153595b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3795a c3795a;
                if (eVar instanceof C3795a) {
                    c3795a = (C3795a) eVar;
                    int i15 = c3795a.f153597e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3795a.f153597e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3795a = new C3795a(eVar);
                    }
                } else {
                    c3795a = new C3795a(eVar);
                }
                Object obj2 = c3795a.f153596d;
                Object objE = uq.b.e();
                int i16 = c3795a.f153597e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f153594a;
                    f.Data dataL9 = this.f153595b.l9((e) obj);
                    c3795a.f153598f = vq.j.a(obj);
                    c3795a.f153600h = vq.j.a(c3795a);
                    c3795a.f153601j = vq.j.a(obj);
                    c3795a.f153602k = vq.j.a(hVar);
                    c3795a.f153603l = 0;
                    c3795a.f153597e = 1;
                    if (hVar.F(dataL9, c3795a) == objE) {
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
            this.f153592a = gVar;
            this.f153593b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f153592a.a(new C3794a(hVar, this.f153593b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp91/d;", "action", "Lp91/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp91/d;Lp91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Next, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153605f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Next next = (Next) this.f153605f;
            Object objE = uq.b.e();
            int i15 = this.f153604e;
            if (i15 == 0) {
                u.b(obj);
                n.this.dataContract.g1(new r91.a.PassportOfficePlaceData(next.getPassportOfficePlace()));
                xw.b<p91.c> bVarY1 = n.this.Y1();
                p91.c.C3793c c3793c = p91.c.C3793c.f153570a;
                this.f153605f = vq.j.a(next);
                this.f153604e = 1;
                if (bVarY1.F(c3793c, this) == objE) {
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
            bVar.f153605f = next;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp91/a;", "<unused var>", "Lp91/e;", "Loq/i0;", "<anonymous>", "(Lp91/a;Lp91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<p91.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153607e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153607e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p91.c> bVarY1 = n.this.Y1();
                p91.c.a aVar = p91.c.a.f153568a;
                this.f153607e = 1;
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
        public final Object w(p91.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp91/b;", "<unused var>", "Lp91/e;", "Loq/i0;", "<anonymous>", "(Lp91/b;Lp91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<p91.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153609e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153609e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p91.c> bVarY1 = n.this.Y1();
                p91.c.b bVar = p91.c.b.f153569a;
                this.f153609e = 1;
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
        public final Object w(p91.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, q91.c cVar, r91.a aVar2) {
        this.mapper = cVar;
        this.dataContract = aVar2;
        e eVar = e.f153572a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: p91.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f153585a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(e state) {
        return this.mapper.b(new q91.c.Params(state, new er.l() { // from class: p91.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f153584a, (g0) obj);
            }
        }, b9(p91.a.f153566a), b9(p91.b.f153567a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, g0 g0Var) {
        nVar.d9(new Next(g0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: p91.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f153583a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Next.class), oVar, bVar);
        zVar.x(q0.c(p91.a.class), oVar, nVar.new c(null));
        zVar.x(q0.c(p91.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p91.c> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(r91.a aVar) {
        super.P5(aVar);
    }
}
