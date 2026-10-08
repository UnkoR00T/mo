package j6;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f99698a;

    static class a {
        static List<Rect> a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static class c {
        static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    private j(DisplayCutout displayCutout) {
        this.f99698a = displayCutout;
    }

    static j h(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    public List<Rect> a() {
        return Build.VERSION.SDK_INT >= 28 ? a.a(this.f99698a) : Collections.EMPTY_LIST;
    }

    public Path b() {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.a(this.f99698a);
        }
        return null;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f99698a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f99698a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f99698a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return i6.c.a(this.f99698a, ((j) obj).f99698a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f99698a);
        }
        return 0;
    }

    public x5.h g() {
        return Build.VERSION.SDK_INT >= 30 ? x5.h.e(b.a(this.f99698a)) : x5.h.f216812e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f99698a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f99698a + "}";
    }
}
