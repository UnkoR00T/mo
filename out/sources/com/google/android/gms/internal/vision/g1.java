package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements Comparator<e1> {
    g1() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(e1 e1Var, e1 e1Var2) {
        e1 e1Var3 = e1Var;
        e1 e1Var4 = e1Var2;
        j1 j1Var = (j1) e1Var3.iterator();
        j1 j1Var2 = (j1) e1Var4.iterator();
        while (j1Var.hasNext() && j1Var2.hasNext()) {
            int iCompare = Integer.compare(e1.t(j1Var.zza()), e1.t(j1Var2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(e1Var3.f(), e1Var4.f());
    }
}
