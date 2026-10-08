package i;

import android.view.Surface;
import java.util.Map;
import java.util.Set;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Li/k;", "Li/y2;", "Lk/z;", "threads", "Lh/s$b;", "graphConfig", "Ll/x;", "streamGraph", "Li/g2;", "camera2MetadataProvider", "Lh/r1;", "strictMode", "<init>", "(Lk/z;Lh/s$b;Ll/x;Li/g2;Lh/r1;)V", "Li/m2;", "cameraDevice", "", "Lh/q1;", "Landroid/view/Surface;", "surfaces", "Li/a3;", "captureSessionState", "Li/y2$a;", "a", "(Li/m2;Ljava/util/Map;Li/a3;)Li/y2$a;", "Lk/z;", "b", "Lh/s$b;", "c", "Ll/x;", "d", "Li/g2;", "e", "Lh/r1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g2 camera2MetadataProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    public k(k.z zVar, h.s.b bVar, StreamGraph streamGraph, g2 g2Var, h.r1 r1Var) {
        this.threads = zVar;
        this.graphConfig = bVar;
        this.streamGraph = streamGraph;
        this.camera2MetadataProvider = g2Var;
        this.strictMode = r1Var;
    }

    @Override // i.y2
    public y2.a a(m2 cameraDevice, Map<h.q1, ? extends Surface> surfaces, a3 captureSessionState) throws Exception {
        if (!h.s.e.f(this.graphConfig.getSessionMode(), h.s.e.INSTANCE.b())) {
            throw new IllegalArgumentException("Unsupported session mode: " + ((Object) h.s.e.h(this.graphConfig.getSessionMode())) + " for Extension CameraGraph");
        }
        Object obj = this.graphConfig.p().get(q2.f87324a.b());
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
        }
        int iIntValue = num.intValue();
        if (this.graphConfig.k() != null) {
            throw new IllegalStateException("Reprocessing is not supported for Extensions");
        }
        h.x xVarA = this.camera2MetadataProvider.a(cameraDevice.getCameraId());
        Set<Integer> setK = xVarA.K();
        h.r1 r1Var = this.strictMode;
        if (!setK.contains(Integer.valueOf(iIntValue))) {
            String str = cameraDevice + " does not support extension mode " + iIntValue + ". Supported extensions are " + setK;
            if (r1Var.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", str);
            }
        }
        if (this.graphConfig.getPostviewStream() != null) {
            h.r rVarB0 = xVarA.b0(iIntValue);
            h.r1 r1Var2 = this.strictMode;
            if (!rVarB0.p()) {
                String str2 = cameraDevice + " does not support Postview streams";
                if (r1Var2.getEnabled()) {
                    throw new IllegalStateException(str2);
                }
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", str2);
                }
            }
            if (this.graphConfig.getPostviewStream().b().size() != 1) {
                throw new IllegalStateException("Postview streams can only have one OutputStream.config object");
            }
        }
        OutputConfigurations outputConfigurationsB = z2.b(this.graphConfig, this.streamGraph, surfaces);
        if (outputConfigurationsB.a().isEmpty()) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to create OutputConfigurations for " + this.graphConfig);
            }
            captureSessionState.a();
            return y2.a.C2056a.f87638a;
        }
        if (!outputConfigurationsB.b().isEmpty()) {
            throw new IllegalStateException("Deferred output is not supported for Extensions");
        }
        if (cameraDevice.O0(new ExtensionSessionConfigData(2, outputConfigurationsB.a(), new k.j(this.threads.i()), captureSessionState, this.graphConfig.getSessionTemplate(), this.graphConfig.p(), Integer.valueOf(iIntValue), new i3(captureSessionState), outputConfigurationsB.getPostviewOutput()))) {
            return new y2.a.Success(outputConfigurationsB.b(), outputConfigurationsB.c());
        }
        if (k.k.f107055a.d()) {
            io.sentry.android.core.c2.g("CXCP", "Failed to create ExtensionCaptureSession from " + cameraDevice + " for " + captureSessionState + '!');
        }
        captureSessionState.a();
        return y2.a.C2056a.f87638a;
    }
}
