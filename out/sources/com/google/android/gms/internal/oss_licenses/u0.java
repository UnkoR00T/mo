package com.google.android.gms.internal.oss_licenses;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30907b;

    u0(Object obj) {
        this.f30906a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f30907b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f30907b) {
            throw new NoSuchElementException();
        }
        this.f30907b = true;
        return this.f30906a;
    }
}
