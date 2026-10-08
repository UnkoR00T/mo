package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29186a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a0 f29188c;

    b0(a0 a0Var) {
        this.f29188c = a0Var;
        this.f29187b = a0Var.size();
    }

    private final byte b() {
        try {
            a0 a0Var = this.f29188c;
            int i15 = this.f29186a;
            this.f29186a = i15 + 1;
            return a0Var.s(i15);
        } catch (IndexOutOfBoundsException e15) {
            throw new NoSuchElementException(e15.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29186a < this.f29187b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
