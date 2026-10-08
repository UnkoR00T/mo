package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class c51 {
    public static int a(int i15, int i16, int i17) {
        return b(i15, i16, i17) ? i17 : i16;
    }

    public static boolean b(int i15, int i16, int i17) {
        double dE = e(i15);
        double d15 = d(e(i16), dE);
        return d15 <= 3.0d && d15 <= d(e(i17), dE);
    }

    public static void c(ImageView imageView, int i15) {
        Drawable drawable = imageView.getDrawable();
        int iRgb = Color.rgb(Color.red(i15), Color.green(i15), Color.blue(i15));
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(iRgb, PorterDuff.Mode.SRC_ATOP);
        drawableMutate.setAlpha(Color.alpha(i15));
    }

    private static double d(double d15, double d16) {
        return Math.round(((Math.max(d15, d16) + 0.05d) / (Math.min(d15, d16) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double e(int i15) {
        return (f(((double) Color.red(i15)) / 255.0d) * 0.2126d) + (f(((double) Color.green(i15)) / 255.0d) * 0.7152d) + (f(((double) Color.blue(i15)) / 255.0d) * 0.0722d);
    }

    private static double f(double d15) {
        return d15 <= 0.03928d ? d15 / 12.92d : Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
    }
}
