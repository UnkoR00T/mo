package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class f1 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f92426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f92427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f92428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f92429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f92430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f92431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f92432g;

    f1(o oVar, o oVar2, o oVar3, o oVar4, Uri uri, String str, String str2) {
        if (oVar == null) {
            throw new NullPointerException("Null overview");
        }
        this.f92426a = oVar;
        this.f92427b = oVar2;
        this.f92428c = oVar3;
        this.f92429d = oVar4;
        this.f92430e = uri;
        this.f92431f = str;
        this.f92432g = str2;
    }

    @Override // ii.t
    public final o b() {
        return this.f92427b;
    }

    @Override // ii.t
    public final String c() {
        return this.f92431f;
    }

    @Override // ii.t
    public final String d() {
        return this.f92432g;
    }

    @Override // ii.t
    public final Uri e() {
        return this.f92430e;
    }

    public final boolean equals(Object obj) {
        o oVar;
        o oVar2;
        o oVar3;
        Uri uri;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f92426a.equals(tVar.f()) && ((oVar = this.f92427b) != null ? oVar.equals(tVar.b()) : tVar.b() == null) && ((oVar2 = this.f92428c) != null ? oVar2.equals(tVar.g()) : tVar.g() == null) && ((oVar3 = this.f92429d) != null ? oVar3.equals(tVar.h()) : tVar.h() == null) && ((uri = this.f92430e) != null ? uri.equals(tVar.e()) : tVar.e() == null) && ((str = this.f92431f) != null ? str.equals(tVar.c()) : tVar.c() == null) && ((str2 = this.f92432g) != null ? str2.equals(tVar.d()) : tVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.t
    public final o f() {
        return this.f92426a;
    }

    @Override // ii.t
    public final o g() {
        return this.f92428c;
    }

    @Override // ii.t
    public final o h() {
        return this.f92429d;
    }

    public final int hashCode() {
        int iHashCode = this.f92426a.hashCode() ^ 1000003;
        o oVar = this.f92427b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        o oVar2 = this.f92428c;
        int iHashCode3 = (iHashCode2 ^ (oVar2 == null ? 0 : oVar2.hashCode())) * 1000003;
        o oVar3 = this.f92429d;
        int iHashCode4 = (iHashCode3 ^ (oVar3 == null ? 0 : oVar3.hashCode())) * 1000003;
        Uri uri = this.f92430e;
        int iHashCode5 = (iHashCode4 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str = this.f92431f;
        int iHashCode6 = (iHashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f92432g;
        return iHashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f92426a.toString();
        int length = string.length();
        Uri uri = this.f92430e;
        o oVar = this.f92429d;
        o oVar2 = this.f92428c;
        String strValueOf = String.valueOf(this.f92427b);
        String strValueOf2 = String.valueOf(oVar2);
        String strValueOf3 = String.valueOf(oVar);
        String strValueOf4 = String.valueOf(uri);
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        int length5 = strValueOf4.length();
        String str = this.f92431f;
        int length6 = String.valueOf(str).length();
        String str2 = this.f92432g;
        StringBuilder sb5 = new StringBuilder(length + 41 + length2 + 13 + length3 + 8 + length4 + 17 + length5 + 17 + length6 + 29 + String.valueOf(str2).length() + 1);
        sb5.append("EvChargeAmenitySummary{overview=");
        sb5.append(string);
        sb5.append(", coffee=");
        sb5.append(strValueOf);
        sb5.append(", restaurant=");
        sb5.append(strValueOf2);
        sb5.append(", store=");
        sb5.append(strValueOf3);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf4);
        sb5.append(", disclosureText=");
        sb5.append(str);
        sb5.append(", disclosureTextLanguageCode=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
