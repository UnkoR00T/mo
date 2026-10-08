package i;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/hardware/camera2/CameraDevice;", "Loq/i0;", "a", "(Landroid/hardware/camera2/CameraDevice;)V", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n2 {
    public static final void a(CameraDevice cameraDevice) {
        if (cameraDevice != null) {
            if (k.k.f107055a.c()) {
                cameraDevice.getId();
            }
            k.h hVar = k.h.f107050a;
            String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
            long jA = hVar.g().a();
            try {
                Trace.beginSection(str);
                try {
                    cameraDevice.close();
                } catch (NullPointerException e15) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.h("CXCP", "NPE encountered during CameraDevice.close()", e15);
                    }
                }
                oq.i0 i0Var = oq.i0.f148189a;
                Trace.endSection();
                long jC = k.i.c(hVar.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                }
            } catch (Throwable th4) {
                Trace.endSection();
                long jC2 = k.i.c(hVar.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var2 = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
                }
                throw th4;
            }
        }
    }
}
