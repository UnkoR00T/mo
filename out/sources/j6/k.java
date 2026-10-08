package j6;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static void a(int i15, int i16, int i17, Rect rect, Rect rect2, int i18) {
        Gravity.apply(i15, i16, i17, rect, rect2, i18);
    }

    public static int b(int i15, int i16) {
        return Gravity.getAbsoluteGravity(i15, i16);
    }
}
