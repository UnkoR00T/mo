package f6;

import android.util.Base64;
import i6.i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f59373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f59375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f59376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f59377h;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List<List<byte[]>> b() {
        return this.f59373d;
    }

    public int c() {
        return this.f59374e;
    }

    String d() {
        return this.f59377h;
    }

    public String e() {
        return this.f59370a;
    }

    public String f() {
        return this.f59371b;
    }

    public String g() {
        return this.f59372c;
    }

    public String h() {
        return this.f59375f;
    }

    public String i() {
        return this.f59376g;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("FontRequest {mProviderAuthority: " + this.f59370a + ", mProviderPackage: " + this.f59371b + ", mQuery: " + this.f59372c + ", mSystemFont: " + this.f59375f + ", mVariationSettings: " + this.f59376g + ", mCertificates:");
        for (int i15 = 0; i15 < this.f59373d.size(); i15++) {
            sb5.append(" [");
            List<byte[]> list = this.f59373d.get(i15);
            for (int i16 = 0; i16 < list.size(); i16++) {
                sb5.append(" \"");
                sb5.append(Base64.encodeToString(list.get(i16), 0));
                sb5.append("\"");
            }
            sb5.append(" ]");
        }
        sb5.append("}");
        sb5.append("mCertificatesArray: " + this.f59374e);
        return sb5.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        this.f59370a = (String) i.g(str);
        this.f59371b = (String) i.g(str2);
        this.f59372c = (String) i.g(str3);
        this.f59373d = (List) i.g(list);
        this.f59374e = 0;
        this.f59375f = str4;
        this.f59376g = str5;
        this.f59377h = a(str, str2, str3, str4, str5);
    }
}
