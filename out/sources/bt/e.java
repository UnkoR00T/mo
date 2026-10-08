package bt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f21400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21407m;

    private e(InputStream inputStream) {
        this.f21402h = false;
        this.f21404j = Integer.MAX_VALUE;
        this.f21406l = 64;
        this.f21407m = 67108864;
        this.f21395a = new byte[PKIFailureInfo.certConfirmed];
        this.f21397c = 0;
        this.f21399e = 0;
        this.f21403i = 0;
        this.f21400f = inputStream;
        this.f21396b = false;
    }

    public static int B(int i15, InputStream inputStream) throws IOException {
        if ((i15 & 128) == 0) {
            return i15;
        }
        int i16 = i15 & CertificateBody.profileType;
        int i17 = 7;
        while (i17 < 32) {
            int i18 = inputStream.read();
            if (i18 == -1) {
                throw k.k();
            }
            i16 |= (i18 & CertificateBody.profileType) << i17;
            if ((i18 & 128) == 0) {
                return i16;
            }
            i17 += 7;
        }
        while (i17 < 64) {
            int i19 = inputStream.read();
            if (i19 == -1) {
                throw k.k();
            }
            if ((i19 & 128) == 0) {
                return i16;
            }
            i17 += 7;
        }
        throw k.f();
    }

    private void N() {
        int i15 = this.f21397c + this.f21398d;
        this.f21397c = i15;
        int i16 = this.f21403i + i15;
        int i17 = this.f21404j;
        if (i16 <= i17) {
            this.f21398d = 0;
            return;
        }
        int i18 = i16 - i17;
        this.f21398d = i18;
        this.f21397c = i15 - i18;
    }

    private void O(int i15) throws k {
        if (!T(i15)) {
            throw k.k();
        }
    }

    private void S(int i15) throws k {
        if (i15 < 0) {
            throw k.g();
        }
        int i16 = this.f21403i;
        int i17 = this.f21399e;
        int i18 = i16 + i17 + i15;
        int i19 = this.f21404j;
        if (i18 > i19) {
            R((i19 - i16) - i17);
            throw k.k();
        }
        int i25 = this.f21397c;
        int i26 = i25 - i17;
        this.f21399e = i25;
        O(1);
        while (true) {
            int i27 = i15 - i26;
            int i28 = this.f21397c;
            if (i27 <= i28) {
                this.f21399e = i27;
                return;
            } else {
                i26 += i28;
                this.f21399e = i28;
                O(1);
            }
        }
    }

    private boolean T(int i15) throws IOException {
        int i16 = this.f21399e;
        int i17 = i16 + i15;
        int i18 = this.f21397c;
        if (i17 <= i18) {
            StringBuilder sb5 = new StringBuilder(77);
            sb5.append("refillBuffer() called when ");
            sb5.append(i15);
            sb5.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb5.toString());
        }
        if (this.f21403i + i16 + i15 <= this.f21404j && this.f21400f != null) {
            if (i16 > 0) {
                if (i18 > i16) {
                    byte[] bArr = this.f21395a;
                    System.arraycopy(bArr, i16, bArr, 0, i18 - i16);
                }
                this.f21403i += i16;
                this.f21397c -= i16;
                this.f21399e = 0;
            }
            InputStream inputStream = this.f21400f;
            byte[] bArr2 = this.f21395a;
            int i19 = this.f21397c;
            int i25 = inputStream.read(bArr2, i19, bArr2.length - i19);
            if (i25 == 0 || i25 < -1 || i25 > this.f21395a.length) {
                StringBuilder sb6 = new StringBuilder(102);
                sb6.append("InputStream#read(byte[]) returned invalid result: ");
                sb6.append(i25);
                sb6.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb6.toString());
            }
            if (i25 > 0) {
                this.f21397c += i25;
                if ((this.f21403i + i15) - this.f21407m > 0) {
                    throw k.j();
                }
                N();
                if (this.f21397c >= i15) {
                    return true;
                }
                return T(i15);
            }
        }
        return false;
    }

    public static int b(int i15) {
        return (-(i15 & 1)) ^ (i15 >>> 1);
    }

    public static long c(long j15) {
        return (-(j15 & 1)) ^ (j15 >>> 1);
    }

    private void d(int i15) throws k {
        if (this.f21397c - this.f21399e < i15) {
            O(i15);
        }
    }

    static e g(p pVar) {
        e eVar = new e(pVar);
        try {
            eVar.j(pVar.size());
            return eVar;
        } catch (k e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static e h(InputStream inputStream) {
        return new e(inputStream);
    }

    private byte[] x(int i15) throws k {
        if (i15 <= 0) {
            if (i15 == 0) {
                return j.f21443a;
            }
            throw k.g();
        }
        int i16 = this.f21403i;
        int i17 = this.f21399e;
        int i18 = i16 + i17 + i15;
        int i19 = this.f21404j;
        if (i18 > i19) {
            R((i19 - i16) - i17);
            throw k.k();
        }
        if (i15 < 4096) {
            byte[] bArr = new byte[i15];
            int i25 = this.f21397c - i17;
            System.arraycopy(this.f21395a, i17, bArr, 0, i25);
            this.f21399e = this.f21397c;
            int i26 = i15 - i25;
            d(i26);
            System.arraycopy(this.f21395a, 0, bArr, i25, i26);
            this.f21399e = i26;
            return bArr;
        }
        int i27 = this.f21397c;
        this.f21403i = i16 + i27;
        this.f21399e = 0;
        this.f21397c = 0;
        int length = i27 - i17;
        int i28 = i15 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i28 > 0) {
            int iMin = Math.min(i28, PKIFailureInfo.certConfirmed);
            byte[] bArr2 = new byte[iMin];
            int i29 = 0;
            while (i29 < iMin) {
                InputStream inputStream = this.f21400f;
                int i35 = inputStream == null ? -1 : inputStream.read(bArr2, i29, iMin - i29);
                if (i35 == -1) {
                    throw k.k();
                }
                this.f21403i += i35;
                i29 += i35;
            }
            i28 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i15];
        System.arraycopy(this.f21395a, i17, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int A() {
        int i15;
        int i16 = this.f21399e;
        int i17 = this.f21397c;
        if (i17 != i16) {
            byte[] bArr = this.f21395a;
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            if (b15 >= 0) {
                this.f21399e = i18;
                return b15;
            }
            if (i17 - i18 >= 9) {
                int i19 = i16 + 2;
                int i25 = (bArr[i18] << 7) ^ b15;
                long j15 = i25;
                if (j15 < 0) {
                    i15 = (int) ((-128) ^ j15);
                } else {
                    int i26 = i16 + 3;
                    int i27 = (bArr[i19] << 14) ^ i25;
                    long j16 = i27;
                    if (j16 >= 0) {
                        i15 = (int) (16256 ^ j16);
                    } else {
                        int i28 = i16 + 4;
                        int i29 = i27 ^ (bArr[i26] << 21);
                        long j17 = i29;
                        if (j17 < 0) {
                            i15 = (int) ((-2080896) ^ j17);
                        } else {
                            i26 = i16 + 5;
                            byte b16 = bArr[i28];
                            int i35 = (int) (((long) (i29 ^ (b16 << 28))) ^ 266354560);
                            if (b16 < 0) {
                                i28 = i16 + 6;
                                if (bArr[i26] < 0) {
                                    i26 = i16 + 7;
                                    if (bArr[i28] < 0) {
                                        i28 = i16 + 8;
                                        if (bArr[i26] < 0) {
                                            i26 = i16 + 9;
                                            if (bArr[i28] < 0) {
                                                int i36 = i16 + 10;
                                                if (bArr[i26] >= 0) {
                                                    i19 = i36;
                                                    i15 = i35;
                                                }
                                            }
                                        }
                                    }
                                }
                                i15 = i35;
                            }
                            i15 = i35;
                        }
                        i19 = i28;
                    }
                    i19 = i26;
                }
                this.f21399e = i19;
                return i15;
            }
        }
        return (int) D();
    }

    public long C() {
        long j15;
        long j16;
        long j17;
        int i15 = this.f21399e;
        int i16 = this.f21397c;
        if (i16 != i15) {
            byte[] bArr = this.f21395a;
            int i17 = i15 + 1;
            byte b15 = bArr[i15];
            if (b15 >= 0) {
                this.f21399e = i17;
                return b15;
            }
            if (i16 - i17 >= 9) {
                int i18 = i15 + 2;
                long j18 = (bArr[i17] << 7) ^ b15;
                if (j18 >= 0) {
                    int i19 = i15 + 3;
                    long j19 = j18 ^ ((long) (bArr[i18] << 14));
                    if (j19 >= 0) {
                        j17 = 16256;
                    } else {
                        i18 = i15 + 4;
                        j18 = j19 ^ ((long) (bArr[i19] << 21));
                        if (j18 < 0) {
                            j16 = -2080896;
                        } else {
                            i19 = i15 + 5;
                            j19 = j18 ^ (((long) bArr[i18]) << 28);
                            if (j19 >= 0) {
                                j17 = 266354560;
                            } else {
                                i18 = i15 + 6;
                                j18 = j19 ^ (((long) bArr[i19]) << 35);
                                if (j18 >= 0) {
                                    i19 = i15 + 7;
                                    j19 = j18 ^ (((long) bArr[i18]) << 42);
                                    if (j19 >= 0) {
                                        j17 = 4363953127296L;
                                    } else {
                                        i18 = i15 + 8;
                                        j18 = j19 ^ (((long) bArr[i19]) << 49);
                                        if (j18 < 0) {
                                            j16 = -558586000294016L;
                                        } else {
                                            i19 = i15 + 9;
                                            long j25 = (j18 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                            if (j25 < 0) {
                                                i18 = i15 + 10;
                                                if (bArr[i19] >= 0) {
                                                    j15 = j25;
                                                }
                                            } else {
                                                j15 = j25;
                                                i18 = i19;
                                            }
                                        }
                                    }
                                    this.f21399e = i18;
                                    return j15;
                                }
                                j16 = -34093383808L;
                            }
                        }
                    }
                    j15 = j19 ^ j17;
                    i18 = i19;
                    this.f21399e = i18;
                    return j15;
                }
                j16 = -128;
                j15 = j18 ^ j16;
                this.f21399e = i18;
                return j15;
            }
        }
        return D();
    }

    long D() throws k {
        long j15 = 0;
        for (int i15 = 0; i15 < 64; i15 += 7) {
            byte bW = w();
            j15 |= ((long) (bW & 127)) << i15;
            if ((bW & 128) == 0) {
                return j15;
            }
        }
        throw k.f();
    }

    public int E() {
        return y();
    }

    public long F() {
        return z();
    }

    public int G() {
        return b(A());
    }

    public long H() {
        return c(C());
    }

    public String I() {
        int iA = A();
        int i15 = this.f21397c;
        int i16 = this.f21399e;
        if (iA > i15 - i16 || iA <= 0) {
            return iA == 0 ? "" : new String(x(iA), "UTF-8");
        }
        String str = new String(this.f21395a, i16, iA, "UTF-8");
        this.f21399e += iA;
        return str;
    }

    public String J() throws k {
        byte[] bArrX;
        int iA = A();
        int i15 = this.f21399e;
        if (iA <= this.f21397c - i15 && iA > 0) {
            bArrX = this.f21395a;
            this.f21399e = i15 + iA;
        } else {
            if (iA == 0) {
                return "";
            }
            bArrX = x(iA);
            i15 = 0;
        }
        if (y.f(bArrX, i15, i15 + iA)) {
            return new String(bArrX, i15, iA, "UTF-8");
        }
        throw k.d();
    }

    public int K() throws k {
        if (f()) {
            this.f21401g = 0;
            return 0;
        }
        int iA = A();
        this.f21401g = iA;
        if (z.a(iA) != 0) {
            return this.f21401g;
        }
        throw k.c();
    }

    public int L() {
        return A();
    }

    public long M() {
        return C();
    }

    public boolean P(int i15, f fVar) throws k {
        int iB = z.b(i15);
        if (iB == 0) {
            long jT = t();
            fVar.o0(i15);
            fVar.z0(jT);
            return true;
        }
        if (iB == 1) {
            long jZ = z();
            fVar.o0(i15);
            fVar.V(jZ);
            return true;
        }
        if (iB == 2) {
            d dVarL = l();
            fVar.o0(i15);
            fVar.P(dVarL);
            return true;
        }
        if (iB == 3) {
            fVar.o0(i15);
            Q(fVar);
            int iC = z.c(z.a(i15), 4);
            a(iC);
            fVar.o0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw k.e();
        }
        int iY = y();
        fVar.o0(i15);
        fVar.U(iY);
        return true;
    }

    public void Q(f fVar) throws k {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
        } while (P(iK, fVar));
    }

    public void R(int i15) throws k {
        int i16 = this.f21397c;
        int i17 = this.f21399e;
        if (i15 > i16 - i17 || i15 < 0) {
            S(i15);
        } else {
            this.f21399e = i17 + i15;
        }
    }

    public void a(int i15) throws k {
        if (this.f21401g != i15) {
            throw k.b();
        }
    }

    public int e() {
        int i15 = this.f21404j;
        if (i15 == Integer.MAX_VALUE) {
            return -1;
        }
        return i15 - (this.f21403i + this.f21399e);
    }

    public boolean f() {
        return this.f21399e == this.f21397c && !T(1);
    }

    public void i(int i15) {
        this.f21404j = i15;
        N();
    }

    public int j(int i15) throws k {
        if (i15 < 0) {
            throw k.g();
        }
        int i16 = i15 + this.f21403i + this.f21399e;
        int i17 = this.f21404j;
        if (i16 > i17) {
            throw k.k();
        }
        this.f21404j = i16;
        N();
        return i17;
    }

    public boolean k() {
        return C() != 0;
    }

    public d l() {
        int iA = A();
        int i15 = this.f21397c;
        int i16 = this.f21399e;
        if (iA > i15 - i16 || iA <= 0) {
            return iA == 0 ? d.f21388a : new p(x(iA));
        }
        d cVar = (this.f21396b && this.f21402h) ? new c(this.f21395a, this.f21399e, iA) : d.i(this.f21395a, i16, iA);
        this.f21399e += iA;
        return cVar;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public int n() {
        return A();
    }

    public int o() {
        return y();
    }

    public long p() {
        return z();
    }

    public float q() {
        return Float.intBitsToFloat(y());
    }

    public void r(int i15, q.a aVar, g gVar) throws k {
        int i16 = this.f21405k;
        if (i16 >= this.f21406l) {
            throw k.h();
        }
        this.f21405k = i16 + 1;
        aVar.l(this, gVar);
        a(z.c(i15, 4));
        this.f21405k--;
    }

    public int s() {
        return A();
    }

    public long t() {
        return C();
    }

    public <T extends q> T u(s<T> sVar, g gVar) throws k {
        int iA = A();
        if (this.f21405k >= this.f21406l) {
            throw k.h();
        }
        int iJ = j(iA);
        this.f21405k++;
        T tB = sVar.b(this, gVar);
        a(0);
        this.f21405k--;
        i(iJ);
        return tB;
    }

    public void v(q.a aVar, g gVar) throws k {
        int iA = A();
        if (this.f21405k >= this.f21406l) {
            throw k.h();
        }
        int iJ = j(iA);
        this.f21405k++;
        aVar.l(this, gVar);
        a(0);
        this.f21405k--;
        i(iJ);
    }

    public byte w() throws k {
        if (this.f21399e == this.f21397c) {
            O(1);
        }
        byte[] bArr = this.f21395a;
        int i15 = this.f21399e;
        this.f21399e = i15 + 1;
        return bArr[i15];
    }

    public int y() throws k {
        int i15 = this.f21399e;
        if (this.f21397c - i15 < 4) {
            O(4);
            i15 = this.f21399e;
        }
        byte[] bArr = this.f21395a;
        this.f21399e = i15 + 4;
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    public long z() throws k {
        int i15 = this.f21399e;
        if (this.f21397c - i15 < 8) {
            O(8);
            i15 = this.f21399e;
        }
        byte[] bArr = this.f21395a;
        this.f21399e = i15 + 8;
        return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
    }

    private e(p pVar) {
        this.f21402h = false;
        this.f21404j = Integer.MAX_VALUE;
        this.f21406l = 64;
        this.f21407m = 67108864;
        this.f21395a = pVar.f21455b;
        int iL = pVar.L();
        this.f21399e = iL;
        this.f21397c = iL + pVar.size();
        this.f21403i = -this.f21399e;
        this.f21400f = null;
        this.f21396b = true;
    }
}
