package cp;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    private static final class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f37228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f37229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f37230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f37231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f37232h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f37233j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f37234k;

        a(OutputStream outputStream, int i15, int i16, int i17, int i18) {
            super(outputStream);
            this.f37233j = 0;
            this.f37234k = false;
            this.f37225a = i15;
            this.f37226b = i16;
            this.f37227c = i17;
            this.f37228d = i18;
            int iB = s.b(i16, i17, i18);
            this.f37229e = iB;
            this.f37230f = i15 >= 10;
            this.f37231g = new byte[iB];
            this.f37232h = new byte[iB];
        }

        private void b() throws IOException {
            s.c(this.f37225a, this.f37226b, this.f37227c, this.f37228d, this.f37231g, this.f37232h);
            ((FilterOutputStream) this).out.write(this.f37231g);
            h();
        }

        private void h() {
            byte[] bArr = this.f37232h;
            this.f37232h = this.f37231g;
            this.f37231g = bArr;
            this.f37233j = 0;
            this.f37234k = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            int i15 = this.f37233j;
            if (i15 > 0) {
                Arrays.fill(this.f37231g, i15, this.f37229e, (byte) 0);
                b();
            }
            super.flush();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            int i17 = i16 + i15;
            while (i15 < i17) {
                if (this.f37230f && this.f37233j == 0 && !this.f37234k) {
                    this.f37225a = bArr[i15] + 10;
                    i15++;
                    this.f37234k = true;
                } else {
                    int iMin = Math.min(this.f37229e - this.f37233j, i17 - i15);
                    System.arraycopy(bArr, i15, this.f37231g, this.f37233j, iMin);
                    int i18 = this.f37233j + iMin;
                    this.f37233j = i18;
                    i15 += iMin;
                    if (i18 == this.f37231g.length) {
                        b();
                    }
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i15) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    static int a(int i15, int i16, int i17, int i18) {
        int i19 = (1 << i17) - 1;
        return (i15 & (~(i19 << i16))) | ((i18 & i19) << i16);
    }

    static int b(int i15, int i16, int i17) {
        return ((i17 * (i15 * i16)) + 7) / 8;
    }

    static void c(int i15, int i16, int i17, int i18, byte[] bArr, byte[] bArr2) {
        if (i15 == 1) {
            return;
        }
        int i19 = ((i16 * i17) + 7) / 8;
        int length = bArr.length;
        int i25 = 0;
        if (i15 != 2) {
            switch (i15) {
                case 11:
                    for (int i26 = i19; i26 < length; i26++) {
                        bArr[i26] = (byte) (bArr[i26] + bArr[i26 - i19]);
                    }
                    return;
                case 12:
                    break;
                case 13:
                    for (int i27 = 0; i27 < length; i27++) {
                        int i28 = i27 - i19;
                        bArr[i27] = (byte) (((bArr[i27] & 255) + (((i28 >= 0 ? bArr[i28] & 255 : 0) + (bArr2[i27] & 255)) / 2)) & GF2Field.MASK);
                    }
                    return;
                case 14:
                    for (int i29 = 0; i29 < length; i29++) {
                        int i35 = bArr[i29] & 255;
                        int i36 = i29 - i19;
                        int i37 = i36 >= 0 ? bArr[i36] & 255 : 0;
                        int i38 = bArr2[i29] & 255;
                        int i39 = i36 >= 0 ? bArr2[i36] & 255 : 0;
                        int i45 = (i37 + i38) - i39;
                        int iAbs = Math.abs(i45 - i37);
                        int iAbs2 = Math.abs(i45 - i38);
                        int iAbs3 = Math.abs(i45 - i39);
                        if (iAbs <= iAbs2 && iAbs <= iAbs3) {
                            bArr[i29] = (byte) ((i35 + i37) & GF2Field.MASK);
                        } else if (iAbs2 <= iAbs3) {
                            bArr[i29] = (byte) ((i35 + i38) & GF2Field.MASK);
                        } else {
                            bArr[i29] = (byte) ((i35 + i39) & GF2Field.MASK);
                        }
                    }
                    return;
                default:
                    return;
            }
            while (i25 < length) {
                bArr[i25] = (byte) (((bArr[i25] & 255) + (bArr2[i25] & 255)) & GF2Field.MASK);
                i25++;
            }
            return;
        }
        if (i17 == 8) {
            for (int i46 = i19; i46 < length; i46++) {
                bArr[i46] = (byte) ((bArr[i46] & 255) + (bArr[i46 - i19] & 255));
            }
            return;
        }
        if (i17 == 16) {
            for (int i47 = i19; i47 < length - 1; i47 += 2) {
                int i48 = i47 + 1;
                int i49 = i47 - i19;
                int i55 = ((bArr[i47] & 255) << 8) + (bArr[i48] & 255) + ((bArr[i49] & 255) << 8) + (bArr[i49 + 1] & 255);
                bArr[i47] = (byte) ((i55 >> 8) & GF2Field.MASK);
                bArr[i48] = (byte) (i55 & GF2Field.MASK);
            }
            return;
        }
        if (i17 != 1 || i16 != 1) {
            int i56 = i18 * i16;
            for (int i57 = i16; i57 < i56; i57++) {
                int i58 = i57 * i17;
                int i59 = i58 / 8;
                int i65 = (8 - (i58 % 8)) - i17;
                int i66 = (i57 - i16) * i17;
                bArr[i59] = (byte) a(bArr[i59], i65, i17, d(bArr[i59], i65, i17) + d(bArr[i66 / 8], (8 - (i66 % 8)) - i17, i17));
            }
            return;
        }
        while (i25 < length) {
            int i67 = 7;
            while (i67 >= 0) {
                int i68 = bArr[i25];
                int i69 = (i68 >> i67) & 1;
                if (i25 != 0 || i67 != 7) {
                    if (((i69 + ((i67 == 7 ? bArr[i25 - 1] : i68 >> (i67 + 1)) & 1)) & 1) == 0) {
                        bArr[i25] = (byte) (i68 & (~(1 << i67)));
                    } else {
                        bArr[i25] = (byte) (i68 | (1 << i67));
                    }
                }
                i67--;
            }
            i25++;
        }
    }

    static int d(int i15, int i16, int i17) {
        return (i15 >>> i16) & ((1 << i17) - 1);
    }

    static OutputStream e(OutputStream outputStream, bp.d dVar) {
        int iX4 = dVar.x4(bp.i.W6);
        return iX4 > 1 ? new a(outputStream, iX4, Math.min(dVar.y4(bp.i.H1, 1), 32), dVar.y4(bp.i.C0, 8), dVar.y4(bp.i.J1, 1)) : outputStream;
    }
}
