package fu;

import fr.v0;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005\u001a+\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005\u001a;\u0010)\u001a\u00020\u0002*\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010-\u001a\u00020\u0000*\u00020+2\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.\"%\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000000j\b\u0012\u0004\u0012\u00020\u0000`1*\u00020/8F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"", "other", "", "ignoreCase", "G", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "M", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "N", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "Q", "", "y", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "z", "([CII)Ljava/lang/String;", "", "A", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "B", "([BIIZ)Ljava/lang/String;", ip.a.f96138c, "(Ljava/lang/String;)[B", "prefix", "T", ip.a.f96137b, "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "E", "thisOffset", "otherOffset", "length", "J", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "", "n", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "I", "(Lfr/v0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class d0 extends c0 {
    public static String A(byte[] bArr) {
        return new String(bArr, d.UTF_8);
    }

    public static final String B(byte[] bArr, int i15, int i16, boolean z15) {
        pq.d.INSTANCE.a(i15, i16, bArr.length);
        if (!z15) {
            return new String(bArr, i15, i16 - i15, d.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = d.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i15, i16 - i15)).toString();
    }

    public static /* synthetic */ String C(byte[] bArr, int i15, int i16, boolean z15, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = bArr.length;
        }
        if ((i17 & 4) != 0) {
            z15 = false;
        }
        return B(bArr, i15, i16, z15);
    }

    public static byte[] D(String str) {
        return str.getBytes(d.UTF_8);
    }

    public static boolean E(String str, String str2, boolean z15) {
        return !z15 ? str.endsWith(str2) : J(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean F(String str, String str2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return E(str, str2, z15);
    }

    public static boolean G(String str, String str2, boolean z15) {
        if (str == null) {
            return str2 == null;
        }
        return !z15 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean H(String str, String str2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return G(str, str2, z15);
    }

    public static Comparator<String> I(v0 v0Var) {
        return String.CASE_INSENSITIVE_ORDER;
    }

    public static final boolean J(String str, int i15, String str2, int i16, int i17, boolean z15) {
        return !z15 ? str.regionMatches(i15, str2, i16, i17) : str.regionMatches(z15, i15, str2, i16, i17);
    }

    public static /* synthetic */ boolean K(String str, int i15, String str2, int i16, int i17, boolean z15, int i18, Object obj) {
        if ((i18 & 16) != 0) {
            z15 = false;
        }
        return J(str, i15, str2, i16, i17, z15);
    }

    public static String L(CharSequence charSequence, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i15 + '.').toString());
        }
        if (i15 == 0) {
            return "";
        }
        int i16 = 1;
        if (i15 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb5 = new StringBuilder(charSequence.length() * i15);
            if (1 <= i15) {
                while (true) {
                    sb5.append(charSequence);
                    if (i16 == i15) {
                        break;
                    }
                    i16++;
                }
            }
            return sb5.toString();
        }
        char cCharAt = charSequence.charAt(0);
        char[] cArr = new char[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            cArr[i17] = cCharAt;
        }
        return new String(cArr);
    }

    public static final String M(String str, char c15, char c16, boolean z15) {
        if (!z15) {
            return str.replace(c15, c16);
        }
        StringBuilder sb5 = new StringBuilder(str.length());
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (c.g(cCharAt, c15, z15)) {
                cCharAt = c16;
            }
            sb5.append(cCharAt);
        }
        return sb5.toString();
    }

    public static final String N(String str, String str2, String str3, boolean z15) {
        int i15 = 0;
        int iN0 = g0.n0(str, str2, 0, z15);
        if (iN0 < 0) {
            return str;
        }
        int length = str2.length();
        int iE = lr.m.e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb5 = new StringBuilder(length2);
        do {
            sb5.append((CharSequence) str, i15, iN0);
            sb5.append(str3);
            i15 = iN0 + length;
            if (iN0 >= str.length()) {
                break;
            }
            iN0 = g0.n0(str, str2, iN0 + iE, z15);
        } while (iN0 > 0);
        sb5.append((CharSequence) str, i15, str.length());
        return sb5.toString();
    }

    public static /* synthetic */ String O(String str, char c15, char c16, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return M(str, c15, c16, z15);
    }

    public static /* synthetic */ String P(String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return N(str, str2, str3, z15);
    }

    public static final String Q(String str, String str2, String str3, boolean z15) {
        int iR0 = g0.r0(str, str2, 0, z15, 2, null);
        return iR0 < 0 ? str : g0.P0(str, iR0, str2.length() + iR0, str3).toString();
    }

    public static /* synthetic */ String R(String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return Q(str, str2, str3, z15);
    }

    public static boolean S(String str, String str2, int i15, boolean z15) {
        return !z15 ? str.startsWith(str2, i15) : J(str, i15, str2, 0, str2.length(), z15);
    }

    public static boolean T(String str, String str2, boolean z15) {
        return !z15 ? str.startsWith(str2) : J(str, 0, str2, 0, str2.length(), z15);
    }

    public static /* synthetic */ boolean U(String str, String str2, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            z15 = false;
        }
        return S(str, str2, i15, z15);
    }

    public static /* synthetic */ boolean V(String str, String str2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return T(str, str2, z15);
    }

    public static String y(char[] cArr) {
        return new String(cArr);
    }

    public static String z(char[] cArr, int i15, int i16) {
        pq.d.INSTANCE.a(i15, i16, cArr.length);
        return new String(cArr, i15, i16 - i15);
    }
}
