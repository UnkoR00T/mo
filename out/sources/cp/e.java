package cp;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class e extends FilterInputStream {
    static final c A;
    static final c B;
    static final c C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final short[][] f37164s = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final short[][] f37165t = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, 576, 896, 960, 1024, 1088, 1152, 1216}};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final short[][] f37166v = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final short[][] f37167w = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, 512, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final b f37168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final b f37169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final c f37170z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f37172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f37177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37178h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f37180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f37181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37183n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f37185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37186r;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b f37187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f37188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f37190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f37191e;

        private b() {
            this.f37190d = false;
            this.f37191e = false;
        }

        void a(boolean z15, b bVar) {
            if (z15) {
                this.f37188b = bVar;
            } else {
                this.f37187a = bVar;
            }
        }

        b b(boolean z15) {
            return z15 ? this.f37188b : this.f37187a;
        }

        public String toString() {
            return "[leaf=" + this.f37191e + ", value=" + this.f37189c + ", canBeFill=" + this.f37190d + "]";
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f37192a;

        private c() {
            this.f37192a = new b();
        }

        void a(int i15, int i16, int i17) throws IOException {
            b bVar = this.f37192a;
            for (int i18 = 0; i18 < i15; i18++) {
                int i19 = i15 - 1;
                boolean z15 = ((i16 >> (i19 - i18)) & 1) == 1;
                b bVarB = bVar.b(z15);
                if (bVarB == null) {
                    bVarB = new b();
                    if (i18 == i19) {
                        bVarB.f37189c = i17;
                        bVarB.f37191e = true;
                    }
                    if (i16 == 0) {
                        bVarB.f37190d = true;
                    }
                    bVar.a(z15, bVarB);
                } else if (bVarB.f37191e) {
                    throw new IOException("node is leaf, no other following");
                }
                bVar = bVarB;
            }
        }

        void b(int i15, int i16, b bVar) throws IOException {
            b bVar2 = this.f37192a;
            int i17 = 0;
            while (i17 < i15) {
                int i18 = i15 - 1;
                boolean z15 = ((i16 >> (i18 - i17)) & 1) == 1;
                b bVarB = bVar2.b(z15);
                if (bVarB == null) {
                    b bVar3 = i17 == i18 ? bVar : new b();
                    if (i16 == 0) {
                        bVar3.f37190d = true;
                    }
                    bVar2.a(z15, bVar3);
                    bVar2 = bVar3;
                } else {
                    if (bVarB.f37191e) {
                        throw new IOException("node is leaf, no other following");
                    }
                    bVar2 = bVarB;
                }
                i17++;
            }
        }
    }

    static {
        b bVar = new b();
        f37168x = bVar;
        bVar.f37191e = true;
        bVar.f37189c = -2000;
        b bVar2 = new b();
        f37169y = bVar2;
        bVar2.f37189c = -1000;
        bVar2.f37187a = bVar2;
        bVar2.f37188b = bVar;
        c cVar = new c();
        B = cVar;
        try {
            cVar.b(12, 0, bVar2);
            cVar.b(12, 1, bVar);
            f37170z = new c();
            for (int i15 = 0; i15 < f37164s.length; i15++) {
                try {
                    int i16 = 0;
                    while (true) {
                        short[] sArr = f37164s[i15];
                        if (i16 < sArr.length) {
                            f37170z.a(i15 + 2, sArr[i16], f37165t[i15][i16]);
                            i16++;
                        }
                    }
                } catch (IOException e15) {
                    throw new AssertionError(e15);
                }
            }
            c cVar2 = f37170z;
            cVar2.b(12, 0, f37169y);
            cVar2.b(12, 1, f37168x);
            A = new c();
            for (int i17 = 0; i17 < f37166v.length; i17++) {
                try {
                    int i18 = 0;
                    while (true) {
                        short[] sArr2 = f37166v[i17];
                        if (i18 < sArr2.length) {
                            A.a(i17 + 4, sArr2[i18], f37167w[i17][i18]);
                            i18++;
                        }
                    }
                } catch (IOException e16) {
                    throw new AssertionError(e16);
                }
            }
            c cVar3 = A;
            cVar3.b(12, 0, f37169y);
            cVar3.b(12, 1, f37168x);
            c cVar4 = new c();
            C = cVar4;
            try {
                cVar4.a(4, 1, -3000);
                cVar4.a(3, 1, -4000);
                cVar4.a(1, 1, 0);
                cVar4.a(3, 3, 1);
                cVar4.a(6, 3, 2);
                cVar4.a(7, 3, 3);
                cVar4.a(3, 2, -1);
                cVar4.a(6, 2, -2);
                cVar4.a(7, 2, -3);
            } catch (IOException e17) {
                throw new AssertionError(e17);
            }
        } catch (IOException e18) {
            throw new AssertionError(e18);
        }
    }

    public e(InputStream inputStream, int i15, int i16, long j15, boolean z15) {
        super(inputStream);
        this.f37184p = 0;
        this.f37185q = -1;
        this.f37186r = -1;
        this.f37171a = i15;
        this.f37177g = i16;
        this.f37172b = new byte[(i15 + 7) / 8];
        int i17 = i15 + 2;
        this.f37180k = new int[i17];
        this.f37181l = new int[i17];
        if (i16 == 2) {
            this.f37176f = z15;
            this.f37173c = false;
            this.f37174d = false;
            this.f37175e = false;
            return;
        }
        if (i16 == 3) {
            this.f37176f = z15;
            this.f37173c = (1 & j15) != 0;
            this.f37174d = (4 & j15) != 0;
            this.f37175e = (j15 & 2) != 0;
            return;
        }
        if (i16 != 4) {
            throw new IllegalArgumentException("Illegal parameter: " + i16);
        }
        this.f37176f = z15;
        this.f37173c = false;
        this.f37174d = false;
        this.f37175e = (j15 & 2) != 0;
    }

    private void C() throws IOException {
        if (this.f37179j >= this.f37178h) {
            this.f37178h = 0;
            try {
                m();
            } catch (EOFException e15) {
                if (this.f37178h != 0) {
                    throw e15;
                }
                this.f37178h = -1;
            } catch (ArrayIndexOutOfBoundsException e16) {
                throw new IOException("Malformed CCITT stream", e16);
            }
            this.f37179j = 0;
        }
    }

    private int E(int i15, boolean z15) {
        int i16 = (this.f37184p & (-2)) + (!z15 ? 1 : 0);
        if (i16 > 2) {
            i16 -= 2;
        }
        if (i15 == 0) {
            return i16;
        }
        while (i16 < this.f37182m) {
            if (i15 < this.f37180k[i16]) {
                this.f37184p = i16;
                return i16;
            }
            i16 += 2;
        }
        return -1;
    }

    private boolean H() throws IOException {
        int i15 = this.f37186r;
        if (i15 < 0 || i15 > 7) {
            int i16 = ((FilterInputStream) this).in.read();
            this.f37185q = i16;
            if (i16 == -1) {
                throw new EOFException("Unexpected end of Huffman RLE stream");
            }
            this.f37186r = 0;
        }
        int i17 = this.f37185q;
        boolean z15 = (i17 & 128) != 0;
        this.f37185q = i17 << 1;
        this.f37186r++;
        return z15;
    }

    private void I() {
        this.f37186r = -1;
    }

    private void b() {
        int iY = 0;
        this.f37183n = 0;
        boolean z15 = true;
        do {
            iY += z15 ? y(A) : y(f37170z);
            int[] iArr = this.f37181l;
            int i15 = this.f37183n;
            this.f37183n = i15 + 1;
            iArr[i15] = iY;
            z15 = !z15;
        } while (iY < this.f37171a);
    }

    private void h() {
        int i15;
        int i16;
        this.f37182m = this.f37183n;
        int[] iArr = this.f37181l;
        this.f37181l = this.f37180k;
        this.f37180k = iArr;
        int iY = 0;
        this.f37183n = 0;
        boolean z15 = true;
        while (iY < this.f37171a) {
            b bVarB = C.f37192a;
            while (true) {
                bVarB = bVarB.b(H());
                if (bVarB == null) {
                    break;
                }
                if (bVarB.f37191e) {
                    int i17 = bVarB.f37189c;
                    if (i17 == -4000) {
                        int iY2 = iY + y(z15 ? A : f37170z);
                        int[] iArr2 = this.f37181l;
                        int i18 = this.f37183n;
                        this.f37183n = i18 + 1;
                        iArr2[i18] = iY2;
                        iY = iY2 + y(z15 ? f37170z : A);
                        int[] iArr3 = this.f37181l;
                        int i19 = this.f37183n;
                        this.f37183n = i19 + 1;
                        iArr3[i19] = iY;
                        break;
                    }
                    if (i17 == -3000) {
                        int iE = E(iY, z15) + 1;
                        if (iE < this.f37182m) {
                            iY = this.f37180k[iE];
                            break;
                        } else {
                            iY = this.f37171a;
                            break;
                        }
                    }
                    int iE2 = E(iY, z15);
                    if (iE2 >= this.f37182m || iE2 == -1) {
                        i15 = this.f37171a;
                        i16 = bVarB.f37189c;
                    } else {
                        i15 = this.f37180k[iE2];
                        i16 = bVarB.f37189c;
                    }
                    iY = i15 + i16;
                    int[] iArr4 = this.f37181l;
                    int i25 = this.f37183n;
                    iArr4[i25] = iY;
                    this.f37183n = i25 + 1;
                    z15 = !z15;
                    break;
                }
            }
        }
    }

    private void m() throws IOException {
        int i15;
        int i16 = this.f37177g;
        if (i16 == 2) {
            p();
        } else if (i16 == 3) {
            r();
        } else {
            if (i16 != 4) {
                throw new IllegalArgumentException("Illegal parameter: " + this.f37177g);
            }
            u();
        }
        this.f37184p = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z15 = true;
        while (true) {
            int i19 = this.f37183n;
            if (i17 > i19) {
                break;
            }
            int i25 = this.f37171a;
            int i26 = i17 != i19 ? this.f37181l[i17] : i25;
            if (i26 <= i25) {
                i25 = i26;
            }
            int i27 = i18 / 8;
            while (true) {
                i15 = i18 % 8;
                if (i15 == 0 || i25 - i18 <= 0) {
                    break;
                }
                byte[] bArr = this.f37172b;
                bArr[i27] = (byte) ((z15 ? 0 : 1 << (7 - i15)) | bArr[i27]);
                i18++;
            }
            if (i15 == 0) {
                i27 = i18 / 8;
                byte b15 = (byte) (z15 ? 0 : GF2Field.MASK);
                while (i25 - i18 > 7) {
                    this.f37172b[i27] = b15;
                    i18 += 8;
                    i27++;
                }
            }
            while (i25 - i18 > 0) {
                int i28 = i18 % 8;
                if (i28 == 0) {
                    this.f37172b[i27] = 0;
                }
                byte[] bArr2 = this.f37172b;
                bArr2[i27] = (byte) ((z15 ? 0 : 1 << (7 - i28)) | bArr2[i27]);
                i18++;
            }
            z15 = !z15;
            i17++;
        }
        if (i18 == this.f37171a) {
            this.f37178h = (i18 + 7) / 8;
            return;
        }
        throw new IOException("Sum of run-lengths does not equal scan line width: " + i18 + " > " + this.f37171a);
    }

    private void p() {
        if (this.f37176f) {
            I();
        }
        b();
    }

    private void r() {
        if (this.f37176f) {
            I();
        }
        loop0: while (true) {
            b bVarB = B.f37192a;
            while (true) {
                bVarB = bVarB.b(H());
                if (bVarB == null) {
                    break;
                } else if (bVarB.f37191e) {
                    break loop0;
                }
            }
        }
        if (!this.f37173c || H()) {
            b();
        } else {
            h();
        }
    }

    private void u() {
        if (this.f37176f) {
            I();
        }
        h();
    }

    private int y(c cVar) throws IOException {
        b bVarB = cVar.f37192a;
        int i15 = 0;
        while (true) {
            bVarB = bVarB.b(H());
            if (bVarB == null) {
                throw new IOException("Unknown code in Huffman RLE stream");
            }
            if (bVarB.f37191e) {
                int i16 = bVarB.f37189c;
                i15 += i16;
                if (i16 < 64) {
                    return i16 >= 0 ? i15 : this.f37171a;
                }
                bVarB = cVar.f37192a;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i15 = this.f37178h;
        if (i15 < 0) {
            return 0;
        }
        if (this.f37179j >= i15) {
            C();
            if (this.f37178h < 0) {
                return 0;
            }
        }
        byte[] bArr = this.f37172b;
        int i16 = this.f37179j;
        this.f37179j = i16 + 1;
        return bArr[i16] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j15) throws IOException {
        int i15 = this.f37178h;
        if (i15 < 0) {
            return -1L;
        }
        if (this.f37179j >= i15) {
            C();
            if (this.f37178h < 0) {
                return -1L;
            }
        }
        int iMin = (int) Math.min(this.f37178h - this.f37179j, j15);
        this.f37179j += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this.f37178h;
        if (i17 < 0) {
            Arrays.fill(bArr, i15, i15 + i16, (byte) 0);
            return i16;
        }
        if (this.f37179j >= i17) {
            C();
            if (this.f37178h < 0) {
                Arrays.fill(bArr, i15, i15 + i16, (byte) 0);
                return i16;
            }
        }
        int iMin = Math.min(this.f37178h - this.f37179j, i16);
        System.arraycopy(this.f37172b, this.f37179j, bArr, i15, iMin);
        this.f37179j += iMin;
        return iMin;
    }
}
