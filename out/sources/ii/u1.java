package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class u1 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f92786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92787b;

    u1(int i15, int i16) {
        this.f92786a = i15;
        this.f92787b = i16;
    }

    @Override // ii.b0
    public final int e() {
        return this.f92786a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f92786a == b0Var.e() && this.f92787b == b0Var.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.b0
    public final int g() {
        return this.f92787b;
    }

    public final int hashCode() {
        return ((this.f92786a ^ 1000003) * 1000003) ^ this.f92787b;
    }

    public final String toString() {
        int i15 = this.f92786a;
        int length = String.valueOf(i15).length();
        int i16 = this.f92787b;
        StringBuilder sb5 = new StringBuilder(length + 26 + String.valueOf(i16).length() + 1);
        sb5.append("LocalTime{hours=");
        sb5.append(i15);
        sb5.append(", minutes=");
        sb5.append(i16);
        sb5.append("}");
        return sb5.toString();
    }
}
