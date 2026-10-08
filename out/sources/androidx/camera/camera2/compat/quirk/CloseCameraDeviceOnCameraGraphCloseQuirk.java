package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import b.e;
import fr.k;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Lv/c3;", "<init>", "()V", "", "isExtensions", "h", "(Z)Z", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f9119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f9120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f9121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f9123g;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk$a;", "", "<init>", "()V", "", "a", "()Z", "isSamsungExynos7570Device", "Z", "isSamsungExynos7870Device", "isXiaomiProblematicDevice", "isSonyProblematicDevice", "isSamsungProblematicDevice", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a() {
            if (CloseCameraDeviceOnCameraGraphCloseQuirk.f9119c || CloseCameraDeviceOnCameraGraphCloseQuirk.f9120d) {
                return true;
            }
            int i15 = Build.VERSION.SDK_INT;
            if (30 <= i15 && i15 < 34) {
                e eVar = e.f15545a;
                if (eVar.k() || eVar.j() || eVar.n()) {
                    return true;
                }
            }
            return e.f15545a.t() || CloseCameraDeviceOnCameraGraphCloseQuirk.f9121e || CloseCameraDeviceOnCameraGraphCloseQuirk.f9123g || CloseCameraDeviceOnCameraGraphCloseQuirk.f9122f;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d A[EDGE_INSN: B:21:0x007d->B:22:0x007e BREAK  A[LOOP:0: B:16:0x0067->B:33:?]] */
    static {
        boolean z15;
        int i15;
        String str = Build.HARDWARE;
        f9119c = t.c(str, "samsungexynos7570");
        f9120d = t.c(str, "samsungexynos7870");
        e eVar = e.f15545a;
        boolean z16 = false;
        f9121e = eVar.u() && n.f0(new String[]{"aurora", "houji"}, Build.DEVICE.toLowerCase(Locale.ROOT));
        if (!eVar.q()) {
            z15 = false;
            break;
        }
        List listQ = v.q("XQ-DQ", "SO", "A301SO");
        if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
            Iterator it = listQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                } else if (r.T(Build.DEVICE, (String) it.next(), true)) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        f9122f = z15;
        if (e.f15545a.p() && (i15 = Build.VERSION.SDK_INT) >= 31 && i15 <= 34) {
            z16 = true;
        }
        f9123g = z16;
    }

    public final boolean h(boolean isExtensions) {
        if (f9121e) {
            return isExtensions;
        }
        if (!f9123g || f9119c || f9120d) {
            return true;
        }
        return isExtensions;
    }
}
