package i;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006*"}, d2 = {"Li/l;", "Landroid/hardware/camera2/CameraExtensionSession$StateCallback;", "Li/m2;", "device", "Li/o2$a;", "stateCallback", "Li/b4;", "lastStateCallback", "Lm/d;", "cameraErrorListener", "Lh/w$b;", "interopCaptureSessionListener", "Ljava/util/concurrent/Executor;", "callbackExecutor", "<init>", "(Li/m2;Li/o2$a;Li/b4;Lm/d;Lh/w$b;Ljava/util/concurrent/Executor;)V", "Landroid/hardware/camera2/CameraExtensionSession;", "session", "Li/o2;", "c", "(Landroid/hardware/camera2/CameraExtensionSession;Lm/d;)Li/o2;", "d", "Loq/i0;", "b", "()V", "a", "onConfigured", "(Landroid/hardware/camera2/CameraExtensionSession;)V", "onConfigureFailed", "onClosed", "Li/m2;", "Li/o2$a;", "Lm/d;", "Lh/w$b;", "e", "Ljava/util/concurrent/Executor;", "Liu/e;", "f", "Liu/e;", "_lastStateCallback", "g", "extensionSession", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends CameraExtensionSession$StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m2 device;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o2.a stateCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.w.b interopCaptureSessionListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Executor callbackExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iu.e<b4> _lastStateCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iu.e<o2> extensionSession = iu.b.g(null);

    public l(m2 m2Var, o2.a aVar, b4 b4Var, m.d dVar, h.w.b bVar, Executor executor) {
        this.device = m2Var;
        this.stateCallback = aVar;
        this.cameraErrorListener = dVar;
        this.interopCaptureSessionListener = bVar;
        this.callbackExecutor = executor;
        this._lastStateCallback = iu.b.g(b4Var);
    }

    private final void a() {
        b4 b4VarB = this._lastStateCallback.b(null);
        if (b4VarB != null) {
            b4VarB.a();
        }
    }

    private final void b() {
        a();
        this.stateCallback.a();
    }

    private final o2 c(CameraExtensionSession session, m.d cameraErrorListener) {
        o2 o2VarC = this.extensionSession.c();
        if (o2VarC != null) {
            return o2VarC;
        }
        o2 o2VarD = d(session, cameraErrorListener);
        return this.extensionSession.a(null, o2VarD) ? o2VarD : this.extensionSession.c();
    }

    private final o2 d(CameraExtensionSession session, m.d cameraErrorListener) {
        return new f(this.device, session, cameraErrorListener, this.callbackExecutor);
    }

    public void onClosed(CameraExtensionSession session) {
        o2 o2VarC = c(session, this.cameraErrorListener);
        this.stateCallback.b(c(session, this.cameraErrorListener));
        b();
        h.w.b bVar = this.interopCaptureSessionListener;
        if (bVar != null) {
            bVar.e(this.device.getCameraId(), o2VarC.getId());
        }
    }

    public void onConfigureFailed(CameraExtensionSession session) {
        o2 o2VarC = c(session, this.cameraErrorListener);
        this.stateCallback.j(o2VarC);
        b();
        h.w.b bVar = this.interopCaptureSessionListener;
        if (bVar != null) {
            bVar.b(this.device.getCameraId(), o2VarC.getId());
        }
    }

    public void onConfigured(CameraExtensionSession session) {
        o2 o2VarC = c(session, this.cameraErrorListener);
        this.stateCallback.c(o2VarC);
        a();
        h.w.b bVar = this.interopCaptureSessionListener;
        if (bVar != null) {
            bVar.f(this.device.getCameraId(), o2VarC.getId());
        }
    }
}
