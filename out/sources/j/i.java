package j;

import android.hardware.camera2.CameraManager;
import i.l1;
import ju.CoroutineName;
import ju.d2;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj/i;", "", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj/i$a;", "", "<init>", "()V", "Lk/z;", "threads", "Lju/d2;", "cameraPipeJob", "Lju/p0;", "b", "(Lk/z;Lju/d2;)Lju/p0;", "Lnq/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lh/s$b;", "graphConfig", "Lm/h;", "a", "(Lnq/a;Lk/z;Lh/s$b;Lju/d2;)Lm/h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final m.h a(nq.a<CameraManager> cameraManager, k.z threads, h.s.b graphConfig, d2 cameraPipeJob) {
            return new l1(cameraManager, threads, graphConfig.getCamera(), cameraPipeJob, null);
        }

        public final ju.p0 b(k.z threads, d2 cameraPipeJob) {
            return ju.q0.a(z2.a(cameraPipeJob).n0(threads.getLightweightDispatcher().n0(new CoroutineName("CXCP-Camera2Controller"))));
        }

        private Companion() {
        }
    }
}
