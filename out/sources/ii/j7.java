package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class j7 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92499c;

    j7(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f92497a = str;
        this.f92498b = str2;
        this.f92499c = str3;
    }

    @Override // ii.f
    public final String b() {
        return this.f92497a;
    }

    @Override // ii.f
    public final String c() {
        return this.f92499c;
    }

    @Override // ii.f
    public final String d() {
        return this.f92498b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f92497a.equals(fVar.b()) && ((str = this.f92498b) != null ? str.equals(fVar.d()) : fVar.d() == null) && ((str2 = this.f92499c) != null ? str2.equals(fVar.c()) : fVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f92497a.hashCode() ^ 1000003;
        String str = this.f92498b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f92499c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f92498b;
        int length = String.valueOf(str).length();
        String str2 = this.f92499c;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92497a;
        StringBuilder sb5 = new StringBuilder(str3.length() + 29 + length + 11 + length2 + 1);
        sb5.append("AuthorAttribution{name=");
        sb5.append(str3);
        sb5.append(", uri=");
        sb5.append(str);
        sb5.append(", photoUri=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
