package j;

import h.p1;
import h.s1;
import l.GraphProcessor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj/j0;", "", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j.j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj/j0$a;", "", "<init>", "()V", "Lh/h;", "cameraBackends", "Lh/s$b;", "graphConfig", "Lh/m;", "cameraContext", "Lh/e;", "a", "(Lh/h;Lh/s$b;Lh/m;)Lh/e;", "cameraBackend", "Lh/x;", "c", "(Lh/s$b;Lh/e;)Lh/x;", "Lh/u;", "graphId", "Ll/l;", "graphProcessor", "Lh/p1;", "streamGraph", "Lh/s1;", "surfaceTracker", "Lh/n;", "b", "(Lh/u;Lh/s$b;Lh/e;Lh/m;Ll/l;Lh/p1;Lh/s1;)Lh/n;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final h.e a(h.h cameraBackends, h.s.b graphConfig, h.m cameraContext) {
            h.f customCameraBackend = graphConfig.getCustomCameraBackend();
            if (customCameraBackend != null) {
                return customCameraBackend.a(cameraContext);
            }
            String cameraBackendId = graphConfig.getCameraBackendId();
            if (cameraBackendId == null) {
                return cameraBackends.getDefault();
            }
            h.e eVarA = cameraBackends.a(cameraBackendId);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalStateException(("Failed to initialize " + ((Object) h.g.f(cameraBackendId)) + " from " + graphConfig).toString());
        }

        public final h.n b(h.u graphId, h.s.b graphConfig, h.e cameraBackend, h.m cameraContext, GraphProcessor graphProcessor, p1 streamGraph, s1 surfaceTracker) {
            return cameraBackend.i(cameraContext, graphId, graphConfig, graphProcessor, streamGraph, surfaceTracker);
        }

        public final h.x c(h.s.b graphConfig, h.e cameraBackend) {
            h.x xVarA = cameraBackend.a(graphConfig.getCamera());
            if (xVarA != null) {
                return xVarA;
            }
            throw new IllegalStateException(("Failed to load metadata for " + ((Object) h.v.f(graphConfig.getCamera())) + '!').toString());
        }

        private Companion() {
        }
    }
}
