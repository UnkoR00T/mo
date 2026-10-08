package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f11961f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f11965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11966e;

    private static final class b extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f11967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f11968h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11969i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f11972l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11973m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11974n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f11975o;

        private void O() {
            int i15 = this.f11969i + this.f11970j;
            this.f11969i = i15;
            int i16 = i15 - this.f11972l;
            int i17 = this.f11975o;
            if (i16 <= i17) {
                this.f11970j = 0;
                return;
            }
            int i18 = i16 - i17;
            this.f11970j = i18;
            this.f11969i = i15 - i18;
        }

        private void Q() throws a0 {
            if (this.f11969i - this.f11971k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws a0 {
            for (int i15 = 0; i15 < 10; i15++) {
                byte[] bArr = this.f11967g;
                int i16 = this.f11971k;
                this.f11971k = i16 + 1;
                if (bArr[i16] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void S() throws a0 {
            for (int i15 = 0; i15 < 10; i15++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws a0 {
            int iL = L();
            if (iL > 0) {
                int i15 = this.f11969i;
                int i16 = this.f11971k;
                if (iL <= i15 - i16) {
                    String str = new String(this.f11967g, i16, iL, z.f12228b);
                    this.f11971k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw a0.g();
            }
            throw a0.n();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws a0 {
            int iL = L();
            if (iL > 0) {
                int i15 = this.f11969i;
                int i16 = this.f11971k;
                if (iL <= i15 - i16) {
                    String strA = r1.a(this.f11967g, i16, iL);
                    this.f11971k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw a0.g();
            }
            throw a0.n();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws a0 {
            if (f()) {
                this.f11973m = 0;
                return 0;
            }
            int iL = L();
            this.f11973m = iL;
            if (s1.a(iL) != 0) {
                return this.f11973m;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i15) throws a0 {
            int iB = s1.b(i15);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(s1.c(s1.a(i15), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw a0.e();
            }
            P(4);
            return true;
        }

        public byte H() throws a0 {
            int i15 = this.f11971k;
            if (i15 == this.f11969i) {
                throw a0.n();
            }
            byte[] bArr = this.f11967g;
            this.f11971k = i15 + 1;
            return bArr[i15];
        }

        public byte[] I(int i15) throws a0 {
            if (i15 > 0) {
                int i16 = this.f11969i;
                int i17 = this.f11971k;
                if (i15 <= i16 - i17) {
                    int i18 = i15 + i17;
                    this.f11971k = i18;
                    return Arrays.copyOfRange(this.f11967g, i17, i18);
                }
            }
            if (i15 > 0) {
                throw a0.n();
            }
            if (i15 == 0) {
                return z.f12230d;
            }
            throw a0.g();
        }

        public int J() throws a0 {
            int i15 = this.f11971k;
            if (this.f11969i - i15 < 4) {
                throw a0.n();
            }
            byte[] bArr = this.f11967g;
            this.f11971k = i15 + 4;
            return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
        }

        public long K() throws a0 {
            int i15 = this.f11971k;
            if (this.f11969i - i15 < 8) {
                throw a0.n();
            }
            byte[] bArr = this.f11967g;
            this.f11971k = i15 + 8;
            return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
        }

        public int L() {
            int i15;
            int i16 = this.f11971k;
            int i17 = this.f11969i;
            if (i17 != i16) {
                byte[] bArr = this.f11967g;
                int i18 = i16 + 1;
                byte b15 = bArr[i16];
                if (b15 >= 0) {
                    this.f11971k = i18;
                    return b15;
                }
                if (i17 - i18 >= 9) {
                    int i19 = i16 + 2;
                    int i25 = (bArr[i18] << 7) ^ b15;
                    if (i25 < 0) {
                        i15 = i25 ^ (-128);
                    } else {
                        int i26 = i16 + 3;
                        int i27 = (bArr[i19] << 14) ^ i25;
                        if (i27 >= 0) {
                            i15 = i27 ^ 16256;
                        } else {
                            int i28 = i16 + 4;
                            int i29 = i27 ^ (bArr[i26] << 21);
                            if (i29 < 0) {
                                i15 = (-2080896) ^ i29;
                            } else {
                                i26 = i16 + 5;
                                byte b16 = bArr[i28];
                                int i35 = (i29 ^ (b16 << 28)) ^ 266354560;
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
                    this.f11971k = i19;
                    return i15;
                }
            }
            return (int) N();
        }

        public long M() {
            long j15;
            long j16;
            long j17;
            int i15 = this.f11971k;
            int i16 = this.f11969i;
            if (i16 != i15) {
                byte[] bArr = this.f11967g;
                int i17 = i15 + 1;
                byte b15 = bArr[i15];
                if (b15 >= 0) {
                    this.f11971k = i17;
                    return b15;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b15;
                    if (i19 < 0) {
                        j15 = i19 ^ (-128);
                    } else {
                        int i25 = i15 + 3;
                        int i26 = (bArr[i18] << 14) ^ i19;
                        if (i26 >= 0) {
                            j15 = i26 ^ 16256;
                            i18 = i25;
                        } else {
                            int i27 = i15 + 4;
                            int i28 = i26 ^ (bArr[i25] << 21);
                            if (i28 < 0) {
                                long j18 = (-2080896) ^ i28;
                                i18 = i27;
                                j15 = j18;
                            } else {
                                long j19 = i28;
                                i18 = i15 + 5;
                                long j25 = j19 ^ (((long) bArr[i27]) << 28);
                                if (j25 >= 0) {
                                    j17 = 266354560;
                                } else {
                                    int i29 = i15 + 6;
                                    long j26 = j25 ^ (((long) bArr[i18]) << 35);
                                    if (j26 < 0) {
                                        j16 = -34093383808L;
                                    } else {
                                        i18 = i15 + 7;
                                        j25 = j26 ^ (((long) bArr[i29]) << 42);
                                        if (j25 >= 0) {
                                            j17 = 4363953127296L;
                                        } else {
                                            i29 = i15 + 8;
                                            j26 = j25 ^ (((long) bArr[i18]) << 49);
                                            if (j26 < 0) {
                                                j16 = -558586000294016L;
                                            } else {
                                                i18 = i15 + 9;
                                                long j27 = (j26 ^ (((long) bArr[i29]) << 56)) ^ 71499008037633920L;
                                                if (j27 < 0) {
                                                    int i35 = i15 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i18 = i35;
                                                    }
                                                }
                                                j15 = j27;
                                            }
                                        }
                                    }
                                    j15 = j26 ^ j16;
                                    i18 = i29;
                                }
                                j15 = j25 ^ j17;
                            }
                        }
                    }
                    this.f11971k = i18;
                    return j15;
                }
            }
            return N();
        }

        long N() throws a0 {
            long j15 = 0;
            for (int i15 = 0; i15 < 64; i15 += 7) {
                byte bH = H();
                j15 |= ((long) (bH & 127)) << i15;
                if ((bH & 128) == 0) {
                    return j15;
                }
            }
            throw a0.f();
        }

        public void P(int i15) throws a0 {
            if (i15 >= 0) {
                int i16 = this.f11969i;
                int i17 = this.f11971k;
                if (i15 <= i16 - i17) {
                    this.f11971k = i17 + i15;
                    return;
                }
            }
            if (i15 >= 0) {
                throw a0.n();
            }
            throw a0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i15) throws a0 {
            if (this.f11973m != i15) {
                throw a0.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f11971k - this.f11972l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f11971k == this.f11969i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i15) {
            this.f11975o = i15;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i15) throws a0 {
            if (i15 < 0) {
                throw a0.g();
            }
            int iE = i15 + e();
            if (iE < 0) {
                throw a0.h();
            }
            int i16 = this.f11975o;
            if (iE > i16) {
                throw a0.n();
            }
            this.f11975o = iE;
            O();
            return i16;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int iL = L();
            if (iL > 0) {
                int i15 = this.f11969i;
                int i16 = this.f11971k;
                if (iL <= i15 - i16) {
                    g gVarG = (this.f11968h && this.f11974n) ? g.G(this.f11967g, i16, iL) : g.j(this.f11967g, i16, iL);
                    this.f11971k += iL;
                    return gVarG;
                }
            }
            return iL == 0 ? g.f11949b : g.F(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(M());
        }

        private b(byte[] bArr, int i15, int i16, boolean z15) {
            super();
            this.f11975o = Integer.MAX_VALUE;
            this.f11967g = bArr;
            this.f11969i = i16 + i15;
            this.f11971k = i15;
            this.f11972l = i15;
            this.f11968h = z15;
        }
    }

    private static final class c extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f11976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f11977h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11978i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f11981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f11983n;

        private static int H(InputStream inputStream) throws a0 {
            try {
                return inputStream.available();
            } catch (a0 e15) {
                e15.j();
                throw e15;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i15, int i16) throws a0 {
            try {
                return inputStream.read(bArr, i15, i16);
            } catch (a0 e15) {
                e15.j();
                throw e15;
            }
        }

        private g J(int i15) throws IOException {
            byte[] bArrM = M(i15);
            if (bArrM != null) {
                return g.i(bArrM);
            }
            int i16 = this.f11980k;
            int i17 = this.f11978i;
            int length = i17 - i16;
            this.f11982m += i17;
            this.f11980k = 0;
            this.f11978i = 0;
            List<byte[]> listN = N(i15 - length);
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f11977h, i16, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.F(bArr);
        }

        private byte[] L(int i15, boolean z15) throws IOException {
            byte[] bArrM = M(i15);
            if (bArrM != null) {
                return z15 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i16 = this.f11980k;
            int i17 = this.f11978i;
            int length = i17 - i16;
            this.f11982m += i17;
            this.f11980k = 0;
            this.f11978i = 0;
            List<byte[]> listN = N(i15 - length);
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f11977h, i16, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i15) throws a0 {
            if (i15 == 0) {
                return z.f12230d;
            }
            if (i15 < 0) {
                throw a0.g();
            }
            int i16 = this.f11982m;
            int i17 = this.f11980k;
            int i18 = i16 + i17 + i15;
            if (i18 - this.f11964c > 0) {
                throw a0.m();
            }
            int i19 = this.f11983n;
            if (i18 > i19) {
                W((i19 - i16) - i17);
                throw a0.n();
            }
            int i25 = this.f11978i - i17;
            int i26 = i15 - i25;
            if (i26 >= 4096 && i26 > H(this.f11976g)) {
                return null;
            }
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f11977h, this.f11980k, bArr, 0, i25);
            this.f11982m += this.f11978i;
            this.f11980k = 0;
            this.f11978i = 0;
            while (i25 < i15) {
                int I = I(this.f11976g, bArr, i25, i15 - i25);
                if (I == -1) {
                    throw a0.n();
                }
                this.f11982m += I;
                i25 += I;
            }
            return bArr;
        }

        private List<byte[]> N(int i15) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i15 > 0) {
                int iMin = Math.min(i15, PKIFailureInfo.certConfirmed);
                byte[] bArr = new byte[iMin];
                int i16 = 0;
                while (i16 < iMin) {
                    int i17 = this.f11976g.read(bArr, i16, iMin - i16);
                    if (i17 == -1) {
                        throw a0.n();
                    }
                    this.f11982m += i17;
                    i16 += i17;
                }
                i15 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i15 = this.f11978i + this.f11979j;
            this.f11978i = i15;
            int i16 = this.f11982m + i15;
            int i17 = this.f11983n;
            if (i16 <= i17) {
                this.f11979j = 0;
                return;
            }
            int i18 = i16 - i17;
            this.f11979j = i18;
            this.f11978i = i15 - i18;
        }

        private void U(int i15) throws a0 {
            if (b0(i15)) {
                return;
            }
            if (i15 <= (this.f11964c - this.f11982m) - this.f11980k) {
                throw a0.n();
            }
            throw a0.m();
        }

        private static long V(InputStream inputStream, long j15) throws a0 {
            try {
                return inputStream.skip(j15);
            } catch (a0 e15) {
                e15.j();
                throw e15;
            }
        }

        private void X(int i15) throws a0 {
            if (i15 < 0) {
                throw a0.g();
            }
            int i16 = this.f11982m;
            int i17 = this.f11980k;
            int i18 = i16 + i17 + i15;
            int i19 = this.f11983n;
            if (i18 > i19) {
                W((i19 - i16) - i17);
                throw a0.n();
            }
            this.f11982m = i16 + i17;
            int i25 = this.f11978i - i17;
            this.f11978i = 0;
            this.f11980k = 0;
            while (i25 < i15) {
                try {
                    long j15 = i15 - i25;
                    long jV = V(this.f11976g, j15);
                    if (jV < 0 || jV > j15) {
                        throw new IllegalStateException(this.f11976g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i25 += (int) jV;
                    }
                } catch (Throwable th4) {
                    this.f11982m += i25;
                    T();
                    throw th4;
                }
            }
            this.f11982m += i25;
            T();
            if (i25 >= i15) {
                return;
            }
            int i26 = this.f11978i;
            int i27 = i26 - this.f11980k;
            this.f11980k = i26;
            U(1);
            while (true) {
                int i28 = i15 - i27;
                int i29 = this.f11978i;
                if (i28 <= i29) {
                    this.f11980k = i28;
                    return;
                } else {
                    i27 += i29;
                    this.f11980k = i29;
                    U(1);
                }
            }
        }

        private void Y() throws a0 {
            if (this.f11978i - this.f11980k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws a0 {
            for (int i15 = 0; i15 < 10; i15++) {
                byte[] bArr = this.f11977h;
                int i16 = this.f11980k;
                this.f11980k = i16 + 1;
                if (bArr[i16] >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private void a0() throws a0 {
            for (int i15 = 0; i15 < 10; i15++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw a0.f();
        }

        private boolean b0(int i15) throws a0 {
            int i16 = this.f11980k;
            int i17 = i16 + i15;
            int i18 = this.f11978i;
            if (i17 <= i18) {
                throw new IllegalStateException("refillBuffer() called when " + i15 + " bytes were already available in buffer");
            }
            int i19 = this.f11964c;
            int i25 = this.f11982m;
            if (i15 > (i19 - i25) - i16 || i25 + i16 + i15 > this.f11983n) {
                return false;
            }
            if (i16 > 0) {
                if (i18 > i16) {
                    byte[] bArr = this.f11977h;
                    System.arraycopy(bArr, i16, bArr, 0, i18 - i16);
                }
                this.f11982m += i16;
                this.f11978i -= i16;
                this.f11980k = 0;
            }
            InputStream inputStream = this.f11976g;
            byte[] bArr2 = this.f11977h;
            int i26 = this.f11978i;
            int I = I(inputStream, bArr2, i26, Math.min(bArr2.length - i26, (this.f11964c - this.f11982m) - i26));
            if (I == 0 || I < -1 || I > this.f11977h.length) {
                throw new IllegalStateException(this.f11976g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f11978i += I;
            T();
            if (this.f11978i >= i15) {
                return true;
            }
            return b0(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws a0 {
            int iQ = Q();
            if (iQ > 0) {
                int i15 = this.f11978i;
                int i16 = this.f11980k;
                if (iQ <= i15 - i16) {
                    String str = new String(this.f11977h, i16, iQ, z.f12228b);
                    this.f11980k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw a0.g();
            }
            if (iQ > this.f11978i) {
                return new String(L(iQ, false), z.f12228b);
            }
            U(iQ);
            String str2 = new String(this.f11977h, this.f11980k, iQ, z.f12228b);
            this.f11980k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i15 = this.f11980k;
            int i16 = this.f11978i;
            if (iQ <= i16 - i15 && iQ > 0) {
                bArrL = this.f11977h;
                this.f11980k = i15 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw a0.g();
                }
                i15 = 0;
                if (iQ <= i16) {
                    U(iQ);
                    bArrL = this.f11977h;
                    this.f11980k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return r1.a(bArrL, i15, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws a0 {
            if (f()) {
                this.f11981l = 0;
                return 0;
            }
            int iQ = Q();
            this.f11981l = iQ;
            if (s1.a(iQ) != 0) {
                return this.f11981l;
            }
            throw a0.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i15) throws a0 {
            int iB = s1.b(i15);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(s1.c(s1.a(i15), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw a0.e();
            }
            W(4);
            return true;
        }

        public byte K() throws a0 {
            if (this.f11980k == this.f11978i) {
                U(1);
            }
            byte[] bArr = this.f11977h;
            int i15 = this.f11980k;
            this.f11980k = i15 + 1;
            return bArr[i15];
        }

        public int O() throws a0 {
            int i15 = this.f11980k;
            if (this.f11978i - i15 < 4) {
                U(4);
                i15 = this.f11980k;
            }
            byte[] bArr = this.f11977h;
            this.f11980k = i15 + 4;
            return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
        }

        public long P() throws a0 {
            int i15 = this.f11980k;
            if (this.f11978i - i15 < 8) {
                U(8);
                i15 = this.f11980k;
            }
            byte[] bArr = this.f11977h;
            this.f11980k = i15 + 8;
            return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
        }

        public int Q() {
            int i15;
            int i16 = this.f11980k;
            int i17 = this.f11978i;
            if (i17 != i16) {
                byte[] bArr = this.f11977h;
                int i18 = i16 + 1;
                byte b15 = bArr[i16];
                if (b15 >= 0) {
                    this.f11980k = i18;
                    return b15;
                }
                if (i17 - i18 >= 9) {
                    int i19 = i16 + 2;
                    int i25 = (bArr[i18] << 7) ^ b15;
                    if (i25 < 0) {
                        i15 = i25 ^ (-128);
                    } else {
                        int i26 = i16 + 3;
                        int i27 = (bArr[i19] << 14) ^ i25;
                        if (i27 >= 0) {
                            i15 = i27 ^ 16256;
                        } else {
                            int i28 = i16 + 4;
                            int i29 = i27 ^ (bArr[i26] << 21);
                            if (i29 < 0) {
                                i15 = (-2080896) ^ i29;
                            } else {
                                i26 = i16 + 5;
                                byte b16 = bArr[i28];
                                int i35 = (i29 ^ (b16 << 28)) ^ 266354560;
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
                    this.f11980k = i19;
                    return i15;
                }
            }
            return (int) S();
        }

        public long R() {
            long j15;
            long j16;
            long j17;
            int i15 = this.f11980k;
            int i16 = this.f11978i;
            if (i16 != i15) {
                byte[] bArr = this.f11977h;
                int i17 = i15 + 1;
                byte b15 = bArr[i15];
                if (b15 >= 0) {
                    this.f11980k = i17;
                    return b15;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b15;
                    if (i19 < 0) {
                        j15 = i19 ^ (-128);
                    } else {
                        int i25 = i15 + 3;
                        int i26 = (bArr[i18] << 14) ^ i19;
                        if (i26 >= 0) {
                            j15 = i26 ^ 16256;
                            i18 = i25;
                        } else {
                            int i27 = i15 + 4;
                            int i28 = i26 ^ (bArr[i25] << 21);
                            if (i28 < 0) {
                                long j18 = (-2080896) ^ i28;
                                i18 = i27;
                                j15 = j18;
                            } else {
                                long j19 = i28;
                                i18 = i15 + 5;
                                long j25 = j19 ^ (((long) bArr[i27]) << 28);
                                if (j25 >= 0) {
                                    j17 = 266354560;
                                } else {
                                    int i29 = i15 + 6;
                                    long j26 = j25 ^ (((long) bArr[i18]) << 35);
                                    if (j26 < 0) {
                                        j16 = -34093383808L;
                                    } else {
                                        i18 = i15 + 7;
                                        j25 = j26 ^ (((long) bArr[i29]) << 42);
                                        if (j25 >= 0) {
                                            j17 = 4363953127296L;
                                        } else {
                                            i29 = i15 + 8;
                                            j26 = j25 ^ (((long) bArr[i18]) << 49);
                                            if (j26 < 0) {
                                                j16 = -558586000294016L;
                                            } else {
                                                i18 = i15 + 9;
                                                long j27 = (j26 ^ (((long) bArr[i29]) << 56)) ^ 71499008037633920L;
                                                if (j27 < 0) {
                                                    int i35 = i15 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i18 = i35;
                                                    }
                                                }
                                                j15 = j27;
                                            }
                                        }
                                    }
                                    j15 = j26 ^ j16;
                                    i18 = i29;
                                }
                                j15 = j25 ^ j17;
                            }
                        }
                    }
                    this.f11980k = i18;
                    return j15;
                }
            }
            return S();
        }

        long S() throws a0 {
            long j15 = 0;
            for (int i15 = 0; i15 < 64; i15 += 7) {
                byte bK = K();
                j15 |= ((long) (bK & 127)) << i15;
                if ((bK & 128) == 0) {
                    return j15;
                }
            }
            throw a0.f();
        }

        public void W(int i15) throws a0 {
            int i16 = this.f11978i;
            int i17 = this.f11980k;
            if (i15 > i16 - i17 || i15 < 0) {
                X(i15);
            } else {
                this.f11980k = i17 + i15;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i15) throws a0 {
            if (this.f11981l != i15) {
                throw a0.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f11982m + this.f11980k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f11980k == this.f11978i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i15) {
            this.f11983n = i15;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i15) throws a0 {
            if (i15 < 0) {
                throw a0.g();
            }
            int i16 = i15 + this.f11982m + this.f11980k;
            if (i16 < 0) {
                throw a0.h();
            }
            int i17 = this.f11983n;
            if (i16 > i17) {
                throw a0.n();
            }
            this.f11983n = i16;
            T();
            return i17;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws a0 {
            int iQ = Q();
            int i15 = this.f11978i;
            int i16 = this.f11980k;
            if (iQ <= i15 - i16 && iQ > 0) {
                g gVarJ = g.j(this.f11977h, i16, iQ);
                this.f11980k += iQ;
                return gVarJ;
            }
            if (iQ == 0) {
                return g.f11949b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw a0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(R());
        }

        private c(InputStream inputStream, int i15) {
            super();
            this.f11983n = Integer.MAX_VALUE;
            z.b(inputStream, "input");
            this.f11976g = inputStream;
            this.f11977h = new byte[i15];
            this.f11978i = 0;
            this.f11980k = 0;
            this.f11982m = 0;
        }
    }

    public static int c(int i15) {
        return (-(i15 & 1)) ^ (i15 >>> 1);
    }

    public static long d(long j15) {
        return (-(j15 & 1)) ^ (j15 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, PKIFailureInfo.certConfirmed);
    }

    public static h h(InputStream inputStream, int i15) {
        if (i15 > 0) {
            return inputStream == null ? i(z.f12230d) : new c(inputStream, i15);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i15, int i16) {
        return k(bArr, i15, i16, false);
    }

    static h k(byte[] bArr, int i15, int i16, boolean z15) {
        b bVar = new b(bArr, i15, i16, z15);
        try {
            bVar.m(i16);
            return bVar;
        } catch (a0 e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i15);

    public void G() throws a0 {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f11962a++;
            zF = F(iC);
            this.f11962a--;
        } while (zF);
    }

    public abstract void a(int i15);

    public void b() throws a0 {
        if (this.f11962a >= this.f11963b) {
            throw a0.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i15);

    public abstract int m(int i15);

    public abstract boolean n();

    public abstract g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private h() {
        this.f11963b = f11961f;
        this.f11964c = Integer.MAX_VALUE;
        this.f11966e = false;
    }
}
