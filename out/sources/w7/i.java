package w7;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f210684a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f210685b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f210686c = Pattern.compile("^\\D?(\\d+)$");

    private static Integer A(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return Integer.valueOf(PKIFailureInfo.certRevoked);
            case "H150":
                return 32768;
            case "H153":
                return Integer.valueOf(PKIFailureInfo.unsupportedVersion);
            case "H156":
                return Integer.valueOf(PKIFailureInfo.signerNotTrusted);
            case "H180":
                return Integer.valueOf(PKIFailureInfo.badSenderNonce);
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return Integer.valueOf(PKIFailureInfo.certConfirmed);
            case "L150":
                return 16384;
            case "L153":
                return Integer.valueOf(PKIFailureInfo.notAuthorized);
            case "L156":
                return Integer.valueOf(PKIFailureInfo.transactionIdInUse);
            case "L180":
                return Integer.valueOf(PKIFailureInfo.badCertTemplate);
            case "L183":
                return 4194304;
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    private static int B(int i15) {
        int i16 = 17;
        if (i15 != 17) {
            i16 = 20;
            if (i15 != 20) {
                i16 = 23;
                if (i15 != 23) {
                    i16 = 29;
                    if (i15 != 29) {
                        i16 = 39;
                        if (i15 != 39) {
                            i16 = 42;
                            if (i15 != 42) {
                                switch (i15) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i16;
    }

    public static int[] C(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        c0Var.f0(5);
        int iQ = c0Var.Q();
        c0Var.f0(9);
        int iQ2 = c0Var.Q();
        c0Var.f0(20);
        return new int[]{c0Var.U(), iQ2, iQ};
    }

    public static boolean D(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int E(int i15) {
        if (i15 == 10) {
            return 1;
        }
        if (i15 == 11) {
            return 2;
        }
        if (i15 == 20) {
            return 4;
        }
        if (i15 == 21) {
            return 8;
        }
        if (i15 == 30) {
            return 16;
        }
        if (i15 == 31) {
            return 32;
        }
        if (i15 == 40) {
            return 64;
        }
        if (i15 == 41) {
            return 128;
        }
        if (i15 == 50) {
            return 256;
        }
        if (i15 == 51) {
            return 512;
        }
        switch (i15) {
            case 60:
                return 2048;
            case 61:
                return PKIFailureInfo.certConfirmed;
            case 62:
                return PKIFailureInfo.certRevoked;
            default:
                return -1;
        }
    }

    private static int F(int i15) {
        if (i15 == 0) {
            return 1;
        }
        if (i15 == 1) {
            return 2;
        }
        if (i15 != 2) {
            return i15 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Integer G(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H64":
                return 64;
            case "H67":
                return 256;
            case "H80":
                return 1024;
            case "H83":
                return Integer.valueOf(PKIFailureInfo.certConfirmed);
            case "H86":
                return 16384;
            case "H96":
                return Integer.valueOf(PKIFailureInfo.notAuthorized);
            case "L16":
                return 1;
            case "L32":
                return 2;
            case "L35":
                return 4;
            case "L48":
                return 8;
            case "L51":
                return 16;
            case "L64":
                return 32;
            case "L67":
                return 128;
            case "L80":
                return 512;
            case "L83":
                return 2048;
            case "L86":
                return Integer.valueOf(PKIFailureInfo.certRevoked);
            case "L96":
                return 32768;
            case "H112":
                return Integer.valueOf(PKIFailureInfo.transactionIdInUse);
            case "H128":
                return Integer.valueOf(PKIFailureInfo.badCertTemplate);
            case "H144":
                return 4194304;
            case "L112":
                return Integer.valueOf(PKIFailureInfo.unsupportedVersion);
            case "L128":
                return Integer.valueOf(PKIFailureInfo.signerNotTrusted);
            case "L144":
                return Integer.valueOf(PKIFailureInfo.badSenderNonce);
            default:
                return null;
        }
    }

    private static int a(int i15, int i16) {
        if (i15 == 0) {
            return i16 == 0 ? 257 : -1;
        }
        if (i15 == 1) {
            if (i16 == 0) {
                return 513;
            }
            return i16 == 1 ? 514 : -1;
        }
        if (i15 != 2) {
            return -1;
        }
        if (i16 == 1) {
            return 1026;
        }
        return i16 == 2 ? 1028 : -1;
    }

    private static int b(int i15) {
        if (i15 == 0) {
            return 1;
        }
        if (i15 == 1) {
            return 2;
        }
        if (i15 == 2) {
            return 4;
        }
        if (i15 != 3) {
            return i15 != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int c(int i15) {
        switch (i15) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return PKIFailureInfo.certConfirmed;
            case 13:
                return PKIFailureInfo.certRevoked;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return PKIFailureInfo.notAuthorized;
            case 17:
                return PKIFailureInfo.unsupportedVersion;
            case 18:
                return PKIFailureInfo.transactionIdInUse;
            case 19:
                return PKIFailureInfo.signerNotTrusted;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int d(int i15) {
        switch (i15) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i15) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i15) {
                            case 30:
                                return 256;
                            case BERTags.DATE /* 31 */:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i15) {
                                    case 40:
                                        return 2048;
                                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                        return PKIFailureInfo.certConfirmed;
                                    case EACTags.CURRENCY_CODE /* 42 */:
                                        return PKIFailureInfo.certRevoked;
                                    default:
                                        switch (i15) {
                                            case 50:
                                                return 16384;
                                            case EACTags.TRANSACTION_DATE /* 51 */:
                                                return 32768;
                                            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                return PKIFailureInfo.notAuthorized;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int e(int i15) {
        if (i15 == 66) {
            return 1;
        }
        if (i15 == 77) {
            return 2;
        }
        if (i15 == 88) {
            return 4;
        }
        if (i15 == 100) {
            return 8;
        }
        if (i15 == 110) {
            return 16;
        }
        if (i15 != 122) {
            return i15 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(byte[] bArr) {
        zj.p.h(bArr.length >= 17, "Invalid APV CSD length: %s", bArr.length);
        byte b15 = bArr[0];
        zj.p.h(b15 == 1, "Invalid APV CSD version: %s", b15);
        return o0.F("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7]));
    }

    public static String g(int i15, int i16, int i17) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    public static List<byte[]> h(boolean z15) {
        return Collections.singletonList(z15 ? new byte[]{1} : new byte[]{0});
    }

    public static String i(int i15, boolean z15, int i16, int i17, int[] iArr, int i18) {
        StringBuilder sb5 = new StringBuilder(o0.F("hvc1.%s%d.%X.%c%d", f210685b[i15], Integer.valueOf(i16), Integer.valueOf(i17), Character.valueOf(z15 ? 'H' : 'L'), Integer.valueOf(i18)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i19 = 0; i19 < length; i19++) {
            sb5.append(String.format(".%02X", Integer.valueOf(iArr[i19])));
        }
        return sb5.toString();
    }

    public static String j(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        String strF = null;
        String strN = null;
        while (c0Var.a() > 0 && (strF == null || strN == null)) {
            int iQ = c0Var.Q();
            int i15 = iQ >> 3;
            boolean z15 = (iQ & 2) != 0;
            boolean z16 = (iQ & 1) != 0;
            int iV = c0Var.V();
            if (i15 > 4 && i15 < 24 && z15) {
                c0Var.h0();
                c0Var.h0();
            }
            if (z16) {
                c0Var.g0(c0Var.V());
            }
            int iG = c0Var.g() + iV;
            if (i15 == 31) {
                c0Var.g0(4);
                strF = o0.F("iamf.%03X.%03X", Integer.valueOf(c0Var.Q()), Integer.valueOf(c0Var.Q()));
            } else if (i15 == 0) {
                c0Var.h0();
                strN = c0Var.N(4);
                if (strN.equals("mp4a")) {
                    c0Var.h0();
                    c0Var.g0(2);
                    b0 b0Var = new b0();
                    b0Var.m(c0Var);
                    int iH = b0Var.h(5);
                    if (iH == 31) {
                        iH = b0Var.h(6) + 32;
                    }
                    strN = strN + ".40." + iH;
                }
            }
            c0Var.f0(iG);
        }
        if (strF == null || strN == null) {
            return null;
        }
        return strF + "." + strN;
    }

    public static byte[] k(byte[] bArr, int i15, int i16) {
        byte[] bArr2 = f210684a;
        byte[] bArr3 = new byte[bArr2.length + i16];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i15, bArr3, bArr2.length, i16);
        return bArr3;
    }

    public static ak.n0<byte[]> l(byte b15, byte b16, byte b17, byte b18) {
        return ak.n0.E(new byte[]{1, 1, b15, 2, 1, b16, 3, 1, b17, 4, 1, b18});
    }

    private static Integer m(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return Integer.valueOf(PKIFailureInfo.certConfirmed);
            default:
                return null;
        }
    }

    private static Integer n(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int iB;
        if (strArr.length != 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(t7.w.c(Integer.parseInt(strArr[1], 16))) && (iB = B(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iB), 0);
            }
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        if (strArr.length != 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i15 = Integer.parseInt(strArr[1]);
            int i16 = Integer.parseInt(strArr[2]);
            int i17 = Integer.parseInt(strArr[3]);
            int iA = a(i15, i16);
            if (iA == -1) {
                t.h("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i15 + "." + i16);
                return null;
            }
            int iB = b(i17);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iA), Integer.valueOf(iB));
            }
            t.h("CodecSpecificDataUtil", "Unknown AC-4 level: " + i17);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> q(String str, String[] strArr) {
        int i15;
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str);
            return null;
        }
        try {
            int i16 = Integer.parseInt(strArr[1].substring(4));
            int i17 = Integer.parseInt(strArr[2].substring(4));
            int i18 = Integer.parseInt(strArr[3].substring(4));
            if (i16 == 33) {
                i15 = 1;
            } else {
                if (i16 != 44) {
                    t.h("CodecSpecificDataUtil", "Ignoring invalid APV profile: " + i16);
                    return null;
                }
                i15 = PKIFailureInfo.certRevoked;
            }
            int i19 = (i17 / 30) * 2;
            if (i17 % 30 == 0) {
                i19--;
            }
            return new Pair<>(Integer.valueOf(i15), Integer.valueOf((1 << i18) | (256 << (i19 - 1))));
        } catch (NumberFormatException e15) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str, e15);
            return null;
        }
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr, t7.g gVar) {
        int i15;
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i16 = 1;
        try {
            int i17 = Integer.parseInt(strArr[1]);
            int i18 = Integer.parseInt(strArr[2].substring(0, 2));
            int i19 = Integer.parseInt(strArr[3]);
            if (i17 != 0) {
                t.h("CodecSpecificDataUtil", "Unknown AV1 profile: " + i17);
                return null;
            }
            if (i19 != 8 && i19 != 10) {
                t.h("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i19);
                return null;
            }
            if (i19 != 8) {
                i16 = (gVar == null || !(gVar.f188193d != null || (i15 = gVar.f188192c) == 7 || i15 == 6)) ? 2 : PKIFailureInfo.certConfirmed;
            }
            int iC = c(i18);
            if (iC != -1) {
                return new Pair<>(Integer.valueOf(i16), Integer.valueOf(iC));
            }
            t.h("CodecSpecificDataUtil", "Unknown AV1 level: " + i18);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> s(String str, String[] strArr) {
        int i15;
        int i16;
        if (strArr.length < 2) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i16 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i15 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i17 = Integer.parseInt(strArr[1]);
                i15 = Integer.parseInt(strArr[2]);
                i16 = i17;
            }
            int iE = e(i16);
            if (iE == -1) {
                t.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i16);
                return null;
            }
            int iD = d(i15);
            if (iD != -1) {
                return new Pair<>(Integer.valueOf(iE), Integer.valueOf(iD));
            }
            t.h("CodecSpecificDataUtil", "Unknown AVC level: " + i15);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> t(t7.p pVar) {
        String str = pVar.f188376k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(pVar.f188381p)) {
            return u(pVar.f188376k, strArrSplit);
        }
        byte b15 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 2986313:
                if (!str2.equals("ac-4")) {
                    b15 = -1;
                }
                break;
            case 3001066:
                b15 = !str2.equals("apv1") ? (byte) -1 : (byte) 1;
                break;
            case 3004662:
                b15 = !str2.equals("av01") ? (byte) -1 : (byte) 2;
                break;
            case 3006243:
                b15 = !str2.equals("avc1") ? (byte) -1 : (byte) 3;
                break;
            case 3006244:
                b15 = !str2.equals("avc2") ? (byte) -1 : (byte) 4;
                break;
            case 3199032:
                b15 = !str2.equals("hev1") ? (byte) -1 : (byte) 5;
                break;
            case 3214780:
                b15 = !str2.equals("hvc1") ? (byte) -1 : (byte) 6;
                break;
            case 3224753:
                b15 = !str2.equals("iamf") ? (byte) -1 : (byte) 7;
                break;
            case 3356560:
                b15 = !str2.equals("mp4a") ? (byte) -1 : (byte) 8;
                break;
            case 3475740:
                b15 = !str2.equals("s263") ? (byte) -1 : (byte) 9;
                break;
            case 3624515:
                b15 = !str2.equals("vp09") ? (byte) -1 : (byte) 10;
                break;
            case 3631854:
                b15 = !str2.equals("vvc1") ? (byte) -1 : (byte) 11;
                break;
            case 3632040:
                b15 = !str2.equals("vvi1") ? (byte) -1 : (byte) 12;
                break;
            default:
                b15 = -1;
                break;
        }
        switch (b15) {
            case 0:
                return p(pVar.f188376k, strArrSplit);
            case 1:
                return q(pVar.f188376k, strArrSplit);
            case 2:
                return r(pVar.f188376k, strArrSplit, pVar.F);
            case 3:
            case 4:
                return s(pVar.f188376k, strArrSplit);
            case 5:
            case 6:
                return w(pVar.f188376k, strArrSplit, pVar.F);
            case 7:
                return x(pVar.f188376k, strArrSplit);
            case 8:
                return o(pVar.f188376k, strArrSplit);
            case 9:
                return v(pVar.f188376k, strArrSplit);
            case 10:
                return y(pVar.f188376k, strArrSplit);
            case 11:
            case 12:
                return z(pVar.f188376k, strArrSplit, pVar.F);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> u(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f210686c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numN = n(strGroup);
        if (numN == null) {
            t.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numM = m(str2);
        if (numM != null) {
            return new Pair<>(numN, numM);
        }
        t.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> v(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> w(String str, String[] strArr, t7.g gVar) {
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i15 = 1;
        Matcher matcher = f210686c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i15 = 6;
            if ("2".equals(strGroup)) {
                i15 = (gVar == null || gVar.f188192c != 6) ? 2 : PKIFailureInfo.certConfirmed;
            } else if (!"6".equals(strGroup)) {
                t.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numA = A(str2);
        if (numA != null) {
            return new Pair<>(Integer.valueOf(i15), numA);
        }
        t.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        int i15 = 4;
        if (strArr.length < 4) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i16 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i15 = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i15 = 8;
                    break;
                case "mp4a":
                    i15 = 2;
                    break;
                default:
                    t.h("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(16777216 | i16 | i15), 0);
        } catch (NumberFormatException e15) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e15);
            return null;
        }
    }

    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i15 = Integer.parseInt(strArr[1]);
            int i16 = Integer.parseInt(strArr[2]);
            int iF = F(i15);
            if (iF == -1) {
                t.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + i15);
                return null;
            }
            int iE = E(i16);
            if (iE != -1) {
                return new Pair<>(Integer.valueOf(iF), Integer.valueOf(iE));
            }
            t.h("CodecSpecificDataUtil", "Unknown VP9 level: " + i16);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> z(String str, String[] strArr, t7.g gVar) {
        if (strArr.length < 3) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: " + str);
            return null;
        }
        int i15 = 1;
        try {
            int i16 = Integer.parseInt(strArr[1]);
            if (i16 == 1) {
                if (gVar != null && gVar.f188192c == 6) {
                    i15 = PKIFailureInfo.certConfirmed;
                } else if (gVar == null || gVar.f188194e != 8) {
                    i15 = 2;
                }
            } else {
                if (i16 != 65) {
                    t.h("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + strArr[1]);
                    return null;
                }
                i15 = 4;
            }
            String str2 = strArr[2];
            Integer numG = G(str2);
            if (numG != null) {
                return new Pair<>(Integer.valueOf(i15), numG);
            }
            t.h("CodecSpecificDataUtil", "Unknown VVC level string: " + str2);
            return null;
        } catch (NumberFormatException unused) {
            t.h("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: " + str);
            return null;
        }
    }
}
