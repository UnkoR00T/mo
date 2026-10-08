package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class s3 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f92765c;

    s3(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f92763a = str;
        this.f92764b = str2;
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.f92765c = list;
    }

    @Override // ii.b
    public final String b() {
        return this.f92763a;
    }

    @Override // ii.b
    public final String c() {
        return this.f92764b;
    }

    @Override // ii.b
    public final List<String> d() {
        return this.f92765c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f92763a.equals(bVar.b()) && ((str = this.f92764b) != null ? str.equals(bVar.c()) : bVar.c() == null) && this.f92765c.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f92763a.hashCode() ^ 1000003;
        String str = this.f92764b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f92765c.hashCode();
    }

    public final String toString() {
        String string = this.f92765c.toString();
        String str = this.f92764b;
        int length = String.valueOf(str).length();
        int length2 = string.length();
        String str2 = this.f92763a;
        StringBuilder sb5 = new StringBuilder(str2.length() + 34 + length + 8 + length2 + 1);
        sb5.append("AddressComponent{name=");
        sb5.append(str2);
        sb5.append(", shortName=");
        sb5.append(str);
        sb5.append(", types=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
