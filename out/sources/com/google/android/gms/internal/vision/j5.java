package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class j5 implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<String> f31108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h5 f31109b;

    j5(h5 h5Var) {
        this.f31109b = h5Var;
        this.f31108a = h5Var.f31067a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31108a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f31108a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
