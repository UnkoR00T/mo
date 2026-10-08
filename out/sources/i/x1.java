package i;

import android.hardware.camera2.CameraDevice;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Li/x1;", "", "Li/m2;", "cameraDeviceWrapper", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Li/g;", "androidCameraState", "Li/n0;", "audioRestrictionController", "", "shouldReopenCamera", "shouldCreateEmptyCaptureSession", "Loq/i0;", "b", "(Li/m2;Landroid/hardware/camera2/CameraDevice;Li/g;Li/n0;ZZ)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x1 {
    static /* synthetic */ void a(x1 x1Var, m2 m2Var, CameraDevice cameraDevice, g gVar, n0 n0Var, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeCamera");
        }
        if ((i15 & 1) != 0) {
            m2Var = null;
        }
        if ((i15 & 2) != 0) {
            cameraDevice = null;
        }
        if ((i15 & 16) != 0) {
            z15 = false;
        }
        if ((i15 & 32) != 0) {
            z16 = false;
        }
        x1Var.b(m2Var, cameraDevice, gVar, n0Var, z15, z16);
    }

    void b(m2 cameraDeviceWrapper, CameraDevice cameraDevice, g androidCameraState, n0 audioRestrictionController, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession);
}
