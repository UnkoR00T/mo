package o;

/* JADX INFO: loaded from: classes.dex */
final class f extends v1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f139954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f139955b;

    f(int i15, v1 v1Var) {
        this.f139954a = i15;
        if (v1Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f139955b = v1Var;
    }

    @Override // o.v1.b
    public int a() {
        return this.f139954a;
    }

    @Override // o.v1.b
    public v1 b() {
        return this.f139955b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1.b) {
            v1.b bVar = (v1.b) obj;
            if (this.f139954a == bVar.a() && this.f139955b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f139954a ^ 1000003) * 1000003) ^ this.f139955b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f139954a + ", surfaceOutput=" + this.f139955b + "}";
    }
}
