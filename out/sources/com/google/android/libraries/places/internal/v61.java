package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class v61 implements y61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k41 f34050b;

    /* synthetic */ v61(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.y61
    public final /* bridge */ /* synthetic */ y61 a(k41 k41Var) {
        k41Var.getClass();
        this.f34050b = k41Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.y61
    public final /* bridge */ /* synthetic */ y61 b(Context context) {
        context.getClass();
        this.f34049a = context;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.y61
    public final z61 zza() {
        t30.b(this.f34049a, Context.class);
        t30.b(this.f34050b, k41.class);
        return new w61(this.f34049a, this.f34050b);
    }
}
