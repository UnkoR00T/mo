package androidx.appcompat.widget;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f8878a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f8879b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f8880c = new Rect();

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 29 || i15 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f8878a);
        } else {
            drawable.setState(f8879b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode d(int i15, PorterDuff.Mode mode) {
        if (i15 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i15 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i15 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i15) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
