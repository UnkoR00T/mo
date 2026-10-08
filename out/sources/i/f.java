package i;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001:\u0002)-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001a\u001a\u0004\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Li/f;", "Li/o2;", "Li/m2;", "device", "Landroid/hardware/camera2/CameraExtensionSession;", "cameraExtensionSession", "Lm/d;", "cameraErrorListener", "Ljava/util/concurrent/Executor;", "callbackExecutor", "<init>", "(Li/m2;Landroid/hardware/camera2/CameraExtensionSession;Lm/d;Ljava/util/concurrent/Executor;)V", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "listener", "", "L2", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "e2", "", "stopRepeating", "()Z", "T", "", "requests", "r0", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "B1", "Li/l3;", "outputConfigs", "L1", "(Ljava/util/List;)Z", "", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "a", "Li/m2;", "n1", "()Li/m2;", "b", "Landroid/hardware/camera2/CameraExtensionSession;", "c", "Lm/d;", "d", "Ljava/util/concurrent/Executor;", "Lh/w$a;", "e", "I", "D0", "()I", "id", "Liu/d;", "f", "Liu/d;", "frameNumbers", "", "", "g", "Ljava/util/Map;", "extensionSessionMap", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "inputSurface", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m2 device;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CameraExtensionSession cameraExtensionSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor callbackExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int id = h.w.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iu.d frameNumbers = iu.b.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<CameraExtensionSession, Long> extensionSessionMap = new HashMap();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, d2 = {"Li/f$a;", "Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;", "Li/m1;", "captureCallback", "<init>", "(Li/f;Li/m1;)V", "Landroid/hardware/camera2/CameraExtensionSession;", "session", "", "b", "(Landroid/hardware/camera2/CameraExtensionSession;)J", "a", "Landroid/hardware/camera2/CaptureRequest;", "request", "timestamp", "Loq/i0;", "onCaptureStarted", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;J)V", "onCaptureProcessStarted", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;)V", "", "progress", "onCaptureProcessProgressed", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;I)V", "onCaptureFailed", "sequenceId", "onCaptureSequenceCompleted", "(Landroid/hardware/camera2/CameraExtensionSession;I)V", "onCaptureSequenceAborted", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "onCaptureResultAvailable", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "Li/m1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "frameQueue", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends CameraExtensionSession$ExtensionCaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m1 captureCallback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ConcurrentLinkedQueue<Long> frameQueue = new ConcurrentLinkedQueue<>();

        public a(m1 m1Var) {
            this.captureCallback = m1Var;
        }

        private final long a(CameraExtensionSession session) {
            if (this.frameQueue.isEmpty()) {
                b(session);
            }
            return this.frameQueue.remove().longValue();
        }

        private final long b(CameraExtensionSession session) {
            long jC = f.this.frameNumbers.c();
            f.this.extensionSessionMap.put(session, Long.valueOf(jC));
            this.frameQueue.add(Long.valueOf(jC));
            return jC;
        }

        public void onCaptureFailed(CameraExtensionSession session, CaptureRequest request) {
            this.captureCallback.e(request, h.r0.b(a(session)));
        }

        public void onCaptureProcessProgressed(CameraExtensionSession session, CaptureRequest request, int progress) {
            this.captureCallback.d(request, progress);
        }

        public void onCaptureProcessStarted(CameraExtensionSession session, CaptureRequest request) {
        }

        public void onCaptureResultAvailable(CameraExtensionSession session, CaptureRequest request, TotalCaptureResult result) {
            this.captureCallback.c(request, result, h.r0.b(a(session)));
        }

        public void onCaptureSequenceAborted(CameraExtensionSession session, int sequenceId) {
            this.captureCallback.b(sequenceId);
        }

        public void onCaptureSequenceCompleted(CameraExtensionSession session, int sequenceId) {
            this.captureCallback.a(sequenceId, ((Long) f.this.extensionSessionMap.get(session)).longValue());
        }

        public void onCaptureStarted(CameraExtensionSession session, CaptureRequest request, long timestamp) {
            this.captureCallback.f(request, b(session), timestamp);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Li/f$b;", "Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;", "Li/m1;", "captureCallback", "", "Landroid/hardware/camera2/CaptureRequest;", "", "", "captureRequestMap", "<init>", "(Li/f;Li/m1;Ljava/util/Map;)V", "Landroid/hardware/camera2/CameraExtensionSession;", "session", "request", "timestamp", "Loq/i0;", "onCaptureStarted", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;J)V", "onCaptureProcessStarted", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;)V", "onCaptureFailed", "", "progress", "onCaptureProcessProgressed", "(Landroid/hardware/camera2/CameraExtensionSession;Landroid/hardware/camera2/CaptureRequest;I)V", "sequenceId", "onCaptureSequenceCompleted", "(Landroid/hardware/camera2/CameraExtensionSession;I)V", "onCaptureSequenceAborted", "a", "Li/m1;", "b", "Ljava/util/Map;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends CameraExtensionSession$ExtensionCaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m1 captureCallback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<CaptureRequest, List<Long>> captureRequestMap;

        public b(m1 m1Var, Map<CaptureRequest, List<Long>> map) {
            this.captureCallback = m1Var;
            this.captureRequestMap = map;
        }

        public void onCaptureFailed(CameraExtensionSession session, CaptureRequest request) {
            if (this.captureRequestMap.get(request).size() == 1) {
                this.captureCallback.e(request, h.r0.b(this.captureRequestMap.get(request).get(0).longValue()));
            } else if (k.k.f107055a.c()) {
                Objects.toString(((List) this.captureRequestMap.get(request)).stream());
            }
        }

        public void onCaptureProcessProgressed(CameraExtensionSession session, CaptureRequest request, int progress) {
            this.captureCallback.d(request, progress);
        }

        public void onCaptureProcessStarted(CameraExtensionSession session, CaptureRequest request) {
        }

        public void onCaptureSequenceAborted(CameraExtensionSession session, int sequenceId) {
            this.captureCallback.b(sequenceId);
        }

        public void onCaptureSequenceCompleted(CameraExtensionSession session, int sequenceId) {
            this.captureCallback.a(sequenceId, ((Long) f.this.extensionSessionMap.get(session)).longValue());
        }

        public void onCaptureStarted(CameraExtensionSession session, CaptureRequest request, long timestamp) {
            long jC = f.this.frameNumbers.c();
            f.this.extensionSessionMap.put(session, Long.valueOf(jC));
            Map<CaptureRequest, List<Long>> map = this.captureRequestMap;
            List<Long> arrayList = map.get(request);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(request, arrayList);
            }
            arrayList.add(Long.valueOf(jC));
            this.captureCallback.f(request, jC, timestamp);
        }
    }

    public f(m2 m2Var, CameraExtensionSession cameraExtensionSession, m.d dVar, Executor executor) {
        this.device = m2Var;
        this.cameraExtensionSession = cameraExtensionSession;
        this.cameraErrorListener = dVar;
        this.callbackExecutor = executor;
    }

    @Override // i.k2
    public Integer B1(List<CaptureRequest> requests, CameraCaptureSession.CaptureCallback listener) {
        if (requests.size() == 1) {
            return e2((CaptureRequest) pq.v.P0(requests), listener);
        }
        throw new IllegalStateException("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
    }

    @Override // i.k2
    /* JADX INFO: renamed from: D0, reason: from getter */
    public int getId() {
        return this.id;
    }

    @Override // i.k2
    public boolean L1(List<? extends l3> outputConfigs) {
        if (!k.k.f107055a.d()) {
            return false;
        }
        io.sentry.android.core.c2.g("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.k2
    public Integer L2(CaptureRequest request, CameraCaptureSession.CaptureCallback listener) throws Exception {
        String cameraId = getDevice().getCameraId();
        m.d dVar = this.cameraErrorListener;
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.capture(request, this.callbackExecutor, new a((m1) listener)) : this.cameraExtensionSession.capture(request, this.callbackExecutor, new b((m1) listener, new LinkedHashMap())));
        } catch (Exception e15) {
            if (e15 instanceof CameraAccessException) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                }
                dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                return null;
            }
            if (!(e15 instanceof IllegalArgumentException) && !(e15 instanceof SecurityException) && !(e15 instanceof UnsupportedOperationException) && !(e15 instanceof NullPointerException)) {
                if (!(e15 instanceof IllegalStateException)) {
                    throw e15;
                }
                k.k.f107055a.a();
                return null;
            }
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
            }
            dVar.a(cameraId, h.q.INSTANCE.m(), false);
            return null;
        }
    }

    @Override // i.k2
    public boolean T() {
        return false;
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(e.d.a()))) {
            return (T) this.cameraExtensionSession;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws CameraAccessException {
        this.cameraExtensionSession.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.k2
    public Integer e2(CaptureRequest request, CameraCaptureSession.CaptureCallback listener) throws Exception {
        String cameraId = getDevice().getCameraId();
        m.d dVar = this.cameraErrorListener;
        try {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? this.cameraExtensionSession.setRepeatingRequest(request, this.callbackExecutor, new a((m1) listener)) : this.cameraExtensionSession.setRepeatingRequest(request, this.callbackExecutor, new b((m1) listener, new LinkedHashMap())));
        } catch (Exception e15) {
            if (e15 instanceof CameraAccessException) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                }
                dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                return null;
            }
            if (!(e15 instanceof IllegalArgumentException) && !(e15 instanceof SecurityException) && !(e15 instanceof UnsupportedOperationException) && !(e15 instanceof NullPointerException)) {
                if (!(e15 instanceof IllegalStateException)) {
                    throw e15;
                }
                k.k.f107055a.a();
                return null;
            }
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
            }
            dVar.a(cameraId, h.q.INSTANCE.m(), false);
            return null;
        }
    }

    @Override // i.k2
    public Surface getInputSurface() {
        return null;
    }

    @Override // i.k2
    /* JADX INFO: renamed from: n1, reason: from getter */
    public m2 getDevice() {
        return this.device;
    }

    @Override // i.k2
    public Integer r0(List<CaptureRequest> requests, CameraCaptureSession.CaptureCallback listener) throws Exception {
        Iterator<T> it = requests.iterator();
        while (it.hasNext()) {
            L2((CaptureRequest) it.next(), listener);
        }
        return null;
    }

    @Override // i.k2
    public boolean stopRepeating() throws Exception {
        oq.i0 i0Var;
        String cameraId = getDevice().getCameraId();
        m.d dVar = this.cameraErrorListener;
        try {
            this.cameraExtensionSession.stopRepeating();
            i0Var = oq.i0.f148189a;
        } catch (Exception e15) {
            if (e15 instanceof CameraAccessException) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                }
                dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
            } else if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                }
                dVar.a(cameraId, h.q.INSTANCE.m(), false);
            } else {
                if (!(e15 instanceof IllegalStateException)) {
                    throw e15;
                }
                k.k.f107055a.a();
            }
            i0Var = null;
        }
        return i0Var != null;
    }
}
