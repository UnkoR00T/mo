package i;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Li/j1;", "Li/p2;", "Lnq/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lk/z;", "threads", "<init>", "(Lnq/a;Lk/z;)V", "Lh/v;", "cameraId", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "stateCallback", "Loq/i0;", "a", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Ltq/e;)Ljava/lang/Object;", "Lnq/a;", "b", "Lk/z;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<CameraManager> cameraManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    public j1(nq.a<CameraManager> aVar, k.z zVar) {
        this.cameraManager = aVar;
        this.threads = zVar;
    }

    @Override // i.p2
    @SuppressLint({"MissingPermission"})
    public Object a(String str, CameraDevice.StateCallback stateCallback, tq.e<? super oq.i0> eVar) {
        CameraManager cameraManager = this.cameraManager.get();
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(((Object) h.v.f(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                w.h(cameraManager, str, this.threads.h(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, this.threads.i());
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return oq.i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }
}
