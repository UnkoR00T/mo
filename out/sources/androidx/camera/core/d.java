package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;
import v.g2;

/* JADX INFO: loaded from: classes.dex */
class d implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageReader f9231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9232b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9233c = true;

    d(ImageReader imageReader) {
        this.f9231a = imageReader;
    }

    public static /* synthetic */ void b(final d dVar, Executor executor, final g2.a aVar, ImageReader imageReader) {
        synchronized (dVar.f9232b) {
            try {
                if (!dVar.f9233c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h(this.f9229a, aVar);
                        }
                    });
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static /* synthetic */ void h(d dVar, g2.a aVar) {
        dVar.getClass();
        aVar.a(dVar);
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // v.g2
    public int a() {
        int maxImages;
        synchronized (this.f9232b) {
            maxImages = this.f9231a.getMaxImages();
        }
        return maxImages;
    }

    @Override // v.g2
    public o c() {
        Image imageAcquireLatestImage;
        synchronized (this.f9232b) {
            try {
                imageAcquireLatestImage = this.f9231a.acquireLatestImage();
            } catch (RuntimeException e15) {
                if (!i(e15)) {
                    throw e15;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // v.g2
    public void close() {
        synchronized (this.f9232b) {
            this.f9231a.close();
        }
    }

    @Override // v.g2
    public int d() {
        int imageFormat;
        synchronized (this.f9232b) {
            imageFormat = this.f9231a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // v.g2
    public void e() {
        synchronized (this.f9232b) {
            this.f9233c = true;
            this.f9231a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // v.g2
    public void f(final g2.a aVar, final Executor executor) {
        synchronized (this.f9232b) {
            this.f9233c = false;
            this.f9231a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.b(this.f9226a, executor, aVar, imageReader);
                }
            }, y.n.a());
        }
    }

    @Override // v.g2
    public o g() {
        Image imageAcquireNextImage;
        synchronized (this.f9232b) {
            try {
                imageAcquireNextImage = this.f9231a.acquireNextImage();
            } catch (RuntimeException e15) {
                if (!i(e15)) {
                    throw e15;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }

    @Override // v.g2
    public int getHeight() {
        int height;
        synchronized (this.f9232b) {
            height = this.f9231a.getHeight();
        }
        return height;
    }

    @Override // v.g2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f9232b) {
            surface = this.f9231a.getSurface();
        }
        return surface;
    }

    @Override // v.g2
    public int l() {
        int width;
        synchronized (this.f9232b) {
            width = this.f9231a.getWidth();
        }
        return width;
    }
}
