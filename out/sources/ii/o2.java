package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class o2 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92683b;

    o2(String str, String str2) {
        this.f92682a = str;
        this.f92683b = str2;
    }

    @Override // ii.n0
    public final String b() {
        return this.f92682a;
    }

    @Override // ii.n0
    public final String c() {
        return this.f92683b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            String str = this.f92682a;
            if (str != null ? str.equals(n0Var.b()) : n0Var.b() == null) {
                String str2 = this.f92683b;
                if (str2 != null ? str2.equals(n0Var.c()) : n0Var.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f92682a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92683b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f92682a;
        int length = String.valueOf(str).length();
        String str2 = this.f92683b;
        StringBuilder sb5 = new StringBuilder(length + 35 + String.valueOf(str2).length() + 1);
        sb5.append("PlusCode{compoundCode=");
        sb5.append(str);
        sb5.append(", globalCode=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
