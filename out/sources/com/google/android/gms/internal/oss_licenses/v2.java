package com.google.android.gms.internal.oss_licenses;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v2 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f30920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ w2 f30921b;

    v2(w2 w2Var, int i15) {
        Objects.requireNonNull(w2Var);
        this.f30921b = w2Var;
        this.f30920a = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f30921b.b(), e(), f(), obj, this.f30920a == -1 ? w2.f30923f : y2.f30946b) >= 0;
    }

    final int e() {
        if (this.f30920a == -1) {
            return 0;
        }
        return this.f30921b.c()[0];
    }

    final int f() {
        return this.f30921b.c()[this.f30920a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return f() - e();
    }
}
