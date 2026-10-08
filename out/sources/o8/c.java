package o8;

import java.nio.ByteBuffer;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f143020a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f143021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f143022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f143023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f143024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f143025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f143026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f143027g;

        private b() {
            this.f143021a = true;
            this.f143022b = -1;
            this.f143023c = -1;
            this.f143024d = true;
            this.f143025e = 2;
            this.f143026f = 1;
            this.f143027g = 0;
        }
    }

    /* JADX INFO: renamed from: o8.c$c, reason: collision with other inner class name */
    public static final class C3545c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f143028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f143032e;

        private C3545c(int i15, int i16, int i17, int i18, int i19) {
            this.f143028a = i15;
            this.f143030c = i16;
            this.f143029b = i17;
            this.f143031d = i18;
            this.f143032e = i19;
        }
    }

    private static String a(int i15, int i16, int i17) {
        return w7.o0.F("ac-4.%02d.%02d.%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    public static void b(int i15, w7.c0 c0Var) {
        c0Var.b0(7);
        byte[] bArrF = c0Var.f();
        bArrF[0] = -84;
        bArrF[1] = 64;
        bArrF[2] = -1;
        bArrF[3] = -1;
        bArrF[4] = (byte) ((i15 >> 16) & GF2Field.MASK);
        bArrF[5] = (byte) ((i15 >> 8) & GF2Field.MASK);
        bArrF[6] = (byte) (i15 & GF2Field.MASK);
    }

    private static int c(int i15, boolean z15, int i16) {
        int iD = d(i15);
        if (i15 != 11 && i15 != 12 && i15 != 13 && i15 != 14) {
            return iD;
        }
        if (!z15) {
            iD -= 2;
        }
        if (i16 != 0) {
            return i16 != 1 ? iD : iD - 2;
        }
        return iD - 4;
    }

    private static int d(int i15) {
        switch (i15) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    public static t7.p e(w7.c0 c0Var, String str, String str2, t7.l lVar) {
        int i15;
        int i16;
        int iC;
        boolean zG;
        int iH;
        int iH2;
        int iH3;
        int i17;
        boolean z15;
        boolean zG2;
        int i18;
        int iH4;
        w7.b0 b0Var = new w7.b0();
        b0Var.m(c0Var);
        int iB = b0Var.b();
        int iH5 = b0Var.h(3);
        if (iH5 > 1) {
            throw t7.x.c("Unsupported AC-4 DSI version: " + iH5);
        }
        int iH6 = b0Var.h(7);
        int i19 = b0Var.g() ? 48000 : 44100;
        b0Var.r(4);
        int iH7 = b0Var.h(9);
        if (iH6 > 1) {
            if (iH5 == 0) {
                throw t7.x.c("Invalid AC-4 DSI version: " + iH5);
            }
            if (b0Var.g()) {
                b0Var.r(16);
                if (b0Var.g()) {
                    b0Var.r(128);
                }
            }
        }
        if (iH5 == 1) {
            if (!l(b0Var)) {
                throw t7.x.c("Invalid AC-4 DSI bitrate.");
            }
            b0Var.c();
        }
        b bVar = new b();
        int i25 = 0;
        while (true) {
            if (i25 < iH7) {
                if (iH5 == 0) {
                    zG = b0Var.g();
                    iH = b0Var.h(5);
                    iH2 = b0Var.h(5);
                    iH3 = 0;
                    i17 = 0;
                    z15 = false;
                } else {
                    int iH8 = b0Var.h(8);
                    iH3 = b0Var.h(8);
                    if (iH3 == 255) {
                        iH3 += b0Var.h(16);
                    }
                    if (iH8 > 2) {
                        b0Var.r(iH3 * 8);
                        i25++;
                    } else {
                        int iB2 = (iB - b0Var.b()) / 8;
                        int iH9 = b0Var.h(5);
                        iH2 = iH8;
                        iH = iH9;
                        z15 = iH9 == 31;
                        i17 = iB2;
                        zG = false;
                    }
                }
                bVar.f143026f = iH2;
                if (zG || z15 || iH != 6) {
                    bVar.f143027g = b0Var.h(3);
                    if (b0Var.g()) {
                        b0Var.r(5);
                    }
                    b0Var.r(2);
                    int i26 = 1;
                    if (iH5 == 1 && (iH2 == 1 || iH2 == 2)) {
                        b0Var.r(2);
                    }
                    b0Var.r(5);
                    b0Var.r(10);
                    if (iH5 == 1) {
                        if (iH2 > 0) {
                            bVar.f143021a = b0Var.g();
                        }
                        if (bVar.f143021a) {
                            if (iH2 != 1) {
                                i18 = 2;
                                if (iH2 == 2) {
                                    iH4 = b0Var.h(5);
                                    if (iH4 >= 0 && iH4 <= 15) {
                                        bVar.f143022b = iH4;
                                    }
                                    if (iH4 >= 11 || iH4 > 14) {
                                        i18 = 2;
                                    } else {
                                        bVar.f143024d = b0Var.g();
                                        i18 = 2;
                                        bVar.f143025e = b0Var.h(2);
                                    }
                                }
                            } else {
                                iH4 = b0Var.h(5);
                                if (iH4 >= 0) {
                                    bVar.f143022b = iH4;
                                }
                                if (iH4 >= 11) {
                                    i18 = 2;
                                } else {
                                    i18 = 2;
                                }
                            }
                            b0Var.r(24);
                            i26 = 1;
                        } else {
                            i18 = 2;
                        }
                        if (iH2 == i26 || iH2 == i18) {
                            if (b0Var.g() && b0Var.g()) {
                                b0Var.r(i18);
                            }
                            if (b0Var.g()) {
                                b0Var.q();
                                int i27 = 8;
                                int iH10 = b0Var.h(8);
                                int i28 = 0;
                                while (i28 < iH10) {
                                    b0Var.r(i27);
                                    i28++;
                                    i27 = 8;
                                }
                            }
                        }
                    }
                    if (!zG && !z15) {
                        b0Var.q();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            if (iH2 == 0) {
                                for (int i29 = 0; i29 < 2; i29++) {
                                    i(b0Var, bVar);
                                }
                            } else {
                                for (int i35 = 0; i35 < 2; i35++) {
                                    j(b0Var, bVar);
                                }
                            }
                        } else if (iH == 3 || iH == 4) {
                            if (iH2 == 0) {
                                for (int i36 = 0; i36 < 3; i36++) {
                                    i(b0Var, bVar);
                                }
                            } else {
                                for (int i37 = 0; i37 < 3; i37++) {
                                    j(b0Var, bVar);
                                }
                            }
                        } else if (iH != 5) {
                            int iH11 = b0Var.h(7);
                            for (int i38 = 0; i38 < iH11; i38++) {
                                b0Var.r(8);
                            }
                        } else if (iH2 == 0) {
                            i(b0Var, bVar);
                        } else {
                            int iH12 = b0Var.h(3);
                            for (int i39 = 0; i39 < iH12 + 2; i39++) {
                                j(b0Var, bVar);
                            }
                        }
                    } else if (iH2 == 0) {
                        i(b0Var, bVar);
                    } else {
                        j(b0Var, bVar);
                    }
                    b0Var.q();
                    zG2 = b0Var.g();
                } else {
                    zG2 = true;
                }
                if (zG2) {
                    int iH13 = b0Var.h(7);
                    for (int i45 = 0; i45 < iH13; i45++) {
                        b0Var.r(15);
                    }
                }
                if (iH2 > 0) {
                    if (b0Var.g() && !l(b0Var)) {
                        throw t7.x.c("Can't parse bitrate DSI.");
                    }
                    if (b0Var.g()) {
                        b0Var.c();
                        b0Var.s(b0Var.h(16));
                        int iH14 = b0Var.h(5);
                        for (int i46 = 0; i46 < iH14; i46++) {
                            b0Var.r(3);
                            b0Var.r(8);
                        }
                    }
                }
                i15 = 8;
                b0Var.c();
                if (iH5 == 1) {
                    int iB3 = ((iB - b0Var.b()) / 8) - i17;
                    if (iH3 < iB3) {
                        throw t7.x.c("pres_bytes is smaller than presentation bytes read.");
                    }
                    b0Var.s(iH3 - iB3);
                }
                if (bVar.f143021a && bVar.f143022b == -1) {
                    throw t7.x.c("Can't determine channel mode of presentation " + i25);
                }
            } else {
                i15 = 8;
            }
            if (bVar.f143021a) {
                iC = c(bVar.f143022b, bVar.f143024d, bVar.f143025e);
            } else {
                int i47 = bVar.f143023c;
                if (i47 > 0) {
                    int i48 = i47 + 1;
                    if (bVar.f143027g == 4 && i48 == 17) {
                        i48 = 21;
                    }
                    iC = i48;
                } else {
                    int i49 = bVar.f143027g;
                    if (i49 == 0) {
                        i16 = 2;
                    } else if (i49 != 1) {
                        i16 = 2;
                        if (i49 == 2) {
                            iC = i15;
                        } else if (i49 == 3) {
                            iC = 10;
                        } else if (i49 != 4) {
                            w7.t.h("Ac4Util", "AC-4 level " + bVar.f143027g + " has not been defined.");
                        } else {
                            iC = 12;
                        }
                    } else {
                        iC = 6;
                    }
                    iC = i16;
                }
            }
            if (iC > 0) {
                return new t7.p.b().k0(str).A0("audio/ac4").U(iC).B0(i19).d0(lVar).o0(str2).V(a(iH6, bVar.f143026f, bVar.f143027g)).Q();
            }
            throw t7.x.c("Cannot determine channel count of presentation.");
        }
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return g(new w7.b0(bArr)).f143032e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static C3545c g(w7.b0 b0Var) {
        int i15;
        int i16;
        int i17;
        int iH = b0Var.h(16);
        int iH2 = b0Var.h(16);
        if (iH2 == 65535) {
            iH2 = b0Var.h(24);
            i15 = 7;
        } else {
            i15 = 4;
        }
        int i18 = iH2 + i15;
        if (iH == 44097) {
            i18 += 2;
        }
        int i19 = i18;
        int iH3 = b0Var.h(2);
        if (iH3 == 3) {
            iH3 += k(b0Var, 2);
        }
        int i25 = iH3;
        int iH4 = b0Var.h(10);
        if (b0Var.g() && b0Var.h(3) > 0) {
            b0Var.r(2);
        }
        int i26 = 48000;
        if (!b0Var.g()) {
            i26 = 44100;
        }
        int iH5 = b0Var.h(4);
        if (i26 != 44100 || iH5 != 13) {
            if (i26 == 48000) {
                int[] iArr = f143020a;
                if (iH5 < iArr.length) {
                    int i27 = iArr[iH5];
                    int i28 = iH4 % 5;
                    if (i28 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i16 = i27 + 1;
                        } else {
                            i17 = i27;
                        }
                    } else if (i28 != 2) {
                        if (i28 == 3) {
                            if (iH5 != 3) {
                            }
                            i16 = i27 + 1;
                        } else if (i28 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i16 = i27 + 1;
                        } else {
                            i17 = i27;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i16 = i27 + 1;
                    } else {
                        i17 = i27;
                    }
                } else {
                    i16 = 0;
                }
            } else {
                i16 = 0;
            }
            return new C3545c(i25, 2, i26, i19, i17);
        }
        i16 = f143020a[iH5];
        i17 = i16;
        return new C3545c(i25, 2, i26, i19, i17);
    }

    public static int h(byte[] bArr, int i15) {
        int i16 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i17 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i17 == 65535) {
            i17 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i16 = 4;
        }
        if (i15 == 44097) {
            i16 += 2;
        }
        return i17 + i16;
    }

    private static void i(w7.b0 b0Var, b bVar) throws t7.x {
        int iH = b0Var.h(5);
        b0Var.r(2);
        if (b0Var.g()) {
            b0Var.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            b0Var.q();
        }
        if (b0Var.g()) {
            int iH2 = b0Var.h(3);
            if (bVar.f143022b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f143022b = iH;
            }
            if (b0Var.g()) {
                m(b0Var);
            }
        }
    }

    private static void j(w7.b0 b0Var, b bVar) throws t7.x {
        b0Var.r(2);
        boolean zG = b0Var.g();
        int iH = b0Var.h(8);
        for (int i15 = 0; i15 < iH; i15++) {
            b0Var.r(2);
            if (b0Var.g()) {
                b0Var.r(5);
            }
            if (zG) {
                b0Var.r(24);
            } else {
                if (b0Var.g()) {
                    if (!b0Var.g()) {
                        b0Var.r(4);
                    }
                    bVar.f143023c = b0Var.h(6) + 1;
                }
                b0Var.r(4);
            }
        }
        if (b0Var.g()) {
            b0Var.r(3);
            if (b0Var.g()) {
                m(b0Var);
            }
        }
    }

    private static int k(w7.b0 b0Var, int i15) {
        int i16 = 0;
        while (true) {
            int iH = i16 + b0Var.h(i15);
            if (!b0Var.g()) {
                return iH;
            }
            i16 = (iH + 1) << i15;
        }
    }

    private static boolean l(w7.b0 b0Var) {
        if (b0Var.b() < 66) {
            return false;
        }
        b0Var.r(66);
        return true;
    }

    private static void m(w7.b0 b0Var) throws t7.x {
        int iH = b0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw t7.x.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        b0Var.r(iH * 8);
    }
}
