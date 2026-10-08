package i;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJE\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Li/y1;", "Li/x1;", "Lk/z;", "threads", "Li/h2;", "camera2Quirks", "Li/w3;", "retryingCameraStateOpener", "<init>", "(Lk/z;Li/h2;Li/w3;)V", "Li/m2;", "cameraDeviceWrapper", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Li/g;", "androidCameraState", "", "shouldReopenCamera", "shouldCreateEmptyCaptureSession", "Loq/r;", "h", "(Li/m2;Landroid/hardware/camera2/CameraDevice;Li/g;ZZ)Loq/r;", "Loq/i0;", "f", "(Landroid/hardware/camera2/CameraDevice;Li/g;)V", "g", "(Li/m2;)V", "Li/n0;", "audioRestrictionController", "b", "(Li/m2;Landroid/hardware/camera2/CameraDevice;Li/g;Li/n0;ZZ)V", "a", "Lk/z;", "getThreads", "()Lk/z;", "Li/h2;", "c", "Li/w3;", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h2 camera2Quirks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w3 retryingCameraStateOpener;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CameraDevice f87632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.l0 f87633g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CameraDevice cameraDevice, fr.l0 l0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f87632f = cameraDevice;
            this.f87633g = l0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87631e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n2.a(this.f87632f);
            this.f87633g.f66404a = true;
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new b(this.f87632f, this.f87633g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"i/y1$c", "Li/k2$a;", "Li/k2;", "session", "Loq/i0;", "e", "(Li/k2;)V", "k", "f", "d", "g", "i", "()V", "a", "h", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements k2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f87634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f87635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Surface f87636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f87637d;

        c(CountDownLatch countDownLatch, iu.a aVar, Surface surface, SurfaceTexture surfaceTexture) {
            this.f87634a = countDownLatch;
            this.f87635b = aVar;
            this.f87636c = surface;
            this.f87637d = surfaceTexture;
        }

        @Override // i.b4
        public void a() {
        }

        @Override // i.k2.a
        public void d(k2 session) {
        }

        @Override // i.k2.a
        public void e(k2 session) throws Exception {
            k.k.f107055a.a();
            CON.j0.a(session);
            this.f87634a.countDown();
        }

        @Override // i.k2.a
        public void f(k2 session) {
            k.k.f107055a.a();
            if (this.f87635b.a(false, true)) {
                this.f87636c.release();
                this.f87637d.release();
            }
            this.f87634a.countDown();
        }

        @Override // i.k2.a
        public void g(k2 session) {
        }

        @Override // i.k2.a
        public void h(k2 session) {
        }

        @Override // i.b4
        public void i() {
        }

        @Override // i.k2.a
        public void k(k2 session) {
            k.k.f107055a.a();
            if (this.f87635b.a(false, true)) {
                this.f87636c.release();
                this.f87637d.release();
            }
        }
    }

    public y1(k.z zVar, h2 h2Var, w3 w3Var) {
        this.threads = zVar;
        this.camera2Quirks = h2Var;
        this.retryingCameraStateOpener = w3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(CameraDevice cameraDevice, g androidCameraState) {
        String id5 = cameraDevice.getId();
        k.k kVar = k.k.f107055a;
        kVar.a();
        fr.l0 l0Var = new fr.l0();
        if (((oq.i0) this.threads.n(7000L, new b(cameraDevice, l0Var, null))) == null && kVar.b()) {
            io.sentry.android.core.c2.e("CXCP", "Failed to close CameraDevice(" + id5 + ") after 7000ms. The camera is likely in a bad state.");
        }
        h.v.Companion companion = h.v.INSTANCE;
        String strB = h.v.b(cameraDevice.getId());
        if (this.camera2Quirks.e(strB) && l0Var.f66404a) {
            if (kVar.a()) {
                h.v.f(strB);
            }
            if (androidCameraState.d(2000L)) {
                if (kVar.a()) {
                    h.v.f(strB);
                }
            } else if (kVar.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to close " + ((Object) h.v.f(strB)) + " after 2000ms!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(m2 cameraDeviceWrapper) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        iu.a aVarA = iu.b.a(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (cameraDeviceWrapper.T0(pq.v.e(surface), new c(countDownLatch, aVarA, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        if (k.k.f107055a.b()) {
            io.sentry.android.core.c2.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        }
        if (aVarA.a(false, true)) {
            surface.release();
            surfaceTexture.release();
        }
    }

    private final oq.r<m2, g> h(m2 cameraDeviceWrapper, CameraDevice cameraDevice, g androidCameraState, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession) {
        AwaitOpenCameraResult awaitOpenCameraResult;
        k.k kVar = k.k.f107055a;
        if (kVar.a()) {
            Objects.toString(cameraDevice);
        }
        String cameraId = cameraDeviceWrapper.getCameraId();
        if (shouldReopenCamera) {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                kVar.a();
                f(cameraDevice, androidCameraState);
                awaitOpenCameraResult = this.retryingCameraStateOpener.c(cameraId, this);
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } else {
            awaitOpenCameraResult = new AwaitOpenCameraResult(cameraDeviceWrapper, androidCameraState);
        }
        if (awaitOpenCameraResult.getCameraDeviceWrapper() == null || awaitOpenCameraResult.getAndroidCameraState() == null) {
            if (!kVar.b()) {
                return null;
            }
            io.sentry.android.core.c2.e("CXCP", "Failed to retain an opened camera device!");
            return null;
        }
        if (shouldCreateEmptyCaptureSession) {
            k.h hVar2 = k.h.f107050a;
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                if (kVar.a()) {
                    h.v.f(cameraId);
                }
                g(awaitOpenCameraResult.getCameraDeviceWrapper());
                kVar.a();
                oq.i0 i0Var = oq.i0.f148189a;
            } finally {
                Trace.endSection();
            }
        }
        return new oq.r<>(awaitOpenCameraResult.getCameraDeviceWrapper(), awaitOpenCameraResult.getAndroidCameraState());
    }

    @Override // i.x1
    public void b(m2 cameraDeviceWrapper, CameraDevice cameraDevice, g androidCameraState, n0 audioRestrictionController, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession) throws Throwable {
        CameraDevice cameraDevice2 = cameraDeviceWrapper != null ? (CameraDevice) cameraDeviceWrapper.c0(fr.q0.c(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                f(cameraDevice, androidCameraState);
                return;
            }
            return;
        }
        h.v.Companion companion = h.v.INSTANCE;
        String strB = h.v.b(cameraDevice2.getId());
        if (cameraDevice != null && !fr.t.c(strB, cameraDevice.getId())) {
            throw new IllegalStateException(("Unwrapped camera device has camera ID " + strB + ", but the wrapped camera device has camera ID " + cameraDevice.getId() + '!').toString());
        }
        if (Build.VERSION.SDK_INT >= 30) {
            audioRestrictionController.c(cameraDeviceWrapper);
        }
        CameraDevice cameraDevice3 = cameraDevice2;
        oq.r<m2, g> rVarH = h(cameraDeviceWrapper, cameraDevice3, androidCameraState, shouldReopenCamera, shouldCreateEmptyCaptureSession);
        if (rVarH == null) {
            if (k.k.f107055a.b()) {
                io.sentry.android.core.c2.e("CXCP", "Failed to handle quirks before closing the camera device!");
            }
            cameraDeviceWrapper.E();
            cameraDeviceWrapper.n0();
            androidCameraState.m(cameraDevice3);
            return;
        }
        m2 m2VarA = rVarH.a();
        g gVarB = rVarH.b();
        Object objC0 = m2VarA.c0(fr.q0.c(CameraDevice.class));
        if (objC0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cameraDeviceWrapper.E();
        f((CameraDevice) objC0, gVarB);
        cameraDeviceWrapper.n0();
        if (shouldReopenCamera) {
            androidCameraState.m(cameraDevice3);
        }
    }
}
