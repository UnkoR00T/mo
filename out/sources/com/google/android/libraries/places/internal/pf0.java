package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f33319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg0 f33320b;

    pf0(cg0 cg0Var, l90 l90Var) {
        this.f33319a = l90Var;
        Objects.requireNonNull(cg0Var);
        this.f33320b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList(this.f33320b.P());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((hi0) arrayList.get(i15)).c(this.f33319a);
        }
    }
}
