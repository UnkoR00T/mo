package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class p1 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f92701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y.b f92702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Double f92703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Double f92704h;

    p1(String str, String str2, String str3, String str4, List list, y.b bVar, Double d15, Double d16) {
        this.f92697a = str;
        this.f92698b = str2;
        this.f92699c = str3;
        this.f92700d = str4;
        this.f92701e = list;
        this.f92702f = bVar;
        this.f92703g = d15;
        this.f92704h = d16;
    }

    @Override // ii.y
    public final String b() {
        return this.f92699c;
    }

    @Override // ii.y
    public final String c() {
        return this.f92700d;
    }

    @Override // ii.y
    public final String d() {
        return this.f92698b;
    }

    @Override // ii.y
    public final String e() {
        return this.f92697a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            String str = this.f92697a;
            if (str != null ? str.equals(yVar.e()) : yVar.e() == null) {
                String str2 = this.f92698b;
                if (str2 != null ? str2.equals(yVar.d()) : yVar.d() == null) {
                    String str3 = this.f92699c;
                    if (str3 != null ? str3.equals(yVar.b()) : yVar.b() == null) {
                        String str4 = this.f92700d;
                        if (str4 != null ? str4.equals(yVar.c()) : yVar.c() == null) {
                            List list = this.f92701e;
                            if (list != null ? list.equals(yVar.i()) : yVar.i() == null) {
                                y.b bVar = this.f92702f;
                                if (bVar != null ? bVar.equals(yVar.f()) : yVar.f() == null) {
                                    Double d15 = this.f92703g;
                                    if (d15 != null ? d15.equals(yVar.g()) : yVar.g() == null) {
                                        Double d16 = this.f92704h;
                                        if (d16 != null ? d16.equals(yVar.h()) : yVar.h() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.y
    public final y.b f() {
        return this.f92702f;
    }

    @Override // ii.y
    public final Double g() {
        return this.f92703g;
    }

    @Override // ii.y
    public final Double h() {
        return this.f92704h;
    }

    public final int hashCode() {
        String str = this.f92697a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92698b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        String str3 = this.f92699c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92700d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List list = this.f92701e;
        int iHashCode5 = (iHashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        y.b bVar = this.f92702f;
        int iHashCode6 = (iHashCode5 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        Double d15 = this.f92703g;
        int iHashCode7 = (iHashCode6 ^ (d15 == null ? 0 : d15.hashCode())) * 1000003;
        Double d16 = this.f92704h;
        return iHashCode7 ^ (d16 != null ? d16.hashCode() : 0);
    }

    @Override // ii.y
    public final List<String> i() {
        return this.f92701e;
    }

    public final String toString() {
        y.b bVar = this.f92702f;
        String strValueOf = String.valueOf(this.f92701e);
        String strValueOf2 = String.valueOf(bVar);
        String str = this.f92697a;
        int length = String.valueOf(str).length();
        String str2 = this.f92698b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92699c;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f92700d;
        int length4 = String.valueOf(str4).length();
        int length5 = strValueOf.length();
        int length6 = strValueOf2.length();
        Double d15 = this.f92703g;
        int length7 = String.valueOf(d15).length();
        Double d16 = this.f92704h;
        StringBuilder sb5 = new StringBuilder(length + 27 + length2 + 14 + length3 + 26 + length4 + 8 + length5 + 22 + length6 + 29 + length7 + 23 + String.valueOf(d16).length() + 1);
        sb5.append("Landmark{resourceName=");
        sb5.append(str);
        sb5.append(", id=");
        sb5.append(str2);
        sb5.append(", displayName=");
        sb5.append(str3);
        sb5.append(", displayNameLanguageCode=");
        sb5.append(str4);
        sb5.append(", types=");
        sb5.append(strValueOf);
        sb5.append(", spatialRelationship=");
        sb5.append(strValueOf2);
        sb5.append(", straightLineDistanceMeters=");
        sb5.append(d15);
        sb5.append(", travelDistanceMeters=");
        sb5.append(d16);
        sb5.append("}");
        return sb5.toString();
    }
}
