package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f35427a = {p007NuL.m.f333z};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f35428b = {ri.b.f173911f};

    public static void a(Context context) {
        e(context, f35427a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i15, int i16) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.Q6, i15, i16);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(ri.l.S6, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z15) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(ri.b.f173918m, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f35428b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16, int... iArr2) {
        boolean zF;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.Q6, i15, i16);
        if (!typedArrayObtainStyledAttributes.getBoolean(ri.l.T6, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(ri.l.R6, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i15, i16, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i15, i16);
        for (int i17 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i17, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return ij.b.b(context, ri.b.f173917l, false);
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i15 = 0; i15 < iArr.length; i15++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i15)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16, int... iArr2) {
        b(context, attributeSet, i15, i16);
        d(context, attributeSet, iArr, i15, i16, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i15, i16);
    }

    public static z0 j(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16, int... iArr2) {
        b(context, attributeSet, i15, i16);
        d(context, attributeSet, iArr, i15, i16, iArr2);
        return z0.v(context, attributeSet, iArr, i15, i16);
    }
}
