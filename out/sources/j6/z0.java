package j6;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    static class a {
        static void a(Window window, boolean z15) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z15 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static void a(Window window, boolean z15) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z15 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z15);
        }
    }

    static class c {
        static void a(Window window, boolean z15) {
            window.setDecorFitsSystemWindows(z15);
        }
    }

    public static i1 a(Window window, View view) {
        return new i1(window, view);
    }

    public static void b(Window window, boolean z15) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 35) {
            c.a(window, z15);
        } else if (i15 >= 30) {
            b.a(window, z15);
        } else {
            a.a(window, z15);
        }
    }
}
