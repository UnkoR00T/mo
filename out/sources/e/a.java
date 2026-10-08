package e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Le/a;", "Lg/f;", "Lv/p1;", "config", "<init>", "(Lv/p1;)V", "", "valueIfMissing", "j0", "(I)I", "", "s0", "(Ljava/lang/Long;)Ljava/lang/Long;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "k0", "(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "q0", "(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "o0", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "", "m0", "(Ljava/lang/String;)Ljava/lang/String;", "i0", "()Lg/f;", "captureRequestOptions", ip.a.f96137b, "a", "b", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends g.f {
    public static final v.p1.a<Integer> T = v.p1.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final v.p1.a<CameraDevice.StateCallback> U = v.p1.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final v.p1.a<CameraCaptureSession.StateCallback> V = v.p1.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final v.p1.a<CameraCaptureSession.CaptureCallback> W = v.p1.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final v.p1.a<Long> X;
    public static final v.p1.a<Long> Y;
    public static final v.p1.a<Object> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final v.p1.a<String> f45702a0;

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00002\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006\""}, d2 = {"Le/a$a;", "Lo/j0;", "Le/a;", "<init>", "()V", "Lv/t2;", "a", "()Lv/t2;", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "value", "g", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Le/a$a;", "", "", "values", "Lv/p1$c;", "priority", "b", "(Ljava/util/Map;Lv/p1$c;)Le/a$a;", "", "keys", "f", "(Ljava/util/List;)Le/a$a;", "Lv/p1;", "config", "e", "(Lv/p1;)Le/a$a;", "c", "()Le/a;", "Lv/u2;", "Lv/u2;", "mutableOptionsBundle", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1050a implements o.j0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final v.u2 mutableOptionsBundle = v.u2.l0();

        @Override // o.j0
        public v.t2 a() {
            return this.mutableOptionsBundle;
        }

        public final C1050a b(Map<CaptureRequest.Key<?>, ? extends Object> values, v.p1.c priority) {
            for (Map.Entry<CaptureRequest.Key<?>, ? extends Object> entry : values.entrySet()) {
                CaptureRequest.Key<?> key = entry.getKey();
                Object value = entry.getValue();
                this.mutableOptionsBundle.e0(b.a(key), priority, value);
            }
            return this;
        }

        public a c() {
            return new a(z2.k0(this.mutableOptionsBundle));
        }

        public final C1050a e(v.p1 config) {
            for (v.p1.a<?> aVar : config.b()) {
                this.mutableOptionsBundle.e0(aVar, config.c(aVar), config.d(aVar));
            }
            return this;
        }

        public final C1050a f(List<? extends CaptureRequest.Key<?>> keys) {
            Iterator<T> it = keys.iterator();
            while (it.hasNext()) {
                this.mutableOptionsBundle.n0(b.a((CaptureRequest.Key) it.next()));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> C1050a g(CaptureRequest.Key<ValueT> key, ValueT value) {
            this.mutableOptionsBundle.m(b.a(key), value);
            return this;
        }
    }

    static {
        Class cls = Long.TYPE;
        X = v.p1.a.a("camera2.cameraCaptureSession.streamUseCase", cls);
        Y = v.p1.a.a("camera2.cameraCaptureSession.streamUseHint", cls);
        Z = v.p1.a.a("camera2.captureRequest.tag", Object.class);
        f45702a0 = v.p1.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);
    }

    public a(v.p1 p1Var) {
        super(p1Var);
    }

    public static /* synthetic */ CameraDevice.StateCallback l0(a aVar, CameraDevice.StateCallback stateCallback, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            stateCallback = null;
        }
        return aVar.k0(stateCallback);
    }

    public static /* synthetic */ String n0(a aVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = null;
        }
        return aVar.m0(str);
    }

    public static /* synthetic */ CameraCaptureSession.CaptureCallback p0(a aVar, CameraCaptureSession.CaptureCallback captureCallback, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            captureCallback = null;
        }
        return aVar.o0(captureCallback);
    }

    public static /* synthetic */ CameraCaptureSession.StateCallback r0(a aVar, CameraCaptureSession.StateCallback stateCallback, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            stateCallback = null;
        }
        return aVar.q0(stateCallback);
    }

    public static /* synthetic */ Long t0(a aVar, Long l15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            l15 = null;
        }
        return aVar.s0(l15);
    }

    public final g.f i0() {
        return g.f.a.INSTANCE.b(getConfig()).b();
    }

    public final int j0(int valueIfMissing) {
        return ((Number) getConfig().f(T, Integer.valueOf(valueIfMissing))).intValue();
    }

    public final CameraDevice.StateCallback k0(CameraDevice.StateCallback valueIfMissing) {
        return (CameraDevice.StateCallback) getConfig().f(U, valueIfMissing);
    }

    public final String m0(String valueIfMissing) {
        return (String) getConfig().f(f45702a0, valueIfMissing);
    }

    public final CameraCaptureSession.CaptureCallback o0(CameraCaptureSession.CaptureCallback valueIfMissing) {
        return (CameraCaptureSession.CaptureCallback) getConfig().f(W, valueIfMissing);
    }

    public final CameraCaptureSession.StateCallback q0(CameraCaptureSession.StateCallback valueIfMissing) {
        return (CameraCaptureSession.StateCallback) getConfig().f(V, valueIfMissing);
    }

    public final Long s0(Long valueIfMissing) {
        return (Long) getConfig().f(X, valueIfMissing);
    }
}
