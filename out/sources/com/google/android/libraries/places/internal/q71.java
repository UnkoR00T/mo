package com.google.android.libraries.places.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
final class q71 extends r81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ak.n0 f33393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ak.n0 f33394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f33395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33396d;

    /* synthetic */ q71(ak.n0 n0Var, ak.n0 n0Var2, UUID uuid, long j15, byte[] bArr) {
        this.f33393a = n0Var;
        this.f33394b = n0Var2;
        this.f33395c = uuid;
        this.f33396d = j15;
    }

    @Override // com.google.android.libraries.places.internal.r81
    public final ak.n0 a() {
        return this.f33393a;
    }

    @Override // com.google.android.libraries.places.internal.r81
    public final ak.n0 b() {
        return this.f33394b;
    }

    @Override // com.google.android.libraries.places.internal.r81
    public final UUID c() {
        return this.f33395c;
    }

    @Override // com.google.android.libraries.places.internal.r81
    public final long d() {
        return this.f33396d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r81) {
            r81 r81Var = (r81) obj;
            if (this.f33393a.equals(r81Var.a()) && this.f33394b.equals(r81Var.b()) && this.f33395c.equals(r81Var.c()) && this.f33396d == r81Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f33393a.hashCode() ^ 1000003) * 1000003) ^ this.f33394b.hashCode()) * 1000003) ^ this.f33395c.hashCode();
        long j15 = this.f33396d;
        return (iHashCode * 1000003) ^ ((int) (j15 ^ (j15 >>> 32)));
    }
}
