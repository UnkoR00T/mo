package kf3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import tv0.BEVehicleCollisionDescriptionConception;
import vy.Coordinates;
import w04.LocationData;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\"H\u0082@¢\u0006\u0004\b%\u0010$J$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0082@¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010-J\u0019\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J,\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u00104\u001a\u0002032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0082@¢\u0006\u0004\b5\u00106J$\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0082@¢\u0006\u0004\b7\u0010*J\u0018\u0010:\u001a\u00020/2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\"2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR,\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R \u0010i\u001a\b\u0012\u0004\u0012\u00020e0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bO\u0010hR \u0010p\u001a\b\u0012\u0004\u0012\u00020k0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR&\u0010'\u001a\b\u0012\u0004\u0012\u00020<0q8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010b\u001a\u0004\bt\u0010u¨\u0006w"}, d2 = {"Lkf3/v;", "Ll00/g;", "Lkf3/b;", "Lkf3/a;", "Lkf3/c;", "", "Lmx/c;", "labelProvider", "Lmf3/c;", "chooseLocalizationMapScreenMapper", "Lyy/a;", "stateMachineFactory", "Li70/n;", "snackBarManagerStateHolder", "Le14/d;", "getAddressUseCase", "Le14/a;", "checkAllConditionsToGetLocationUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "Lay/k;", "networkConnectionManager", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Le14/h;", "getPermissionsGPSUseCase", "Li14/c;", "getPreciseLocationUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Llf3/a;", "contract", "<init>", "(Lmx/c;Lmf3/c;Lyy/a;Li70/n;Le14/d;Le14/a;La14/n;Lay/k;La14/m;Le14/h;Li14/c;Lyw/b;Llf3/a;)V", "Loq/i0;", "M9", "(Ltq/e;)Ljava/lang/Object;", "N9", "Lk10/c0;", "state", "Lk10/l;", "K9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lcb4/d;", "G9", "()Lcb4/d;", "E9", "Ltv0/i$a;", "locationDetails", "S9", "(Ltv0/i$a;)Lkf3/b;", "Lkf3/a$k;", "action", "W9", "(Lkf3/a$k;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "I9", "Lvy/c;", "coordinates", "O9", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "Lkf3/c$a;", "P9", "(Lkf3/b;)Lkf3/c$a;", "D9", "(Ltv0/i$a;)V", "b", "Lmx/c;", "c", "Lmf3/c;", "d", "Li70/n;", "e", "Le14/d;", "f", "Le14/a;", "g", "La14/n;", "h", "Lay/k;", "j", "La14/m;", "k", "Le14/h;", "l", "Li14/c;", "m", "Lyw/b;", "n", "Llf3/a;", "p", "Lkf3/b;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/g;", "Li70/p;", "r", "Lmu/g;", "()Lmu/g;", "snackBarVisibilityState", "Lxw/b;", "Lkf3/a$e;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State, kf3.a> implements kf3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mf3.c chooseLocalizationMapScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e14.d getAddressUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e14.a checkAllConditionsToGetLocationUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e14.h getPermissionsGPSUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i14.c getPreciseLocationUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final lf3.a contract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, kf3.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mu.g<i70.p> snackBarVisibilityState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kf3.a.e> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<kf3.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f110744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f110745e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f110747g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f110745e = obj;
            this.f110747g |= PKIFailureInfo.systemUnavail;
            return v.this.I9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f110748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f110749e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f110751g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f110749e = obj;
            this.f110751g |= PKIFailureInfo.systemUnavail;
            return v.this.K9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f110752d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f110754f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f110752d = obj;
            this.f110754f |= PKIFailureInfo.systemUnavail;
            return v.this.M9(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f110755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f110756e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f110758g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f110756e = obj;
            this.f110758g |= PKIFailureInfo.systemUnavail;
            return v.this.O9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<kf3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f110760b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f110762b;

            /* JADX INFO: renamed from: kf3.v$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2659a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110763d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110764e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110765f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110767h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110768j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110769k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110770l;

                public C2659a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110763d = obj;
                    this.f110764e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f110761a = hVar;
                this.f110762b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2659a c2659a;
                if (eVar instanceof C2659a) {
                    c2659a = (C2659a) eVar;
                    int i15 = c2659a.f110764e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2659a.f110764e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2659a = new C2659a(eVar);
                    }
                } else {
                    c2659a = new C2659a(eVar);
                }
                Object obj2 = c2659a.f110763d;
                Object objE = uq.b.e();
                int i16 = c2659a.f110764e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f110761a;
                    kf3.c.Data dataP9 = this.f110762b.P9((State) obj);
                    c2659a.f110765f = vq.j.a(obj);
                    c2659a.f110767h = vq.j.a(c2659a);
                    c2659a.f110768j = vq.j.a(obj);
                    c2659a.f110769k = vq.j.a(hVar);
                    c2659a.f110770l = 0;
                    c2659a.f110764e = 1;
                    if (hVar.F(dataP9, c2659a) == objE) {
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

        public e(mu.g gVar, v vVar) {
            this.f110759a = gVar;
            this.f110760b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kf3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f110759a.a(new a(hVar, this.f110760b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf3/a$d;", "<unused var>", "Lkf3/b;", "Loq/i0;", "<anonymous>", "(Lkf3/a$d;Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kf3.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110771e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110771e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f110771e = 1;
                if (vVar.N9(this) == objE) {
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
        public final Object w(kf3.a.d dVar, State state, tq.e<? super i0> eVar) {
            return v.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf3/a$c;", "<unused var>", "Lkf3/b;", "Loq/i0;", "<anonymous>", "(Lkf3/a$c;Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kf3.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110773e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110773e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f110773e = 1;
                if (vVar.M9(this) == objE) {
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
        public final Object w(kf3.a.c cVar, State state, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf3/a$h;", "<unused var>", "Lkf3/b;", "Loq/i0;", "<anonymous>", "(Lkf3/a$h;Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kf3.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110775e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110775e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.h hVar, State state, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkf3/a$g;", "<unused var>", "Lkf3/b;", "state", "Loq/i0;", "<anonymous>", "(Lkf3/a$g;Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<kf3.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110778f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f110778f
                kf3.b r0 = (kf3.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f110777e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L55
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L3e
            L22:
                oq.u.b(r7)
                kf3.v r7 = kf3.v.this
                lf3.a r7 = kf3.v.t9(r7)
                tv0.i$a r2 = r0.getAddress()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f110778f = r5
                r6.f110777e = r4
                java.lang.Object r7 = r7.b6(r2, r6)
                if (r7 != r1) goto L3e
                goto L54
            L3e:
                kf3.v r7 = kf3.v.this
                xw.b r7 = r7.Y1()
                kf3.a$e$a r2 = kf3.a.e.C2656a.f110665a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f110778f = r0
                r6.f110777e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L55
            L54:
                return r1
            L55:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kf3.v.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.g gVar, State state, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f110778f = state;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkf3/a$e;", "action", "Lkf3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkf3/a$e;Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<kf3.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110781f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kf3.a.e eVar = (kf3.a.e) this.f110781f;
            Object objE = uq.b.e();
            int i15 = this.f110780e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kf3.a.e> bVarY1 = v.this.Y1();
                this.f110781f = vq.j.a(eVar);
                this.f110780e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(kf3.a.e eVar, State state, tq.e<? super i0> eVar2) {
            j jVar = v.this.new j(eVar2);
            jVar.f110781f = eVar;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkf3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkf3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110783e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110783e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(kf3.a.C2655a.f110661a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((k) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$a;", "<unused var>", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<kf3.a.C2655a, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110786f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110786f;
            Object objE = uq.b.e();
            int i15 = this.f110785e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f110786f = vq.j.a(c0Var);
            this.f110785e = 1;
            Object objI9 = vVar.I9(c0Var, this);
            return objI9 == objE ? objE : objI9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.C2655a c2655a, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = v.this.new l(eVar);
            lVar.f110786f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$i;", "action", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<kf3.a.PinChosen, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f110789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f110791h;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(kf3.a.PinChosen pinChosen, BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, Label label, State state) {
            return State.b(state, BEVehicleCollisionDescriptionConception.LocationDetails.b(locationDetails, label, null, null, null, null, null, null, 126, null), null, null, false, pinChosen.getCoordinates(), pinChosen.getCoordinates(), null, null, 206, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Label label;
            final kf3.a.PinChosen pinChosen = (kf3.a.PinChosen) this.f110790g;
            k10.c0 c0Var = (k10.c0) this.f110791h;
            Object objE = uq.b.e();
            int i15 = this.f110789f;
            if (i15 == 0) {
                oq.u.b(obj);
                Label labelC = pinChosen.getPlaceOfName().getText().length() == 0 ? v.this.labelProvider.c(md3.b.f125871y3) : pinChosen.getPlaceOfName();
                v vVar = v.this;
                Coordinates coordinates = pinChosen.getCoordinates();
                this.f110790g = pinChosen;
                this.f110791h = c0Var;
                this.f110788e = labelC;
                this.f110789f = 1;
                Object objO9 = vVar.O9(coordinates, this);
                if (objO9 == objE) {
                    return objE;
                }
                label = labelC;
                obj = objO9;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                label = (Label) this.f110788e;
                oq.u.b(obj);
            }
            final BEVehicleCollisionDescriptionConception.LocationDetails locationDetails = (BEVehicleCollisionDescriptionConception.LocationDetails) obj;
            v.this.D9(locationDetails);
            return c0Var.b(new er.l() { // from class: kf3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.m.O(pinChosen, locationDetails, label, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.PinChosen pinChosen, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f110790g = pinChosen;
            mVar.f110791h = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvy/c;", "action", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lvy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<Coordinates, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110795g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Coordinates coordinates, State state) {
            return State.b(state, null, null, null, false, null, null, null, coordinates, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Coordinates coordinates = (Coordinates) this.f110794f;
            k10.c0 c0Var = (k10.c0) this.f110795g;
            uq.b.e();
            if (this.f110793e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(new kf3.a.UpdateMyPosition(coordinates));
            return c0Var.d(new er.l() { // from class: kf3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.n.O(coordinates, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Coordinates coordinates, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = v.this.new n(eVar);
            nVar.f110794f = coordinates;
            nVar.f110795g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$j;", "action", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<kf3.a.SetStateMyPosition, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110799g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(kf3.a.SetStateMyPosition setStateMyPosition, Coordinates coordinates, State state) {
            State.a update = setStateMyPosition.getUpdate();
            if (coordinates == null) {
                coordinates = state.getMyLastPosition();
            }
            return State.b(state, null, null, null, false, null, null, update, coordinates, 63, null);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Coordinates myLastPosition;
            final kf3.a.SetStateMyPosition setStateMyPosition = (kf3.a.SetStateMyPosition) this.f110798f;
            k10.c0 c0Var = (k10.c0) this.f110799g;
            Object objE = uq.b.e();
            int i15 = this.f110797e;
            if (i15 == 0) {
                oq.u.b(obj);
                State.a update = setStateMyPosition.getUpdate();
                if (fr.t.c(update, State.a.C2657a.f110684a)) {
                    myLastPosition = null;
                } else if (fr.t.c(update, State.a.C2658b.f110685a)) {
                    myLastPosition = ((State) c0Var.a()).getMyLastPosition();
                } else {
                    if (!fr.t.c(update, State.a.c.f110686a)) {
                        throw new oq.p();
                    }
                    i14.c cVar = v.this.getPreciseLocationUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f110798f = setStateMyPosition;
                    this.f110799g = c0Var;
                    this.f110797e = 1;
                    obj = cVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                if (myLastPosition != null) {
                    v.this.d9(new kf3.a.UpdateMyPosition(myLastPosition));
                }
                return c0Var.d(new er.l() { // from class: kf3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.o.O(setStateMyPosition, myLastPosition, (State) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            myLastPosition = (Coordinates) obj;
            if (myLastPosition != null) {
                v.this.d9(new kf3.a.UpdateMyPosition(myLastPosition));
            }
            return c0Var.d(new er.l() { // from class: kf3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.o.O(setStateMyPosition, myLastPosition, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.SetStateMyPosition setStateMyPosition, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = v.this.new o(eVar);
            oVar.f110798f = setStateMyPosition;
            oVar.f110799g = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$f;", "<unused var>", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<kf3.a.f, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110802f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, false, null, null, State.a.C2657a.f110684a, null, 159, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110802f;
            uq.b.e();
            if (this.f110801e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kf3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.p.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.f fVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = new p(eVar);
            pVar.f110802f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$k;", "action", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<kf3.a.UpdateMyPosition, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110805g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kf3.a.UpdateMyPosition updateMyPosition = (kf3.a.UpdateMyPosition) this.f110804f;
            k10.c0 c0Var = (k10.c0) this.f110805g;
            Object objE = uq.b.e();
            int i15 = this.f110803e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f110804f = vq.j.a(updateMyPosition);
            this.f110805g = vq.j.a(c0Var);
            this.f110803e = 1;
            Object objW9 = vVar.W9(updateMyPosition, c0Var, this);
            return objW9 == objE ? objE : objW9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.UpdateMyPosition updateMyPosition, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = v.this.new q(eVar);
            qVar.f110804f = updateMyPosition;
            qVar.f110805g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf3/a$b;", "<unused var>", "Lk10/c0;", "Lkf3/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<kf3.a.GetLocation, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110808f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110808f;
            Object objE = uq.b.e();
            int i15 = this.f110807e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f110808f = vq.j.a(c0Var);
            this.f110807e = 1;
            Object objK9 = vVar.K9(c0Var, this);
            return objK9 == objE ? objE : objK9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf3.a.GetLocation getLocation, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            r rVar = v.this.new r(eVar);
            rVar.f110808f = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f110810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110812f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f110814h;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f110812f = obj;
            this.f110814h |= PKIFailureInfo.systemUnavail;
            return v.this.W9(null, null, this);
        }
    }

    public v(mx.c cVar, mf3.c cVar2, yy.a aVar, i70.n nVar, e14.d dVar, e14.a aVar2, a14.n nVar2, ay.k kVar, a14.m mVar, e14.h hVar, i14.c cVar3, yw.b bVar, lf3.a aVar3) {
        this.labelProvider = cVar;
        this.chooseLocalizationMapScreenMapper = cVar2;
        this.snackBarManagerStateHolder = nVar;
        this.getAddressUseCase = dVar;
        this.checkAllConditionsToGetLocationUseCase = aVar2;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.networkConnectionManager = kVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.getPermissionsGPSUseCase = hVar;
        this.getPreciseLocationUseCase = cVar3;
        this.accessibilityTalkBackManager = bVar;
        this.contract = aVar3;
        State stateS9 = S9(aVar3.o());
        this.initialState = stateS9;
        this.stateMachine = aVar.a(stateS9, new er.l() { // from class: kf3.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.U9(this.f110726a, (k10.v) obj);
            }
        });
        this.snackBarVisibilityState = a9(nVar.j(), i70.p.a.f89857a);
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), P9(stateS9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D9(BEVehicleCollisionDescriptionConception.LocationDetails locationDetails) {
        this.accessibilityTalkBackManager.a(this.labelProvider.c(md3.b.f125871y3).getText() + Label.INSTANCE.d().getText() + locationDetails.g());
    }

    private final DialogData E9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.E0), this.labelProvider.c(md3.b.D0), new DialogButtonTextData(this.labelProvider.c(md3.b.A0), null, b9(kf3.a.c.f110663a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.F0), cb4.a.C0668a.f24967a, new er.a() { // from class: kf3.s
            @Override // er.a
            public final Object a() {
                return v.F9();
            }
        }), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9() {
        return i0.f148189a;
    }

    private final DialogData G9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.C0), this.labelProvider.c(md3.b.B0), new DialogButtonTextData(this.labelProvider.c(md3.b.A0), null, b9(kf3.a.d.f110664a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.F0), cb4.a.C0668a.f24967a, new er.a() { // from class: kf3.t
            @Override // er.a
            public final Object a() {
                return v.H9();
            }
        }), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f110747g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f110747g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f110745e;
        Object objE = uq.b.e();
        int i16 = aVar.f110747g;
        if (i16 == 0) {
            oq.u.b(objC);
            e14.h hVar = this.getPermissionsGPSUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f110744d = c0Var;
            aVar.f110747g = 1;
            objC = hVar.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) aVar.f110744d;
            oq.u.b(objC);
        }
        final LocationData locationData = (LocationData) objC;
        d9(new kf3.a.SetStateMyPosition(State.a.C2658b.f110685a));
        return c0Var.d(new er.l() { // from class: kf3.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(locationData, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State J9(LocationData locationData, State state) {
        return State.b(state, null, null, null, locationData.getIsMyLocationEnabled(), null, null, null, null, 247, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f110751g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f110751g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f110749e;
        Object objE = uq.b.e();
        int i16 = bVar.f110751g;
        if (i16 == 0) {
            oq.u.b(objA);
            e14.a aVar = this.checkAllConditionsToGetLocationUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f110748d = c0Var;
            bVar.f110751g = 1;
            objA = aVar.a(c1792a, bVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) bVar.f110748d;
            oq.u.b(objA);
        }
        e14.a.InterfaceC1068a interfaceC1068a = (e14.a.InterfaceC1068a) objA;
        if (interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS) {
            d9(new kf3.a.e.ShowDialog(G9()));
            return c0Var.c();
        }
        if (interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED) {
            d9(new kf3.a.e.ShowDialog(E9()));
            return c0Var.c();
        }
        if (!fr.t.c(interfaceC1068a, e14.a.InterfaceC1068a.b.f46876a)) {
            throw new oq.p();
        }
        d9(new kf3.a.SetStateMyPosition(State.a.c.f110686a));
        return c0Var.b(new er.l() { // from class: kf3.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.L9((State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State L9(State state) {
        return State.b(state, null, null, null, true, null, null, null, null, 247, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M9(tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f110754f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f110754f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f110752d;
        Object objE = uq.b.e();
        int i16 = cVar.f110754f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.n nVar = this.goToDeviceLocationSettingsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f110754f = 1;
            objC = nVar.c(c1792a, cVar);
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
    public final Object N9(tq.e<? super i0> eVar) {
        dx.i<? extends dx.b.Business, ? extends i0> iVarA = this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
        if (iVarA instanceof dx.i.Left) {
            this.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(this.labelProvider.c(md3.b.G0), false, null, null, 14, null));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O9(Coordinates coordinates, tq.e<? super BEVehicleCollisionDescriptionConception.LocationDetails> eVar) throws Throwable {
        d dVar;
        LocationDetails locationDetails;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f110758g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f110758g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f110756e;
        Object objE = uq.b.e();
        int i16 = dVar.f110758g;
        if (i16 == 0) {
            oq.u.b(objB);
            boolean zE = this.networkConnectionManager.e();
            if (zE) {
                e14.d dVar2 = this.getAddressUseCase;
                e14.d.Params params = new e14.d.Params(coordinates, pq.v.n());
                dVar.f110755d = vq.j.a(coordinates);
                dVar.f110758g = 1;
                objB = dVar2.b(params, dVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (zE) {
                    throw new oq.p();
                }
                locationDetails = new LocationDetails(null, null, null, null, null, null, null, coordinates, CertificateBody.profileType, null);
            }
            return xd3.a.d(locationDetails);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(objB);
        locationDetails = (LocationDetails) objB;
        return xd3.a.d(locationDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf3.c.Data P9(State state) {
        return this.chooseLocalizationMapScreenMapper.b(new mf3.c.Params(state, new er.l() { // from class: kf3.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.Q9(this.f110720a, (Coordinates) obj);
            }
        }, new er.p() { // from class: kf3.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return v.R9(this.f110721a, (Coordinates) obj, (String) obj2);
            }
        }, b9(new kf3.a.GetLocation(pq.v.n())), b9(kf3.a.h.f110669a), b9(kf3.a.g.f110668a), b9(kf3.a.e.C2656a.f110665a), b9(kf3.a.f.f110667a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(v vVar, Coordinates coordinates) {
        vVar.d9(new kf3.a.PinChosen(coordinates, Label.INSTANCE.c()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(v vVar, Coordinates coordinates, String str) {
        vVar.d9(new kf3.a.PinChosen(coordinates, mx.b.b(str, "name")));
        return i0.f148189a;
    }

    private final State S9(BEVehicleCollisionDescriptionConception.LocationDetails locationDetails) {
        return locationDetails != null ? new State(locationDetails, null, null, false, locationDetails.getCoordinates(), locationDetails.getCoordinates(), State.a.C2658b.f110685a, null, 6, null) : new State(null, null, null, false, null, null, State.a.C2658b.f110685a, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(State.class), new er.l() { // from class: kf3.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.V9(this.f110719a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(v vVar, k10.z zVar) {
        j jVar = vVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kf3.a.e.class), oVar, jVar);
        zVar.C(vVar.new k(null));
        zVar.v(q0.c(kf3.a.C2655a.class), oVar, vVar.new l(null));
        zVar.v(q0.c(kf3.a.PinChosen.class), oVar, vVar.new m(null));
        k10.k.m(zVar, vVar.contract.m(), null, vVar.new n(null), 2, null);
        zVar.v(q0.c(kf3.a.SetStateMyPosition.class), oVar, vVar.new o(null));
        zVar.v(q0.c(kf3.a.f.class), oVar, new p(null));
        zVar.v(q0.c(kf3.a.UpdateMyPosition.class), oVar, vVar.new q(null));
        zVar.v(q0.c(kf3.a.GetLocation.class), oVar, vVar.new r(null));
        zVar.x(q0.c(kf3.a.d.class), oVar, vVar.new f(null));
        zVar.x(q0.c(kf3.a.c.class), oVar, vVar.new g(null));
        zVar.x(q0.c(kf3.a.h.class), oVar, vVar.new h(null));
        zVar.x(q0.c(kf3.a.g.class), oVar, vVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W9(final kf3.a.UpdateMyPosition updateMyPosition, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f110814h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f110814h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object objO9 = sVar.f110812f;
        Object objE = uq.b.e();
        int i16 = sVar.f110814h;
        if (i16 == 0) {
            oq.u.b(objO9);
            State.a stateUpdateMyPosition = c0Var.a().getStateUpdateMyPosition();
            if (fr.t.c(stateUpdateMyPosition, State.a.C2657a.f110684a)) {
                return c0Var.c();
            }
            if (fr.t.c(stateUpdateMyPosition, State.a.C2658b.f110685a)) {
                return c0Var.d(new er.l() { // from class: kf3.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.X9(updateMyPosition, (State) obj);
                    }
                });
            }
            if (!fr.t.c(stateUpdateMyPosition, State.a.c.f110686a)) {
                throw new oq.p();
            }
            Coordinates coordinates = updateMyPosition.getCoordinates();
            sVar.f110810d = updateMyPosition;
            sVar.f110811e = c0Var;
            sVar.f110814h = 1;
            objO9 = O9(coordinates, sVar);
            if (objO9 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) sVar.f110811e;
            updateMyPosition = (kf3.a.UpdateMyPosition) sVar.f110810d;
            oq.u.b(objO9);
        }
        final BEVehicleCollisionDescriptionConception.LocationDetails locationDetails = (BEVehicleCollisionDescriptionConception.LocationDetails) objO9;
        D9(locationDetails);
        return c0Var.d(new er.l() { // from class: kf3.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.Y9(updateMyPosition, locationDetails, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State X9(kf3.a.UpdateMyPosition updateMyPosition, State state) {
        return State.b(state, null, null, null, false, null, updateMyPosition.getCoordinates(), null, null, 223, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State Y9(kf3.a.UpdateMyPosition updateMyPosition, BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, State state) {
        return State.b(state, locationDetails, null, null, false, updateMyPosition.getCoordinates(), updateMyPosition.getCoordinates(), null, null, 206, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: T9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(lf3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<kf3.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, kf3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kf3.c.Data> getState() {
        return this.state;
    }

    @Override // kf3.c
    public mu.g<i70.p> j() {
        return this.snackBarVisibilityState;
    }
}
