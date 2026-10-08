package ie;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements be.v<BitmapDrawable>, be.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f91957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final be.v<Bitmap> f91958b;

    private w(Resources resources, be.v<Bitmap> vVar) {
        this.f91957a = (Resources) ve.k.d(resources);
        this.f91958b = (be.v) ve.k.d(vVar);
    }

    public static be.v<BitmapDrawable> e(Resources resources, be.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new w(resources, vVar);
    }

    @Override // be.r
    public void a() {
        be.v<Bitmap> vVar = this.f91958b;
        if (vVar instanceof be.r) {
            ((be.r) vVar).a();
        }
    }

    @Override // be.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f91957a, this.f91958b.get());
    }

    @Override // be.v
    public void c() {
        this.f91958b.c();
    }

    @Override // be.v
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // be.v
    public int getSize() {
        return this.f91958b.getSize();
    }
}
