package com.google.android.material.appbar;

import android.view.View;
import j6.l0;

/* JADX INFO: loaded from: classes4.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f34737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34742f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34743g = true;

    public f(View view) {
        this.f34737a = view;
    }

    void a() {
        View view = this.f34737a;
        l0.R(view, this.f34740d - (view.getTop() - this.f34738b));
        View view2 = this.f34737a;
        l0.Q(view2, this.f34741e - (view2.getLeft() - this.f34739c));
    }

    public int b() {
        return this.f34740d;
    }

    void c() {
        this.f34738b = this.f34737a.getTop();
        this.f34739c = this.f34737a.getLeft();
    }

    public boolean d(int i15) {
        if (!this.f34743g || this.f34741e == i15) {
            return false;
        }
        this.f34741e = i15;
        a();
        return true;
    }

    public boolean e(int i15) {
        if (!this.f34742f || this.f34740d == i15) {
            return false;
        }
        this.f34740d = i15;
        a();
        return true;
    }
}
