package oi1;

import ch1.g0;
import ch1.q0;
import ch1.s0;
import ch1.y;
import java.util.List;
import java.util.Set;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R,\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u00102\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Loi1/n;", "Ll00/g;", "Loi1/d;", "", "Loi1/e;", "Lyy/a;", "stateMachineFactory", "Lpi1/c;", "servicesWidgetsScreenMapper", "Lch1/y;", "getEnabledServiceWidgetsFlowUC", "Lch1/q0;", "setAirQualityWidgetStateUC", "Lch1/s0;", "setEPaymentsWidgetStateUC", "Lch1/g0;", "isEPaymentsWidgetRemoteFFActiveUC", "Lh64/r;", "loadServicesUseCase", "Lby0/d;", "isWidgetAirQualityRemoteFFActiveUC", "<init>", "(Lyy/a;Lpi1/c;Lch1/y;Lch1/q0;Lch1/s0;Lch1/g0;Lh64/r;Lby0/d;)V", "state", "Lpi1/c$a;", "q9", "(Loi1/d;)Lpi1/c$a;", "b", "Lpi1/c;", "c", "Lch1/y;", "d", "Lch1/q0;", "e", "Lch1/s0;", "f", "Lch1/g0;", "g", "Lh64/r;", "h", "Lby0/d;", "j", "Loi1/d;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Loi1/c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Loi1/e$a;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements oi1.e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pi1.c servicesWidgetsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y getEnabledServiceWidgetsFlowUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q0 setAirQualityWidgetStateUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s0 setEPaymentsWidgetStateUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g0 isEPaymentsWidgetRemoteFFActiveUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final by0.d isWidgetAirQualityRemoteFFActiveUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oi1.c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<oi1.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<oi1.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f145969b;

        /* JADX INFO: renamed from: oi1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3626a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f145971b;

            /* JADX INFO: renamed from: oi1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3627a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145972d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145973e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145974f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145976h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145977j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145978k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145979l;

                public C3627a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145972d = obj;
                    this.f145973e |= PKIFailureInfo.systemUnavail;
                    return C3626a.this.F(null, this);
                }
            }

            public C3626a(mu.h hVar, n nVar) {
                this.f145970a = hVar;
                this.f145971b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3627a c3627a;
                if (eVar instanceof C3627a) {
                    c3627a = (C3627a) eVar;
                    int i15 = c3627a.f145973e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3627a.f145973e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3627a = new C3627a(eVar);
                    }
                } else {
                    c3627a = new C3627a(eVar);
                }
                Object obj2 = c3627a.f145972d;
                Object objE = uq.b.e();
                int i16 = c3627a.f145973e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f145970a;
                    oi1.e.Data dataB = this.f145971b.servicesWidgetsScreenMapper.b(this.f145971b.q9((State) obj));
                    c3627a.f145974f = vq.j.a(obj);
                    c3627a.f145976h = vq.j.a(c3627a);
                    c3627a.f145977j = vq.j.a(obj);
                    c3627a.f145978k = vq.j.a(hVar);
                    c3627a.f145979l = 0;
                    c3627a.f145973e = 1;
                    if (hVar.F(dataB, c3627a) == objE) {
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
            this.f145968a = gVar;
            this.f145969b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super oi1.e.Data> hVar, tq.e eVar) {
            Object objA = this.f145968a.a(new C3626a(hVar, this.f145969b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Loi1/d;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145981f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f145981f;
            Object objE = uq.b.e();
            int i15 = this.f145980e;
            if (i15 == 0) {
                u.b(obj);
                h64.r rVar = n.this.loadServicesUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f145981f = c0Var;
                this.f145980e = 1;
                obj = rVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final List list = (List) obj;
            return c0Var.b(new er.l() { // from class: oi1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(list, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f145981f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lah1/g;", "enabledServiceWidgets", "Lk10/c0;", "Loi1/d;", "state", "Lk10/l;", "<anonymous>", "(Ljava/util/Set;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<Set<? extends ah1.g>, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145985g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Set set, State state) {
            return State.b(state, set, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Set set = (Set) this.f145984f;
            c0 c0Var = (c0) this.f145985g;
            uq.b.e();
            if (this.f145983e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: oi1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(set, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Set<? extends ah1.g> set, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f145984f = set;
            cVar.f145985g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loi1/a;", "action", "Loi1/d;", "state", "Loq/i0;", "<anonymous>", "(Loi1/a;Loi1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeAirQualityWidgetState, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145987f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChangeAirQualityWidgetState changeAirQualityWidgetState = (ChangeAirQualityWidgetState) this.f145987f;
            Object objE = uq.b.e();
            int i15 = this.f145986e;
            if (i15 == 0) {
                u.b(obj);
                q0 q0Var = n.this.setAirQualityWidgetStateUC;
                q0.Params params = new q0.Params(changeAirQualityWidgetState.getEnabled());
                this.f145987f = vq.j.a(changeAirQualityWidgetState);
                this.f145986e = 1;
                if (q0Var.d(params, this) == objE) {
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
        public final Object w(ChangeAirQualityWidgetState changeAirQualityWidgetState, State state, tq.e<? super i0> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f145987f = changeAirQualityWidgetState;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loi1/b;", "action", "Loi1/d;", "state", "Loq/i0;", "<anonymous>", "(Loi1/b;Loi1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChangeEPaymentsWidgetState, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145990f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChangeEPaymentsWidgetState changeEPaymentsWidgetState = (ChangeEPaymentsWidgetState) this.f145990f;
            Object objE = uq.b.e();
            int i15 = this.f145989e;
            if (i15 == 0) {
                u.b(obj);
                s0 s0Var = n.this.setEPaymentsWidgetStateUC;
                s0.Params params = new s0.Params(changeEPaymentsWidgetState.getEnabled());
                this.f145990f = vq.j.a(changeEPaymentsWidgetState);
                this.f145989e = 1;
                if (s0Var.d(params, this) == objE) {
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
        public final Object w(ChangeEPaymentsWidgetState changeEPaymentsWidgetState, State state, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f145990f = changeEPaymentsWidgetState;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loi1/c$a;", "<unused var>", "Loi1/d;", "Loq/i0;", "<anonymous>", "(Loi1/c$a;Loi1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<oi1.c.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145992e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145992e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                oi1.c.a aVar = oi1.c.a.f145940a;
                this.f145992e = 1;
                if (nVar.F(aVar, this) == objE) {
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
        public final Object w(oi1.c.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new f(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, pi1.c cVar, y yVar, q0 q0Var, s0 s0Var, g0 g0Var, h64.r rVar, by0.d dVar) {
        this.servicesWidgetsScreenMapper = cVar;
        this.getEnabledServiceWidgetsFlowUC = yVar;
        this.setAirQualityWidgetStateUC = q0Var;
        this.setEPaymentsWidgetStateUC = s0Var;
        this.isEPaymentsWidgetRemoteFFActiveUC = g0Var;
        this.loadServicesUseCase = rVar;
        this.isWidgetAirQualityRemoteFFActiveUC = dVar;
        State state = new State(e1.e(), null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: oi1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f145953a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), cVar.b(q9(state)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pi1.c.Params q9(State state) {
        er.l lVar = new er.l() { // from class: oi1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f145955a, ((Boolean) obj).booleanValue());
            }
        };
        er.l lVar2 = new er.l() { // from class: oi1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f145956a, ((Boolean) obj).booleanValue());
            }
        };
        g0 g0Var = this.isEPaymentsWidgetRemoteFFActiveUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        return new pi1.c.Params(state, lVar, lVar2, g0Var.b(c1792a).booleanValue(), this.isWidgetAirQualityRemoteFFActiveUC.a(c1792a).booleanValue(), b9(oi1.c.a.f145940a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, boolean z15) {
        nVar.d9(new ChangeAirQualityWidgetState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, boolean z15) {
        nVar.d9(new ChangeEPaymentsWidgetState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final n nVar, v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: oi1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f145954a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, z zVar) {
        zVar.A(nVar.new b(null));
        k10.k.m(zVar, nVar.getEnabledServiceWidgetsFlowUC.b(gz.b.a.C1792a.f78542a), null, new c(null), 2, null);
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ChangeAirQualityWidgetState.class), oVar, dVar);
        zVar.x(fr.q0.c(ChangeEPaymentsWidgetState.class), oVar, nVar.new e(null));
        zVar.x(fr.q0.c(oi1.c.a.class), oVar, nVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<oi1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<oi1.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(oi1.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
