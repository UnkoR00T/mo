package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35881a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f35882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ej.a f35884c;

        a(View view, int i15, ej.a aVar) {
            this.f35882a = view;
            this.f35883b = i15;
            this.f35884c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f35882a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f35881a == this.f35883b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ej.a aVar = this.f35884c;
                expandableBehavior.H((View) aVar, this.f35882a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f35881a = 0;
    }

    private boolean F(boolean z15) {
        if (!z15) {
            return this.f35881a == 1;
        }
        int i15 = this.f35881a;
        return i15 == 0 || i15 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ej.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = listR.get(i15);
            if (e(coordinatorLayout, view, view2)) {
                return (ej.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z15, boolean z16);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ej.a aVar = (ej.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f35881a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i15) {
        ej.a aVarG;
        if (view.isLaidOut() || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i16 = aVarG.a() ? 1 : 2;
        this.f35881a = i16;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i16, aVarG));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35881a = 0;
    }
}
