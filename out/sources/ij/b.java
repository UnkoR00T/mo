package ij;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static TypedValue a(Context context, int i15) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i15, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i15, boolean z15) {
        TypedValue typedValueA = a(context, i15);
        if (typedValueA == null || typedValueA.type != 18) {
            return z15;
        }
        return typedValueA.data != 0;
    }

    public static int c(Context context, int i15, int i16) {
        TypedValue typedValueA = a(context, i15);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(i16) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int d(Context context, int i15, int i16) {
        TypedValue typedValueA = a(context, i15);
        return (typedValueA == null || typedValueA.type != 16) ? i16 : typedValueA.data;
    }

    public static int e(Context context) {
        return c(context, ri.b.f173927v, ri.d.f173957j0);
    }

    public static int f(Context context, int i15, String str) {
        return g(context, i15, str).data;
    }

    public static TypedValue g(Context context, int i15, String str) {
        TypedValue typedValueA = a(context, i15);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i15)));
    }

    public static TypedValue h(View view, int i15) {
        return g(view.getContext(), i15, view.getClass().getCanonicalName());
    }
}
