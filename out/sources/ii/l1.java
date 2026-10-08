package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class l1 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f92602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92604e;

    l1(String str, String str2, Uri uri, String str3, String str4) {
        this.f92600a = str;
        this.f92601b = str2;
        this.f92602c = uri;
        this.f92603d = str3;
        this.f92604e = str4;
    }

    @Override // ii.w
    public final String b() {
        return this.f92603d;
    }

    @Override // ii.w
    public final String c() {
        return this.f92604e;
    }

    @Override // ii.w
    public final Uri d() {
        return this.f92602c;
    }

    @Override // ii.w
    public final String e() {
        return this.f92600a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            String str = this.f92600a;
            if (str != null ? str.equals(wVar.e()) : wVar.e() == null) {
                String str2 = this.f92601b;
                if (str2 != null ? str2.equals(wVar.f()) : wVar.f() == null) {
                    Uri uri = this.f92602c;
                    if (uri != null ? uri.equals(wVar.d()) : wVar.d() == null) {
                        String str3 = this.f92603d;
                        if (str3 != null ? str3.equals(wVar.b()) : wVar.b() == null) {
                            String str4 = this.f92604e;
                            if (str4 != null ? str4.equals(wVar.c()) : wVar.c() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.w
    public final String f() {
        return this.f92601b;
    }

    public final int hashCode() {
        String str = this.f92600a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92601b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        Uri uri = this.f92602c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str3 = this.f92603d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f92604e;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f92602c);
        String str = this.f92600a;
        int length = String.valueOf(str).length();
        String str2 = this.f92601b;
        int length2 = String.valueOf(str2).length();
        int length3 = strValueOf.length();
        String str3 = this.f92603d;
        int length4 = String.valueOf(str3).length();
        String str4 = this.f92604e;
        StringBuilder sb5 = new StringBuilder(length + 50 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str4).length() + 1);
        sb5.append("GenerativeSummary{overview=");
        sb5.append(str);
        sb5.append(", overviewLanguageCode=");
        sb5.append(str2);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf);
        sb5.append(", disclosureText=");
        sb5.append(str3);
        sb5.append(", disclosureTextLanguageCode=");
        sb5.append(str4);
        sb5.append("}");
        return sb5.toString();
    }
}
