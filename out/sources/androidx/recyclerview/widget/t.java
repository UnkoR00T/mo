package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f13417g = true;

    @SuppressLint({"UnknownNullness"})
    public final void A(RecyclerView.f0 f0Var) {
        I(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void B(RecyclerView.f0 f0Var) {
        J(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void C(RecyclerView.f0 f0Var, boolean z15) {
        K(f0Var, z15);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void D(RecyclerView.f0 f0Var, boolean z15) {
        L(f0Var, z15);
    }

    @SuppressLint({"UnknownNullness"})
    public final void E(RecyclerView.f0 f0Var) {
        M(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.f0 f0Var) {
        N(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.f0 f0Var) {
        O(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.f0 f0Var) {
        P(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void I(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void J(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void K(RecyclerView.f0 f0Var, boolean z15) {
    }

    @SuppressLint({"UnknownNullness"})
    public void L(RecyclerView.f0 f0Var, boolean z15) {
    }

    @SuppressLint({"UnknownNullness"})
    public void M(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.f0 f0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i15;
        int i16;
        return (cVar == null || ((i15 = cVar.f13124a) == (i16 = cVar2.f13124a) && cVar.f13125b == cVar2.f13125b)) ? w(f0Var) : y(f0Var, i15, cVar.f13125b, i16, cVar2.f13125b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i15;
        int i16;
        int i17 = cVar.f13124a;
        int i18 = cVar.f13125b;
        if (f0Var2.L()) {
            int i19 = cVar.f13124a;
            i16 = cVar.f13125b;
            i15 = i19;
        } else {
            i15 = cVar2.f13124a;
            i16 = cVar2.f13125b;
        }
        return x(f0Var, f0Var2, i17, i18, i15, i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i15 = cVar.f13124a;
        int i16 = cVar.f13125b;
        View view = f0Var.f13091a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f13124a;
        int top = cVar2 == null ? view.getTop() : cVar2.f13125b;
        if (f0Var.x() || (i15 == left && i16 == top)) {
            return z(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f0Var, i15, i16, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i15 = cVar.f13124a;
        int i16 = cVar2.f13124a;
        if (i15 != i16 || cVar.f13125b != cVar2.f13125b) {
            return y(f0Var, i15, cVar.f13125b, i16, cVar2.f13125b);
        }
        E(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.f0 f0Var) {
        return !this.f13417g || f0Var.v();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean w(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i15, int i16, int i17, int i18);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.f0 f0Var, int i15, int i16, int i17, int i18);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.f0 f0Var);
}
