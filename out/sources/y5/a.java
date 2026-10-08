package y5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    static class C6004a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f15, float f16) {
            drawable.setHotspot(f15, f16);
        }

        static void f(Drawable drawable, int i15, int i16, int i17, int i18) {
            drawable.setHotspotBounds(i15, i16, i17, i18);
        }

        static void g(Drawable drawable, int i15) {
            drawable.setTint(i15);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i15) {
            return drawable.setLayoutDirection(i15);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        C6004a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return C6004a.b(drawable);
    }

    public static void c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    @Deprecated
    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(Drawable drawable) {
        return C6004a.c(drawable);
    }

    public static int f(Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C6004a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @Deprecated
    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @Deprecated
    public static void j(Drawable drawable, boolean z15) {
        drawable.setAutoMirrored(z15);
    }

    public static void k(Drawable drawable, float f15, float f16) {
        C6004a.e(drawable, f15, f16);
    }

    public static void l(Drawable drawable, int i15, int i16, int i17, int i18) {
        C6004a.f(drawable, i15, i16, i17, i18);
    }

    public static boolean m(Drawable drawable, int i15) {
        return b.b(drawable, i15);
    }

    public static void n(Drawable drawable, int i15) {
        C6004a.g(drawable, i15);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        C6004a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        C6004a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof c ? (T) ((c) drawable).a() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return drawable;
    }
}
