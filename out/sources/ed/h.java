package ed;

import ad.Size;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Led/h;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "Lad/g;", "size", "Lad/f;", "scale", "maxSize", "c", "(ZLandroid/graphics/Bitmap;Lad/g;Lad/f;Lad/g;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lad/g;Lad/f;Lad/g;Z)Landroid/graphics/Bitmap;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f49463a = new h();

    private h() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == b.e(config);
    }

    private final boolean c(boolean allowInexactSize, Bitmap bitmap, Size size, ad.f scale, Size maxSize) {
        if (allowInexactSize) {
            return true;
        }
        long jB = oc.h.b(bitmap.getWidth(), bitmap.getHeight(), size, scale, maxSize);
        return oc.h.d(bitmap.getWidth(), bitmap.getHeight(), q.c(jB), q.d(jB), scale, maxSize) == 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final Bitmap a(Drawable drawable, Bitmap.Config config, Size size, ad.f scale, Size maxSize, boolean allowInexactSize) {
        Size size2;
        ad.f fVar;
        Size size3;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config)) {
                size2 = size;
                fVar = scale;
                size3 = maxSize;
                if (c(allowInexactSize, bitmap, size2, fVar, size3)) {
                    return bitmap;
                }
            } else {
                size2 = size;
                fVar = scale;
                size3 = maxSize;
            }
        } else {
            size2 = size;
            fVar = scale;
            size3 = maxSize;
        }
        Drawable drawableMutate = drawable.mutate();
        int iG = g0.g(drawableMutate);
        int i15 = iG > 0 ? iG : 512;
        int iB = g0.b(drawableMutate);
        int i16 = iB > 0 ? iB : 512;
        long jB = oc.h.b(i15, i16, size2, fVar, size3);
        double d15 = oc.h.d(i15, i16, q.c(jB), q.d(jB), fVar, size3);
        int iC = hr.a.c(((double) i15) * d15);
        int iC2 = hr.a.c(d15 * ((double) i16));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, b.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i17 = bounds.left;
        int i18 = bounds.top;
        int i19 = bounds.right;
        int i25 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i17, i18, i19, i25);
        return bitmapCreateBitmap;
    }
}
