package k6;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public class r {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i15) {
        accessibilityRecord.setMaxScrollX(i15);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i15) {
        accessibilityRecord.setMaxScrollY(i15);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i15) {
        accessibilityRecord.setSource(view, i15);
    }
}
