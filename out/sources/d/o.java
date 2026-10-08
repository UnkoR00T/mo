package d;

import PRN.d1;
import PRN.x0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import e.u0;
import e.u2;
import h.l0;
import io.sentry.android.core.c2;
import java.util.concurrent.Executor;
import ju.CoroutineName;
import ju.q0;
import ju.v1;
import ju.z2;
import o.e1;
import p071kotlin.Metadata;
import v.i1;
import v.w1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld/o;", "", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020(2\b\b\u0001\u0010%\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ld/o$a;", "", "<init>", "()V", "Ld/m;", "cameraConfig", "Lv/i1;", "cameraThreadConfig", "Le/u2;", "f", "(Ld/m;Lv/i1;)Le/u2;", "La/h;", "compat", "threads", "Le/u0;", "requestListener", "Lg/a;", "a", "(La/h;Le/u2;Le/u0;)Lg/a;", "Lh/z;", "cameraPipe", "config", "Lh/x;", "c", "(Lh/z;Ld/m;)Lh/x;", "", "b", "(Ld/m;)Ljava/lang/String;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "e", "(Lh/x;)Landroid/hardware/camera2/params/StreamConfigurationMap;", "Le/b0;", "cameraProperties", "LPRN/x0;", "g", "(Le/b0;)LPRN/x0;", "cameraIdString", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "Lv/w1;", "d", "(Ljava/lang/String;Landroidx/camera/camera2/compat/quirk/a;)Lv/w1;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final g.a a(a.h compat, u2 threads, u0 requestListener) {
            return g.a.INSTANCE.a(compat, threads, requestListener);
        }

        public final String b(m config) {
            return config.getCameraId();
        }

        public final h.x c(h.z cameraPipe, m config) {
            try {
                return h.p.h(cameraPipe.a(), config.getCameraId(), null, 2, null);
            } catch (l0 unused) {
                e.c cVar = e.c.f45719a;
                if (e1.g("CXCP")) {
                    c2.e(e.c.TRUNCATED_TAG, "Failed to inject camera metadata: Do Not Disturb mode is on.");
                }
                return null;
            }
        }

        public final w1 d(String cameraIdString, androidx.camera.camera2.compat.quirk.a cameraQuirks) {
            return new PRN.b0(cameraIdString, cameraQuirks.b());
        }

        public final StreamConfigurationMap e(h.x cameraMetadata) {
            if (cameraMetadata != null) {
                return (StreamConfigurationMap) cameraMetadata.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            return null;
        }

        public final u2 f(m cameraConfig, i1 cameraThreadConfig) {
            Executor executorB = cameraThreadConfig.b();
            ju.l0 l0VarB = v1.b(cameraThreadConfig.b());
            return new u2(q0.a(z2.b(null, 1, null).n0(l0VarB).n0(new CoroutineName("CXCP-UseCase-" + cameraConfig.getCameraId()))), executorB, l0VarB);
        }

        public final x0 g(e.b0 cameraProperties) {
            return new d1(cameraProperties);
        }

        private Companion() {
        }
    }
}
