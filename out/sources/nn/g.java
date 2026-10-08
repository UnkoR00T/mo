package nn;

import en.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f137302c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f137300a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f137301b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f137303d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f137304e = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137305a;

        static {
            int[] iArr = new int[c.values().length];
            f137305a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137305a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137305a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class b implements hn.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f137306a;

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        @Override // hn.e
        public boolean a(int i15) {
            return false;
        }

        @Override // hn.e
        public int b(int i15) {
            return -1;
        }

        @Override // hn.e
        public char charAt(int i15) {
            return this.f137306a.charAt(i15);
        }

        @Override // hn.e
        public int length() {
            return this.f137306a.length();
        }

        @Override // hn.e
        public CharSequence subSequence(int i15, int i16) {
            return this.f137306a.subSequence(i15, i16);
        }

        public String toString() {
            return this.f137306a;
        }

        private b(String str) {
            this.f137306a = str;
        }
    }

    static {
        byte[] bArr = new byte[128];
        f137302c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr2 = f137300a;
            if (i16 >= bArr2.length) {
                break;
            }
            byte b15 = bArr2[i16];
            if (b15 > 0) {
                f137302c[b15] = (byte) i16;
            }
            i16++;
        }
        Arrays.fill(f137303d, (byte) -1);
        while (true) {
            byte[] bArr3 = f137301b;
            if (i15 >= bArr3.length) {
                return;
            }
            byte b16 = bArr3[i15];
            if (b16 > 0) {
                f137303d[b16] = (byte) i15;
            }
            i15++;
        }
    }

    protected static void a(String str, int i15, String str2) throws h {
        for (int i16 = 0; i16 < str.length(); i16++) {
            if (str.charAt(i16) > i15) {
                throw new h("Non-encodable character detected: " + str.charAt(i16) + " (Unicode: " + ((int) str.charAt(i16)) + ") at position #" + i16 + " - " + str2);
            }
        }
    }

    private static int b(hn.e eVar, int i15, Charset charset) throws h {
        CharsetEncoder charsetEncoderNewEncoder = charset == null ? null : charset.newEncoder();
        int length = eVar.length();
        int i16 = i15;
        while (i16 < length) {
            int i17 = 0;
            int i18 = i16;
            while (i17 < 13 && !eVar.a(i18) && m(eVar.charAt(i18)) && (i18 = i16 + (i17 = i17 + 1)) < length) {
            }
            if (i17 >= 13) {
                return i16 - i15;
            }
            if (charsetEncoderNewEncoder != null && !charsetEncoderNewEncoder.canEncode(eVar.charAt(i16))) {
                char cCharAt = eVar.charAt(i16);
                throw new h("Non-encodable character detected: " + cCharAt + " (Unicode: " + ((int) cCharAt) + ')');
            }
            i16++;
        }
        return i16 - i15;
    }

    private static int c(hn.e eVar, int i15) {
        int length = eVar.length();
        int i16 = 0;
        if (i15 < length) {
            while (i15 < length && !eVar.a(i15) && m(eVar.charAt(i15))) {
                i16++;
                i15++;
            }
        }
        return i16;
    }

    private static int d(hn.e eVar, int i15) {
        int length = eVar.length();
        int i16 = i15;
        while (i16 < length) {
            int i17 = 0;
            while (i17 < 13 && i16 < length && !eVar.a(i16) && m(eVar.charAt(i16))) {
                i17++;
                i16++;
            }
            if (i17 >= 13) {
                return (i16 - i15) - i17;
            }
            if (i17 <= 0) {
                if (eVar.a(i16) || !p(eVar.charAt(i16))) {
                    break;
                }
                i16++;
            }
        }
        return i16 - i15;
    }

    private static void e(byte[] bArr, int i15, int i16, int i17, StringBuilder sb5) {
        int i18;
        if (i16 == 1 && i17 == 0) {
            sb5.append((char) 913);
        } else if (i16 % 6 == 0) {
            sb5.append((char) 924);
        } else {
            sb5.append((char) 901);
        }
        if (i16 >= 6) {
            char[] cArr = new char[5];
            i18 = i15;
            while ((i15 + i16) - i18 >= 6) {
                long j15 = 0;
                for (int i19 = 0; i19 < 6; i19++) {
                    j15 = (j15 << 8) + ((long) (bArr[i18 + i19] & 255));
                }
                for (int i25 = 0; i25 < 5; i25++) {
                    cArr[i25] = (char) (j15 % 900);
                    j15 /= 900;
                }
                for (int i26 = 4; i26 >= 0; i26--) {
                    sb5.append(cArr[i26]);
                }
                i18 += 6;
            }
        } else {
            i18 = i15;
        }
        while (i18 < i15 + i16) {
            sb5.append((char) (bArr[i18] & 255));
            i18++;
        }
    }

    static String f(String str, c cVar, Charset charset, boolean z15) throws h {
        hn.e bVar;
        hn.c cVarE;
        if (str.isEmpty()) {
            throw new h("Empty message not allowed");
        }
        if (c.TEXT == cVar) {
            a(str, CertificateBody.profileType, "Consider specifying Compaction.AUTO instead of Compaction.TEXT");
        }
        if (charset == null && !z15) {
            a(str, GF2Field.MASK, "Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET");
        }
        StringBuilder sb5 = new StringBuilder(str.length());
        a aVar = null;
        if (z15) {
            bVar = new hn.f(str, charset, -1);
        } else {
            bVar = new b(str, aVar);
            if (charset == null) {
                charset = f137304e;
            } else if (!f137304e.equals(charset) && (cVarE = hn.c.e(charset)) != null) {
                j(cVarE.j(), sb5);
            }
        }
        int length = bVar.length();
        int i15 = a.f137305a[cVar.ordinal()];
        if (i15 == 1) {
            i(bVar, 0, length, sb5, 0);
        } else if (i15 != 2) {
            if (i15 != 3) {
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (i16 < length) {
                    while (i16 < length && bVar.a(i16)) {
                        j(bVar.b(i16), sb5);
                        i16++;
                    }
                    if (i16 >= length) {
                        break;
                    }
                    int iC = c(bVar, i16);
                    if (iC >= 13) {
                        sb5.append((char) 902);
                        h(bVar, i16, iC, sb5);
                        i16 += iC;
                        i17 = 0;
                        i18 = 2;
                    } else {
                        int iD = d(bVar, i16);
                        if (iD >= 5 || iC == length) {
                            if (i18 != 0) {
                                sb5.append((char) 900);
                                i17 = 0;
                                i18 = 0;
                            }
                            i17 = i(bVar, i16, iD, sb5, i17);
                            i16 += iD;
                        } else {
                            int iB = b(bVar, i16, z15 ? null : charset);
                            if (iB == 0) {
                                iB = 1;
                            }
                            byte[] bytes = z15 ? null : bVar.subSequence(i16, i16 + iB).toString().getBytes(charset);
                            if ((!(bytes == null && iB == 1) && (bytes == null || bytes.length != 1)) || i18 != 0) {
                                if (z15) {
                                    g(bVar, i16, i16 + iB, i18, sb5);
                                } else {
                                    e(bytes, 0, bytes.length, i18, sb5);
                                }
                                i18 = 1;
                                i17 = 0;
                            } else if (z15) {
                                g(bVar, i16, 1, 0, sb5);
                            } else {
                                e(bytes, 0, 1, 0, sb5);
                            }
                            i16 += iB;
                        }
                    }
                }
            } else {
                sb5.append((char) 902);
                h(bVar, 0, length, sb5);
            }
        } else if (z15) {
            g(bVar, 0, bVar.length(), 0, sb5);
        } else {
            byte[] bytes2 = bVar.toString().getBytes(charset);
            e(bytes2, 0, bytes2.length, 1, sb5);
        }
        return sb5.toString();
    }

    private static void g(hn.e eVar, int i15, int i16, int i17, StringBuilder sb5) throws h {
        int iMin = Math.min(i16 + i15, eVar.length());
        int i18 = i15;
        while (true) {
            if (i18 >= iMin || !eVar.a(i18)) {
                int i19 = i18;
                while (i19 < iMin && !eVar.a(i19)) {
                    i19++;
                }
                int i25 = i19 - i18;
                if (i25 <= 0) {
                    return;
                }
                e(q(eVar, i18, i19), 0, i25, i18 == i15 ? i17 : 1, sb5);
                i18 = i19;
            } else {
                j(eVar.b(i18), sb5);
                i18++;
            }
        }
    }

    private static void h(hn.e eVar, int i15, int i16, StringBuilder sb5) {
        StringBuilder sb6 = new StringBuilder((i16 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i17 = 0;
        while (i17 < i16) {
            sb6.setLength(0);
            int iMin = Math.min(44, i16 - i17);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("1");
            int i18 = i15 + i17;
            sb7.append((Object) eVar.subSequence(i18, i18 + iMin));
            BigInteger bigInteger = new BigInteger(sb7.toString());
            do {
                sb6.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb6.length() - 1; length >= 0; length--) {
                sb5.append(sb6.charAt(length));
            }
            i17 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x010b A[EDGE_INSN: B:80:0x010b->B:60:0x010b BREAK  A[LOOP:0: B:3:0x000f->B:98:0x000f], SYNTHETIC] */
    private static int i(hn.e eVar, int i15, int i16, StringBuilder sb5, int i17) throws h {
        StringBuilder sb6 = new StringBuilder(i16);
        int i18 = i17;
        int i19 = 0;
        while (true) {
            int i25 = i15 + i19;
            if (!eVar.a(i25)) {
                char cCharAt = eVar.charAt(i25);
                if (i18 == 0) {
                    if (l(cCharAt)) {
                        if (cCharAt == ' ') {
                            sb6.append((char) 26);
                        } else {
                            sb6.append((char) (cCharAt - 'A'));
                        }
                    } else if (k(cCharAt)) {
                        sb6.append((char) 27);
                        i18 = 1;
                    } else if (n(cCharAt)) {
                        sb6.append((char) 28);
                        i18 = 2;
                    } else {
                        sb6.append((char) 29);
                        sb6.append((char) f137303d[cCharAt]);
                    }
                    i19++;
                    if (i19 >= i16) {
                        break;
                        break;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (o(cCharAt)) {
                                sb6.append((char) f137303d[cCharAt]);
                            } else {
                                sb6.append((char) 29);
                                i18 = 0;
                            }
                        } else if (n(cCharAt)) {
                            sb6.append((char) f137302c[cCharAt]);
                        } else if (l(cCharAt)) {
                            sb6.append((char) 28);
                            i18 = 0;
                        } else if (k(cCharAt)) {
                            sb6.append((char) 27);
                            i18 = 1;
                        } else {
                            int i26 = i25 + 1;
                            if (i26 >= i16 || eVar.a(i26) || !o(eVar.charAt(i26))) {
                                sb6.append((char) 29);
                                sb6.append((char) f137303d[cCharAt]);
                            } else {
                                sb6.append((char) 25);
                                i18 = 3;
                            }
                        }
                    } else if (k(cCharAt)) {
                        if (cCharAt == ' ') {
                            sb6.append((char) 26);
                        } else {
                            sb6.append((char) (cCharAt - 'a'));
                        }
                    } else if (l(cCharAt)) {
                        sb6.append((char) 27);
                        sb6.append((char) (cCharAt - 'A'));
                    } else if (n(cCharAt)) {
                        sb6.append((char) 28);
                        i18 = 2;
                    } else {
                        sb6.append((char) 29);
                        sb6.append((char) f137303d[cCharAt]);
                    }
                    i19++;
                    if (i19 >= i16) {
                        break;
                    }
                }
            } else {
                j(eVar.b(i25), sb5);
                i19++;
            }
        }
        int length = sb6.length();
        char cCharAt2 = 0;
        for (int i27 = 0; i27 < length; i27++) {
            if (i27 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb6.charAt(i27));
                sb5.append(cCharAt2);
            } else {
                cCharAt2 = sb6.charAt(i27);
            }
        }
        if (length % 2 != 0) {
            sb5.append((char) ((cCharAt2 * 30) + 29));
        }
        return i18;
    }

    private static void j(int i15, StringBuilder sb5) throws h {
        if (i15 >= 0 && i15 < 900) {
            sb5.append((char) 927);
            sb5.append((char) i15);
            return;
        }
        if (i15 < 810900) {
            sb5.append((char) 926);
            sb5.append((char) ((i15 / 900) - 1));
            sb5.append((char) (i15 % 900));
        } else if (i15 < 811800) {
            sb5.append((char) 925);
            sb5.append((char) (810900 - i15));
        } else {
            throw new h("ECI number not in valid range from 0..811799, but was " + i15);
        }
    }

    private static boolean k(char c15) {
        if (c15 != ' ') {
            return c15 >= 'a' && c15 <= 'z';
        }
        return true;
    }

    private static boolean l(char c15) {
        if (c15 != ' ') {
            return c15 >= 'A' && c15 <= 'Z';
        }
        return true;
    }

    private static boolean m(char c15) {
        return c15 >= '0' && c15 <= '9';
    }

    private static boolean n(char c15) {
        return f137302c[c15] != -1;
    }

    private static boolean o(char c15) {
        return f137303d[c15] != -1;
    }

    private static boolean p(char c15) {
        if (c15 == '\t' || c15 == '\n' || c15 == '\r') {
            return true;
        }
        return c15 >= ' ' && c15 <= '~';
    }

    static byte[] q(hn.e eVar, int i15, int i16) {
        byte[] bArr = new byte[i16 - i15];
        for (int i17 = i15; i17 < i16; i17++) {
            bArr[i17 - i15] = (byte) (eVar.charAt(i17) & 255);
        }
        return bArr;
    }
}
