package fb;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f60533a = true;

    static class a {
        static void a(ViewGroup viewGroup, boolean z15) {
            viewGroup.suppressLayout(z15);
        }
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z15) {
        if (f60533a) {
            try {
                a.a(viewGroup, z15);
            } catch (NoSuchMethodError unused) {
                f60533a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z15) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(viewGroup, z15);
        } else {
            a(viewGroup, z15);
        }
    }
}
