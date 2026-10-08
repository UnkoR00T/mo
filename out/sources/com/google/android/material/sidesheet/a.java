package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f35507a;

    a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f35507a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i15) {
        float fD = d();
        return (i15 - fD) / (c() - fD);
    }

    @Override // com.google.android.material.sidesheet.d
    int c() {
        return Math.max(0, this.f35507a.f0() + this.f35507a.d0());
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return (-this.f35507a.Y()) - this.f35507a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return this.f35507a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return -this.f35507a.Y();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int g(V v15) {
        return v15.getRight() + this.f35507a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean j(float f15) {
        return f15 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(float f15, float f16) {
        return e.a(f15, f16) && Math.abs(f15) > ((float) this.f35507a.h0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(View view, float f15) {
        return Math.abs(((float) view.getLeft()) + (f15 * this.f35507a.b0())) > this.f35507a.c0();
    }

    @Override // com.google.android.material.sidesheet.d
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i15, int i16) {
        if (i15 <= this.f35507a.g0()) {
            marginLayoutParams.leftMargin = i16;
        }
    }
}
