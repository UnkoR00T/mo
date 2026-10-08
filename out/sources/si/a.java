package si;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f181916a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f181917b = new l7.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f181918c = new l7.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f181919d = new l7.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f181920e = new DecelerateInterpolator();

    public static float a(float f15, float f16, float f17) {
        return f15 + (f17 * (f16 - f15));
    }

    public static float b(float f15, float f16, float f17, float f18, float f19) {
        if (f19 <= f17) {
            return f15;
        }
        return f19 >= f18 ? f16 : a(f15, f16, (f19 - f17) / (f18 - f17));
    }

    public static int c(int i15, int i16, float f15) {
        return i15 + Math.round(f15 * (i16 - i15));
    }
}
