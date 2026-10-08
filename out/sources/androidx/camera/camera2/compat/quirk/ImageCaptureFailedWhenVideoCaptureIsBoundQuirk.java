package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import b.e;
import fr.k;
import fu.r;
import p071kotlin.Metadata;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "", "<init>", "()V", "", "b", "()Z", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk$a;", "", "<init>", "()V", "", "f", "()Z", "e", "isBluStudioX10", "g", "isItelW6004", "m", "isVivo1805", "j", "isPositivoTwist2Pro", "i", "isPixel4XLApi29", "h", "isMotoE13", "l", "isSamsungTabA8", "k", "isSamsungA53", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e() {
            return e.f15545a.b() && r.G("studio x10", Build.MODEL, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g() {
            return e.f15545a.f() && r.G("itel w6004", Build.MODEL, true);
        }

        private final boolean h() {
            return e.f15545a.h() && r.G("moto e13", Build.MODEL, true);
        }

        private final boolean i() {
            return r.G("pixel 4 xl", Build.MODEL, true) && Build.VERSION.SDK_INT == 29;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j() {
            return e.f15545a.m() && r.G("twist 2 pro", Build.MODEL, true);
        }

        private final boolean k() {
            return e.f15545a.p() && r.V(Build.MODEL, "SM-A536", false, 2, null);
        }

        private final boolean l() {
            if (!e.f15545a.p()) {
                return false;
            }
            String str = Build.DEVICE;
            return r.G("gta8", str, true) || r.G("gta8wifi", str, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return e.f15545a.t() && r.G("vivo 1805", Build.MODEL, true);
        }

        public final boolean f() {
            return e() || g() || m() || j() || i() || h() || l() || k() || e.f15545a.s();
        }

        private Companion() {
        }
    }

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public boolean b() {
        Companion companion = INSTANCE;
        return companion.e() || companion.g() || companion.m() || companion.j();
    }
}
