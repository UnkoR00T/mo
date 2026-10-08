package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f9069a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f9070b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f9071c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f9072d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f9073e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f9074f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f9075g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f9076h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f9077i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f9078j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p007NuL.v.f553y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(p007NuL.v.D0)) {
                c2.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i15) {
        ColorStateList colorStateListE = e(context, i15);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f9070b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i15, typedValueF.getFloat());
    }

    public static int c(Context context, int i15) {
        int[] iArr = f9078j;
        iArr[0] = i15;
        z0 z0VarU = z0.u(context, null, iArr);
        try {
            return z0VarU.b(0, 0);
        } finally {
            z0VarU.x();
        }
    }

    static int d(Context context, int i15, float f15) {
        int iC = c(context, i15);
        return x5.c.k(iC, Math.round(Color.alpha(iC) * f15));
    }

    public static ColorStateList e(Context context, int i15) {
        int[] iArr = f9078j;
        iArr[0] = i15;
        z0 z0VarU = z0.u(context, null, iArr);
        try {
            return z0VarU.c(0);
        } finally {
            z0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f9069a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
