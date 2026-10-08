package w9;

import android.util.Pair;
import java.util.Arrays;
import o8.q;
import t7.x;
import w7.c0;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f211133a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f211134b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f211135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f211136b;

        private a(int i15, long j15) {
            this.f211135a = i15;
            this.f211136b = j15;
        }

        public static a a(q qVar, c0 c0Var) {
            qVar.p(c0Var.f(), 0, 8);
            c0Var.f0(0);
            return new a(c0Var.z(), c0Var.G());
        }
    }

    public static boolean a(q qVar) {
        c0 c0Var = new c0(8);
        int i15 = a.a(qVar, c0Var).f211135a;
        if (i15 != 1380533830 && i15 != 1380333108) {
            return false;
        }
        qVar.p(c0Var.f(), 0, 4);
        c0Var.f0(0);
        int iZ = c0Var.z();
        if (iZ == 1463899717) {
            return true;
        }
        t.c("WavHeaderReader", "Unsupported form type: " + iZ);
        return false;
    }

    public static c b(q qVar) throws x {
        byte[] bArr;
        c0 c0Var = new c0(16);
        a aVarD = d(1718449184, qVar, c0Var);
        p.w(aVarD.f211136b >= 16);
        qVar.p(c0Var.f(), 0, 16);
        c0Var.f0(0);
        int I = c0Var.I();
        int I2 = c0Var.I();
        int iH = c0Var.H();
        int iH2 = c0Var.H();
        int I3 = c0Var.I();
        int I4 = c0Var.I();
        int i15 = ((int) aVarD.f211136b) - 16;
        if (i15 > 0) {
            bArr = new byte[i15];
            qVar.p(bArr, 0, i15);
            if (I == 65534 && i15 == 24) {
                c0 c0Var2 = new c0(bArr);
                c0Var2.I();
                int I5 = c0Var2.I();
                if (I5 != 0 && I5 != I4) {
                    throw x.c("validBits ( " + I5 + ")  != bitsPerSample( " + I4 + ") are not supported");
                }
                int iH3 = c0Var2.H();
                if ((iH3 >> 18) != 0) {
                    throw x.c("invalid channel mask " + iH3);
                }
                if (iH3 != 0 && Integer.bitCount(iH3) != I2) {
                    throw x.c("invalid number of channels (" + Integer.bitCount(iH3) + ") in channel mask " + iH3);
                }
                I = c0Var2.I();
                byte[] bArr2 = new byte[14];
                c0Var2.u(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f211133a) && !Arrays.equals(bArr2, f211134b)) {
                    throw x.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = o0.f210729f;
        }
        byte[] bArr3 = bArr;
        int i16 = I;
        qVar.n((int) (qVar.j() - qVar.getPosition()));
        return new c(i16, I2, iH, iH2, I3, I4, bArr3);
    }

    public static long c(q qVar) {
        c0 c0Var = new c0(8);
        a aVarA = a.a(qVar, c0Var);
        if (aVarA.f211135a != 1685272116) {
            qVar.g();
            return -1L;
        }
        qVar.k(8);
        c0Var.f0(0);
        qVar.p(c0Var.f(), 0, 8);
        long jE = c0Var.E();
        qVar.n(((int) aVarA.f211136b) + 8);
        return jE;
    }

    private static a d(int i15, q qVar, c0 c0Var) throws x {
        a aVarA = a.a(qVar, c0Var);
        while (aVarA.f211135a != i15) {
            t.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f211135a);
            long j15 = aVarA.f211136b;
            long j16 = 8 + j15;
            if (j15 % 2 != 0) {
                j16 = 9 + j15;
            }
            if (j16 > 2147483647L) {
                throw x.c("Chunk is too large (~2GB+) to skip; id: " + aVarA.f211135a);
            }
            qVar.n((int) j16);
            aVarA = a.a(qVar, c0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(q qVar) throws x {
        qVar.g();
        a aVarD = d(1684108385, qVar, new c0(8));
        qVar.n(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(aVarD.f211136b));
    }
}
