package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class q2 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f92723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f92724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f92725h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f92726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f92727k;

    q2(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8) {
        if (str == null) {
            throw new NullPointerException("Null regionCode");
        }
        this.f92718a = str;
        this.f92719b = str2;
        this.f92720c = str3;
        this.f92721d = str4;
        this.f92722e = str5;
        this.f92723f = str6;
        this.f92724g = str7;
        this.f92725h = list;
        this.f92726j = list2;
        this.f92727k = str8;
    }

    @Override // ii.o0
    public final List<String> b() {
        return this.f92725h;
    }

    @Override // ii.o0
    public final String c() {
        return this.f92722e;
    }

    @Override // ii.o0
    public final String d() {
        return this.f92719b;
    }

    @Override // ii.o0
    public final String e() {
        return this.f92723f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        List list2;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.f92718a.equals(o0Var.i()) && ((str = this.f92719b) != null ? str.equals(o0Var.d()) : o0Var.d() == null) && ((str2 = this.f92720c) != null ? str2.equals(o0Var.g()) : o0Var.g() == null) && ((str3 = this.f92721d) != null ? str3.equals(o0Var.j()) : o0Var.j() == null) && ((str4 = this.f92722e) != null ? str4.equals(o0Var.c()) : o0Var.c() == null) && ((str5 = this.f92723f) != null ? str5.equals(o0Var.e()) : o0Var.e() == null) && ((str6 = this.f92724g) != null ? str6.equals(o0Var.k()) : o0Var.k() == null) && ((list = this.f92725h) != null ? list.equals(o0Var.b()) : o0Var.b() == null) && ((list2 = this.f92726j) != null ? list2.equals(o0Var.h()) : o0Var.h() == null) && ((str7 = this.f92727k) != null ? str7.equals(o0Var.f()) : o0Var.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.o0
    public final String f() {
        return this.f92727k;
    }

    @Override // ii.o0
    public final String g() {
        return this.f92720c;
    }

    @Override // ii.o0
    public final List<String> h() {
        return this.f92726j;
    }

    public final int hashCode() {
        int iHashCode = this.f92718a.hashCode() ^ 1000003;
        String str = this.f92719b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f92720c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f92721d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92722e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f92723f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f92724g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        List list = this.f92725h;
        int iHashCode8 = (iHashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f92726j;
        int iHashCode9 = (iHashCode8 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str7 = this.f92727k;
        return iHashCode9 ^ (str7 != null ? str7.hashCode() : 0);
    }

    @Override // ii.o0
    public final String i() {
        return this.f92718a;
    }

    @Override // ii.o0
    public final String j() {
        return this.f92721d;
    }

    @Override // ii.o0
    public final String k() {
        return this.f92724g;
    }

    public final String toString() {
        List list = this.f92726j;
        String strValueOf = String.valueOf(this.f92725h);
        String strValueOf2 = String.valueOf(list);
        String str = this.f92719b;
        int length = String.valueOf(str).length();
        String str2 = this.f92720c;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92721d;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f92722e;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f92723f;
        int length5 = String.valueOf(str5).length();
        String str6 = this.f92724g;
        int length6 = String.valueOf(str6).length();
        int length7 = strValueOf.length();
        int length8 = strValueOf2.length();
        String str7 = this.f92727k;
        int length9 = String.valueOf(str7).length();
        String str8 = this.f92718a;
        StringBuilder sb5 = new StringBuilder(str8.length() + 40 + length + 13 + length2 + 14 + length3 + 21 + length4 + 11 + length5 + 14 + length6 + 15 + length7 + 13 + length8 + 15 + length9 + 1);
        sb5.append("PostalAddress{regionCode=");
        sb5.append(str8);
        sb5.append(", languageCode=");
        sb5.append(str);
        sb5.append(", postalCode=");
        sb5.append(str2);
        sb5.append(", sortingCode=");
        sb5.append(str3);
        sb5.append(", administrativeArea=");
        sb5.append(str4);
        sb5.append(", locality=");
        sb5.append(str5);
        sb5.append(", sublocality=");
        sb5.append(str6);
        sb5.append(", addressLines=");
        sb5.append(strValueOf);
        sb5.append(", recipients=");
        sb5.append(strValueOf2);
        sb5.append(", organization=");
        sb5.append(str7);
        sb5.append("}");
        return sb5.toString();
    }
}
