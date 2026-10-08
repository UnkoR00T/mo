package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class u2 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Double f92793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f92794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f92795h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f92796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Uri f92797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a0 f92798l;

    u2(String str, String str2, String str3, String str4, String str5, Double d15, f fVar, String str6, String str7, Uri uri, a0 a0Var) {
        this.f92788a = str;
        this.f92789b = str2;
        this.f92790c = str3;
        this.f92791d = str4;
        this.f92792e = str5;
        this.f92793f = d15;
        if (fVar == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.f92794g = fVar;
        if (str6 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.f92795h = str6;
        this.f92796j = str7;
        this.f92797k = uri;
        this.f92798l = a0Var;
    }

    @Override // ii.r0
    public final String b() {
        return this.f92795h;
    }

    @Override // ii.r0
    public final f c() {
        return this.f92794g;
    }

    @Override // ii.r0
    public final Uri d() {
        return this.f92797k;
    }

    @Override // ii.r0
    public final String e() {
        return this.f92791d;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        a0 a0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            String str2 = this.f92788a;
            if (str2 != null ? str2.equals(r0Var.i()) : r0Var.i() == null) {
                String str3 = this.f92789b;
                if (str3 != null ? str3.equals(r0Var.j()) : r0Var.j() == null) {
                    String str4 = this.f92790c;
                    if (str4 != null ? str4.equals(r0Var.k()) : r0Var.k() == null) {
                        String str5 = this.f92791d;
                        if (str5 != null ? str5.equals(r0Var.e()) : r0Var.e() == null) {
                            String str6 = this.f92792e;
                            if (str6 != null ? str6.equals(r0Var.f()) : r0Var.f() == null) {
                                if (this.f92793f.equals(r0Var.h()) && this.f92794g.equals(r0Var.c()) && this.f92795h.equals(r0Var.b()) && ((str = this.f92796j) != null ? str.equals(r0Var.g()) : r0Var.g() == null) && ((uri = this.f92797k) != null ? uri.equals(r0Var.d()) : r0Var.d() == null) && ((a0Var = this.f92798l) != null ? a0Var.equals(r0Var.l()) : r0Var.l() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.r0
    public final String f() {
        return this.f92792e;
    }

    @Override // ii.r0
    public final String g() {
        return this.f92796j;
    }

    @Override // ii.r0
    public final Double h() {
        return this.f92793f;
    }

    public final int hashCode() {
        String str = this.f92788a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92789b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        String str3 = this.f92790c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92791d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f92792e;
        int iHashCode5 = (((((((iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.f92793f.hashCode()) * 1000003) ^ this.f92794g.hashCode()) * 1000003) ^ this.f92795h.hashCode()) * 1000003;
        String str6 = this.f92796j;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Uri uri = this.f92797k;
        int iHashCode7 = (iHashCode6 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        a0 a0Var = this.f92798l;
        return iHashCode7 ^ (a0Var != null ? a0Var.hashCode() : 0);
    }

    @Override // ii.r0
    public final String i() {
        return this.f92788a;
    }

    @Override // ii.r0
    public final String j() {
        return this.f92789b;
    }

    @Override // ii.r0
    public final String k() {
        return this.f92790c;
    }

    @Override // ii.r0
    public final a0 l() {
        return this.f92798l;
    }

    public final String toString() {
        a0 a0Var = this.f92798l;
        Uri uri = this.f92797k;
        String string = this.f92794g.toString();
        String strValueOf = String.valueOf(uri);
        String strValueOf2 = String.valueOf(a0Var);
        String str = this.f92788a;
        int length = String.valueOf(str).length();
        String str2 = this.f92789b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92790c;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f92791d;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f92792e;
        int length5 = String.valueOf(str5).length();
        Double d15 = this.f92793f;
        int length6 = d15.toString().length();
        int length7 = string.length();
        String str6 = this.f92796j;
        int length8 = String.valueOf(str6).length();
        int length9 = strValueOf.length();
        int length10 = strValueOf2.length();
        int i15 = length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7;
        String str7 = this.f92795h;
        StringBuilder sb5 = new StringBuilder(i15 + 14 + str7.length() + 14 + length8 + 17 + length9 + 12 + length10 + 1);
        sb5.append("Review{relativePublishTimeDescription=");
        sb5.append(str);
        sb5.append(", text=");
        sb5.append(str2);
        sb5.append(", textLanguageCode=");
        sb5.append(str3);
        sb5.append(", originalText=");
        sb5.append(str4);
        sb5.append(", originalTextLanguageCode=");
        sb5.append(str5);
        sb5.append(", rating=");
        sb5.append(d15);
        sb5.append(", authorAttribution=");
        sb5.append(string);
        sb5.append(", attribution=");
        sb5.append(str7);
        sb5.append(", publishTime=");
        sb5.append(str6);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf);
        sb5.append(", visitDate=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
