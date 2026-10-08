package j6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    static class a {
        static MenuItem a(MenuItem menuItem, char c15, int i15) {
            return menuItem.setAlphabeticShortcut(c15, i15);
        }

        static MenuItem b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem e(MenuItem menuItem, char c15, int i15) {
            return menuItem.setNumericShortcut(c15, i15);
        }

        static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, b bVar) {
        if (menuItem instanceof a6.b) {
            return ((a6.b) menuItem).a(bVar);
        }
        c2.g("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c15, int i15) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setAlphabeticShortcut(c15, i15);
        } else {
            a.a(menuItem, c15, i15);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setContentDescription(charSequence);
        } else {
            a.b(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setIconTintList(colorStateList);
        } else {
            a.c(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setIconTintMode(mode);
        } else {
            a.d(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c15, int i15) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setNumericShortcut(c15, i15);
        } else {
            a.e(menuItem, c15, i15);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a6.b) {
            ((a6.b) menuItem).setTooltipText(charSequence);
        } else {
            a.f(menuItem, charSequence);
        }
    }
}
