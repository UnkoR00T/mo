package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class t2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v2 f30898b;

    t2(v2 v2Var) {
        Objects.requireNonNull(v2Var);
        this.f30898b = v2Var;
        this.f30897a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f30897a;
        v2 v2Var = this.f30898b;
        return i15 < v2Var.f() - v2Var.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i15 = this.f30897a;
        v2 v2Var = this.f30898b;
        if (i15 >= v2Var.f() - v2Var.e()) {
            throw new NoSuchElementException();
        }
        w2 w2Var = v2Var.f30921b;
        Object obj = w2Var.b()[v2Var.e() + i15];
        this.f30897a = i15 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
