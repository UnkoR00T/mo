package lj;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    static e a(int i15) {
        if (i15 != 0) {
            return i15 != 1 ? b() : new f();
        }
        return new k();
    }

    static e b() {
        return new k();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f15) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).f0(f15);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            f(view, (h) background);
        }
    }

    public static void f(View view, h hVar) {
        if (hVar.W()) {
            hVar.k0(com.google.android.material.internal.q.f(view));
        }
    }
}
