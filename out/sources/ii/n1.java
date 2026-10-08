package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class n1 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f92664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f92665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f92666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f92667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f92668e;

    n1(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        this.f92664a = uri;
        this.f92665b = uri2;
        this.f92666c = uri3;
        this.f92667d = uri4;
        this.f92668e = uri5;
    }

    @Override // ii.x
    public final Uri b() {
        return this.f92664a;
    }

    @Override // ii.x
    public final Uri c() {
        return this.f92668e;
    }

    @Override // ii.x
    public final Uri d() {
        return this.f92665b;
    }

    @Override // ii.x
    public final Uri e() {
        return this.f92667d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            Uri uri = this.f92664a;
            if (uri != null ? uri.equals(xVar.b()) : xVar.b() == null) {
                Uri uri2 = this.f92665b;
                if (uri2 != null ? uri2.equals(xVar.d()) : xVar.d() == null) {
                    Uri uri3 = this.f92666c;
                    if (uri3 != null ? uri3.equals(xVar.f()) : xVar.f() == null) {
                        Uri uri4 = this.f92667d;
                        if (uri4 != null ? uri4.equals(xVar.e()) : xVar.e() == null) {
                            Uri uri5 = this.f92668e;
                            if (uri5 != null ? uri5.equals(xVar.c()) : xVar.c() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.x
    public final Uri f() {
        return this.f92666c;
    }

    public final int hashCode() {
        Uri uri = this.f92664a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.f92665b;
        int iHashCode2 = uri2 == null ? 0 : uri2.hashCode();
        int i15 = iHashCode ^ 1000003;
        Uri uri3 = this.f92666c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (uri3 == null ? 0 : uri3.hashCode())) * 1000003;
        Uri uri4 = this.f92667d;
        int iHashCode4 = (iHashCode3 ^ (uri4 == null ? 0 : uri4.hashCode())) * 1000003;
        Uri uri5 = this.f92668e;
        return iHashCode4 ^ (uri5 != null ? uri5.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.f92668e;
        Uri uri2 = this.f92667d;
        Uri uri3 = this.f92666c;
        Uri uri4 = this.f92665b;
        String strValueOf = String.valueOf(this.f92664a);
        String strValueOf2 = String.valueOf(uri4);
        String strValueOf3 = String.valueOf(uri3);
        String strValueOf4 = String.valueOf(uri2);
        String strValueOf5 = String.valueOf(uri);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        StringBuilder sb5 = new StringBuilder(length + 41 + length2 + 18 + length3 + 13 + strValueOf4.length() + 12 + strValueOf5.length() + 1);
        sb5.append("GoogleMapsLinks{directionsUri=");
        sb5.append(strValueOf);
        sb5.append(", placeUri=");
        sb5.append(strValueOf2);
        sb5.append(", writeAReviewUri=");
        sb5.append(strValueOf3);
        sb5.append(", reviewsUri=");
        sb5.append(strValueOf4);
        sb5.append(", photosUri=");
        sb5.append(strValueOf5);
        sb5.append("}");
        return sb5.toString();
    }
}
