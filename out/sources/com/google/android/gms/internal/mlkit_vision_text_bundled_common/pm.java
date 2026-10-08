package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class pm extends im {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final im f30553e = new pm(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f30554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f30555d;

    pm(Object[] objArr, int i15) {
        this.f30554c = objArr;
        this.f30555d = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.im, com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final int e(Object[] objArr, int i15) {
        System.arraycopy(this.f30554c, 0, objArr, 0, this.f30555d);
        return this.f30555d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final int f() {
        return this.f30555d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        ul.a(i15, this.f30555d, "index");
        Object obj = this.f30554c[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final Object[] h() {
        return this.f30554c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30555d;
    }
}
