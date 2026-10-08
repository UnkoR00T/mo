package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    static abstract class AbstractC2244a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f95861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f95862b;

        AbstractC2244a() {
        }
    }

    static class b extends AbstractC2244a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final byte[] f95863j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final byte[] f95864k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f95865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f95866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f95867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f95868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f95869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f95870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f95871i;

        public b(int i15, byte[] bArr) {
            this.f95861a = bArr;
            this.f95868f = (i15 & 1) == 0;
            boolean z15 = (i15 & 2) == 0;
            this.f95869g = z15;
            this.f95870h = (i15 & 4) != 0;
            this.f95871i = (i15 & 8) == 0 ? f95863j : f95864k;
            this.f95865c = new byte[2];
            this.f95866d = 0;
            this.f95867e = z15 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        public boolean a(byte[] bArr, int i15, int i16, boolean z15) {
            int i17;
            int i18;
            int i19;
            int i25;
            byte b15;
            byte b16;
            byte b17;
            int i26;
            int i27;
            byte[] bArr2 = this.f95871i;
            byte[] bArr3 = this.f95861a;
            int i28 = this.f95867e;
            int i29 = i16 + i15;
            int i35 = this.f95866d;
            char c15 = 2;
            int i36 = 0;
            if (i35 != 1) {
                if (i35 == 2 && (i27 = i15 + 1) <= i29) {
                    byte[] bArr4 = this.f95865c;
                    i18 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i15] & 255);
                    this.f95866d = 0;
                    i17 = i27;
                } else {
                    i17 = i15;
                    i18 = -1;
                }
            } else if (i15 + 2 <= i29) {
                i17 = i15 + 2;
                i18 = (bArr[i15 + 1] & 255) | ((this.f95865c[0] & 255) << 16) | ((bArr[i15] & 255) << 8);
                this.f95866d = 0;
            } else {
                i17 = i15;
                i18 = -1;
            }
            if (i18 != -1) {
                bArr3[0] = bArr2[(i18 >> 18) & 63];
                bArr3[1] = bArr2[(i18 >> 12) & 63];
                bArr3[2] = bArr2[(i18 >> 6) & 63];
                bArr3[3] = bArr2[i18 & 63];
                i28--;
                if (i28 == 0) {
                    if (this.f95870h) {
                        bArr3[4] = 13;
                        i26 = 5;
                    } else {
                        i26 = 4;
                    }
                    i19 = i26 + 1;
                    bArr3[i26] = 10;
                    i28 = 19;
                } else {
                    i19 = 4;
                }
            } else {
                i19 = 0;
            }
            while (true) {
                i17 += 3;
                if (i17 > i29) {
                    break;
                }
                c15 = c15;
                int i37 = ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17] & 255) << 16) | (bArr[i17 + 2] & 255);
                bArr3[i19] = bArr2[(i37 >> 18) & 63];
                bArr3[i19 + 1] = bArr2[(i37 >> 12) & 63];
                bArr3[i19 + 2] = bArr2[(i37 >> 6) & 63];
                bArr3[i19 + 3] = bArr2[i37 & 63];
                int i38 = i19 + 4;
                i28--;
                if (i28 == 0) {
                    if (this.f95870h) {
                        bArr3[i38] = 13;
                        i38 = i19 + 5;
                    }
                    i19 = i38 + 1;
                    bArr3[i38] = 10;
                    i28 = 19;
                } else {
                    i19 = i38;
                }
            }
            if (z15) {
                int i39 = this.f95866d;
                if (i17 - i39 == i29 - 1) {
                    if (i39 > 0) {
                        b17 = this.f95865c[0];
                        i36 = 1;
                    } else {
                        b17 = bArr[i17];
                    }
                    int i45 = (b17 & 255) << 4;
                    this.f95866d = i39 - i36;
                    bArr3[i19] = bArr2[(i45 >> 6) & 63];
                    int i46 = i19 + 2;
                    bArr3[i19 + 1] = bArr2[i45 & 63];
                    if (this.f95868f) {
                        bArr3[i46] = 61;
                        i46 = i19 + 4;
                        bArr3[i19 + 3] = 61;
                    }
                    if (this.f95869g) {
                        if (this.f95870h) {
                            bArr3[i46] = 13;
                            i46++;
                        }
                        i25 = i46 + 1;
                        bArr3[i46] = 10;
                        i19 = i25;
                    } else {
                        i19 = i46;
                    }
                } else if (i17 - i39 == i29 - 2) {
                    if (i39 > 1) {
                        b15 = this.f95865c[0];
                        i36 = 1;
                    } else {
                        byte b18 = bArr[i17];
                        i17++;
                        b15 = b18;
                    }
                    int i47 = (b15 & 255) << 10;
                    if (i39 > 0) {
                        b16 = this.f95865c[i36];
                        i36++;
                    } else {
                        b16 = bArr[i17];
                    }
                    int i48 = i47 | ((b16 & 255) << 2);
                    this.f95866d = i39 - i36;
                    bArr3[i19] = bArr2[(i48 >> 12) & 63];
                    bArr3[i19 + 1] = bArr2[(i48 >> 6) & 63];
                    int i49 = i19 + 3;
                    bArr3[i19 + 2] = bArr2[i48 & 63];
                    if (this.f95868f) {
                        bArr3[i49] = 61;
                        i49 = i19 + 4;
                    }
                    if (this.f95869g) {
                        if (this.f95870h) {
                            bArr3[i49] = 13;
                            i49++;
                        }
                        i25 = i49 + 1;
                        bArr3[i49] = 10;
                        i19 = i25;
                    } else {
                        i19 = i49;
                    }
                } else if (this.f95869g && i19 > 0 && i28 != 19) {
                    if (this.f95870h) {
                        bArr3[i19] = 13;
                        i19++;
                    }
                    i25 = i19 + 1;
                    bArr3[i19] = 10;
                    i19 = i25;
                }
            } else if (i17 == i29 - 1) {
                byte[] bArr5 = this.f95865c;
                int i55 = this.f95866d;
                this.f95866d = i55 + 1;
                bArr5[i55] = bArr[i17];
            } else if (i17 == i29 - 2) {
                byte[] bArr6 = this.f95865c;
                int i56 = this.f95866d;
                int i57 = i56 + 1;
                this.f95866d = i57;
                bArr6[i56] = bArr[i17];
                this.f95866d = i56 + 2;
                bArr6[i57] = bArr[i17 + 1];
            }
            this.f95862b = i19;
            this.f95867e = i28;
            return true;
        }
    }

    public static byte[] a(byte[] bArr, int i15) {
        return b(bArr, 0, bArr.length, i15);
    }

    public static byte[] b(byte[] bArr, int i15, int i16, int i17) {
        b bVar = new b(i17, null);
        int i18 = (i16 / 3) * 4;
        if (!bVar.f95868f) {
            int i19 = i16 % 3;
            if (i19 == 1) {
                i18 += 2;
            } else if (i19 == 2) {
                i18 += 3;
            }
        } else if (i16 % 3 > 0) {
            i18 += 4;
        }
        if (bVar.f95869g && i16 > 0) {
            i18 += (((i16 - 1) / 57) + 1) * (bVar.f95870h ? 2 : 1);
        }
        bVar.f95861a = new byte[i18];
        bVar.a(bArr, i15, i16, true);
        return bVar.f95861a;
    }

    public static String c(byte[] bArr, int i15) {
        try {
            return new String(a(bArr, i15), "US-ASCII");
        } catch (UnsupportedEncodingException e15) {
            throw new AssertionError(e15);
        }
    }
}
