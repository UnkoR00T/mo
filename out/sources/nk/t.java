package nk;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f137094a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i15 = 0;
        while (i15 == 0) {
            secureRandom.nextBytes(bArr);
            i15 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i15;
    }

    private static final byte d(char c15) {
        if (c15 >= '!' && c15 <= '~') {
            return (byte) c15;
        }
        throw new s("Not a printable ASCII character: " + c15);
    }

    public static final uk.a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i15 = 0; i15 < str.length(); i15++) {
            bArr[i15] = d(str.charAt(i15));
        }
        return uk.a.a(bArr);
    }
}
