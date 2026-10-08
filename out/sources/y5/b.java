package y5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final Bitmap a(Drawable drawable, int i15, int i16, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i15 == bitmapDrawable.getBitmap().getWidth() && i16 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i15, i16, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i17 = bounds.left;
        int i18 = bounds.top;
        int i19 = bounds.right;
        int i25 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i15, i16, config);
        drawable.setBounds(0, 0, i15, i16);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i17, i18, i19, i25);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i15, int i16, Bitmap.Config config, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = drawable.getIntrinsicWidth();
        }
        if ((i17 & 2) != 0) {
            i16 = drawable.getIntrinsicHeight();
        }
        if ((i17 & 4) != 0) {
            config = null;
        }
        return a(drawable, i15, i16, config);
    }
}
