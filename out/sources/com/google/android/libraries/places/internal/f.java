package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f32240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f32241b;

    f(g gVar, int i15) {
        Objects.requireNonNull(gVar);
        this.f32241b = gVar;
        this.f32240a = i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f32241b.b(), e(), f(), obj, this.f32240a == -1 ? g.f32354f : i.f32518b) >= 0;
    }

    final int e() {
        int i15 = this.f32240a;
        if (i15 == -1) {
            return 0;
        }
        return this.f32241b.c()[i15];
    }

    final int f() {
        return this.f32241b.c()[this.f32240a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return f() - e();
    }
}
