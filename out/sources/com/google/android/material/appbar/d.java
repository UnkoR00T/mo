package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j6.f1;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
abstract class d extends e<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Rect f34730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f34731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34733g;

    public d() {
        this.f34730d = new Rect();
        this.f34731e = new Rect();
        this.f34732f = 0;
    }

    private static int N(int i15) {
        if (i15 == 0) {
            return 8388659;
        }
        return i15;
    }

    @Override // com.google.android.material.appbar.e
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i15) {
        View viewH = H(coordinatorLayout.r(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i15);
            this.f34732f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f34730d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        f1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f34731e;
        Gravity.apply(N(fVar.f11785c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i15);
        int I = I(viewH);
        view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
        this.f34732f = rect2.top - viewH.getBottom();
    }

    abstract View H(List<View> list);

    final int I(View view) {
        if (this.f34733g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i15 = this.f34733g;
        return c6.a.b((int) (fJ * i15), 0, i15);
    }

    float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f34733g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f34732f;
    }

    public final void O(int i15) {
        this.f34733g = i15;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i15, int i16, int i17, int i18) {
        View viewH;
        f1 lastWindowInsets;
        int i19 = view.getLayoutParams().height;
        if ((i19 != -1 && i19 != -2) || (viewH = H(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i17);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewH.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iL -= measuredHeight;
        }
        coordinatorLayout.J(view, i15, i16, View.MeasureSpec.makeMeasureSpec(iL, i19 == -1 ? 1073741824 : PKIFailureInfo.systemUnavail), i18);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34730d = new Rect();
        this.f34731e = new Rect();
        this.f34732f = 0;
    }
}
