package ze0;

import f00.j0;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lze0/n;", "Ll00/g;", "Lze0/d;", "", "Lze0/e;", "Lyy/a;", "stateMachineFactory", "Laf0/a;", "mapper", "Lze0/f;", "setupContract", "<init>", "(Lyy/a;Laf0/a;Lze0/f;)V", "state", "Lze0/e$a;", "j9", "(Lze0/d;)Lze0/e$a;", "b", "Laf0/a;", "c", "Lze0/f;", "d", "Lze0/d;", "initialState", "Lxw/b;", "Lze0/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final af0.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ze0.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lze0/n$a;", "Lf00/j0;", "Lze0/f;", "Lze0/n;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<f, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f234655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f234656b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f234658b;

            /* JADX INFO: renamed from: ze0.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6320a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234659d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234660e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234661f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234663h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234664j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234665k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234666l;

                public C6320a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234659d = obj;
                    this.f234660e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f234657a = hVar;
                this.f234658b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6320a c6320a;
                if (eVar instanceof C6320a) {
                    c6320a = (C6320a) eVar;
                    int i15 = c6320a.f234660e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6320a.f234660e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6320a = new C6320a(eVar);
                    }
                } else {
                    c6320a = new C6320a(eVar);
                }
                Object obj2 = c6320a.f234659d;
                Object objE = uq.b.e();
                int i16 = c6320a.f234660e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f234657a;
                    e.Data dataJ9 = this.f234658b.j9((State) obj);
                    c6320a.f234661f = vq.j.a(obj);
                    c6320a.f234663h = vq.j.a(c6320a);
                    c6320a.f234664j = vq.j.a(obj);
                    c6320a.f234665k = vq.j.a(hVar);
                    c6320a.f234666l = 0;
                    c6320a.f234660e = 1;
                    if (hVar.F(dataJ9, c6320a) == objE) {
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

        public b(mu.g gVar, n nVar) {
            this.f234655a = gVar;
            this.f234656b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f234655a.a(new a(hVar, this.f234656b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lze0/a;", "<unused var>", "Lze0/d;", "Loq/i0;", "<anonymous>", "(Lze0/a;Lze0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ze0.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234667e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234667e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ze0.c> bVarY1 = n.this.Y1();
                ze0.c.a aVar = ze0.c.a.f234633a;
                this.f234667e = 1;
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
        public final Object w(ze0.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lze0/b;", "<unused var>", "Lze0/d;", "Loq/i0;", "<anonymous>", "(Lze0/b;Lze0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ze0.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234669e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234669e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ze0.c> bVarY1 = n.this.Y1();
                ze0.c.b bVar = ze0.c.b.f234634a;
                this.f234669e = 1;
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
        public final Object w(ze0.b bVar, State state, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, af0.a aVar2, f fVar) {
        this.mapper = aVar2;
        this.setupContract = fVar;
        State state = new State(fVar.g0());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ze0.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f234648a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(State state) {
        return this.mapper.b(new af0.a.Params(state, b9(ze0.a.f234631a), b9(ze0.b.f234632a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ze0.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f234647a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ze0.a.class), oVar, cVar);
        zVar.x(q0.c(ze0.b.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ze0.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
