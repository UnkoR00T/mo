package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class x2 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f92850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f92853f;

    x2(String str, String str2, Uri uri, String str3, String str4, Uri uri2) {
        this.f92848a = str;
        this.f92849b = str2;
        this.f92850c = uri;
        this.f92851d = str3;
        this.f92852e = str4;
        this.f92853f = uri2;
    }

    @Override // ii.s0
    public final String b() {
        return this.f92851d;
    }

    @Override // ii.s0
    public final String c() {
        return this.f92852e;
    }

    @Override // ii.s0
    public final Uri d() {
        return this.f92850c;
    }

    @Override // ii.s0
    public final Uri e() {
        return this.f92853f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            String str = this.f92848a;
            if (str != null ? str.equals(s0Var.f()) : s0Var.f() == null) {
                String str2 = this.f92849b;
                if (str2 != null ? str2.equals(s0Var.g()) : s0Var.g() == null) {
                    Uri uri = this.f92850c;
                    if (uri != null ? uri.equals(s0Var.d()) : s0Var.d() == null) {
                        String str3 = this.f92851d;
                        if (str3 != null ? str3.equals(s0Var.b()) : s0Var.b() == null) {
                            String str4 = this.f92852e;
                            if (str4 != null ? str4.equals(s0Var.c()) : s0Var.c() == null) {
                                Uri uri2 = this.f92853f;
                                if (uri2 != null ? uri2.equals(s0Var.e()) : s0Var.e() == null) {
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

    @Override // ii.s0
    public final String f() {
        return this.f92848a;
    }

    @Override // ii.s0
    public final String g() {
        return this.f92849b;
    }

    public final int hashCode() {
        String str = this.f92848a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92849b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        Uri uri = this.f92850c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str3 = this.f92851d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92852e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Uri uri2 = this.f92853f;
        return iHashCode5 ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.f92853f;
        String strValueOf = String.valueOf(this.f92850c);
        String strValueOf2 = String.valueOf(uri);
        String str = this.f92848a;
        int length = String.valueOf(str).length();
        String str2 = this.f92849b;
        int length2 = String.valueOf(str2).length();
        int length3 = strValueOf.length();
        String str3 = this.f92851d;
        int length4 = String.valueOf(str3).length();
        String str4 = this.f92852e;
        StringBuilder sb5 = new StringBuilder(length + 38 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str4).length() + 13 + strValueOf2.length() + 1);
        sb5.append("ReviewSummary{text=");
        sb5.append(str);
        sb5.append(", textLanguageCode=");
        sb5.append(str2);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf);
        sb5.append(", disclosureText=");
        sb5.append(str3);
        sb5.append(", disclosureTextLanguageCode=");
        sb5.append(str4);
        sb5.append(", reviewsUri=");
        sb5.append(strValueOf2);
        sb5.append("}");
        return sb5.toString();
    }
}
