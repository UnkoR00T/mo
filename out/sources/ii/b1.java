package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class b1 extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f92368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f92369d;

    b1(String str, String str2, List list, List list2) {
        this.f92366a = str;
        this.f92367b = str2;
        this.f92368c = list;
        this.f92369d = list2;
    }

    @Override // ii.o
    public final String b() {
        return this.f92366a;
    }

    @Override // ii.o
    public final String c() {
        return this.f92367b;
    }

    @Override // ii.o
    public final List<String> d() {
        return this.f92369d;
    }

    @Override // ii.o
    public final List<String> e() {
        return this.f92368c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            String str = this.f92366a;
            if (str != null ? str.equals(oVar.b()) : oVar.b() == null) {
                String str2 = this.f92367b;
                if (str2 != null ? str2.equals(oVar.c()) : oVar.c() == null) {
                    List list = this.f92368c;
                    if (list != null ? list.equals(oVar.e()) : oVar.e() == null) {
                        List list2 = this.f92369d;
                        if (list2 != null ? list2.equals(oVar.d()) : oVar.d() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f92366a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92367b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        List list = this.f92368c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f92369d;
        return iHashCode3 ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f92369d;
        String strValueOf = String.valueOf(this.f92368c);
        String strValueOf2 = String.valueOf(list);
        String str = this.f92366a;
        int length = String.valueOf(str).length();
        String str2 = this.f92367b;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb5 = new StringBuilder(length + 43 + length2 + 31 + strValueOf.length() + 21 + strValueOf2.length() + 1);
        sb5.append("ContentBlock{content=");
        sb5.append(str);
        sb5.append(", contentLanguageCode=");
        sb5.append(str2);
        sb5.append(", referencedPlaceResourceNames=");
        sb5.append(strValueOf);
        sb5.append(", referencedPlaceIds=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
