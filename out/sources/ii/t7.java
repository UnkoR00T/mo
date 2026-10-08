package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class t7 extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f92784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92785c;

    t7(String str, m mVar, String str2) {
        this.f92783a = str;
        this.f92784b = mVar;
        this.f92785c = str2;
    }

    @Override // ii.l
    public m b() {
        return this.f92784b;
    }

    @Override // ii.l
    public String c() {
        return this.f92785c;
    }

    @Override // ii.l
    public String d() {
        return this.f92783a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            String str = this.f92783a;
            if (str != null ? str.equals(lVar.d()) : lVar.d() == null) {
                m mVar = this.f92784b;
                if (mVar != null ? mVar.equals(lVar.b()) : lVar.b() == null) {
                    String str2 = this.f92785c;
                    if (str2 != null ? str2.equals(lVar.c()) : lVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f92783a;
        int iHashCode = str == null ? 0 : str.hashCode();
        m mVar = this.f92784b;
        int iHashCode2 = mVar == null ? 0 : mVar.hashCode();
        int i15 = iHashCode ^ 1000003;
        String str2 = this.f92785c;
        return (((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f92784b);
        String str = this.f92783a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f92785c;
        StringBuilder sb5 = new StringBuilder(length + 33 + length2 + 15 + String.valueOf(str2).length() + 1);
        sb5.append("ConsumerAlert{overview=");
        sb5.append(str);
        sb5.append(", details=");
        sb5.append(strValueOf);
        sb5.append(", languageCode=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
