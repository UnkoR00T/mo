package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f9482a = Math.cos(Math.toRadians(45.0d));

    static float a(float f15, float f16, boolean z15) {
        return z15 ? (float) (((double) f15) + ((1.0d - f9482a) * ((double) f16))) : f15;
    }

    static float b(float f15, float f16, boolean z15) {
        return z15 ? (float) (((double) (f15 * 1.5f)) + ((1.0d - f9482a) * ((double) f16))) : f15 * 1.5f;
    }
}
