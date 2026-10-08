package i;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u001d\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0017¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Li/c;", "Li/k2;", "Li/m2;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraCaptureSession", "Lm/d;", "cameraErrorListener", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Li/m2;Landroid/hardware/camera2/CameraCaptureSession;Lm/d;Landroid/os/Handler;)V", "", "T", "()Z", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "listener", "", "L2", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "", "requests", "r0", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "B1", "e2", "stopRepeating", "Li/l3;", "outputConfigs", "L1", "(Ljava/util/List;)Z", "", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "a", "Li/m2;", "n1", "()Li/m2;", "b", "Landroid/hardware/camera2/CameraCaptureSession;", "c", "Lm/d;", "d", "Landroid/os/Handler;", "Lh/w$a;", "e", "I", "D0", "()I", "id", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "inputSurface", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m2 device;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CameraCaptureSession cameraCaptureSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler callbackHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int id = h.w.a();

    public c(m2 m2Var, CameraCaptureSession cameraCaptureSession, m.d dVar, Handler handler) {
        this.device = m2Var;
        this.cameraCaptureSession = cameraCaptureSession;
        this.cameraErrorListener = dVar;
        this.callbackHandler = handler;
    }

    @Override // i.k2
    public Integer B1(List<CaptureRequest> requests, CameraCaptureSession.CaptureCallback listener) {
        Integer numValueOf;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#setRepeatingBurst-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingBurst(requests, listener, this.callbackHandler));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return numValueOf;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    @Override // i.k2
    /* JADX INFO: renamed from: D0, reason: from getter */
    public int getId() {
        return this.id;
    }

    @Override // i.k2
    public boolean L1(List<? extends l3> outputConfigs) throws Throwable {
        double d15;
        oq.i0 i0Var;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#finalizeOutputConfigurations-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                CameraCaptureSession cameraCaptureSession = this.cameraCaptureSession;
                List<? extends l3> list = outputConfigs;
                d15 = 1000000.0d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((l3) it.next()).c0(fr.q0.c(OutputConfiguration.class)));
                        }
                        u.c(cameraCaptureSession, arrayList);
                        i0Var = oq.i0.f148189a;
                    } catch (Exception e15) {
                        e = e15;
                        if (e instanceof CameraAccessException) {
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.m(), false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            k.k.f107055a.a();
                        }
                        i0Var = null;
                    }
                    Trace.endSection();
                    long jC = k.i.c(hVar.g().a() - jA);
                    if (k.k.f107055a.a()) {
                        k.c0 c0Var = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, 1));
                    }
                    return i0Var != null;
                } catch (Throwable th4) {
                    th = th4;
                    Trace.endSection();
                    long jC2 = k.i.c(hVar.g().a() - jA);
                    if (k.k.f107055a.a()) {
                        k.c0 c0Var2 = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / d15)}, 1));
                    }
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                d15 = 1000000.0d;
            }
        } catch (Throwable th5) {
            th = th5;
            d15 = 1000000.0d;
        }
    }

    @Override // i.k2
    public Integer L2(CaptureRequest request, CameraCaptureSession.CaptureCallback listener) {
        Integer numValueOf;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#capture-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.capture(request, listener, this.callbackHandler));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return numValueOf;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0144, please report this as an issue */
    @Override // i.k2
    public boolean T() throws Throwable {
        long jC;
        double d15;
        oq.i0 i0Var;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#abortCaptures-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.abortCaptures();
                i0Var = oq.i0.f148189a;
                d15 = 1000000.0d;
            } catch (Exception e15) {
                try {
                    if (e15 instanceof CameraAccessException) {
                        if (k.k.f107055a.d()) {
                            StringBuilder sb5 = new StringBuilder();
                            d15 = 1000000.0d;
                            sb5.append("Failed to execute call: Camera encountered an error: ");
                            sb5.append(e15.getMessage());
                            io.sentry.android.core.c2.g("CXCP", sb5.toString());
                        } else {
                            d15 = 1000000.0d;
                        }
                        dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                    } else {
                        d15 = 1000000.0d;
                        if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
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
                    }
                    i0Var = null;
                } catch (Throwable th4) {
                    th = th4;
                    Trace.endSection();
                    jC = k.i.c(hVar.g().a() - jA);
                    if (k.k.f107055a.a()) {
                        k.c0 c0Var = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                    }
                    throw th;
                }
            }
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / d15)}, 1));
            }
            return i0Var != null;
        } catch (Throwable th5) {
            th = th5;
            Trace.endSection();
            jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var3 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            throw th;
        }
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(CameraCaptureSession.class))) {
            return (T) this.cameraCaptureSession;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.cameraCaptureSession.close();
    }

    @Override // i.k2
    public Integer e2(CaptureRequest request, CameraCaptureSession.CaptureCallback listener) {
        Integer numValueOf;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#setRepeatingRequest-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingRequest(request, listener, this.callbackHandler));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return numValueOf;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    @Override // i.k2
    public Surface getInputSurface() {
        return this.cameraCaptureSession.getInputSurface();
    }

    @Override // i.k2
    /* JADX INFO: renamed from: n1, reason: from getter */
    public m2 getDevice() {
        return this.device;
    }

    @Override // i.k2
    public Integer r0(List<CaptureRequest> requests, CameraCaptureSession.CaptureCallback listener) {
        Integer numValueOf;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#captureBurst-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                numValueOf = Integer.valueOf(this.cameraCaptureSession.captureBurst(requests, listener, this.callbackHandler));
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
                numValueOf = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return numValueOf;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0144, please report this as an issue */
    @Override // i.k2
    public boolean stopRepeating() throws Throwable {
        long jC;
        double d15;
        oq.i0 i0Var;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#stopRepeating-" + getDevice().getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getDevice().getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.stopRepeating();
                i0Var = oq.i0.f148189a;
                d15 = 1000000.0d;
            } catch (Exception e15) {
                try {
                    if (e15 instanceof CameraAccessException) {
                        if (k.k.f107055a.d()) {
                            StringBuilder sb5 = new StringBuilder();
                            d15 = 1000000.0d;
                            sb5.append("Failed to execute call: Camera encountered an error: ");
                            sb5.append(e15.getMessage());
                            io.sentry.android.core.c2.g("CXCP", sb5.toString());
                        } else {
                            d15 = 1000000.0d;
                        }
                        dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                    } else {
                        d15 = 1000000.0d;
                        if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
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
                    }
                    i0Var = null;
                } catch (Throwable th4) {
                    th = th4;
                    Trace.endSection();
                    jC = k.i.c(hVar.g().a() - jA);
                    if (k.k.f107055a.a()) {
                        k.c0 c0Var = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                    }
                    throw th;
                }
            }
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / d15)}, 1));
            }
            return i0Var != null;
        } catch (Throwable th5) {
            th = th5;
            Trace.endSection();
            jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var3 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            throw th;
        }
    }
}
