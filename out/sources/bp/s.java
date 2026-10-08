package bp;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes4.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f20976a = new int[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Character, Integer> f20977b = new HashMap(256);

    static {
        for (int i15 = 0; i15 < 256; i15++) {
            if ((i15 <= 23 || i15 >= 32) && ((i15 <= 126 || i15 >= 161) && i15 != 173)) {
                c(i15, (char) i15);
            }
        }
        c(24, (char) 728);
        c(25, (char) 711);
        c(26, (char) 710);
        c(27, (char) 729);
        c(28, (char) 733);
        c(29, (char) 731);
        c(30, (char) 730);
        c(31, (char) 732);
        c(CertificateBody.profileType, (char) 65533);
        c(128, (char) 8226);
        c(129, (char) 8224);
        c(130, (char) 8225);
        c(131, (char) 8230);
        c(132, (char) 8212);
        c(133, (char) 8211);
        c(134, (char) 402);
        c(135, (char) 8260);
        c(136, (char) 8249);
        c(137, (char) 8250);
        c(138, (char) 8722);
        c(139, (char) 8240);
        c(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, (char) 8222);
        c(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, (char) 8220);
        c(142, (char) 8221);
        c(143, (char) 8216);
        c(144, (char) 8217);
        c(145, (char) 8218);
        c(146, (char) 8482);
        c(147, (char) 64257);
        c(148, (char) 64258);
        c(149, (char) 321);
        c(150, (char) 338);
        c(151, (char) 352);
        c(152, (char) 376);
        c(153, (char) 381);
        c(154, (char) 305);
        c(155, (char) 322);
        c(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, (char) 339);
        c(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, (char) 353);
        c(158, (char) 382);
        c(159, (char) 65533);
        c(160, (char) 8364);
    }

    public static boolean a(char c15) {
        return f20977b.containsKey(Character.valueOf(c15));
    }

    public static byte[] b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c15 : str.toCharArray()) {
            Integer num = f20977b.get(Character.valueOf(c15));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void c(int i15, char c15) {
        f20976a[i15] = c15;
        f20977b.put(Character.valueOf(c15), Integer.valueOf(i15));
    }

    public static String d(byte[] bArr) {
        StringBuilder sb5 = new StringBuilder();
        for (byte b15 : bArr) {
            int i15 = b15 & 255;
            int[] iArr = f20976a;
            if (i15 >= iArr.length) {
                sb5.append('?');
            } else {
                sb5.append((char) iArr[i15]);
            }
        }
        return sb5.toString();
    }
}
