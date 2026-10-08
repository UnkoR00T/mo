package j6;

import android.view.View;
import android.view.ViewParent;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    static class a {
        static boolean a(ViewParent viewParent, View view, float f15, float f16, boolean z15) {
            return viewParent.onNestedFling(view, f15, f16, z15);
        }

        static boolean b(ViewParent viewParent, View view, float f15, float f16) {
            return viewParent.onNestedPreFling(view, f15, f16);
        }

        static void c(ViewParent viewParent, View view, int i15, int i16, int[] iArr) {
            viewParent.onNestedPreScroll(view, i15, i16, iArr);
        }

        static void d(ViewParent viewParent, View view, int i15, int i16, int i17, int i18) {
            viewParent.onNestedScroll(view, i15, i16, i17, i18);
        }

        static void e(ViewParent viewParent, View view, View view2, int i15) {
            viewParent.onNestedScrollAccepted(view, view2, i15);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i15) {
            return viewParent.onStartNestedScroll(view, view2, i15);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f15, float f16, boolean z15) {
        try {
            return a.a(viewParent, view, f15, f16, z15);
        } catch (AbstractMethodError e15) {
            c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e15);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f15, float f16) {
        try {
            return a.b(viewParent, view, f15, f16);
        } catch (AbstractMethodError e15) {
            c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e15);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i15, int i16, int[] iArr, int i17) {
        if (viewParent instanceof v) {
            ((v) viewParent).k(view, i15, i16, iArr, i17);
            return;
        }
        if (i17 == 0) {
            try {
                a.c(viewParent, view, i15, i16, iArr);
            } catch (AbstractMethodError e15) {
                c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e15);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        if (viewParent instanceof w) {
            ((w) viewParent).m(view, i15, i16, i17, i18, i19, iArr);
            return;
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (viewParent instanceof v) {
            ((v) viewParent).n(view, i15, i16, i17, i18, i19);
            return;
        }
        if (i19 == 0) {
            try {
                a.d(viewParent, view, i15, i16, i17, i18);
            } catch (AbstractMethodError e15) {
                c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e15);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i15, int i16) {
        if (viewParent instanceof v) {
            ((v) viewParent).c(view, view2, i15, i16);
            return;
        }
        if (i16 == 0) {
            try {
                a.e(viewParent, view, view2, i15);
            } catch (AbstractMethodError e15) {
                c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e15);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i15, int i16) {
        if (viewParent instanceof v) {
            return ((v) viewParent).p(view, view2, i15, i16);
        }
        if (i16 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i15);
        } catch (AbstractMethodError e15) {
            c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e15);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i15) {
        if (viewParent instanceof v) {
            ((v) viewParent).j(view, i15);
            return;
        }
        if (i15 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e15) {
                c2.f("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e15);
            }
        }
    }
}
