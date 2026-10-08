package h8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.b f81807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f81809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f81810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f81811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f81812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f81813g;

    private static final class a implements k8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f81814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f81815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k8.a f81816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f81817d;

        public a(long j15, int i15) {
            d(j15, i15);
        }

        @Override // k8.b.a
        public k8.a a() {
            return (k8.a) zj.p.q(this.f81816c);
        }

        public a b() {
            this.f81816c = null;
            a aVar = this.f81817d;
            this.f81817d = null;
            return aVar;
        }

        public void c(k8.a aVar, a aVar2) {
            this.f81816c = aVar;
            this.f81817d = aVar2;
        }

        public void d(long j15, int i15) {
            zj.p.w(this.f81816c == null);
            this.f81814a = j15;
            this.f81815b = j15 + ((long) i15);
        }

        public int e(long j15) {
            return ((int) (j15 - this.f81814a)) + this.f81816c.f109048b;
        }

        @Override // k8.b.a
        public k8.b.a next() {
            a aVar = this.f81817d;
            if (aVar == null || aVar.f81816c == null) {
                return null;
            }
            return aVar;
        }
    }

    public w0(k8.b bVar) {
        this.f81807a = bVar;
        int iE = bVar.e();
        this.f81808b = iE;
        this.f81809c = new w7.c0(32);
        a aVar = new a(0L, iE);
        this.f81810d = aVar;
        this.f81811e = aVar;
        this.f81812f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f81816c == null) {
            return;
        }
        this.f81807a.c(aVar);
        aVar.b();
    }

    private static a c(a aVar, long j15) {
        while (j15 >= aVar.f81815b) {
            aVar = aVar.f81817d;
        }
        return aVar;
    }

    private void f(int i15) {
        long j15 = this.f81813g + ((long) i15);
        this.f81813g = j15;
        a aVar = this.f81812f;
        if (j15 == aVar.f81815b) {
            this.f81812f = aVar.f81817d;
        }
    }

    private int g(int i15) {
        a aVar = this.f81812f;
        if (aVar.f81816c == null) {
            aVar.c(this.f81807a.a(), new a(this.f81812f.f81815b, this.f81808b));
        }
        return Math.min(i15, (int) (this.f81812f.f81815b - this.f81813g));
    }

    private static a h(a aVar, long j15, ByteBuffer byteBuffer, int i15) {
        a aVarC = c(aVar, j15);
        while (i15 > 0) {
            int iMin = Math.min(i15, (int) (aVarC.f81815b - j15));
            byteBuffer.put(aVarC.f81816c.f109047a, aVarC.e(j15), iMin);
            i15 -= iMin;
            j15 += (long) iMin;
            if (j15 == aVarC.f81815b) {
                aVarC = aVarC.f81817d;
            }
        }
        return aVarC;
    }

    private static a i(a aVar, long j15, byte[] bArr, int i15) {
        a aVarC = c(aVar, j15);
        int i16 = i15;
        while (i16 > 0) {
            int iMin = Math.min(i16, (int) (aVarC.f81815b - j15));
            System.arraycopy(aVarC.f81816c.f109047a, aVarC.e(j15), bArr, i15 - i16, iMin);
            i16 -= iMin;
            j15 += (long) iMin;
            if (j15 == aVarC.f81815b) {
                aVarC = aVarC.f81817d;
            }
        }
        return aVarC;
    }

    private static a j(a aVar, z7.f fVar, y0.b bVar, w7.c0 c0Var) {
        long j15 = bVar.f81862b;
        int iY = 1;
        c0Var.b0(1);
        a aVarI = i(aVar, j15, c0Var.f(), 1);
        long j16 = j15 + 1;
        byte b15 = c0Var.f()[0];
        boolean z15 = (b15 & 128) != 0;
        int i15 = b15 & 127;
        z7.c cVar = fVar.f233227c;
        byte[] bArr = cVar.f233214a;
        if (bArr == null) {
            cVar.f233214a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j16, cVar.f233214a, i15);
        long j17 = j16 + ((long) i15);
        if (z15) {
            c0Var.b0(2);
            aVarI2 = i(aVarI2, j17, c0Var.f(), 2);
            j17 += 2;
            iY = c0Var.Y();
        }
        int i16 = iY;
        int[] iArr = cVar.f233217d;
        if (iArr == null || iArr.length < i16) {
            iArr = new int[i16];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f233218e;
        if (iArr3 == null || iArr3.length < i16) {
            iArr3 = new int[i16];
        }
        int[] iArr4 = iArr3;
        if (z15) {
            int i17 = i16 * 6;
            c0Var.b0(i17);
            aVarI2 = i(aVarI2, j17, c0Var.f(), i17);
            j17 += (long) i17;
            c0Var.f0(0);
            for (int i18 = 0; i18 < i16; i18++) {
                iArr2[i18] = c0Var.Y();
                iArr4[i18] = c0Var.U();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f81861a - ((int) (j17 - bVar.f81862b));
        }
        o8.s0.a aVar2 = (o8.s0.a) w7.o0.h(bVar.f81863c);
        cVar.c(i16, iArr2, iArr4, aVar2.f143192b, cVar.f233214a, aVar2.f143191a, aVar2.f143193c, aVar2.f143194d);
        long j18 = bVar.f81862b;
        int i19 = (int) (j17 - j18);
        bVar.f81862b = j18 + ((long) i19);
        bVar.f81861a -= i19;
        return aVarI2;
    }

    private static a k(a aVar, z7.f fVar, y0.b bVar, w7.c0 c0Var) {
        if (fVar.z()) {
            aVar = j(aVar, fVar, bVar, c0Var);
        }
        if (!fVar.o()) {
            fVar.x(bVar.f81861a);
            return h(aVar, bVar.f81862b, fVar.f233228d, bVar.f81861a);
        }
        c0Var.b0(4);
        a aVarI = i(aVar, bVar.f81862b, c0Var.f(), 4);
        int iU = c0Var.U();
        bVar.f81862b += 4;
        bVar.f81861a -= 4;
        fVar.x(iU);
        a aVarH = h(aVarI, bVar.f81862b, fVar.f233228d, iU);
        bVar.f81862b += (long) iU;
        int i15 = bVar.f81861a - iU;
        bVar.f81861a = i15;
        fVar.B(i15);
        return h(aVarH, bVar.f81862b, fVar.f233231g, bVar.f81861a);
    }

    public void b(long j15) {
        a aVar;
        if (j15 == -1) {
            return;
        }
        while (true) {
            aVar = this.f81810d;
            if (j15 < aVar.f81815b) {
                break;
            }
            this.f81807a.d(aVar.f81816c);
            this.f81810d = this.f81810d.b();
        }
        if (this.f81811e.f81814a < aVar.f81814a) {
            this.f81811e = aVar;
        }
    }

    public long d() {
        return this.f81813g;
    }

    public void e(z7.f fVar, y0.b bVar) {
        k(this.f81811e, fVar, bVar, this.f81809c);
    }

    public void l(z7.f fVar, y0.b bVar) {
        this.f81811e = k(this.f81811e, fVar, bVar, this.f81809c);
    }

    public void m() {
        a(this.f81810d);
        this.f81810d.d(0L, this.f81808b);
        a aVar = this.f81810d;
        this.f81811e = aVar;
        this.f81812f = aVar;
        this.f81813g = 0L;
        this.f81807a.b();
    }

    public void n() {
        this.f81811e = this.f81810d;
    }

    public int o(t7.h hVar, int i15, boolean z15) throws EOFException {
        int iG = g(i15);
        a aVar = this.f81812f;
        int i16 = hVar.read(aVar.f81816c.f109047a, aVar.e(this.f81813g), iG);
        if (i16 != -1) {
            f(i16);
            return i16;
        }
        if (z15) {
            return -1;
        }
        throw new EOFException();
    }

    public void p(w7.c0 c0Var, int i15) {
        while (i15 > 0) {
            int iG = g(i15);
            a aVar = this.f81812f;
            c0Var.u(aVar.f81816c.f109047a, aVar.e(this.f81813g), iG);
            i15 -= iG;
            f(iG);
        }
    }
}
