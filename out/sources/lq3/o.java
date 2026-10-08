package lq3;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Llq3/o;", "Ll00/g;", "Llq3/f;", "", "Llq3/g;", "Lyy/a;", "stateMachineFactory", "Lmq3/a;", "voteSuccessScreenMapper", "Lkp3/a$a;", "ideaActiveRoundData", "<init>", "(Lyy/a;Lmq3/a;Lkp3/a$a;)V", "state", "Llq3/g$a;", "j9", "(Llq3/f;)Llq3/g$a;", "b", "Lmq3/a;", "c", "Lkp3/a$a;", "d", "Llq3/f;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llq3/e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mq3.a voteSuccessScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kp3.a.ActiveRoundIdea ideaActiveRoundData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f119656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f119657b;

        /* JADX INFO: renamed from: lq3.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2914a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f119658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f119659b;

            /* JADX INFO: renamed from: lq3.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2915a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f119660d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f119661e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f119662f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f119664h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f119665j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f119666k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f119667l;

                public C2915a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f119660d = obj;
                    this.f119661e |= PKIFailureInfo.systemUnavail;
                    return C2914a.this.F(null, this);
                }
            }

            public C2914a(mu.h hVar, o oVar) {
                this.f119658a = hVar;
                this.f119659b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2915a c2915a;
                if (eVar instanceof C2915a) {
                    c2915a = (C2915a) eVar;
                    int i15 = c2915a.f119661e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2915a.f119661e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2915a = new C2915a(eVar);
                    }
                } else {
                    c2915a = new C2915a(eVar);
                }
                Object obj2 = c2915a.f119660d;
                Object objE = uq.b.e();
                int i16 = c2915a.f119661e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f119658a;
                    g.Data dataJ9 = this.f119659b.j9((State) obj);
                    c2915a.f119662f = vq.j.a(obj);
                    c2915a.f119664h = vq.j.a(c2915a);
                    c2915a.f119665j = vq.j.a(obj);
                    c2915a.f119666k = vq.j.a(hVar);
                    c2915a.f119667l = 0;
                    c2915a.f119661e = 1;
                    if (hVar.F(dataJ9, c2915a) == objE) {
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
            this.f119656a = gVar;
            this.f119657b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f119656a.a(new C2914a(hVar, this.f119657b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llq3/d;", "<unused var>", "Llq3/f;", "Loq/i0;", "<anonymous>", "(Llq3/d;Llq3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119668e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f119668e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e> bVarY1 = o.this.Y1();
                e.a aVar = e.a.f119631a;
                this.f119668e = 1;
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
        public final Object w(d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, mq3.a aVar2, kp3.a.ActiveRoundIdea activeRoundIdea) {
        this.voteSuccessScreenMapper = aVar2;
        this.ideaActiveRoundData = activeRoundIdea;
        State state = new State(activeRoundIdea.getIdea().getTopic(), activeRoundIdea.getActiveRoundEndDate());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: lq3.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.l9(this.f119649a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data j9(State state) {
        return this.voteSuccessScreenMapper.b(new mq3.a.Params(b9(d.f119630a), state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: lq3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f119648a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(d.class), k10.o.CANCEL_PREVIOUS, bVar);
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
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kp3.a.ActiveRoundIdea activeRoundIdea) {
        super.P5(activeRoundIdea);
    }
}
