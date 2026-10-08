package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class o7 extends u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f92687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92688b;

    o7(int i15, int i16) {
        this.f92687a = i15;
        this.f92688b = i16;
    }

    @Override // ii.u6
    final int a() {
        return this.f92687a;
    }

    @Override // ii.u6
    final int b() {
        return this.f92688b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u6) {
            u6 u6Var = (u6) obj;
            if (this.f92687a == u6Var.a() && this.f92688b == u6Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92687a ^ 1000003) * 1000003) ^ this.f92688b;
    }

    public final String toString() {
        int i15 = this.f92687a;
        int length = String.valueOf(i15).length();
        int i16 = this.f92688b;
        StringBuilder sb5 = new StringBuilder(length + 31 + String.valueOf(i16).length() + 1);
        sb5.append("SubstringMatch{offset=");
        sb5.append(i15);
        sb5.append(", length=");
        sb5.append(i16);
        sb5.append("}");
        return sb5.toString();
    }
}
