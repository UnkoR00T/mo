package com.google.android.libraries.places.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class af0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f31616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set f31617c;

    af0(int i15, long j15, Set set) {
        this.f31615a = i15;
        this.f31616b = j15;
        this.f31617c = ak.u0.v(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af0.class == obj.getClass()) {
            af0 af0Var = (af0) obj;
            if (this.f31615a == af0Var.f31615a && this.f31616b == af0Var.f31616b && zj.l.a(this.f31617c, af0Var.f31617c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(Integer.valueOf(this.f31615a), Long.valueOf(this.f31616b), this.f31617c);
    }

    public final String toString() {
        return zj.j.c(this).b("maxAttempts", this.f31615a).c("hedgingDelayNanos", this.f31616b).d("nonFatalStatusCodes", this.f31617c).toString();
    }
}
