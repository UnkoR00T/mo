package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f13700b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f13701a;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0290a implements Comparator<int[]> {
        C0290a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f13700b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f13701a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i15;
        int bottom;
        int i16;
        int iO = this.f13701a.O();
        if (iO == 0) {
            return true;
        }
        boolean z15 = this.f13701a.p2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iO, 2);
        for (int i17 = 0; i17 < iO; i17++) {
            View viewN = this.f13701a.N(i17);
            if (viewN == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewN.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f13700b;
            int[] iArr2 = iArr[i17];
            if (z15) {
                top = viewN.getLeft();
                i15 = marginLayoutParams.leftMargin;
            } else {
                top = viewN.getTop();
                i15 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i15;
            int[] iArr3 = iArr[i17];
            if (z15) {
                bottom = viewN.getRight();
                i16 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewN.getBottom();
                i16 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i16;
        }
        Arrays.sort(iArr, new C0290a());
        for (int i18 = 1; i18 < iO; i18++) {
            if (iArr[i18 - 1][1] != iArr[i18][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i19 = iArr4[1];
        int i25 = iArr4[0];
        return i25 <= 0 && iArr[iO - 1][1] >= i19 - i25;
    }

    private boolean b() {
        int iO = this.f13701a.O();
        for (int i15 = 0; i15 < iO; i15++) {
            if (c(this.f13701a.N(i15))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (c(viewGroup.getChildAt(i15))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f13701a.O() <= 1) && b();
    }
}
