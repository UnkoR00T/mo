package so;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f182602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f182603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f182604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f182605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, List<Integer>> f182606e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<Integer, Integer> f182607f = new HashMap();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f182608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f182609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short f182610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f182611d;

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return this.f182609b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            return this.f182608a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short g() {
            return this.f182610c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            return this.f182611d;
        }

        private b(int i15, int i16, short s15, int i17) {
            this.f182608a = i15;
            this.f182609b = i16;
            this.f182610c = s15;
            this.f182611d = i17;
        }
    }

    private void c(int i15) {
        this.f182605d = i(i15 + 1);
        for (Map.Entry<Integer, Integer> entry : this.f182607f.entrySet()) {
            if (this.f182605d[entry.getValue().intValue()] == -1) {
                this.f182605d[entry.getValue().intValue()] = entry.getKey().intValue();
            } else {
                List<Integer> arrayList = this.f182606e.get(entry.getValue());
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f182606e.put(entry.getValue(), arrayList);
                    arrayList.add(Integer.valueOf(this.f182605d[entry.getValue().intValue()]));
                    this.f182605d[entry.getValue().intValue()] = Integer.MIN_VALUE;
                }
                arrayList.add(entry.getKey());
            }
        }
    }

    private int d(int i15) {
        int[] iArr;
        if (i15 < 0 || (iArr = this.f182605d) == null || i15 >= iArr.length) {
            return -1;
        }
        return iArr[i15];
    }

    private int[] i(int i15) {
        int[] iArr = new int[i15];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // so.c
    public List<Integer> a(int i15) {
        int iD = d(i15);
        if (iD == -1) {
            return null;
        }
        if (iD != Integer.MIN_VALUE) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(iD));
            return arrayList;
        }
        List<Integer> list = this.f182606e.get(Integer.valueOf(i15));
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2);
        return arrayList2;
    }

    @Override // so.c
    public int b(int i15) {
        Integer num = this.f182607f.get(Integer.valueOf(i15));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int e() {
        return this.f182603b;
    }

    public int f() {
        return this.f182602a;
    }

    void g(i0 i0Var) {
        this.f182602a = i0Var.N();
        this.f182603b = i0Var.N();
        this.f182604c = i0Var.M();
    }

    void h(e eVar, int i15, i0 i0Var) {
        i0Var.seek(eVar.c() + this.f182604c);
        int iN = i0Var.N();
        if (iN < 8) {
            i0Var.N();
            i0Var.N();
        } else {
            i0Var.N();
            i0Var.M();
            i0Var.M();
        }
        if (iN == 0) {
            j(i0Var);
            return;
        }
        if (iN == 2) {
            o(i0Var, i15);
            return;
        }
        if (iN == 4) {
            p(i0Var, i15);
            return;
        }
        if (iN == 6) {
            q(i0Var, i15);
            return;
        }
        if (iN == 8) {
            r(i0Var, i15);
            return;
        }
        if (iN == 10) {
            k(i0Var, i15);
            return;
        }
        switch (iN) {
            case 12:
                l(i0Var, i15);
                return;
            case 13:
                m(i0Var, i15);
                return;
            case 14:
                n(i0Var, i15);
                return;
            default:
                throw new IOException("Unknown cmap format:" + iN);
        }
    }

    void j(i0 i0Var) throws IOException {
        byte[] bArrP = i0Var.p(256);
        this.f182605d = i(256);
        this.f182607f = new HashMap(bArrP.length);
        for (int i15 = 0; i15 < bArrP.length; i15++) {
            int i16 = bArrP[i15] & 255;
            this.f182605d[i16] = i15;
            this.f182607f.put(Integer.valueOf(i15), Integer.valueOf(i16));
        }
    }

    void k(i0 i0Var, int i15) throws IOException {
        long jM = i0Var.M();
        long jM2 = i0Var.M();
        if (jM2 > 2147483647L) {
            throw new IOException("Invalid number of Characters");
        }
        if (jM >= 0 && jM <= 1114111) {
            long j15 = jM + jM2;
            if (j15 <= 1114111 && (j15 < 55296 || j15 > 57343)) {
                return;
            }
        }
        throw new IOException("Invalid character codes, " + String.format("startCode: 0x%X, numChars: %d", Long.valueOf(jM), Long.valueOf(jM2)));
    }

    void l(i0 i0Var, int i15) throws IOException {
        long j15;
        int i16 = i15;
        long jM = i0Var.M();
        this.f182605d = i(i16);
        this.f182607f = new HashMap(i16);
        if (i16 == 0) {
            c2.g("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        long j16 = 0;
        int iMax = 0;
        long j17 = 0;
        while (j17 < jM) {
            long jM2 = i0Var.M();
            long jM3 = i0Var.M();
            long jM4 = i0Var.M();
            long j18 = j16;
            if (jM2 < j16 || jM2 > 1114111 || (jM2 >= 55296 && jM2 <= 57343)) {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(jM2)));
            }
            if ((jM3 > j18 && jM3 < jM2) || jM3 > 1114111 || (jM3 >= 55296 && jM3 <= 57343)) {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(jM3)));
            }
            long j19 = j18;
            while (true) {
                j15 = jM;
                if (j19 > jM3 - jM2) {
                    break;
                }
                long j25 = jM4 + j19;
                long j26 = j19;
                if (j25 >= i16) {
                    c2.g("PdfBox-Android", "Format 12 cmap contains an invalid glyph index");
                    break;
                }
                long j27 = jM2 + j26;
                if (j27 > 1114111) {
                    c2.g("PdfBox-Android", "Format 12 cmap contains character beyond UCS-4");
                }
                int i17 = (int) j25;
                iMax = Math.max(iMax, i17);
                this.f182607f.put(Integer.valueOf((int) j27), Integer.valueOf(i17));
                j19 = j26 + 1;
                i16 = i15;
                jM = j15;
            }
            j17++;
            i16 = i15;
            j16 = j18;
            jM = j15;
        }
        c(iMax);
    }

    void m(i0 i0Var, int i15) throws IOException {
        int i16 = i15;
        long jM = i0Var.M();
        this.f182605d = i(i16);
        this.f182607f = new HashMap(i16);
        if (i16 == 0) {
            c2.g("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        long j15 = 0;
        while (j15 < jM) {
            long jM2 = i0Var.M();
            long jM3 = i0Var.M();
            long jM4 = i0Var.M();
            if (jM4 > i16) {
                c2.g("PdfBox-Android", "Format 13 cmap contains an invalid glyph index");
                return;
            }
            if (jM2 < 0 || jM2 > 1114111 || (jM2 >= 55296 && jM2 <= 57343)) {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(jM2)));
            }
            if ((jM3 > 0 && jM3 < jM2) || jM3 > 1114111 || (jM3 >= 55296 && jM3 <= 57343)) {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(jM3)));
            }
            long j16 = 0;
            while (j16 <= jM3 - jM2) {
                long j17 = jM;
                long j18 = jM2 + j16;
                if (j18 > 2147483647L) {
                    throw new IOException("Character Code greater than Integer.MAX_VALUE");
                }
                if (j18 > 1114111) {
                    c2.g("PdfBox-Android", "Format 13 cmap contains character beyond UCS-4");
                }
                int i17 = (int) jM4;
                int i18 = (int) j18;
                this.f182605d[i17] = i18;
                this.f182607f.put(Integer.valueOf(i18), Integer.valueOf(i17));
                j16++;
                jM = j17;
            }
            j15++;
            i16 = i15;
        }
    }

    void n(i0 i0Var, int i15) {
        c2.g("PdfBox-Android", "Format 14 cmap table is not supported and will be ignored");
    }

    void o(i0 i0Var, int i15) {
        int[] iArr = new int[256];
        int iMax = 0;
        for (int i16 = 0; i16 < 256; i16++) {
            int iN = i0Var.N();
            iArr[i16] = iN;
            iMax = Math.max(iMax, iN / 8);
        }
        int i17 = iMax + 1;
        b[] bVarArr = new b[i17];
        for (int i18 = 0; i18 <= iMax; i18++) {
            bVarArr[i18] = new b(i0Var.N(), i0Var.N(), i0Var.E(), (i0Var.N() - (((i17 - i18) - 1) * 8)) - 2);
        }
        long jB = i0Var.b();
        this.f182605d = i(i15);
        this.f182607f = new HashMap(i15);
        if (i15 == 0) {
            c2.g("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        for (int i19 = 0; i19 <= iMax; i19++) {
            b bVar = bVarArr[i19];
            int iF = bVar.f();
            int iH = bVar.h();
            short sG = bVar.g();
            int iE = bVar.e();
            i0Var.seek(((long) iH) + jB);
            int i25 = 0;
            while (i25 < iE) {
                int i26 = (i19 << 8) + iF + i25;
                int iN2 = i0Var.N();
                if (iN2 > 0 && (iN2 = (iN2 + sG) % PKIFailureInfo.notAuthorized) < 0) {
                    iN2 += PKIFailureInfo.notAuthorized;
                }
                if (iN2 >= i15) {
                    c2.g("PdfBox-Android", "glyphId " + iN2 + " for charcode " + i26 + " ignored, numGlyphs is " + i15);
                } else {
                    this.f182605d[iN2] = i26;
                    this.f182607f.put(Integer.valueOf(i26), Integer.valueOf(iN2));
                }
                i25++;
                bVarArr = bVarArr;
            }
        }
    }

    void p(i0 i0Var, int i15) {
        int i16;
        int i17;
        int[] iArr;
        int iN = i0Var.N() / 2;
        i0Var.N();
        i0Var.N();
        i0Var.N();
        int[] iArrO = i0Var.O(iN);
        i0Var.N();
        int[] iArrO2 = i0Var.O(iN);
        int[] iArrO3 = i0Var.O(iN);
        long jB = i0Var.b();
        int[] iArrO4 = i0Var.O(iN);
        this.f182607f = new HashMap(i15);
        int i18 = 0;
        int iMax = 0;
        while (i18 < iN) {
            int i19 = iArrO2[i18];
            int i25 = iArrO[i18];
            int i26 = iArrO3[i18];
            int i27 = iArrO4[i18];
            int i28 = iN;
            int[] iArr2 = iArrO;
            long j15 = (((long) i18) * 2) + jB + ((long) i27);
            int i29 = 65535;
            if (i19 != 65535 && i25 != 65535) {
                int i35 = i19;
                while (i35 <= i25) {
                    if (i27 == 0) {
                        i16 = i29;
                        int i36 = (i35 + i26) & i16;
                        iMax = Math.max(i36, iMax);
                        i17 = i35;
                        iArr = iArrO2;
                        this.f182607f.put(Integer.valueOf(i17), Integer.valueOf(i36));
                    } else {
                        i16 = i29;
                        i17 = i35;
                        iArr = iArrO2;
                        i0Var.seek(j15 + (((long) (i17 - i19)) * 2));
                        int iN2 = i0Var.N();
                        if (iN2 != 0) {
                            int i37 = (iN2 + i26) & i16;
                            int iMax2 = Math.max(i37, iMax);
                            this.f182607f.put(Integer.valueOf(i17), Integer.valueOf(i37));
                            iMax = iMax2;
                        }
                    }
                    i35 = i17 + 1;
                    i29 = i16;
                    iArrO2 = iArr;
                }
            }
            i18++;
            iN = i28;
            iArrO = iArr2;
            iArrO2 = iArrO2;
        }
        if (this.f182607f.isEmpty()) {
            c2.g("PdfBox-Android", "cmap format 4 subtable is empty");
        } else {
            c(iMax);
        }
    }

    void q(i0 i0Var, int i15) {
        int iN = i0Var.N();
        int iN2 = i0Var.N();
        if (iN2 == 0) {
            return;
        }
        this.f182607f = new HashMap(i15);
        int[] iArrO = i0Var.O(iN2);
        int iMax = 0;
        for (int i16 = 0; i16 < iN2; i16++) {
            iMax = Math.max(iMax, iArrO[i16]);
            this.f182607f.put(Integer.valueOf(iN + i16), Integer.valueOf(iArrO[i16]));
        }
        c(iMax);
    }

    void r(i0 i0Var, int i15) throws IOException {
        int i16;
        i0 i0Var2 = i0Var;
        int[] iArrL = i0Var2.L(PKIFailureInfo.certRevoked);
        long jM = i0Var2.M();
        if (jM > 65536) {
            throw new IOException("CMap ( Subtype8 ) is invalid");
        }
        this.f182605d = i(i15);
        this.f182607f = new HashMap(i15);
        if (i15 == 0) {
            c2.g("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        long j15 = 0;
        long j16 = 0;
        while (j16 < jM) {
            long jM2 = i0Var2.M();
            long jM3 = i0Var2.M();
            long jM4 = i0Var2.M();
            if (jM2 > jM3 || j15 > jM2) {
                throw new IOException("Range invalid");
            }
            long j17 = jM2;
            while (j17 <= jM3) {
                if (j17 > 2147483647L) {
                    throw new IOException("[Sub Format 8] Invalid character code " + j17);
                }
                long j18 = jM;
                int i17 = (int) j17;
                int i18 = i17 / 8;
                if (i18 >= iArrL.length) {
                    throw new IOException("[Sub Format 8] Invalid character code " + j17);
                }
                if ((iArrL[i18] & (1 << (i17 % 8))) == 0) {
                    i16 = i17;
                } else {
                    long j19 = ((((j17 >> 10) + 55232) << 10) + ((1023 & j17) + 56320)) - 56613888;
                    if (j19 > 2147483647L) {
                        throw new IOException("[Sub Format 8] Invalid character code " + j19);
                    }
                    i16 = (int) j19;
                }
                int[] iArr = iArrL;
                long j25 = jM4 + (j17 - jM2);
                int i19 = i16;
                if (j25 > i15 || j25 > 2147483647L) {
                    throw new IOException("CMap contains an invalid glyph index");
                }
                int i25 = (int) j25;
                this.f182605d[i25] = i19;
                this.f182607f.put(Integer.valueOf(i19), Integer.valueOf(i25));
                j17++;
                iArrL = iArr;
                jM = j18;
            }
            j16++;
            i0Var2 = i0Var;
            j15 = 0;
        }
    }

    public String toString() {
        return "{" + f() + " " + e() + "}";
    }
}
