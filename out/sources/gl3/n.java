package gl3;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgl3/n;", "Ll00/g;", "Lgl3/e;", "", "Lgl3/f;", "Lyy/a;", "stateMachineFactory", "Lil3/b;", "mapper", "Lhl3/a;", "contract", "<init>", "(Lyy/a;Lil3/b;Lhl3/a;)V", "state", "Lgl3/f$a;", "m9", "(Lgl3/e;)Lgl3/f$a;", "b", "Lil3/b;", "c", "Lhl3/a;", "d", "Lgl3/e;", "initialState", "Lxw/b;", "Lgl3/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hl3.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gl3.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f73683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f73684b;

        /* JADX INFO: renamed from: gl3.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1692a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f73685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f73686b;

            /* JADX INFO: renamed from: gl3.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1693a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73687d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f73688e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f73689f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f73691h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f73692j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f73693k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f73694l;

                public C1693a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f73687d = obj;
                    this.f73688e |= PKIFailureInfo.systemUnavail;
                    return C1692a.this.F(null, this);
                }
            }

            public C1692a(mu.h hVar, n nVar) {
                this.f73685a = hVar;
                this.f73686b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1693a c1693a;
                if (eVar instanceof C1693a) {
                    c1693a = (C1693a) eVar;
                    int i15 = c1693a.f73688e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1693a.f73688e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1693a = new C1693a(eVar);
                    }
                } else {
                    c1693a = new C1693a(eVar);
                }
                Object obj2 = c1693a.f73687d;
                Object objE = uq.b.e();
                int i16 = c1693a.f73688e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f73685a;
                    f.Data dataM9 = this.f73686b.m9((e) obj);
                    c1693a.f73689f = vq.j.a(obj);
                    c1693a.f73691h = vq.j.a(c1693a);
                    c1693a.f73692j = vq.j.a(obj);
                    c1693a.f73693k = vq.j.a(hVar);
                    c1693a.f73694l = 0;
                    c1693a.f73688e = 1;
                    if (hVar.F(dataM9, c1693a) == objE) {
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
            this.f73683a = gVar;
            this.f73684b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f73683a.a(new C1692a(hVar, this.f73684b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgl3/b;", "<unused var>", "Lgl3/e;", "Loq/i0;", "<anonymous>", "(Lgl3/b;Lgl3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<gl3.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73695e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73695e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                gl3.a.C1691a c1691a = gl3.a.C1691a.f73656a;
                this.f73695e = 1;
                if (nVar.F(c1691a, this) == objE) {
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
        public final Object w(gl3.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgl3/c;", "<unused var>", "Lgl3/e;", "Loq/i0;", "<anonymous>", "(Lgl3/c;Lgl3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<gl3.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73697e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73697e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                gl3.a.b bVar = gl3.a.b.f73657a;
                this.f73697e = 1;
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
        public final Object w(gl3.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgl3/d;", "action", "Lgl3/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgl3/d;Lgl3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnNext, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73700f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnNext onNext = (OnNext) this.f73700f;
            Object objE = uq.b.e();
            int i15 = this.f73699e;
            if (i15 == 0) {
                u.b(obj);
                n.this.contract.d(onNext.getOwnerType());
                n nVar = n.this;
                gl3.a.c cVar = gl3.a.c.f73658a;
                this.f73700f = vq.j.a(onNext);
                this.f73699e = 1;
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
        public final Object w(OnNext onNext, e eVar, tq.e<? super i0> eVar2) {
            d dVar = n.this.new d(eVar2);
            dVar.f73700f = onNext;
            return dVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, il3.b bVar, hl3.a aVar2) {
        this.mapper = bVar;
        this.contract = aVar2;
        e eVar = e.f73662a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: gl3.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f73676a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(e state) {
        return this.mapper.b(new il3.b.Params(state, b9(gl3.b.f73659a), b9(gl3.c.f73660a), new er.l() { // from class: gl3.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f73675a, (lk3.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, lk3.a aVar) {
        nVar.d9(new OnNext(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: gl3.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f73674a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gl3.b.class), oVar, bVar);
        zVar.x(q0.c(gl3.c.class), oVar, nVar.new c(null));
        zVar.x(q0.c(OnNext.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gl3.a> Y1() {
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
    public /* bridge */ Object F(gl3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hl3.a aVar) {
        super.P5(aVar);
    }
}
