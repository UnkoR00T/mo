package fb;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class e0 extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f60596f = true;

    static class a {
        static void a(View view, int i15, int i16, int i17, int i18) {
            view.setLeftTopRightBottom(i15, i16, i17, i18);
        }
    }

    e0() {
    }

    @Override // fb.c0
    @SuppressLint({"NewApi"})
    public void d(View view, int i15, int i16, int i17, int i18) {
        if (f60596f) {
            try {
                a.a(view, i15, i16, i17, i18);
            } catch (NoSuchMethodError unused) {
                f60596f = false;
            }
        }
    }
}
