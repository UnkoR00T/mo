package gc2;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgc2/p;", "Ll00/g;", "Lgc2/g;", "", "Lgc2/h;", "Lyy/a;", "stateMachineFactory", "Lic2/a;", "mapper", "Lhc2/a;", "contract", "<init>", "(Lyy/a;Lic2/a;Lhc2/a;)V", "state", "Lgc2/h$a;", "j9", "(Lgc2/g;)Lgc2/h$a;", "b", "Lic2/a;", "c", "Lhc2/a;", "d", "Lgc2/g;", "initialState", "Lxw/b;", "Lgc2/e;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ic2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hc2.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f71796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f71797b;

        /* JADX INFO: renamed from: gc2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1641a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f71798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f71799b;

            /* JADX INFO: renamed from: gc2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1642a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71800d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71801e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71802f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f71804h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f71805j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71806k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71807l;

                public C1642a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f71800d = obj;
                    this.f71801e |= PKIFailureInfo.systemUnavail;
                    return C1641a.this.F(null, this);
                }
            }

            public C1641a(mu.h hVar, p pVar) {
                this.f71798a = hVar;
                this.f71799b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1642a c1642a;
                if (eVar instanceof C1642a) {
                    c1642a = (C1642a) eVar;
                    int i15 = c1642a.f71801e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1642a.f71801e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1642a = new C1642a(eVar);
                    }
                } else {
                    c1642a = new C1642a(eVar);
                }
                Object obj2 = c1642a.f71800d;
                Object objE = uq.b.e();
                int i16 = c1642a.f71801e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f71798a;
                    h.Data dataJ9 = this.f71799b.j9((State) obj);
                    c1642a.f71802f = vq.j.a(obj);
                    c1642a.f71804h = vq.j.a(c1642a);
                    c1642a.f71805j = vq.j.a(obj);
                    c1642a.f71806k = vq.j.a(hVar);
                    c1642a.f71807l = 0;
                    c1642a.f71801e = 1;
                    if (hVar.F(dataJ9, c1642a) == objE) {
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
            this.f71796a = gVar;
            this.f71797b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f71796a.a(new C1641a(hVar, this.f71797b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgc2/f;", "<unused var>", "Lgc2/g;", "Loq/i0;", "<anonymous>", "(Lgc2/f;Lgc2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71808e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71808e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e> bVarY1 = p.this.Y1();
                e.a aVar = e.a.f71777a;
                this.f71808e = 1;
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
        public final Object w(f fVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ic2.a aVar2, hc2.a aVar3) {
        this.mapper = aVar2;
        this.contract = aVar3;
        State state = new State(aVar3.d5());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: gc2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.l9(this.f71789a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data j9(State state) {
        return this.mapper.b(new ic2.a.Params(state, b9(f.f71778a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: gc2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f71788a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(f.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hc2.a aVar) {
        super.P5(aVar);
    }
}
