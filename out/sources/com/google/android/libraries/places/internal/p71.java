package com.google.android.libraries.places.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
final class p71 extends q81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ak.n0 f33284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ak.n0 f33285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UUID f33286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f33288e;

    p71() {
    }

    @Override // com.google.android.libraries.places.internal.q81
    public final q81 a(ak.n0 n0Var) {
        if (n0Var == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.f33284a = n0Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.q81
    public final q81 b(ak.n0 n0Var) {
        if (n0Var == null) {
            throw new NullPointerException("Null extras");
        }
        this.f33285b = n0Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.q81
    public final q81 c(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.f33286c = uuid;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.q81
    public final q81 d(long j15) {
        this.f33287d = -1L;
        this.f33288e = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.q81
    public final r81 e() {
        ak.n0 n0Var;
        ak.n0 n0Var2;
        UUID uuid;
        if (this.f33288e == 1 && (n0Var = this.f33284a) != null && (n0Var2 = this.f33285b) != null && (uuid = this.f33286c) != null) {
            return new q71(n0Var, n0Var2, uuid, this.f33287d, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f33284a == null) {
            sb5.append(" spansNames");
        }
        if (this.f33285b == null) {
            sb5.append(" extras");
        }
        if (this.f33286c == null) {
            sb5.append(" rootTraceId");
        }
        if (this.f33288e == 0) {
            sb5.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }
}
