package n3;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln3/y0;", "", "<init>", "()V", "", "width", "height", "Ln3/c2;", "bitmapConfig", "", "hasAlpha", "Lo3/c;", "colorSpace", "Landroid/graphics/Bitmap;", "a", "(IIIZLo3/c;)Landroid/graphics/Bitmap;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f131104a = new y0();

    private y0() {
    }

    public static final Bitmap a(int width, int height, int bitmapConfig, boolean hasAlpha, o3.c colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, l0.d(bitmapConfig), hasAlpha, h0.a(colorSpace));
    }
}
