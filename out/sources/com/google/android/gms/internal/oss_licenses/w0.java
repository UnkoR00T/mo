package com.google.android.gms.internal.oss_licenses;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class w0 extends p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ x0 f30922d;

    w0(x0 x0Var) {
        Objects.requireNonNull(x0Var);
        this.f30922d = x0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i15) {
        x0 x0Var = this.f30922d;
        g0.c(i15, x0Var.A(), "index");
        int i16 = i15 + i15;
        Object obj = x0Var.w()[i16];
        Objects.requireNonNull(obj);
        Object obj2 = x0Var.w()[i16 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30922d.A();
    }
}
