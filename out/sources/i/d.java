package i;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li/d;", "Li/c;", "Li/l2;", "Li/m2;", "device", "Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;", "session", "Lm/d;", "cameraErrorListener", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Li/m2;Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Lm/d;Landroid/os/Handler;)V", "Landroid/hardware/camera2/CaptureRequest;", "request", "", "G1", "(Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "f", "Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends c implements l2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CameraConstrainedHighSpeedCaptureSession session;

    public d(m2 m2Var, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, m.d dVar, Handler handler) {
        super(m2Var, cameraConstrainedHighSpeedCaptureSession, dVar, handler);
        this.session = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // i.l2
    public List<CaptureRequest> G1(CaptureRequest request) {
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("CXCP#createHighSpeedRequestList");
                return this.session.createHighSpeedRequestList(request);
            } finally {
                Trace.endSection();
            }
        } catch (IllegalArgumentException unused) {
            if (!k.k.f107055a.d()) {
                return null;
            }
            io.sentry.android.core.c2.g("CXCP", "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was destroyed before calling createHighSpeedRequestList.");
            return null;
        } catch (IllegalStateException unused2) {
            if (!k.k.f107055a.d()) {
                return null;
            }
            io.sentry.android.core.c2.g("CXCP", "Failed to createHighSpeedRequestList. " + getDevice() + " may be closed.");
            return null;
        } catch (UnsupportedOperationException unused3) {
            if (!k.k.f107055a.d()) {
                return null;
            }
            io.sentry.android.core.c2.g("CXCP", "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was not available.");
            return null;
        }
    }

    @Override // i.c, h.t1
    public <T> T c0(mr.c<T> type) {
        return fr.t.c(type, fr.q0.c(CameraConstrainedHighSpeedCaptureSession.class)) ? (T) this.session : (T) super.c0(type);
    }
}
