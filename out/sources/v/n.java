package v;

/* JADX INFO: loaded from: classes.dex */
final class n extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f202696a;

    n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f202696a = obj;
    }

    @Override // v.b2
    public Object b() {
        return this.f202696a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return this.f202696a.equals(((b2) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f202696a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f202696a + "}";
    }
}
