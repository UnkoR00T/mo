package ne;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import be.v;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.d f134847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f134848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e<me.c, byte[]> f134849c;

    public c(ce.d dVar, e<Bitmap, byte[]> eVar, e<me.c, byte[]> eVar2) {
        this.f134847a = dVar;
        this.f134848b = eVar;
        this.f134849c = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v<me.c> b(v<Drawable> vVar) {
        return vVar;
    }

    @Override // ne.e
    public v<byte[]> a(v<Drawable> vVar, h hVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f134848b.a(ie.f.e(((BitmapDrawable) drawable).getBitmap(), this.f134847a), hVar);
        }
        if (drawable instanceof me.c) {
            return this.f134849c.a(b(vVar), hVar);
        }
        return null;
    }
}
