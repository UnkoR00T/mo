package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class n31 implements y31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b41 f33028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l41 f33029c;

    /* synthetic */ n31(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.y31
    public final /* bridge */ /* synthetic */ y31 a(b41 b41Var) {
        this.f33028b = b41Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.y31
    public final /* bridge */ /* synthetic */ y31 b(l41 l41Var) {
        this.f33029c = l41Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.y31
    public final /* bridge */ /* synthetic */ y31 c(Context context) {
        context.getClass();
        this.f33027a = context;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.y31
    public final z31 zza() {
        t30.b(this.f33027a, Context.class);
        t30.b(this.f33028b, b41.class);
        t30.b(this.f33029c, l41.class);
        return new o31(this.f33027a, this.f33028b, this.f33029c);
    }
}
