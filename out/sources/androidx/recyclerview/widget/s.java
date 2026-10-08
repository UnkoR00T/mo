package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class s {
    static int a(RecyclerView.b0 b0Var, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z15) {
        if (pVar2.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z15) {
            return Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1;
        }
        return Math.min(pVar.n(), pVar.d(view2) - pVar.g(view));
    }

    static int b(RecyclerView.b0 b0Var, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z15, boolean z16) {
        if (pVar2.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z16 ? Math.max(0, (b0Var.b() - Math.max(pVar2.l0(view), pVar2.l0(view2))) - 1) : Math.max(0, Math.min(pVar2.l0(view), pVar2.l0(view2)));
        if (z15) {
            return Math.round((iMax * (Math.abs(pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1))) + (pVar.m() - pVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.b0 b0Var, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z15) {
        if (pVar2.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z15) {
            return b0Var.b();
        }
        return (int) (((pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.l0(view) - pVar2.l0(view2)) + 1)) * b0Var.b());
    }
}
