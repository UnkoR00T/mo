package PRN;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import e.g1;
import h.t1;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.l2;
import p071kotlin.Metadata;
import v.g3;
import v.w1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001;Ba\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*H\u0016¢\u0006\u0004\b/\u0010-J\u001f\u00105\u001a\u0002042\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001fH\u0016¢\u0006\u0004\b9\u0010!J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0:H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\bB\u0010AJ)\u0010G\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010D*\u00020C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0017¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001fH\u0016¢\u0006\u0004\bI\u0010!J\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020M0:H\u0016¢\u0006\u0004\bN\u0010<J\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020RH\u0016¢\u0006\u0004\bU\u0010TJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0:H\u0016¢\u0006\u0004\bV\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010[R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010^R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010_R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010dR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR!\u0010l\u001a\b\u0012\u0004\u0012\u00020h0g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010<R\u001b\u0010n\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010j\u001a\u0004\bm\u0010TR!\u0010u\u001a\u00020o8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\bp\u0010j\u0012\u0004\bs\u0010t\u001a\u0004\bq\u0010r¨\u0006w"}, d2 = {"LPRN/k;", "Lv/m0;", "Lh/t1;", "Le/b0;", "cameraProperties", "Ld/m;", "cameraConfig", "LPRN/o;", "cameraStateAdapter", "LPRN/b;", "cameraControlStateAdapter", "Le/v;", "cameraCallbackMap", "Le/g1;", "focusMeteringControl", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "Lv/w1;", "encoderProfilesProvider", "La/u;", "streamConfigurationMapCompat", "Lf/j;", "intrinsicZoomCalculator", "Lb0/m;", "streamSpecsCalculator", "<init>", "(Le/b0;Ld/m;LPRN/o;LPRN/b;Le/v;Le/g1;Landroidx/camera/camera2/compat/quirk/a;Lv/w1;La/u;Lf/j;Lb0/m;)V", "", "lensFacingInt", "e0", "(I)I", "", "i", "()Ljava/lang/String;", "n", "()I", "Landroid/hardware/camera2/CameraCharacteristics;", "Y", "()Landroid/hardware/camera2/CameraCharacteristics;", "g", "relativeRotation", "A", "Landroidx/lifecycle/y;", "Lo/l2;", ip.a.f96138c, "()Landroidx/lifecycle/y;", "Lo/t;", "d", "Ljava/util/concurrent/Executor;", "executor", "Lv/s;", "callback", "Loq/i0;", "B", "(Ljava/util/concurrent/Executor;Lv/s;)V", "F", "(Lv/s;)V", "f", "", "a", "()Ljava/util/Set;", "format", "", "Landroid/util/Size;", "t", "(I)Ljava/util/List;", "o", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "toString", "Lv/g3;", "s", "()Lv/g3;", "Lo/i0;", "c", "Landroid/graphics/Rect;", "k", "()Landroid/graphics/Rect;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()Z", "w", "v", "Le/b0;", "b", "Ld/m;", "LPRN/o;", "LPRN/b;", "e", "Le/v;", "Le/g1;", "Landroidx/camera/camera2/compat/quirk/a;", "h", "Lv/w1;", "j", "La/u;", "Lf/j;", "l", "Lb0/m;", "", "Lo/q;", "m", "Loq/k;", "get_physicalCameraInfos", "_physicalCameraInfos", "f0", "isLegacyDevice", "Lg/b;", "p", "X", "()Lg/b;", "getCamera2CameraInfo$camera_camera2$annotations", "()V", "camera2CameraInfo", "q", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements v.m0, t1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e.b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d.m cameraConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o cameraStateAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b cameraControlStateAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e.v cameraCallbackMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g1 focusMeteringControl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.a cameraQuirks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final w1 encoderProfilesProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a.u streamConfigurationMapCompat;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f.j intrinsicZoomCalculator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final b0.m streamSpecsCalculator;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k _physicalCameraInfos;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oq.k isLegacyDevice;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oq.k camera2CameraInfo;

    /* JADX INFO: renamed from: PRN.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u0001*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LPRN/k$a;", "", "<init>", "()V", "T", "Lo/q;", "Lmr/c;", "type", "b", "(Lo/q;Lmr/c;)Ljava/lang/Object;", "Lh/v;", "a", "(Lo/q;)Ljava/lang/String;", "cameraId", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final String a(o.q qVar) {
            h.x xVar = (h.x) b(qVar, fr.q0.c(h.x.class));
            if (xVar != null) {
                return xVar.getCamera();
            }
            return null;
        }

        public final <T> T b(o.q qVar, mr.c<T> cVar) {
            if (qVar instanceof t1) {
                return (T) ((t1) qVar).c0(cVar);
            }
            if (qVar instanceof v.m0) {
                v.m0 m0Var = (v.m0) qVar;
                if (m0Var.x() != qVar) {
                    return (T) b(m0Var.x(), cVar);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public k(e.b0 b0Var, d.m mVar, o oVar, b bVar, e.v vVar, g1 g1Var, androidx.camera.camera2.compat.quirk.a aVar, w1 w1Var, a.u uVar, f.j jVar, b0.m mVar2) {
        this.cameraProperties = b0Var;
        this.cameraConfig = mVar;
        this.cameraStateAdapter = oVar;
        this.cameraControlStateAdapter = bVar;
        this.cameraCallbackMap = vVar;
        this.focusMeteringControl = g1Var;
        this.cameraQuirks = aVar;
        this.encoderProfilesProvider = w1Var;
        this.streamConfigurationMapCompat = uVar;
        this.intrinsicZoomCalculator = jVar;
        this.streamSpecsCalculator = mVar2;
        e.y0.f46464a.a(b0Var);
        this._physicalCameraInfos = oq.l.a(new er.a() { // from class: PRN.h
            @Override // er.a
            public final Object a() {
                return k.U(this.f661a);
            }
        });
        this.isLegacyDevice = oq.l.a(new er.a() { // from class: PRN.i
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(k.g0(this.f665a));
            }
        });
        this.camera2CameraInfo = oq.l.a(new er.a() { // from class: PRN.j
            @Override // er.a
            public final Object a() {
                return k.W(this.f667a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set U(k kVar) {
        Set<h.v> setZ = kVar.cameraProperties.getMetadata().Z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = setZ.iterator();
        while (it.hasNext()) {
            String value = ((h.v) it.next()).getValue();
            linkedHashSet.add(new j0(new e.a0(new d.m(value, null), kVar.cameraProperties.getMetadata().O(value))));
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.b W(k kVar) {
        return g.b.INSTANCE.a(kVar.cameraProperties);
    }

    private final int e0(int lensFacingInt) {
        if (lensFacingInt == 0) {
            return 0;
        }
        int i15 = 1;
        if (lensFacingInt != 1) {
            i15 = 2;
            if (lensFacingInt != 2) {
                e.c cVar = e.c.f45719a;
                if (!o.e1.k("CXCP")) {
                    return -1;
                }
                c2.g(e.c.TRUNCATED_TAG, "Unrecognized lens facing: " + lensFacingInt + '!');
                return -1;
            }
        }
        return i15;
    }

    private final boolean f0() {
        return ((Boolean) this.isLegacyDevice.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g0(k kVar) {
        return h.x.INSTANCE.l(kVar.cameraProperties.getMetadata());
    }

    @Override // o.q
    public int A(int relativeRotation) {
        return y.c.a(y.c.b(relativeRotation), ((Number) this.cameraProperties.getMetadata().J(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == n());
    }

    @Override // v.m0
    public void B(Executor executor, v.s callback) {
        this.cameraCallbackMap.w(callback, executor);
    }

    @Override // o.q
    public androidx.p016lifecycle.y<l2> D() {
        return this.cameraControlStateAdapter.a();
    }

    @Override // v.m0
    public void F(v.s callback) {
        this.cameraCallbackMap.e0(callback);
    }

    @Override // v.m0
    public boolean P() {
        return h.x.INSTANCE.g(this.cameraProperties.getMetadata());
    }

    public final g.b X() {
        return (g.b) this.camera2CameraInfo.getValue();
    }

    @Override // v.m0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public CameraCharacteristics q() {
        return (CameraCharacteristics) this.cameraProperties.getMetadata().c0(fr.q0.c(CameraCharacteristics.class));
    }

    @Override // v.m0
    public Set<Integer> a() {
        Set<Integer> setB1;
        Integer[] numArrD = this.streamConfigurationMapCompat.d();
        return (numArrD == null || (setB1 = pq.n.B1(numArrD)) == null) ? pq.e1.e() : setB1;
    }

    @Override // v.m0
    public Set<o.i0> c() {
        return a.m.INSTANCE.a(this.cameraProperties.getMetadata()).b();
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(g.b.class))) {
            return (T) X();
        }
        if (fr.t.c(type, fr.q0.c(e.b0.class))) {
            return (T) this.cameraProperties;
        }
        return fr.t.c(type, fr.q0.c(h.x.class)) ? (T) this.cameraProperties.getMetadata() : (T) this.cameraProperties.getMetadata().c0(type);
    }

    @Override // o.q
    public androidx.p016lifecycle.y<o.t> d() {
        return this.cameraStateAdapter.f();
    }

    @Override // o.q
    public String f() {
        return f0() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // o.q
    public int g() {
        return A(0);
    }

    @Override // v.m0
    public String i() {
        return this.cameraConfig.getCameraId();
    }

    @Override // v.m0
    public Rect k() {
        Rect rect = (Rect) this.cameraProperties.getMetadata().J(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return (fr.t.c("robolectric", Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : rect;
    }

    @Override // o.q
    public int n() {
        return e0(((Number) this.cameraProperties.getMetadata().J(CameraCharacteristics.LENS_FACING)).intValue());
    }

    @Override // v.m0
    public List<Size> o(int format) {
        List<Size> listN1;
        Size[] sizeArrA = this.streamConfigurationMapCompat.a(format);
        return (sizeArrA == null || (listN1 = pq.n.n1(sizeArrA)) == null) ? pq.v.n() : listN1;
    }

    @Override // v.m0
    public g3 s() {
        return this.cameraQuirks.b();
    }

    @Override // v.m0
    public List<Size> t(int format) {
        List<Size> listN1;
        Size[] sizeArrF = this.streamConfigurationMapCompat.f(format);
        return (sizeArrF == null || (listN1 = pq.n.n1(sizeArrF)) == null) ? pq.v.n() : listN1;
    }

    public String toString() {
        return "CameraInfoAdapter<" + this.cameraConfig + ".cameraId>";
    }

    @Override // v.m0
    public Set<Integer> v() {
        Set<Integer> setA1;
        int[] iArr = (int[]) this.cameraProperties.getMetadata().J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        return (iArr == null || (setA1 = pq.n.A1(iArr)) == null) ? pq.e1.e() : setA1;
    }

    @Override // v.m0
    public boolean w() {
        int[] iArr = (int[]) this.cameraProperties.getMetadata().J(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && pq.n.d0(iArr, 1);
    }
}
