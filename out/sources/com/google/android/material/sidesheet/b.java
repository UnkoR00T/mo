package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f35508a;

    b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f35508a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i15) {
        float fD = d();
        return (fD - i15) / (fD - c());
    }

    @Override // com.google.android.material.sidesheet.d
    int c() {
        return Math.max(0, (d() - this.f35508a.Y()) - this.f35508a.d0());
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return this.f35508a.g0();
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return this.f35508a.g0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int g(V v15) {
        return v15.getLeft() - this.f35508a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.d
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean j(float f15) {
        return f15 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(float f15, float f16) {
        return e.a(f15, f16) && Math.abs(f15) > ((float) this.f35508a.h0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(View view, float f15) {
        return Math.abs(((float) view.getRight()) + (f15 * this.f35508a.b0())) > this.f35508a.c0();
    }

    @Override // com.google.android.material.sidesheet.d
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i15, int i16) {
        int iG0 = this.f35508a.g0();
        if (i15 <= iG0) {
            marginLayoutParams.rightMargin = iG0 - i15;
        }
    }
}
