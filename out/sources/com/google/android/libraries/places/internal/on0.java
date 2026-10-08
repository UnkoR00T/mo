package com.google.android.libraries.places.internal;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class on0 extends r50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final to0 f33195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final em0 f33196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final si0 f33197k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ai0 f33198a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SSLSocketFactory f33202e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qm0 f33199b = sm0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final si0 f33200c = f33197k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final si0 f33201d = gm0.a(ze0.f34509q);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final to0 f33203f = f33195i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33205h = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33204g = ze0.f34504l;

    static {
        Logger.getLogger(on0.class.getName());
        so0 so0Var = new so0(to0.f33803f);
        so0Var.a(ro0.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ro0.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ro0.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ro0.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ro0.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ro0.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        so0Var.c(gp0.TLS_1_2);
        so0Var.e(true);
        f33195i = so0Var.f();
        TimeUnit.DAYS.toNanos(1000L);
        jn0 jn0Var = new jn0();
        f33196j = jn0Var;
        f33197k = gm0.a(jn0Var);
        EnumSet.of(w90.MTLS, w90.CUSTOM_MANAGERS);
    }

    private on0(String str) {
        this.f33198a = new ai0(str, null, null, new ln0(this, null), new kn0(this, null));
    }

    public static on0 e(String str, int i15) {
        return new on0(ze0.c(str, 443));
    }

    @Override // com.google.android.libraries.places.internal.r50
    protected final s70 b() {
        return this.f33198a;
    }

    public final on0 f() {
        zj.p.x(true, "Cannot change security when using ChannelCredentials");
        this.f33205h = 1;
        return this;
    }

    final nn0 g() {
        long j15 = this.f33204g;
        to0 to0Var = this.f33203f;
        qm0 qm0Var = this.f33199b;
        return new nn0(this.f33200c, this.f33201d, null, i(), null, to0Var, 4194304, false, Long.MAX_VALUE, j15, 65535, false, Integer.MAX_VALUE, qm0Var, false, null, null);
    }

    final int h() {
        int i15 = this.f33205h;
        int i16 = i15 - 1;
        if (i15 == 0) {
            throw null;
        }
        if (i16 == 0) {
            return 443;
        }
        throw new AssertionError("TLS not handled");
    }

    final SSLSocketFactory i() {
        int i15 = this.f33205h;
        int i16 = i15 - 1;
        if (i15 == 0) {
            throw null;
        }
        if (i16 != 0) {
            throw new RuntimeException("Unknown negotiation type: TLS");
        }
        try {
            if (this.f33202e == null) {
                this.f33202e = SSLContext.getInstance("Default", ep0.e().f()).getSocketFactory();
            }
            return this.f33202e;
        } catch (GeneralSecurityException e15) {
            throw new RuntimeException("TLS Provider failure", e15);
        }
    }
}
