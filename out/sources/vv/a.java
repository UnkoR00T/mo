package vv;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\f\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"", "", "a", "(Ljava/lang/String;)[B", "map", "b", "([B[B)Ljava/lang/String;", "[B", "getBASE64", "()[B", "BASE64", "getBASE64_URL_SAFE", "BASE64_URL_SAFE", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f208320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f208321b;

    static {
        h.a aVar = h.f208377d;
        f208320a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").o();
        f208321b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").o();
    }

    public static final byte[] a(String str) {
        int i15;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i16 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i16];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i25 = 0; i25 < length; i25++) {
            char cCharAt2 = str.charAt(i25);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i15 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i15 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i15 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i15 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i15 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i18 = (i18 << 6) | i15;
            i17++;
            if (i17 % 4 == 0) {
                bArr[i19] = (byte) (i18 >> 16);
                int i26 = i19 + 2;
                bArr[i19 + 1] = (byte) (i18 >> 8);
                i19 += 3;
                bArr[i26] = (byte) i18;
            }
        }
        int i27 = i17 % 4;
        if (i27 == 1) {
            return null;
        }
        if (i27 == 2) {
            bArr[i19] = (byte) ((i18 << 12) >> 16);
            i19++;
        } else if (i27 == 3) {
            int i28 = i18 << 6;
            int i29 = i19 + 1;
            bArr[i19] = (byte) (i28 >> 16);
            i19 += 2;
            bArr[i29] = (byte) (i28 >> 8);
        }
        return i19 == i16 ? bArr : Arrays.copyOf(bArr, i19);
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            byte b15 = bArr[i15];
            int i17 = i15 + 2;
            byte b16 = bArr[i15 + 1];
            i15 += 3;
            byte b17 = bArr[i17];
            bArr3[i16] = bArr2[(b15 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            int i18 = i16 + 3;
            bArr3[i16 + 2] = bArr2[((b16 & 15) << 2) | ((b17 & 255) >> 6)];
            i16 += 4;
            bArr3[i18] = bArr2[b17 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b18 = bArr[i15];
            bArr3[i16] = bArr2[(b18 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[(b18 & 3) << 4];
            bArr3[i16 + 2] = 61;
            bArr3[i16 + 3] = 61;
        } else if (length2 == 2) {
            int i19 = i15 + 1;
            byte b19 = bArr[i15];
            byte b25 = bArr[i19];
            bArr3[i16] = bArr2[(b19 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[((b19 & 3) << 4) | ((b25 & 255) >> 4)];
            bArr3[i16 + 2] = bArr2[(b25 & 15) << 2];
            bArr3[i16 + 3] = 61;
        }
        return o0.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bArr2 = f208320a;
        }
        return b(bArr, bArr2);
    }
}
