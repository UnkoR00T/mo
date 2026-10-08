package v;

/* JADX INFO: loaded from: classes.dex */
final class j<T> extends p1.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f202611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f202612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f202613c;

    j(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f202611a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f202612b = cls;
        this.f202613c = obj;
    }

    @Override // v.p1.a
    public String c() {
        return this.f202611a;
    }

    @Override // v.p1.a
    public Object d() {
        return this.f202613c;
    }

    @Override // v.p1.a
    public Class<T> e() {
        return this.f202612b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1.a) {
            p1.a aVar = (p1.a) obj;
            if (this.f202611a.equals(aVar.c()) && this.f202612b.equals(aVar.e()) && ((obj2 = this.f202613c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f202611a.hashCode() ^ 1000003) * 1000003) ^ this.f202612b.hashCode()) * 1000003;
        Object obj = this.f202613c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f202611a + ", valueClass=" + this.f202612b + ", token=" + this.f202613c + "}";
    }
}
