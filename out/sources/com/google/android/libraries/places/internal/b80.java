package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c80 f31764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c80 f31765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d80 f31766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31768e;

    private b80() {
        throw null;
    }

    public final b80 a(c80 c80Var) {
        this.f31764a = c80Var;
        return this;
    }

    public final b80 b(c80 c80Var) {
        this.f31765b = c80Var;
        return this;
    }

    public final b80 c(d80 d80Var) {
        this.f31766c = d80Var;
        return this;
    }

    public final b80 d(String str) {
        this.f31767d = str;
        return this;
    }

    public final b80 e(boolean z15) {
        this.f31768e = true;
        return this;
    }

    public final f80 f() {
        return new f80(this.f31766c, this.f31767d, this.f31764a, this.f31765b, null, false, false, this.f31768e, null);
    }

    /* synthetic */ b80(byte[] bArr) {
    }
}
