package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f13418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f13419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f13420c = new a();

    class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f13421a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i15) {
            super.a(recyclerView, i15);
            if (i15 == 0 && this.f13421a) {
                this.f13421a = false;
                u.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i15, int i16) {
            if (i15 == 0 && i16 == 0) {
                return;
            }
            this.f13421a = true;
        }
    }

    private void e() {
        this.f13418a.h1(this.f13420c);
        this.f13418a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f13418a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f13418a.n(this.f13420c);
        this.f13418a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i15, int i16) {
        RecyclerView.a0 a0VarD;
        int iG;
        if (!(pVar instanceof RecyclerView.a0.b) || (a0VarD = d(pVar)) == null || (iG = g(pVar, i15, i16)) == -1) {
            return false;
        }
        a0VarD.p(iG);
        pVar.N1(a0VarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i15, int i16) {
        RecyclerView.p layoutManager = this.f13418a.getLayoutManager();
        if (layoutManager == null || this.f13418a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f13418a.getMinFlingVelocity();
        return (Math.abs(i16) > minFlingVelocity || Math.abs(i15) > minFlingVelocity) && i(layoutManager, i15, i16);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13418a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f13418a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f13419b = new Scroller(this.f13418a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.a0 d(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.p pVar, int i15, int i16);

    void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f13418a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i15 = iArrC[0];
        if (i15 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f13418a.v1(i15, iArrC[1]);
    }
}
