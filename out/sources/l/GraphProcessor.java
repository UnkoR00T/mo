package l;

import h.g1;
import h.t0;
import h.u0;
import i.h2;
import i.q2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.z;
import mu.b0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u00122\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00122\u0012\u0010'\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b,\u0010+J\u001d\u0010.\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u0014J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R(\u0010E\u001a\u0004\u0018\u00010 2\b\u0010A\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\b7\u0010D¨\u0006F"}, d2 = {"Ll/l;", "Ll/k;", "Ll/i;", "Lk/z;", "threads", "Lh/u;", "cameraGraphId", "Lh/s$b;", "cameraGraphConfig", "Ll/q;", "graphListener3A", "", "Lh/g1$a;", "graphListeners", "Li/h2;", "camera2Quirks", "<init>", "(Lk/z;Lh/u;Lh/s$b;Ll/q;Ljava/util/List;Li/h2;)V", "Loq/i0;", "b", "()V", "Ll/m;", "requestProcessor", "i", "(Ll/m;)V", "a", "k", "h", "Lh/t0$a;", "graphStateError", "d", "(Lh/t0$a;)V", "Lh/g1;", "requests", "", "p0", "(Ljava/util/List;)Z", "", "", "parameters", "l", "(Ljava/util/Map;)Z", "e", "(Ljava/util/Map;)V", "j", "listeners", "f", "(Ljava/util/List;)V", "close", "", "toString", "()Ljava/lang/String;", "Lh/u;", "Lh/s$b;", "Ll/j;", "c", "Ll/j;", "graphLoop", "Lh/u0;", "Ljava/util/List;", "externalStateGraphListeners", "Lmu/b0;", "Lh/t0;", "Lmu/b0;", "_graphState", "value", "g", "()Lh/g1;", "(Lh/g1;)V", "repeatingRequest", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphProcessor implements k, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.u cameraGraphId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.s.b cameraGraphConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GraphLoop graphLoop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<u0> externalStateGraphListeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<t0> _graphState;

    public GraphProcessor(z zVar, h.u uVar, h.s.b bVar, q qVar, List<g1.a> list, h2 h2Var) {
        this.cameraGraphId = uVar;
        this.cameraGraphConfig = bVar;
        this.externalStateGraphListeners = bVar.j();
        Map<?, Object> mapF = bVar.f();
        Map<?, Object> mapM = bVar.m();
        q2 q2Var = q2.f87324a;
        Object obj = mapF.get(q2Var.c());
        Boolean bool = Boolean.TRUE;
        if ((fr.t.c(obj, bool) || fr.t.c(mapM.get(q2Var.c()), bool)) && k.k.f107055a.c()) {
            Objects.toString(q2Var.c());
        }
        int iB = h2Var.b(bVar.getFlags());
        d dVar = iB != 0 ? new d(iB) : null;
        GraphLoop graphLoop = new GraphLoop(uVar, mapF, mapM, pq.v.L0(list, pq.v.r(dVar)), pq.v.s(qVar, dVar), zVar.getCameraPipeScope(), zVar.getLightweightDispatcher());
        this.graphLoop = graphLoop;
        if (dVar != null) {
            dVar.k(graphLoop);
        }
        this._graphState = r0.a(t0.d.f79081b);
    }

    @Override // l.i
    public void a() {
        if (k.k.f107055a.a()) {
            toString();
        }
        this._graphState.setValue(t0.e.f79082b);
        this.graphLoop.Y0(null);
        Iterator<u0> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // l.i
    public void b() {
        if (k.k.f107055a.a()) {
            toString();
        }
        this._graphState.setValue(t0.c.f79080b);
        Iterator<u0> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // l.k
    public void c(g1 g1Var) {
        this.graphLoop.O0(g1Var);
    }

    @Override // l.k
    public void close() {
        this.graphLoop.close();
    }

    @Override // l.i
    public void d(t0.a graphStateError) {
        t0 value;
        t0 t0Var;
        if (k.k.f107055a.a()) {
            toString();
            Objects.toString(graphStateError);
        }
        b0<t0> b0Var = this._graphState;
        do {
            value = b0Var.getValue();
            t0Var = value;
        } while (!b0Var.s(value, ((t0Var instanceof t0.e) || (t0Var instanceof t0.d)) ? t0.d.f79081b : graphStateError));
        Iterator<u0> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().d(graphStateError);
        }
    }

    @Override // l.k
    public void e(Map<?, ? extends Object> parameters) {
        this.graphLoop.H0(parameters);
    }

    @Override // l.k
    public void f(List<? extends g1.a> listeners) {
        this.graphLoop.T0(listeners);
    }

    @Override // l.k
    public g1 g() {
        return this.graphLoop.H();
    }

    @Override // l.i
    public void h(m requestProcessor) {
        if (k.k.f107055a.a()) {
            toString();
        }
        this.graphLoop.I();
    }

    @Override // l.i
    public void i(m requestProcessor) {
        if (k.k.f107055a.a()) {
            toString();
        }
        this._graphState.setValue(t0.b.f79079b);
        this.graphLoop.Y0(requestProcessor);
        Iterator<u0> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // l.k
    public void j(Map<?, ? extends Object> parameters) {
        this.graphLoop.C0(parameters);
    }

    @Override // l.i
    public void k(m requestProcessor) {
        if (k.k.f107055a.a()) {
            toString();
        }
        this._graphState.setValue(t0.d.f79081b);
        this.graphLoop.Y0(null);
        Iterator<u0> it = this.externalStateGraphListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // l.k
    public boolean l(Map<?, ? extends Object> parameters) {
        return this.graphLoop.i1(parameters);
    }

    @Override // l.k
    public boolean p0(List<g1> requests) {
        Object next;
        Iterator<T> it = requests.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((g1) next).getInputRequest() == null);
        g1 g1Var = (g1) next;
        if (g1Var == null || this.cameraGraphConfig.k() != null) {
            return this.graphLoop.d1(requests);
        }
        throw new IllegalStateException(("Cannot submit " + g1Var + " with input request " + g1Var.getInputRequest() + " to " + this + " because CameraGraph was not configured to support reprocessing").toString());
    }

    public String toString() {
        return "GraphProcessor(cameraGraph: " + this.cameraGraphId + ')';
    }
}
