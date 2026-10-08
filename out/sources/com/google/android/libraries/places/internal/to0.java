package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class to0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0[] f33802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final to0 f33803f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f33804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f33805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f33806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f33807d;

    static {
        ro0[] ro0VarArr = {ro0.TLS_AES_128_GCM_SHA256, ro0.TLS_AES_256_GCM_SHA384, ro0.TLS_CHACHA20_POLY1305_SHA256, ro0.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ro0.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ro0.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ro0.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ro0.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ro0.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, ro0.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, ro0.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, ro0.TLS_RSA_WITH_AES_128_GCM_SHA256, ro0.TLS_RSA_WITH_AES_256_GCM_SHA384, ro0.TLS_RSA_WITH_AES_128_CBC_SHA, ro0.TLS_RSA_WITH_AES_256_CBC_SHA, ro0.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f33802e = ro0VarArr;
        so0 so0Var = new so0(true);
        so0Var.a(ro0VarArr);
        gp0 gp0Var = gp0.TLS_1_3;
        gp0 gp0Var2 = gp0.TLS_1_2;
        so0Var.c(gp0Var, gp0Var2);
        so0Var.e(true);
        to0 to0Var = new to0(so0Var);
        f33803f = to0Var;
        so0 so0Var2 = new so0(to0Var);
        so0Var2.c(gp0Var, gp0Var2, gp0.TLS_1_1, gp0.TLS_1_0);
        so0Var2.e(true);
    }

    private to0(so0 so0Var) {
        this.f33804a = true;
        this.f33805b = so0Var.g();
        this.f33806c = so0Var.h();
        this.f33807d = so0Var.i();
    }

    public final boolean a() {
        return this.f33807d;
    }

    public final void b(SSLSocket sSLSocket, boolean z15) {
        String[] strArr = this.f33805b;
        String[] strArr2 = strArr != null ? (String[]) hp0.b(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) hp0.b(String.class, this.f33806c, sSLSocket.getEnabledProtocols());
        so0 so0Var = new so0(this);
        so0Var.b(strArr2);
        so0Var.d(strArr3);
        to0 to0Var = new to0(so0Var);
        sSLSocket.setEnabledProtocols(to0Var.f33806c);
        String[] strArr4 = to0Var.f33805b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    final /* synthetic */ String[] c() {
        return this.f33805b;
    }

    final /* synthetic */ String[] d() {
        return this.f33806c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof to0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        to0 to0Var = (to0) obj;
        return Arrays.equals(this.f33805b, to0Var.f33805b) && Arrays.equals(this.f33806c, to0Var.f33806c) && this.f33807d == to0Var.f33807d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f33805b) + 527) * 31) + Arrays.hashCode(this.f33806c)) * 31) + (!this.f33807d ? 1 : 0);
    }

    public final String toString() {
        List listA;
        gp0 gp0Var;
        String[] strArr = this.f33805b;
        if (strArr == null) {
            listA = null;
        } else {
            ro0[] ro0VarArr = new ro0[strArr.length];
            for (int i15 = 0; i15 < strArr.length; i15++) {
                String str = strArr[i15];
                ro0 ro0Var = ro0.TLS_RSA_WITH_NULL_MD5;
                ro0VarArr[i15] = str.startsWith("SSL_") ? ro0.b("TLS_".concat(String.valueOf(str.substring(4)))) : ro0.b(str);
            }
            listA = hp0.a(ro0VarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.f33806c;
        gp0[] gp0VarArr = new gp0[strArr2.length];
        for (int i16 = 0; i16 < strArr2.length; i16++) {
            String str2 = strArr2[i16];
            boolean zEquals = "TLSv1.3".equals(str2);
            gp0 gp0Var2 = gp0.TLS_1_3;
            if (zEquals) {
                gp0Var = gp0.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                gp0Var = gp0.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                gp0Var = gp0.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                gp0Var = gp0.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                gp0Var = gp0.SSL_3_0;
            }
            gp0VarArr[i16] = gp0Var;
        }
        String strValueOf = String.valueOf(hp0.a(gp0VarArr));
        boolean z15 = this.f33807d;
        StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 42 + strValueOf.length() + 24 + String.valueOf(z15).length() + 1);
        sb5.append("ConnectionSpec(cipherSuites=");
        sb5.append(string);
        sb5.append(", tlsVersions=");
        sb5.append(strValueOf);
        sb5.append(", supportsTlsExtensions=");
        sb5.append(z15);
        sb5.append(")");
        return sb5.toString();
    }

    /* synthetic */ to0(so0 so0Var, byte[] bArr) {
        this(so0Var);
    }
}
