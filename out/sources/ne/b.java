package ne;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import be.v;
import ie.w;
import ve.k;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f134846a;

    public b(Resources resources) {
        this.f134846a = (Resources) k.d(resources);
    }

    @Override // ne.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, h hVar) {
        return w.e(this.f134846a, vVar);
    }
}
