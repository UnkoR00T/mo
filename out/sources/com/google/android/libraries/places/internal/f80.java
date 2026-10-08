package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class f80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d80 f32259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c80 f32262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c80 f32263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32264f;

    /* synthetic */ f80(d80 d80Var, String str, c80 c80Var, c80 c80Var2, Object obj, boolean z15, boolean z16, boolean z17, byte[] bArr) {
        new AtomicReferenceArray(2);
        this.f32259a = (d80) zj.p.r(d80Var, "type");
        this.f32260b = (String) zj.p.r(str, "fullMethodName");
        int iLastIndexOf = ((String) zj.p.r(str, "fullMethodName")).lastIndexOf(47);
        this.f32261c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.f32262d = (c80) zj.p.r(c80Var, "requestMarshaller");
        this.f32263e = (c80) zj.p.r(c80Var2, "responseMarshaller");
        this.f32264f = z17;
    }

    public static String h(String str, String str2) {
        String str3 = (String) zj.p.r(str, "fullServiceName");
        String str4 = (String) zj.p.r(str2, "methodName");
        StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
        sb5.append(str3);
        sb5.append("/");
        sb5.append(str4);
        return sb5.toString();
    }

    public static b80 i(c80 c80Var, c80 c80Var2) {
        b80 b80Var = new b80(null);
        b80Var.a(null);
        b80Var.b(null);
        return b80Var;
    }

    public final d80 a() {
        return this.f32259a;
    }

    public final String b() {
        return this.f32260b;
    }

    public final String c() {
        return this.f32261c;
    }

    public final Object d(InputStream inputStream) {
        return this.f32263e.c(inputStream);
    }

    public final InputStream e(Object obj) {
        return this.f32262d.b(obj);
    }

    public final c80 f() {
        return this.f32262d;
    }

    public final c80 g() {
        return this.f32263e;
    }

    public final String toString() {
        return zj.j.c(this).d("fullMethodName", this.f32260b).d("type", this.f32259a).e("idempotent", false).e("safe", false).e("sampledToLocalTracing", this.f32264f).d("requestMarshaller", this.f32262d).d("responseMarshaller", this.f32263e).d("schemaDescriptor", null).m().toString();
    }
}
