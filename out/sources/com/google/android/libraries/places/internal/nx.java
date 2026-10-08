package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nx extends ox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ tx f33100c;

    nx(tx txVar) {
        Objects.requireNonNull(txVar);
        this.f33100c = txVar;
        this.f33098a = 0;
        this.f33099b = txVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33098a < this.f33099b;
    }

    @Override // com.google.android.libraries.places.internal.qx
    public final byte zza() {
        int i15 = this.f33098a;
        if (i15 >= this.f33099b) {
            throw new NoSuchElementException();
        }
        this.f33098a = i15 + 1;
        return this.f33100c.e(i15);
    }
}
