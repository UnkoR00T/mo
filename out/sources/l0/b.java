package l0;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraDevice.CameraDeviceSetup f113940a;

    b(CameraManager cameraManager, String str) {
        this.f113940a = cameraManager.getCameraDeviceSetup(str);
    }

    public static long b() {
        String property = System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return Long.parseLong(property) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // l0.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        return new d.a(this.f113940a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, b());
    }
}
