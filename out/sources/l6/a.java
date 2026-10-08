package l6;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l6.a$a, reason: collision with other inner class name */
    static class C2817a {
        static Interpolator a(float f15, float f16, float f17, float f18) {
            return new PathInterpolator(f15, f16, f17, f18);
        }
    }

    public static Interpolator a(float f15, float f16, float f17, float f18) {
        return C2817a.a(f15, f16, f17, f18);
    }
}
