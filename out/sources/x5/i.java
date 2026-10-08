package x5;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<i6.d<Rect, Rect>> f216817a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, x5.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, aVar != null ? x5.b.C5776b.a(aVar) : null);
            return true;
        }
        if (aVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = x5.b.a(aVar);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
