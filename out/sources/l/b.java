package l;

import android.hardware.camera2.params.MeteringRectangle;
import h.Result3A;
import h.g1;
import h.q0;
import h.z0;
import java.util.List;
import ju.w0;
import k.d0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJc\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b,\u0010-JÐ\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u00010\u001c2\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001032\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001032\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0096@¢\u0006\u0004\b=\u0010>JZ\u0010D\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\b\u0010A\u001a\u0004\u0018\u0001052\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u0001032\u0006\u00109\u001a\u0002082\u0006\u0010C\u001a\u00020:H\u0096@¢\u0006\u0004\bD\u0010EJ6\u0010H\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010F\u001a\u0002052\u0006\u0010G\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010C\u001a\u00020:H\u0096@¢\u0006\u0004\bH\u0010IJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010J\u001a\u000205H\u0096@¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Ll/b;", "Lh/s$g;", "Lk/d0;", "token", "Ll/k;", "graphProcessor", "Ll/f;", "controller3A", "Lm/i;", "frameCaptureQueue", "Lm/e;", "parameters", "Lm/f;", "listeners", "<init>", "(Lk/d0;Ll/k;Ll/f;Lm/i;Lm/e;Lm/f;)V", "", "Lh/g1;", "requests", "Loq/i0;", "p0", "(Ljava/util/List;)V", "request", "L0", "(Lh/g1;)V", "stopRepeating", "()V", "close", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lju/w0;", "Lh/m1;", "m", "(Lh/a;Lh/b;Lh/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lju/w0;", "p", "()Lju/w0;", "h", "(Lh/a;)Lju/w0;", "Lh/z0;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Lh/q0;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "p3", "(Lh/a;Lh/b;Lh/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lh/z0;Lh/z0;Lh/z0;Lh/a;Ler/l;Ler/l;IJJLtq/e;)Ljava/lang/Object;", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "z1", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ler/l;IJLtq/e;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "l2", "(ZZIJLtq/e;)Ljava/lang/Object;", "cancelAf", "b2", "(ZLtq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Lk/d0;", "b", "Ll/k;", "c", "Ll/f;", "d", "Lm/i;", "e", "Lm/e;", "f", "Lm/f;", "g", "I", "debugId", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h.s.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0 token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k graphProcessor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f controller3A;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m.i frameCaptureQueue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m.e parameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m.f listeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int debugId = c.a().d();

    public b(d0 d0Var, k kVar, f fVar, m.i iVar, m.e eVar, m.f fVar2) {
        this.token = d0Var;
        this.graphProcessor = kVar;
        this.controller3A = fVar;
        this.frameCaptureQueue = iVar;
        this.parameters = eVar;
        this.listeners = fVar2;
    }

    @Override // h.s.g
    public void L0(g1 request) {
        if (!this.token.a()) {
            this.graphProcessor.c(request);
            return;
        }
        throw new IllegalStateException(("Cannot call startRepeating on " + this + " after close.").toString());
    }

    @Override // h.s.g
    public Object b2(boolean z15, tq.e<? super w0<Result3A>> eVar) {
        if (!this.token.a()) {
            return this.controller3A.p(z15);
        }
        throw new IllegalStateException(("Cannot call unlock3APostCapture on " + this + " after close.").toString());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.parameters.a();
        List<g1.a> listA = this.listeners.a();
        if (listA != null) {
            this.graphProcessor.f(listA);
        }
        this.token.b();
    }

    @Override // h.o
    public w0<Result3A> h(h.a aeMode) {
        if (!this.token.a()) {
            return this.controller3A.m(aeMode);
        }
        throw new IllegalStateException(("Cannot call setTorchOff on " + this + " after close.").toString());
    }

    @Override // h.s.g
    public Object l2(boolean z15, boolean z16, int i15, long j15, tq.e<? super w0<Result3A>> eVar) {
        if (!this.token.a()) {
            return this.controller3A.k(z15, z16, i15, j15);
        }
        throw new IllegalStateException(("Cannot call lock3AForCapture on " + this + " after close.").toString());
    }

    @Override // h.o
    public w0<Result3A> m(h.a aeMode, h.b afMode, h.d awbMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        if (!this.token.a()) {
            return f.s(this.controller3A, aeMode, afMode, awbMode, null, aeRegions, afRegions, awbRegions, 8, null);
        }
        throw new IllegalStateException(("Cannot call update3A on " + this + " after close.").toString());
    }

    @Override // h.o
    public w0<Result3A> p() {
        if (!this.token.a()) {
            return this.controller3A.n();
        }
        throw new IllegalStateException(("Cannot call setTorchOn on " + this + " after close.").toString());
    }

    @Override // h.s.g
    public void p0(List<g1> requests) {
        if (!this.token.a()) {
            if (requests.isEmpty()) {
                throw new IllegalStateException("Cannot call submit with an empty list of Requests!");
            }
            this.graphProcessor.p0(requests);
        } else {
            throw new IllegalStateException(("Cannot call submit on " + this + " after close.").toString());
        }
    }

    @Override // h.s.g
    public Object p3(h.a aVar, h.b bVar, h.d dVar, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, z0 z0Var, z0 z0Var2, z0 z0Var3, h.a aVar2, er.l<? super q0, Boolean> lVar, er.l<? super q0, Boolean> lVar2, int i15, long j15, long j16, tq.e<? super w0<Result3A>> eVar) {
        if (!this.token.a()) {
            return this.controller3A.i(list, list2, list3, z0Var, z0Var2, z0Var3, aVar2, lVar, lVar2, i15, vq.b.f(j15), vq.b.f(j16), eVar);
        }
        throw new IllegalStateException(("Cannot call lock3A on " + this + " after close.").toString());
    }

    @Override // h.s.g
    public void stopRepeating() {
        if (!this.token.a()) {
            this.graphProcessor.c(null);
            return;
        }
        throw new IllegalStateException(("Cannot call stopRepeating on " + this + " after close.").toString());
    }

    public String toString() {
        return "CameraGraph.Session-" + this.debugId;
    }

    @Override // h.s.g
    public Object z1(Boolean bool, Boolean bool2, Boolean bool3, er.l<? super q0, Boolean> lVar, int i15, long j15, tq.e<? super w0<Result3A>> eVar) {
        if (!this.token.a()) {
            return this.controller3A.o(bool, bool2, bool3, lVar, i15, vq.b.f(j15));
        }
        throw new IllegalStateException(("Cannot call unlock3A on " + this + " after close.").toString());
    }
}
