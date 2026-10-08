package fb;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f60572a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f60573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f60574c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f15) {
            view.setTransitionAlpha(f15);
        }
    }

    c0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f60572a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f60572a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(View view, int i15, int i16, int i17, int i18) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f15) {
        if (f60572a) {
            try {
                a.b(view, f15);
                return;
            } catch (NoSuchMethodError unused) {
                f60572a = false;
            }
        }
        view.setAlpha(f15);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(View view, int i15) {
        if (!f60574c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f60573b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f60574c = true;
        }
        Field field = f60573b;
        if (field != null) {
            try {
                f60573b.setInt(view, i15 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
