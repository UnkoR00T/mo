package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oh0 f32478a;

    hh0(oh0 oh0Var) {
        Objects.requireNonNull(oh0Var);
        this.f32478a = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        oh0 oh0Var = this.f32478a;
        if (oh0Var.l().get() == uh0.f33906i0) {
            oh0Var.l().set(null);
        }
        uh0 uh0Var = oh0Var.f33184d;
        if (uh0Var.r() != null) {
            Iterator it = uh0Var.r().iterator();
            while (it.hasNext()) {
                ((nh0) it.next()).e("Channel is forcefully shutdown", null);
            }
        }
        th0 th0VarV = uh0Var.v();
        l90 l90Var = uh0.f33902e0;
        th0VarV.a(l90Var);
        synchronized (th0VarV.f33791a) {
            arrayList = new ArrayList(th0VarV.f33792b);
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((gb0) arrayList.get(i15)).t(l90Var);
        }
        th0VarV.f33794d.u().c(l90Var);
    }
}
