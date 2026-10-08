package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class v7 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f92835d;

    v7(String str, String str2, String str3, Uri uri) {
        this.f92832a = str;
        this.f92833b = str2;
        this.f92834c = str3;
        this.f92835d = uri;
    }

    @Override // ii.m
    public String b() {
        return this.f92834c;
    }

    @Override // ii.m
    public Uri c() {
        return this.f92835d;
    }

    @Override // ii.m
    public String d() {
        return this.f92833b;
    }

    @Override // ii.m
    public String e() {
        return this.f92832a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            String str = this.f92832a;
            if (str != null ? str.equals(mVar.e()) : mVar.e() == null) {
                String str2 = this.f92833b;
                if (str2 != null ? str2.equals(mVar.d()) : mVar.d() == null) {
                    String str3 = this.f92834c;
                    if (str3 != null ? str3.equals(mVar.b()) : mVar.b() == null) {
                        Uri uri = this.f92835d;
                        if (uri != null ? uri.equals(mVar.c()) : mVar.c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f92832a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f92833b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i15 = iHashCode ^ 1000003;
        String str3 = this.f92834c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Uri uri = this.f92835d;
        return iHashCode3 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f92835d);
        String str = this.f92832a;
        int length = String.valueOf(str).length();
        String str2 = this.f92833b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f92834c;
        StringBuilder sb5 = new StringBuilder(length + 41 + length2 + 17 + String.valueOf(str3).length() + 15 + strValueOf.length() + 1);
        sb5.append("ConsumerAlertDetails{title=");
        sb5.append(str);
        sb5.append(", description=");
        sb5.append(str2);
        sb5.append(", aboutLinkTitle=");
        sb5.append(str3);
        sb5.append(", aboutLinkUri=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
