package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aq0 f31817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vo0 f31818b = new vo0();

    public final bq0 a(aq0 aq0Var) {
        this.f31817a = aq0Var;
        return this;
    }

    public final bq0 b(String str, String str2) {
        this.f31818b.a(str, str2);
        return this;
    }

    public final cq0 c() {
        if (this.f31817a != null) {
            return new cq0(this, null);
        }
        throw new IllegalStateException("url == null");
    }

    final /* synthetic */ aq0 d() {
        return this.f31817a;
    }

    final /* synthetic */ vo0 e() {
        return this.f31818b;
    }
}
