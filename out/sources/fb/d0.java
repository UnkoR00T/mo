package fb;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class d0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f60578d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f60579e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    d0() {
    }

    @Override // fb.c0
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f60578d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f60578d = false;
            }
        }
    }

    @Override // fb.c0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f60579e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f60579e = false;
            }
        }
    }
}
