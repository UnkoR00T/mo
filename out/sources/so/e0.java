package so;

import io.sentry.android.core.c2;
import java.io.IOException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class e0 extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f182616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f182617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short f182618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short f182619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f182620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f182621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f182622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f182623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f182624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String[] f182625p;

    e0(n0 n0Var) {
        super(n0Var);
        this.f182625p = null;
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        String str;
        String[] strArr;
        this.f182616g = i0Var.r();
        this.f182617h = i0Var.r();
        this.f182618i = i0Var.E();
        this.f182619j = i0Var.E();
        this.f182620k = i0Var.M();
        this.f182621l = i0Var.M();
        this.f182622m = i0Var.M();
        this.f182623n = i0Var.M();
        this.f182624o = i0Var.M();
        float f15 = this.f182616g;
        int i15 = 0;
        if (f15 == 1.0f) {
            String[] strArr2 = new String[258];
            this.f182625p = strArr2;
            System.arraycopy(r0.f182799a, 0, strArr2, 0, 258);
        } else if (f15 == 2.0f) {
            int iN = i0Var.N();
            int[] iArr = new int[iN];
            this.f182625p = new String[iN];
            int iMax = PKIFailureInfo.systemUnavail;
            for (int i16 = 0; i16 < iN; i16++) {
                int iN2 = i0Var.N();
                iArr[i16] = iN2;
                if (iN2 <= 32767) {
                    iMax = Math.max(iMax, iN2);
                }
            }
            if (iMax >= 258) {
                int i17 = iMax - 257;
                strArr = new String[i17];
                int i18 = 0;
                while (i18 < i17) {
                    try {
                        strArr[i18] = i0Var.H(i0Var.K());
                        i18++;
                    } catch (IOException e15) {
                        c2.h("PdfBox-Android", "Error reading names in PostScript table at entry " + i18 + " of " + i17 + ", setting remaining entries to .notdef", e15);
                        while (i18 < i17) {
                            strArr[i18] = ".notdef";
                            i18++;
                        }
                    }
                }
            } else {
                strArr = null;
            }
            while (i15 < iN) {
                int i19 = iArr[i15];
                if (i19 >= 0 && i19 < 258) {
                    this.f182625p[i15] = r0.f182799a[i19];
                } else if (i19 < 258 || i19 > 32767) {
                    this.f182625p[i15] = ".undefined";
                } else {
                    this.f182625p[i15] = strArr[i19 - 258];
                }
                i15++;
            }
        } else if (f15 == 2.5f) {
            int iZ = n0Var.Z();
            int[] iArr2 = new int[iZ];
            int i25 = 0;
            while (i25 < iZ) {
                int i26 = i25 + 1;
                iArr2[i25] = i0Var.C() + i26;
                i25 = i26;
            }
            this.f182625p = new String[iZ];
            while (true) {
                String[] strArr3 = this.f182625p;
                if (i15 >= strArr3.length) {
                    break;
                }
                int i27 = iArr2[i15];
                if (i27 >= 0 && i27 < 258 && (str = r0.f182799a[i27]) != null) {
                    strArr3[i15] = str;
                }
                i15++;
            }
        } else if (f15 == 3.0f) {
            this.f182682f.getName();
        }
        this.f182681e = true;
    }

    public String[] j() {
        return this.f182625p;
    }

    public long k() {
        return this.f182620k;
    }

    public float l() {
        return this.f182617h;
    }

    public long m() {
        return this.f182624o;
    }

    public long n() {
        return this.f182622m;
    }

    public long o() {
        return this.f182623n;
    }

    public long p() {
        return this.f182621l;
    }

    public String q(int i15) {
        String[] strArr;
        if (i15 < 0 || (strArr = this.f182625p) == null || i15 >= strArr.length) {
            return null;
        }
        return strArr[i15];
    }

    public short r() {
        return this.f182618i;
    }

    public short s() {
        return this.f182619j;
    }
}
