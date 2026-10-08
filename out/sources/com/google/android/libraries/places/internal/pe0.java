package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pe0 implements qd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe0 f33317a;

    public pe0(xe0 xe0Var) {
        if (xe0Var == null) {
            throw new NullPointerException("Http2Error cannot be null for GOAWAY");
        }
        this.f33317a = xe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pe0.class == obj.getClass() && this.f33317a == ((pe0) obj).f33317a;
    }

    public final int hashCode() {
        return this.f33317a.hashCode();
    }

    @Override // com.google.android.libraries.places.internal.qd0
    public final String zza() {
        return "GOAWAY ".concat(String.valueOf(this.f33317a.name()));
    }
}
