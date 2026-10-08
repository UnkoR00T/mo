package e;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010'J'\u0010.\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010\u001dR \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R<\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Le/u0;", "Lh/g1$a;", "<init>", "()V", "listener", "Ljava/util/concurrent/Executor;", "executor", "Loq/i0;", "o", "(Lh/g1$a;Ljava/util/concurrent/Executor;)V", "G", "(Lh/g1$a;)V", "Lh/g1;", "request", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/q1;", "streamId", "Lh/c1;", "outputId", "h", "(Lh/i1;JII)V", "Lh/p0;", "result", "K", "(Lh/i1;JLh/p0;)V", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "Lh/q0;", "captureResult", "b", "(Lh/i1;JLh/q0;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lh/i1;)V", "r", "(Lh/i1;J)V", "M", "V", "Lh/f0;", "timestamp", "Z", "(Lh/i1;JJ)V", "totalCaptureResult", "a0", "", "a", "Ljava/util/Map;", "requestListeners", "", "value", "getListeners", "()Ljava/util/Map;", "listeners", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 implements h.g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<h.g1.a, Executor> requestListeners = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Map<h.g1.a, ? extends Executor> listeners = pq.v0.i();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(h.g1.a aVar, h.i1 i1Var) {
        aVar.M(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(h.g1.a aVar, h.i1 i1Var) {
        aVar.V(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(h.g1.a aVar, h.i1 i1Var, long j15, long j16) {
        aVar.Z(i1Var, j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(h.g1.a aVar, h.i1 i1Var, long j15, h.p0 p0Var) {
        aVar.a0(i1Var, j15, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(h.g1.a aVar, h.g1 g1Var) {
        aVar.H(g1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(h.g1.a aVar, h.i1 i1Var, long j15, int i15, int i16) {
        aVar.h(i1Var, j15, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(h.g1.a aVar, h.i1 i1Var, long j15, h.p0 p0Var) {
        aVar.K(i1Var, j15, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(h.g1.a aVar, h.i1 i1Var, long j15, h.h1 h1Var) {
        aVar.p(i1Var, j15, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(h.g1.a aVar, h.i1 i1Var, long j15, h.q0 q0Var) {
        aVar.b(i1Var, j15, q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(h.g1.a aVar, h.i1 i1Var) {
        aVar.L(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(h.g1.a aVar, h.i1 i1Var, long j15) {
        aVar.r(i1Var, j15);
    }

    public final void G(h.g1.a listener) {
        synchronized (this.requestListeners) {
            this.requestListeners.remove(listener);
            this.listeners = pq.v0.u(this.requestListeners);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // h.g1.a
    public void H(final h.g1 request) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.j0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.q(key, request);
                }
            });
        }
    }

    @Override // h.g1.a
    public void K(final h.i1 requestMetadata, final long frameNumber, final h.p0 result) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.k0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.t(key, requestMetadata, frameNumber, result);
                }
            });
        }
    }

    @Override // h.g1.a
    public void L(final h.i1 requestMetadata) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.l0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.x(key, requestMetadata);
                }
            });
        }
    }

    @Override // h.g1.a
    public void M(final h.i1 requestMetadata) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.m0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.A(key, requestMetadata);
                }
            });
        }
    }

    @Override // h.g1.a
    public void V(final h.i1 requestMetadata) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.t0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.B(key, requestMetadata);
                }
            });
        }
    }

    @Override // h.g1.a
    public void Z(final h.i1 requestMetadata, final long frameNumber, final long timestamp) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.s0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.D(key, requestMetadata, frameNumber, timestamp);
                }
            });
        }
    }

    @Override // h.g1.a
    public void a0(final h.i1 requestMetadata, final long frameNumber, final h.p0 totalCaptureResult) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.n0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.F(key, requestMetadata, frameNumber, totalCaptureResult);
                }
            });
        }
    }

    @Override // h.g1.a
    public void b(final h.i1 requestMetadata, final long frameNumber, final h.q0 captureResult) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.q0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.w(key, requestMetadata, frameNumber, captureResult);
                }
            });
        }
    }

    @Override // h.g1.a
    public void h(final h.i1 requestMetadata, final long frameNumber, final int streamId, final int outputId) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.p0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.s(key, requestMetadata, frameNumber, streamId, outputId);
                }
            });
        }
    }

    public final void o(h.g1.a listener, Executor executor) {
        if (this.listeners.containsKey(listener)) {
            throw new IllegalStateException((listener + " was already registered!").toString());
        }
        synchronized (this.requestListeners) {
            this.requestListeners.put(listener, executor);
            this.listeners = pq.v0.u(this.requestListeners);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // h.g1.a
    public void p(final h.i1 requestMetadata, final long frameNumber, final h.h1 requestFailure) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.o0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.v(key, requestMetadata, frameNumber, requestFailure);
                }
            });
        }
    }

    @Override // h.g1.a
    public void r(final h.i1 requestMetadata, final long frameNumber) {
        for (Map.Entry<h.g1.a, ? extends Executor> entry : this.listeners.entrySet()) {
            final h.g1.a key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: e.r0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.z(key, requestMetadata, frameNumber);
                }
            });
        }
    }
}
