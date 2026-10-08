package fb;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class f0 extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f60597g = true;

    static class a {
        static void a(View view, int i15) {
            view.setTransitionVisibility(i15);
        }
    }

    f0() {
    }

    @Override // fb.c0
    @SuppressLint({"NewApi"})
    public void f(View view, int i15) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i15);
        } else if (f60597g) {
            try {
                a.a(view, i15);
            } catch (NoSuchMethodError unused) {
                f60597g = false;
            }
        }
    }
}
