package bp;

/* JADX INFO: loaded from: classes4.dex */
public class m implements Comparable<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20963b;

    public m(l lVar) {
        this(lVar.g4(), lVar.N3());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        if (g() < mVar.g()) {
            return -1;
        }
        if (g() > mVar.g()) {
            return 1;
        }
        if (e() < mVar.e()) {
            return -1;
        }
        return e() > mVar.e() ? 1 : 0;
    }

    public int e() {
        return this.f20963b;
    }

    public boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && mVar.g() == g() && mVar.e() == e();
    }

    public long g() {
        return this.f20962a;
    }

    public int hashCode() {
        return Long.valueOf((this.f20962a << 4) + ((long) this.f20963b)).hashCode();
    }

    public String toString() {
        return this.f20962a + " " + this.f20963b + " R";
    }

    public m(long j15, int i15) {
        this.f20962a = j15;
        this.f20963b = i15;
    }
}
