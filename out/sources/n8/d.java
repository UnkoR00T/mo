package n8;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m8.t;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f133492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f133493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f133494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f133495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SurfaceTexture f133496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Surface f133497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133499h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f133500j;

    public interface a {
        void E(Surface surface);
    }

    public static /* synthetic */ void a(d dVar) {
        Surface surface = dVar.f133497f;
        if (surface != null) {
            Iterator<a> it = dVar.f133492a.iterator();
            while (it.hasNext()) {
                it.next().E(surface);
            }
        }
        b(dVar.f133496e, surface);
        dVar.f133496e = null;
        dVar.f133497f = null;
    }

    private static void b(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void d() {
        boolean z15 = this.f133498g && this.f133499h;
        Sensor sensor = this.f133494c;
        if (sensor == null || z15 == this.f133500j) {
            return;
        }
        if (z15) {
            this.f133493b.registerListener((SensorEventListener) null, sensor, 0);
        } else {
            this.f133493b.unregisterListener((SensorEventListener) null);
        }
        this.f133500j = z15;
    }

    public void c(a aVar) {
        this.f133492a.remove(aVar);
    }

    public n8.a getCameraMotionListener() {
        return null;
    }

    public t getVideoFrameMetadataListener() {
        return null;
    }

    public Surface getVideoSurface() {
        return this.f133497f;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f133495d.post(new Runnable() { // from class: n8.c
            @Override // java.lang.Runnable
            public final void run() {
                d.a(this.f133491a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f133499h = false;
        d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f133499h = true;
        d();
    }

    public void setDefaultStereoMode(int i15) {
        throw null;
    }

    public void setUseSensorRotation(boolean z15) {
        this.f133498g = z15;
        d();
    }
}
