package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import b.e;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import fr.k;
import fr.t;
import fu.r;
import java.util.List;
import java.util.Locale;
import o.e1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p071kotlin.Metadata;
import pq.v;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "Lv/c3;", "<init>", "()V", "", "cameraId", "", "imageFormat", "", "Landroid/util/Size;", "f", "(Ljava/lang/String;I)Ljava/util/List;", "g", "Ljava/lang/Class;", "klass", "d", "(Ljava/lang/String;ILjava/lang/Class;)Ljava/util/List;", "k", "j", "h", "i", "(I)Ljava/util/List;", "e", "l", "c", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class ExcludedSupportedSizesQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk$a;", "", "<init>", "()V", "", "a", "()Z", "d", "isOnePlus6", "e", "isOnePlus6T", "b", "isHuaweiP20Lite", "i", "isSamsungJ7PrimeApi27Above", "h", "isSamsungJ7Api27Above", "f", "isRedmiNote9Pro", "g", "isSamsungA05s", "c", "isNokia7Plus", "j", "isSamsungZFold4", "", "TAG", "Ljava/lang/String;", "", "UNKNOWN_IMAGE_FORMAT", "I", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a() {
            return d() || e() || b() || i() || h() || f() || g() || c() || j();
        }

        public final boolean b() {
            return e.f15545a.e() && r.G("HWANE", Build.DEVICE, true);
        }

        public final boolean c() {
            if (!e.f15545a.i()) {
                return false;
            }
            String str = Build.DEVICE;
            return r.G("B2N", str, true) || r.G("B2N_sprout", str, true);
        }

        public final boolean d() {
            return e.f15545a.j() && r.G("OnePlus6", Build.DEVICE, true);
        }

        public final boolean e() {
            return e.f15545a.j() && r.G("OnePlus6T", Build.DEVICE, true);
        }

        public final boolean f() {
            return e.f15545a.o() && r.G("joyeuse", Build.DEVICE, true);
        }

        public final boolean g() {
            return e.f15545a.p() && r.G("a05s", Build.DEVICE, true) && r.d0(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false, 2, null);
        }

        public final boolean h() {
            return e.f15545a.p() && r.G("J7XELTE", Build.DEVICE, true) && Build.VERSION.SDK_INT >= 27;
        }

        public final boolean i() {
            return e.f15545a.p() && r.G("ON7XELTE", Build.DEVICE, true) && Build.VERSION.SDK_INT >= 27;
        }

        public final boolean j() {
            if (!e.f15545a.p()) {
                return false;
            }
            String str = Build.DEVICE;
            return r.G("q4q", str, true) || r.G("SCG16", str, true) || r.G("SC-55C", str, true);
        }

        private Companion() {
        }
    }

    private final List<Size> d(String cameraId, int imageFormat, Class<?> klass) {
        return (t.c(cameraId, d.f37012h1) && (imageFormat == 34 || imageFormat == 35 || klass != null)) ? v.q(new Size(720, 720), new Size(400, 400)) : v.n();
    }

    private final List<Size> e(int imageFormat) {
        return imageFormat == 35 ? v.q(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448)) : v.n();
    }

    private final List<Size> f(String cameraId, int imageFormat) {
        return (t.c(cameraId, d.f37012h1) && imageFormat == 256) ? v.q(new Size(4160, 3120), new Size(4000, 3000)) : v.n();
    }

    private final List<Size> g(String cameraId, int imageFormat) {
        return (t.c(cameraId, d.f37012h1) && imageFormat == 256) ? v.q(new Size(4160, 3120), new Size(4000, 3000)) : v.n();
    }

    private final List<Size> h(String cameraId, int imageFormat) {
        return (t.c(cameraId, d.f37012h1) && imageFormat == 256) ? v.e(new Size(9280, 6944)) : v.n();
    }

    private final List<Size> i(int imageFormat) {
        return imageFormat == 35 ? v.q(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440)) : v.n();
    }

    private final List<Size> j(String cameraId, int imageFormat, Class<?> klass) {
        if (t.c(cameraId, d.f37012h1)) {
            if (imageFormat == 34 || klass != null) {
                return v.q(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
            }
            if (imageFormat == 35) {
                return v.q(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
            }
        } else if (t.c(cameraId, "1") && (imageFormat == 34 || imageFormat == 35 || klass != null)) {
            return v.q(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
        }
        return v.n();
    }

    private final List<Size> k(String cameraId, int imageFormat, Class<?> klass) {
        if (t.c(cameraId, d.f37012h1)) {
            if (imageFormat == 34 || klass != null) {
                return v.q(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
            }
            if (imageFormat == 35) {
                return v.q(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
            }
        } else if (t.c(cameraId, "1") && (imageFormat == 34 || imageFormat == 35 || klass != null)) {
            return v.q(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
        }
        return v.n();
    }

    private final List<Size> l(String cameraId, int imageFormat) {
        return (t.c(cameraId, "1") && imageFormat == 35) ? v.q(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(NewHope.SENDA_BYTES, 712)) : v.n();
    }

    public final List<Size> c(String cameraId, int imageFormat) {
        Companion companion = INSTANCE;
        if (companion.d()) {
            return f(cameraId, imageFormat);
        }
        if (companion.e()) {
            return g(cameraId, imageFormat);
        }
        if (companion.b()) {
            return d(cameraId, imageFormat, null);
        }
        if (companion.i()) {
            return k(cameraId, imageFormat, null);
        }
        if (companion.h()) {
            return j(cameraId, imageFormat, null);
        }
        if (companion.f()) {
            return h(cameraId, imageFormat);
        }
        if (companion.g()) {
            return i(imageFormat);
        }
        if (companion.c()) {
            return e(imageFormat);
        }
        if (companion.j()) {
            return l(cameraId, imageFormat);
        }
        e1.o("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return v.n();
    }
}
