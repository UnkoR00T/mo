package vl1;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lvl1/p;", "Ll00/g;", "Lvl1/g;", "", "Lvl1/h;", "Lyy/a;", "stateMachineFactory", "Lxl1/a;", "mapper", "Lwl1/a;", "contract", "<init>", "(Lyy/a;Lxl1/a;Lwl1/a;)V", "state", "Lvl1/h$a;", "k9", "(Lvl1/g;)Lvl1/h$a;", "b", "Lxl1/a;", "c", "Lvl1/g;", "initialState", "Lxw/b;", "Lvl1/e;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xl1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f207240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f207241b;

        /* JADX INFO: renamed from: vl1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5426a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f207242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f207243b;

            /* JADX INFO: renamed from: vl1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5427a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f207244d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f207245e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f207246f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f207248h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f207249j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f207250k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f207251l;

                public C5427a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f207244d = obj;
                    this.f207245e |= PKIFailureInfo.systemUnavail;
                    return C5426a.this.F(null, this);
                }
            }

            public C5426a(mu.h hVar, p pVar) {
                this.f207242a = hVar;
                this.f207243b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5427a c5427a;
                if (eVar instanceof C5427a) {
                    c5427a = (C5427a) eVar;
                    int i15 = c5427a.f207245e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5427a.f207245e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5427a = new C5427a(eVar);
                    }
                } else {
                    c5427a = new C5427a(eVar);
                }
                Object obj2 = c5427a.f207244d;
                Object objE = uq.b.e();
                int i16 = c5427a.f207245e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f207242a;
                    h.Data dataK9 = this.f207243b.k9((State) obj);
                    c5427a.f207246f = vq.j.a(obj);
                    c5427a.f207248h = vq.j.a(c5427a);
                    c5427a.f207249j = vq.j.a(obj);
                    c5427a.f207250k = vq.j.a(hVar);
                    c5427a.f207251l = 0;
                    c5427a.f207245e = 1;
                    if (hVar.F(dataK9, c5427a) == objE) {
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
            this.f207240a = gVar;
            this.f207241b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f207240a.a(new C5426a(hVar, this.f207241b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvl1/f;", "<unused var>", "Lvl1/g;", "Loq/i0;", "<anonymous>", "(Lvl1/f;Lvl1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207252e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207252e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                e.a aVar = e.a.f207222a;
                this.f207252e = 1;
                if (pVar.F(aVar, this) == objE) {
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

    public p(yy.a aVar, xl1.a aVar2, wl1.a aVar3) {
        this.mapper = aVar2;
        State state = new State(aVar3.getType());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: vl1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f207234a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data k9(State state) {
        return this.mapper.b(new xl1.a.Params(state, b9(f.f207223a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: vl1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f207233a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, z zVar) {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wl1.a aVar) {
        super.P5(aVar);
    }
}
