package jj;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import io.sentry.android.core.c2;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import x5.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f103417a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f103418b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f103419c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f103420d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f103421e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f103422f = a.class.getSimpleName();

    private a() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f103418b;
        return new ColorStateList(new int[][]{f103420d, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f103419c), c(colorStateList, iArr), c(colorStateList, f103417a)});
    }

    private static int b(int i15) {
        return c.k(i15, Math.min(Color.alpha(i15) * 2, GF2Field.MASK));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        return b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f103421e, 0)) != 0) {
            c2.g(f103422f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z15 = false;
        boolean z16 = false;
        for (int i15 : iArr) {
            if (i15 == 16842910) {
                z15 = true;
            } else if (i15 == 16842908 || i15 == 16842919 || i15 == 16843623) {
                z16 = true;
            }
        }
        return z15 && z16;
    }
}
