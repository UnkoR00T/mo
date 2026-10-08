package bk;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f19864a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f19865b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f19866c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f19867d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f19868e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: bk.a$a, reason: collision with other inner class name */
    static final class C0513a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f19870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f19871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f19872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f19873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f19874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f19875g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f19876h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f19877i;

        C0513a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i15 = 0; i15 < cArr.length; i15++) {
                char c15 = cArr[i15];
                boolean z15 = true;
                p.f(c15 < 128, "Non-ASCII character: %s", c15);
                if (bArr[c15] != -1) {
                    z15 = false;
                }
                p.f(z15, "Duplicate character: %s", c15);
                bArr[c15] = (byte) i15;
            }
            return bArr;
        }

        private boolean e() {
            for (char c15 : this.f19870b) {
                if (zj.c.c(c15)) {
                    return true;
                }
            }
            return false;
        }

        private boolean f() {
            for (char c15 : this.f19870b) {
                if (zj.c.d(c15)) {
                    return true;
                }
            }
            return false;
        }

        int c(char c15) throws d {
            if (c15 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c15));
            }
            byte b15 = this.f19875g[c15];
            if (b15 != -1) {
                return b15;
            }
            if (c15 <= ' ' || c15 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c15));
            }
            throw new d("Unrecognized character: " + c15);
        }

        char d(int i15) {
            return this.f19870b[i15];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0513a) {
                C0513a c0513a = (C0513a) obj;
                if (this.f19877i == c0513a.f19877i && Arrays.equals(this.f19870b, c0513a.f19870b)) {
                    return true;
                }
            }
            return false;
        }

        C0513a g() {
            if (this.f19877i) {
                return this;
            }
            byte[] bArr = this.f19875g;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i15 = 65;
            while (true) {
                if (i15 > 90) {
                    return new C0513a(this.f19869a + ".ignoreCase()", this.f19870b, bArrCopyOf, true);
                }
                int i16 = i15 | 32;
                byte[] bArr2 = this.f19875g;
                byte b15 = bArr2[i15];
                byte b16 = bArr2[i16];
                if (b15 == -1) {
                    bArrCopyOf[i15] = b16;
                } else {
                    p.y(b16 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i15, (char) i16);
                    bArrCopyOf[i16] = b15;
                }
                i15++;
            }
        }

        boolean h(int i15) {
            return this.f19876h[i15 % this.f19873e];
        }

        public int hashCode() {
            return Arrays.hashCode(this.f19870b) + (this.f19877i ? 1231 : 1237);
        }

        C0513a i() {
            if (!f()) {
                return this;
            }
            p.x(!e(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f19870b.length];
            int i15 = 0;
            while (true) {
                char[] cArr2 = this.f19870b;
                if (i15 >= cArr2.length) {
                    break;
                }
                cArr[i15] = zj.c.e(cArr2[i15]);
                i15++;
            }
            C0513a c0513a = new C0513a(this.f19869a + ".lowerCase()", cArr);
            return this.f19877i ? c0513a.g() : c0513a;
        }

        public boolean j(char c15) {
            byte[] bArr = this.f19875g;
            return c15 < bArr.length && bArr[c15] != -1;
        }

        public String toString() {
            return this.f19869a;
        }

        private C0513a(String str, char[] cArr, byte[] bArr, boolean z15) {
            this.f19869a = (String) p.q(str);
            this.f19870b = (char[]) p.q(cArr);
            try {
                int iE = ck.c.e(cArr.length, RoundingMode.UNNECESSARY);
                this.f19872d = iE;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
                int i15 = 1 << (3 - iNumberOfTrailingZeros);
                this.f19873e = i15;
                this.f19874f = iE >> iNumberOfTrailingZeros;
                this.f19871c = cArr.length - 1;
                this.f19875g = bArr;
                boolean[] zArr = new boolean[i15];
                for (int i16 = 0; i16 < this.f19874f; i16++) {
                    zArr[ck.c.b(i16 * 8, this.f19872d, RoundingMode.CEILING)] = true;
                }
                this.f19876h = zArr;
                this.f19877i = z15;
            } catch (ArithmeticException e15) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e15);
            }
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final char[] f19878i;

        b(String str, String str2) {
            this(new C0513a(str, str2.toCharArray()));
        }

        @Override // bk.a.e, bk.a
        int e(byte[] bArr, CharSequence charSequence) throws d {
            p.q(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i15 = 0;
            int i16 = 0;
            while (i15 < charSequence.length()) {
                bArr[i16] = (byte) ((this.f19879f.c(charSequence.charAt(i15)) << 4) | this.f19879f.c(charSequence.charAt(i15 + 1)));
                i15 += 2;
                i16++;
            }
            return i16;
        }

        @Override // bk.a.e, bk.a
        void h(Appendable appendable, byte[] bArr, int i15, int i16) throws IOException {
            p.q(appendable);
            p.v(i15, i15 + i16, bArr.length);
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = bArr[i15 + i17] & 255;
                appendable.append(this.f19878i[i18]);
                appendable.append(this.f19878i[i18 | 256]);
            }
        }

        @Override // bk.a.e
        a p(C0513a c0513a, Character ch4) {
            return new b(c0513a);
        }

        private b(C0513a c0513a) {
            super(c0513a, null);
            this.f19878i = new char[512];
            p.d(c0513a.f19870b.length == 16);
            for (int i15 = 0; i15 < 256; i15++) {
                this.f19878i[i15] = c0513a.d(i15 >>> 4);
                this.f19878i[i15 | 256] = c0513a.d(i15 & 15);
            }
        }
    }

    private static final class c extends e {
        c(String str, String str2, Character ch4) {
            this(new C0513a(str, str2.toCharArray()), ch4);
        }

        @Override // bk.a.e, bk.a
        int e(byte[] bArr, CharSequence charSequence) throws d {
            p.q(bArr);
            CharSequence charSequenceN = n(charSequence);
            if (!this.f19879f.h(charSequenceN.length())) {
                throw new d("Invalid input length " + charSequenceN.length());
            }
            int i15 = 0;
            int i16 = 0;
            while (i15 < charSequenceN.length()) {
                int i17 = i15 + 2;
                int iC = (this.f19879f.c(charSequenceN.charAt(i15)) << 18) | (this.f19879f.c(charSequenceN.charAt(i15 + 1)) << 12);
                int i18 = i16 + 1;
                bArr[i16] = (byte) (iC >>> 16);
                if (i17 < charSequenceN.length()) {
                    int i19 = i15 + 3;
                    int iC2 = iC | (this.f19879f.c(charSequenceN.charAt(i17)) << 6);
                    int i25 = i16 + 2;
                    bArr[i18] = (byte) ((iC2 >>> 8) & GF2Field.MASK);
                    if (i19 < charSequenceN.length()) {
                        i15 += 4;
                        i16 += 3;
                        bArr[i25] = (byte) ((iC2 | this.f19879f.c(charSequenceN.charAt(i19))) & GF2Field.MASK);
                    } else {
                        i16 = i25;
                        i15 = i19;
                    }
                } else {
                    i16 = i18;
                    i15 = i17;
                }
            }
            return i16;
        }

        @Override // bk.a.e, bk.a
        void h(Appendable appendable, byte[] bArr, int i15, int i16) throws IOException {
            p.q(appendable);
            int i17 = i15 + i16;
            p.v(i15, i17, bArr.length);
            while (i16 >= 3) {
                int i18 = i15 + 2;
                int i19 = ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15] & 255) << 16);
                i15 += 3;
                int i25 = i19 | (bArr[i18] & 255);
                appendable.append(this.f19879f.d(i25 >>> 18));
                appendable.append(this.f19879f.d((i25 >>> 12) & 63));
                appendable.append(this.f19879f.d((i25 >>> 6) & 63));
                appendable.append(this.f19879f.d(i25 & 63));
                i16 -= 3;
            }
            if (i15 < i17) {
                o(appendable, bArr, i15, i17 - i15);
            }
        }

        @Override // bk.a.e
        a p(C0513a c0513a, Character ch4) {
            return new c(c0513a, ch4);
        }

        private c(C0513a c0513a, Character ch4) {
            super(c0513a, ch4);
            p.d(c0513a.f19870b.length == 64);
        }
    }

    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    private static class e extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C0513a f19879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f19880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile a f19881h;

        e(String str, String str2, Character ch4) {
            this(new C0513a(str, str2.toCharArray()), ch4);
        }

        @Override // bk.a
        int e(byte[] bArr, CharSequence charSequence) throws d {
            C0513a c0513a;
            p.q(bArr);
            CharSequence charSequenceN = n(charSequence);
            if (!this.f19879f.h(charSequenceN.length())) {
                throw new d("Invalid input length " + charSequenceN.length());
            }
            int i15 = 0;
            int i16 = 0;
            while (i15 < charSequenceN.length()) {
                long jC = 0;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    c0513a = this.f19879f;
                    if (i17 >= c0513a.f19873e) {
                        break;
                    }
                    jC <<= c0513a.f19872d;
                    if (i15 + i17 < charSequenceN.length()) {
                        jC |= (long) this.f19879f.c(charSequenceN.charAt(i18 + i15));
                        i18++;
                    }
                    i17++;
                }
                int i19 = c0513a.f19874f;
                int i25 = (i19 * 8) - (i18 * c0513a.f19872d);
                int i26 = (i19 - 1) * 8;
                while (i26 >= i25) {
                    bArr[i16] = (byte) ((jC >>> i26) & 255);
                    i26 -= 8;
                    i16++;
                }
                i15 += this.f19879f.f19873e;
            }
            return i16;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f19879f.equals(eVar.f19879f) && Objects.equals(this.f19880g, eVar.f19880g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // bk.a
        void h(Appendable appendable, byte[] bArr, int i15, int i16) throws IOException {
            p.q(appendable);
            p.v(i15, i15 + i16, bArr.length);
            int i17 = 0;
            while (i17 < i16) {
                o(appendable, bArr, i15 + i17, Math.min(this.f19879f.f19874f, i16 - i17));
                i17 += this.f19879f.f19874f;
            }
        }

        public int hashCode() {
            return this.f19879f.hashCode() ^ Objects.hashCode(this.f19880g);
        }

        @Override // bk.a
        public a j() {
            a aVarP = this.f19881h;
            if (aVarP == null) {
                C0513a c0513aI = this.f19879f.i();
                aVarP = c0513aI == this.f19879f ? this : p(c0513aI, this.f19880g);
                this.f19881h = aVarP;
            }
            return aVarP;
        }

        @Override // bk.a
        int k(int i15) {
            return (int) (((((long) this.f19879f.f19872d) * ((long) i15)) + 7) / 8);
        }

        @Override // bk.a
        int l(int i15) {
            C0513a c0513a = this.f19879f;
            return c0513a.f19873e * ck.c.b(i15, c0513a.f19874f, RoundingMode.CEILING);
        }

        @Override // bk.a
        public a m() {
            return this.f19880g == null ? this : p(this.f19879f, null);
        }

        @Override // bk.a
        CharSequence n(CharSequence charSequence) {
            p.q(charSequence);
            Character ch4 = this.f19880g;
            if (ch4 == null) {
                return charSequence;
            }
            char cCharValue = ch4.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void o(Appendable appendable, byte[] bArr, int i15, int i16) throws IOException {
            p.q(appendable);
            p.v(i15, i15 + i16, bArr.length);
            int i17 = 0;
            p.d(i16 <= this.f19879f.f19874f);
            long j15 = 0;
            for (int i18 = 0; i18 < i16; i18++) {
                j15 = (j15 | ((long) (bArr[i15 + i18] & 255))) << 8;
            }
            int i19 = ((i16 + 1) * 8) - this.f19879f.f19872d;
            while (i17 < i16 * 8) {
                C0513a c0513a = this.f19879f;
                appendable.append(c0513a.d(((int) (j15 >>> (i19 - i17))) & c0513a.f19871c));
                i17 += this.f19879f.f19872d;
            }
            if (this.f19880g != null) {
                while (i17 < this.f19879f.f19874f * 8) {
                    appendable.append(this.f19880g.charValue());
                    i17 += this.f19879f.f19872d;
                }
            }
        }

        a p(C0513a c0513a, Character ch4) {
            return new e(c0513a, ch4);
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder("BaseEncoding.");
            sb5.append(this.f19879f);
            if (8 % this.f19879f.f19872d != 0) {
                if (this.f19880g == null) {
                    sb5.append(".omitPadding()");
                } else {
                    sb5.append(".withPadChar('");
                    sb5.append(this.f19880g);
                    sb5.append("')");
                }
            }
            return sb5.toString();
        }

        e(C0513a c0513a, Character ch4) {
            this.f19879f = (C0513a) p.q(c0513a);
            p.l(ch4 == null || !c0513a.j(ch4.charValue()), "Padding character %s was already in alphabet", ch4);
            this.f19880g = ch4;
        }
    }

    a() {
    }

    public static a a() {
        return f19868e;
    }

    public static a b() {
        return f19864a;
    }

    private static byte[] i(byte[] bArr, int i15) {
        if (i15 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        return bArr2;
    }

    public final byte[] c(CharSequence charSequence) {
        try {
            return d(charSequence);
        } catch (d e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    final byte[] d(CharSequence charSequence) {
        CharSequence charSequenceN = n(charSequence);
        byte[] bArr = new byte[k(charSequenceN.length())];
        return i(bArr, e(bArr, charSequenceN));
    }

    abstract int e(byte[] bArr, CharSequence charSequence);

    public String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public final String g(byte[] bArr, int i15, int i16) {
        p.v(i15, i15 + i16, bArr.length);
        StringBuilder sb5 = new StringBuilder(l(i16));
        try {
            h(sb5, bArr, i15, i16);
            return sb5.toString();
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }

    abstract void h(Appendable appendable, byte[] bArr, int i15, int i16);

    public abstract a j();

    abstract int k(int i15);

    abstract int l(int i15);

    public abstract a m();

    abstract CharSequence n(CharSequence charSequence);
}
