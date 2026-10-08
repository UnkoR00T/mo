package w7;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f210615d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f210616e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ak.u0<Charset> f210617f = ak.u0.M(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f210618g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f210619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f210620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210621c;

    public c0() {
        this.f210619a = o0.f210729f;
    }

    private static int c(int i15, int i16, int i17, int i18) {
        byte b15 = (byte) i17;
        return ek.g.i((byte) 0, ek.j.a(((i15 & 7) << 2) | ((i16 & 48) >> 4)), ek.j.a(((((byte) i16) & 15) << 4) | ((b15 & 60) >> 2)), ek.j.a(((b15 & 3) << 6) | (((byte) i18) & 63)));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int e(Charset charset) {
        int i15;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i15 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i15 = 2;
        }
        int i16 = this.f210620b;
        while (true) {
            int i17 = this.f210621c;
            if (i16 >= i17 - (i15 - 1)) {
                return i17;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !o0.A0(this.f210619a[i16])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.f210619a;
                    if (bArr2[i16] != 0 || !o0.A0(bArr2[i16 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.f210619a;
                            if (bArr[i16 + 1] != 0 || !o0.A0(bArr[i16])) {
                            }
                        }
                        i16 += i15;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.f210619a;
                        if (bArr[i16 + 1] != 0) {
                            continue;
                        }
                    }
                    i16 += i15;
                }
            }
            return i16;
        }
    }

    private static int h(Charset charset) {
        zj.p.l(f210617f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean i(byte b15) {
        return (b15 & 192) == 128;
    }

    private void i0(Charset charset) {
        if (v(charset, f210615d) == '\r') {
            v(charset, f210616e);
        }
    }

    private void k(int i15) {
        if (!f210618g.get() || a() >= i15) {
            return;
        }
        throw new IndexOutOfBoundsException("bytesNeeded= " + i15 + ", bytesLeft=" + a());
    }

    private char m(ByteOrder byteOrder, int i15) {
        k(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f210619a;
            int i16 = this.f210620b;
            return ek.c.c(bArr[i16 + i15], bArr[i16 + i15 + 1]);
        }
        byte[] bArr2 = this.f210619a;
        int i17 = this.f210620b;
        return ek.c.c(bArr2[i17 + i15 + 1], bArr2[i17 + i15]);
    }

    private int o(Charset charset) {
        int codePoint;
        int iB;
        zj.p.l(f210617f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f210620b + ", limit=" + this.f210621c);
        }
        byte b15 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b16 = this.f210619a[this.f210620b];
            if ((b16 & 128) != 0) {
                return 0;
            }
            codePoint = ek.j.b(b16);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bS = s();
            if (bS == 1) {
                iB = ek.j.b(this.f210619a[this.f210620b]);
            } else if (bS == 2) {
                byte[] bArr = this.f210619a;
                int i15 = this.f210620b;
                iB = c(0, 0, bArr[i15], bArr[i15 + 1]);
            } else if (bS == 3) {
                byte[] bArr2 = this.f210619a;
                int i16 = this.f210620b;
                iB = c(0, bArr2[i16] & 15, bArr2[i16 + 1], bArr2[i16 + 2]);
            } else {
                if (bS != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f210619a;
                int i17 = this.f210620b;
                iB = c(bArr3[i17], bArr3[i17 + 1], bArr3[i17 + 2], bArr3[i17 + 3]);
            }
            b15 = bS;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM = m(byteOrder, 0);
            if (!Character.isHighSurrogate(cM) || a() < 4) {
                codePoint = cM;
                b15 = 2;
            } else {
                codePoint = Character.toCodePoint(cM, m(byteOrder, 2));
                b15 = 4;
            }
        }
        return (codePoint << 8) | b15;
    }

    private byte s() {
        byte b15 = this.f210619a[this.f210620b];
        if ((b15 & 128) == 0) {
            return (byte) 1;
        }
        if ((b15 & 224) == 192 && a() >= 2 && i(this.f210619a[this.f210620b + 1])) {
            return (byte) 2;
        }
        if ((this.f210619a[this.f210620b] & 240) == 224 && a() >= 3 && i(this.f210619a[this.f210620b + 1]) && i(this.f210619a[this.f210620b + 2])) {
            return (byte) 3;
        }
        return ((this.f210619a[this.f210620b] & 248) == 240 && a() >= 4 && i(this.f210619a[this.f210620b + 1]) && i(this.f210619a[this.f210620b + 2]) && i(this.f210619a[this.f210620b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char v(Charset charset, char[] cArr) {
        int iO;
        if (a() < h(charset) || (iO = o(charset)) == 0) {
            return (char) 0;
        }
        int iA = ek.k.a(iO >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = ek.c.a(iA);
        if (!ek.c.b(cArr, cA)) {
            return (char) 0;
        }
        this.f210620b += ek.g.e(iO & GF2Field.MASK);
        return cA;
    }

    public int A() {
        k(3);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = ((bArr[i15] & 255) << 24) >> 8;
        int i18 = i15 + 2;
        this.f210620b = i18;
        int i19 = ((bArr[i16] & 255) << 8) | i17;
        this.f210620b = i15 + 3;
        return (bArr[i18] & 255) | i19;
    }

    public String B() {
        return C(StandardCharsets.UTF_8);
    }

    public String C(Charset charset) {
        zj.p.l(f210617f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            a0();
        }
        String strO = O(e(charset) - this.f210620b, charset);
        if (this.f210620b == this.f210621c) {
            return strO;
        }
        i0(charset);
        return strO;
    }

    public int D() {
        k(4);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = bArr[i15] & 255;
        int i18 = i15 + 2;
        this.f210620b = i18;
        int i19 = ((bArr[i16] & 255) << 8) | i17;
        int i25 = i15 + 3;
        this.f210620b = i25;
        int i26 = i19 | ((bArr[i18] & 255) << 16);
        this.f210620b = i15 + 4;
        return ((bArr[i25] & 255) << 24) | i26;
    }

    public long E() {
        k(8);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        long j15 = ((long) bArr[i15]) & 255;
        int i17 = i15 + 2;
        this.f210620b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        int i18 = i15 + 3;
        this.f210620b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 16);
        int i19 = i15 + 4;
        this.f210620b = i19;
        long j18 = j17 | ((((long) bArr[i18]) & 255) << 24);
        int i25 = i15 + 5;
        this.f210620b = i25;
        long j19 = j18 | ((((long) bArr[i19]) & 255) << 32);
        int i26 = i15 + 6;
        this.f210620b = i26;
        long j25 = j19 | ((((long) bArr[i25]) & 255) << 40);
        int i27 = i15 + 7;
        this.f210620b = i27;
        long j26 = j25 | ((((long) bArr[i26]) & 255) << 48);
        this.f210620b = i15 + 8;
        return ((((long) bArr[i27]) & 255) << 56) | j26;
    }

    public short F() {
        k(2);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = bArr[i15] & 255;
        this.f210620b = i15 + 2;
        return (short) (((bArr[i16] & 255) << 8) | i17);
    }

    public long G() {
        k(4);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        long j15 = ((long) bArr[i15]) & 255;
        int i17 = i15 + 2;
        this.f210620b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        int i18 = i15 + 3;
        this.f210620b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 16);
        this.f210620b = i15 + 4;
        return ((((long) bArr[i18]) & 255) << 24) | j17;
    }

    public int H() {
        int iD = D();
        if (iD >= 0) {
            return iD;
        }
        throw new IllegalStateException("Top bit not zero: " + iD);
    }

    public int I() {
        k(2);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = bArr[i15] & 255;
        this.f210620b = i15 + 2;
        return ((bArr[i16] & 255) << 8) | i17;
    }

    public long J() {
        k(8);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        long j15 = (((long) bArr[i15]) & 255) << 56;
        int i17 = i15 + 2;
        this.f210620b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        int i18 = i15 + 3;
        this.f210620b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 40);
        int i19 = i15 + 4;
        this.f210620b = i19;
        long j18 = j17 | ((((long) bArr[i18]) & 255) << 32);
        int i25 = i15 + 5;
        this.f210620b = i25;
        long j19 = j18 | ((((long) bArr[i19]) & 255) << 24);
        int i26 = i15 + 6;
        this.f210620b = i26;
        long j25 = j19 | ((((long) bArr[i25]) & 255) << 16);
        int i27 = i15 + 7;
        this.f210620b = i27;
        long j26 = j25 | ((((long) bArr[i26]) & 255) << 8);
        this.f210620b = i15 + 8;
        return (((long) bArr[i27]) & 255) | j26;
    }

    public String K() {
        return w((char) 0);
    }

    public String L(int i15) {
        k(i15);
        if (i15 == 0) {
            return "";
        }
        int i16 = this.f210620b;
        int i17 = (i16 + i15) - 1;
        String strH = o0.H(this.f210619a, i16, (i17 >= this.f210621c || this.f210619a[i17] != 0) ? i15 : i15 - 1);
        this.f210620b += i15;
        return strH;
    }

    public short M() {
        k(2);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = (bArr[i15] & 255) << 8;
        this.f210620b = i15 + 2;
        return (short) ((bArr[i16] & 255) | i17);
    }

    public String N(int i15) {
        return O(i15, StandardCharsets.UTF_8);
    }

    public String O(int i15, Charset charset) {
        k(i15);
        String str = new String(this.f210619a, this.f210620b, i15, charset);
        this.f210620b += i15;
        return str;
    }

    public int P() {
        return (Q() << 21) | (Q() << 14) | (Q() << 7) | Q();
    }

    public int Q() {
        k(1);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        this.f210620b = i15 + 1;
        return bArr[i15] & 255;
    }

    public int R() {
        k(4);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = (bArr[i15] & 255) << 8;
        this.f210620b = i15 + 2;
        int i18 = (bArr[i16] & 255) | i17;
        this.f210620b = i15 + 4;
        return i18;
    }

    public long S() {
        k(4);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        long j15 = (((long) bArr[i15]) & 255) << 24;
        int i17 = i15 + 2;
        this.f210620b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i15 + 3;
        this.f210620b = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 8);
        this.f210620b = i15 + 4;
        return (((long) bArr[i18]) & 255) | j17;
    }

    public int T() {
        k(3);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = (bArr[i15] & 255) << 16;
        int i18 = i15 + 2;
        this.f210620b = i18;
        int i19 = ((bArr[i16] & 255) << 8) | i17;
        this.f210620b = i15 + 3;
        return (bArr[i18] & 255) | i19;
    }

    public int U() {
        int iZ = z();
        if (iZ >= 0) {
            return iZ;
        }
        throw new IllegalStateException("Top bit not zero: " + iZ);
    }

    public int V() {
        return ek.g.e(W());
    }

    public long W() {
        long j15 = 0;
        for (int i15 = 0; i15 < 9; i15++) {
            if (this.f210620b == this.f210621c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jQ = Q();
            j15 |= (127 & jQ) << (i15 * 7);
            if ((jQ & 128) == 0) {
                return j15;
            }
        }
        return j15;
    }

    public long X() {
        long J = J();
        if (J >= 0) {
            return J;
        }
        throw new IllegalStateException("Top bit not zero: " + J);
    }

    public int Y() {
        k(2);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = (bArr[i15] & 255) << 8;
        this.f210620b = i15 + 2;
        return (bArr[i16] & 255) | i17;
    }

    public long Z() {
        int i15;
        k(1);
        long j15 = this.f210619a[this.f210620b];
        int i16 = 7;
        while (true) {
            if (i16 >= 0) {
                int i17 = 1 << i16;
                if ((((long) i17) & j15) == 0) {
                    if (i16 < 6) {
                        j15 &= (long) (i17 - 1);
                        i15 = 7 - i16;
                        break;
                    }
                    if (i16 == 7) {
                        i15 = 1;
                        break;
                    }
                } else {
                    i16--;
                }
            }
            i15 = 0;
            break;
        }
        if (i15 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j15);
        }
        k(i15);
        for (int i18 = 1; i18 < i15; i18++) {
            byte b15 = this.f210619a[this.f210620b + i18];
            if ((b15 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j15);
            }
            j15 = (j15 << 6) | ((long) (b15 & 63));
        }
        this.f210620b += i15;
        return j15;
    }

    public int a() {
        return Math.max(this.f210621c - this.f210620b, 0);
    }

    public Charset a0() {
        if (a() >= 3) {
            byte[] bArr = this.f210619a;
            int i15 = this.f210620b;
            if (bArr[i15] == -17 && bArr[i15 + 1] == -69 && bArr[i15 + 2] == -65) {
                this.f210620b = i15 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f210619a;
        int i16 = this.f210620b;
        byte b15 = bArr2[i16];
        if (b15 == -2 && bArr2[i16 + 1] == -1) {
            this.f210620b = i16 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b15 != -1 || bArr2[i16 + 1] != -2) {
            return null;
        }
        this.f210620b = i16 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public int b() {
        return this.f210619a.length;
    }

    public void b0(int i15) {
        d0(b() < i15 ? new byte[i15] : this.f210619a, i15);
    }

    public void c0(byte[] bArr) {
        d0(bArr, bArr.length);
    }

    public void d(int i15) {
        if (i15 > b()) {
            this.f210619a = Arrays.copyOf(this.f210619a, i15);
        }
    }

    public void d0(byte[] bArr, int i15) {
        this.f210619a = bArr;
        this.f210621c = i15;
        this.f210620b = 0;
    }

    public void e0(int i15) {
        zj.p.d(i15 >= 0 && i15 <= this.f210619a.length);
        this.f210621c = i15;
    }

    public byte[] f() {
        return this.f210619a;
    }

    public void f0(int i15) {
        zj.p.d(i15 >= 0 && i15 <= this.f210621c);
        this.f210620b = i15;
    }

    public int g() {
        return this.f210620b;
    }

    public void g0(int i15) {
        f0(this.f210620b + i15);
    }

    public void h0() {
        while ((Q() & 128) != 0) {
        }
    }

    public int j() {
        return this.f210621c;
    }

    public char l() {
        return m(ByteOrder.BIG_ENDIAN, 0);
    }

    public int n(Charset charset) {
        int iO = o(charset);
        if (iO != 0) {
            return ek.g.e(iO >>> 8);
        }
        return 1114112;
    }

    public int p() {
        if (a() >= 4) {
            int iZ = z();
            this.f210620b -= 4;
            return iZ;
        }
        throw new IndexOutOfBoundsException("position=" + this.f210620b + ", limit=" + this.f210621c);
    }

    public int q() {
        k(1);
        return this.f210619a[this.f210620b] & 255;
    }

    public int r() {
        if (a() >= 3) {
            int iT = T();
            this.f210620b -= 3;
            return iT;
        }
        throw new IndexOutOfBoundsException("position=" + this.f210620b + ", limit=" + this.f210621c);
    }

    public void t(b0 b0Var, int i15) {
        u(b0Var.f210609a, 0, i15);
        b0Var.p(0);
    }

    public void u(byte[] bArr, int i15, int i16) {
        k(i16);
        System.arraycopy(this.f210619a, this.f210620b, bArr, i15, i16);
        this.f210620b += i16;
    }

    public String w(char c15) {
        if (a() == 0) {
            return null;
        }
        int i15 = this.f210620b;
        while (i15 < this.f210621c && this.f210619a[i15] != c15) {
            i15++;
        }
        byte[] bArr = this.f210619a;
        int i16 = this.f210620b;
        String strH = o0.H(bArr, i16, i15 - i16);
        this.f210620b = i15;
        if (i15 < this.f210621c) {
            this.f210620b = i15 + 1;
        }
        return strH;
    }

    public double x() {
        return Double.longBitsToDouble(J());
    }

    public float y() {
        return Float.intBitsToFloat(z());
    }

    public int z() {
        k(4);
        byte[] bArr = this.f210619a;
        int i15 = this.f210620b;
        int i16 = i15 + 1;
        this.f210620b = i16;
        int i17 = (bArr[i15] & 255) << 24;
        int i18 = i15 + 2;
        this.f210620b = i18;
        int i19 = ((bArr[i16] & 255) << 16) | i17;
        int i25 = i15 + 3;
        this.f210620b = i25;
        int i26 = i19 | ((bArr[i18] & 255) << 8);
        this.f210620b = i15 + 4;
        return (bArr[i25] & 255) | i26;
    }

    public c0(int i15) {
        this.f210619a = new byte[i15];
        this.f210621c = i15;
    }

    public c0(byte[] bArr) {
        this.f210619a = bArr;
        this.f210621c = bArr.length;
    }

    public c0(byte[] bArr, int i15) {
        this.f210619a = bArr;
        this.f210621c = i15;
    }
}
