package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class q extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f13410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f13411e;

    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.a0
        protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            q qVar = q.this;
            int[] iArrC = qVar.c(qVar.f13418a.getLayoutManager(), view);
            int i15 = iArrC[0];
            int i16 = iArrC[1];
            int iW = w(Math.max(Math.abs(i15), Math.abs(i16)));
            if (iW > 0) {
                aVar.d(i15, i16, iW, this.f13396j);
            }
        }

        @Override // androidx.recyclerview.widget.l
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.l
        protected int x(int i15) {
            return Math.min(100, super.x(i15));
        }
    }

    private int k(View view, p pVar) {
        return (pVar.g(view) + (pVar.e(view) / 2)) - (pVar.m() + (pVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, p pVar2) {
        int iO = pVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = pVar2.m() + (pVar2.n() / 2);
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iO; i16++) {
            View viewN = pVar.N(i16);
            int iAbs = Math.abs((pVar2.g(viewN) + (pVar2.e(viewN) / 2)) - iM);
            if (iAbs < i15) {
                view = viewN;
                i15 = iAbs;
            }
        }
        return view;
    }

    private p m(RecyclerView.p pVar) {
        p pVar2 = this.f13411e;
        if (pVar2 == null || pVar2.f13407a != pVar) {
            this.f13411e = p.a(pVar);
        }
        return this.f13411e;
    }

    private p n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private p o(RecyclerView.p pVar) {
        p pVar2 = this.f13410d;
        if (pVar2 == null || pVar2.f13407a != pVar) {
            this.f13410d = p.c(pVar);
        }
        return this.f13410d;
    }

    private boolean p(RecyclerView.p pVar, int i15, int i16) {
        if (pVar.p()) {
            return i15 > 0;
        }
        return i16 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF pointFD;
        int iA = pVar.a();
        if (!(pVar instanceof RecyclerView.a0.b) || (pointFD = ((RecyclerView.a0.b) pVar).d(iA - 1)) == null) {
            return false;
        }
        return pointFD.x < 0.0f || pointFD.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.u
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u
    protected RecyclerView.a0 d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.f13418a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.p pVar) {
        if (pVar.q()) {
            return l(pVar, o(pVar));
        }
        if (pVar.p()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.p pVar, int i15, int i16) {
        p pVarN;
        int iA = pVar.a();
        if (iA == 0 || (pVarN = n(pVar)) == null) {
            return -1;
        }
        int iO = pVar.O();
        View view = null;
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i19 = 0; i19 < iO; i19++) {
            View viewN = pVar.N(i19);
            if (viewN != null) {
                int iK = k(viewN, pVarN);
                if (iK <= 0 && iK > i18) {
                    view2 = viewN;
                    i18 = iK;
                }
                if (iK >= 0 && iK < i17) {
                    view = viewN;
                    i17 = iK;
                }
            }
        }
        boolean zP = p(pVar, i15, i16);
        if (zP && view != null) {
            return pVar.l0(view);
        }
        if (!zP && view2 != null) {
            return pVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = pVar.l0(view) + (q(pVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iA) {
            return -1;
        }
        return iL0;
    }
}
