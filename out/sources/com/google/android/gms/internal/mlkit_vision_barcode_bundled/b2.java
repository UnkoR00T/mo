package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class b2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j2 f29645c;

    b2(j2 j2Var) {
        this.f29645c = j2Var;
        this.f29644b = j2Var.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29643a < this.f29644b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.f2
    public final byte zza() {
        int i15 = this.f29643a;
        if (i15 >= this.f29644b) {
            throw new NoSuchElementException();
        }
        this.f29643a = i15 + 1;
        return this.f29645c.f(i15);
    }
}
