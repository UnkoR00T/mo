package gj;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import ri.l;
import x5.j;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    private static float a(String[] strArr, int i15) {
        float f15 = Float.parseFloat(strArr[i15]);
        if (f15 >= 0.0f && f15 <= 1.0f) {
            return f15;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f15);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, "cubic-bezier")) {
            if (e(str, "path")) {
                return new PathInterpolator(j.e(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(String str) {
        return e(str, "cubic-bezier") || e(str, "path");
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append("(");
        return str.startsWith(sb5.toString()) && str.endsWith(")");
    }

    public static int f(Context context, int i15, int i16) {
        return ij.b.d(context, i15, i16);
    }

    public static TimeInterpolator g(Context context, int i15, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i15, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    public static z6.j h(Context context, int i15, int i16) {
        TypedValue typedValueA = ij.b.a(context, i15);
        TypedArray typedArrayObtainStyledAttributes = typedValueA == null ? context.obtainStyledAttributes(null, l.f174233r3, 0, i16) : context.obtainStyledAttributes(typedValueA.resourceId, l.f174233r3);
        z6.j jVar = new z6.j();
        try {
            float f15 = typedArrayObtainStyledAttributes.getFloat(l.f174249t3, Float.MIN_VALUE);
            if (f15 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f16 = typedArrayObtainStyledAttributes.getFloat(l.f174241s3, Float.MIN_VALUE);
            if (f16 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            jVar.h(f15);
            jVar.f(f16);
            typedArrayObtainStyledAttributes.recycle();
            return jVar;
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }
}
