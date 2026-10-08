package bj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import ij.b;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import x5.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static int a(int i15, int i16) {
        return c.k(i15, (Color.alpha(i15) * i16) / GF2Field.MASK);
    }

    public static int b(Context context, int i15, int i16) {
        Integer numF = f(context, i15);
        return numF != null ? numF.intValue() : i16;
    }

    public static int c(Context context, int i15, String str) {
        return l(context, b.g(context, i15, str));
    }

    public static int d(View view, int i15) {
        return l(view.getContext(), b.h(view, i15));
    }

    public static int e(View view, int i15, int i16) {
        return b(view.getContext(), i15, i16);
    }

    public static Integer f(Context context, int i15) {
        TypedValue typedValueA = b.a(context, i15);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i15) {
        TypedValue typedValueA = b.a(context, i15);
        if (typedValueA == null) {
            return null;
        }
        int i16 = typedValueA.resourceId;
        if (i16 != 0) {
            return u5.a.e(context, i16);
        }
        int i17 = typedValueA.data;
        if (i17 != 0) {
            return ColorStateList.valueOf(i17);
        }
        return null;
    }

    public static boolean h(int i15) {
        return i15 != 0 && c.d(i15) > 0.5d;
    }

    public static int i(int i15, int i16) {
        return c.g(i16, i15);
    }

    public static int j(int i15, int i16, float f15) {
        return i(i15, c.k(i16, Math.round(Color.alpha(i16) * f15)));
    }

    public static int k(View view, int i15, int i16, float f15) {
        return j(d(view, i15), d(view, i16), f15);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i15 = typedValue.resourceId;
        return i15 != 0 ? u5.a.d(context, i15) : typedValue.data;
    }
}
