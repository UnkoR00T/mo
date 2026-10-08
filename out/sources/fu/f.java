package fu;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010\u001aC\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001aG\u0010'\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,\u001a#\u0010-\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.\"\u001a\u00102\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/\"\u0014\u00104\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/\"\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106¨\u00068"}, d2 = {"", "Lfu/g;", "format", "", "i", "([BLfu/g;)Ljava/lang/String;", "", "startIndex", "endIndex", "h", "([BIILfu/g;)Ljava/lang/String;", "Lfu/g$a;", "bytesFormat", "", "byteToDigits", "k", "([BIILfu/g$a;[I)Ljava/lang/String;", "m", "l", "n", "index", "bytePrefix", "byteSuffix", "", "destination", "destinationOffset", "b", "([BILjava/lang/String;Ljava/lang/String;[I[CI)I", "c", "([BI[I[CI)I", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "d", "(IIII)I", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "e", "(IIIIIII)I", "", "formatLength", "a", "(J)I", "g", "(Ljava/lang/String;[CI)I", "[I", "f", "()[I", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f67041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f67042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f67043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f67044d;

    static {
        int[] iArr = new int[256];
        int i15 = 0;
        for (int i16 = 0; i16 < 256; i16++) {
            iArr[i16] = "0123456789abcdef".charAt(i16 & 15) | ("0123456789abcdef".charAt(i16 >> 4) << '\b');
        }
        f67041a = iArr;
        int[] iArr2 = new int[256];
        for (int i17 = 0; i17 < 256; i17++) {
            iArr2[i17] = "0123456789ABCDEF".charAt(i17 & 15) | ("0123456789ABCDEF".charAt(i17 >> 4) << '\b');
        }
        f67042b = iArr2;
        int[] iArr3 = new int[256];
        for (int i18 = 0; i18 < 256; i18++) {
            iArr3[i18] = -1;
        }
        int i19 = 0;
        int i25 = 0;
        while (i19 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i19)] = i25;
            i19++;
            i25++;
        }
        int i26 = 0;
        int i27 = 0;
        while (i26 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i26)] = i27;
            i26++;
            i27++;
        }
        f67043c = iArr3;
        long[] jArr = new long[256];
        for (int i28 = 0; i28 < 256; i28++) {
            jArr[i28] = -1;
        }
        int i29 = 0;
        int i35 = 0;
        while (i29 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i29)] = i35;
            i29++;
            i35++;
        }
        int i36 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i15)] = i36;
            i15++;
            i36++;
        }
        f67044d = jArr;
    }

    private static final int a(long j15) {
        if (0 <= j15 && j15 <= 2147483647L) {
            return (int) j15;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) oq.d0.l(oq.d0.e(j15))));
    }

    private static final int b(byte[] bArr, int i15, String str, String str2, int[] iArr, char[] cArr, int i16) {
        return g(str2, cArr, c(bArr, i15, iArr, cArr, g(str, cArr, i16)));
    }

    private static final int c(byte[] bArr, int i15, int[] iArr, char[] cArr, int i16) {
        int i17 = iArr[bArr[i15] & 255];
        cArr[i16] = (char) (i17 >> 8);
        cArr[i16 + 1] = (char) (i17 & GF2Field.MASK);
        return i16 + 2;
    }

    private static final int d(int i15, int i16, int i17, int i18) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j15 = i16;
        return a((((long) i15) * (((((long) i17) + 2) + ((long) i18)) + j15)) - j15);
    }

    public static final int e(int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i27 = i15 - 1;
        int i28 = i27 / i16;
        int i29 = (i16 - 1) / i17;
        int i35 = i15 % i16;
        if (i35 != 0) {
            i16 = i35;
        }
        int i36 = (i29 * i28) + ((i16 - 1) / i17);
        return a(((long) i28) + (((long) i36) * ((long) i18)) + (((long) ((i27 - i28) - i36)) * ((long) i19)) + (((long) i15) * (((long) i25) + 2 + ((long) i26))));
    }

    public static final int[] f() {
        return f67041a;
    }

    private static final int g(String str, char[] cArr, int i15) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i15);
            } else {
                cArr[i15] = str.charAt(0);
            }
        }
        return i15 + str.length();
    }

    public static final String h(byte[] bArr, int i15, int i16, HexFormat hexFormat) {
        pq.d.INSTANCE.a(i15, i16, bArr.length);
        if (i15 == i16) {
            return "";
        }
        int[] iArr = hexFormat.getUpperCase() ? f67042b : f67041a;
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? k(bArr, i15, i16, bytes, iArr) : n(bArr, i15, i16, bytes, iArr);
    }

    public static final String i(byte[] bArr, HexFormat hexFormat) {
        return h(bArr, 0, bArr.length, hexFormat);
    }

    public static /* synthetic */ String j(byte[] bArr, HexFormat hexFormat, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return i(bArr, hexFormat);
    }

    private static final String k(byte[] bArr, int i15, int i16, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? m(bArr, i15, i16, bytesHexFormat, iArr) : l(bArr, i15, i16, bytesHexFormat, iArr);
    }

    private static final String l(byte[] bArr, int i15, int i16, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[d(i16 - i15, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int iB = b(bArr, i15, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i17 = i15 + 1; i17 < i16; i17++) {
            iB = b(bArr, i17, bytePrefix, byteSuffix, iArr, cArr, g(byteSeparator, cArr, iB));
        }
        return d0.y(cArr);
    }

    private static final String m(byte[] bArr, int i15, int i16, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i16 - i15;
        int iC = 0;
        if (length == 0) {
            char[] cArr = new char[a(((long) i17) * 2)];
            while (i15 < i16) {
                iC = c(bArr, i15, iArr, cArr, iC);
                i15++;
            }
            return d0.y(cArr);
        }
        char[] cArr2 = new char[a((((long) i17) * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int iC2 = c(bArr, i15, iArr, cArr2, 0);
        for (int i18 = i15 + 1; i18 < i16; i18++) {
            cArr2[iC2] = cCharAt;
            iC2 = c(bArr, i18, iArr, cArr2, iC2 + 1);
        }
        return d0.y(cArr2);
    }

    private static final String n(byte[] bArr, int i15, int i16, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i17;
        int i18;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int iE = e(i16 - i15, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[iE];
        int i19 = i15;
        int iG = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < i16) {
            if (i25 == bytesPerLine) {
                cArr[iG] = '\n';
                iG++;
                i17 = 0;
                i18 = 0;
            } else if (i26 == bytesPerGroup) {
                iG = g(groupSeparator, cArr, iG);
                i17 = i25;
                i18 = 0;
            } else {
                i17 = i25;
                i18 = i26;
            }
            if (i18 != 0) {
                iG = g(byteSeparator, cArr, iG);
            }
            String str = bytePrefix;
            int iB = b(bArr, i19, str, byteSuffix, iArr, cArr, iG);
            i19++;
            i26 = i18 + 1;
            iG = iB;
            bytePrefix = str;
            i25 = i17 + 1;
        }
        if (iG == iE) {
            return d0.y(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
