package n3;

import android.graphics.Bitmap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Ln3/b2;", "c", "(Landroid/graphics/Bitmap;)Ln3/b2;", "", "width", "height", "Ln3/c2;", "config", "", "hasAlpha", "Lo3/c;", "colorSpace", "a", "(IIIZLo3/c;)Ln3/b2;", "b", "(Ln3/b2;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {
    public static final b2 a(int i15, int i16, int i17, boolean z15, o3.c cVar) {
        d(i17);
        return new k0(y0.a(i15, i16, i17, z15, cVar));
    }

    public static final Bitmap b(b2 b2Var) {
        if (b2Var instanceof k0) {
            return ((k0) b2Var).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final b2 c(Bitmap bitmap) {
        return new k0(bitmap);
    }

    public static final Bitmap.Config d(int i15) {
        c2.Companion companion = c2.INSTANCE;
        if (c2.i(i15, companion.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (c2.i(i15, companion.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (c2.i(i15, companion.e())) {
            return Bitmap.Config.RGB_565;
        }
        if (c2.i(i15, companion.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        return c2.i(i15, companion.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return c2.INSTANCE.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return c2.INSTANCE.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return c2.INSTANCE.b();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return c2.INSTANCE.c();
        }
        return config == Bitmap.Config.HARDWARE ? c2.INSTANCE.d() : c2.INSTANCE.b();
    }
}
