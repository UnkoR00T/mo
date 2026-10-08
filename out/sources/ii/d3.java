package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class d3 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92404b;

    d3(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f92403a = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.f92404b = str2;
    }

    @Override // ii.x0
    public final String a() {
        return this.f92403a;
    }

    @Override // ii.x0
    public final String b() {
        return this.f92404b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f92403a.equals(x0Var.a()) && this.f92404b.equals(x0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92403a.hashCode() ^ 1000003) * 1000003) ^ this.f92404b.hashCode();
    }

    public final String toString() {
        String str = this.f92403a;
        int length = str.length();
        String str2 = this.f92404b;
        StringBuilder sb5 = new StringBuilder(length + 25 + str2.length() + 1);
        sb5.append("SubDestination{id=");
        sb5.append(str);
        sb5.append(", name=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
