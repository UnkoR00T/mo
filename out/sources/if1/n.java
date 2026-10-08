package if1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import ld1.SummaryStatusEntryData;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lif1/n;", "Ll00/g;", "Lif1/j;", "", "Lif1/k;", "Lyy/a;", "stateMachineFactory", "Ljf1/a;", "mapper", "Lld1/q;", "setupData", "<init>", "(Lyy/a;Ljf1/a;Lld1/q;)V", "state", "Lif1/k$a$a;", "j9", "(Lif1/j;)Lif1/k$a$a;", "b", "Ljf1/a;", "c", "Lld1/q;", "Lxw/b;", "Lif1/i;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "e", "Lif1/j;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lif1/k$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jf1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SummaryStatusEntryData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k.a.Summary> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f92102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f92103b;

        /* JADX INFO: renamed from: if1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2181a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f92104a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f92105b;

            /* JADX INFO: renamed from: if1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2182a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f92106d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f92107e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f92108f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f92110h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f92111j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f92112k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f92113l;

                public C2182a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f92106d = obj;
                    this.f92107e |= PKIFailureInfo.systemUnavail;
                    return C2181a.this.F(null, this);
                }
            }

            public C2181a(mu.h hVar, n nVar) {
                this.f92104a = hVar;
                this.f92105b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2182a c2182a;
                if (eVar instanceof C2182a) {
                    c2182a = (C2182a) eVar;
                    int i15 = c2182a.f92107e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2182a.f92107e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2182a = new C2182a(eVar);
                    }
                } else {
                    c2182a = new C2182a(eVar);
                }
                Object obj2 = c2182a.f92106d;
                Object objE = uq.b.e();
                int i16 = c2182a.f92107e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f92104a;
                    k.a.Summary summaryJ9 = this.f92105b.j9((State) obj);
                    c2182a.f92108f = vq.j.a(obj);
                    c2182a.f92110h = vq.j.a(c2182a);
                    c2182a.f92111j = vq.j.a(obj);
                    c2182a.f92112k = vq.j.a(hVar);
                    c2182a.f92113l = 0;
                    c2182a.f92107e = 1;
                    if (hVar.F(summaryJ9, c2182a) == objE) {
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
            this.f92102a = gVar;
            this.f92103b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.a.Summary> hVar, tq.e eVar) {
            Object objA = this.f92102a.a(new C2181a(hVar, this.f92103b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lif1/i;", "action", "Lif1/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lif1/i;Lif1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92115f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i iVar = (i) this.f92115f;
            Object objE = uq.b.e();
            int i15 = this.f92114e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i> bVarY1 = n.this.Y1();
                this.f92115f = vq.j.a(iVar);
                this.f92114e = 1;
                if (bVarY1.F(iVar, this) == objE) {
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
        public final Object w(i iVar, State state, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f92115f = iVar;
            return bVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, jf1.a aVar2, SummaryStatusEntryData summaryStatusEntryData) {
        this.mapper = aVar2;
        this.setupData = summaryStatusEntryData;
        State state = new State(summaryStatusEntryData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: if1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f92095a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.a.Summary j9(State state) {
        return this.mapper.b(new jf1.a.Params(state, b9(i.b.f92089a), b9(i.a.f92088a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: if1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f92094a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(i.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SummaryStatusEntryData summaryStatusEntryData) {
        super.P5(summaryStatusEntryData);
    }
}
