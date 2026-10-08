package uj3;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tj3.TimelinePayload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Luj3/k;", "Ll00/g;", "Luj3/g;", "", "Luj3/h;", "Lwj3/b;", "vehicleHistoryTimelineMapper", "Lyy/a;", "stateMachineFactory", "Ltj3/c;", "payload", "<init>", "(Lwj3/b;Lyy/a;Ltj3/c;)V", "state", "Luj3/h$a;", "j9", "(Luj3/g;)Luj3/h$a;", "b", "Lwj3/b;", "c", "Ltj3/c;", "d", "Luj3/g;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Luj3/f;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wj3.b vehicleHistoryTimelineMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TimelinePayload payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f198617b;

        /* JADX INFO: renamed from: uj3.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5171a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f198619b;

            /* JADX INFO: renamed from: uj3.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5172a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198620d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198621e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198622f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198624h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198625j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198626k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198627l;

                public C5172a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198620d = obj;
                    this.f198621e |= PKIFailureInfo.systemUnavail;
                    return C5171a.this.F(null, this);
                }
            }

            public C5171a(mu.h hVar, k kVar) {
                this.f198618a = hVar;
                this.f198619b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5172a c5172a;
                if (eVar instanceof C5172a) {
                    c5172a = (C5172a) eVar;
                    int i15 = c5172a.f198621e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5172a.f198621e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5172a = new C5172a(eVar);
                    }
                } else {
                    c5172a = new C5172a(eVar);
                }
                Object obj2 = c5172a.f198620d;
                Object objE = uq.b.e();
                int i16 = c5172a.f198621e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f198618a;
                    h.Data dataJ9 = this.f198619b.j9((State) obj);
                    c5172a.f198622f = vq.j.a(obj);
                    c5172a.f198624h = vq.j.a(c5172a);
                    c5172a.f198625j = vq.j.a(obj);
                    c5172a.f198626k = vq.j.a(hVar);
                    c5172a.f198627l = 0;
                    c5172a.f198621e = 1;
                    if (hVar.F(dataJ9, c5172a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f198616a = gVar;
            this.f198617b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f198616a.a(new C5171a(hVar, this.f198617b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luj3/e;", "<unused var>", "Luj3/g;", "Loq/i0;", "<anonymous>", "(Luj3/e;Luj3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198628e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198628e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<f> bVarY1 = k.this.Y1();
                f.a aVar = f.a.f198604a;
                this.f198628e = 1;
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
        public final Object w(e eVar, State state, tq.e<? super i0> eVar2) {
            return k.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public k(wj3.b bVar, yy.a aVar, TimelinePayload timelinePayload) {
        this.vehicleHistoryTimelineMapper = bVar;
        this.payload = timelinePayload;
        State state = new State(timelinePayload);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: uj3.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.l9(this.f198609a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data j9(State state) {
        return this.vehicleHistoryTimelineMapper.b(new wj3.b.Params(state, b9(e.f198603a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: uj3.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f198608a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(e.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<f> Y1() {
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
    public /* bridge */ void P5(TimelinePayload timelinePayload) {
        super.P5(timelinePayload);
    }
}
