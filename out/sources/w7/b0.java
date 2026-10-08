package w7;

import java.nio.charset.Charset;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f210609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f210610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f210612d;

    public b0() {
        this.f210609a = o0.f210729f;
    }

    private void a() {
        int i15;
        int i16 = this.f210610b;
        zj.p.w(i16 >= 0 && (i16 < (i15 = this.f210612d) || (i16 == i15 && this.f210611c == 0)));
    }

    public int b() {
        return ((this.f210612d - this.f210610b) * 8) - this.f210611c;
    }

    public void c() {
        if (this.f210611c == 0) {
            return;
        }
        this.f210611c = 0;
        this.f210610b++;
        a();
    }

    public int d() {
        zj.p.w(this.f210611c == 0);
        return this.f210610b;
    }

    public int e() {
        return (this.f210610b * 8) + this.f210611c;
    }

    public void f(int i15, int i16) {
        if (i16 < 32) {
            i15 &= (1 << i16) - 1;
        }
        int iMin = Math.min(8 - this.f210611c, i16);
        int i17 = this.f210611c;
        int i18 = (8 - i17) - iMin;
        byte[] bArr = this.f210609a;
        int i19 = this.f210610b;
        byte b15 = (byte) (((65280 >> i17) | ((1 << i18) - 1)) & bArr[i19]);
        bArr[i19] = b15;
        int i25 = i16 - iMin;
        bArr[i19] = (byte) (b15 | ((i15 >>> i25) << i18));
        int i26 = i19 + 1;
        while (i25 > 8) {
            this.f210609a[i26] = (byte) (i15 >>> (i25 - 8));
            i25 -= 8;
            i26++;
        }
        int i27 = 8 - i25;
        byte[] bArr2 = this.f210609a;
        byte b16 = (byte) (bArr2[i26] & ((1 << i27) - 1));
        bArr2[i26] = b16;
        bArr2[i26] = (byte) (((i15 & ((1 << i25) - 1)) << i27) | b16);
        r(i16);
        a();
    }

    public boolean g() {
        boolean z15 = (this.f210609a[this.f210610b] & (128 >> this.f210611c)) != 0;
        q();
        return z15;
    }

    public int h(int i15) {
        int i16;
        if (i15 == 0) {
            return 0;
        }
        this.f210611c += i15;
        int i17 = 0;
        while (true) {
            i16 = this.f210611c;
            if (i16 <= 8) {
                break;
            }
            int i18 = i16 - 8;
            this.f210611c = i18;
            byte[] bArr = this.f210609a;
            int i19 = this.f210610b;
            this.f210610b = i19 + 1;
            i17 |= (bArr[i19] & 255) << i18;
        }
        byte[] bArr2 = this.f210609a;
        int i25 = this.f210610b;
        int i26 = ((-1) >>> (32 - i15)) & (i17 | ((bArr2[i25] & 255) >> (8 - i16)));
        if (i16 == 8) {
            this.f210611c = 0;
            this.f210610b = i25 + 1;
        }
        a();
        return i26;
    }

    public void i(byte[] bArr, int i15, int i16) {
        int i17 = (i16 >> 3) + i15;
        while (i15 < i17) {
            byte[] bArr2 = this.f210609a;
            int i18 = this.f210610b;
            int i19 = i18 + 1;
            this.f210610b = i19;
            byte b15 = bArr2[i18];
            int i25 = this.f210611c;
            byte b16 = (byte) (b15 << i25);
            bArr[i15] = b16;
            bArr[i15] = (byte) (((255 & bArr2[i19]) >> (8 - i25)) | b16);
            i15++;
        }
        int i26 = i16 & 7;
        if (i26 == 0) {
            return;
        }
        byte b17 = (byte) (bArr[i17] & (GF2Field.MASK >> i26));
        bArr[i17] = b17;
        int i27 = this.f210611c;
        if (i27 + i26 > 8) {
            byte[] bArr3 = this.f210609a;
            int i28 = this.f210610b;
            this.f210610b = i28 + 1;
            bArr[i17] = (byte) (b17 | ((bArr3[i28] & 255) << i27));
            this.f210611c = i27 - 8;
        }
        int i29 = this.f210611c + i26;
        this.f210611c = i29;
        byte[] bArr4 = this.f210609a;
        int i35 = this.f210610b;
        bArr[i17] = (byte) (((byte) (((255 & bArr4[i35]) >> (8 - i29)) << (8 - i26))) | bArr[i17]);
        if (i29 == 8) {
            this.f210611c = 0;
            this.f210610b = i35 + 1;
        }
        a();
    }

    public long j(int i15) {
        return i15 <= 32 ? o0.f1(h(i15)) : o0.e1(h(i15 - 32), h(32));
    }

    public void k(byte[] bArr, int i15, int i16) {
        zj.p.w(this.f210611c == 0);
        System.arraycopy(this.f210609a, this.f210610b, bArr, i15, i16);
        this.f210610b += i16;
        a();
    }

    public String l(int i15, Charset charset) {
        byte[] bArr = new byte[i15];
        k(bArr, 0, i15);
        return new String(bArr, charset);
    }

    public void m(c0 c0Var) {
        o(c0Var.f(), c0Var.j());
        p(c0Var.g() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i15) {
        this.f210609a = bArr;
        this.f210610b = 0;
        this.f210611c = 0;
        this.f210612d = i15;
    }

    public void p(int i15) {
        int i16 = i15 / 8;
        this.f210610b = i16;
        this.f210611c = i15 - (i16 * 8);
        a();
    }

    public void q() {
        int i15 = this.f210611c + 1;
        this.f210611c = i15;
        if (i15 == 8) {
            this.f210611c = 0;
            this.f210610b++;
        }
        a();
    }

    public void r(int i15) {
        int i16 = i15 / 8;
        int i17 = this.f210610b + i16;
        this.f210610b = i17;
        int i18 = this.f210611c + (i15 - (i16 * 8));
        this.f210611c = i18;
        if (i18 > 7) {
            this.f210610b = i17 + 1;
            this.f210611c = i18 - 8;
        }
        a();
    }

    public void s(int i15) {
        zj.p.w(this.f210611c == 0);
        this.f210610b += i15;
        a();
    }

    public b0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public b0(byte[] bArr, int i15) {
        this.f210609a = bArr;
        this.f210612d = i15;
    }
}
