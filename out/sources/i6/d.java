package i6;

/* JADX INFO: loaded from: classes.dex */
public class d<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f89682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f89683b;

    public d(F f15, S s15) {
        this.f89682a = f15;
        this.f89683b = s15;
    }

    public static <A, B> d<A, B> a(A a15, B b15) {
        return new d<>(a15, b15);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f89682a, this.f89682a) && c.a(dVar.f89683b, this.f89683b);
    }

    public int hashCode() {
        F f15 = this.f89682a;
        int iHashCode = f15 == null ? 0 : f15.hashCode();
        S s15 = this.f89683b;
        return iHashCode ^ (s15 != null ? s15.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f89682a + " " + this.f89683b + "}";
    }
}
