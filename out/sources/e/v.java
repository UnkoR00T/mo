package e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00107J'\u00109\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00102\u001a\u000208H\u0016¢\u0006\u0004\b9\u00104R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\b?\u0010@R\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<¨\u0006F"}, d2 = {"Le/v;", "Lh/g1$a;", "<init>", "()V", "Lh/i1;", "", "z", "(Lh/i1;)I", "requestMetadata", "Landroid/hardware/camera2/CameraCaptureSession;", "x", "(Lh/i1;)Landroid/hardware/camera2/CameraCaptureSession;", "Lv/s;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Loq/i0;", "w", "(Lv/s;Ljava/util/concurrent/Executor;)V", "e0", "(Lv/s;)V", "Lh/r0;", "frameNumber", "Lh/q1;", "streamId", "Lh/c1;", "outputId", "h", "(Lh/i1;JII)V", "Lh/p0;", "result", "K", "(Lh/i1;JLh/p0;)V", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "Lh/g1;", "request", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "Lh/q0;", "captureResult", "b", "(Lh/i1;JLh/q0;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lh/i1;)V", "r", "(Lh/i1;J)V", "Lh/f0;", "timestamp", "Z", "(Lh/i1;JJ)V", "progress", "C", "(Lh/i1;I)V", "Lh/n1;", "O", "", "a", "Ljava/util/Map;", "callbackMap", "Loq/k;", "A", "()Landroid/hardware/camera2/CameraCaptureSession;", "rejectOperationCameraCaptureSession", "", "c", "callbacks", "d", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements h.g1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<v.s, Executor> callbackMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k rejectOperationCameraCaptureSession = oq.l.a(new er.a() { // from class: e.n
        @Override // er.a
        public final Object a() {
            return v.d0();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile Map<v.s, ? extends Executor> callbacks = pq.v0.i();

    /* JADX INFO: renamed from: e.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le/v$a;", "", "<init>", "()V", "", "Lv/s;", "callbacks", "Ljava/util/concurrent/Executor;", "executor", "Le/v;", "a", "(Ljava/util/Collection;Ljava/util/concurrent/Executor;)Le/v;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final v a(Collection<? extends v.s> callbacks, Executor executor) {
            v vVar = new v();
            Iterator<T> it = callbacks.iterator();
            while (it.hasNext()) {
                vVar.w((v.s) it.next(), executor);
            }
            return vVar;
        }

        private Companion() {
        }
    }

    private final CameraCaptureSession A() {
        return (CameraCaptureSession) this.rejectOperationCameraCaptureSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(v.s sVar, int i15) {
        sVar.a(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j15) {
        a.d.a(((PRN.q.a) sVar).getCaptureCallback(), cameraCaptureSession, captureRequest, surface, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(v.s sVar, v vVar, h.i1 i1Var, int i15) {
        sVar.d(vVar.z(i1Var), i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(v.s sVar, v vVar, h.i1 i1Var, PRN.s sVar2) {
        sVar.b(vVar.z(i1Var), sVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(v.s sVar, v vVar, h.i1 i1Var, v.u uVar) {
        sVar.c(vVar.z(i1Var), uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j15, long j16) {
        a.e.a(((PRN.q.a) sVar).getCaptureCallback(), cameraCaptureSession, captureRequest, j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(v.s sVar, CameraCaptureSession cameraCaptureSession) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureSequenceAborted(cameraCaptureSession, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(v.s sVar, v vVar, h.i1 i1Var) {
        sVar.a(vVar.z(i1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(v.s sVar, CameraCaptureSession cameraCaptureSession, long j15) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureSequenceCompleted(cameraCaptureSession, -1, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(v.s sVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j15, long j16) {
        ((PRN.q.a) sVar).getCaptureCallback().onCaptureStarted(cameraCaptureSession, captureRequest, j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(v.s sVar, v vVar, h.i1 i1Var) {
        sVar.e(vVar.z(i1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 d0() {
        return new n1();
    }

    private final CameraCaptureSession x(h.i1 requestMetadata) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || e.a(requestMetadata.c0(fr.q0.c(d.a()))) == null) {
            return null;
        }
        return A();
    }

    private final int z(h.i1 i1Var) {
        t3 t3Var = (t3) i1Var.c(u1.a());
        Object objD = t3Var != null ? t3Var.d("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = objD instanceof Integer ? (Integer) objD : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // h.g1.a
    public void C(final h.i1 requestMetadata, final int progress) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                final CaptureResult captureResult = (CaptureResult) requestMetadata.c0(fr.q0.c(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    value.execute(new Runnable() { // from class: e.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.F(key, cameraCaptureSession, captureRequest, captureResult);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: e.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.G(key, this, requestMetadata, progress);
                    }
                });
            }
        }
    }

    @Override // h.g1.a
    public void H(h.g1 request) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            Object obj = request.b().get(u1.a());
            t3 t3Var = obj instanceof t3 ? (t3) obj : null;
            Object objD = t3Var != null ? t3Var.d("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = objD instanceof Integer ? (Integer) objD : null;
            final int iIntValue = num != null ? num.intValue() : -1;
            value.execute(new Runnable() { // from class: e.o
                @Override // java.lang.Runnable
                public final void run() {
                    v.B(key, iIntValue);
                }
            });
        }
    }

    @Override // h.g1.a
    public void K(final h.i1 requestMetadata, long frameNumber, h.p0 result) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSessionX = x(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                final TotalCaptureResult totalCaptureResult = (TotalCaptureResult) result.c0(fr.q0.c(TotalCaptureResult.class));
                if (cameraCaptureSessionX != null && captureRequest != null && totalCaptureResult != null) {
                    value.execute(new Runnable() { // from class: e.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.P(key, cameraCaptureSessionX, captureRequest, totalCaptureResult);
                        }
                    });
                }
            } else {
                final PRN.s sVar = new PRN.s(requestMetadata, frameNumber, result, null);
                value.execute(new Runnable() { // from class: e.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.Q(key, this, requestMetadata, sVar);
                    }
                });
            }
        }
    }

    @Override // h.g1.a
    public void L(final h.i1 requestMetadata) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: e.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.W(key, cameraCaptureSession);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: e.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.X(key, this, requestMetadata);
                    }
                });
            }
        }
    }

    @Override // h.g1.a
    public void O(h.i1 requestMetadata, final long frameNumber, final long timestamp) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: e.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.U(key, cameraCaptureSession, captureRequest, timestamp, frameNumber);
                        }
                    });
                }
            }
        }
    }

    @Override // h.g1.a
    public void Z(final h.i1 requestMetadata, final long frameNumber, final long timestamp) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSessionX = x(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                if (cameraCaptureSessionX != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: e.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.b0(key, cameraCaptureSessionX, captureRequest, timestamp, frameNumber);
                        }
                    });
                }
            } else {
                value.execute(new Runnable() { // from class: e.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.c0(key, this, requestMetadata);
                    }
                });
            }
        }
    }

    @Override // h.g1.a
    public void b(h.i1 requestMetadata, long frameNumber, h.q0 captureResult) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                final CaptureResult captureResult2 = (CaptureResult) captureResult.c0(fr.q0.c(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult2 != null) {
                    value.execute(new Runnable() { // from class: e.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.T(key, cameraCaptureSession, captureRequest, captureResult2);
                        }
                    });
                }
            }
        }
    }

    public final void e0(v.s callback) {
        synchronized (this.callbackMap) {
            this.callbackMap.remove(callback);
            this.callbacks = pq.v0.u(this.callbackMap);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // h.g1.a
    public void h(h.i1 requestMetadata, final long frameNumber, int streamId, int outputId) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) requestMetadata.c0(fr.q0.c(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                final Surface surface = requestMetadata.G().get(h.q1.a(streamId));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    value.execute(new Runnable() { // from class: e.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.D(key, cameraCaptureSession, captureRequest, surface, frameNumber);
                        }
                    });
                }
            }
        }
    }

    @Override // h.g1.a
    public void p(final h.i1 requestMetadata, long frameNumber, h.h1 requestFailure) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSessionX = x(requestMetadata);
                final CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                final CaptureFailure captureFailure = (CaptureFailure) requestFailure.c0(fr.q0.c(CaptureFailure.class));
                if (cameraCaptureSessionX != null && captureRequest != null && captureFailure != null) {
                    value.execute(new Runnable() { // from class: e.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.R(key, cameraCaptureSessionX, captureRequest, captureFailure);
                        }
                    });
                }
            } else {
                final v.u uVar = new v.u(v.u.a.ERROR);
                value.execute(new Runnable() { // from class: e.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.S(key, this, requestMetadata, uVar);
                    }
                });
            }
        }
    }

    @Override // h.g1.a
    public void r(h.i1 requestMetadata, final long frameNumber) {
        for (Map.Entry<v.s, ? extends Executor> entry : this.callbacks.entrySet()) {
            final v.s key = entry.getKey();
            Executor value = entry.getValue();
            if (key instanceof PRN.q.a) {
                final CameraCaptureSession cameraCaptureSessionX = x(requestMetadata);
                CaptureRequest captureRequest = (CaptureRequest) requestMetadata.c0(fr.q0.c(CaptureRequest.class));
                if (cameraCaptureSessionX != null && captureRequest != null) {
                    value.execute(new Runnable() { // from class: e.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.Y(key, cameraCaptureSessionX, frameNumber);
                        }
                    });
                }
            }
        }
    }

    public final void w(v.s callback, Executor executor) {
        if (this.callbacks.containsKey(callback)) {
            throw new IllegalStateException((callback + " was already registered!").toString());
        }
        synchronized (this.callbackMap) {
            this.callbackMap.put(callback, executor);
            this.callbacks = pq.v0.u(this.callbackMap);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }
}
