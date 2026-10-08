package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import fr.k;
import h.x;
import java.util.List;
import java.util.Locale;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;", "Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;", "<init>", "()V", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f9158c = v.q("itel w6004", "sm-j700m");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f9159d = v.q("sm-j700f", "sm-j710f");

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "a", "(Lh/x;)Z", "", "", "BUILD_MODELS", "Ljava/util/List;", "BUILD_MODELS_FRONT_CAMERA", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(x cameraMetadata) {
            Integer num;
            List list = ImageCaptureFlashNotFireQuirk.f9159d;
            String str = Build.MODEL;
            Locale locale = Locale.ROOT;
            return (list.contains(str.toLowerCase(locale)) && (num = (Integer) cameraMetadata.J(CameraCharacteristics.LENS_FACING)) != null && num.intValue() == 0) || ImageCaptureFlashNotFireQuirk.f9158c.contains(str.toLowerCase(locale));
        }

        private Companion() {
        }
    }
}
