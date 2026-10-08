package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class f90 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g90 f32269a;

    f90(g90 g90Var) {
        this.f32269a = g90Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g90 g90Var = this.f32269a;
        g90Var.b(obj);
        g90Var.b(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
