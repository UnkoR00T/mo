package md;

/* JADX INFO: loaded from: classes3.dex */
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f125646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f125647b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t15, T t16) {
        this.f125646a = t15;
        this.f125647b = t16;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i6.d)) {
            return false;
        }
        i6.d dVar = (i6.d) obj;
        return a(dVar.f89682a, this.f125646a) && a(dVar.f89683b, this.f125647b);
    }

    public int hashCode() {
        T t15 = this.f125646a;
        int iHashCode = t15 == null ? 0 : t15.hashCode();
        T t16 = this.f125647b;
        return iHashCode ^ (t16 != null ? t16.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f125646a + " " + this.f125647b + "}";
    }
}
