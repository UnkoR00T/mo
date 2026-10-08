package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class e60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f32161a;

    private e60() {
        throw null;
    }

    public final e60 a(Object obj) {
        this.f32161a = zj.p.r(obj, "config");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f60 b() {
        zj.p.x(this.f32161a != null, "config is not set");
        return new f60(l90.f32807e, this.f32161a, null, 0 == true ? 1 : 0);
    }

    /* synthetic */ e60(byte[] bArr) {
    }
}
