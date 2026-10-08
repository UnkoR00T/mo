package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f143157c = new m0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f143158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f143159b;

    public m0(long j15, long j16) {
        this.f143158a = j15;
        this.f143159b = j16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f143158a == m0Var.f143158a && this.f143159b == m0Var.f143159b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f143158a) * 31) + ((int) this.f143159b);
    }

    public String toString() {
        return "[timeUs=" + this.f143158a + ", position=" + this.f143159b + "]";
    }
}
