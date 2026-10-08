package h5;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f80993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f80994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f80996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f80998f;

    public a(a aVar) {
        this.f80995c = PKIFailureInfo.systemUnavail;
        this.f80996d = Float.NaN;
        this.f80997e = null;
        this.f80993a = aVar.f80993a;
        this.f80994b = aVar.f80994b;
        this.f80995c = aVar.f80995c;
        this.f80996d = aVar.f80996d;
        this.f80997e = aVar.f80997e;
        this.f80998f = aVar.f80998f;
    }

    public static String a(int i15) {
        String str = "00000000" + Integer.toHexString(i15);
        return "#" + str.substring(str.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f80998f;
    }

    public float d() {
        return this.f80996d;
    }

    public int e() {
        return this.f80995c;
    }

    public String f() {
        return this.f80993a;
    }

    public String g() {
        return this.f80997e;
    }

    public int h() {
        return this.f80994b;
    }

    public void i(float f15) {
        this.f80996d = f15;
    }

    public void j(int i15) {
        this.f80995c = i15;
    }

    public String toString() {
        String str = this.f80993a + ':';
        switch (this.f80994b) {
            case 900:
                return str + this.f80995c;
            case 901:
                return str + this.f80996d;
            case 902:
                return str + a(this.f80995c);
            case 903:
                return str + this.f80997e;
            case 904:
                return str + Boolean.valueOf(this.f80998f);
            case 905:
                return str + this.f80996d;
            default:
                return str + "????";
        }
    }

    public a(String str, int i15, int i16) {
        this.f80995c = PKIFailureInfo.systemUnavail;
        this.f80996d = Float.NaN;
        this.f80997e = null;
        this.f80993a = str;
        this.f80994b = i15;
        if (i15 == 901) {
            this.f80996d = i16;
        } else {
            this.f80995c = i16;
        }
    }

    public a(String str, int i15, float f15) {
        this.f80995c = PKIFailureInfo.systemUnavail;
        this.f80997e = null;
        this.f80993a = str;
        this.f80994b = i15;
        this.f80996d = f15;
    }
}
