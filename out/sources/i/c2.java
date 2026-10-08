package i;

import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Li/c2;", "Lm/d;", "<init>", "()V", "Lh/v;", "cameraId", "Lh/q;", "cameraError", "", "willAttemptRetry", "Loq/i0;", "a", "(Ljava/lang/String;IZ)V", "Li/g4;", "virtualCameraState", "b", "(Ljava/lang/String;Li/g4;)V", "", "Ljava/lang/Object;", "lock", "", "Ljava/util/Map;", "virtualCameraStateMap", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 implements m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<h.v, g4> virtualCameraStateMap = new LinkedHashMap();

    @Override // m.d
    public void a(String cameraId, int cameraError, boolean willAttemptRetry) {
        g4 g4Var;
        synchronized (this.lock) {
            g4Var = this.virtualCameraStateMap.get(h.v.a(cameraId));
        }
        if (g4Var == null) {
            return;
        }
        g4Var.getGraphListener().d(new h.t0.a(cameraError, willAttemptRetry, null));
    }

    public final void b(String cameraId, g4 virtualCameraState) {
        synchronized (this.lock) {
            this.virtualCameraStateMap.put(h.v.a(cameraId), virtualCameraState);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }
}
