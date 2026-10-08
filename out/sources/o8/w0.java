package o8;

import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f143226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f143229d;

    private w0(List<byte[]> list, int i15, String str, int i16) {
        this.f143226a = list;
        this.f143227b = i15;
        this.f143228c = str;
        this.f143229d = i16;
    }

    public static w0 a(w7.c0 c0Var) throws t7.x {
        int iQ;
        int iQ2;
        int i15;
        int i16;
        int i17;
        try {
            if (c0Var.z() != 0) {
                throw t7.x.a("Unsupported VVC version", null);
            }
            int iQ3 = c0Var.Q();
            int i18 = (iQ3 >> 1) & 3;
            int i19 = 1;
            boolean z15 = (iQ3 & 1) != 0;
            int i25 = i18 + 1;
            String str = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u;
            if (z15) {
                c0Var.g0(1);
                int iQ4 = (c0Var.Q() >> 4) & 7;
                iQ = (c0Var.Q() >> 5) & 7;
                int iQ5 = c0Var.Q() & 63;
                int iQ6 = c0Var.Q();
                i15 = (iQ6 >> 1) & CertificateBody.profileType;
                if ((iQ6 & 1) != 0) {
                    str = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n;
                }
                iQ2 = c0Var.Q();
                c0Var.g0(iQ5);
                if (iQ4 > 1) {
                    int iQ7 = c0Var.Q();
                    for (int i26 = 0; i26 < iQ4 - 1; i26++) {
                        if (((iQ7 >> (7 - i26)) & 1) != 0) {
                            c0Var.g0(1);
                        }
                    }
                }
                c0Var.g0(c0Var.Q() * 4);
                c0Var.g0(6);
            } else {
                iQ = 0;
                iQ2 = 0;
                i15 = 0;
            }
            int iQ8 = c0Var.Q();
            int iG = c0Var.g();
            int i27 = 0;
            int i28 = 0;
            while (true) {
                i16 = 12;
                i17 = 13;
                if (i27 >= iQ8) {
                    break;
                }
                int iQ9 = c0Var.Q() & 31;
                int iY = (iQ9 == 13 || iQ9 == 12) ? 1 : c0Var.Y();
                for (int i29 = 0; i29 < iY; i29++) {
                    int iY2 = c0Var.Y();
                    i28 += iY2 + 4;
                    c0Var.g0(iY2);
                }
                i27++;
            }
            c0Var.f0(iG);
            byte[] bArr = new byte[i28];
            int i35 = 0;
            int i36 = 0;
            while (i35 < iQ8) {
                int iQ10 = c0Var.Q() & 31;
                int iY3 = (iQ10 == i17 || iQ10 == i16) ? i19 : c0Var.Y();
                for (int i37 = 0; i37 < iY3; i37++) {
                    int iY4 = c0Var.Y();
                    System.arraycopy(x7.g.f217160a, 0, bArr, i36, 4);
                    int i38 = i36 + 4;
                    c0Var.u(bArr, i38, iY4);
                    i36 = i38 + iY4;
                }
                i35++;
                i19 = 1;
                i16 = 12;
                i17 = 13;
            }
            return new w0(ak.n0.E(bArr), i25, String.format(Locale.US, "vvc1.%d.%s%d", Integer.valueOf(i15), str, Integer.valueOf(iQ2)), iQ + 8);
        } catch (ArrayIndexOutOfBoundsException e15) {
            throw t7.x.a("Error parsing VVC configuration", e15);
        }
    }
}
