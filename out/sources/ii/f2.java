package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class f2 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.a f92433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.a f92434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0.a f92435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.a f92436d;

    f2(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4) {
        if (aVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.f92433a = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.f92434b = aVar2;
        if (aVar3 == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.f92435c = aVar3;
        if (aVar4 == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.f92436d = aVar4;
    }

    @Override // ii.i0
    public final l0.a b() {
        return this.f92435c;
    }

    @Override // ii.i0
    public final l0.a c() {
        return this.f92433a;
    }

    @Override // ii.i0
    public final l0.a d() {
        return this.f92434b;
    }

    @Override // ii.i0
    public final l0.a e() {
        return this.f92436d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f92433a.equals(i0Var.c()) && this.f92434b.equals(i0Var.d()) && this.f92435c.equals(i0Var.b()) && this.f92436d.equals(i0Var.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f92433a.hashCode() ^ 1000003) * 1000003) ^ this.f92434b.hashCode()) * 1000003) ^ this.f92435c.hashCode()) * 1000003) ^ this.f92436d.hashCode();
    }

    public final String toString() {
        String string = this.f92433a.toString();
        int length = string.length();
        String string2 = this.f92434b.toString();
        int length2 = string2.length();
        String string3 = this.f92435c.toString();
        int length3 = string3.length();
        String string4 = this.f92436d.toString();
        StringBuilder sb5 = new StringBuilder(length + 54 + length2 + 18 + length3 + 13 + string4.length() + 1);
        sb5.append("PaymentOptions{acceptsCreditCards=");
        sb5.append(string);
        sb5.append(", acceptsDebitCards=");
        sb5.append(string2);
        sb5.append(", acceptsCashOnly=");
        sb5.append(string3);
        sb5.append(", acceptsNfc=");
        sb5.append(string4);
        sb5.append("}");
        return sb5.toString();
    }
}
