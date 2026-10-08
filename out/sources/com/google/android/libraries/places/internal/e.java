package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f32125b;

    e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f32125b = fVar;
        this.f32124a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f32124a;
        f fVar = this.f32125b;
        return i15 < fVar.f() - fVar.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i15 = this.f32124a;
        f fVar = this.f32125b;
        if (i15 >= fVar.f() - fVar.e()) {
            throw new NoSuchElementException();
        }
        g gVar = fVar.f32241b;
        Object obj = gVar.b()[fVar.e() + i15];
        this.f32124a = i15 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
