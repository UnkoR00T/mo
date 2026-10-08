package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.s4;

/* JADX INFO: loaded from: classes3.dex */
public class s4<M extends s4<M>> extends w4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected t4 f29537b;

    @Override // com.google.android.gms.internal.clearcut.w4
    public void b(q4 q4Var) {
        if (this.f29537b == null) {
            return;
        }
        for (int i15 = 0; i15 < this.f29537b.c(); i15++) {
            this.f29537b.e(i15).c(q4Var);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.w4
    protected int g() {
        if (this.f29537b != null) {
            for (int i15 = 0; i15 < this.f29537b.c(); i15++) {
                this.f29537b.e(i15).e();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: i */
    public /* synthetic */ w4 clone() {
        return (s4) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public M clone() {
        M m15 = (M) super.clone();
        v4.h(this, m15);
        return m15;
    }
}
