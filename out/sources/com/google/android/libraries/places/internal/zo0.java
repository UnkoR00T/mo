package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
final class zo0 extends ep0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yo0 f34527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yo0 f34528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final yo0 f34529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yo0 f34530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f34531i;

    public zo0(yo0 yo0Var, yo0 yo0Var2, Method method, Method method2, yo0 yo0Var3, yo0 yo0Var4, Provider provider, int i15) {
        super(provider);
        this.f34527e = yo0Var;
        this.f34528f = yo0Var2;
        this.f34529g = yo0Var3;
        this.f34530h = yo0Var4;
        this.f34531i = i15;
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f34527e.b(sSLSocket, Boolean.TRUE);
            this.f34528f.b(sSLSocket, str);
        }
        yo0 yo0Var = this.f34530h;
        if (yo0Var.a(sSLSocket)) {
            yo0Var.c(sSLSocket, ep0.g(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final String b(SSLSocket sSLSocket) {
        byte[] bArr;
        yo0 yo0Var = this.f34529g;
        if (yo0Var.a(sSLSocket) && (bArr = (byte[]) yo0Var.c(sSLSocket, new Object[0])) != null) {
            return new String(bArr, hp0.f32507b);
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final int c() {
        return this.f34531i;
    }
}
