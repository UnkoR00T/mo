package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class jo0 implements wm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nr0 f32669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32671c;

    jo0(nr0 nr0Var, int i15) {
        this.f32669a = nr0Var;
        this.f32670b = i15;
    }

    @Override // com.google.android.libraries.places.internal.wm0
    public final int a() {
        return this.f32670b;
    }

    @Override // com.google.android.libraries.places.internal.wm0
    public final void b(byte[] bArr, int i15, int i16) {
        this.f32669a.P1(bArr, i15, i16);
        this.f32670b -= i16;
        this.f32671c += i16;
    }

    @Override // com.google.android.libraries.places.internal.wm0
    public final int c() {
        return this.f32671c;
    }

    @Override // com.google.android.libraries.places.internal.wm0
    public final void d(byte b15) {
        this.f32669a.b(b15);
        this.f32670b--;
        this.f32671c++;
    }

    final nr0 e() {
        return this.f32669a;
    }
}
