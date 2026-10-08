package ie;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements zd.l<Bitmap> {
    @Override // zd.l
    public final be.v<Bitmap> a(Context context, be.v<Bitmap> vVar, int i15, int i16) {
        if (!ve.l.t(i15, i16)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i15 + " or height: " + i16 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        ce.d dVarF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = vVar.get();
        if (i15 == Integer.MIN_VALUE) {
            i15 = bitmap.getWidth();
        }
        if (i16 == Integer.MIN_VALUE) {
            i16 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarF, bitmap, i15, i16);
        return bitmap.equals(bitmapC) ? vVar : f.e(bitmapC, dVarF);
    }

    protected abstract Bitmap c(ce.d dVar, Bitmap bitmap, int i15, int i16);
}
