package kn;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f111473a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f111474b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, GF2Field.MASK, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 97, 192, 252, 95, 9, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{Primes.SMALL_FACTOR_LIMIT, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 136, 120, 151, 233, 168, 93, GF2Field.MASK}, new int[]{245, CertificateBody.profileType, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, CertificateBody.profileType, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, BERTags.FLAGS, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, CertificateBody.profileType, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, Primes.SMALL_FACTOR_LIMIT, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f111475c = new int[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f111476d = new int[GF2Field.MASK];

    static {
        int i15 = 1;
        for (int i16 = 0; i16 < 255; i16++) {
            f111476d[i16] = i15;
            f111475c[i15] = i16;
            i15 *= 2;
            if (i15 >= 256) {
                i15 ^= 301;
            }
        }
    }

    private static String a(CharSequence charSequence, int i15) {
        int i16;
        int i17;
        int i18 = 0;
        while (true) {
            int[] iArr = f111473a;
            if (i18 >= iArr.length) {
                i18 = -1;
                break;
            }
            if (iArr[i18] == i15) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + i15);
        }
        int[] iArr2 = f111474b[i18];
        char[] cArr = new char[i15];
        for (int i19 = 0; i19 < i15; i19++) {
            cArr[i19] = 0;
        }
        for (int i25 = 0; i25 < charSequence.length(); i25++) {
            int i26 = i15 - 1;
            int iCharAt = cArr[i26] ^ charSequence.charAt(i25);
            while (i26 > 0) {
                if (iCharAt == 0 || (i17 = iArr2[i26]) == 0) {
                    cArr[i26] = cArr[i26 - 1];
                } else {
                    char c15 = cArr[i26 - 1];
                    int[] iArr3 = f111476d;
                    int[] iArr4 = f111475c;
                    cArr[i26] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i17]) % GF2Field.MASK] ^ c15);
                }
                i26--;
            }
            if (iCharAt == 0 || (i16 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f111476d;
                int[] iArr6 = f111475c;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i16]) % GF2Field.MASK];
            }
        }
        char[] cArr2 = new char[i15];
        for (int i27 = 0; i27 < i15; i27++) {
            cArr2[i27] = cArr[(i15 - i27) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String b(String str, l lVar) {
        if (str.length() != lVar.a()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb5 = new StringBuilder(lVar.a() + lVar.c());
        sb5.append(str);
        int iF = lVar.f();
        if (iF == 1) {
            sb5.append(a(str, lVar.c()));
        } else {
            sb5.setLength(sb5.capacity());
            int[] iArr = new int[iF];
            int[] iArr2 = new int[iF];
            int i15 = 0;
            while (i15 < iF) {
                int i16 = i15 + 1;
                iArr[i15] = lVar.b(i16);
                iArr2[i15] = lVar.d(i16);
                i15 = i16;
            }
            for (int i17 = 0; i17 < iF; i17++) {
                StringBuilder sb6 = new StringBuilder(iArr[i17]);
                for (int i18 = i17; i18 < lVar.a(); i18 += iF) {
                    sb6.append(str.charAt(i18));
                }
                String strA = a(sb6.toString(), iArr2[i17]);
                int i19 = 0;
                int i25 = i17;
                while (i25 < iArr2[i17] * iF) {
                    sb5.setCharAt(lVar.a() + i25, strA.charAt(i19));
                    i25 += iF;
                    i19++;
                }
            }
        }
        return sb5.toString();
    }
}
