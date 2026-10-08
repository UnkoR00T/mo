package j;

import android.hardware.camera2.CameraCharacteristics;
import h.g1;
import java.util.List;
import ju.CoroutineName;
import ju.d2;
import ju.z2;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj/n0;", "", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010%\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020#H\u0007¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lj/n0$a;", "", "<init>", "()V", "Lk/z;", "threads", "Lju/d2;", "cameraPipeJob", "Lju/p0;", "a", "(Lk/z;Lju/d2;)Lju/p0;", "Lh/s$b;", "graphConfig", "Ll/q;", "listener3A", "Lm/l;", "frameDistributor", "", "Lh/g1$a;", "c", "(Lh/s$b;Ll/q;Lm/l;)Ljava/util/List;", "Ll/x;", "streamGraphImpl", "Lnq/a;", "Lh/n;", "cameraController", "Lh/e0;", "cameraSurfaceManager", "Ll/y;", "d", "(Ll/x;Lnq/a;Lh/e0;)Ll/y;", "Lm/i;", "frameCaptureQueue", "Lh/x;", "cameraMetadata", "Lk/v;", "systemClockOffsets", "b", "(Ll/x;Lm/i;Lh/x;Lk/v;)Lm/l;", "e", "()Lk/v;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final ju.p0 a(k.z threads, d2 cameraPipeJob) {
            return ju.q0.a(z2.a(cameraPipeJob).n0(threads.getLightweightDispatcher().n0(new CoroutineName("CXCP-Graph"))));
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        public final m.l b(StreamGraph streamGraphImpl, m.i frameCaptureQueue, h.x cameraMetadata, k.v systemClockOffsets) {
            boolean z15;
            Integer num = (Integer) cameraMetadata.J(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
            if (num != null) {
                z15 = num.intValue() == 1;
            }
            return new m.l(streamGraphImpl, frameCaptureQueue, z15, systemClockOffsets.getRealtimeNsToMonotonicNs());
        }

        public final List<g1.a> c(h.s.b graphConfig, l.q listener3A, m.l frameDistributor) {
            List<g1.a> listT = pq.v.t(listener3A);
            listT.add(listener3A);
            listT.add(frameDistributor);
            listT.addAll(graphConfig.e());
            return listT;
        }

        public final l.y d(StreamGraph streamGraphImpl, nq.a<h.n> cameraController, h.e0 cameraSurfaceManager) {
            return new l.y(streamGraphImpl, cameraController, cameraSurfaceManager, streamGraphImpl.N());
        }

        public final k.v e() {
            return k.v.INSTANCE.a();
        }

        private Companion() {
        }
    }
}
