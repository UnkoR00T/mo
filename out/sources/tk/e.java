package tk;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f190553a = Charset.forName("UTF-8");

    static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f190554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190555b;

        a() {
        }
    }

    static class b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f190556f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f190557g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f190558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f190559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f190560e;

        public b(int i15, byte[] bArr) {
            this.f190554a = bArr;
            this.f190560e = (i15 & 8) == 0 ? f190556f : f190557g;
            this.f190558c = 0;
            this.f190559d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean a(byte[] bArr, int i15, int i16, boolean z15) {
            int i17 = this.f190558c;
            if (i17 == 6) {
                return false;
            }
            int i18 = i16 + i15;
            int i19 = this.f190559d;
            byte[] bArr2 = this.f190554a;
            int[] iArr = this.f190560e;
            int i25 = 0;
            int i26 = i19;
            int i27 = i17;
            int i28 = i15;
            while (i28 < i18) {
                if (i27 == 0) {
                    while (true) {
                        int i29 = i28 + 4;
                        if (i29 > i18 || (i26 = (iArr[bArr[i28] & 255] << 18) | (iArr[bArr[i28 + 1] & 255] << 12) | (iArr[bArr[i28 + 2] & 255] << 6) | iArr[bArr[i28 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i25 + 2] = (byte) i26;
                        bArr2[i25 + 1] = (byte) (i26 >> 8);
                        bArr2[i25] = (byte) (i26 >> 16);
                        i25 += 3;
                        i28 = i29;
                    }
                    if (i28 >= i18) {
                        break;
                    }
                }
                int i35 = i28 + 1;
                int i36 = iArr[bArr[i28] & 255];
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 != 3) {
                                if (i27 != 4) {
                                    if (i27 == 5 && i36 != -1) {
                                        this.f190558c = 6;
                                        return false;
                                    }
                                } else if (i36 == -2) {
                                    i27++;
                                } else if (i36 != -1) {
                                    this.f190558c = 6;
                                    return false;
                                }
                            } else if (i36 >= 0) {
                                int i37 = i36 | (i26 << 6);
                                bArr2[i25 + 2] = (byte) i37;
                                bArr2[i25 + 1] = (byte) (i37 >> 8);
                                bArr2[i25] = (byte) (i37 >> 16);
                                i25 += 3;
                                i26 = i37;
                                i27 = 0;
                            } else if (i36 == -2) {
                                bArr2[i25 + 1] = (byte) (i26 >> 2);
                                bArr2[i25] = (byte) (i26 >> 10);
                                i25 += 2;
                                i27 = 5;
                            } else if (i36 != -1) {
                                this.f190558c = 6;
                                return false;
                            }
                        } else if (i36 >= 0) {
                            i36 |= i26 << 6;
                            i27++;
                            i26 = i36;
                        } else if (i36 == -2) {
                            bArr2[i25] = (byte) (i26 >> 4);
                            i25++;
                            i27 = 4;
                        } else if (i36 != -1) {
                            this.f190558c = 6;
                            return false;
                        }
                    } else if (i36 >= 0) {
                        i36 |= i26 << 6;
                        i27++;
                        i26 = i36;
                    } else if (i36 != -1) {
                        this.f190558c = 6;
                        return false;
                    }
                } else if (i36 >= 0) {
                    i27++;
                    i26 = i36;
                } else if (i36 != -1) {
                    this.f190558c = 6;
                    return false;
                }
                i28 = i35;
            }
            if (!z15) {
                this.f190558c = i27;
                this.f190559d = i26;
                this.f190555b = i25;
                return true;
            }
            if (i27 == 1) {
                this.f190558c = 6;
                return false;
            }
            if (i27 == 2) {
                bArr2[i25] = (byte) (i26 >> 4);
                i25++;
            } else if (i27 == 3) {
                int i38 = i25 + 1;
                bArr2[i25] = (byte) (i26 >> 10);
                i25 += 2;
                bArr2[i38] = (byte) (i26 >> 2);
            } else if (i27 == 4) {
                this.f190558c = 6;
                return false;
            }
            this.f190558c = i27;
            this.f190555b = i25;
            return true;
        }
    }

    static class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final byte[] f190561j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final byte[] f190562k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f190563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f190564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f190565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f190566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f190567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f190568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f190569i;

        public c(int i15, byte[] bArr) {
            this.f190554a = bArr;
            this.f190566f = (i15 & 1) == 0;
            boolean z15 = (i15 & 2) == 0;
            this.f190567g = z15;
            this.f190568h = (i15 & 4) != 0;
            this.f190569i = (i15 & 8) == 0 ? f190561j : f190562k;
            this.f190563c = new byte[2];
            this.f190564d = 0;
            this.f190565e = z15 ? 19 : -1;
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
            byte[] bArr2 = this.f190569i;
            byte[] bArr3 = this.f190554a;
            int i28 = this.f190565e;
            int i29 = i16 + i15;
            int i35 = this.f190564d;
            char c15 = 2;
            int i36 = 0;
            if (i35 != 1) {
                if (i35 == 2 && (i27 = i15 + 1) <= i29) {
                    byte[] bArr4 = this.f190563c;
                    i18 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i15] & 255);
                    this.f190564d = 0;
                    i17 = i27;
                } else {
                    i17 = i15;
                    i18 = -1;
                }
            } else if (i15 + 2 <= i29) {
                i17 = i15 + 2;
                i18 = (bArr[i15 + 1] & 255) | ((this.f190563c[0] & 255) << 16) | ((bArr[i15] & 255) << 8);
                this.f190564d = 0;
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
                    if (this.f190568h) {
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
                    if (this.f190568h) {
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
                int i39 = this.f190564d;
                if (i17 - i39 == i29 - 1) {
                    if (i39 > 0) {
                        b17 = this.f190563c[0];
                        i36 = 1;
                    } else {
                        b17 = bArr[i17];
                    }
                    int i45 = (b17 & 255) << 4;
                    this.f190564d = i39 - i36;
                    bArr3[i19] = bArr2[(i45 >> 6) & 63];
                    int i46 = i19 + 2;
                    bArr3[i19 + 1] = bArr2[i45 & 63];
                    if (this.f190566f) {
                        bArr3[i46] = 61;
                        i46 = i19 + 4;
                        bArr3[i19 + 3] = 61;
                    }
                    if (this.f190567g) {
                        if (this.f190568h) {
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
                        b15 = this.f190563c[0];
                        i36 = 1;
                    } else {
                        byte b18 = bArr[i17];
                        i17++;
                        b15 = b18;
                    }
                    int i47 = (b15 & 255) << 10;
                    if (i39 > 0) {
                        b16 = this.f190563c[i36];
                        i36++;
                    } else {
                        b16 = bArr[i17];
                    }
                    int i48 = i47 | ((b16 & 255) << 2);
                    this.f190564d = i39 - i36;
                    bArr3[i19] = bArr2[(i48 >> 12) & 63];
                    bArr3[i19 + 1] = bArr2[(i48 >> 6) & 63];
                    int i49 = i19 + 3;
                    bArr3[i19 + 2] = bArr2[i48 & 63];
                    if (this.f190566f) {
                        bArr3[i49] = 61;
                        i49 = i19 + 4;
                    }
                    if (this.f190567g) {
                        if (this.f190568h) {
                            bArr3[i49] = 13;
                            i49++;
                        }
                        i25 = i49 + 1;
                        bArr3[i49] = 10;
                        i19 = i25;
                    } else {
                        i19 = i49;
                    }
                } else if (this.f190567g && i19 > 0 && i28 != 19) {
                    if (this.f190568h) {
                        bArr3[i19] = 13;
                        i19++;
                    }
                    i25 = i19 + 1;
                    bArr3[i19] = 10;
                    i19 = i25;
                }
            } else if (i17 == i29 - 1) {
                byte[] bArr5 = this.f190563c;
                int i55 = this.f190564d;
                this.f190564d = i55 + 1;
                bArr5[i55] = bArr[i17];
            } else if (i17 == i29 - 2) {
                byte[] bArr6 = this.f190563c;
                int i56 = this.f190564d;
                int i57 = i56 + 1;
                this.f190564d = i57;
                bArr6[i56] = bArr[i17];
                this.f190564d = i56 + 2;
                bArr6[i57] = bArr[i17 + 1];
            }
            this.f190555b = i19;
            this.f190565e = i28;
            return true;
        }
    }

    public static byte[] a(String str, int i15) {
        return b(str.getBytes(f190553a), i15);
    }

    public static byte[] b(byte[] bArr, int i15) {
        return c(bArr, 0, bArr.length, i15);
    }

    public static byte[] c(byte[] bArr, int i15, int i16, int i17) {
        b bVar = new b(i17, new byte[(i16 * 3) / 4]);
        if (!bVar.a(bArr, i15, i16, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i18 = bVar.f190555b;
        byte[] bArr2 = bVar.f190554a;
        if (i18 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i18];
        System.arraycopy(bArr2, 0, bArr3, 0, i18);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i15) {
        return f(bArr, 0, bArr.length, i15);
    }

    public static byte[] f(byte[] bArr, int i15, int i16, int i17) {
        c cVar = new c(i17, null);
        int i18 = (i16 / 3) * 4;
        if (!cVar.f190566f) {
            int i19 = i16 % 3;
            if (i19 == 1) {
                i18 += 2;
            } else if (i19 == 2) {
                i18 += 3;
            }
        } else if (i16 % 3 > 0) {
            i18 += 4;
        }
        if (cVar.f190567g && i16 > 0) {
            i18 += (((i16 - 1) / 57) + 1) * (cVar.f190568h ? 2 : 1);
        }
        cVar.f190554a = new byte[i18];
        cVar.a(bArr, i15, i16, true);
        return cVar.f190554a;
    }

    public static String g(byte[] bArr, int i15) {
        try {
            return new String(e(bArr, i15), "US-ASCII");
        } catch (UnsupportedEncodingException e15) {
            throw new AssertionError(e15);
        }
    }
}
