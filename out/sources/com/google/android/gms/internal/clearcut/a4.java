package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class a4 implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<String> f29182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ y3 f29183b;

    a4(y3 y3Var) {
        this.f29183b = y3Var;
        this.f29182a = y3Var.f29607a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29182a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f29182a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
