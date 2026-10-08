package x20;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes5.dex */
public class f implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f216524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f216525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f216526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SurfaceTexture f216527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f216528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f216529f;

    public f(e eVar) {
        this.f216524a = eVar;
    }

    g a() {
        return this.f216525b;
    }

    void b() {
        this.f216525b = new g(this.f216527d, this.f216524a, this.f216528e, this.f216529f);
    }

    void c(j jVar) {
        this.f216526c = jVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i15, int i16) {
        this.f216527d = surfaceTexture;
        this.f216528e = i15;
        this.f216529f = i16;
        b();
        j jVar = this.f216526c;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f216526c.b();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i15, int i16) {
        this.f216525b.o(i15, i16);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
