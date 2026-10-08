package com.google.android.material.bottomsheet;

import android.view.View;
import j6.a1;
import j6.f1;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class a extends a1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f34890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f34893f;

    public a(View view) {
        super(0);
        this.f34893f = new int[2];
        this.f34890c = view;
    }

    @Override // j6.a1.b
    public void c(a1 a1Var) {
        this.f34890c.setTranslationY(0.0f);
    }

    @Override // j6.a1.b
    public void d(a1 a1Var) {
        this.f34890c.getLocationOnScreen(this.f34893f);
        this.f34891d = this.f34893f[1];
    }

    @Override // j6.a1.b
    public f1 e(f1 f1Var, List<a1> list) {
        for (a1 a1Var : list) {
            if ((a1Var.d() & f1.p.d()) != 0) {
                this.f34890c.setTranslationY(si.a.c(this.f34892e, 0, a1Var.c()));
                break;
            }
        }
        return f1Var;
    }

    @Override // j6.a1.b
    public a1.a f(a1 a1Var, a1.a aVar) {
        this.f34890c.getLocationOnScreen(this.f34893f);
        int i15 = this.f34891d - this.f34893f[1];
        this.f34892e = i15;
        this.f34890c.setTranslationY(i15);
        return aVar;
    }
}
