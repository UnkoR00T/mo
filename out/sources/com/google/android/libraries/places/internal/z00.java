package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class z00 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f34458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b10 f34459d;

    /* synthetic */ z00(b10 b10Var, byte[] bArr) {
        Objects.requireNonNull(b10Var);
        this.f34459d = b10Var;
        this.f34456a = -1;
    }

    private final Iterator a() {
        if (this.f34458c == null) {
            this.f34458c = this.f34459d.l().entrySet().iterator();
        }
        return this.f34458c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f34456a + 1;
        b10 b10Var = this.f34459d;
        if (i15 >= b10Var.k()) {
            return !b10Var.l().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f34457b = true;
        int i15 = this.f34456a + 1;
        this.f34456a = i15;
        b10 b10Var = this.f34459d;
        return i15 < b10Var.k() ? (y00) b10Var.i()[i15] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f34457b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f34457b = false;
        b10 b10Var = this.f34459d;
        b10Var.h();
        int i15 = this.f34456a;
        if (i15 >= b10Var.k()) {
            a().remove();
        } else {
            this.f34456a = i15 - 1;
            b10Var.g(i15);
        }
    }
}
