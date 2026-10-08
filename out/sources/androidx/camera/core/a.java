package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import o.b1;
import o.w0;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f9222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0192a[] f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f9224c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0192a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Image.Plane f9225a;

        C0192a(Image.Plane plane) {
            this.f9225a = plane;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer v() {
            return this.f9225a.getBuffer();
        }

        @Override // androidx.camera.core.o.a
        public int w() {
            return this.f9225a.getRowStride();
        }

        @Override // androidx.camera.core.o.a
        public int x() {
            return this.f9225a.getPixelStride();
        }
    }

    a(Image image) {
        this.f9222a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f9223b = new C0192a[planes.length];
            for (int i15 = 0; i15 < planes.length; i15++) {
                this.f9223b[i15] = new C0192a(planes[i15]);
            }
        } else {
            this.f9223b = new C0192a[0];
        }
        this.f9224c = b1.b(t3.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f9222a.close();
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f9222a.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f9222a.getHeight();
    }

    @Override // androidx.camera.core.o
    public int l() {
        return this.f9222a.getWidth();
    }

    @Override // androidx.camera.core.o
    public Image m0() {
        return this.f9222a;
    }

    @Override // androidx.camera.core.o
    public o.a[] o2() {
        return this.f9223b;
    }

    @Override // androidx.camera.core.o
    public w0 v3() {
        return this.f9224c;
    }

    @Override // androidx.camera.core.o
    public void y1(Rect rect) {
        this.f9222a.setCropRect(rect);
    }
}
