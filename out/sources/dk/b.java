package dk;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zj.d f42914a = zj.d.j('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zj.d f42915b = zj.d.j(':');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Inet4Address f42916c = (Inet4Address) c("127.0.0.1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Inet4Address f42917d = (Inet4Address) c("0.0.0.0");

    /* JADX INFO: renamed from: dk.b$b, reason: collision with other inner class name */
    private static final class C0950b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f42918a;

        private C0950b() {
        }
    }

    private static InetAddress a(byte[] bArr, String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            p.e(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int iM = m(str, 0, str.length());
            if (iM != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), iM);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw e("No such interface: '%s'", str);
            } catch (SocketException e15) {
                e = e15;
                throw new IllegalArgumentException("No such interface: " + str, e);
            } catch (UnknownHostException e16) {
                e = e16;
                throw new IllegalArgumentException("No such interface: " + str, e);
            }
        } catch (UnknownHostException e17) {
            throw new AssertionError(e17);
        }
    }

    private static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrK = k(str.substring(iLastIndexOf));
        if (bArrK == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrK[0] & 255) << 8) | (bArrK[1] & 255)) + ":" + Integer.toHexString((bArrK[3] & 255) | ((bArrK[2] & 255) << 8));
    }

    public static InetAddress c(String str) {
        C0950b c0950b = new C0950b();
        byte[] bArrF = f(str, c0950b);
        if (bArrF != null) {
            return a(bArrF, c0950b.f42918a);
        }
        throw e("'%s' is not an IP string literal.", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InetAddress d(String str, boolean z15) {
        int i15;
        p.q(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i15 = 16;
        } else {
            i15 = 4;
        }
        C0950b c0950b = z15 ? new C0950b() : null;
        byte[] bArrF = f(str, c0950b);
        if (bArrF == null || bArrF.length != i15) {
            return null;
        }
        return a(bArrF, c0950b != null ? c0950b.f42918a : null);
    }

    private static IllegalArgumentException e(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static byte[] f(String str, C0950b c0950b) {
        int i15 = 0;
        boolean z15 = false;
        boolean z16 = false;
        while (true) {
            if (i15 >= str.length()) {
                i15 = -1;
                break;
            }
            char cCharAt = str.charAt(i15);
            if (cCharAt == '.') {
                z15 = true;
            } else if (cCharAt == ':') {
                if (z15) {
                    return null;
                }
                z16 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i15++;
        }
        if (!z16) {
            if (z15 && i15 == -1) {
                return k(str);
            }
            return null;
        }
        if (z15 && (str = b(str)) == null) {
            return null;
        }
        if (i15 != -1) {
            if (c0950b != null) {
                c0950b.f42918a = str.substring(i15 + 1);
            }
            str = str.substring(0, i15);
        }
        return l(str);
    }

    public static boolean g(String str) {
        return f(str, null) != null;
    }

    public static boolean h(String str) {
        return d(str, false) != null;
    }

    private static short i(String str, int i15, int i16) {
        int i17 = i16 - i15;
        if (i17 <= 0 || i17 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i15 < i16) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i15), 16);
            i15++;
        }
        return (short) iDigit;
    }

    private static byte j(String str, int i15, int i16) {
        int i17 = i16 - i15;
        if (i17 <= 0 || i17 > 3) {
            throw new NumberFormatException();
        }
        if (i17 > 1 && str.charAt(i15) == '0') {
            throw new NumberFormatException();
        }
        int i18 = 0;
        while (i15 < i16) {
            int i19 = i18 * 10;
            int iDigit = Character.digit(str.charAt(i15), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i18 = i19 + iDigit;
            i15++;
        }
        if (i18 <= 255) {
            return (byte) i18;
        }
        throw new NumberFormatException();
    }

    private static byte[] k(String str) {
        if (f42914a.g(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int iIndexOf = str.indexOf(46, i15);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i16] = j(str, i15, iIndexOf);
                i15 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] l(String str) {
        int iG = f42915b.g(str);
        if (iG >= 2 && iG <= 8) {
            int i15 = 1;
            int i16 = iG + 1;
            int i17 = 8 - i16;
            boolean z15 = false;
            for (int i18 = 0; i18 < str.length() - 1; i18++) {
                if (str.charAt(i18) == ':' && str.charAt(i18 + 1) == ':') {
                    if (z15) {
                        return null;
                    }
                    int i19 = i17 + 1;
                    if (i18 == 0) {
                        i19 = i17 + 2;
                    }
                    if (i18 == str.length() - 2) {
                        i19++;
                    }
                    i17 = i19;
                    z15 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z15 && i17 <= 0) {
                return null;
            }
            if (!z15 && i16 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i15 = 0;
                }
                while (i15 < str.length()) {
                    int iIndexOf = str.indexOf(58, i15);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i15) == ':') {
                        for (int i25 = 0; i25 < i17; i25++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(i(str, i15, iIndexOf));
                    }
                    i15 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static int m(String str, int i15, int i16) {
        int i17 = 0;
        while (i15 < i16) {
            if (i17 > 214748364) {
                return -1;
            }
            int i18 = i17 * 10;
            int iDigit = Character.digit(str.charAt(i15), 10);
            if (iDigit < 0) {
                return -1;
            }
            i17 = i18 + iDigit;
            i15++;
        }
        return i17;
    }
}
