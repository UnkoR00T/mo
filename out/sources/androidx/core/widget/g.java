package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static class a {
        static void a(PopupWindow popupWindow, boolean z15) {
            popupWindow.setOverlapAnchor(z15);
        }

        static void b(PopupWindow popupWindow, int i15) {
            popupWindow.setWindowLayoutType(i15);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z15) {
        a.a(popupWindow, z15);
    }

    public static void b(PopupWindow popupWindow, int i15) {
        a.b(popupWindow, i15);
    }

    @Deprecated
    public static void c(PopupWindow popupWindow, View view, int i15, int i16, int i17) {
        popupWindow.showAsDropDown(view, i15, i16, i17);
    }
}
