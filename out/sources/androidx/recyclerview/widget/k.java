package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f13388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f13390e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f13393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f13394i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f13386a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f13391f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f13392g = 0;

    k() {
    }

    boolean a(RecyclerView.b0 b0Var) {
        int i15 = this.f13388c;
        return i15 >= 0 && i15 < b0Var.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f13388c);
        this.f13388c += this.f13389d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f13387b + ", mCurrentPosition=" + this.f13388c + ", mItemDirection=" + this.f13389d + ", mLayoutDirection=" + this.f13390e + ", mStartLine=" + this.f13391f + ", mEndLine=" + this.f13392g + '}';
    }
}
