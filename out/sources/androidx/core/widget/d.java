package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    static class a {
        static void a(EdgeEffect edgeEffect, float f15, float f16) {
            edgeEffect.onPull(f15, f16);
        }
    }

    private static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f15, float f16) {
            try {
                return edgeEffect.onPullDistance(f15, f16);
            } catch (Throwable unused) {
                edgeEffect.onPull(f15, f16);
                return 0.0f;
            }
        }
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f15, float f16) {
        a.a(edgeEffect, f15, f16);
    }

    public static float d(EdgeEffect edgeEffect, float f15, float f16) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f15, f16);
        }
        c(edgeEffect, f15, f16);
        return f15;
    }
}
