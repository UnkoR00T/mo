package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class y90 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final BitSet f34358h = BitSet.valueOf(new long[]{287948901175001088L});

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final BitSet f34359i = BitSet.valueOf(new long[]{0, 576460743847706622L});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final BitSet f34360j = BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final BitSet f34361k = BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final BitSet f34362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final BitSet f34363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final BitSet f34364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final BitSet f34365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final BitSet f34366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final BitSet f34367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final char[] f34368r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f34375g;

    static {
        BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        BitSet.valueOf(new long[]{2882338748320710656L});
        BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        f34362l = BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        f34363m = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        f34364n = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        f34365o = BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        BitSet bitSetValueOf = BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        f34366p = bitSetValueOf;
        f34367q = bitSetValueOf;
        f34368r = "0123456789ABCDEF".toCharArray();
    }

    /* synthetic */ y90(x90 x90Var, byte[] bArr) {
        this.f34369a = (String) zj.p.r(x90Var.l(), "scheme");
        this.f34370b = x90Var.p();
        this.f34371c = x90Var.q();
        this.f34372d = x90Var.r();
        String strM = x90Var.m();
        this.f34373e = strM;
        this.f34374f = x90Var.n();
        this.f34375g = x90Var.o();
        if (!j()) {
            if (strM.startsWith("//")) {
                throw new IllegalArgumentException("No authority -- Path cannot start with '//'");
            }
        } else if (!strM.isEmpty() && !strM.startsWith("/")) {
            throw new IllegalArgumentException("Has authority -- Non-empty path must start with '/'");
        }
    }

    public static y90 a(String str) {
        int i15;
        x90 x90Var = new x90(null);
        int length = str.length();
        int i16 = 0;
        while (true) {
            i15 = -1;
            if (i16 < length) {
                char cCharAt = str.charAt(i16);
                if (cCharAt == ':') {
                    break;
                }
                if (cCharAt != '/' && cCharAt != '?' && cCharAt != '#') {
                    i16++;
                }
            }
            i16 = -1;
            break;
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("Missing required scheme.");
        }
        x90Var.b(str.substring(0, i16));
        int i17 = i16 + 1;
        int i18 = i16 + 2;
        if (i18 < length && str.charAt(i17) == '/' && str.charAt(i18) == '/') {
            int i19 = i16 + 3;
            i17 = i19;
            while (i17 < length) {
                char cCharAt2 = str.charAt(i17);
                if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                    break;
                }
                i17++;
            }
            String strSubstring = str.substring(i19, i17);
            int iIndexOf = strSubstring.indexOf(64);
            if (iIndexOf >= 0) {
                x90Var.g(strSubstring.substring(0, iIndexOf));
            }
            int i25 = iIndexOf >= 0 ? iIndexOf + 1 : 0;
            for (int length2 = strSubstring.length() - 1; length2 >= i25; length2--) {
                char cCharAt3 = strSubstring.charAt(length2);
                if (cCharAt3 == ':') {
                    i15 = length2;
                    break;
                }
                if (cCharAt3 == ']' || !f34358h.get(cCharAt3)) {
                    break;
                }
            }
            if (i15 < 0) {
                x90Var.i(strSubstring.substring(i25, strSubstring.length()));
            } else {
                x90Var.i(strSubstring.substring(i25, i15));
                x90Var.j(strSubstring.substring(i15 + 1));
            }
        }
        int i26 = i17;
        while (i26 < length) {
            char cCharAt4 = str.charAt(i26);
            if (cCharAt4 == '?' || cCharAt4 == '#') {
                break;
            }
            i26++;
        }
        x90Var.d(str.substring(i17, i26));
        if (i26 < length && str.charAt(i26) == '?') {
            int i27 = i26 + 1;
            int i28 = i27;
            while (i28 < length && str.charAt(i28) != '#') {
                i28++;
            }
            x90Var.e(str.substring(i27, i28));
            i26 = i28;
        }
        if (i26 < length && str.charAt(i26) == '#') {
            x90Var.f(str.substring(i26 + 1));
        }
        return x90Var.k();
    }

    public static x90 e() {
        return new x90(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(String str, ak.n0.a aVar) {
        String strSubstring;
        int length;
        int iStartsWith = str.startsWith("/");
        while (iStartsWith < str.length()) {
            int iIndexOf = str.indexOf(47, iStartsWith);
            if (iIndexOf >= 0) {
                strSubstring = str.substring(iStartsWith, iIndexOf);
                length = iIndexOf + 1;
            } else {
                strSubstring = str.substring(iStartsWith);
                length = str.length();
            }
            if (aVar != null) {
                aVar.a(m(strSubstring));
            } else {
                l(strSubstring, "path segment", f34364n, null);
            }
            iStartsWith = length;
        }
        if (!str.endsWith("/") || aVar == null) {
            return;
        }
        aVar.a("");
    }

    private final boolean j() {
        return this.f34371c != null;
    }

    private final void k(StringBuilder sb5) {
        String str = this.f34370b;
        if (str != null) {
            sb5.append(str);
            sb5.append('@');
        }
        String str2 = this.f34371c;
        if (str2 != null) {
            sb5.append(str2);
        }
        String str3 = this.f34372d;
        if (str3 != null) {
            sb5.append(':');
            sb5.append(str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(CharSequence charSequence, String str, BitSet bitSet, ByteBuffer byteBuffer) {
        int i15 = 0;
        while (i15 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt == '%') {
                int i16 = i15 + 2;
                if (i16 >= charSequence.length()) {
                    String strValueOf = String.valueOf(charSequence);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 38 + str.length() + 2 + strValueOf.length());
                    sb5.append("Invalid percent-encoding at index ");
                    sb5.append(i15);
                    sb5.append(" of ");
                    sb5.append(str);
                    sb5.append(": ");
                    sb5.append(strValueOf);
                    throw new IllegalArgumentException(sb5.toString());
                }
                int iDigit = Character.digit(charSequence.charAt(i15 + 1), 16);
                int iDigit2 = Character.digit(charSequence.charAt(i16), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    String strValueOf2 = String.valueOf(charSequence);
                    StringBuilder sb6 = new StringBuilder(str.length() + 31 + String.valueOf(i15).length() + 5 + strValueOf2.length());
                    sb6.append("Invalid hex digit in ");
                    sb6.append(str);
                    sb6.append(" at index ");
                    sb6.append(i15);
                    sb6.append(" of: ");
                    sb6.append(strValueOf2);
                    throw new IllegalArgumentException(sb6.toString());
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) ((iDigit << 4) | iDigit2));
                }
                i15 = i16;
            } else {
                if (bitSet != null && !bitSet.get(cCharAt)) {
                    StringBuilder sb7 = new StringBuilder(str.length() + 31 + String.valueOf(i15).length());
                    sb7.append("Invalid character in ");
                    sb7.append(str);
                    sb7.append(" at index ");
                    sb7.append(i15);
                    throw new IllegalArgumentException(sb7.toString());
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) cCharAt);
                }
            }
            i15++;
        }
    }

    private static String m(String str) {
        if (str == null || str.indexOf(37) == -1) {
            return str;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        l(str, "input", null, byteBufferAllocate);
        byteBufferAllocate.flip();
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(byteBufferAllocate).toString();
        } catch (CharacterCodingException e15) {
            throw new zj.d0(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(String str, BitSet bitSet) {
        if (str == null) {
            return null;
        }
        CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        try {
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
            StringBuilder sb5 = new StringBuilder();
            while (byteBufferEncode.hasRemaining()) {
                byte b15 = byteBufferEncode.get();
                int i15 = b15 & 255;
                if (bitSet.get(i15)) {
                    sb5.append((char) i15);
                } else {
                    sb5.append('%');
                    char[] cArr = f34368r;
                    sb5.append(cArr[(b15 & 240) >> 4]);
                    sb5.append(cArr[b15 & 15]);
                }
            }
            return sb5.toString();
        } catch (MalformedInputException e15) {
            throw new IllegalArgumentException("Malformed input", e15);
        } catch (CharacterCodingException e16) {
            throw new zj.d0(e16);
        }
    }

    public final String b() {
        return this.f34369a;
    }

    public final String c() {
        String string;
        if (j()) {
            StringBuilder sb5 = new StringBuilder();
            k(sb5);
            string = sb5.toString();
        } else {
            string = null;
        }
        return m(string);
    }

    public final List d() {
        String str = this.f34373e;
        ak.n0.a aVarS = ak.n0.s();
        i(str, aVarS);
        return aVarS.k();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return Objects.equals(this.f34369a, y90Var.f34369a) && Objects.equals(this.f34370b, y90Var.f34370b) && Objects.equals(this.f34371c, y90Var.f34371c) && Objects.equals(this.f34372d, y90Var.f34372d) && Objects.equals(this.f34373e, y90Var.f34373e) && Objects.equals(this.f34374f, y90Var.f34374f) && Objects.equals(this.f34375g, y90Var.f34375g);
    }

    public final int hashCode() {
        return Objects.hash(this.f34369a, this.f34370b, this.f34371c, this.f34372d, this.f34373e, this.f34374f, this.f34375g);
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f34369a);
        sb5.append(':');
        if (j()) {
            sb5.append("//");
            k(sb5);
        }
        sb5.append(this.f34373e);
        String str = this.f34374f;
        if (str != null) {
            sb5.append('?');
            sb5.append(str);
        }
        String str2 = this.f34375g;
        if (str2 != null) {
            sb5.append('#');
            sb5.append(str2);
        }
        return sb5.toString();
    }
}
