package i;

import android.graphics.ColorSpace;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Li/h0;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "extensionCharacteristics", "", "extension", "", "b", "(Landroid/hardware/camera2/CameraExtensionCharacteristics;I)Z", "a", "Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionSessionConfiguration", "Landroid/hardware/camera2/params/OutputConfiguration;", "postviewOutputConfiguration", "Loq/i0;", "e", "(Landroid/hardware/camera2/params/ExtensionSessionConfiguration;Landroid/hardware/camera2/params/OutputConfiguration;)V", "Lh/x;", "cameraMetadata", "c", "(Lh/x;)Z", "Landroid/hardware/camera2/params/SessionConfiguration;", "sessionConfiguration", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "d", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/graphics/ColorSpace$Named;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f87161a = new h0();

    private h0() {
    }

    public static final boolean a(CameraExtensionCharacteristics extensionCharacteristics, int extension) {
        return extensionCharacteristics.isCaptureProcessProgressAvailable(extension);
    }

    public static final boolean b(CameraExtensionCharacteristics extensionCharacteristics, int extension) {
        return extensionCharacteristics.isPostviewAvailable(extension);
    }

    public static final boolean c(h.x cameraMetadata) {
        int[] iArr = (int[]) cameraMetadata.J(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
        return iArr != null && pq.n.d0(iArr, 1);
    }

    public static final void d(SessionConfiguration sessionConfiguration, ColorSpace.Named colorSpace) {
        sessionConfiguration.setColorSpace(colorSpace);
    }

    public static final void e(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration postviewOutputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(postviewOutputConfiguration);
    }
}
