package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f36073f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f36074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f36075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f36076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j f36077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36078e;

    private static final class b extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f36079g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f36080h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f36081i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f36082j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f36083k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f36084l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f36085m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f36086n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f36087o;

        private void M() {
            int i15 = this.f36081i + this.f36082j;
            this.f36081i = i15;
            int i16 = i15 - this.f36084l;
            int i17 = this.f36087o;
            if (i16 <= i17) {
                this.f36082j = 0;
                return;
            }
            int i18 = i16 - i17;
            this.f36082j = i18;
            this.f36081i = i15 - i18;
        }

        private void P() throws b0 {
            if (this.f36081i - this.f36083k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws b0 {
            for (int i15 = 0; i15 < 10; i15++) {
                byte[] bArr = this.f36079g;
                int i16 = this.f36083k;
                this.f36083k = i16 + 1;
                if (bArr[i16] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void R() throws b0 {
            for (int i15 = 0; i15 < 10; i15++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() throws b0 {
            int iJ = J();
            if (iJ > 0) {
                int i15 = this.f36081i;
                int i16 = this.f36083k;
                if (iJ <= i15 - i16) {
                    String strE = s1.e(this.f36079g, i16, iJ);
                    this.f36083k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw b0.g();
            }
            throw b0.n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int B() throws b0 {
            if (e()) {
                this.f36085m = 0;
                return 0;
            }
            int iJ = J();
            this.f36085m = iJ;
            if (t1.a(iJ) != 0) {
                return this.f36085m;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean E(int i15) throws b0 {
            int iB = t1.b(i15);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(t1.c(t1.a(i15), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw b0.e();
            }
            O(4);
            return true;
        }

        public byte F() throws b0 {
            int i15 = this.f36083k;
            if (i15 == this.f36081i) {
                throw b0.n();
            }
            byte[] bArr = this.f36079g;
            this.f36083k = i15 + 1;
            return bArr[i15];
        }

        public byte[] G(int i15) throws b0 {
            if (i15 > 0) {
                int i16 = this.f36081i;
                int i17 = this.f36083k;
                if (i15 <= i16 - i17) {
                    int i18 = i15 + i17;
                    this.f36083k = i18;
                    return Arrays.copyOfRange(this.f36079g, i17, i18);
                }
            }
            if (i15 > 0) {
                throw b0.n();
            }
            if (i15 == 0) {
                return a0.f36002d;
            }
            throw b0.g();
        }

        public int H() throws b0 {
            int i15 = this.f36083k;
            if (this.f36081i - i15 < 4) {
                throw b0.n();
            }
            byte[] bArr = this.f36079g;
            this.f36083k = i15 + 4;
            return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
        }

        public long I() throws b0 {
            int i15 = this.f36083k;
            if (this.f36081i - i15 < 8) {
                throw b0.n();
            }
            byte[] bArr = this.f36079g;
            this.f36083k = i15 + 8;
            return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
        }

        public int J() {
            int i15;
            int i16 = this.f36083k;
            int i17 = this.f36081i;
            if (i17 != i16) {
                byte[] bArr = this.f36079g;
                int i18 = i16 + 1;
                byte b15 = bArr[i16];
                if (b15 >= 0) {
                    this.f36083k = i18;
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
                    this.f36083k = i19;
                    return i15;
                }
            }
            return (int) L();
        }

        public long K() {
            long j15;
            long j16;
            long j17;
            int i15 = this.f36083k;
            int i16 = this.f36081i;
            if (i16 != i15) {
                byte[] bArr = this.f36079g;
                int i17 = i15 + 1;
                byte b15 = bArr[i15];
                if (b15 >= 0) {
                    this.f36083k = i17;
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
                    this.f36083k = i18;
                    return j15;
                }
            }
            return L();
        }

        long L() throws b0 {
            long j15 = 0;
            for (int i15 = 0; i15 < 64; i15 += 7) {
                byte bF = F();
                j15 |= ((long) (bF & 127)) << i15;
                if ((bF & 128) == 0) {
                    return j15;
                }
            }
            throw b0.f();
        }

        public void N() throws b0 {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i15) throws b0 {
            if (i15 >= 0) {
                int i16 = this.f36081i;
                int i17 = this.f36083k;
                if (i15 <= i16 - i17) {
                    this.f36083k = i17 + i15;
                    return;
                }
            }
            if (i15 >= 0) {
                throw b0.n();
            }
            throw b0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i15) throws b0 {
            if (this.f36085m != i15) {
                throw b0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int d() {
            return this.f36083k - this.f36084l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean e() {
            return this.f36083k == this.f36081i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void k(int i15) {
            this.f36087o = i15;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int l(int i15) throws b0 {
            if (i15 < 0) {
                throw b0.g();
            }
            int iD = i15 + d();
            if (iD < 0) {
                throw b0.h();
            }
            int i16 = this.f36087o;
            if (iD > i16) {
                throw b0.n();
            }
            this.f36087o = iD;
            M();
            return i16;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h n() {
            int iJ = J();
            if (iJ > 0) {
                int i15 = this.f36081i;
                int i16 = this.f36083k;
                if (iJ <= i15 - i16) {
                    h hVarR = (this.f36080h && this.f36086n) ? h.R(this.f36079g, i16, iJ) : h.j(this.f36079g, i16, iJ);
                    this.f36083k += iJ;
                    return hVarR;
                }
            }
            return iJ == 0 ? h.f36058b : h.Q(G(iJ));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int x() {
            return i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long y() {
            return i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String z() throws b0 {
            int iJ = J();
            if (iJ > 0) {
                int i15 = this.f36081i;
                int i16 = this.f36083k;
                if (iJ <= i15 - i16) {
                    String str = new String(this.f36079g, i16, iJ, a0.f36000b);
                    this.f36083k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw b0.g();
            }
            throw b0.n();
        }

        private b(byte[] bArr, int i15, int i16, boolean z15) {
            super();
            this.f36087o = Integer.MAX_VALUE;
            this.f36079g = bArr;
            this.f36081i = i16 + i15;
            this.f36083k = i15;
            this.f36084l = i15;
            this.f36080h = z15;
        }
    }

    private static final class c extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f36088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f36089h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f36090i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f36091j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f36092k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f36093l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f36094m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f36095n;

        private static int F(InputStream inputStream) throws b0 {
            try {
                return inputStream.available();
            } catch (b0 e15) {
                e15.j();
                throw e15;
            }
        }

        private static int G(InputStream inputStream, byte[] bArr, int i15, int i16) throws b0 {
            try {
                return inputStream.read(bArr, i15, i16);
            } catch (b0 e15) {
                e15.j();
                throw e15;
            }
        }

        private h H(int i15) throws IOException {
            byte[] bArrK = K(i15);
            if (bArrK != null) {
                return h.i(bArrK);
            }
            int i16 = this.f36092k;
            int i17 = this.f36090i;
            int length = i17 - i16;
            this.f36094m += i17;
            this.f36092k = 0;
            this.f36090i = 0;
            List<byte[]> listL = L(i15 - length);
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f36089h, i16, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return h.Q(bArr);
        }

        private byte[] J(int i15, boolean z15) throws IOException {
            byte[] bArrK = K(i15);
            if (bArrK != null) {
                return z15 ? (byte[]) bArrK.clone() : bArrK;
            }
            int i16 = this.f36092k;
            int i17 = this.f36090i;
            int length = i17 - i16;
            this.f36094m += i17;
            this.f36092k = 0;
            this.f36090i = 0;
            List<byte[]> listL = L(i15 - length);
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f36089h, i16, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] K(int i15) throws b0 {
            if (i15 == 0) {
                return a0.f36002d;
            }
            if (i15 < 0) {
                throw b0.g();
            }
            int i16 = this.f36094m;
            int i17 = this.f36092k;
            int i18 = i16 + i17 + i15;
            if (i18 - this.f36076c > 0) {
                throw b0.m();
            }
            int i19 = this.f36095n;
            if (i18 > i19) {
                V((i19 - i16) - i17);
                throw b0.n();
            }
            int i25 = this.f36090i - i17;
            int i26 = i15 - i25;
            if (i26 >= 4096 && i26 > F(this.f36088g)) {
                return null;
            }
            byte[] bArr = new byte[i15];
            System.arraycopy(this.f36089h, this.f36092k, bArr, 0, i25);
            this.f36094m += this.f36090i;
            this.f36092k = 0;
            this.f36090i = 0;
            while (i25 < i15) {
                int iG = G(this.f36088g, bArr, i25, i15 - i25);
                if (iG == -1) {
                    throw b0.n();
                }
                this.f36094m += iG;
                i25 += iG;
            }
            return bArr;
        }

        private List<byte[]> L(int i15) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i15 > 0) {
                int iMin = Math.min(i15, PKIFailureInfo.certConfirmed);
                byte[] bArr = new byte[iMin];
                int i16 = 0;
                while (i16 < iMin) {
                    int i17 = this.f36088g.read(bArr, i16, iMin - i16);
                    if (i17 == -1) {
                        throw b0.n();
                    }
                    this.f36094m += i17;
                    i16 += i17;
                }
                i15 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i15 = this.f36090i + this.f36091j;
            this.f36090i = i15;
            int i16 = this.f36094m + i15;
            int i17 = this.f36095n;
            if (i16 <= i17) {
                this.f36091j = 0;
                return;
            }
            int i18 = i16 - i17;
            this.f36091j = i18;
            this.f36090i = i15 - i18;
        }

        private void S(int i15) throws b0 {
            if (a0(i15)) {
                return;
            }
            if (i15 <= (this.f36076c - this.f36094m) - this.f36092k) {
                throw b0.n();
            }
            throw b0.m();
        }

        private static long T(InputStream inputStream, long j15) throws b0 {
            try {
                return inputStream.skip(j15);
            } catch (b0 e15) {
                e15.j();
                throw e15;
            }
        }

        private void W(int i15) throws b0 {
            if (i15 < 0) {
                throw b0.g();
            }
            int i16 = this.f36094m;
            int i17 = this.f36092k;
            int i18 = i16 + i17 + i15;
            int i19 = this.f36095n;
            if (i18 > i19) {
                V((i19 - i16) - i17);
                throw b0.n();
            }
            this.f36094m = i16 + i17;
            int i25 = this.f36090i - i17;
            this.f36090i = 0;
            this.f36092k = 0;
            while (i25 < i15) {
                try {
                    long j15 = i15 - i25;
                    long jT = T(this.f36088g, j15);
                    if (jT < 0 || jT > j15) {
                        throw new IllegalStateException(this.f36088g.getClass() + "#skip returned invalid result: " + jT + "\nThe InputStream implementation is buggy.");
                    }
                    if (jT == 0) {
                        break;
                    } else {
                        i25 += (int) jT;
                    }
                } catch (Throwable th4) {
                    this.f36094m += i25;
                    R();
                    throw th4;
                }
            }
            this.f36094m += i25;
            R();
            if (i25 >= i15) {
                return;
            }
            int i26 = this.f36090i;
            int i27 = i26 - this.f36092k;
            this.f36092k = i26;
            S(1);
            while (true) {
                int i28 = i15 - i27;
                int i29 = this.f36090i;
                if (i28 <= i29) {
                    this.f36092k = i28;
                    return;
                } else {
                    i27 += i29;
                    this.f36092k = i29;
                    S(1);
                }
            }
        }

        private void X() throws b0 {
            if (this.f36090i - this.f36092k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() throws b0 {
            for (int i15 = 0; i15 < 10; i15++) {
                byte[] bArr = this.f36089h;
                int i16 = this.f36092k;
                this.f36092k = i16 + 1;
                if (bArr[i16] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void Z() throws b0 {
            for (int i15 = 0; i15 < 10; i15++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private boolean a0(int i15) throws b0 {
            int i16 = this.f36092k;
            int i17 = i16 + i15;
            int i18 = this.f36090i;
            if (i17 <= i18) {
                throw new IllegalStateException("refillBuffer() called when " + i15 + " bytes were already available in buffer");
            }
            int i19 = this.f36076c;
            int i25 = this.f36094m;
            if (i15 > (i19 - i25) - i16 || i25 + i16 + i15 > this.f36095n) {
                return false;
            }
            if (i16 > 0) {
                if (i18 > i16) {
                    byte[] bArr = this.f36089h;
                    System.arraycopy(bArr, i16, bArr, 0, i18 - i16);
                }
                this.f36094m += i16;
                this.f36090i -= i16;
                this.f36092k = 0;
            }
            InputStream inputStream = this.f36088g;
            byte[] bArr2 = this.f36089h;
            int i26 = this.f36090i;
            int iG = G(inputStream, bArr2, i26, Math.min(bArr2.length - i26, (this.f36076c - this.f36094m) - i26));
            if (iG == 0 || iG < -1 || iG > this.f36089h.length) {
                throw new IllegalStateException(this.f36088g.getClass() + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
            }
            if (iG <= 0) {
                return false;
            }
            this.f36090i += iG;
            R();
            if (this.f36090i >= i15) {
                return true;
            }
            return a0(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String A() throws IOException {
            byte[] bArrJ;
            int iO = O();
            int i15 = this.f36092k;
            int i16 = this.f36090i;
            if (iO <= i16 - i15 && iO > 0) {
                bArrJ = this.f36089h;
                this.f36092k = i15 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                i15 = 0;
                if (iO <= i16) {
                    S(iO);
                    bArrJ = this.f36089h;
                    this.f36092k = iO;
                } else {
                    bArrJ = J(iO, false);
                }
            }
            return s1.e(bArrJ, i15, iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int B() throws b0 {
            if (e()) {
                this.f36093l = 0;
                return 0;
            }
            int iO = O();
            this.f36093l = iO;
            if (t1.a(iO) != 0) {
                return this.f36093l;
            }
            throw b0.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean E(int i15) throws b0 {
            int iB = t1.b(i15);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(O());
                return true;
            }
            if (iB == 3) {
                U();
                a(t1.c(t1.a(i15), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw b0.e();
            }
            V(4);
            return true;
        }

        public byte I() throws b0 {
            if (this.f36092k == this.f36090i) {
                S(1);
            }
            byte[] bArr = this.f36089h;
            int i15 = this.f36092k;
            this.f36092k = i15 + 1;
            return bArr[i15];
        }

        public int M() throws b0 {
            int i15 = this.f36092k;
            if (this.f36090i - i15 < 4) {
                S(4);
                i15 = this.f36092k;
            }
            byte[] bArr = this.f36089h;
            this.f36092k = i15 + 4;
            return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
        }

        public long N() throws b0 {
            int i15 = this.f36092k;
            if (this.f36090i - i15 < 8) {
                S(8);
                i15 = this.f36092k;
            }
            byte[] bArr = this.f36089h;
            this.f36092k = i15 + 8;
            return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
        }

        public int O() {
            int i15;
            int i16 = this.f36092k;
            int i17 = this.f36090i;
            if (i17 != i16) {
                byte[] bArr = this.f36089h;
                int i18 = i16 + 1;
                byte b15 = bArr[i16];
                if (b15 >= 0) {
                    this.f36092k = i18;
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
                    this.f36092k = i19;
                    return i15;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j15;
            long j16;
            long j17;
            int i15 = this.f36092k;
            int i16 = this.f36090i;
            if (i16 != i15) {
                byte[] bArr = this.f36089h;
                int i17 = i15 + 1;
                byte b15 = bArr[i15];
                if (b15 >= 0) {
                    this.f36092k = i17;
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
                    this.f36092k = i18;
                    return j15;
                }
            }
            return Q();
        }

        long Q() throws b0 {
            long j15 = 0;
            for (int i15 = 0; i15 < 64; i15 += 7) {
                byte bI = I();
                j15 |= ((long) (bI & 127)) << i15;
                if ((bI & 128) == 0) {
                    return j15;
                }
            }
            throw b0.f();
        }

        public void U() throws b0 {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void V(int i15) throws b0 {
            int i16 = this.f36090i;
            int i17 = this.f36092k;
            if (i15 > i16 - i17 || i15 < 0) {
                W(i15);
            } else {
                this.f36092k = i17 + i15;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i15) throws b0 {
            if (this.f36093l != i15) {
                throw b0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int d() {
            return this.f36094m + this.f36092k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean e() {
            return this.f36092k == this.f36090i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void k(int i15) {
            this.f36095n = i15;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int l(int i15) throws b0 {
            if (i15 < 0) {
                throw b0.g();
            }
            int i16 = i15 + this.f36094m + this.f36092k;
            int i17 = this.f36095n;
            if (i16 > i17) {
                throw b0.n();
            }
            this.f36095n = i16;
            R();
            return i17;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h n() {
            int iO = O();
            int i15 = this.f36090i;
            int i16 = this.f36092k;
            if (iO > i15 - i16 || iO <= 0) {
                return iO == 0 ? h.f36058b : H(iO);
            }
            h hVarJ = h.j(this.f36089h, i16, iO);
            this.f36092k += iO;
            return hVarJ;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int x() {
            return i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long y() {
            return i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String z() throws b0 {
            int iO = O();
            if (iO > 0) {
                int i15 = this.f36090i;
                int i16 = this.f36092k;
                if (iO <= i15 - i16) {
                    String str = new String(this.f36089h, i16, iO, a0.f36000b);
                    this.f36092k += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO > this.f36090i) {
                return new String(J(iO, false), a0.f36000b);
            }
            S(iO);
            String str2 = new String(this.f36089h, this.f36092k, iO, a0.f36000b);
            this.f36092k += iO;
            return str2;
        }

        private c(InputStream inputStream, int i15) {
            super();
            this.f36095n = Integer.MAX_VALUE;
            a0.b(inputStream, "input");
            this.f36088g = inputStream;
            this.f36089h = new byte[i15];
            this.f36090i = 0;
            this.f36092k = 0;
            this.f36094m = 0;
        }
    }

    public static int b(int i15) {
        return (-(i15 & 1)) ^ (i15 >>> 1);
    }

    public static long c(long j15) {
        return (-(j15 & 1)) ^ (j15 >>> 1);
    }

    public static i f(InputStream inputStream) {
        return g(inputStream, PKIFailureInfo.certConfirmed);
    }

    public static i g(InputStream inputStream, int i15) {
        if (i15 > 0) {
            return inputStream == null ? h(a0.f36002d) : new c(inputStream, i15);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static i i(byte[] bArr, int i15, int i16) {
        return j(bArr, i15, i16, false);
    }

    static i j(byte[] bArr, int i15, int i16, boolean z15) {
        b bVar = new b(bArr, i15, i16, z15);
        try {
            bVar.l(i16);
            return bVar;
        } catch (b0 e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i15);

    public abstract void a(int i15);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i15);

    public abstract int l(int i15);

    public abstract boolean m();

    public abstract h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private i() {
        this.f36075b = f36073f;
        this.f36076c = Integer.MAX_VALUE;
        this.f36078e = false;
    }
}
