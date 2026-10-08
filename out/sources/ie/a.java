package ie;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class a<DataType> implements zd.j<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.j<DataType, Bitmap> f91868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f91869b;

    public a(Resources resources, zd.j<DataType, Bitmap> jVar) {
        this.f91869b = (Resources) ve.k.d(resources);
        this.f91868a = (zd.j) ve.k.d(jVar);
    }

    @Override // zd.j
    public boolean a(DataType datatype, zd.h hVar) {
        return this.f91868a.a(datatype, hVar);
    }

    @Override // zd.j
    public be.v<BitmapDrawable> b(DataType datatype, int i15, int i16, zd.h hVar) {
        return w.e(this.f91869b, this.f91868a.b(datatype, i15, i16, hVar));
    }
}
