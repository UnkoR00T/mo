package qj1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tj1.TrainingPointClusterItem;
import vy.Coordinates;
import zp0.AvailableDefenceTrainings;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J7\u0010/\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*H\u0002¢\u0006\u0004\b/\u00100J$\u00101\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0082@¢\u0006\u0004\b1\u00102J$\u00103\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0082@¢\u0006\u0004\b3\u00102J\u001f\u00109\u001a\u0002082\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020;*\u00020,H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020,*\u00020;H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\bA\u0010BJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CH\u0096\u0001¢\u0006\u0004\bH\u0010FJ\u0018\u0010K\u001a\u0002082\u0006\u0010J\u001a\u00020IH\u0096\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u000208H\u0096\u0001¢\u0006\u0004\bM\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR \u0010\u007f\u001a\b\u0012\u0004\u0012\u00020z0y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R,\u0010\u0085\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0080\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R%\u0010)\u001a\t\u0012\u0004\u0012\u00020@0\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008b\u0001"}, d2 = {"Lqj1/u0;", "Ll00/g;", "Lqj1/h;", "Lqj1/d;", "Lqj1/j;", "", "Lnx/b;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lsj1/e;", "mapper", "Li14/b;", "getGpsCurrentStatus", "Li14/d;", "isGpsEnabledUseCase", "Li14/a;", "checkGpsPermissionGrantedUseCase", "Li14/e;", "requestPreciseLocationUseCase", "Li14/c;", "getPreciseLocationUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "globalSnackBarManager", "Luy/d;", "gpsManager", "Lmx/c;", "labelProvider", "Loz/q;", "ownerViewLifecycleManager", "Lwi1/g;", "selectTrainingsNearestToUserUC", "Lqj1/k;", "setupContract", "<init>", "(Lyy/a;Lsj1/e;Li14/b;Li14/d;Li14/a;Li14/e;Li14/c;La14/n;La14/m;Li70/e;Luy/d;Lmx/c;Loz/q;Lwi1/g;Lqj1/k;)V", "Lk10/c0;", "Lqj1/h$b;", "state", "Ldx/i;", "Ldx/b;", "Lvy/c;", "response", "Lk10/l;", "ia", "(Lk10/c0;Ldx/i;)Lk10/l;", "S9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "W9", "Ltj1/b;", "item", "", "zoom", "Loq/i0;", "N9", "(Ltj1/b;F)V", "Lcom/google/android/gms/maps/model/LatLng;", "ha", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "ga", "(Lcom/google/android/gms/maps/model/LatLng;)Lvy/c;", "Lqj1/j$a;", "P9", "(Lqj1/h;)Lqj1/j$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lsj1/e;", "c", "Li14/b;", "d", "Li14/d;", "e", "Li14/a;", "f", "Li14/e;", "g", "Li14/c;", "h", "La14/n;", "j", "La14/m;", "k", "Li70/e;", "l", "Luy/d;", "m", "Lmx/c;", "n", "Loz/q;", "p", "Lwi1/g;", "q", "Lqj1/k;", "r", "Lqj1/h$b;", "initialState", "Llu/g;", "Lqj1/j$b;", "s", "Llu/g;", "mapSideEffects", "Loz/j;", "t", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lqj1/d$h;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "w", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 extends l00.g<qj1.h, qj1.d> implements qj1.j, zx.d, nx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sj1.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i14.b getGpsCurrentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i14.d isGpsEnabledUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i14.a checkGpsPermissionGrantedUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i14.e requestPreciseLocationUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i14.c getPreciseLocationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wi1.g selectTrainingsNearestToUserUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final qj1.k setupContract;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final qj1.h.Map initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final lu.g<qj1.j.b> mapSideEffects;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qj1.d.h> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qj1.h, qj1.d> stateMachine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<qj1.j.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f166897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f166898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f166899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166900g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f166902j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f166900g = obj;
            this.f166902j |= PKIFailureInfo.systemUnavail;
            return u0.this.S9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f166903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f166904e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f166906g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f166904e = obj;
            this.f166906g |= PKIFailureInfo.systemUnavail;
            return u0.this.W9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<qj1.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f166908b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u0 f166910b;

            /* JADX INFO: renamed from: qj1.u0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4196a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166911d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166912e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166913f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166915h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166916j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166917k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166918l;

                public C4196a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166911d = obj;
                    this.f166912e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u0 u0Var) {
                this.f166909a = hVar;
                this.f166910b = u0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4196a c4196a;
                if (eVar instanceof C4196a) {
                    c4196a = (C4196a) eVar;
                    int i15 = c4196a.f166912e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4196a.f166912e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4196a = new C4196a(eVar);
                    }
                } else {
                    c4196a = new C4196a(eVar);
                }
                Object obj2 = c4196a.f166911d;
                Object objE = uq.b.e();
                int i16 = c4196a.f166912e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f166909a;
                    qj1.j.a aVarP9 = this.f166910b.P9((qj1.h) obj);
                    c4196a.f166913f = vq.j.a(obj);
                    c4196a.f166915h = vq.j.a(c4196a);
                    c4196a.f166916j = vq.j.a(obj);
                    c4196a.f166917k = vq.j.a(hVar);
                    c4196a.f166918l = 0;
                    c4196a.f166912e = 1;
                    if (hVar.F(aVarP9, c4196a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public c(mu.g gVar, u0 u0Var) {
            this.f166907a = gVar;
            this.f166908b = u0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super qj1.j.a> hVar, tq.e eVar) {
            Object objA = this.f166907a.a(new a(hVar, this.f166908b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$a;", "<unused var>", "Lqj1/h;", "Loq/i0;", "<anonymous>", "(Lqj1/d$a;Lqj1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qj1.d.a, qj1.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166919e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166919e;
            if (i15 == 0) {
                oq.u.b(obj);
                u0 u0Var = u0.this;
                qj1.d.h.a aVar = qj1.d.h.a.f166756a;
                this.f166919e = 1;
                if (u0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.a aVar, qj1.h hVar, tq.e<? super oq.i0> eVar) {
            return u0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$b;", "<unused var>", "Lqj1/h;", "Loq/i0;", "<anonymous>", "(Lqj1/d$b;Lqj1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qj1.d.b, qj1.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166921e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166921e;
            if (i15 == 0) {
                oq.u.b(obj);
                u0 u0Var = u0.this;
                qj1.d.h.b bVar = qj1.d.h.b.f166757a;
                this.f166921e = 1;
                if (u0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.b bVar, qj1.h hVar, tq.e<? super oq.i0> eVar) {
            return u0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqj1/d$m;", "action", "Lqj1/h;", "state", "Loq/i0;", "<anonymous>", "(Lqj1/d$m;Lqj1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qj1.d.RegisterInLocation, qj1.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166924f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qj1.d.RegisterInLocation registerInLocation = (qj1.d.RegisterInLocation) this.f166924f;
            Object objE = uq.b.e();
            int i15 = this.f166923e;
            if (i15 == 0) {
                oq.u.b(obj);
                u0.this.setupContract.d8(registerInLocation.getLocation());
                u0 u0Var = u0.this;
                qj1.d.h.c cVar = qj1.d.h.c.f166758a;
                this.f166924f = vq.j.a(registerInLocation);
                this.f166923e = 1;
                if (u0Var.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.RegisterInLocation registerInLocation, qj1.h hVar, tq.e<? super oq.i0> eVar) {
            f fVar = u0.this.new f(eVar);
            fVar.f166924f = registerInLocation;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$c;", "<unused var>", "Lqj1/h$b;", "Loq/i0;", "<anonymous>", "(Lqj1/d$c;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qj1.d.c, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f166926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166927f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r1.c(r3, r4) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f166927f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L56
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                qj1.u0 r5 = qj1.u0.this
                i14.d r5 = qj1.u0.G9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f166927f = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L4c
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L4d
                qj1.u0 r1 = qj1.u0.this
                a14.n r1 = qj1.u0.z9(r1)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r4.f166926e = r5
                r4.f166927f = r2
                java.lang.Object r5 = r1.c(r3, r4)
                if (r5 != r0) goto L56
            L4c:
                return r0
            L4d:
                qj1.u0 r5 = qj1.u0.this
                qj1.d$g r0 = qj1.d.g.f166755a
                qj1.u0.w9(r5, r0)
                oq.i0 r5 = oq.i0.f148189a
            L56:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.u0.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.c cVar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            return u0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$d;", "<unused var>", "Lqj1/h;", "Loq/i0;", "<anonymous>", "(Lqj1/d$d;Lqj1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qj1.d.C4191d, qj1.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166929e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166929e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = u0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            u0 u0Var = u0.this;
            if (iVarA instanceof dx.i.Left) {
                u0Var.d9(new qj1.d.ShowSnackBar(u0Var.labelProvider.c(ri1.b.f174373g2)));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.C4191d c4191d, qj1.h hVar, tq.e<? super oq.i0> eVar) {
            return u0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$p;", "<unused var>", "Lqj1/h$b;", "Loq/i0;", "<anonymous>", "(Lqj1/d$p;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qj1.d.p, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166931e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166931e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qj1.d.h> bVarY1 = u0.this.Y1();
                qj1.d.h.ShowDialog showDialog = new qj1.d.h.ShowDialog(new DialogData(cb4.h.b.f24985a, u0.this.labelProvider.c(ri1.b.f174361d2), u0.this.labelProvider.c(ri1.b.f174357c2), new DialogButtonTextData(u0.this.labelProvider.c(ri1.b.f174353b2), null, u0.this.b9(qj1.d.C4191d.f166748a), 2, null), new DialogButtonTextData(u0.this.labelProvider.c(ri1.b.f174349a2), null, new er.a() { // from class: qj1.v0
                    @Override // er.a
                    public final Object a() {
                        return u0.i.V();
                    }
                }, 2, null), null, new er.a() { // from class: qj1.w0
                    @Override // er.a
                    public final Object a() {
                        return u0.i.X();
                    }
                }, 32, null));
                this.f166931e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.p pVar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            return u0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$o;", "<unused var>", "Lqj1/h$b;", "Loq/i0;", "<anonymous>", "(Lqj1/d$o;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qj1.d.o, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166933e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166933e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qj1.d.h> bVarY1 = u0.this.Y1();
                qj1.d.h.ShowDialog showDialog = new qj1.d.h.ShowDialog(new DialogData(cb4.h.b.f24985a, u0.this.labelProvider.c(ri1.b.f174369f2), u0.this.labelProvider.c(ri1.b.f174365e2), new DialogButtonTextData(u0.this.labelProvider.c(ri1.b.f174353b2), null, u0.this.b9(qj1.d.c.f166747a), 2, null), new DialogButtonTextData(u0.this.labelProvider.c(ri1.b.f174349a2), null, new er.a() { // from class: qj1.x0
                    @Override // er.a
                    public final Object a() {
                        return u0.j.V();
                    }
                }, 2, null), null, new er.a() { // from class: qj1.y0
                    @Override // er.a
                    public final Object a() {
                        return u0.j.X();
                    }
                }, 32, null));
                this.f166933e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.o oVar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            return u0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqj1/d$e;", "action", "Lqj1/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqj1/d$e;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qj1.d.HandlePointClick, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166936f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qj1.d.HandlePointClick handlePointClick = (qj1.d.HandlePointClick) this.f166936f;
            uq.b.e();
            if (this.f166935e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u0.this.N9(handlePointClick.getItem(), handlePointClick.getZoom());
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.HandlePointClick handlePointClick, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            k kVar = u0.this.new k(eVar);
            kVar.f166936f = handlePointClick;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$r;", "action", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<qj1.d.UpdateSelectedPlace, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166940g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.Map O(qj1.d.UpdateSelectedPlace updateSelectedPlace, qj1.h.Map map) {
            Object next;
            Form form = map.getForm();
            Iterator<T> it = map.getForm().getListOfPoints().d().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (fr.t.c(((AvailableDefenceTrainings) next).getUnit().getCoordinates(), updateSelectedPlace.getUnit().getCoordinates())) {
                    return map.a(Form.b(form, null, null, null, false, false, (AvailableDefenceTrainings) next, updateSelectedPlace.getMapPosition(), 31, null));
                }
            }
            next = null;
            return map.a(Form.b(form, null, null, null, false, false, (AvailableDefenceTrainings) next, updateSelectedPlace.getMapPosition(), 31, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qj1.d.UpdateSelectedPlace updateSelectedPlace = (qj1.d.UpdateSelectedPlace) this.f166939f;
            k10.c0 c0Var = (k10.c0) this.f166940g;
            uq.b.e();
            if (this.f166938e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qj1.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u0.l.O(updateSelectedPlace, (h.Map) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.UpdateSelectedPlace updateSelectedPlace, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            l lVar = new l(eVar);
            lVar.f166939f = updateSelectedPlace;
            lVar.f166940g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqj1/d$f;", "action", "Lqj1/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqj1/d$f;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<qj1.d.MoveCamera, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166942f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qj1.d.MoveCamera moveCamera = (qj1.d.MoveCamera) this.f166942f;
            Object objE = uq.b.e();
            int i15 = this.f166941e;
            if (i15 == 0) {
                oq.u.b(obj);
                lu.g gVar = u0.this.mapSideEffects;
                qj1.j.b.MoveCamera moveCamera2 = new qj1.j.b.MoveCamera(u0.this.ha(moveCamera.getCoordinates()), moveCamera.getType(), moveCamera.b());
                this.f166942f = vq.j.a(moveCamera);
                this.f166941e = 1;
                if (gVar.l(moveCamera2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.MoveCamera moveCamera, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            m mVar = u0.this.new m(eVar);
            mVar.f166942f = moveCamera;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$g;", "<unused var>", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<qj1.d.g, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166945f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f166945f;
            Object objE = uq.b.e();
            int i15 = this.f166944e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u0 u0Var = u0.this;
            this.f166945f = vq.j.a(c0Var);
            this.f166944e = 1;
            Object objS9 = u0Var.S9(c0Var, this);
            return objS9 == objE ? objE : objS9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.g gVar, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            n nVar = u0.this.new n(eVar);
            nVar.f166945f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$k;", "<unused var>", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<qj1.d.k, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f166947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f166948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f166949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f166950h;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.List V(Form form, qj1.h.Map map) {
            return new qj1.h.List(form);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.List X(Form form, wi1.g.Result result, qj1.h.Map map) {
            return new qj1.h.List(Form.b(form, null, new TrainingsByDistance(result.a(), result.b()), null, false, false, null, null, 125, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Form form;
            k10.c0 c0Var = (k10.c0) this.f166950h;
            Object objE = uq.b.e();
            int i15 = this.f166949g;
            if (i15 == 0) {
                oq.u.b(obj);
                final Form form2 = ((qj1.h.Map) c0Var.a()).getForm();
                Coordinates userCurrentPosition = form2.getUserCurrentPosition();
                if (userCurrentPosition == null) {
                    return c0Var.d(new er.l() { // from class: qj1.a1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u0.o.V(form2, (h.Map) obj2);
                        }
                    });
                }
                wi1.g gVar = u0.this.selectTrainingsNearestToUserUC;
                wi1.g.Params params = new wi1.g.Params(userCurrentPosition, form2.getListOfPoints().d());
                this.f166950h = c0Var;
                this.f166947e = form2;
                this.f166948f = vq.j.a(userCurrentPosition);
                this.f166949g = 1;
                Object objE2 = gVar.e(params, this);
                if (objE2 == objE) {
                    return objE;
                }
                form = form2;
                obj = objE2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                form = (Form) this.f166947e;
                oq.u.b(obj);
            }
            final wi1.g.Result result = (wi1.g.Result) obj;
            return c0Var.d(new er.l() { // from class: qj1.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return u0.o.X(form, result, (h.Map) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.k kVar, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            o oVar = u0.this.new o(eVar);
            oVar.f166950h = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqj1/h$b;", "it", "Loq/i0;", "<anonymous>", "(Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166952e;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166952e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u0.this.d9(qj1.d.n.f166765a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            return ((p) v(map, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return u0.this.new p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lqj1/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<nx.a, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166955f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166957a;

            static {
                int[] iArr = new int[nx.a.values().length];
                try {
                    iArr[nx.a.RESUMED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nx.a.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f166957a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f166955f;
            uq.b.e();
            if (this.f166954e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f166957a[aVar.ordinal()];
            if (i15 == 1) {
                u0.this.d9(qj1.d.j.f166761a);
            } else if (i15 == 2) {
                u0.this.d9(qj1.d.i.f166760a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            q qVar = u0.this.new q(eVar);
            qVar.f166955f = aVar;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isGpsActive", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<Boolean, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f166959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166960g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.Map O(boolean z15, qj1.h.Map map) {
            return map.a(Form.b(map.getForm(), null, null, null, z15, false, null, null, 119, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f166959f;
            k10.c0 c0Var = (k10.c0) this.f166960g;
            uq.b.e();
            if (this.f166958e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qj1.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return u0.r.O(z15, (h.Map) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            r rVar = new r(eVar);
            rVar.f166959f = z15;
            rVar.f166960g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ldx/i;", "Ldx/b;", "Lvy/c;", "response", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Ldx/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<dx.i<? extends dx.b, ? extends Coordinates>, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166963g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f166962f;
            k10.c0 c0Var = (k10.c0) this.f166963g;
            uq.b.e();
            if (this.f166961e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return u0.this.ia(c0Var, iVar);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, Coordinates> iVar, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            s sVar = u0.this.new s(eVar);
            sVar.f166962f = iVar;
            sVar.f166963g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$j;", "<unused var>", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<qj1.d.j, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f166965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166967g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.Map O(boolean z15, boolean z16, qj1.h.Map map) {
            return map.a(Form.b(map.getForm(), null, null, null, z15, z16, null, null, 103, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15;
            k10.c0 c0Var = (k10.c0) this.f166967g;
            Object objE = uq.b.e();
            int i15 = this.f166966f;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z15 = this.f166965e;
                    oq.u.b(obj);
                }
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return c0Var.b(new er.l() { // from class: qj1.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u0.t.O(zBooleanValue, z15, (h.Map) obj2);
                    }
                });
            }
            oq.u.b(obj);
            u0.this.gpsManager.a();
            i14.a aVar = u0.this.checkGpsPermissionGrantedUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f166967g = c0Var;
            this.f166966f = 1;
            obj = aVar.c(c1792a, this);
            if (obj != objE) {
            }
            return objE;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            i14.d dVar = u0.this.isGpsEnabledUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f166967g = c0Var;
            this.f166965e = zBooleanValue2;
            this.f166966f = 2;
            Object objC = dVar.c(c1792a2, this);
            if (objC != objE) {
                z15 = zBooleanValue2;
                obj = objC;
                final boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                return c0Var.b(new er.l() { // from class: qj1.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u0.t.O(zBooleanValue3, z15, (h.Map) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.j jVar, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            t tVar = u0.this.new t(eVar);
            tVar.f166967g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqj1/d$i;", "<unused var>", "Lqj1/h$b;", "Loq/i0;", "<anonymous>", "(Lqj1/d$i;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<qj1.d.i, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166969e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166969e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u0.this.gpsManager.e();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.i iVar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            return u0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqj1/d$q;", "action", "Lqj1/h$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqj1/d$q;Lqj1/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<qj1.d.ShowSnackBar, qj1.h.Map, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166972f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qj1.d.ShowSnackBar showSnackBar = (qj1.d.ShowSnackBar) this.f166972f;
            uq.b.e();
            if (this.f166971e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u0.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.ShowSnackBar showSnackBar, qj1.h.Map map, tq.e<? super oq.i0> eVar) {
            v vVar = u0.this.new v(eVar);
            vVar.f166972f = showSnackBar;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$n;", "<unused var>", "Lk10/c0;", "Lqj1/h$b;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<qj1.d.n, k10.c0<qj1.h.Map>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166975f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f166975f;
            Object objE = uq.b.e();
            int i15 = this.f166974e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            u0 u0Var = u0.this;
            this.f166975f = vq.j.a(c0Var);
            this.f166974e = 1;
            Object objW9 = u0Var.W9(c0Var, this);
            return objW9 == objE ? objE : objW9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.n nVar, k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            w wVar = u0.this.new w(eVar);
            wVar.f166975f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqj1/h$a;", "it", "Loq/i0;", "<anonymous>", "(Lqj1/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.p<qj1.h.List, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166977e;

        x(tq.e<? super x> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166977e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u0.this.gpsManager.e();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(qj1.h.List list, tq.e<? super oq.i0> eVar) {
            return ((x) v(list, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return u0.this.new x(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqj1/d$l;", "<unused var>", "Lk10/c0;", "Lqj1/h$a;", "state", "Lk10/l;", "Lqj1/h;", "<anonymous>", "(Lqj1/d$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<qj1.d.l, k10.c0<qj1.h.List>, tq.e<? super k10.l<? extends qj1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166980f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qj1.h.Map O(qj1.h.List list) {
            return new qj1.h.Map(list.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f166980f;
            uq.b.e();
            if (this.f166979e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qj1.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return u0.y.O((h.List) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qj1.d.l lVar, k10.c0<qj1.h.List> c0Var, tq.e<? super k10.l<? extends qj1.h>> eVar) {
            y yVar = new y(eVar);
            yVar.f166980f = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    public u0(yy.a aVar, sj1.e eVar, i14.b bVar, i14.d dVar, i14.a aVar2, i14.e eVar2, i14.c cVar, a14.n nVar, a14.m mVar, i70.e eVar3, uy.d dVar2, mx.c cVar2, oz.q qVar, wi1.g gVar, qj1.k kVar) {
        this.mapper = eVar;
        this.getGpsCurrentStatus = bVar;
        this.isGpsEnabledUseCase = dVar;
        this.checkGpsPermissionGrantedUseCase = aVar2;
        this.requestPreciseLocationUseCase = eVar2;
        this.getPreciseLocationUseCase = cVar;
        this.goToDeviceLocationSettingsUseCase = nVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.globalSnackBarManager = eVar3;
        this.gpsManager = dVar2;
        this.labelProvider = cVar2;
        this.ownerViewLifecycleManager = qVar;
        this.selectTrainingsNearestToUserUC = gVar;
        this.setupContract = kVar;
        qj1.h.Map map = new qj1.h.Map(new Form(kVar.E5(), null, null, false, false, kVar.r4(), null, 94, null));
        this.initialState = map;
        this.mapSideEffects = lu.j.b(0, null, null, 7, null);
        this.lifecycleConnector = qVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(map, new er.l() { // from class: qj1.k0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.aa(this.f166848a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), P9(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N9(TrainingPointClusterItem item, float zoom) {
        B0();
        d9(new qj1.d.UpdateSelectedPlace(new MapPosition(ga(item.getLatLng()), zoom), item.getUnit()));
        d9(new qj1.d.MoveCamera(ga(item.getLatLng()), qj1.e.POINT, new er.a() { // from class: qj1.j0
            @Override // er.a
            public final Object a() {
                return u0.O9();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qj1.j.a P9(qj1.h state) {
        sj1.e eVar = this.mapper;
        mu.g gVarW = mu.i.W(this.mapSideEffects);
        er.a<oq.i0> aVarB9 = b9(qj1.d.a.f166745a);
        er.a<oq.i0> aVarB10 = b9(qj1.d.g.f166755a);
        return eVar.b(new sj1.e.Params(state, gVarW, aVarB9, b9(qj1.d.b.f166746a), new er.p() { // from class: qj1.f0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return u0.Q9(this.f166812a, (TrainingPointClusterItem) obj, ((Float) obj2).floatValue());
            }
        }, aVarB10, b9(qj1.d.l.f166763a), b9(qj1.d.k.f166762a), new er.l() { // from class: qj1.l0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.R9(this.f166853a, (AvailableDefenceTrainings) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(u0 u0Var, TrainingPointClusterItem trainingPointClusterItem, float f15) {
        u0Var.d9(new qj1.d.HandlePointClick(trainingPointClusterItem, f15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(u0 u0Var, AvailableDefenceTrainings availableDefenceTrainings) {
        u0Var.d9(new qj1.d.RegisterInLocation(availableDefenceTrainings));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S9(k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<qj1.h.Map>> eVar) throws Throwable {
        a aVar;
        boolean z15;
        boolean zBooleanValue;
        Object objC;
        k10.c0<qj1.h.Map> c0Var2;
        final boolean z16;
        final boolean z17;
        final Coordinates coordinates;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f166902j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f166902j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC2 = aVar.f166900g;
        Object objE = uq.b.e();
        int i16 = aVar.f166902j;
        if (i16 == 0) {
            oq.u.b(objC2);
            i14.a aVar2 = this.checkGpsPermissionGrantedUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f166897d = c0Var;
            aVar.f166902j = 1;
            objC2 = aVar2.c(c1792a, aVar);
            if (objC2 != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (k10.c0) aVar.f166897d;
            oq.u.b(objC2);
        } else {
            if (i16 == 2) {
                boolean z18 = aVar.f166898e;
                k10.c0<qj1.h.Map> c0Var3 = (k10.c0) aVar.f166897d;
                oq.u.b(objC2);
                z15 = z18;
                c0Var = c0Var3;
                zBooleanValue = ((Boolean) objC2).booleanValue();
                if (!zBooleanValue) {
                    d9(qj1.d.o.f166766a);
                    return c0Var.b(new er.l() { // from class: qj1.g0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u0.U9((h.Map) obj);
                        }
                    });
                }
                if (zBooleanValue && z15 && c0Var.a().getForm().getUserCurrentPosition() == null) {
                    d9(new qj1.d.ShowSnackBar(this.labelProvider.c(ri1.b.f174401q)));
                }
                i14.c cVar = this.getPreciseLocationUseCase;
                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                aVar.f166897d = c0Var;
                aVar.f166898e = z15;
                aVar.f166899f = zBooleanValue;
                aVar.f166902j = 3;
                objC = cVar.c(c1792a2, aVar);
                if (objC != objE) {
                    c0Var2 = c0Var;
                    z16 = zBooleanValue;
                    objC2 = objC;
                    z17 = z15;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z16 = aVar.f166899f;
            z17 = aVar.f166898e;
            c0Var2 = (k10.c0) aVar.f166897d;
            oq.u.b(objC2);
        }
        coordinates = (Coordinates) objC2;
        if (coordinates != null) {
            d9(new qj1.d.MoveCamera(coordinates, qj1.e.USER, null));
        } else {
            coordinates = null;
        }
        return c0Var2.b(new er.l() { // from class: qj1.h0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.V9(coordinates, z16, z17, (h.Map) obj);
            }
        });
        boolean zBooleanValue2 = ((Boolean) objC2).booleanValue();
        if (!zBooleanValue2) {
            d9(qj1.d.p.f166767a);
            return c0Var.b(new er.l() { // from class: qj1.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return u0.T9((h.Map) obj);
                }
            });
        }
        i14.d dVar = this.isGpsEnabledUseCase;
        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
        aVar.f166897d = c0Var;
        aVar.f166898e = zBooleanValue2;
        aVar.f166902j = 2;
        Object objC3 = dVar.c(c1792a3, aVar);
        if (objC3 != objE) {
            z15 = zBooleanValue2;
            objC2 = objC3;
            zBooleanValue = ((Boolean) objC2).booleanValue();
            if (!zBooleanValue) {
                d9(qj1.d.o.f166766a);
                return c0Var.b(new er.l() { // from class: qj1.g0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u0.U9((h.Map) obj);
                    }
                });
            }
            if (zBooleanValue) {
                d9(new qj1.d.ShowSnackBar(this.labelProvider.c(ri1.b.f174401q)));
            }
            i14.c cVar2 = this.getPreciseLocationUseCase;
            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
            aVar.f166897d = c0Var;
            aVar.f166898e = z15;
            aVar.f166899f = zBooleanValue;
            aVar.f166902j = 3;
            objC = cVar2.c(c1792a4, aVar);
            if (objC != objE) {
                c0Var2 = c0Var;
                z16 = zBooleanValue;
                objC2 = objC;
                z17 = z15;
                coordinates = (Coordinates) objC2;
                if (coordinates != null) {
                    d9(new qj1.d.MoveCamera(coordinates, qj1.e.USER, null));
                } else {
                    coordinates = null;
                }
                return c0Var2.b(new er.l() { // from class: qj1.h0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u0.V9(coordinates, z16, z17, (h.Map) obj);
                    }
                });
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map T9(qj1.h.Map map) {
        return map.a(Form.b(map.getForm(), null, null, null, false, false, null, null, 111, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map U9(qj1.h.Map map) {
        return map.a(Form.b(map.getForm(), null, null, null, false, false, null, null, 119, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map V9(Coordinates coordinates, boolean z15, boolean z16, qj1.h.Map map) {
        return map.a(Form.b(map.getForm(), null, null, coordinates, z15, z16, null, null, 99, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W9(k10.c0<qj1.h.Map> c0Var, tq.e<? super k10.l<qj1.h.Map>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f166906g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f166906g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f166904e;
        Object objE = uq.b.e();
        int i16 = bVar.f166906g;
        if (i16 == 0) {
            oq.u.b(objC);
            i14.e eVar2 = this.requestPreciseLocationUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f166903d = c0Var;
            bVar.f166906g = 1;
            objC = eVar2.c(c1792a, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) bVar.f166903d;
            oq.u.b(objC);
        }
        x04.a aVar = (x04.a) objC;
        if (fr.t.c(aVar, x04.a.C5758a.f216293a)) {
            return c0Var.b(new er.l() { // from class: qj1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return u0.X9((h.Map) obj);
                }
            });
        }
        if (fr.t.c(aVar, x04.a.b.f216294a)) {
            return c0Var.b(new er.l() { // from class: qj1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return u0.Y9((h.Map) obj);
                }
            });
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map X9(qj1.h.Map map) {
        return map.a(Form.b(map.getForm(), null, null, null, false, true, null, null, 111, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map Y9(qj1.h.Map map) {
        return map.a(Form.b(map.getForm(), null, null, null, false, false, null, null, 111, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(final u0 u0Var, k10.v vVar) {
        vVar.c(fr.q0.c(qj1.h.class), new er.l() { // from class: qj1.m0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.ba(this.f166854a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qj1.h.Map.class), new er.l() { // from class: qj1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.ca(this.f166860a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(qj1.h.List.class), new er.l() { // from class: qj1.o0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.fa(this.f166863a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(u0 u0Var, k10.z zVar) {
        d dVar = u0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(qj1.d.a.class), oVar, dVar);
        zVar.x(fr.q0.c(qj1.d.b.class), oVar, u0Var.new e(null));
        zVar.x(fr.q0.c(qj1.d.RegisterInLocation.class), oVar, u0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(final u0 u0Var, k10.z zVar) {
        zVar.C(u0Var.new p(null));
        k10.k.s(zVar, u0Var.x8(), null, u0Var.new q(null), 2, null);
        k10.k.m(zVar, mu.i.p((mu.g) u0Var.getGpsCurrentStatus.a(gz.b.a.C1792a.f78542a)), null, new r(null), 2, null);
        zVar.L(new er.l() { // from class: qj1.p0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(u0.da((h.Map) obj));
            }
        }, new er.l() { // from class: qj1.q0
            @Override // er.l
            public final Object b(Object obj) {
                return u0.ea(this.f166867a, (k10.m) obj);
            }
        });
        t tVar = u0Var.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(qj1.d.j.class), oVar, tVar);
        zVar.x(fr.q0.c(qj1.d.i.class), oVar, u0Var.new u(null));
        zVar.x(fr.q0.c(qj1.d.ShowSnackBar.class), oVar, u0Var.new v(null));
        zVar.v(fr.q0.c(qj1.d.n.class), oVar, u0Var.new w(null));
        zVar.x(fr.q0.c(qj1.d.c.class), oVar, u0Var.new g(null));
        zVar.x(fr.q0.c(qj1.d.C4191d.class), oVar, u0Var.new h(null));
        zVar.x(fr.q0.c(qj1.d.p.class), oVar, u0Var.new i(null));
        zVar.x(fr.q0.c(qj1.d.o.class), oVar, u0Var.new j(null));
        zVar.x(fr.q0.c(qj1.d.HandlePointClick.class), oVar, u0Var.new k(null));
        zVar.v(fr.q0.c(qj1.d.UpdateSelectedPlace.class), oVar, new l(null));
        zVar.x(fr.q0.c(qj1.d.MoveCamera.class), oVar, u0Var.new m(null));
        zVar.v(fr.q0.c(qj1.d.g.class), oVar, u0Var.new n(null));
        zVar.v(fr.q0.c(qj1.d.k.class), oVar, u0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean da(qj1.h.Map map) {
        return map.getForm().getIsGpsPermissionGranted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(u0 u0Var, k10.m mVar) {
        k10.k.m(mVar, u0Var.gpsManager.g(), null, u0Var.new s(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(u0 u0Var, k10.z zVar) {
        zVar.C(u0Var.new x(null));
        y yVar = new y(null);
        zVar.v(fr.q0.c(qj1.d.l.class), k10.o.CANCEL_PREVIOUS, yVar);
        return oq.i0.f148189a;
    }

    private final Coordinates ga(LatLng latLng) {
        return new Coordinates(latLng.f31423a, latLng.f31424b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LatLng ha(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<qj1.h.Map> ia(k10.c0<qj1.h.Map> state, final dx.i<? extends dx.b, Coordinates> response) {
        if (response instanceof dx.i.Right) {
            return state.b(new er.l() { // from class: qj1.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return u0.ja(response, (h.Map) obj);
                }
            });
        }
        if (response instanceof dx.i.Left) {
            return state.c();
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qj1.h.Map ja(dx.i iVar, qj1.h.Map map) {
        dx.i.Right right = (dx.i.Right) iVar;
        return map.a(Form.b(map.getForm(), null, null, new Coordinates(((Coordinates) right.b()).getLatitude(), ((Coordinates) right.b()).getLongitude()), false, false, null, null, 123, null));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(qj1.d.h hVar, tq.e<? super oq.i0> eVar) {
        return super.F(hVar, eVar);
    }

    @Override // zx.b
    public xw.b<qj1.d.h> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(qj1.k kVar) {
        super.P5(kVar);
    }

    @Override // qj1.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<qj1.h, qj1.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<qj1.j.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
