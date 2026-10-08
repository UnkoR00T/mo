package com.google.android.libraries.places.internal;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class g61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f32367a = fi.i.f64102c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f32368b = {fi.a.f64024z, fi.a.f64017s, fi.a.f64020v, fi.a.f64015q, fi.a.f64016r, fi.a.f64022x, fi.a.f64014p, fi.a.f64009k, fi.a.f64010l, fi.a.f64011m, fi.a.f64019u, fi.a.f64012n, fi.a.f64018t, fi.a.f64008j, fi.a.f64007i, fi.a.f64004f, fi.a.f64005g, fi.a.f64021w, fi.a.f64013o, fi.a.f64023y, fi.a.f64006h};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f32369c = {fi.a.O, fi.a.N, fi.a.S, fi.a.R, fi.a.Q, fi.a.P, fi.a.V, fi.a.U, fi.a.T};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f32370d = {fi.a.I, fi.a.L, fi.a.K, fi.a.J, fi.a.H, fi.a.M};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f32371e = {fi.a.f63999a, fi.a.f64000b, fi.a.f64001c};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f32372f = {fi.a.A, fi.a.B, fi.a.C, fi.a.G, fi.a.E, fi.a.D, fi.a.F};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f32373g = {fi.a.f64003e, fi.a.f64002d};

    public static final boolean a(Context context, int i15) {
        return g(context, i15, f32373g);
    }

    public static final boolean b(Context context, int i15) {
        return g(context, i15, f32368b);
    }

    public static final boolean c(Context context, int i15) {
        return g(context, i15, f32371e);
    }

    public static final boolean d(Context context, int i15) {
        return g(context, i15, f32372f);
    }

    public static final boolean e(Context context, int i15) {
        return g(context, i15, f32370d);
    }

    public static final boolean f(Context context, int i15) {
        return g(context, i15, f32369c);
    }

    private static final boolean g(Context context, int i15, int[] iArr) {
        int i16 = f32367a;
        if (i15 == i16) {
            return false;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i16);
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, i15);
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        for (int i17 : iArr) {
            contextThemeWrapper.getTheme().resolveAttribute(i17, typedValue, true);
            if (!contextThemeWrapper2.getTheme().resolveAttribute(i17, typedValue2, true)) {
                return false;
            }
            if (typedValue.data != typedValue2.data) {
                return true;
            }
        }
        return false;
    }
}
