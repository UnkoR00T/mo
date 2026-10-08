package u7;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f195978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f195979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f195980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f195981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f195982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f195983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f195984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f195985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b<?> f195986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f195987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f195988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f195989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f195990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f195991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f195992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f195993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f195994q;

    private final class a implements b<float[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f195995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float[] f195996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f195997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float[] f195998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private double f195999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private double f196000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private double f196001g;

        a() {
            this.f195995a = new float[o.this.f195985h];
            this.f195996b = new float[o.this.f195985h * o.this.f195979b];
            this.f195997c = new float[o.this.f195985h * o.this.f195979b];
            this.f195998d = new float[o.this.f195985h * o.this.f195979b];
        }

        private float[] r(float[] fArr, int i15, int i16) {
            int length = fArr.length / o.this.f195979b;
            return i15 + i16 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i16) * o.this.f195979b);
        }

        private int s(float[] fArr, int i15, int i16, int i17) {
            int i18 = o.this.f195979b * i15;
            double d15 = 1.0d;
            int i19 = 0;
            double d16 = 0.0d;
            int i25 = 255;
            int i26 = i16;
            while (i26 <= i17) {
                double dAbs = 0.0d;
                for (int i27 = 0; i27 < i26; i27++) {
                    dAbs += (double) Math.abs(fArr[i18 + i27] - fArr[(i18 + i26) + i27]);
                }
                int i28 = i18;
                double d17 = i26;
                if (((double) i19) * dAbs < d15 * d17) {
                    i19 = i26;
                    d15 = dAbs;
                }
                if (((double) i25) * dAbs > d17 * d16) {
                    i25 = i26;
                    d16 = dAbs;
                }
                i26++;
                i18 = i28;
            }
            this.f195999e = d15 / ((double) i19);
            this.f196000f = d16 / ((double) i25);
            return i19;
        }

        private float w(float[] fArr, int i15, long j15, long j16) {
            float f15 = fArr[i15];
            float f16 = fArr[i15 + o.this.f195979b];
            long j17 = ((long) o.this.f195991n) * j15;
            long j18 = ((long) o.this.f195990m) * j16;
            long j19 = ((long) (o.this.f195990m + 1)) * j16;
            long j25 = j19 - j17;
            long j26 = j19 - j18;
            return ((j25 * f15) + ((j26 - j25) * f16)) / j26;
        }

        private void x(int i15, int i16, float[] fArr, int i17, float[] fArr2, int i18, float[] fArr3, int i19) {
            for (int i25 = 0; i25 < i16; i25++) {
                int i26 = (i17 * i16) + i25;
                int i27 = (i19 * i16) + i25;
                int i28 = (i18 * i16) + i25;
                for (int i29 = 0; i29 < i15; i29++) {
                    fArr[i26] = ((fArr2[i28] * (i15 - i29)) + (fArr3[i27] * i29)) / i15;
                    i26 += i16;
                    i28 += i16;
                    i27 += i16;
                }
            }
        }

        @Override // u7.o.b
        public void a(int i15, int i16) {
            for (int i17 = 0; i17 < o.this.f195979b * i16; i17++) {
                this.f195996b[i15 + i17] = 0.0f;
            }
        }

        @Override // u7.o.b
        public void b(int i15, int i16) {
            int i17 = o.this.f195985h / i16;
            int i18 = o.this.f195979b * i16;
            int i19 = i15 * o.this.f195979b;
            for (int i25 = 0; i25 < i17; i25++) {
                double d15 = 0.0d;
                for (int i26 = 0; i26 < i18; i26++) {
                    d15 += (double) this.f195996b[(i25 * i18) + i19 + i26];
                }
                this.f195995a[i25] = (float) (d15 / ((double) i18));
            }
        }

        @Override // u7.o.b
        public int c(int i15, int i16, int i17) {
            return s(this.f195996b, i15, i16, i17);
        }

        @Override // u7.o.b
        public void d(int i15) {
            this.f195997c = r(this.f195997c, o.this.f195988k, i15);
        }

        @Override // u7.o.b
        public boolean e() {
            if (this.f195999e == 0.0d || o.this.f195993p == 0) {
                return false;
            }
            double d15 = this.f196000f;
            double d16 = this.f195999e;
            return d15 <= d16 * 3.0d && d16 * 2.0d > this.f196001g * 3.0d;
        }

        @Override // u7.o.b
        public void f(int i15, int i16, int i17, int i18, int i19) {
            float[] fArr = this.f195997c;
            float[] fArr2 = this.f195996b;
            x(i15, i16, fArr, i17, fArr2, i18, fArr2, i19);
        }

        @Override // u7.o.b
        public void flush() {
            this.f196001g = 0.0d;
            this.f195999e = 0.0d;
            this.f196000f = 0.0d;
        }

        @Override // u7.o.b
        public void g(int i15) {
            this.f195996b = r(this.f195996b, o.this.f195987j, i15);
        }

        @Override // u7.o.b
        public int h(int i15, int i16, int i17) {
            return s(this.f195995a, i15, i16, i17);
        }

        @Override // u7.o.b
        public void i(int i15, long j15, long j16) {
            int i16 = 0;
            while (i16 < o.this.f195979b) {
                long j17 = j15;
                this.f195997c[(o.this.f195988k * o.this.f195979b) + i16] = w(this.f195998d, (o.this.f195979b * i15) + i16, j17, j16);
                i16++;
                j15 = j17;
            }
        }

        @Override // u7.o.b
        public void j() {
            this.f196001g = this.f195999e;
        }

        @Override // u7.o.b
        public void n(ByteBuffer byteBuffer, int i15) {
            byteBuffer.asFloatBuffer().get(this.f195996b, o.this.f195987j * o.this.f195979b, i15 / p());
            byteBuffer.position(byteBuffer.position() + i15);
        }

        @Override // u7.o.b
        public void o(int i15) {
            this.f195998d = r(this.f195998d, o.this.f195989l, i15);
        }

        @Override // u7.o.b
        public int p() {
            return 4;
        }

        @Override // u7.o.b
        public void q(ByteBuffer byteBuffer, int i15) {
            byteBuffer.asFloatBuffer().put(this.f195997c, 0, o.this.f195979b * i15);
            byteBuffer.position(byteBuffer.position() + (i15 * p() * o.this.f195979b));
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float[] k() {
            return this.f195996b;
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public float[] l() {
            return this.f195997c;
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public float[] m() {
            return this.f195998d;
        }
    }

    private interface b<T> {
        void a(int i15, int i16);

        void b(int i15, int i16);

        int c(int i15, int i16, int i17);

        void d(int i15);

        boolean e();

        void f(int i15, int i16, int i17, int i18, int i19);

        void flush();

        void g(int i15);

        int h(int i15, int i16, int i17);

        void i(int i15, long j15, long j16);

        void j();

        T k();

        T l();

        T m();

        void n(ByteBuffer byteBuffer, int i15);

        void o(int i15);

        int p();

        void q(ByteBuffer byteBuffer, int i15);
    }

    private final class c implements b<short[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f196003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short[] f196004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short[] f196005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private short[] f196006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f196007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f196008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f196009g;

        c() {
            this.f196003a = new short[o.this.f195985h];
            this.f196004b = new short[o.this.f195985h * o.this.f195979b];
            this.f196005c = new short[o.this.f195985h * o.this.f195979b];
            this.f196006d = new short[o.this.f195985h * o.this.f195979b];
        }

        private short[] r(short[] sArr, int i15, int i16) {
            int length = sArr.length / o.this.f195979b;
            return i15 + i16 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i16) * o.this.f195979b);
        }

        private int s(short[] sArr, int i15, int i16, int i17) {
            int i18 = i15 * o.this.f195979b;
            int i19 = GF2Field.MASK;
            int i25 = 1;
            int i26 = 0;
            int i27 = 0;
            while (i16 <= i17) {
                int iAbs = 0;
                for (int i28 = 0; i28 < i16; i28++) {
                    iAbs += Math.abs(sArr[i18 + i28] - sArr[(i18 + i16) + i28]);
                }
                if (iAbs * i26 < i25 * i16) {
                    i26 = i16;
                    i25 = iAbs;
                }
                if (iAbs * i19 > i27 * i16) {
                    i19 = i16;
                    i27 = iAbs;
                }
                i16++;
            }
            this.f196007e = i25 / i26;
            this.f196008f = i27 / i19;
            return i26;
        }

        private short w(short[] sArr, int i15, long j15, long j16) {
            short s15 = sArr[i15];
            short s16 = sArr[i15 + o.this.f195979b];
            long j17 = ((long) o.this.f195991n) * j15;
            long j18 = ((long) o.this.f195990m) * j16;
            long j19 = ((long) (o.this.f195990m + 1)) * j16;
            long j25 = j19 - j17;
            long j26 = j19 - j18;
            return (short) (((((long) s15) * j25) + ((j26 - j25) * ((long) s16))) / j26);
        }

        private void x(int i15, int i16, short[] sArr, int i17, short[] sArr2, int i18, short[] sArr3, int i19) {
            for (int i25 = 0; i25 < i16; i25++) {
                int i26 = (i17 * i16) + i25;
                int i27 = (i19 * i16) + i25;
                int i28 = (i18 * i16) + i25;
                for (int i29 = 0; i29 < i15; i29++) {
                    sArr[i26] = (short) (((sArr2[i28] * (i15 - i29)) + (sArr3[i27] * i29)) / i15);
                    i26 += i16;
                    i28 += i16;
                    i27 += i16;
                }
            }
        }

        @Override // u7.o.b
        public void a(int i15, int i16) {
            for (int i17 = 0; i17 < o.this.f195979b * i16; i17++) {
                this.f196004b[i15 + i17] = 0;
            }
        }

        @Override // u7.o.b
        public void b(int i15, int i16) {
            short[] sArr = this.f196004b;
            int i17 = o.this.f195985h / i16;
            int i18 = o.this.f195979b * i16;
            int i19 = i15 * o.this.f195979b;
            for (int i25 = 0; i25 < i17; i25++) {
                int i26 = 0;
                for (int i27 = 0; i27 < i18; i27++) {
                    i26 += sArr[(i25 * i18) + i19 + i27];
                }
                this.f196003a[i25] = (short) (i26 / i18);
            }
        }

        @Override // u7.o.b
        public int c(int i15, int i16, int i17) {
            return s(this.f196004b, i15, i16, i17);
        }

        @Override // u7.o.b
        public void d(int i15) {
            this.f196005c = r(this.f196005c, o.this.f195988k, i15);
        }

        @Override // u7.o.b
        public boolean e() {
            if (this.f196007e == 0 || o.this.f195993p == 0) {
                return false;
            }
            int i15 = this.f196008f;
            int i16 = this.f196007e;
            return i15 <= i16 * 3 && i16 * 2 > this.f196009g * 3;
        }

        @Override // u7.o.b
        public void f(int i15, int i16, int i17, int i18, int i19) {
            short[] sArr = this.f196005c;
            short[] sArr2 = this.f196004b;
            x(i15, i16, sArr, i17, sArr2, i18, sArr2, i19);
        }

        @Override // u7.o.b
        public void flush() {
            this.f196009g = 0;
            this.f196007e = 0;
            this.f196008f = 0;
        }

        @Override // u7.o.b
        public void g(int i15) {
            this.f196004b = r(this.f196004b, o.this.f195987j, i15);
        }

        @Override // u7.o.b
        public int h(int i15, int i16, int i17) {
            return s(this.f196003a, i15, i16, i17);
        }

        @Override // u7.o.b
        public void i(int i15, long j15, long j16) {
            int i16 = 0;
            while (i16 < o.this.f195979b) {
                long j17 = j15;
                this.f196005c[(o.this.f195988k * o.this.f195979b) + i16] = w(this.f196006d, (o.this.f195979b * i15) + i16, j17, j16);
                i16++;
                j15 = j17;
            }
        }

        @Override // u7.o.b
        public void j() {
            this.f196009g = this.f196007e;
        }

        @Override // u7.o.b
        public void n(ByteBuffer byteBuffer, int i15) {
            byteBuffer.asShortBuffer().get(this.f196004b, o.this.f195987j * o.this.f195979b, i15 / 2);
            byteBuffer.position(byteBuffer.position() + i15);
        }

        @Override // u7.o.b
        public void o(int i15) {
            this.f196006d = r(this.f196006d, o.this.f195989l, i15);
        }

        @Override // u7.o.b
        public int p() {
            return 2;
        }

        @Override // u7.o.b
        public void q(ByteBuffer byteBuffer, int i15) {
            byteBuffer.asShortBuffer().put(this.f196005c, 0, o.this.f195979b * i15);
            byteBuffer.position(byteBuffer.position() + (i15 * p() * o.this.f195979b));
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public short[] k() {
            return this.f196004b;
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public short[] l() {
            return this.f196005c;
        }

        @Override // u7.o.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public short[] m() {
            return this.f196006d;
        }
    }

    public o(int i15, int i16, float f15, float f16, int i17, boolean z15) {
        this.f195978a = i15;
        this.f195979b = i16;
        this.f195980c = f15;
        this.f195981d = f16;
        this.f195982e = i15 / i17;
        this.f195983f = i15 / 400;
        int i18 = i15 / 65;
        this.f195984g = i18;
        this.f195985h = i18 * 2;
        this.f195986i = z15 ? new a() : new c();
    }

    private void i(float f15, int i15) {
        int i16;
        int i17;
        if (this.f195988k == i15) {
            return;
        }
        int i18 = this.f195978a;
        long j15 = (long) (i18 / f15);
        long j16 = i18;
        while (j15 != 0 && j16 != 0 && j15 % 2 == 0 && j16 % 2 == 0) {
            j15 /= 2;
            j16 /= 2;
        }
        s(i15);
        int i19 = 0;
        while (true) {
            int i25 = this.f195989l;
            if (i19 >= i25 - 1) {
                w(i25 - 1);
                return;
            }
            while (true) {
                i16 = this.f195990m;
                long j17 = ((long) (i16 + 1)) * j15;
                i17 = this.f195991n;
                if (j17 <= ((long) i17) * j16) {
                    break;
                }
                this.f195986i.d(1);
                this.f195986i.i(i19, j16, j15);
                this.f195991n++;
                this.f195988k++;
            }
            int i26 = i16 + 1;
            this.f195990m = i26;
            if (i26 == j16) {
                this.f195990m = 0;
                zj.p.w(((long) i17) == j15);
                this.f195991n = 0;
            }
            i19++;
        }
    }

    private void j(double d15) {
        int iY;
        int i15 = this.f195987j;
        if (i15 < this.f195985h) {
            return;
        }
        int i16 = 0;
        do {
            if (this.f195992o > 0) {
                iY = k(i16);
            } else {
                int iM = m(i16);
                iY = d15 > 1.0d ? iM + y(i16, d15, iM) : r(i16, d15, iM);
            }
            i16 += iY;
        } while (this.f195985h + i16 <= i15);
        x(i16);
    }

    private int k(int i15) {
        int iMin = Math.min(this.f195985h, this.f195992o);
        l(i15, iMin);
        this.f195992o -= iMin;
        return iMin;
    }

    private void l(int i15, int i16) {
        this.f195986i.d(i16);
        Object objK = this.f195986i.k();
        int i17 = i15 * this.f195979b;
        Object objL = this.f195986i.l();
        int i18 = this.f195988k;
        int i19 = this.f195979b;
        System.arraycopy(objK, i17, objL, i18 * i19, i19 * i16);
        this.f195988k += i16;
    }

    private int m(int i15) {
        int iH;
        int i16 = this.f195978a;
        int i17 = i16 > 4000 ? i16 / 4000 : 1;
        if (this.f195979b == 1 && i17 == 1) {
            iH = this.f195986i.c(i15, this.f195983f, this.f195984g);
        } else {
            this.f195986i.b(i15, i17);
            int iH2 = this.f195986i.h(0, this.f195983f / i17, this.f195984g / i17);
            if (i17 != 1) {
                int i18 = iH2 * i17;
                int i19 = i17 * 4;
                int i25 = i18 - i19;
                int i26 = i18 + i19;
                int i27 = this.f195983f;
                if (i25 < i27) {
                    i25 = i27;
                }
                int i28 = this.f195984g;
                if (i26 > i28) {
                    i26 = i28;
                }
                if (this.f195979b == 1) {
                    iH = this.f195986i.c(i15, i25, i26);
                } else {
                    this.f195986i.b(i15, 1);
                    iH = this.f195986i.h(0, i25, i26);
                }
            } else {
                iH = iH2;
            }
        }
        int i29 = this.f195986i.e() ? this.f195993p : iH;
        this.f195986i.j();
        this.f195993p = iH;
        return i29;
    }

    private int r(int i15, double d15, int i16) {
        int i17;
        if (d15 < 0.5d) {
            double d16 = ((((double) i16) * d15) / (1.0d - d15)) + this.f195994q;
            int iRound = (int) Math.round(d16);
            this.f195994q = d16 - ((double) iRound);
            i17 = iRound;
        } else {
            double d17 = ((((double) i16) * ((2.0d * d15) - 1.0d)) / (1.0d - d15)) + this.f195994q;
            int iRound2 = (int) Math.round(d17);
            this.f195992o = iRound2;
            this.f195994q = d17 - ((double) iRound2);
            i17 = i16;
        }
        int i18 = i16 + i17;
        this.f195986i.d(i18);
        Object objK = this.f195986i.k();
        int i19 = this.f195979b * i15;
        Object objL = this.f195986i.l();
        int i25 = this.f195988k;
        int i26 = this.f195979b;
        System.arraycopy(objK, i19, objL, i25 * i26, i26 * i16);
        this.f195986i.f(i17, this.f195979b, this.f195988k + i16, i15 + i16, i15);
        this.f195988k += i18;
        return i17;
    }

    private void s(int i15) {
        int i16 = this.f195988k - i15;
        this.f195986i.o(i16);
        Object objL = this.f195986i.l();
        int i17 = this.f195979b * i15;
        Object objM = this.f195986i.m();
        int i18 = this.f195989l;
        int i19 = this.f195979b;
        System.arraycopy(objL, i17, objM, i18 * i19, i19 * i16);
        this.f195988k = i15;
        this.f195989l += i16;
    }

    private void t() {
        int i15 = this.f195988k;
        float f15 = this.f195980c;
        float f16 = this.f195981d;
        double d15 = f15 / f16;
        float f17 = this.f195982e * f16;
        if (d15 > 1.0000100135803223d || d15 < 0.9999899864196777d) {
            j(d15);
        } else {
            l(0, this.f195987j);
            this.f195987j = 0;
        }
        if (f17 != 1.0f) {
            i(f17, i15);
        }
    }

    private void w(int i15) {
        if (i15 == 0) {
            return;
        }
        System.arraycopy(this.f195986i.m(), this.f195979b * i15, this.f195986i.m(), 0, (this.f195989l - i15) * this.f195979b);
        this.f195989l -= i15;
    }

    private void x(int i15) {
        int i16 = this.f195987j - i15;
        System.arraycopy(this.f195986i.k(), i15 * this.f195979b, this.f195986i.k(), 0, this.f195979b * i16);
        this.f195987j = i16;
    }

    private int y(int i15, double d15, int i16) {
        int i17;
        if (d15 >= 2.0d) {
            double d16 = (((double) i16) / (d15 - 1.0d)) + this.f195994q;
            int iRound = (int) Math.round(d16);
            this.f195994q = d16 - ((double) iRound);
            i17 = iRound;
        } else {
            double d17 = ((((double) i16) * (2.0d - d15)) / (d15 - 1.0d)) + this.f195994q;
            int iRound2 = (int) Math.round(d17);
            this.f195992o = iRound2;
            this.f195994q = d17 - ((double) iRound2);
            i17 = i16;
        }
        this.f195986i.d(i17);
        this.f195986i.f(i17, this.f195979b, this.f195988k, i15, i15 + i16);
        this.f195988k += i17;
        return i17;
    }

    public void n() {
        this.f195987j = 0;
        this.f195988k = 0;
        this.f195989l = 0;
        this.f195990m = 0;
        this.f195991n = 0;
        this.f195992o = 0;
        this.f195993p = 0;
        this.f195994q = 0.0d;
        this.f195986i.flush();
    }

    public void o(ByteBuffer byteBuffer) {
        zj.p.w(this.f195988k >= 0);
        int iMin = Math.min(byteBuffer.remaining() / (this.f195979b * this.f195986i.p()), this.f195988k);
        this.f195986i.q(byteBuffer, iMin);
        this.f195988k -= iMin;
        System.arraycopy(this.f195986i.l(), iMin * this.f195979b, this.f195986i.l(), 0, this.f195988k * this.f195979b);
    }

    public int p() {
        zj.p.w(this.f195988k >= 0);
        return this.f195988k * this.f195979b * this.f195986i.p();
    }

    public int q() {
        return this.f195987j * this.f195979b * this.f195986i.p();
    }

    public void u() {
        int i15 = this.f195987j;
        float f15 = this.f195980c;
        float f16 = this.f195981d;
        double d15 = f15 / f16;
        double d16 = this.f195982e * f16;
        int i16 = this.f195992o;
        int i17 = this.f195988k + ((int) ((((((((double) (i15 - i16)) / d15) + ((double) i16)) + this.f195994q) + ((double) this.f195989l)) / d16) + 0.5d));
        this.f195994q = 0.0d;
        this.f195986i.g((this.f195985h * 2) + i15);
        this.f195986i.a(i15 * this.f195979b, this.f195985h * 2);
        this.f195987j += this.f195985h * 2;
        t();
        if (this.f195988k > i17) {
            this.f195988k = Math.max(i17, 0);
        }
        this.f195987j = 0;
        this.f195992o = 0;
        this.f195989l = 0;
    }

    public void v(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int iP = iRemaining / (this.f195979b * this.f195986i.p());
        this.f195986i.g(iP);
        this.f195986i.n(byteBuffer, iRemaining);
        this.f195987j += iP;
        t();
    }
}
