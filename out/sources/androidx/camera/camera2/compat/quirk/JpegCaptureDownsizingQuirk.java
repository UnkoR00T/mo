package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import h.x;
import java.util.Locale;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;", "Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "c", "(Lh/x;)Z", "", "", "Ljava/util/Set;", "KNOWN_AFFECTED_FRONT_CAMERA_DEVICES", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JpegCaptureDownsizingQuirk f9170b = new JpegCaptureDownsizingQuirk();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> KNOWN_AFFECTED_FRONT_CAMERA_DEVICES = e1.d("redmi note 8 pro");

    private JpegCaptureDownsizingQuirk() {
    }

    public final boolean c(x cameraMetadata) {
        Integer num;
        return KNOWN_AFFECTED_FRONT_CAMERA_DEVICES.contains(Build.MODEL.toLowerCase(Locale.ROOT)) && (num = (Integer) cameraMetadata.J(CameraCharacteristics.LENS_FACING)) != null && num.intValue() == 0;
    }
}
