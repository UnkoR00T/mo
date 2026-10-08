package k6;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static class a {
        static void a(AccessibilityEvent accessibilityEvent, boolean z15) {
            accessibilityEvent.setAccessibilityDataSensitive(z15);
        }
    }

    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, boolean z15) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.a(accessibilityEvent, z15);
        }
    }

    @Deprecated
    public static void c(AccessibilityEvent accessibilityEvent, int i15) {
        accessibilityEvent.setContentChangeTypes(i15);
    }
}
