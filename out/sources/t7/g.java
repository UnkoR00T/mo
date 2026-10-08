package t7;

import java.util.Arrays;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f188182h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f188183i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f188184j = o0.u0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f188185k = o0.u0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f188186l = o0.u0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f188187m = o0.u0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f188188n = o0.u0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f188189o = o0.u0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f188193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f188194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f188195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f188196g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f188197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f188198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f188199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f188200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f188201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f188202f;

        public g a() {
            return new g(this.f188197a, this.f188198b, this.f188199c, this.f188200d, this.f188201e, this.f188202f);
        }

        public b b(int i15) {
            this.f188202f = i15;
            return this;
        }

        public b c(int i15) {
            this.f188198b = i15;
            return this;
        }

        public b d(int i15) {
            this.f188197a = i15;
            return this;
        }

        public b e(int i15) {
            this.f188199c = i15;
            return this;
        }

        public b f(byte[] bArr) {
            this.f188200d = bArr;
            return this;
        }

        public b g(int i15) {
            this.f188201e = i15;
            return this;
        }

        public b() {
            this.f188197a = -1;
            this.f188198b = -1;
            this.f188199c = -1;
            this.f188201e = -1;
            this.f188202f = -1;
        }

        private b(g gVar) {
            this.f188197a = gVar.f188190a;
            this.f188198b = gVar.f188191b;
            this.f188199c = gVar.f188192c;
            this.f188200d = gVar.f188193d;
            this.f188201e = gVar.f188194e;
            this.f188202f = gVar.f188195f;
        }
    }

    private static String b(int i15) {
        if (i15 == -1) {
            return "NA";
        }
        return i15 + "bit Chroma";
    }

    private static String c(int i15) {
        if (i15 == -1) {
            return "Unset color range";
        }
        if (i15 == 1) {
            return "Full range";
        }
        if (i15 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i15;
    }

    private static String d(int i15) {
        if (i15 == -1) {
            return "Unset color space";
        }
        if (i15 == 6) {
            return "BT2020";
        }
        if (i15 == 1) {
            return "BT709";
        }
        if (i15 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i15;
    }

    private static String e(int i15) {
        if (i15 == -1) {
            return "Unset color transfer";
        }
        if (i15 == 10) {
            return "Gamma 2.2";
        }
        if (i15 == 1) {
            return "Linear";
        }
        if (i15 == 2) {
            return "sRGB";
        }
        if (i15 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i15 == 6) {
            return "ST2084 PQ";
        }
        if (i15 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i15;
    }

    public static boolean h(g gVar) {
        if (gVar == null) {
            return true;
        }
        int i15 = gVar.f188190a;
        if (i15 != -1 && i15 != 1 && i15 != 2) {
            return false;
        }
        int i16 = gVar.f188191b;
        if (i16 != -1 && i16 != 2) {
            return false;
        }
        int i17 = gVar.f188192c;
        if ((i17 != -1 && i17 != 3) || gVar.f188193d != null) {
            return false;
        }
        int i18 = gVar.f188195f;
        if (i18 != -1 && i18 != 8) {
            return false;
        }
        int i19 = gVar.f188194e;
        return i19 == -1 || i19 == 8;
    }

    public static int j(int i15) {
        if (i15 == 1) {
            return 1;
        }
        if (i15 != 9) {
            return (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i15) {
        if (i15 == 1) {
            return 3;
        }
        if (i15 == 4) {
            return 10;
        }
        if (i15 == 13) {
            return 2;
        }
        if (i15 == 16) {
            return 6;
        }
        if (i15 != 18) {
            return (i15 == 6 || i15 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i15) {
        if (i15 == -1) {
            return "NA";
        }
        return i15 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f188190a == gVar.f188190a && this.f188191b == gVar.f188191b && this.f188192c == gVar.f188192c && Arrays.equals(this.f188193d, gVar.f188193d) && this.f188194e == gVar.f188194e && this.f188195f == gVar.f188195f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f188194e == -1 || this.f188195f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f188190a == -1 || this.f188191b == -1 || this.f188192c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f188196g == 0) {
            this.f188196g = ((((((((((527 + this.f188190a) * 31) + this.f188191b) * 31) + this.f188192c) * 31) + Arrays.hashCode(this.f188193d)) * 31) + this.f188194e) * 31) + this.f188195f;
        }
        return this.f188196g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strF = g() ? o0.F("%s/%s/%s", d(this.f188190a), c(this.f188191b), e(this.f188192c)) : "NA/NA/NA";
        if (f()) {
            str = this.f188194e + "/" + this.f188195f;
        } else {
            str = "NA/NA";
        }
        return strF + "/" + str;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("ColorInfo(");
        sb5.append(d(this.f188190a));
        sb5.append(", ");
        sb5.append(c(this.f188191b));
        sb5.append(", ");
        sb5.append(e(this.f188192c));
        sb5.append(", ");
        sb5.append(this.f188193d != null);
        sb5.append(", ");
        sb5.append(l(this.f188194e));
        sb5.append(", ");
        sb5.append(b(this.f188195f));
        sb5.append(")");
        return sb5.toString();
    }

    private g(int i15, int i16, int i17, byte[] bArr, int i18, int i19) {
        this.f188190a = i15;
        this.f188191b = i16;
        this.f188192c = i17;
        this.f188193d = bArr;
        this.f188194e = i18;
        this.f188195f = i19;
    }
}
