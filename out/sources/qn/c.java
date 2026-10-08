package qn;

import en.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f167423a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f167424b = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f167425a;

        static {
            int[] iArr = new int[pn.b.values().length];
            f167425a = iArr;
            try {
                iArr[pn.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f167425a[pn.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f167425a[pn.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f167425a[pn.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, hn.a aVar, Charset charset) {
        for (byte b15 : str.getBytes(charset)) {
            aVar.e(b15, 8);
        }
    }

    static void b(CharSequence charSequence, hn.a aVar) throws h {
        int length = charSequence.length();
        int i15 = 0;
        while (i15 < length) {
            int iP = p(charSequence.charAt(i15));
            if (iP == -1) {
                throw new h();
            }
            int i16 = i15 + 1;
            if (i16 < length) {
                int iP2 = p(charSequence.charAt(i16));
                if (iP2 == -1) {
                    throw new h();
                }
                aVar.e((iP * 45) + iP2, 11);
                i15 += 2;
            } else {
                aVar.e(iP, 6);
                i15 = i16;
            }
        }
    }

    static void c(String str, pn.b bVar, hn.a aVar, Charset charset) {
        int i15 = a.f167425a[bVar.ordinal()];
        if (i15 == 1) {
            h(str, aVar);
            return;
        }
        if (i15 == 2) {
            b(str, aVar);
            return;
        }
        if (i15 == 3) {
            a(str, aVar, charset);
        } else {
            if (i15 == 4) {
                e(str, aVar);
                return;
            }
            throw new h("Invalid mode: " + bVar);
        }
    }

    private static void d(hn.c cVar, hn.a aVar) {
        aVar.e(pn.b.ECI.e(), 4);
        aVar.e(cVar.j(), 8);
    }

    static void e(String str, hn.a aVar) throws h {
        int i15;
        Charset charset = hn.g.f85820b;
        if (charset == null) {
            throw new h("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new h("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i16 = 0; i16 < length; i16 += 2) {
            int i17 = ((bytes[i16] & 255) << 8) | (bytes[i16 + 1] & 255);
            int i18 = 33088;
            if (i17 >= 33088 && i17 <= 40956) {
                i15 = i17 - i18;
            } else if (i17 < 57408 || i17 > 60351) {
                i15 = -1;
            } else {
                i18 = 49472;
                i15 = i17 - i18;
            }
            if (i15 == -1) {
                throw new h("Invalid byte sequence");
            }
            aVar.e(((i15 >> 8) * 192) + (i15 & GF2Field.MASK), 13);
        }
    }

    static void f(int i15, pn.c cVar, pn.b bVar, hn.a aVar) throws h {
        int iG = bVar.g(cVar);
        int i16 = 1 << iG;
        if (i15 < i16) {
            aVar.e(i15, iG);
            return;
        }
        throw new h(i15 + " is bigger than " + (i16 - 1));
    }

    static void g(pn.b bVar, hn.a aVar) {
        aVar.e(bVar.e(), 4);
    }

    static void h(CharSequence charSequence, hn.a aVar) {
        int length = charSequence.length();
        int i15 = 0;
        while (i15 < length) {
            int iCharAt = charSequence.charAt(i15) - '0';
            int i16 = i15 + 2;
            if (i16 < length) {
                aVar.e((iCharAt * 100) + ((charSequence.charAt(i15 + 1) - '0') * 10) + (charSequence.charAt(i16) - '0'), 10);
                i15 += 3;
            } else {
                i15++;
                if (i15 < length) {
                    aVar.e((iCharAt * 10) + (charSequence.charAt(i15) - '0'), 7);
                    i15 = i16;
                } else {
                    aVar.e(iCharAt, 4);
                }
            }
        }
    }

    private static int i(pn.b bVar, hn.a aVar, hn.a aVar2, pn.c cVar) {
        return aVar.l() + bVar.g(cVar) + aVar2.l();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(hn.a aVar, pn.a aVar2, pn.c cVar, b bVar) throws h {
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < 8; i17++) {
            e.a(aVar, aVar2, cVar, i17, bVar);
            int iJ = j(bVar);
            if (iJ < i15) {
                i16 = i17;
                i15 = iJ;
            }
        }
        return i16;
    }

    private static pn.b l(String str, Charset charset) {
        Charset charset2 = hn.g.f85820b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return pn.b.KANJI;
        }
        boolean z15 = false;
        boolean z16 = false;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z16 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return pn.b.BYTE;
                }
                z15 = true;
            }
        }
        if (z15) {
            return pn.b.ALPHANUMERIC;
        }
        return z16 ? pn.b.NUMERIC : pn.b.BYTE;
    }

    private static pn.c m(int i15, pn.a aVar) throws h {
        for (int i16 = 1; i16 <= 40; i16++) {
            pn.c cVarE = pn.c.e(i16);
            if (v(i15, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static g n(String str, pn.a aVar, Map<en.c, ?> map) throws h {
        boolean z15;
        boolean z16;
        pn.c cVarT;
        pn.b bVar;
        pn.c cVarE;
        hn.a aVar2;
        hn.c cVarE2;
        int iK;
        boolean z17 = false;
        if (map != null) {
            en.c cVar = en.c.GS1_FORMAT;
            if (map.containsKey(cVar) && Boolean.parseBoolean(map.get(cVar).toString())) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        if (map != null) {
            en.c cVar2 = en.c.QR_COMPACT;
            if (map.containsKey(cVar2) && Boolean.parseBoolean(map.get(cVar2).toString())) {
                z16 = true;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        Charset charsetForName = f167424b;
        if (map != null && map.containsKey(en.c.CHARACTER_SET)) {
            z17 = true;
        }
        if (z17) {
            try {
                charsetForName = Charset.forName(map.get(en.c.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z16) {
            bVar = pn.b.BYTE;
            if (charsetForName.equals(f167424b)) {
                charsetForName = null;
            }
            f.c cVarH = f.h(str, null, charsetForName, z15, aVar);
            aVar2 = new hn.a();
            cVarH.b(aVar2);
            cVarE = cVarH.e();
        } else {
            pn.b bVarL = l(str, charsetForName);
            hn.a aVar3 = new hn.a();
            pn.b bVar2 = pn.b.BYTE;
            if (bVarL == bVar2 && z17 && (cVarE2 = hn.c.e(charsetForName)) != null) {
                d(cVarE2, aVar3);
            }
            if (z15) {
                g(pn.b.FNC1_FIRST_POSITION, aVar3);
            }
            g(bVarL, aVar3);
            hn.a aVar4 = new hn.a();
            c(str, bVarL, aVar4, charsetForName);
            if (map != null) {
                en.c cVar3 = en.c.QR_VERSION;
                if (map.containsKey(cVar3)) {
                    cVarT = pn.c.e(Integer.parseInt(map.get(cVar3).toString()));
                    if (!v(i(bVarL, aVar3, aVar4, cVarT), cVarT, aVar)) {
                        throw new h("Data too big for requested version");
                    }
                } else {
                    cVarT = t(aVar, bVarL, aVar3, aVar4);
                }
            } else {
                cVarT = t(aVar, bVarL, aVar3, aVar4);
            }
            hn.a aVar5 = new hn.a();
            aVar5.c(aVar3);
            f(bVarL == bVar2 ? aVar4.m() : str.length(), cVarT, bVarL, aVar5);
            aVar5.c(aVar4);
            bVar = bVarL;
            cVarE = cVarT;
            aVar2 = aVar5;
        }
        pn.c.b bVarC = cVarE.c(aVar);
        int iD = cVarE.d() - bVarC.d();
        u(iD, aVar2);
        hn.a aVarR = r(aVar2, cVarE.d(), iD, bVarC.c());
        g gVar = new g();
        gVar.c(aVar);
        gVar.f(bVar);
        gVar.g(cVarE);
        int iB = cVarE.b();
        b bVar3 = new b(iB, iB);
        if (map != null) {
            en.c cVar4 = en.c.QR_MASK_PATTERN;
            if (map.containsKey(cVar4)) {
                iK = Integer.parseInt(map.get(cVar4).toString());
                if (!g.b(iK)) {
                    iK = -1;
                }
            } else {
                iK = -1;
            }
        } else {
            iK = -1;
        }
        if (iK == -1) {
            iK = k(aVarR, aVar, cVarE, bVar3);
        }
        gVar.d(iK);
        e.a(aVarR, aVar, cVarE, iK, bVar3);
        gVar.e(bVar3);
        return gVar;
    }

    static byte[] o(byte[] bArr, int i15) {
        int length = bArr.length;
        int[] iArr = new int[length + i15];
        for (int i16 = 0; i16 < length; i16++) {
            iArr[i16] = bArr[i16] & 255;
        }
        new in.c(in.a.f93488l).b(iArr, i15);
        byte[] bArr2 = new byte[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            bArr2[i17] = (byte) iArr[length + i17];
        }
        return bArr2;
    }

    static int p(int i15) {
        int[] iArr = f167423a;
        if (i15 < iArr.length) {
            return iArr[i15];
        }
        return -1;
    }

    static void q(int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2) throws h {
        if (i18 >= i17) {
            throw new h("Block ID too large");
        }
        int i19 = i15 % i17;
        int i25 = i17 - i19;
        int i26 = i15 / i17;
        int i27 = i26 + 1;
        int i28 = i16 / i17;
        int i29 = i28 + 1;
        int i35 = i26 - i28;
        int i36 = i27 - i29;
        if (i35 != i36) {
            throw new h("EC bytes mismatch");
        }
        if (i17 != i25 + i19) {
            throw new h("RS blocks mismatch");
        }
        if (i15 != ((i28 + i35) * i25) + ((i29 + i36) * i19)) {
            throw new h("Total bytes mismatch");
        }
        if (i18 < i25) {
            iArr[0] = i28;
            iArr2[0] = i35;
        } else {
            iArr[0] = i29;
            iArr2[0] = i36;
        }
    }

    static hn.a r(hn.a aVar, int i15, int i16, int i17) throws h {
        if (aVar.m() != i16) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i17);
        int i18 = 0;
        int i19 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i18 < i17) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i25 = i15;
            int i26 = i16;
            int i27 = i17;
            q(i25, i26, i27, i18, iArr, iArr2);
            int i28 = iArr[0];
            byte[] bArr = new byte[i28];
            aVar.o(i19 * 8, bArr, 0, i28);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new qn.a(bArr, bArrO));
            iMax = Math.max(iMax, i28);
            iMax2 = Math.max(iMax2, bArrO.length);
            i19 += iArr[0];
            i18++;
            i15 = i25;
            i16 = i26;
            i17 = i27;
        }
        int i29 = i15;
        if (i16 != i19) {
            throw new h("Data bytes does not match offset");
        }
        hn.a aVar2 = new hn.a();
        for (int i35 = 0; i35 < iMax; i35++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((qn.a) it.next()).a();
                if (i35 < bArrA.length) {
                    aVar2.e(bArrA[i35], 8);
                }
            }
        }
        for (int i36 = 0; i36 < iMax2; i36++) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                byte[] bArrB = ((qn.a) it4.next()).b();
                if (i36 < bArrB.length) {
                    aVar2.e(bArrB[i36], 8);
                }
            }
        }
        if (i29 == aVar2.m()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i29 + " and " + aVar2.m() + " differ.");
    }

    static boolean s(String str) {
        byte[] bytes = str.getBytes(hn.g.f85820b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i15 = 0; i15 < length; i15 += 2) {
            int i16 = bytes[i15] & 255;
            if ((i16 < 129 || i16 > 159) && (i16 < 224 || i16 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static pn.c t(pn.a aVar, pn.b bVar, hn.a aVar2, hn.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, pn.c.e(1)), aVar)), aVar);
    }

    static void u(int i15, hn.a aVar) throws h {
        int i16 = i15 * 8;
        if (aVar.l() > i16) {
            throw new h("data bits cannot fit in the QR Code" + aVar.l() + " > " + i16);
        }
        for (int i17 = 0; i17 < 4 && aVar.l() < i16; i17++) {
            aVar.b(false);
        }
        int iL = aVar.l() & 7;
        if (iL > 0) {
            while (iL < 8) {
                aVar.b(false);
                iL++;
            }
        }
        int iM = i15 - aVar.m();
        for (int i18 = 0; i18 < iM; i18++) {
            aVar.e((i18 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i16) {
            throw new h("Bits size does not equal capacity");
        }
    }

    static boolean v(int i15, pn.c cVar, pn.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i15 + 7) / 8;
    }
}
