package c8;

import java.nio.ByteBuffer;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends u7.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f24182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f24183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f24184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f24185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f24186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f24187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f24190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f24192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f24194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f24195v;

    public d1() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(ByteBuffer byteBuffer) {
        o(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void B(byte[] bArr, int i15, int i16) {
        zj.p.h(i15 % this.f24187n == 0, "byteOutput size is not aligned to frame size %s", i15);
        z(bArr, i15, i16);
        o(i15).put(bArr, 0, i15).flip();
    }

    private void C(boolean z15) {
        int length;
        int iT;
        int i15 = this.f24194u;
        byte[] bArr = this.f24192s;
        if (i15 == bArr.length || z15) {
            if (this.f24191r == 0) {
                if (z15) {
                    D(i15, 3);
                    length = i15;
                } else {
                    zj.p.w(i15 >= bArr.length / 2);
                    length = this.f24192s.length / 2;
                    D(length, 0);
                }
                iT = length;
            } else if (z15) {
                int length2 = i15 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iT2 = t(length2) + (this.f24192s.length / 2);
                D(iT2, 2);
                iT = iT2;
                length = length3;
            } else {
                length = i15 - (bArr.length / 2);
                iT = t(length);
                D(iT, 1);
            }
            zj.p.z(length % this.f24187n == 0, "bytesConsumed is not aligned to frame size: %s", length);
            zj.p.w(i15 >= iT);
            this.f24194u -= length;
            int i16 = this.f24193t + length;
            this.f24193t = i16;
            this.f24193t = i16 % this.f24192s.length;
            int i17 = this.f24191r;
            int i18 = this.f24187n;
            this.f24191r = i17 + (iT / i18);
            this.f24190q += (long) ((length - iT) / i18);
        }
    }

    private void D(int i15, int i16) {
        if (i15 == 0) {
            return;
        }
        zj.p.d(this.f24194u >= i15);
        if (i16 == 2) {
            int i17 = this.f24193t;
            int i18 = this.f24194u;
            int i19 = i17 + i18;
            byte[] bArr = this.f24192s;
            if (i19 <= bArr.length) {
                System.arraycopy(bArr, (i17 + i18) - i15, this.f24195v, 0, i15);
            } else {
                int length = i18 - (bArr.length - i17);
                if (length >= i15) {
                    System.arraycopy(bArr, length - i15, this.f24195v, 0, i15);
                } else {
                    int i25 = i15 - length;
                    System.arraycopy(bArr, bArr.length - i25, this.f24195v, 0, i25);
                    System.arraycopy(this.f24192s, 0, this.f24195v, i25, length);
                }
            }
        } else {
            int i26 = this.f24193t;
            int i27 = i26 + i15;
            byte[] bArr2 = this.f24192s;
            if (i27 <= bArr2.length) {
                System.arraycopy(bArr2, i26, this.f24195v, 0, i15);
            } else {
                int length2 = bArr2.length - i26;
                System.arraycopy(bArr2, i26, this.f24195v, 0, length2);
                System.arraycopy(this.f24192s, 0, this.f24195v, length2, i15 - length2);
            }
        }
        zj.p.h(i15 % this.f24187n == 0, "sizeToOutput is not aligned to frame size: %s", i15);
        zj.p.w(this.f24193t < this.f24192s.length);
        B(this.f24195v, i15, i16);
    }

    private void E(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f24192s.length));
        int iV = v(byteBuffer);
        if (iV == byteBuffer.position()) {
            this.f24189p = 1;
        } else {
            byteBuffer.limit(Math.min(iV, byteBuffer.capacity()));
            A(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void F(byte[] bArr, int i15, int i16) {
        if (i16 >= 32767) {
            bArr[i15] = -1;
            bArr[i15 + 1] = 127;
        } else if (i16 <= -32768) {
            bArr[i15] = 0;
            bArr[i15 + 1] = -128;
        } else {
            bArr[i15] = (byte) (i16 & GF2Field.MASK);
            bArr[i15 + 1] = (byte) (i16 >> 8);
        }
    }

    private void H(ByteBuffer byteBuffer) {
        int length;
        int i15;
        zj.p.w(this.f24193t < this.f24192s.length);
        int iLimit = byteBuffer.limit();
        int iW = w(byteBuffer);
        int iPosition = iW - byteBuffer.position();
        int i16 = this.f24193t;
        int i17 = this.f24194u;
        int i18 = i16 + i17;
        byte[] bArr = this.f24192s;
        if (i18 < bArr.length) {
            length = bArr.length - (i17 + i16);
            i15 = i16 + i17;
        } else {
            int length2 = i17 - (bArr.length - i16);
            length = i16 - length2;
            i15 = length2;
        }
        boolean z15 = iW < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f24192s, i15, iMin);
        int i19 = this.f24194u + iMin;
        this.f24194u = i19;
        zj.p.w(i19 <= this.f24192s.length);
        boolean z16 = z15 && iPosition < length;
        C(z16);
        if (z16) {
            this.f24189p = 0;
            this.f24191r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int I(byte b15, byte b16) {
        return (b15 << 8) | (b16 & 255);
    }

    private int p(float f15) {
        return q((int) f15);
    }

    private int q(int i15) {
        int i16 = this.f24187n;
        return (i15 / i16) * i16;
    }

    private int r(int i15, int i16) {
        int i17 = this.f24184k;
        return i17 + ((((100 - i17) * (i15 * 1000)) / i16) / 1000);
    }

    private int s(int i15, int i16) {
        return (((this.f24184k - 100) * ((i15 * 1000) / i16)) / 1000) + 100;
    }

    private int t(int i15) {
        int iU = ((u(this.f24186m) - this.f24191r) * this.f24187n) - (this.f24192s.length / 2);
        zj.p.w(iU >= 0);
        return p(Math.min((i15 * this.f24182i) + 0.5f, iU));
    }

    private int u(long j15) {
        return (int) ((j15 * ((long) this.f195971b.f195964a)) / 1000000);
    }

    private int v(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (y(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i15 = this.f24187n;
                return ((iLimit / i15) * i15) + i15;
            }
        }
        return byteBuffer.position();
    }

    private int w(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (y(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i15 = this.f24187n;
                return i15 * (iPosition / i15);
            }
        }
        return byteBuffer.limit();
    }

    private boolean y(byte b15, byte b16) {
        return Math.abs(I(b15, b16)) > this.f24183j;
    }

    private void z(byte[] bArr, int i15, int i16) {
        if (i16 == 3) {
            return;
        }
        for (int i17 = 0; i17 < i15; i17 += 2) {
            F(bArr, i17, (I(bArr[i17 + 1], bArr[i17]) * (i16 == 0 ? s(i17, i15 - 1) : i16 == 2 ? r(i17, i15 - 1) : this.f24184k)) / 100);
        }
    }

    public void G(boolean z15) {
        this.f24188o = z15;
    }

    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !i()) {
            int i15 = this.f24189p;
            if (i15 == 0) {
                E(byteBuffer);
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException();
                }
                H(byteBuffer);
            }
        }
    }

    @Override // u7.n, u7.l
    public boolean h() {
        return super.h() && this.f24188o;
    }

    @Override // u7.n
    protected u7.l.a j(u7.l.a aVar) throws u7.l.c {
        if (aVar.f195966c == 2) {
            return aVar.f195964a == -1 ? u7.l.a.f195963e : aVar;
        }
        throw new u7.l.c(aVar);
    }

    @Override // u7.n
    public void l(u7.l.b bVar) {
        if (h()) {
            this.f24187n = this.f195971b.f195965b * 2;
            int iQ = q(u(this.f24185l) / 2) * 2;
            if (this.f24192s.length != iQ) {
                this.f24192s = new byte[iQ];
                this.f24195v = new byte[iQ];
            }
        }
        this.f24189p = 0;
        this.f24190q = 0L;
        this.f24191r = 0;
        this.f24193t = 0;
        this.f24194u = 0;
    }

    @Override // u7.n
    public void m() {
        if (this.f24194u > 0) {
            C(true);
            this.f24191r = 0;
        }
    }

    @Override // u7.n
    public void n() {
        this.f24188o = false;
        byte[] bArr = w7.o0.f210729f;
        this.f24192s = bArr;
        this.f24195v = bArr;
    }

    public long x() {
        return this.f24190q;
    }

    public d1(long j15, float f15, long j16, int i15, short s15) {
        boolean z15 = false;
        this.f24191r = 0;
        this.f24193t = 0;
        this.f24194u = 0;
        if (f15 >= 0.0f && f15 <= 1.0f) {
            z15 = true;
        }
        zj.p.d(z15);
        this.f24185l = j15;
        this.f24182i = f15;
        this.f24186m = j16;
        this.f24184k = i15;
        this.f24183j = s15;
        byte[] bArr = w7.o0.f210729f;
        this.f24192s = bArr;
        this.f24195v = bArr;
    }
}
