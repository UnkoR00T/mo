package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a60 f31747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s60 f31749d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s60 f31750e;

    /* synthetic */ b60(String str, a60 a60Var, long j15, s60 s60Var, s60 s60Var2, byte[] bArr) {
        this.f31746a = str;
        this.f31747b = (a60) zj.p.r(a60Var, "severity");
        this.f31748c = j15;
        this.f31750e = s60Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b60) {
            b60 b60Var = (b60) obj;
            if (zj.l.a(this.f31746a, b60Var.f31746a) && zj.l.a(this.f31747b, b60Var.f31747b) && this.f31748c == b60Var.f31748c && zj.l.a(null, null) && zj.l.a(this.f31750e, b60Var.f31750e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f31746a, this.f31747b, Long.valueOf(this.f31748c), null, this.f31750e);
    }

    public final String toString() {
        return zj.j.c(this).d("description", this.f31746a).d("severity", this.f31747b).c("timestampNanos", this.f31748c).d("channelRef", null).d("subchannelRef", this.f31750e).toString();
    }
}
