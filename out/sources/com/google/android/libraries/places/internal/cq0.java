package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aq0 f31924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wo0 f31925b;

    /* synthetic */ cq0(bq0 bq0Var, byte[] bArr) {
        this.f31924a = bq0Var.d();
        this.f31925b = bq0Var.e().b();
    }

    public final aq0 a() {
        return this.f31924a;
    }

    public final wo0 b() {
        return this.f31925b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f31924a);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 13);
        sb5.append("Request{url=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
