package cp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class f extends OutputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b[] f37193q = new b[64];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final b[] f37194r = new b[40];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final b[] f37195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final b[] f37196t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f37198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f37202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f37203g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f37209n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final OutputStream f37210p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37197a = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37204h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37205j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37206k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f37207l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte f37208m = 0;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f37211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f37212b;

        private b(int i15, int i16) {
            this.f37211a = i15;
            this.f37212b = i16;
        }
    }

    static {
        int i15 = 0;
        while (true) {
            if (i15 >= e.f37166v.length) {
                break;
            }
            int i16 = i15 + 4;
            int i17 = 0;
            while (true) {
                short[] sArr = e.f37166v[i15];
                if (i17 < sArr.length) {
                    short s15 = e.f37167w[i15][i17];
                    short s16 = sArr[i17];
                    if (s15 < 64) {
                        f37193q[s15] = new b(s16, i16);
                    } else {
                        f37194r[(s15 / 64) - 1] = new b(s16, i16);
                    }
                    i17++;
                }
            }
            i15++;
        }
        f37195s = new b[64];
        f37196t = new b[40];
        for (int i18 = 0; i18 < e.f37164s.length; i18++) {
            int i19 = i18 + 2;
            int i25 = 0;
            while (true) {
                short[] sArr2 = e.f37164s[i18];
                if (i25 < sArr2.length) {
                    short s17 = e.f37165t[i18][i25];
                    short s18 = sArr2[i25];
                    if (s17 < 64) {
                        f37195s[s17] = new b(s18, i19);
                    } else {
                        f37196t[(s17 / 64) - 1] = new b(s18, i19);
                    }
                    i25++;
                }
            }
        }
    }

    f(OutputStream outputStream, int i15, int i16, int i17) {
        this.f37210p = outputStream;
        this.f37200d = i15;
        this.f37201e = i16;
        this.f37209n = i17;
        this.f37203g = new int[i15];
        this.f37202f = new int[i15];
        int i18 = (i15 + 7) / 8;
        this.f37199c = i18;
        this.f37198b = new byte[i18];
    }

    private void C(int i15, int i16) throws IOException {
        for (int i17 = 0; i17 < i16; i17++) {
            boolean z15 = ((i15 >> ((i16 - i17) - 1)) & 1) == 1;
            if (this.f37209n == 1) {
                this.f37207l = (byte) ((z15 ? 1 << (7 - (this.f37208m % 8)) : 0) | this.f37207l);
            } else {
                this.f37207l = (byte) ((z15 ? 1 << (this.f37208m % 8) : 0) | this.f37207l);
            }
            byte b15 = (byte) (this.f37208m + 1);
            this.f37208m = b15;
            if (b15 == 8) {
                this.f37210p.write(this.f37207l);
                b();
            }
        }
    }

    private void E() throws IOException {
        C(1, 12);
    }

    private void H(int i15, boolean z15) throws IOException {
        int length = i15 / 64;
        b[] bVarArr = z15 ? f37194r : f37196t;
        while (length > 0) {
            if (length >= bVarArr.length) {
                C(bVarArr[bVarArr.length - 1].f37211a, bVarArr[bVarArr.length - 1].f37212b);
                length -= bVarArr.length;
            } else {
                b bVar = bVarArr[length - 1];
                C(bVar.f37211a, bVar.f37212b);
                length = 0;
            }
        }
        b bVar2 = z15 ? f37193q[i15 % 64] : f37195s[i15 % 64];
        C(bVar2.f37211a, bVar2.f37212b);
    }

    private void b() {
        this.f37207l = (byte) 0;
        this.f37208m = (byte) 0;
    }

    private void h() throws IOException {
        boolean z15 = true;
        int i15 = 0;
        while (i15 < this.f37200d) {
            int[] iArrU = u(i15, z15);
            int[] iArrY = y(i15, z15);
            int i16 = iArrU[0];
            int i17 = i16 - iArrY[0];
            if (i16 > iArrY[1]) {
                C(1, 4);
                i15 = iArrY[1];
            } else if (i17 > 3 || i17 < -3) {
                C(1, 3);
                H(iArrU[0] - i15, z15);
                H(iArrU[1] - iArrU[0], !z15);
                i15 = iArrU[1];
            } else {
                switch (i17) {
                    case -3:
                        C(2, 7);
                        break;
                    case -2:
                        C(2, 6);
                        break;
                    case -1:
                        C(2, 3);
                        break;
                    case 0:
                        C(1, 1);
                        break;
                    case 1:
                        C(3, 3);
                        break;
                    case 2:
                        C(3, 6);
                        break;
                    case 3:
                        C(3, 7);
                        break;
                }
                z15 = !z15;
                i15 = iArrY[0] + i17;
            }
        }
    }

    private void m() throws IOException {
        this.f37204h++;
        int[] iArr = this.f37203g;
        this.f37203g = this.f37202f;
        this.f37202f = iArr;
        this.f37206k = this.f37205j;
        this.f37205j = 0;
        boolean z15 = true;
        for (int i15 = 0; i15 < this.f37200d; i15++) {
            if ((((this.f37198b[i15 / 8] >> (7 - (i15 % 8))) & 1) == 1) == z15) {
                int[] iArr2 = this.f37202f;
                int i16 = this.f37205j;
                iArr2[i16] = i15;
                this.f37205j = i16 + 1;
                z15 = !z15;
            }
        }
        p();
        if (this.f37204h == this.f37201e) {
            E();
            E();
            r();
        }
    }

    private void p() throws IOException {
        h();
    }

    private void r() throws IOException {
        if (this.f37208m != 0) {
            this.f37210p.write(this.f37207l);
        }
        b();
    }

    private int[] u(int i15, boolean z15) {
        int i16 = this.f37200d;
        int[] iArr = {i16, i16};
        int i17 = 0;
        while (true) {
            int i18 = this.f37205j;
            if (i17 >= i18) {
                break;
            }
            int[] iArr2 = this.f37202f;
            int i19 = iArr2[i17];
            if (i15 < i19 || (i15 == 0 && z15)) {
                iArr[0] = i19;
                int i25 = i17 + 1;
                if (i25 >= i18) {
                    break;
                }
                iArr[1] = iArr2[i25];
                break;
            }
            i17++;
        }
        return iArr;
    }

    private int[] y(int i15, boolean z15) {
        int i16 = this.f37200d;
        int[] iArr = {i16, i16};
        int i17 = !z15 ? 1 : 0;
        while (true) {
            int i18 = this.f37206k;
            if (i17 >= i18) {
                break;
            }
            int[] iArr2 = this.f37203g;
            int i19 = iArr2[i17];
            if (i19 > i15 || (i15 == 0 && i17 == 0)) {
                iArr[0] = i19;
                int i25 = i17 + 1;
                if (i25 >= i18) {
                    break;
                }
                iArr[1] = iArr2[i25];
                break;
            }
            i17 += 2;
        }
        return iArr;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37210p.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f37210p.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        byte[] bArr = this.f37198b;
        int i16 = this.f37197a;
        bArr[i16] = (byte) i15;
        int i17 = i16 + 1;
        this.f37197a = i17;
        if (i17 == this.f37199c) {
            m();
            this.f37197a = 0;
        }
    }
}
