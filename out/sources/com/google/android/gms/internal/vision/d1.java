package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30984a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ e1 f30986c;

    d1(e1 e1Var) {
        this.f30986c = e1Var;
        this.f30985b = e1Var.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30984a < this.f30985b;
    }

    @Override // com.google.android.gms.internal.vision.j1
    public final byte zza() {
        int i15 = this.f30984a;
        if (i15 >= this.f30985b) {
            throw new NoSuchElementException();
        }
        this.f30984a = i15 + 1;
        return this.f30986c.s(i15);
    }
}
