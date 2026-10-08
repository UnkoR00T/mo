package i;

import android.view.Surface;
import java.util.Map;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJO\u0010\u0019\u001a\u0012\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Li/c4;", "Li/p1;", "Lk/z;", "threads", "Lh/s$b;", "graphConfig", "Ll/x;", "streamGraph", "Li/h2;", "quirks", "Lh/r1;", "strictMode", "<init>", "(Lk/z;Lh/s$b;Ll/x;Li/h2;Lh/r1;)V", "Li/k2;", "session", "", "Lh/q1;", "Landroid/view/Surface;", "streamToSurfaceMap", "Lh/c1;", "outputToSurfaceMap", "Lh/h0;", "Lh/g0;", "", "a", "(Li/k2;Ljava/util/Map;Ljava/util/Map;)Lh/h0;", "Lk/z;", "b", "Lh/s$b;", "c", "Ll/x;", "d", "Li/h2;", "e", "Lh/r1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c4 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h2 quirks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    public c4(k.z zVar, h.s.b bVar, StreamGraph streamGraph, h2 h2Var, h.r1 r1Var) {
        this.threads = zVar;
        this.graphConfig = bVar;
        this.streamGraph = streamGraph;
        this.quirks = h2Var;
        this.strictMode = r1Var;
    }

    @Override // i.p1
    public h.h0<?, h.g0<Object>> a(k2 session, Map<h.q1, ? extends Surface> streamToSurfaceMap, Map<h.c1, ? extends Surface> outputToSurfaceMap) {
        return new o1(session, this.threads, this.graphConfig.getDefaultTemplate(), streamToSurfaceMap, outputToSurfaceMap, this.streamGraph, this.strictMode, this.quirks.f(this.graphConfig), null);
    }
}
