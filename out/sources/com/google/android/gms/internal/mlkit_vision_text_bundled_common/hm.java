package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class hm extends im {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f30444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f30445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ im f30446e;

    hm(im imVar, int i15, int i16) {
        this.f30446e = imVar;
        this.f30444c = i15;
        this.f30445d = i16;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final int f() {
        return this.f30446e.g() + this.f30444c + this.f30445d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final int g() {
        return this.f30446e.g() + this.f30444c;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        ul.a(i15, this.f30445d, "index");
        return this.f30446e.get(i15 + this.f30444c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.em
    final Object[] h() {
        return this.f30446e.h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.im
    /* JADX INFO: renamed from: i */
    public final im subList(int i15, int i16) {
        ul.d(i15, i16, this.f30445d);
        int i17 = this.f30444c;
        return this.f30446e.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30445d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.im, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
