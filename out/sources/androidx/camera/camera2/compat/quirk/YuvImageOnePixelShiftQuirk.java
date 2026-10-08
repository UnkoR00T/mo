package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import b.e;
import fr.k;
import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;", "Landroidx/camera/core/internal/compat/quirk/OnePixelShiftQuirk;", "<init>", "()V", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk$a;", "", "<init>", "()V", "", "b", "()Z", "d", "f", "e", "c", "g", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final boolean b() {
            return e.f15545a.h() && r.G("MotoG3", Build.MODEL, true);
        }

        private final boolean c() {
            return e.f15545a.p() && r.G("SM-A920F", Build.MODEL, true);
        }

        private final boolean d() {
            return e.f15545a.p() && r.G("SM-G532F", Build.MODEL, true);
        }

        private final boolean e() {
            return e.f15545a.p() && r.G("SM-J415F", Build.MODEL, true);
        }

        private final boolean f() {
            return e.f15545a.p() && r.G("SM-J700F", Build.MODEL, true);
        }

        private final boolean g() {
            return e.f15545a.u() && r.G("Mi A1", Build.MODEL, true);
        }

        public final boolean a() {
            return b() || d() || f() || c() || e() || g();
        }

        private Companion() {
        }
    }
}
