package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
class e<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f34734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34736c;

    public e() {
        this.f34735b = 0;
        this.f34736c = 0;
    }

    public int E() {
        f fVar = this.f34734a;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        coordinatorLayout.I(v15, i15);
    }

    public boolean G(int i15) {
        f fVar = this.f34734a;
        if (fVar != null) {
            return fVar.e(i15);
        }
        this.f34735b = i15;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        F(coordinatorLayout, v15, i15);
        if (this.f34734a == null) {
            this.f34734a = new f(v15);
        }
        this.f34734a.c();
        this.f34734a.a();
        int i16 = this.f34735b;
        if (i16 != 0) {
            this.f34734a.e(i16);
            this.f34735b = 0;
        }
        int i17 = this.f34736c;
        if (i17 == 0) {
            return true;
        }
        this.f34734a.d(i17);
        this.f34736c = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34735b = 0;
        this.f34736c = 0;
    }
}
