package ye;

/* JADX INFO: loaded from: classes3.dex */
final class a<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f226630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f226631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f226632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f226633d;

    a(Integer num, T t15, e eVar, f fVar) {
        this.f226630a = num;
        if (t15 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f226631b = t15;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f226632c = eVar;
        this.f226633d = fVar;
    }

    @Override // ye.d
    public Integer a() {
        return this.f226630a;
    }

    @Override // ye.d
    public T b() {
        return this.f226631b;
    }

    @Override // ye.d
    public e c() {
        return this.f226632c;
    }

    @Override // ye.d
    public f d() {
        return this.f226633d;
    }

    public boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f226630a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f226631b.equals(dVar.b()) && this.f226632c.equals(dVar.c()) && ((fVar = this.f226633d) != null ? fVar.equals(dVar.d()) : dVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f226630a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f226631b.hashCode()) * 1000003) ^ this.f226632c.hashCode()) * 1000003;
        f fVar = this.f226633d;
        return iHashCode ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f226630a + ", payload=" + this.f226631b + ", priority=" + this.f226632c + ", productData=" + this.f226633d + "}";
    }
}
