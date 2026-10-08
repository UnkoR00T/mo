package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class h7 extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e.b f92470e;

    h7(String str, String str2, String str3, String str4, e.b bVar) {
        this.f92466a = str;
        this.f92467b = str2;
        this.f92468c = str3;
        this.f92469d = str4;
        this.f92470e = bVar;
    }

    @Override // ii.e
    public final e.b b() {
        return this.f92470e;
    }

    @Override // ii.e
    public final String c() {
        return this.f92468c;
    }

    @Override // ii.e
    public final String d() {
        return this.f92469d;
    }

    @Override // ii.e
    public final String e() {
        return this.f92467b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String str = this.f92466a;
            if (str != null ? str.equals(eVar.f()) : eVar.f() == null) {
                String str2 = this.f92467b;
                if (str2 != null ? str2.equals(eVar.e()) : eVar.e() == null) {
                    String str3 = this.f92468c;
                    if (str3 != null ? str3.equals(eVar.c()) : eVar.c() == null) {
                        String str4 = this.f92469d;
                        if (str4 != null ? str4.equals(eVar.d()) : eVar.d() == null) {
                            e.b bVar = this.f92470e;
                            if (bVar != null ? bVar.equals(eVar.b()) : eVar.b() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.e
    public final String f() {
        return this.f92466a;
    }

    public final int hashCode() {
        String str = this.f92466a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92467b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        String str3 = this.f92468c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92469d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        e.b bVar = this.f92470e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f92470e);
        String str = this.f92466a;
        int length = String.valueOf(str).length();
        String str2 = this.f92467b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92468c;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f92469d;
        StringBuilder sb5 = new StringBuilder(length + 23 + length2 + 14 + length3 + 26 + String.valueOf(str4).length() + 14 + strValueOf.length() + 1);
        sb5.append("Area{resourceName=");
        sb5.append(str);
        sb5.append(", id=");
        sb5.append(str2);
        sb5.append(", displayName=");
        sb5.append(str3);
        sb5.append(", displayNameLanguageCode=");
        sb5.append(str4);
        sb5.append(", containment=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
