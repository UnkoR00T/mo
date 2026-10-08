package i;

import android.view.Surface;
import java.util.Map;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li/q;", "Li/y2;", "Lk/z;", "threads", "Ll/x;", "streamGraph", "Lh/s$b;", "graphConfig", "<init>", "(Lk/z;Ll/x;Lh/s$b;)V", "Li/m2;", "cameraDevice", "", "Lh/q1;", "Landroid/view/Surface;", "surfaces", "Li/a3;", "captureSessionState", "Li/y2$a;", "a", "(Li/m2;Ljava/util/Map;Li/a3;)Li/y2$a;", "Lk/z;", "b", "Ll/x;", "c", "Lh/s$b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    public q(k.z zVar, StreamGraph streamGraph, h.s.b bVar) {
        this.threads = zVar;
        this.streamGraph = streamGraph;
        this.graphConfig = bVar;
    }

    @Override // i.y2
    public y2.a a(m2 cameraDevice, Map<h.q1, ? extends Surface> surfaces, a3 captureSessionState) throws Exception {
        boolean zU0;
        OutputConfigurations outputConfigurationsB = z2.b(this.graphConfig, this.streamGraph, surfaces);
        if (outputConfigurationsB.a().isEmpty()) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to create OutputConfigurations for " + this.graphConfig);
            }
            captureSessionState.a();
            return y2.a.C2056a.f87638a;
        }
        if (this.graphConfig.k() == null) {
            zU0 = cameraDevice.M(outputConfigurationsB.a(), captureSessionState);
        } else {
            h.e1.a aVar = (h.e1.a) pq.v.P0(((h.x0.a) pq.v.P0(this.graphConfig.k())).getStream().b());
            zU0 = cameraDevice.u0(new InputConfigData(aVar.getSize().getWidth(), aVar.getSize().getHeight(), aVar.getFormat()), outputConfigurationsB.a(), captureSessionState);
        }
        if (zU0) {
            return new y2.a.Success(pq.v0.i(), outputConfigurationsB.c());
        }
        if (k.k.f107055a.d()) {
            io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + cameraDevice + " for " + captureSessionState + '!');
        }
        captureSessionState.a();
        return y2.a.C2056a.f87638a;
    }
}
