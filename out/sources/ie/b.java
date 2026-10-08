package ie;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b implements zd.k<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.d f91874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.k<Bitmap> f91875b;

    public b(ce.d dVar, zd.k<Bitmap> kVar) {
        this.f91874a = dVar;
        this.f91875b = kVar;
    }

    @Override // zd.k
    public zd.c b(zd.h hVar) {
        return this.f91875b.b(hVar);
    }

    @Override // zd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(be.v<BitmapDrawable> vVar, File file, zd.h hVar) {
        return this.f91875b.a((Bitmap) new f(vVar.get().getBitmap(), this.f91874a), file, hVar);
    }
}
