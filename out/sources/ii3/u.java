package ii3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import ki3.ShowLocalizationModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationCoordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BS\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010\u001fJ$\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R,\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030<8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R \u0010I\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b7\u0010HR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR&\u0010\"\u001a\b\u0012\u0004\u0012\u00020&0Q8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010B\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lii3/u;", "Ll00/g;", "Lii3/f;", "", "Lii3/g;", "Lmx/c;", "labelProvider", "Lji3/a;", "showLocalizationMapScreenMapper", "Lyy/a;", "stateMachineFactory", "Li70/n;", "snackBarManagerStateHolder", "Le14/a;", "checkAllConditionsToGetLocationUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "Le14/g;", "getLocationUseCase", "Lki3/a;", "setupData", "La14/m;", "goToApplicationDetailsSettingsUseCase", "<init>", "(Lmx/c;Lji3/a;Lyy/a;Li70/n;Le14/a;La14/n;Le14/g;Lki3/a;La14/m;)V", "Lcb4/d;", "t9", "()Lcb4/d;", "r9", "Loq/i0;", "y9", "(Ltq/e;)Ljava/lang/Object;", "z9", "Lk10/c0;", "state", "Lk10/l;", "w9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lii3/g$a;", "A9", "(Lii3/f;)Lii3/g$a;", "b", "Lmx/c;", "c", "Lji3/a;", "d", "Li70/n;", "e", "Le14/a;", "f", "La14/n;", "g", "Le14/g;", "h", "Lki3/a;", "j", "La14/m;", "k", "Lii3/f;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/g;", "Li70/p;", "m", "Lmu/g;", "()Lmu/g;", "snackBarVisibilityState", "Lxw/b;", "Lii3/d;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State, Object> implements ii3.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ji3.a showLocalizationMapScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e14.a checkAllConditionsToGetLocationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e14.g getLocationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ShowLocalizationModel setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.g<i70.p> snackBarVisibilityState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ii3.d> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<ii3.g.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f92967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f92968e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f92970g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f92968e = obj;
            this.f92970g |= PKIFailureInfo.systemUnavail;
            return u.this.w9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f92971d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f92973f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f92971d = obj;
            this.f92973f |= PKIFailureInfo.systemUnavail;
            return u.this.y9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ii3.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f92974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f92975b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f92976a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f92977b;

            /* JADX INFO: renamed from: ii3.u$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2188a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f92978d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f92979e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f92980f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f92982h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f92983j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f92984k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f92985l;

                public C2188a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f92978d = obj;
                    this.f92979e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f92976a = hVar;
                this.f92977b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2188a c2188a;
                if (eVar instanceof C2188a) {
                    c2188a = (C2188a) eVar;
                    int i15 = c2188a.f92979e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2188a.f92979e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2188a = new C2188a(eVar);
                    }
                } else {
                    c2188a = new C2188a(eVar);
                }
                Object obj2 = c2188a.f92978d;
                Object objE = uq.b.e();
                int i16 = c2188a.f92979e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f92976a;
                    ii3.g.Data dataA9 = this.f92977b.A9((State) obj);
                    c2188a.f92980f = vq.j.a(obj);
                    c2188a.f92982h = vq.j.a(c2188a);
                    c2188a.f92983j = vq.j.a(obj);
                    c2188a.f92984k = vq.j.a(hVar);
                    c2188a.f92985l = 0;
                    c2188a.f92979e = 1;
                    if (hVar.F(dataA9, c2188a) == objE) {
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

        public c(mu.g gVar, u uVar) {
            this.f92974a = gVar;
            this.f92975b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ii3.g.Data> hVar, tq.e eVar) {
            Object objA = this.f92974a.a(new a(hVar, this.f92975b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lii3/d;", "action", "Lii3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lii3/d;Lii3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ii3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92987f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ii3.d dVar = (ii3.d) this.f92987f;
            Object objE = uq.b.e();
            int i15 = this.f92986e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ii3.d> bVarY1 = u.this.Y1();
                this.f92987f = vq.j.a(dVar);
                this.f92986e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(ii3.d dVar, State state, tq.e<? super i0> eVar) {
            d dVar2 = u.this.new d(eVar);
            dVar2.f92987f = dVar;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lii3/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92990f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(boolean z15, State state) {
            return State.b(state, z15, null, null, null, null, null, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f92990f;
            Object objE = uq.b.e();
            int i15 = this.f92989e;
            if (i15 == 0) {
                oq.u.b(obj);
                e14.g gVar = u.this.getLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f92990f = c0Var;
                this.f92989e = 1;
                obj = gVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean isMyLocationEnabled = ((LocationCoordinates) obj).getIsMyLocationEnabled();
            return c0Var.b(new er.l() { // from class: ii3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(isMyLocationEnabled, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f92990f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lii3/a;", "<unused var>", "Lk10/c0;", "Lii3/f;", "state", "Lk10/l;", "<anonymous>", "(Lii3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ii3.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92993f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f92993f;
            Object objE = uq.b.e();
            int i15 = this.f92992e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u uVar = u.this;
            this.f92993f = vq.j.a(c0Var);
            this.f92992e = 1;
            Object objW9 = uVar.w9(c0Var, this);
            return objW9 == objE ? objE : objW9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ii3.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f92993f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lii3/c;", "<unused var>", "Lii3/f;", "Loq/i0;", "<anonymous>", "(Lii3/c;Lii3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ii3.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92995e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f92995e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f92995e = 1;
                if (uVar.z9(this) == objE) {
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
        public final Object w(ii3.c cVar, State state, tq.e<? super i0> eVar) {
            return u.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lii3/b;", "<unused var>", "Lii3/f;", "Loq/i0;", "<anonymous>", "(Lii3/b;Lii3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ii3.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92997e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f92997e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f92997e = 1;
                if (uVar.y9(this) == objE) {
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
        public final Object w(ii3.b bVar, State state, tq.e<? super i0> eVar) {
            return u.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lii3/e;", "<unused var>", "Lii3/f;", "Loq/i0;", "<anonymous>", "(Lii3/e;Lii3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ii3.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92999e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f92999e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ii3.e eVar, State state, tq.e<? super i0> eVar2) {
            return u.this.new i(eVar2).J(i0.f148189a);
        }
    }

    public u(mx.c cVar, ji3.a aVar, yy.a aVar2, i70.n nVar, e14.a aVar3, a14.n nVar2, e14.g gVar, ShowLocalizationModel showLocalizationModel, a14.m mVar) {
        this.labelProvider = cVar;
        this.showLocalizationMapScreenMapper = aVar;
        this.snackBarManagerStateHolder = nVar;
        this.checkAllConditionsToGetLocationUseCase = aVar3;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.getLocationUseCase = gVar;
        this.setupData = showLocalizationModel;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        State state = new State(false, showLocalizationModel.getLocalizationDescription(), null, null, showLocalizationModel.getCoordinates(), showLocalizationModel.getCoordinates(), 12, null);
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: ii3.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f92953a, (k10.v) obj);
            }
        });
        this.snackBarVisibilityState = a9(nVar.j(), i70.p.a.f89857a);
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), A9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ii3.g.Data A9(State state) {
        return this.showLocalizationMapScreenMapper.b(new ji3.a.Params(state, b9(ii3.a.f92912a), b9(ii3.e.f92917a), b9(ii3.d.a.f92915a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ii3.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f92950a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(u uVar, z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ii3.d.class), oVar, dVar);
        zVar.A(uVar.new e(null));
        zVar.v(q0.c(ii3.a.class), oVar, uVar.new f(null));
        zVar.x(q0.c(ii3.c.class), oVar, uVar.new g(null));
        zVar.x(q0.c(ii3.b.class), oVar, uVar.new h(null));
        zVar.x(q0.c(ii3.e.class), oVar, uVar.new i(null));
        return i0.f148189a;
    }

    private final DialogData r9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.E0), this.labelProvider.c(md3.b.D0), new DialogButtonTextData(this.labelProvider.c(md3.b.A0), null, b9(ii3.b.f92913a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.F0), cb4.a.C0668a.f24967a, new er.a() { // from class: ii3.s
            @Override // er.a
            public final Object a() {
                return u.s9();
            }
        }), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9() {
        return i0.f148189a;
    }

    private final DialogData t9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.C0), this.labelProvider.c(md3.b.B0), new DialogButtonTextData(this.labelProvider.c(md3.b.A0), null, b9(ii3.c.f92914a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.F0), cb4.a.C0668a.f24967a, new er.a() { // from class: ii3.r
            @Override // er.a
            public final Object a() {
                return u.u9();
            }
        }), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (F(r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (F(r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        if (r9 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w9(k10.c0<ii3.State> r8, tq.e<? super k10.l<ii3.State>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii3.u.w9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State x9(LocationCoordinates locationCoordinates, Coordinates coordinates, State state) {
        return State.b(state, locationCoordinates.getIsMyLocationEnabled(), null, null, null, null, coordinates, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f92973f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f92973f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f92971d;
        Object objE = uq.b.e();
        int i16 = bVar.f92973f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.n nVar = this.goToDeviceLocationSettingsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f92973f = 1;
            objC = nVar.c(c1792a, bVar);
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
            this.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(this.labelProvider.c(md3.b.G0), false, null, null, 14, null));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z9(tq.e<? super i0> eVar) {
        dx.i<? extends dx.b.Business, ? extends i0> iVarA = this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
        if (iVarA instanceof dx.i.Left) {
            this.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(this.labelProvider.c(md3.b.G0), false, null, null, 14, null));
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ShowLocalizationModel showLocalizationModel) {
        super.P5(showLocalizationModel);
    }

    @Override // zx.b
    public xw.b<ii3.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ii3.g.Data> getState() {
        return this.state;
    }

    @Override // ii3.g
    public mu.g<i70.p> j() {
        return this.snackBarVisibilityState;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ii3.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }
}
