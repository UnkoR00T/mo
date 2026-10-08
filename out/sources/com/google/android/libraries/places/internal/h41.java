package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class h41 extends j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k41 f32439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f32440d;

    h41() {
    }

    @Override // com.google.android.libraries.places.internal.j41
    final j41 a(int i15) {
        this.f32438b = i15;
        this.f32440d = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.j41
    public final j41 b(k41 k41Var) {
        if (k41Var == null) {
            throw new NullPointerException("Null requestSource");
        }
        this.f32439c = k41Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.j41
    final l41 c() {
        String str;
        k41 k41Var;
        if (this.f32440d == 1 && (str = this.f32437a) != null && (k41Var = this.f32439c) != null) {
            return new i41(str, this.f32438b, k41Var, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f32437a == null) {
            sb5.append(" packageName");
        }
        if (this.f32440d == 0) {
            sb5.append(" versionCode");
        }
        if (this.f32439c == null) {
            sb5.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final j41 e(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f32437a = str;
        return this;
    }
}
