package ie;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class f implements be.v<Bitmap>, be.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f91897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.d f91898b;

    public f(Bitmap bitmap, ce.d dVar) {
        this.f91897a = (Bitmap) ve.k.e(bitmap, "Bitmap must not be null");
        this.f91898b = (ce.d) ve.k.e(dVar, "BitmapPool must not be null");
    }

    public static f e(Bitmap bitmap, ce.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // be.r
    public void a() {
        this.f91897a.prepareToDraw();
    }

    @Override // be.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f91897a;
    }

    @Override // be.v
    public void c() {
        this.f91898b.c(this.f91897a);
    }

    @Override // be.v
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // be.v
    public int getSize() {
        return ve.l.h(this.f91897a);
    }
}
