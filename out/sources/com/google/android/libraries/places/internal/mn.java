package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a80 f32966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f40 f32967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32968c;

    private mn(int i15, f80 f80Var, String str, f40 f40Var, a80 a80Var, String str2) {
        this.f32967b = f40Var;
        this.f32966a = a80Var;
        this.f32968c = str2;
    }

    public static mn a(f80 f80Var, f40 f40Var, a80 a80Var, String str) {
        return new mn(2, (f80) zj.p.q(f80Var), null, (f40) zj.p.q(f40Var), (a80) zj.p.q(a80Var), (String) zj.p.q(str));
    }

    public final a80 b() {
        return this.f32966a;
    }

    public final f40 c() {
        return this.f32967b;
    }

    public final String d() {
        return this.f32968c;
    }
}
