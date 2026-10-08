package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class vp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vp0[] f34080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34082c;

    vp0() {
        this.f34080a = new vp0[256];
        this.f34081b = 0;
        this.f34082c = 0;
    }

    final /* synthetic */ vp0[] a() {
        return this.f34080a;
    }

    final /* synthetic */ int b() {
        return this.f34081b;
    }

    final /* synthetic */ int c() {
        return this.f34082c;
    }

    vp0(int i15, int i16) {
        this.f34080a = null;
        this.f34081b = i15;
        int i17 = i16 & 7;
        this.f34082c = i17 == 0 ? 8 : i17;
    }
}
