package kn;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char[] f111477a = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f111478a;

        static {
            int[] iArr = new int[m.values().length];
            f111478a = iArr;
            try {
                iArr[m.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111478a[m.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f111479g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int[] f111480h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int[] f111481i = {5, 10, 16, 33, 32, 49};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f111482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f111483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f111484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f111485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f111486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f111487f;

        /* synthetic */ b(c cVar, d dVar, int i15, int i16, b bVar, a aVar) {
            this(cVar, dVar, i15, i16, bVar);
        }

        static byte[] h(int i15) {
            return new byte[]{(byte) i15};
        }

        static byte[] i(int i15, int i16) {
            return new byte[]{(byte) i15, (byte) i16};
        }

        private static int j(boolean z15, int i15, char c15, int i16) {
            if (c15 == i16) {
                return 27;
            }
            if (z15) {
                if (c15 <= 31) {
                    return c15;
                }
                if (c15 == ' ') {
                    return 3;
                }
                if (c15 <= '/') {
                    return c15 - '!';
                }
                if (c15 <= '9') {
                    return c15 - ',';
                }
                if (c15 <= '@') {
                    return c15 - '+';
                }
                if (c15 <= 'Z') {
                    return c15 - '3';
                }
                if (c15 <= '_') {
                    return c15 - 'E';
                }
                return c15 <= 127 ? c15 - '`' : c15;
            }
            if (c15 == 0) {
                return 0;
            }
            if (i15 == 0 && c15 <= 3) {
                return c15 - 1;
            }
            if (i15 == 1 && c15 <= 31) {
                return c15;
            }
            if (c15 == ' ') {
                return 3;
            }
            if (c15 >= '!' && c15 <= '/') {
                return c15 - '!';
            }
            if (c15 >= '0' && c15 <= '9') {
                return c15 - ',';
            }
            if (c15 >= ':' && c15 <= '@') {
                return c15 - '+';
            }
            if (c15 >= 'A' && c15 <= 'Z') {
                return c15 - '@';
            }
            if (c15 >= '[' && c15 <= '_') {
                return c15 - 'E';
            }
            if (c15 == '`') {
                return 0;
            }
            if (c15 < 'a' || c15 > 'z') {
                return (c15 < '{' || c15 > 127) ? c15 : c15 - '`';
            }
            return c15 - 'S';
        }

        static int v(char c15, boolean z15, int i15) {
            if (z15 && k.l(c15)) {
                return 0;
            }
            if (!z15 && k.n(c15)) {
                return 0;
            }
            if (z15 && k.m(c15, i15)) {
                return 1;
            }
            return (z15 || !k.o(c15, i15)) ? 2 : 1;
        }

        private static int w(char c15) {
            if (c15 == '\r') {
                return 0;
            }
            if (c15 == '*') {
                return 1;
            }
            if (c15 == '>') {
                return 2;
            }
            if (c15 == ' ') {
                return 3;
            }
            if (c15 < '0' || c15 > '9') {
                return (c15 < 'A' || c15 > 'Z') ? c15 : c15 - '3';
            }
            return c15 - ',';
        }

        static void y(byte[] bArr, int i15, int i16, int i17, int i18) {
            int i19 = ((i16 & GF2Field.MASK) * 1600) + ((i17 & GF2Field.MASK) * 40) + (i18 & GF2Field.MASK) + 1;
            bArr[i15] = (byte) (i19 / 256);
            bArr[i15 + 1] = (byte) (i19 % 256);
        }

        int g() {
            int i15 = 0;
            for (b bVar = this; bVar != null && bVar.f111483b == d.B256 && i15 <= 250; bVar = bVar.f111486e) {
                i15++;
            }
            return i15;
        }

        byte[] k(boolean z15, int i15) {
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < this.f111485d; i16++) {
                char cCharAt = this.f111482a.charAt(this.f111484c + i16);
                if ((z15 && j.h(cCharAt)) || (!z15 && j.j(cCharAt))) {
                    arrayList.add(Byte.valueOf((byte) j(z15, 0, cCharAt, i15)));
                } else if (k.k(cCharAt, i15)) {
                    char c15 = (char) ((cCharAt & 255) - 128);
                    if (!(z15 && j.h(c15)) && (z15 || !j.j(c15))) {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        int iV = v(c15, z15, i15);
                        arrayList.add(Byte.valueOf((byte) iV));
                        arrayList.add(Byte.valueOf((byte) j(z15, iV, c15, i15)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        arrayList.add(Byte.valueOf((byte) j(z15, 0, c15, i15)));
                    }
                } else {
                    int iV2 = v(cCharAt, z15, i15);
                    arrayList.add(Byte.valueOf((byte) iV2));
                    arrayList.add(Byte.valueOf((byte) j(z15, iV2, cCharAt, i15)));
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList.size(); i18 += 3) {
                y(bArr, i17, ((Byte) arrayList.get(i18)).byteValue() & 255, ((Byte) arrayList.get(i18 + 1)).byteValue() & 255, ((Byte) arrayList.get(i18 + 2)).byteValue() & 255);
                i17 += 2;
            }
            return bArr;
        }

        int l(int i15) {
            return r(i15) - i15;
        }

        byte[] m() {
            int iOrdinal = this.f111483b.ordinal();
            if (iOrdinal == 0) {
                if (this.f111482a.a(this.f111484c)) {
                    return i(241, this.f111482a.b(this.f111484c) + 1);
                }
                if (k.k(this.f111482a.charAt(this.f111484c), this.f111482a.f())) {
                    return i(235, this.f111482a.charAt(this.f111484c) - 127);
                }
                if (this.f111485d == 2) {
                    return h(((this.f111482a.charAt(this.f111484c) - '0') * 10) + this.f111482a.charAt(this.f111484c + 1) + 82);
                }
                return this.f111482a.h(this.f111484c) ? h(232) : h(this.f111482a.charAt(this.f111484c) + 1);
            }
            if (iOrdinal == 1) {
                return k(true, this.f111482a.f());
            }
            if (iOrdinal == 2) {
                return k(false, this.f111482a.f());
            }
            if (iOrdinal == 3) {
                return x();
            }
            if (iOrdinal != 4) {
                return iOrdinal != 5 ? new byte[0] : h(this.f111482a.charAt(this.f111484c));
            }
            return n();
        }

        byte[] n() {
            int iCeil = (int) Math.ceil(((double) this.f111485d) / 4.0d);
            byte[] bArr = new byte[iCeil * 3];
            int i15 = this.f111484c;
            int iMin = Math.min((this.f111485d + i15) - 1, this.f111482a.length() - 1);
            for (int i16 = 0; i16 < iCeil; i16 += 3) {
                int[] iArr = new int[4];
                for (int i17 = 0; i17 < 4; i17++) {
                    if (i15 <= iMin) {
                        iArr[i17] = this.f111482a.charAt(i15) & '?';
                        i15++;
                    } else {
                        iArr[i17] = i15 == iMin + 1 ? 31 : 0;
                    }
                }
                int i18 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i16] = (byte) ((i18 >> 16) & GF2Field.MASK);
                bArr[i16 + 1] = (byte) ((i18 >> 8) & GF2Field.MASK);
                bArr[i16 + 2] = (byte) (i18 & GF2Field.MASK);
            }
            return bArr;
        }

        d o() {
            if (this.f111483b == d.EDF) {
                if (this.f111485d < 4) {
                    return d.ASCII;
                }
                int iP = p();
                if (iP > 0 && l(this.f111487f + iP) <= 2 - iP) {
                    return d.ASCII;
                }
            }
            d dVar = this.f111483b;
            if (dVar == d.C40 || dVar == d.TEXT || dVar == d.X12) {
                if (this.f111484c + this.f111485d >= this.f111482a.length() && l(this.f111487f) == 0) {
                    return d.ASCII;
                }
                if (p() == 1 && l(this.f111487f + 1) == 0) {
                    return d.ASCII;
                }
            }
            return this.f111483b;
        }

        int p() {
            int length = this.f111482a.length();
            int i15 = this.f111484c + this.f111485d;
            int i16 = length - i15;
            if (i16 <= 4 && i15 < length) {
                if (i16 == 1) {
                    return k.k(this.f111482a.charAt(i15), this.f111482a.f()) ? 0 : 1;
                }
                if (i16 == 2) {
                    if (!k.k(this.f111482a.charAt(i15), this.f111482a.f())) {
                        int i17 = i15 + 1;
                        if (!k.k(this.f111482a.charAt(i17), this.f111482a.f())) {
                            return (j.f(this.f111482a.charAt(i15)) && j.f(this.f111482a.charAt(i17))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i16 == 3) {
                    if (j.f(this.f111482a.charAt(i15)) && j.f(this.f111482a.charAt(i15 + 1)) && !k.k(this.f111482a.charAt(i15 + 2), this.f111482a.f())) {
                        return 2;
                    }
                    return (j.f(this.f111482a.charAt(i15 + 1)) && j.f(this.f111482a.charAt(i15 + 2)) && !k.k(this.f111482a.charAt(i15), this.f111482a.f())) ? 2 : 0;
                }
                if (j.f(this.f111482a.charAt(i15)) && j.f(this.f111482a.charAt(i15 + 1)) && j.f(this.f111482a.charAt(i15 + 2)) && j.f(this.f111482a.charAt(i15 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x005f  */
        /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x0069 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x006b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x006d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0073  */
        /* JADX WARN: Code duplicated, block: B:42:0x0078  */
        /* JADX WARN: Code duplicated, block: B:44:0x007d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0082  */
        /* JADX WARN: Code duplicated, block: B:48:0x0087  */
        byte[] q() {
            int iOrdinal;
            int iOrdinal2 = t().ordinal();
            if (iOrdinal2 == 0) {
                iOrdinal = this.f111483b.ordinal();
                if (iOrdinal != 1) {
                    return h(230);
                }
                if (iOrdinal != 2) {
                    return h(239);
                }
                if (iOrdinal != 3) {
                    return h(238);
                }
                if (iOrdinal != 4) {
                    return h(240);
                }
                if (iOrdinal == 5) {
                    return h(231);
                }
            } else if (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3) {
                if (this.f111483b != t()) {
                    int iOrdinal3 = this.f111483b.ordinal();
                    if (iOrdinal3 == 0) {
                        return h(254);
                    }
                    if (iOrdinal3 == 1) {
                        return i(254, 230);
                    }
                    if (iOrdinal3 == 2) {
                        return i(254, 239);
                    }
                    if (iOrdinal3 == 3) {
                        return i(254, 238);
                    }
                    if (iOrdinal3 == 4) {
                        return i(254, 240);
                    }
                    if (iOrdinal3 == 5) {
                        return i(254, 231);
                    }
                }
            } else if (iOrdinal2 != 4 && iOrdinal2 == 5) {
                iOrdinal = this.f111483b.ordinal();
                if (iOrdinal != 1) {
                    return h(230);
                }
                if (iOrdinal != 2) {
                    return h(239);
                }
                if (iOrdinal != 3) {
                    return h(238);
                }
                if (iOrdinal != 4) {
                    return h(240);
                }
                if (iOrdinal == 5) {
                    return h(231);
                }
            }
            return new byte[0];
        }

        int r(int i15) {
            int i16 = a.f111478a[this.f111482a.l().ordinal()];
            if (i16 == 1) {
                for (int i17 : f111480h) {
                    if (i17 >= i15) {
                        return i17;
                    }
                }
            } else if (i16 == 2) {
                for (int i18 : f111481i) {
                    if (i18 >= i15) {
                        return i18;
                    }
                }
            }
            for (int i19 : f111479g) {
                if (i19 >= i15) {
                    return i19;
                }
            }
            int[] iArr = f111479g;
            return iArr[iArr.length - 1];
        }

        d s() {
            return this.f111483b;
        }

        d t() {
            b bVar = this.f111486e;
            return bVar == null ? d.ASCII : bVar.o();
        }

        d u() {
            b bVar = this.f111486e;
            return bVar == null ? d.ASCII : bVar.f111483b;
        }

        byte[] x() {
            int i15 = (this.f111485d / 3) * 2;
            byte[] bArr = new byte[i15];
            for (int i16 = 0; i16 < i15; i16 += 2) {
                int i17 = (i16 / 2) * 3;
                y(bArr, i16, w(this.f111482a.charAt(this.f111484c + i17)), w(this.f111482a.charAt(this.f111484c + i17 + 1)), w(this.f111482a.charAt(this.f111484c + i17 + 2)));
            }
            return bArr;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0046 A[PHI: r11
          0x0046: PHI (r11v7 int) = (r11v4 int), (r11v4 int), (r11v4 int), (r11v10 int), (r11v10 int), (r11v18 int) binds: [B:77:0x00c1, B:79:0x00c5, B:81:0x00c9, B:58:0x0090, B:60:0x0094, B:26:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x0056 A[PHI: r11
          0x0056: PHI (r11v12 int) = (r11v10 int), (r11v10 int), (r11v10 int), (r11v18 int), (r11v18 int), (r11v18 int) binds: [B:64:0x009b, B:66:0x009f, B:67:0x00a1, B:29:0x004c, B:31:0x0050, B:33:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        private b(c cVar, d dVar, int i15, int i16, b bVar) {
            this.f111482a = cVar;
            this.f111483b = dVar;
            this.f111484c = i15;
            this.f111485d = i16;
            this.f111486e = bVar;
            int iJ = bVar != null ? bVar.f111487f : 0;
            d dVarT = t();
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                iJ = (cVar.a(i15) || k.k(cVar.charAt(i15), cVar.f())) ? iJ + 2 : iJ + 1;
                if (dVarT == d.C40 || dVarT == d.TEXT || dVarT == d.X12) {
                    iJ++;
                }
            } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                d dVar2 = d.X12;
                if (dVar == dVar2) {
                    iJ += 2;
                } else {
                    iJ += k.j(cVar, i15, dVar == d.C40, new int[1]) * 2;
                }
                if (dVarT == d.ASCII || dVarT == d.B256) {
                    iJ++;
                } else if (dVarT != dVar && (dVarT == d.C40 || dVarT == d.TEXT || dVarT == dVar2)) {
                    iJ += 2;
                }
            } else if (iOrdinal == 4) {
                iJ = (dVarT == d.ASCII || dVarT == d.B256) ? iJ + 4 : (dVarT == d.C40 || dVarT == d.TEXT || dVarT == d.X12) ? iJ + 5 : iJ + 3;
            } else if (iOrdinal == 5) {
                iJ = (dVarT == d.B256 && g() != 250) ? iJ + 1 : iJ + 2;
                if (dVarT == d.ASCII) {
                    iJ++;
                } else if (dVarT == d.C40 || dVarT == d.TEXT || dVarT == d.X12) {
                    iJ += 2;
                }
            }
            this.f111487f = iJ;
        }
    }

    private static final class c extends hn.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f111488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f111489d;

        /* synthetic */ c(String str, Charset charset, int i15, m mVar, int i16, a aVar) {
            this(str, charset, i15, mVar, i16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return this.f111489d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public m l() {
            return this.f111488c;
        }

        private c(String str, Charset charset, int i15, m mVar, int i16) {
            super(str, charset, i15);
            this.f111488c = mVar;
            this.f111489d = i16;
        }
    }

    enum d {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f111497a;

        e(b bVar) {
            int i15;
            c cVar = bVar.f111482a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i16 = 0;
            int iC = ((bVar.f111483b == d.C40 || bVar.f111483b == d.TEXT || bVar.f111483b == d.X12) && bVar.o() != d.ASCII) ? c(b.h(254), arrayList) : 0;
            for (b bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f111486e) {
                iC += c(bVar2.m(), arrayList);
                if (bVar2.f111486e == null || bVar2.u() != bVar2.s()) {
                    if (bVar2.s() == d.B256) {
                        if (iC <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) iC));
                            i15 = iC + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (iC % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((iC / 250) + 249)));
                            i15 = iC + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i15));
                    }
                    c(bVar2.q(), arrayList);
                    iC = 0;
                }
            }
            if (cVar.k() == 5) {
                c(b.h(236), arrayList);
            } else if (cVar.k() == 6) {
                c(b.h(237), arrayList);
            }
            if (cVar.f() > 0) {
                c(b.h(232), arrayList);
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                a(arrayList, arrayList.size() - ((Integer) arrayList2.get(i17)).intValue(), ((Integer) arrayList3.get(i17)).intValue());
            }
            int iR = bVar.r(arrayList.size());
            if (arrayList.size() < iR) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < iR) {
                arrayList.add(Byte.valueOf((byte) d(arrayList.size() + 1)));
            }
            this.f111497a = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.f111497a;
                if (i16 >= bArr.length) {
                    return;
                }
                bArr[i16] = ((Byte) arrayList.get(i16)).byteValue();
                i16++;
            }
        }

        static void a(List<Byte> list, int i15, int i16) {
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = i15 + i17;
                int iByteValue = (list.get(i18).byteValue() & 255) + (((i18 + 1) * 149) % GF2Field.MASK) + 1;
                if (iByteValue > 255) {
                    iByteValue -= 256;
                }
                list.set(i18, Byte.valueOf((byte) iByteValue));
            }
        }

        static int c(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int d(int i15) {
            int i16 = (i15 * 149) % 253;
            int i17 = i16 + 130;
            return i17 <= 254 ? i17 : i16 - 124;
        }

        public byte[] b() {
            return this.f111497a;
        }
    }

    static void e(b[][] bVarArr, b bVar) {
        int i15 = bVar.f111484c + bVar.f111485d;
        if (bVarArr[i15][bVar.o().ordinal()] == null || bVarArr[i15][bVar.o().ordinal()].f111487f > bVar.f111487f) {
            bVarArr[i15][bVar.o().ordinal()] = bVar;
        }
    }

    static void f(c cVar, b[][] bVarArr, int i15, b bVar) {
        if (cVar.a(i15)) {
            e(bVarArr, new b(cVar, d.ASCII, i15, 1, bVar, null));
            return;
        }
        char cCharAt = cVar.charAt(i15);
        int i16 = 0;
        if (bVar == null || bVar.o() != d.EDF) {
            if (j.f(cCharAt) && cVar.g(i15, 2) && j.f(cVar.charAt(i15 + 1))) {
                e(bVarArr, new b(cVar, d.ASCII, i15, 2, bVar, null));
            } else {
                e(bVarArr, new b(cVar, d.ASCII, i15, 1, bVar, null));
            }
            d[] dVarArr = {d.C40, d.TEXT};
            for (int i17 = 0; i17 < 2; i17++) {
                d dVar = dVarArr[i17];
                int[] iArr = new int[1];
                if (j(cVar, i15, dVar == d.C40, iArr) > 0) {
                    e(bVarArr, new b(cVar, dVar, i15, iArr[0], bVar, null));
                }
            }
            if (cVar.g(i15, 3) && j.k(cVar.charAt(i15)) && j.k(cVar.charAt(i15 + 1)) && j.k(cVar.charAt(i15 + 2))) {
                e(bVarArr, new b(cVar, d.X12, i15, 3, bVar, null));
            }
            e(bVarArr, new b(cVar, d.B256, i15, 1, bVar, null));
        }
        while (i16 < 3) {
            int i18 = i15 + i16;
            if (!cVar.g(i18, 1) || !j.i(cVar.charAt(i18))) {
                break;
            }
            int i19 = i16 + 1;
            e(bVarArr, new b(cVar, d.EDF, i15, i19, bVar, null));
            i16 = i19;
        }
        if (i16 == 3 && cVar.g(i15, 4) && j.i(cVar.charAt(i15 + 3))) {
            e(bVarArr, new b(cVar, d.EDF, i15, 4, bVar, null));
        }
    }

    static byte[] g(String str, Charset charset, int i15, m mVar, int i16) {
        return i(new c(str, charset, i15, mVar, i16, null)).b();
    }

    public static String h(String str, Charset charset, int i15, m mVar) {
        int i16;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i16 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i16 = 6;
        } else {
            i16 = 0;
        }
        return new String(g(str, charset, i15, mVar, i16), StandardCharsets.ISO_8859_1);
    }

    static e i(c cVar) {
        int length = cVar.length();
        int i15 = 0;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, 6);
        f(cVar, bVarArr, 0, null);
        for (int i16 = 1; i16 <= length; i16++) {
            for (int i17 = 0; i17 < 6; i17++) {
                b bVar = bVarArr[i16][i17];
                if (bVar != null && i16 < length) {
                    f(cVar, bVarArr, i16, bVar);
                }
            }
            for (int i18 = 0; i18 < 6; i18++) {
                bVarArr[i16 - 1][i18] = null;
            }
        }
        int i19 = -1;
        int i25 = Integer.MAX_VALUE;
        while (i15 < 6) {
            b bVar2 = bVarArr[length][i15];
            if (bVar2 != null) {
                int i26 = (i15 < 1 || i15 > 3) ? bVar2.f111487f : bVar2.f111487f + 1;
                if (i26 < i25) {
                    i19 = i15;
                    i25 = i26;
                }
            }
            i15++;
        }
        if (i19 >= 0) {
            return new e(bVarArr[length][i19]);
        }
        throw new IllegalStateException("Failed to encode \"" + cVar + "\"");
    }

    static int j(c cVar, int i15, boolean z15, int[] iArr) {
        int i16 = 0;
        for (int i17 = i15; i17 < cVar.length(); i17++) {
            if (cVar.a(i17)) {
                iArr[0] = 0;
                return 0;
            }
            char cCharAt = cVar.charAt(i17);
            if ((z15 && j.h(cCharAt)) || (!z15 && j.j(cCharAt))) {
                i16++;
            } else if (k(cCharAt, cVar.f())) {
                int i18 = cCharAt & 255;
                i16 = (i18 < 128 || (!(z15 && j.h((char) (i18 + (-128)))) && (z15 || !j.j((char) (i18 + (-128)))))) ? i16 + 4 : i16 + 3;
            } else {
                i16 += 2;
            }
            if (i16 % 3 == 0 || ((i16 - 2) % 3 == 0 && i17 + 1 == cVar.length())) {
                iArr[0] = (i17 - i15) + 1;
                return (int) Math.ceil(((double) i16) / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    static boolean k(char c15, int i15) {
        return c15 != i15 && c15 >= 128 && c15 <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(char c15) {
        return c15 <= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(char c15, int i15) {
        for (char c16 : f111477a) {
            if (c16 == c15) {
                return true;
            }
        }
        return c15 == i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(char c15) {
        return l(c15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(char c15, int i15) {
        return m(c15, i15);
    }
}
