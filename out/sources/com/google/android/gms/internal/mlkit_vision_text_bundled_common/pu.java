package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class pu extends qu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30556a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yu f30558c;

    pu(yu yuVar) {
        this.f30558c = yuVar;
        this.f30557b = yuVar.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30556a < this.f30557b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.su
    public final byte m() {
        int i15 = this.f30556a;
        if (i15 >= this.f30557b) {
            throw new NoSuchElementException();
        }
        this.f30556a = i15 + 1;
        return this.f30558c.f(i15);
    }
}
