package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class w1 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f92837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f92838c;

    w1(String str, Long l15, Integer num) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.f92836a = str;
        this.f92837b = l15;
        this.f92838c = num;
    }

    @Override // ii.e0
    public final String a() {
        return this.f92836a;
    }

    @Override // ii.e0
    public final Integer b() {
        return this.f92838c;
    }

    @Override // ii.e0
    public final Long c() {
        return this.f92837b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f92836a.equals(e0Var.a()) && this.f92837b.equals(e0Var.c()) && this.f92838c.equals(e0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f92836a.hashCode() ^ 1000003) * 1000003) ^ this.f92837b.hashCode()) * 1000003) ^ this.f92838c.hashCode();
    }

    public final String toString() {
        Long l15 = this.f92837b;
        int length = l15.toString().length();
        Integer num = this.f92838c;
        int length2 = num.toString().length();
        String str = this.f92836a;
        StringBuilder sb5 = new StringBuilder(str.length() + 27 + length + 8 + length2 + 1);
        sb5.append("Money{currencyCode=");
        sb5.append(str);
        sb5.append(", units=");
        sb5.append(l15);
        sb5.append(", nanos=");
        sb5.append(num);
        sb5.append("}");
        return sb5.toString();
    }
}
