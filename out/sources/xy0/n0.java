package xy0;

import com.google.android.gms.maps.model.LatLng;
import ez0.PointDetailsEntryPointData;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import zy0.InitializedModel;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0093\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b/\u00100J7\u00108\u001a\b\u0012\u0004\u0012\u000202072\f\u0010*\u001a\b\u0012\u0004\u0012\u000202012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020.2\u0006\u0010*\u001a\u00020:H\u0082@¢\u0006\u0004\b;\u0010<J\u0018\u0010>\u001a\u00020.2\u0006\u0010*\u001a\u00020=H\u0082@¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u000204H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020.2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010I\u001a\u00020H*\u000205H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020.2\u0006\u0010K\u001a\u00020&H\u0016¢\u0006\u0004\bL\u0010MJ\u0018\u0010P\u001a\u00020.2\u0006\u0010O\u001a\u00020NH\u0096\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020y0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R$\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020~0}8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R3\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0084\u00018\u0014X\u0094\u0004¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u0089\u0001\u0010S\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R+\u0010*\u001a\t\u0012\u0004\u0012\u00020+0\u008b\u00018\u0016X\u0096\u0004¢\u0006\u0016\n\u0005\bP\u0010\u008c\u0001\u0012\u0005\b\u008f\u0001\u0010S\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020y0\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, d2 = {"Lxy0/n0;", "Ll00/g;", "Lxy0/d;", "Lxy0/c;", "Lxy0/e;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lyy0/g;", "mapScreenMapper", "Li14/b;", "getGpsCurrentStatus", "Li14/d;", "isGpsEnabledUseCase", "Li14/a;", "checkGpsPermissionGrantedUseCase", "Li14/e;", "requestPreciseLocationUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Llh0/e;", "getAllQualityMeasurementPointsUC", "La14/n;", "goToDeviceLocationSettingsUseCase", "globalSnackBarManager", "Lib4/c;", "genericDomainErrorMapper", "Luy/d;", "gpsManager", "Lmx/c;", "labelProvider", "Lyy0/e;", "mapDialogMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Le14/e;", "getCurrentLocationUC", "Lkh0/l;", "bEQualityRate", "<init>", "(Lyy/a;Lyy0/g;Li14/b;Li14/d;Li14/a;Li14/e;Lac4/a;Llh0/e;La14/n;Li70/e;Lib4/c;Luy/d;Lmx/c;Lyy0/e;La14/m;Le14/e;Lkh0/l;)V", "state", "Lxy0/e$a;", "S9", "(Lxy0/d;)Lxy0/e$a;", "Loq/i0;", "N9", "(Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Lxy0/d$b$b;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "response", "Lk10/l;", "ka", "(Lk10/c0;Ldx/i;)Lk10/l;", "Lxy0/d$b;", "W9", "(Lxy0/d$b;Ltq/e;)Ljava/lang/Object;", "Lxy0/d$b$c;", "X9", "(Lxy0/d$b$c;Ltq/e;)Ljava/lang/Object;", "domainError", "Ljb4/b;", "Q9", "(Ldx/b;)Ljb4/b;", "Lzy0/c;", "item", "O9", "(Lzy0/c;)V", "Lcom/google/android/gms/maps/model/LatLng;", "ja", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "data", "Y9", "(Lkh0/l;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lyy0/g;", "c", "Li14/b;", "d", "Li14/d;", "e", "Li14/a;", "f", "Li14/e;", "g", "Lac4/a;", "h", "Llh0/e;", "j", "La14/n;", "k", "Li70/e;", "l", "Lib4/c;", "m", "Luy/d;", "n", "Lmx/c;", "p", "Lyy0/e;", "q", "La14/m;", "r", "Le14/e;", "s", "Lkh0/l;", "Lxy0/d$a;", "t", "Lxy0/d$a;", "initialState", "Llu/g;", "Lxy0/e$b;", "v", "Llu/g;", "_sideEffects", "Lxw/b;", "Lxy0/c$n;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lmu/g;", "z", "Lmu/g;", "T8", "()Lmu/g;", "sideEffects", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 extends l00.g<xy0.d, xy0.c> implements xy0.e, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yy0.g mapScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i14.b getGpsCurrentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i14.d isGpsEnabledUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i14.a checkGpsPermissionGrantedUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i14.e requestPreciseLocationUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final lh0.e getAllQualityMeasurementPointsUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final yy0.e mapDialogMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final e14.e getCurrentLocationUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final kh0.l bEQualityRate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xy0.d.a initialState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final lu.g<xy0.e.b> _sideEffects;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xy0.c.n> navAction;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<xy0.d, xy0.c> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<xy0.e.a> state;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.g<xy0.e.b> sideEffects;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222228e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222228e;
            if (i15 == 0) {
                oq.u.b(obj);
                lh0.e eVar = n0.this.getAllQualityMeasurementPointsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f222228e = 1;
                obj = eVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n0 n0Var = n0.this;
            if (iVar instanceof dx.i.Left) {
                n0Var.d9(new xy0.c.Error((dx.b) ((dx.i.Left) iVar).b()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                n0Var.d9(new xy0.c.AwaitForMap(new InitializedModel((List) ((dx.i.Right) iVar).b(), null, false, false, kh0.l.UNKNOWN)));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxy0/c$v;", "<unused var>", "Lk10/c0;", "Lxy0/d$b$b;", "state", "Lk10/l;", "Lxy0/d;", "<anonymous>", "(Lxy0/c$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<xy0.c.v, k10.c0<xy0.d.b.MapDisplaying>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f222230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222231f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222232g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.MapDisplaying O(k10.c0 c0Var, boolean z15, boolean z16, xy0.d.b.MapDisplaying mapDisplaying) {
            return mapDisplaying.b(InitializedModel.b(((xy0.d.b.MapDisplaying) c0Var.a()).getInitializedModel(), null, null, z15, z16, null, 19, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15;
            final k10.c0 c0Var = (k10.c0) this.f222232g;
            Object objE = uq.b.e();
            int i15 = this.f222231f;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z15 = this.f222230e;
                    oq.u.b(obj);
                }
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return c0Var.b(new er.l() { // from class: xy0.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n0.a0.O(c0Var, zBooleanValue, z15, (d.b.MapDisplaying) obj2);
                    }
                });
            }
            oq.u.b(obj);
            i14.a aVar = n0.this.checkGpsPermissionGrantedUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f222232g = c0Var;
            this.f222231f = 1;
            obj = aVar.c(c1792a, this);
            if (obj != objE) {
            }
            return objE;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            i14.d dVar = n0.this.isGpsEnabledUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f222232g = c0Var;
            this.f222230e = zBooleanValue2;
            this.f222231f = 2;
            Object objC = dVar.c(c1792a2, this);
            if (objC != objE) {
                z15 = zBooleanValue2;
                obj = objC;
                final boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                return c0Var.b(new er.l() { // from class: xy0.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n0.a0.O(c0Var, zBooleanValue3, z15, (d.b.MapDisplaying) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.v vVar, k10.c0<xy0.d.b.MapDisplaying> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            a0 a0Var = n0.this.new a0(eVar);
            a0Var.f222232g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f222235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222236f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222238h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222236f = obj;
            this.f222238h |= PKIFailureInfo.systemUnavail;
            return n0.this.W9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$m;", "<unused var>", "Lxy0/d$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$m;Lxy0/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<xy0.c.m, xy0.d.b.MapDisplaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222240f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.d.b.MapDisplaying mapDisplaying = (xy0.d.b.MapDisplaying) this.f222240f;
            Object objE = uq.b.e();
            int i15 = this.f222239e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f222240f = vq.j.a(mapDisplaying);
                this.f222239e = 1;
                if (n0Var.W9(mapDisplaying, this) == objE) {
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
        public final Object w(xy0.c.m mVar, xy0.d.b.MapDisplaying mapDisplaying, tq.e<? super oq.i0> eVar) {
            b0 b0Var = n0.this.new b0(eVar);
            b0Var.f222240f = mapDisplaying;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222243e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222245g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222243e = obj;
            this.f222245g |= PKIFailureInfo.systemUnavail;
            return n0.this.X9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxy0/d$b$c;", "it", "Loq/i0;", "<anonymous>", "(Lxy0/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.p<xy0.d.b.RequestingPermissions, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222246e;

        c0(tq.e<? super c0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f222246e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.d9(xy0.c.q.f222141a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(xy0.d.b.RequestingPermissions requestingPermissions, tq.e<? super oq.i0> eVar) {
            return ((c0) v(requestingPermissions, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return n0.this.new c0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<xy0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f222248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f222249b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f222250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f222251b;

            /* JADX INFO: renamed from: xy0.n0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5942a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f222252d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f222253e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f222254f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f222256h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f222257j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f222258k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f222259l;

                public C5942a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f222252d = obj;
                    this.f222253e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n0 n0Var) {
                this.f222250a = hVar;
                this.f222251b = n0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5942a c5942a;
                if (eVar instanceof C5942a) {
                    c5942a = (C5942a) eVar;
                    int i15 = c5942a.f222253e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5942a.f222253e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5942a = new C5942a(eVar);
                    }
                } else {
                    c5942a = new C5942a(eVar);
                }
                Object obj2 = c5942a.f222252d;
                Object objE = uq.b.e();
                int i16 = c5942a.f222253e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f222250a;
                    xy0.e.a aVarS9 = this.f222251b.S9((xy0.d) obj);
                    c5942a.f222254f = vq.j.a(obj);
                    c5942a.f222256h = vq.j.a(c5942a);
                    c5942a.f222257j = vq.j.a(obj);
                    c5942a.f222258k = vq.j.a(hVar);
                    c5942a.f222259l = 0;
                    c5942a.f222253e = 1;
                    if (hVar.F(aVarS9, c5942a) == objE) {
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

        public d(mu.g gVar, n0 n0Var) {
            this.f222248a = gVar;
            this.f222249b = n0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super xy0.e.a> hVar, tq.e eVar) {
            Object objA = this.f222248a.a(new a(hVar, this.f222249b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$q;", "<unused var>", "Lxy0/d$b$c;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$q;Lxy0/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<xy0.c.q, xy0.d.b.RequestingPermissions, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222261f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.d.b.RequestingPermissions requestingPermissions = (xy0.d.b.RequestingPermissions) this.f222261f;
            Object objE = uq.b.e();
            int i15 = this.f222260e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f222261f = vq.j.a(requestingPermissions);
                this.f222260e = 1;
                if (n0Var.X9(requestingPermissions, this) == objE) {
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
        public final Object w(xy0.c.q qVar, xy0.d.b.RequestingPermissions requestingPermissions, tq.e<? super oq.i0> eVar) {
            d0 d0Var = n0.this.new d0(eVar);
            d0Var.f222261f = requestingPermissions;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$j;", "action", "Lxy0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$j;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xy0.c.HandlePointClick, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222264f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.HandlePointClick handlePointClick = (xy0.c.HandlePointClick) this.f222264f;
            uq.b.e();
            if (this.f222263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.O9(handlePointClick.getItem());
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.HandlePointClick handlePointClick, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = n0.this.new e(eVar);
            eVar2.f222264f = handlePointClick;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$m;", "<unused var>", "Lxy0/d$b$c;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$m;Lxy0/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<xy0.c.m, xy0.d.b.RequestingPermissions, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222267f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.d.b.RequestingPermissions requestingPermissions = (xy0.d.b.RequestingPermissions) this.f222267f;
            Object objE = uq.b.e();
            int i15 = this.f222266e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f222267f = vq.j.a(requestingPermissions);
                this.f222266e = 1;
                if (n0Var.W9(requestingPermissions, this) == objE) {
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
        public final Object w(xy0.c.m mVar, xy0.d.b.RequestingPermissions requestingPermissions, tq.e<? super oq.i0> eVar) {
            e0 e0Var = n0.this.new e0(eVar);
            e0Var.f222267f = requestingPermissions;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$p;", "action", "Lxy0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$p;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xy0.c.OpenPointDetails, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222270f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.OpenPointDetails openPointDetails = (xy0.c.OpenPointDetails) this.f222270f;
            Object objE = uq.b.e();
            int i15 = this.f222269e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.ToPointDetails toPointDetails = new xy0.c.n.ToPointDetails(new PointDetailsEntryPointData(openPointDetails.getId(), ez0.a.MAP));
                this.f222270f = vq.j.a(openPointDetails);
                this.f222269e = 1;
                if (bVarY1.F(toPointDetails, this) == objE) {
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
        public final Object w(xy0.c.OpenPointDetails openPointDetails, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            f fVar = n0.this.new f(eVar);
            fVar.f222270f = openPointDetails;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvy/d;", "event", "Lxy0/d$b$d;", "state", "Loq/i0;", "<anonymous>", "(Lvy/d;Lxy0/d$b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<vy.d, xy0.d.b.ZoomingToUser, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222274g;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(n0 n0Var, xy0.d.b.ZoomingToUser zoomingToUser, vy.d dVar) {
            n0Var.d9(new xy0.c.DisplayMap(InitializedModel.b(zoomingToUser.getInitializedModel(), null, ((vy.d.Acquired) dVar).getCoordinates(), false, false, null, 29, null)));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vy.d dVar = (vy.d) this.f222273f;
            final xy0.d.b.ZoomingToUser zoomingToUser = (xy0.d.b.ZoomingToUser) this.f222274g;
            uq.b.e();
            if (this.f222272e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(dVar, vy.d.c.f208684a)) {
                n0.this.d9(new xy0.c.ShowSnackBar(n0.this.labelProvider.c(zx0.b.U)));
            } else if (fr.t.c(dVar, vy.d.b.f208683a) || fr.t.c(dVar, vy.d.C5485d.f208685a)) {
                n0.this.B0();
                n0.this.d9(new xy0.c.DisplayMap(zoomingToUser.getInitializedModel()));
            } else {
                if (!(dVar instanceof vy.d.Acquired)) {
                    throw new oq.p();
                }
                n0.this.B0();
                n0 n0Var = n0.this;
                vy.d.Acquired acquired = (vy.d.Acquired) dVar;
                Coordinates coordinates = new Coordinates(acquired.getCoordinates().getLatitude(), acquired.getCoordinates().getLongitude());
                xy0.c.MoveCamera.a aVar = xy0.c.MoveCamera.a.USER;
                final n0 n0Var2 = n0.this;
                n0Var.d9(new xy0.c.MoveCamera(coordinates, aVar, new er.a() { // from class: xy0.u0
                    @Override // er.a
                    public final Object a() {
                        return n0.f0.O(n0Var2, zoomingToUser, dVar);
                    }
                }));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vy.d dVar, xy0.d.b.ZoomingToUser zoomingToUser, tq.e<? super oq.i0> eVar) {
            f0 f0Var = n0.this.new f0(eVar);
            f0Var.f222273f = dVar;
            f0Var.f222274g = zoomingToUser;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$b;", "<unused var>", "Lxy0/d;", "Loq/i0;", "<anonymous>", "(Lxy0/c$b;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xy0.c.b, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222276e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222276e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.a aVar = xy0.c.n.a.f222130a;
                this.f222276e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(xy0.c.b bVar, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$c;", "<unused var>", "Lxy0/d;", "Loq/i0;", "<anonymous>", "(Lxy0/c$c;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xy0.c.C5936c, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222278e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222278e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.b bVar = xy0.c.n.b.f222131a;
                this.f222278e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(xy0.c.C5936c c5936c, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$t;", "action", "Lxy0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$t;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xy0.c.ShowSnackBar, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222281f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.ShowSnackBar showSnackBar = (xy0.c.ShowSnackBar) this.f222281f;
            uq.b.e();
            if (this.f222280e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.ShowSnackBar showSnackBar, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            i iVar = n0.this.new i(eVar);
            iVar.f222281f = showSnackBar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$g;", "<unused var>", "Lxy0/d;", "Loq/i0;", "<anonymous>", "(Lxy0/c$g;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<xy0.c.g, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222283e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222283e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.d dVar = xy0.c.n.d.f222133a;
                this.f222283e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(xy0.c.g gVar, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxy0/c$d;", "action", "Lk10/c0;", "Lxy0/d;", "state", "Lk10/l;", "<anonymous>", "(Lxy0/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xy0.c.DisplayMap, k10.c0<xy0.d>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222287g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.MapDisplaying O(xy0.c.DisplayMap displayMap, xy0.d dVar) {
            return new xy0.d.b.MapDisplaying(displayMap.getInitializedModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xy0.c.DisplayMap displayMap = (xy0.c.DisplayMap) this.f222286f;
            k10.c0 c0Var = (k10.c0) this.f222287g;
            uq.b.e();
            if (this.f222285e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xy0.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.k.O(displayMap, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.DisplayMap displayMap, k10.c0<xy0.d> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f222286f = displayMap;
            kVar.f222287g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxy0/c$w;", "action", "Lk10/c0;", "Lxy0/d;", "state", "Lk10/l;", "<anonymous>", "(Lxy0/c$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<xy0.c.ZoomToUser, k10.c0<xy0.d>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222290g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.ZoomingToUser O(xy0.c.ZoomToUser zoomToUser, xy0.d dVar) {
            return new xy0.d.b.ZoomingToUser(zoomToUser.getInitializedModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xy0.c.ZoomToUser zoomToUser = (xy0.c.ZoomToUser) this.f222289f;
            k10.c0 c0Var = (k10.c0) this.f222290g;
            uq.b.e();
            if (this.f222288e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xy0.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.l.O(zoomToUser, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.ZoomToUser zoomToUser, k10.c0<xy0.d> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f222289f = zoomToUser;
            lVar.f222290g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxy0/c$r;", "action", "Lk10/c0;", "Lxy0/d;", "state", "Lk10/l;", "<anonymous>", "(Lxy0/c$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<xy0.c.RequestPermissions, k10.c0<xy0.d>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222293g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.RequestingPermissions O(xy0.c.RequestPermissions requestPermissions, xy0.d dVar) {
            return new xy0.d.b.RequestingPermissions(requestPermissions.getInitializedModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xy0.c.RequestPermissions requestPermissions = (xy0.c.RequestPermissions) this.f222292f;
            k10.c0 c0Var = (k10.c0) this.f222293g;
            uq.b.e();
            if (this.f222291e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xy0.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.m.O(requestPermissions, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.RequestPermissions requestPermissions, k10.c0<xy0.d> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f222292f = requestPermissions;
            mVar.f222293g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$e;", "action", "Lxy0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$e;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<xy0.c.Error, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222295f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.Error error = (xy0.c.Error) this.f222295f;
            Object objE = uq.b.e();
            int i15 = this.f222294e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.Error error2 = new xy0.c.n.Error(n0.this.Q9(error.getDomainError()));
                this.f222295f = vq.j.a(error);
                this.f222294e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(xy0.c.Error error, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            n nVar = n0.this.new n(eVar);
            nVar.f222295f = error;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$f;", "<unused var>", "Lxy0/d;", "Loq/i0;", "<anonymous>", "(Lxy0/c$f;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<xy0.c.f, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222297e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222297e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f222297e = 1;
                if (n0Var.N9(this) == objE) {
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
        public final Object w(xy0.c.f fVar, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxy0/d$a;", "it", "Loq/i0;", "<anonymous>", "(Lxy0/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<xy0.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222299e;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f222299e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.d9(xy0.c.f.f222115a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(xy0.d.a aVar, tq.e<? super oq.i0> eVar) {
            return ((p) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return n0.this.new p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxy0/c$a;", "action", "Lk10/c0;", "Lxy0/d$a;", "state", "Lk10/l;", "Lxy0/d;", "<anonymous>", "(Lxy0/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<xy0.c.AwaitForMap, k10.c0<xy0.d.a>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222303g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.AwaitingMapReady O(xy0.c.AwaitForMap awaitForMap, xy0.d.a aVar) {
            return new xy0.d.b.AwaitingMapReady(awaitForMap.getInitializedModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xy0.c.AwaitForMap awaitForMap = (xy0.c.AwaitForMap) this.f222302f;
            k10.c0 c0Var = (k10.c0) this.f222303g;
            uq.b.e();
            if (this.f222301e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xy0.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.q.O(awaitForMap, (d.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.AwaitForMap awaitForMap, k10.c0<xy0.d.a> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            q qVar = new q(eVar);
            qVar.f222302f = awaitForMap;
            qVar.f222303g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$i;", "<unused var>", "Lxy0/d;", "Loq/i0;", "<anonymous>", "(Lxy0/c$i;Lxy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<xy0.c.i, xy0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222304e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f222304e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = n0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            n0 n0Var = n0.this;
            if (iVarA instanceof dx.i.Left) {
                n0Var.d9(new xy0.c.ShowSnackBar(n0Var.labelProvider.c(zx0.b.f238255h0)));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.i iVar, xy0.d dVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$u;", "<unused var>", "Lxy0/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$u;Lxy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<xy0.c.u, xy0.d.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222307f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.d.b bVar = (xy0.d.b) this.f222307f;
            Object objE = uq.b.e();
            int i15 = this.f222306e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.ToSearch toSearch = new xy0.c.n.ToSearch(bVar.getInitializedModel().c());
                this.f222307f = vq.j.a(bVar);
                this.f222306e = 1;
                if (bVarY1.F(toSearch, this) == objE) {
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
        public final Object w(xy0.c.u uVar, xy0.d.b bVar, tq.e<? super oq.i0> eVar) {
            s sVar = n0.this.new s(eVar);
            sVar.f222307f = bVar;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$o;", "action", "Lxy0/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$o;Lxy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<xy0.c.OpenGpsDialog, xy0.d.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222310f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.OpenGpsDialog openGpsDialog = (xy0.c.OpenGpsDialog) this.f222310f;
            Object objE = uq.b.e();
            int i15 = this.f222309e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<xy0.c.n> bVarY1 = n0.this.Y1();
                xy0.c.n.OpenGpsDialog openGpsDialog2 = new xy0.c.n.OpenGpsDialog(n0.this.mapDialogMapper.b(new yy0.e.Params(openGpsDialog.getDialogType(), openGpsDialog.b())));
                this.f222310f = vq.j.a(openGpsDialog);
                this.f222309e = 1;
                if (bVarY1.F(openGpsDialog2, this) == objE) {
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
        public final Object w(xy0.c.OpenGpsDialog openGpsDialog, xy0.d.b bVar, tq.e<? super oq.i0> eVar) {
            t tVar = n0.this.new t(eVar);
            tVar.f222310f = openGpsDialog;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxy0/c$h;", "<unused var>", "Lxy0/d$b;", "Loq/i0;", "<anonymous>", "(Lxy0/c$h;Lxy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<xy0.c.h, xy0.d.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222312e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (r5.c(r1, r4) == r0) goto L18;
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
                int r1 = r4.f222312e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L55
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
                xy0.n0 r5 = xy0.n0.this
                i14.d r5 = xy0.n0.G9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f222312e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L54
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L44
                xy0.n0 r5 = xy0.n0.this
                xy0.c$m r0 = xy0.c.m.f222129a
                xy0.n0.w9(r5, r0)
                oq.i0 r5 = oq.i0.f148189a
                goto L55
            L44:
                xy0.n0 r5 = xy0.n0.this
                a14.n r5 = xy0.n0.B9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f222312e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L55
            L54:
                return r0
            L55:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xy0.n0.u.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.h hVar, xy0.d.b bVar, tq.e<? super oq.i0> eVar) {
            return n0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$l;", "action", "Lxy0/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxy0/c$l;Lxy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<xy0.c.MoveCamera, xy0.d.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222315f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f222317a;

            static {
                int[] iArr = new int[xy0.c.MoveCamera.a.values().length];
                try {
                    iArr[xy0.c.MoveCamera.a.POINT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[xy0.c.MoveCamera.a.USER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f222317a = iArr;
            }
        }

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.e.b.MoveCamera.EnumC5941a enumC5941a;
            xy0.c.MoveCamera moveCamera = (xy0.c.MoveCamera) this.f222315f;
            Object objE = uq.b.e();
            int i15 = this.f222314e;
            if (i15 == 0) {
                oq.u.b(obj);
                lu.g gVar = n0.this._sideEffects;
                LatLng latLngJa = n0.this.ja(moveCamera.getCoordinates());
                int i16 = a.f222317a[moveCamera.getType().ordinal()];
                if (i16 == 1) {
                    enumC5941a = xy0.e.b.MoveCamera.EnumC5941a.POINT;
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    enumC5941a = xy0.e.b.MoveCamera.EnumC5941a.USER;
                }
                xy0.e.b.MoveCamera moveCamera2 = new xy0.e.b.MoveCamera(latLngJa, enumC5941a, moveCamera.b());
                this.f222315f = vq.j.a(moveCamera);
                this.f222314e = 1;
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
        public final Object w(xy0.c.MoveCamera moveCamera, xy0.d.b bVar, tq.e<? super oq.i0> eVar) {
            v vVar = n0.this.new v(eVar);
            vVar.f222315f = moveCamera;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$k;", "<unused var>", "Lxy0/d$b$a;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$k;Lxy0/d$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<xy0.c.k, xy0.d.b.AwaitingMapReady, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222319f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.d.b.AwaitingMapReady awaitingMapReady = (xy0.d.b.AwaitingMapReady) this.f222319f;
            uq.b.e();
            if (this.f222318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (awaitingMapReady.getInitializedModel().c().isEmpty()) {
                n0.this.d9(new xy0.c.DisplayMap(awaitingMapReady.getInitializedModel()));
            } else {
                n0.this.d9(new xy0.c.RequestPermissions(awaitingMapReady.getInitializedModel()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.k kVar, xy0.d.b.AwaitingMapReady awaitingMapReady, tq.e<? super oq.i0> eVar) {
            w wVar = n0.this.new w(eVar);
            wVar.f222319f = awaitingMapReady;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ldx/i;", "Ldx/b;", "Lvy/c;", "response", "Lk10/c0;", "Lxy0/d$b$b;", "state", "Lk10/l;", "Lxy0/d;", "<anonymous>", "(Ldx/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<dx.i<? extends dx.b, ? extends Coordinates>, k10.c0<xy0.d.b.MapDisplaying>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222323g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f222322f;
            k10.c0 c0Var = (k10.c0) this.f222323g;
            uq.b.e();
            if (this.f222321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return n0.this.ka(c0Var, iVar);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, Coordinates> iVar, k10.c0<xy0.d.b.MapDisplaying> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            x xVar = n0.this.new x(eVar);
            xVar.f222322f = iVar;
            xVar.f222323g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isGpsActive", "Lk10/c0;", "Lxy0/d$b$b;", "state", "Lk10/l;", "Lxy0/d;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<Boolean, k10.c0<xy0.d.b.MapDisplaying>, tq.e<? super k10.l<? extends xy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f222326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222327g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xy0.d.b.MapDisplaying O(k10.c0 c0Var, boolean z15, xy0.d.b.MapDisplaying mapDisplaying) {
            return mapDisplaying.b(InitializedModel.b(((xy0.d.b.MapDisplaying) c0Var.a()).getInitializedModel(), null, null, z15, false, null, 27, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f222326f;
            final k10.c0 c0Var = (k10.c0) this.f222327g;
            uq.b.e();
            if (this.f222325e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xy0.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.y.O(c0Var, z15, (d.b.MapDisplaying) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<xy0.d.b.MapDisplaying> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            y yVar = new y(eVar);
            yVar.f222326f = z15;
            yVar.f222327g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<xy0.d.b.MapDisplaying> c0Var, tq.e<? super k10.l<? extends xy0.d>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxy0/c$s;", "action", "Lxy0/d$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lxy0/c$s;Lxy0/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<xy0.c.Setup, xy0.d.b.MapDisplaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f222330g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xy0.c.Setup setup = (xy0.c.Setup) this.f222329f;
            xy0.d.b.MapDisplaying mapDisplaying = (xy0.d.b.MapDisplaying) this.f222330g;
            uq.b.e();
            if (this.f222328e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (mapDisplaying.getInitializedModel().getOpenedPointQuality() != kh0.l.UNKNOWN && mapDisplaying.getInitializedModel().getOpenedPointQuality() != setup.getQualityRate()) {
                n0.this.d9(xy0.c.f.f222115a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xy0.c.Setup setup, xy0.d.b.MapDisplaying mapDisplaying, tq.e<? super oq.i0> eVar) {
            z zVar = n0.this.new z(eVar);
            zVar.f222329f = setup;
            zVar.f222330g = mapDisplaying;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public n0(yy.a aVar, yy0.g gVar, i14.b bVar, i14.d dVar, i14.a aVar2, i14.e eVar, ac4.a aVar3, lh0.e eVar2, a14.n nVar, i70.e eVar3, ib4.c cVar, uy.d dVar2, mx.c cVar2, yy0.e eVar4, a14.m mVar, e14.e eVar5, kh0.l lVar) {
        this.mapScreenMapper = gVar;
        this.getGpsCurrentStatus = bVar;
        this.isGpsEnabledUseCase = dVar;
        this.checkGpsPermissionGrantedUseCase = aVar2;
        this.requestPreciseLocationUseCase = eVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.getAllQualityMeasurementPointsUC = eVar2;
        this.goToDeviceLocationSettingsUseCase = nVar;
        this.globalSnackBarManager = eVar3;
        this.genericDomainErrorMapper = cVar;
        this.gpsManager = dVar2;
        this.labelProvider = cVar2;
        this.mapDialogMapper = eVar4;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.getCurrentLocationUC = eVar5;
        this.bEQualityRate = lVar;
        xy0.d.a aVar4 = xy0.d.a.f222150a;
        this.initialState = aVar4;
        lu.g<xy0.e.b> gVarB = lu.j.b(0, null, null, 7, null);
        this._sideEffects = gVarB;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: xy0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.Z9(this.f222155a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), S9(aVar4));
        this.sideEffects = mu.i.W(gVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N9(tq.e<? super oq.i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9(final PointPinItem item) {
        B0();
        d9(new xy0.c.MoveCamera(new Coordinates(item.getItemPosition().f31423a, item.getItemPosition().f31424b), xy0.c.MoveCamera.a.POINT, new er.a() { // from class: xy0.b0
            @Override // er.a
            public final Object a() {
                return n0.P9(item, this);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(PointPinItem pointPinItem, n0 n0Var) {
        if (pointPinItem.getQuality() != kh0.l.UNKNOWN) {
            n0Var.d9(new xy0.c.OpenPointDetails(pointPinItem.getId(), pointPinItem.getQuality()));
        } else {
            n0Var.d9(new xy0.c.ShowSnackBar(n0Var.labelProvider.c(zx0.b.H)));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b Q9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: xy0.y
            @Override // er.l
            public final Object b(Object obj) {
                return n0.R9(this.f222391a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(n0 n0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            n0Var.d9(xy0.c.C5936c.f222112a);
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            n0Var.d9(xy0.c.f.f222115a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xy0.e.a S9(xy0.d state) {
        return this.mapScreenMapper.b(new yy0.g.Params(state, new er.l() { // from class: xy0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.T9(this.f222196a, (PointPinItem) obj);
            }
        }, b9(xy0.c.b.f222111a), b9(xy0.c.g.f222116a), b9(xy0.c.m.f222129a), new er.a() { // from class: xy0.l0
            @Override // er.a
            public final Object a() {
                return n0.U9(this.f222199a);
            }
        }, new er.a() { // from class: xy0.m0
            @Override // er.a
            public final Object a() {
                return n0.V9(this.f222204a);
            }
        }, b9(xy0.c.u.f222145a), b9(xy0.c.k.f222120a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(n0 n0Var, PointPinItem pointPinItem) {
        n0Var.d9(new xy0.c.HandlePointClick(pointPinItem));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(n0 n0Var) {
        n0Var.gpsManager.a();
        n0Var.d9(xy0.c.v.f222146a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(n0 n0Var) {
        n0Var.gpsManager.e();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object W9(xy0.d.b bVar, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar2;
        xy0.d.b bVar3;
        xy0.d.b bVar4;
        boolean z15;
        boolean zBooleanValue;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f222238h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f222238h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object objC = bVar2.f222236f;
        Object objE = uq.b.e();
        int i16 = bVar2.f222238h;
        if (i16 == 0) {
            oq.u.b(objC);
            i14.a aVar = this.checkGpsPermissionGrantedUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar2.f222234d = bVar;
            bVar2.f222238h = 1;
            objC = aVar.c(c1792a, bVar2);
            if (objC != objE) {
                bVar3 = bVar;
            }
            return objE;
        }
        if (i16 == 1) {
            bVar3 = (xy0.d.b) bVar2.f222234d;
            oq.u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z16 = bVar2.f222235e;
            bVar4 = (xy0.d.b) bVar2.f222234d;
            oq.u.b(objC);
            z15 = z16;
        }
        zBooleanValue = ((Boolean) objC).booleanValue();
        if (!zBooleanValue) {
            d9(new xy0.c.ZoomToUser(InitializedModel.b(bVar4.getInitializedModel(), null, null, zBooleanValue, z15, null, 19, null)));
            return oq.i0.f148189a;
        }
        d9(new xy0.c.OpenGpsDialog(zy0.b.GPS_DISABLED_DIALOG, b9(xy0.c.h.f222117a)));
        d9(new xy0.c.DisplayMap(InitializedModel.b(bVar4.getInitializedModel(), null, null, zBooleanValue, z15, null, 19, null)));
        return oq.i0.f148189a;
        boolean zBooleanValue2 = ((Boolean) objC).booleanValue();
        if (!zBooleanValue2) {
            d9(new xy0.c.OpenGpsDialog(zy0.b.GPS_PERMISSION_DIALOG, b9(xy0.c.i.f222118a)));
            d9(new xy0.c.DisplayMap(InitializedModel.b(bVar3.getInitializedModel(), null, null, false, zBooleanValue2, null, 23, null)));
            return oq.i0.f148189a;
        }
        i14.d dVar = this.isGpsEnabledUseCase;
        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
        bVar2.f222234d = bVar3;
        bVar2.f222235e = zBooleanValue2;
        bVar2.f222238h = 2;
        objC = dVar.c(c1792a2, bVar2);
        if (objC != objE) {
            bVar4 = bVar3;
            z15 = zBooleanValue2;
            zBooleanValue = ((Boolean) objC).booleanValue();
            if (!zBooleanValue) {
                d9(new xy0.c.ZoomToUser(InitializedModel.b(bVar4.getInitializedModel(), null, null, zBooleanValue, z15, null, 19, null)));
                return oq.i0.f148189a;
            }
            d9(new xy0.c.OpenGpsDialog(zy0.b.GPS_DISABLED_DIALOG, b9(xy0.c.h.f222117a)));
            d9(new xy0.c.DisplayMap(InitializedModel.b(bVar4.getInitializedModel(), null, null, zBooleanValue, z15, null, 19, null)));
            return oq.i0.f148189a;
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X9(xy0.d.b.RequestingPermissions requestingPermissions, tq.e<? super oq.i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f222245g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f222245g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f222243e;
        Object objE = uq.b.e();
        int i16 = cVar.f222245g;
        if (i16 == 0) {
            oq.u.b(objC);
            i14.e eVar2 = this.requestPreciseLocationUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f222242d = requestingPermissions;
            cVar.f222245g = 1;
            objC = eVar2.c(c1792a, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestingPermissions = (xy0.d.b.RequestingPermissions) cVar.f222242d;
            oq.u.b(objC);
        }
        x04.a aVar = (x04.a) objC;
        if (fr.t.c(aVar, x04.a.C5758a.f216293a)) {
            d9(xy0.c.m.f222129a);
        } else {
            if (!fr.t.c(aVar, x04.a.b.f216294a)) {
                throw new oq.p();
            }
            d9(new xy0.c.DisplayMap(InitializedModel.b(requestingPermissions.getInitializedModel(), null, null, false, false, null, 23, null)));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(final n0 n0Var, k10.v vVar) {
        vVar.c(fr.q0.c(xy0.d.class), new er.l() { // from class: xy0.x
            @Override // er.l
            public final Object b(Object obj) {
                return n0.aa(this.f222389a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.a.class), new er.l() { // from class: xy0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ba(this.f222177a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.b.class), new er.l() { // from class: xy0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ca(this.f222182a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.b.AwaitingMapReady.class), new er.l() { // from class: xy0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.da(this.f222184a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.b.MapDisplaying.class), new er.l() { // from class: xy0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ea(this.f222187a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.b.RequestingPermissions.class), new er.l() { // from class: xy0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ha(this.f222191a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(xy0.d.b.ZoomingToUser.class), new er.l() { // from class: xy0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ia(this.f222193a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(n0 n0Var, k10.z zVar) {
        g gVar = n0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xy0.c.b.class), oVar, gVar);
        zVar.x(fr.q0.c(xy0.c.C5936c.class), oVar, n0Var.new h(null));
        zVar.x(fr.q0.c(xy0.c.ShowSnackBar.class), oVar, n0Var.new i(null));
        zVar.x(fr.q0.c(xy0.c.g.class), oVar, n0Var.new j(null));
        zVar.v(fr.q0.c(xy0.c.DisplayMap.class), oVar, new k(null));
        zVar.v(fr.q0.c(xy0.c.ZoomToUser.class), oVar, new l(null));
        zVar.v(fr.q0.c(xy0.c.RequestPermissions.class), oVar, new m(null));
        zVar.x(fr.q0.c(xy0.c.Error.class), oVar, n0Var.new n(null));
        zVar.x(fr.q0.c(xy0.c.f.class), oVar, n0Var.new o(null));
        zVar.x(fr.q0.c(xy0.c.HandlePointClick.class), oVar, n0Var.new e(null));
        zVar.x(fr.q0.c(xy0.c.OpenPointDetails.class), oVar, n0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(n0 n0Var, k10.z zVar) {
        zVar.C(n0Var.new p(null));
        q qVar = new q(null);
        zVar.v(fr.q0.c(xy0.c.AwaitForMap.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(n0 n0Var, k10.z zVar) {
        r rVar = n0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xy0.c.i.class), oVar, rVar);
        zVar.x(fr.q0.c(xy0.c.u.class), oVar, n0Var.new s(null));
        zVar.x(fr.q0.c(xy0.c.OpenGpsDialog.class), oVar, n0Var.new t(null));
        zVar.x(fr.q0.c(xy0.c.h.class), oVar, n0Var.new u(null));
        zVar.x(fr.q0.c(xy0.c.MoveCamera.class), oVar, n0Var.new v(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(n0 n0Var, k10.z zVar) {
        w wVar = n0Var.new w(null);
        zVar.x(fr.q0.c(xy0.c.k.class), k10.o.CANCEL_PREVIOUS, wVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(final n0 n0Var, k10.z zVar) {
        zVar.L(new er.l() { // from class: xy0.z
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(n0.fa((d.b.MapDisplaying) obj));
            }
        }, new er.l() { // from class: xy0.a0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ga(this.f222105a, (k10.m) obj);
            }
        });
        k10.k.m(zVar, mu.i.p((mu.g) n0Var.getGpsCurrentStatus.a(gz.b.a.C1792a.f78542a)), null, new y(null), 2, null);
        z zVar2 = n0Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xy0.c.Setup.class), oVar, zVar2);
        zVar.v(fr.q0.c(xy0.c.v.class), oVar, n0Var.new a0(null));
        zVar.x(fr.q0.c(xy0.c.m.class), oVar, n0Var.new b0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fa(xy0.d.b.MapDisplaying mapDisplaying) {
        return mapDisplaying.getInitializedModel().getIsGpsPermissionGranted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(n0 n0Var, k10.m mVar) {
        k10.k.m(mVar, n0Var.gpsManager.g(), null, n0Var.new x(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(n0 n0Var, k10.z zVar) {
        zVar.C(n0Var.new c0(null));
        d0 d0Var = n0Var.new d0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(xy0.c.q.class), oVar, d0Var);
        zVar.x(fr.q0.c(xy0.c.m.class), oVar, n0Var.new e0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(n0 n0Var, k10.z zVar) {
        k10.k.s(zVar, (mu.g) n0Var.getCurrentLocationUC.a(gz.b.a.C1792a.f78542a), null, n0Var.new f0(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LatLng ja(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<xy0.d.b.MapDisplaying> ka(final k10.c0<xy0.d.b.MapDisplaying> state, final dx.i<? extends dx.b, Coordinates> response) {
        if (response instanceof dx.i.Right) {
            return state.b(new er.l() { // from class: xy0.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return n0.la(state, response, (d.b.MapDisplaying) obj);
                }
            });
        }
        if (response instanceof dx.i.Left) {
            return state.c();
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xy0.d.b.MapDisplaying la(k10.c0 c0Var, dx.i iVar, xy0.d.b.MapDisplaying mapDisplaying) {
        dx.i.Right right = (dx.i.Right) iVar;
        return mapDisplaying.b(InitializedModel.b(((xy0.d.b.MapDisplaying) c0Var.a()).getInitializedModel(), null, new Coordinates(((Coordinates) right.b()).getLatitude(), ((Coordinates) right.b()).getLongitude()), false, false, null, 29, null));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // xy0.e
    public mu.g<xy0.e.b> T8() {
        return this.sideEffects;
    }

    @Override // zx.b
    public xw.b<xy0.c.n> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Y9, reason: merged with bridge method [inline-methods] */
    public void P5(kh0.l data) {
        d9(new xy0.c.Setup(data));
    }

    @Override // l00.g
    protected k10.t<xy0.d, xy0.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<xy0.e.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
