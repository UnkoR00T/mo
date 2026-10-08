package i;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Li/m0;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "d", "(Lh/x;)Z", "", "b", "(Lh/x;)I", "c", "format", "Landroid/util/Size;", "surfaceSize", "Landroid/hardware/camera2/params/OutputConfiguration;", "e", "(ILandroid/util/Size;)Landroid/hardware/camera2/params/OutputConfiguration;", "sessionType", "", "outputs", "Landroid/hardware/camera2/params/SessionConfiguration;", "f", "(ILjava/util/List;)Landroid/hardware/camera2/params/SessionConfiguration;", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "a", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f87258a = new m0();

    private m0() {
    }

    public static final List<CameraCharacteristics.Key<?>> a(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final int b(h.x cameraMetadata) {
        Integer num = (Integer) cameraMetadata.J(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final int c(h.x cameraMetadata) {
        Integer num = (Integer) cameraMetadata.J(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean d(h.x cameraMetadata) {
        Integer num = (Integer) cameraMetadata.J(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return num != null && num.intValue() > 1;
    }

    public static final OutputConfiguration e(int format, Size surfaceSize) {
        return i0.a(format, surfaceSize);
    }

    public static final SessionConfiguration f(int sessionType, List<OutputConfiguration> outputs) {
        return j0.a(sessionType, outputs);
    }
}
