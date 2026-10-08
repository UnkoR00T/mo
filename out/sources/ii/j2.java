package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class j2 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f92494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f92495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f92496h;

    j2(String str, int i15, int i16, String str2, String str3, g gVar, Uri uri, Uri uri2) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.f92489a = str;
        this.f92490b = i15;
        this.f92491c = i16;
        if (str2 == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.f92492d = str2;
        this.f92493e = str3;
        this.f92494f = gVar;
        this.f92495g = uri;
        this.f92496h = uri2;
    }

    @Override // ii.k0
    public String b() {
        return this.f92489a;
    }

    @Override // ii.k0
    public g c() {
        return this.f92494f;
    }

    @Override // ii.k0
    public Uri d() {
        return this.f92495g;
    }

    @Override // ii.k0
    public Uri e() {
        return this.f92496h;
    }

    public final boolean equals(Object obj) {
        String str;
        g gVar;
        Uri uri;
        Uri uri2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f92489a.equals(k0Var.b()) && this.f92490b == k0Var.f() && this.f92491c == k0Var.g() && this.f92492d.equals(k0Var.h()) && ((str = this.f92493e) != null ? str.equals(k0Var.i()) : k0Var.i() == null) && ((gVar = this.f92494f) != null ? gVar.equals(k0Var.c()) : k0Var.c() == null) && ((uri = this.f92495g) != null ? uri.equals(k0Var.d()) : k0Var.d() == null) && ((uri2 = this.f92496h) != null ? uri2.equals(k0Var.e()) : k0Var.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.k0
    public int f() {
        return this.f92490b;
    }

    @Override // ii.k0
    public int g() {
        return this.f92491c;
    }

    @Override // ii.k0
    public final String h() {
        return this.f92492d;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f92489a.hashCode() ^ 1000003) * 1000003) ^ this.f92490b) * 1000003) ^ this.f92491c) * 1000003) ^ this.f92492d.hashCode();
        String str = this.f92493e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        g gVar = this.f92494f;
        int iHashCode3 = (iHashCode2 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        Uri uri = this.f92495g;
        int iHashCode4 = (iHashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.f92496h;
        return iHashCode4 ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // ii.k0
    public final String i() {
        return this.f92493e;
    }

    public final String toString() {
        Uri uri = this.f92496h;
        Uri uri2 = this.f92495g;
        String strValueOf = String.valueOf(this.f92494f);
        String strValueOf2 = String.valueOf(uri2);
        String strValueOf3 = String.valueOf(uri);
        int i15 = this.f92490b;
        int length = String.valueOf(i15).length();
        int i16 = this.f92491c;
        int length2 = String.valueOf(i16).length();
        String str = this.f92493e;
        int length3 = String.valueOf(str).length();
        int length4 = strValueOf.length();
        int length5 = strValueOf2.length();
        int length6 = strValueOf3.length();
        String str2 = this.f92489a;
        int length7 = str2.length() + 36 + length + 8 + length2;
        String str3 = this.f92492d;
        StringBuilder sb5 = new StringBuilder(length7 + 17 + str3.length() + 7 + length3 + 21 + length4 + 17 + length5 + 16 + length6 + 1);
        sb5.append("PhotoMetadata{attributions=");
        sb5.append(str2);
        sb5.append(", height=");
        sb5.append(i15);
        sb5.append(", width=");
        sb5.append(i16);
        sb5.append(", photoReference=");
        sb5.append(str3);
        sb5.append(", name=");
        sb5.append(str);
        sb5.append(", authorAttributions=");
        sb5.append(strValueOf);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf2);
        sb5.append(", googleMapsUri=");
        sb5.append(strValueOf3);
        sb5.append("}");
        return sb5.toString();
    }
}
