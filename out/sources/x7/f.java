package x7;

import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f217157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f217158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f217159c;

    public f(long j15, long j16, long j17) {
        this.f217157a = j15;
        this.f217158b = j16;
        this.f217159c = j17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f217157a == fVar.f217157a && this.f217158b == fVar.f217158b && this.f217159c == fVar.f217159c;
    }

    public int hashCode() {
        return ((((527 + ek.i.c(this.f217157a)) * 31) + ek.i.c(this.f217158b)) * 31) + ek.i.c(this.f217159c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f217157a + ", modification time=" + this.f217158b + ", timescale=" + this.f217159c;
    }
}
