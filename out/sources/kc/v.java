package kc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\u00002\u00020\u0000*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f¨\u0006\u0011"}, d2 = {"Landroid/graphics/Bitmap;", "", "shareable", "Lkc/a;", "b", "(Landroid/graphics/Bitmap;Z)Lkc/a;", "Landroid/graphics/drawable/Drawable;", "Lkc/n;", "c", "(Landroid/graphics/drawable/Drawable;)Lkc/n;", "Landroid/content/res/Resources;", "resources", "a", "(Lkc/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Bitmap", "Landroid/graphics/Canvas;", "Canvas", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final Drawable a(n nVar, Resources resources) {
        if (nVar instanceof DrawableImage) {
            return ((DrawableImage) nVar).getDrawable();
        }
        return nVar instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) nVar).getBitmap()) : new o(nVar);
    }

    public static final BitmapImage b(Bitmap bitmap, boolean z15) {
        return new BitmapImage(bitmap, z15);
    }

    public static final n c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new DrawableImage(drawable, false);
    }

    public static /* synthetic */ BitmapImage d(Bitmap bitmap, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return b(bitmap, z15);
    }
}
