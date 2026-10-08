package e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import v.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\n\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Le/y;", "", "<init>", "()V", "Lv/j3;", "sessionConfig", "Loq/i0;", "c", "(Lv/j3;)V", "Le/y$a;", "a", "Le/y$a;", "_deviceStateCallback", "Le/y$b;", "b", "Le/y$b;", "_sessionStateCallback", "()Le/y$a;", "deviceStateCallback", "Lh/w$b;", "()Lh/w$b;", "sessionStateCallback", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a _deviceStateCallback = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b _sessionStateCallback = new b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, d2 = {"Le/y$a;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "<init>", "()V", "Lv/j3;", "sessionConfig", "Loq/i0;", "a", "(Lv/j3;)V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onClosed", "onDisconnected", "", "errorCode", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "Liu/e;", "", "Liu/e;", "callbacks", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private iu.e<List<CameraDevice.StateCallback>> callbacks = iu.b.g(pq.v.n());

        public final void a(j3 sessionConfig) {
            this.callbacks.d(pq.v.f1(sessionConfig.c()));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int errorCode) {
            Iterator<CameraDevice.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, errorCode);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Le/y$b;", "Lh/w$b;", "<init>", "()V", "Lv/j3;", "sessionConfig", "Loq/i0;", "g", "(Lv/j3;)V", "Lh/v;", "cameraId", "Lh/w$a;", "captureSessionId", "f", "(Ljava/lang/String;I)V", "b", "d", "a", "c", "e", "Le/n1;", "Le/n1;", "placeholderSession", "Liu/e;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Liu/e;", "callbacks", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h.w.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n1 placeholderSession = new n1();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private iu.e<List<CameraCaptureSession.StateCallback>> callbacks = iu.b.g(pq.v.n());

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le/y$b$a;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Liu/e;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "callbacks", "Loq/i0;", "a", "(Landroid/hardware/camera2/CameraCaptureSession;Liu/e;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f46463a = new a();

            private a() {
            }

            public static final void a(CameraCaptureSession session, iu.e<List<CameraCaptureSession.StateCallback>> callbacks) {
                Iterator<CameraCaptureSession.StateCallback> it = callbacks.c().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureQueueEmpty(session);
                }
            }
        }

        @Override // h.w.b
        public void a(String cameraId, int captureSessionId) {
            Iterator<CameraCaptureSession.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onActive(this.placeholderSession);
            }
        }

        @Override // h.w.b
        public void b(String cameraId, int captureSessionId) {
            Iterator<CameraCaptureSession.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(this.placeholderSession);
            }
        }

        @Override // h.w.b
        public void c(String cameraId, int captureSessionId) {
            a.a(this.placeholderSession, this.callbacks);
        }

        @Override // h.w.b
        public void d(String cameraId, int captureSessionId) {
            Iterator<CameraCaptureSession.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onReady(this.placeholderSession);
            }
        }

        @Override // h.w.b
        public void e(String cameraId, int captureSessionId) {
            Iterator<CameraCaptureSession.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onClosed(this.placeholderSession);
            }
        }

        @Override // h.w.b
        public void f(String cameraId, int captureSessionId) {
            Iterator<CameraCaptureSession.StateCallback> it = this.callbacks.c().iterator();
            while (it.hasNext()) {
                it.next().onConfigured(this.placeholderSession);
            }
        }

        public final void g(j3 sessionConfig) {
            this.callbacks.d(pq.v.f1(sessionConfig.m()));
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a get_deviceStateCallback() {
        return this._deviceStateCallback;
    }

    public final h.w.b b() {
        return this._sessionStateCallback;
    }

    public final void c(j3 sessionConfig) {
        this._deviceStateCallback.a(sessionConfig);
        this._sessionStateCallback.g(sessionConfig);
    }
}
