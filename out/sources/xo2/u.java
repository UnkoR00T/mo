package xo2;

import fr.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u001d0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010F¨\u0006H"}, d2 = {"Lxo2/u;", "Ll00/g;", "Lxo2/g;", "", "Lxo2/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lyo2/a;", "screenMapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lmx/c;Lyo2/a;La14/w;Li70/n;)V", "y9", "(Lxo2/g;)Lxo2/g;", "", "p9", "(Lxo2/g;)Z", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "u9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lxo2/h$a;", "q9", "(Lxo2/g;)Lxo2/h$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lyo2/a;", "d", "La14/w;", "e", "Li70/n;", "f", "Lxo2/g;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxo2/c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State, Object> implements h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo2.a screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xo2.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f220246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f220247e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f220249g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f220247e = obj;
            this.f220249g |= PKIFailureInfo.systemUnavail;
            return u.this.u9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f220251b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f220253b;

            /* JADX INFO: renamed from: xo2.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5882a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220254d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220255e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220256f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220258h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220259j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220260k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220261l;

                public C5882a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220254d = obj;
                    this.f220255e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f220252a = hVar;
                this.f220253b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5882a c5882a;
                if (eVar instanceof C5882a) {
                    c5882a = (C5882a) eVar;
                    int i15 = c5882a.f220255e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5882a.f220255e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5882a = new C5882a(eVar);
                    }
                } else {
                    c5882a = new C5882a(eVar);
                }
                Object obj2 = c5882a.f220254d;
                Object objE = uq.b.e();
                int i16 = c5882a.f220255e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f220252a;
                    h.Data dataQ9 = this.f220253b.q9((State) obj);
                    c5882a.f220256f = vq.j.a(obj);
                    c5882a.f220258h = vq.j.a(c5882a);
                    c5882a.f220259j = vq.j.a(obj);
                    c5882a.f220260k = vq.j.a(hVar);
                    c5882a.f220261l = 0;
                    c5882a.f220255e = 1;
                    if (hVar.F(dataQ9, c5882a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, u uVar) {
            this.f220250a = gVar;
            this.f220251b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f220250a.a(new a(hVar, this.f220251b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxo2/a;", "<unused var>", "Lxo2/g;", "Loq/i0;", "<anonymous>", "(Lxo2/a;Lxo2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xo2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220262e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220262e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xo2.c> bVarY1 = u.this.Y1();
                xo2.c.a aVar = xo2.c.a.f220205a;
                this.f220262e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xo2.a aVar, State state, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxo2/b;", "<unused var>", "Lk10/c0;", "Lxo2/g;", "state", "Lk10/l;", "<anonymous>", "(Lxo2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xo2.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f220264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f220265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220266g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220266g;
            Object objE = uq.b.e();
            int i15 = this.f220265f;
            if (i15 == 0) {
                oq.u.b(obj);
                final State stateY9 = u.this.y9(State.b((State) c0Var.a(), true, false, null, false, null, 30, null));
                boolean zP9 = u.this.p9(stateY9);
                if (!zP9) {
                    return c0Var.b(new er.l() { // from class: xo2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.d.O(stateY9, (State) obj2);
                        }
                    });
                }
                if (!zP9) {
                    throw new oq.p();
                }
                xw.b<xo2.c> bVarY1 = u.this.Y1();
                xo2.c.b bVar = xo2.c.b.f220206a;
                this.f220266g = c0Var;
                this.f220264e = vq.j.a(stateY9);
                this.f220265f = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xo2.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f220266g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxo2/f;", "action", "Lk10/c0;", "Lxo2/g;", "state", "Lk10/l;", "<anonymous>", "(Lxo2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<RegulationsSwitchChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220270g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(u uVar, RegulationsSwitchChanged regulationsSwitchChanged, State state) {
            return uVar.y9(State.b(state, false, regulationsSwitchChanged.getIsChecked(), null, false, null, 28, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final RegulationsSwitchChanged regulationsSwitchChanged = (RegulationsSwitchChanged) this.f220269f;
            c0 c0Var = (c0) this.f220270g;
            uq.b.e();
            if (this.f220268e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: xo2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(uVar, regulationsSwitchChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(RegulationsSwitchChanged regulationsSwitchChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f220269f = regulationsSwitchChanged;
            eVar2.f220270g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxo2/e;", "action", "Lk10/c0;", "Lxo2/g;", "state", "Lk10/l;", "<anonymous>", "(Lxo2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<PrivacyPolicySwitchChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220274g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(u uVar, PrivacyPolicySwitchChanged privacyPolicySwitchChanged, State state) {
            return uVar.y9(State.b(state, false, false, null, privacyPolicySwitchChanged.getIsChecked(), null, 22, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final PrivacyPolicySwitchChanged privacyPolicySwitchChanged = (PrivacyPolicySwitchChanged) this.f220273f;
            c0 c0Var = (c0) this.f220274g;
            uq.b.e();
            if (this.f220272e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: xo2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(uVar, privacyPolicySwitchChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(PrivacyPolicySwitchChanged privacyPolicySwitchChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f220273f = privacyPolicySwitchChanged;
            fVar.f220274g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxo2/d;", "action", "Lxo2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxo2/d;Lxo2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220277f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f220277f;
            Object objE = uq.b.e();
            int i15 = this.f220276e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                String url = openUrl.getUrl();
                this.f220277f = vq.j.a(openUrl);
                this.f220276e = 1;
                if (uVar.u9(url, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f220277f = openUrl;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, mx.c cVar, yo2.a aVar2, a14.w wVar, i70.n nVar) {
        this.labelProvider = cVar;
        this.screenMapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        State state = new State(false, false, null, false, null, 31, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xo2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f220233a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p9(State state) {
        List listQ = pq.v.q(state.getRegulationsSwitchValidationState(), state.getPrivacyPolicyValidationState());
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return true;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (!((hz.b) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data q9(State state) {
        return this.screenMapper.b(new yo2.a.Params(state, b9(xo2.a.f220202a), b9(xo2.b.f220204a), new er.l() { // from class: xo2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9(this.f220234a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: xo2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.s9(this.f220235a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: xo2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.t9(this.f220236a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(u uVar, boolean z15) {
        uVar.d9(new RegulationsSwitchChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(u uVar, boolean z15) {
        uVar.d9(new PrivacyPolicySwitchChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(u uVar, String str) {
        uVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f220249g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f220249g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f220247e;
        Object objE = uq.b.e();
        int i16 = aVar.f220249g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            aVar.f220246d = vq.j.a(str);
            aVar.f220249g = 1;
            objC = wVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xo2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f220237a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xo2.a.class), oVar, cVar);
        zVar.v(q0.c(xo2.b.class), oVar, uVar.new d(null));
        zVar.v(q0.c(RegulationsSwitchChanged.class), oVar, uVar.new e(null));
        zVar.v(q0.c(PrivacyPolicySwitchChanged.class), oVar, uVar.new f(null));
        zVar.x(q0.c(OpenUrl.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State y9(State state) {
        hz.b invalid;
        hz.b invalid2;
        boolean regulationsSwitchChecked = state.getRegulationsSwitchChecked();
        if (regulationsSwitchChecked) {
            invalid = hz.b.d.f86848c;
        } else {
            if (regulationsSwitchChecked) {
                throw new oq.p();
            }
            invalid = new hz.b.Invalid(this.labelProvider.c(oo2.b.A));
        }
        hz.b bVar = invalid;
        boolean privacyPolicySwitchChecked = state.getPrivacyPolicySwitchChecked();
        if (privacyPolicySwitchChecked) {
            invalid2 = hz.b.d.f86848c;
        } else {
            if (privacyPolicySwitchChecked) {
                throw new oq.p();
            }
            invalid2 = new hz.b.Invalid(this.labelProvider.c(oo2.b.f147865v));
        }
        return State.b(state, false, false, bVar, false, invalid2, 11, null);
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<xo2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
