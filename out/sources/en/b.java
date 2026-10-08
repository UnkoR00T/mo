package en;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52054b;

    public int a() {
        return this.f52054b;
    }

    public int b() {
        return this.f52053a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f52053a == bVar.f52053a && this.f52054b == bVar.f52054b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f52053a * 32713) + this.f52054b;
    }

    public String toString() {
        return this.f52053a + "x" + this.f52054b;
    }
}
