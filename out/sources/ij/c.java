package ij;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.z0;
import p082nUL.y;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i15) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i15) || (resourceId = typedArray.getResourceId(i15, 0)) == 0 || (colorStateListA = y.a(context, resourceId)) == null) ? typedArray.getColorStateList(i15) : colorStateListA;
    }

    public static ColorStateList b(Context context, z0 z0Var, int i15) {
        int iN;
        ColorStateList colorStateListA;
        return (!z0Var.s(i15) || (iN = z0Var.n(i15, 0)) == 0 || (colorStateListA = y.a(context, iN)) == null) ? z0Var.c(i15) : colorStateListA;
    }

    public static int c(Context context, TypedArray typedArray, int i15, int i16) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i15, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i15, i16);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i16);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i15) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i15) || (resourceId = typedArray.getResourceId(i15, 0)) == 0 || (drawableB = y.b(context, resourceId)) == null) ? typedArray.getDrawable(i15) : drawableB;
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int f(TypedArray typedArray, int i15, int i16) {
        return typedArray.hasValue(i15) ? i15 : i16;
    }

    public static d g(Context context, TypedArray typedArray, int i15) {
        int resourceId;
        if (!typedArray.hasValue(i15) || (resourceId = typedArray.getResourceId(i15, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
