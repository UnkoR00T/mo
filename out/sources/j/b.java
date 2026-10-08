package j;

import h.p1;
import h.s1;
import i.Camera2CameraController;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lj/b;", "", "Lh/e;", "cameraBackend", "Lh/u;", "graphId", "Lh/s$b;", "graphConfig", "Ll/i;", "graphListener", "Lh/p1;", "streamGraph", "Lh/s1;", "surfaceTracker", "Li/x0$d;", "shutdownListener", "<init>", "(Lh/e;Lh/u;Lh/s$b;Ll/i;Lh/p1;Lh/s1;Li/x0$d;)V", "a", "()Lh/s$b;", "b", "()Lh/u;", "Ll/x;", "e", "()Ll/x;", "c", "()Ll/i;", "f", "()Lh/s1;", "d", "()Li/x0$d;", "Lh/e;", "Lh/u;", "Lh/s$b;", "Ll/i;", "Lh/p1;", "Lh/s1;", "g", "Li/x0$d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.e cameraBackend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.u graphId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l.i graphListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 streamGraph;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s1 surfaceTracker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Camera2CameraController.d shutdownListener;

    public b(h.e eVar, h.u uVar, h.s.b bVar, l.i iVar, p1 p1Var, s1 s1Var, Camera2CameraController.d dVar) {
        this.cameraBackend = eVar;
        this.graphId = uVar;
        this.graphConfig = bVar;
        this.graphListener = iVar;
        this.streamGraph = p1Var;
        this.surfaceTracker = s1Var;
        this.shutdownListener = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h.s.b getGraphConfig() {
        return this.graphConfig;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h.u getGraphId() {
        return this.graphId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l.i getGraphListener() {
        return this.graphListener;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Camera2CameraController.d getShutdownListener() {
        return this.shutdownListener;
    }

    public final StreamGraph e() {
        return (StreamGraph) this.streamGraph;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s1 getSurfaceTracker() {
        return this.surfaceTracker;
    }
}
