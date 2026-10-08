package gv;

import fr.t;
import fu.r;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vv.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "(Ljava/lang/String;II)Ljava/net/InetAddress;", "", "address", "addressOffset", "b", "(Ljava/lang/String;II[BI)Z", "d", "([B)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (t.d(cCharAt, 31) <= 0 || t.d(cCharAt, CertificateBody.profileType) >= 0 || r.q0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i15, int i16, byte[] bArr, int i17) {
        int i18 = i17;
        while (i15 < i16) {
            if (i18 == bArr.length) {
                return false;
            }
            if (i18 != i17) {
                if (str.charAt(i15) != '.') {
                    return false;
                }
                i15++;
            }
            int i19 = i15;
            int i25 = 0;
            while (i19 < i16) {
                char cCharAt = str.charAt(i19);
                if (t.d(cCharAt, 48) < 0 || t.d(cCharAt, 57) > 0) {
                    break;
                }
                if ((i25 == 0 && i15 != i19) || (i25 = ((i25 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i19++;
            }
            if (i19 - i15 == 0) {
                return false;
            }
            bArr[i18] = (byte) i25;
            i18++;
            i15 = i19;
        }
        return i18 == i17 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[LOOP:1: B:30:0x0064->B:33:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[EDGE_INSN: B:54:0x0076->B:34:0x0076 BREAK  A[LOOP:1: B:30:0x0064->B:33:0x0070], SYNTHETIC] */
    private static final InetAddress c(String str, int i15, int i16) {
        int i17;
        int i18;
        int iH;
        byte[] bArr = new byte[16];
        int i19 = i15;
        int i25 = 0;
        int i26 = -1;
        int i27 = -1;
        while (i19 < i16) {
            if (i25 == 16) {
                return null;
            }
            int i28 = i19 + 2;
            if (i28 <= i16 && r.U(str, "::", i19, false, 4, null)) {
                if (i26 != -1) {
                    return null;
                }
                i25 += 2;
                if (i28 == i16) {
                    i26 = i25;
                    break;
                }
                i26 = i25;
                i27 = i28;
                i17 = 0;
                i19 = i27;
                while (i19 < i16) {
                    iH = d.H(str.charAt(i19));
                    if (iH != -1) {
                        break;
                        break;
                    }
                    i17 = (i17 << 4) + iH;
                    i19++;
                }
                i18 = i19 - i27;
                if (i18 != 0) {
                }
                return null;
            }
            if (i25 != 0) {
                if (!r.U(str, ":", i19, false, 4, null)) {
                    if (!r.U(str, ".", i19, false, 4, null) || !b(str, i27, i16, bArr, i25 - 2)) {
                        return null;
                    }
                    i25 += 2;
                    break;
                }
                i19++;
            }
            i27 = i19;
            i17 = 0;
            i19 = i27;
            while (i19 < i16) {
                iH = d.H(str.charAt(i19));
                if (iH != -1) {
                    break;
                }
                i17 = (i17 << 4) + iH;
                i19++;
            }
            i18 = i19 - i27;
            if (i18 != 0 || i18 > 4) {
                return null;
            }
            int i29 = i25 + 1;
            bArr[i25] = (byte) ((i17 >>> 8) & GF2Field.MASK);
            i25 += 2;
            bArr[i29] = (byte) (i17 & GF2Field.MASK);
        }
        if (i25 != 16) {
            if (i26 == -1) {
                return null;
            }
            int i35 = i25 - i26;
            System.arraycopy(bArr, i26, bArr, 16 - i35, i35);
            Arrays.fill(bArr, i26, (16 - i25) + i26, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String d(byte[] bArr) {
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i17 < bArr.length) {
            int i19 = i17;
            while (i19 < 16 && bArr[i19] == 0 && bArr[i19 + 1] == 0) {
                i19 += 2;
            }
            int i25 = i19 - i17;
            if (i25 > i18 && i25 >= 4) {
                i15 = i17;
                i18 = i25;
            }
            i17 = i19 + 2;
        }
        e eVar = new e();
        while (i16 < bArr.length) {
            if (i16 == i15) {
                eVar.writeByte(58);
                i16 += i18;
                if (i16 == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i16 > 0) {
                    eVar.writeByte(58);
                }
                eVar.r3((d.d(bArr[i16], GF2Field.MASK) << 8) | d.d(bArr[i16 + 1], GF2Field.MASK));
                i16 += 2;
            }
        }
        return eVar.C0();
    }

    public static final String e(String str) {
        if (!r.d0(str, ":", false, 2, null)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0 || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (r.V(str, "[", false, 2, null) && r.F(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
