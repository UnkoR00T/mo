package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class x7 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92855b;

    x7(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null resourceName");
        }
        this.f92854a = str;
        if (str2 == null) {
            throw new NullPointerException("Null id");
        }
        this.f92855b = str2;
    }

    @Override // ii.n
    public final String b() {
        return this.f92855b;
    }

    @Override // ii.n
    public final String c() {
        return this.f92854a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f92854a.equals(nVar.c()) && this.f92855b.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92854a.hashCode() ^ 1000003) * 1000003) ^ this.f92855b.hashCode();
    }

    public final String toString() {
        String str = this.f92854a;
        int length = str.length();
        String str2 = this.f92855b;
        StringBuilder sb5 = new StringBuilder(length + 34 + str2.length() + 1);
        sb5.append("ContainingPlace{resourceName=");
        sb5.append(str);
        sb5.append(", id=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
