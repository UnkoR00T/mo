package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import b.e;
import fr.k;
import fu.r;
import java.util.List;
import java.util.Locale;
import p071kotlin.Metadata;
import pq.v;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;", "Lv/c3;", "<init>", "()V", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class InvalidVideoProfilesQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f9167c = v.q("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f9168d = v.q("cph2417", "cph2451");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f9169e = v.q("cph2437", "cph2525", "pht110");

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk$a;", "", "<init>", "()V", "", "i", "()Z", "g", "j", "b", "d", "h", "c", "e", "f", "n", "l", "m", "a", "k", "", "", "AFFECTED_PIXEL_MODELS", "Ljava/util/List;", "AFFECTED_ONE_PLUS_MODELS", "AFFECTED_OPPO_MODELS", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final boolean a() {
            return Build.VERSION.SDK_INT == 33;
        }

        private final boolean b() {
            return c() && a();
        }

        private final boolean c() {
            return InvalidVideoProfilesQuirk.f9168d.contains(Build.MODEL.toLowerCase(Locale.ROOT));
        }

        private final boolean d() {
            return e() && a();
        }

        private final boolean e() {
            return InvalidVideoProfilesQuirk.f9169e.contains(Build.MODEL.toLowerCase(Locale.ROOT));
        }

        private final boolean f() {
            return n() || l();
        }

        private final boolean g() {
            return h() && f();
        }

        private final boolean h() {
            return InvalidVideoProfilesQuirk.f9167c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
        }

        private final boolean i() {
            return e.f15545a.p() && n();
        }

        private final boolean j() {
            e eVar = e.f15545a;
            if (eVar.u() || eVar.o()) {
                return m() || n();
            }
            return false;
        }

        private final boolean l() {
            return r.T(Build.ID, "TD1A", true);
        }

        private final boolean m() {
            return r.T(Build.ID, "TKQ1", true);
        }

        private final boolean n() {
            return r.T(Build.ID, "TP1A", true);
        }

        public final boolean k() {
            return i() || g() || j() || d() || b();
        }

        private Companion() {
        }
    }
}
