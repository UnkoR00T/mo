package v9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
final class v {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f205273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f205274c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f205275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f205277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f205278d;

        private c(int i15, int i16, int i17, byte[] bArr) {
            this.f205275a = i15;
            this.f205276b = i16;
            this.f205277c = i17;
            this.f205278d = bArr;
        }
    }

    private static int a(int i15) throws t7.x {
        if (i15 == 0) {
            return 768;
        }
        if (i15 == 1) {
            return 1024;
        }
        if (i15 == 2 || i15 == 3) {
            return 2048;
        }
        if (i15 == 4) {
            return PKIFailureInfo.certConfirmed;
        }
        throw t7.x.c("Unsupported coreSbrFrameLengthIndex " + i15);
    }

    private static double b(int i15) throws t7.x {
        switch (i15) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw t7.x.c("Unsupported sampling rate " + i15);
        }
    }

    private static int c(int i15) throws t7.x {
        switch (i15) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw t7.x.c("Unsupported sampling rate index " + i15);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i15) throws t7.x {
        if (i15 == 0 || i15 == 1) {
            return 0;
        }
        int i16 = 2;
        if (i15 != 2) {
            i16 = 3;
            if (i15 != 3) {
                if (i15 == 4) {
                    return 1;
                }
                throw t7.x.c("Unsupported coreSbrFrameLengthIndex " + i15);
            }
        }
        return i16;
    }

    public static boolean e(int i15) {
        return (i15 & 16777215) == 12583333;
    }

    public static int f(w7.b0 b0Var) {
        if (!b0Var.g()) {
            return 0;
        }
        b0Var.r(2);
        return b0Var.h(13);
    }

    public static boolean g(w7.b0 b0Var, b bVar) throws t7.x {
        b0Var.d();
        int iK = k(b0Var, 3, 8, 8);
        bVar.f205272a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(b0Var, 2, 8, 32);
        bVar.f205273b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw t7.x.c("Contains sub-stream with an invalid packet label " + bVar.f205273b);
        }
        if (jL == 0) {
            int i15 = bVar.f205272a;
            if (i15 == 1) {
                throw t7.x.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i15 == 2) {
                throw t7.x.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i15 == 17) {
                throw t7.x.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(b0Var, 11, 24, 24);
        bVar.f205274c = iK2;
        return iK2 != -1;
    }

    public static c h(w7.b0 b0Var) throws t7.x {
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(5);
        int iH3 = iH2 == 31 ? b0Var.h(24) : c(iH2);
        int iH4 = b0Var.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        b0Var.r(2);
        p(b0Var);
        m(b0Var, j(b0Var), iD);
        byte[] bArr = null;
        if (b0Var.g()) {
            int iK = k(b0Var, 2, 4, 8) + 1;
            for (int i15 = 0; i15 < iK; i15++) {
                int iK2 = k(b0Var, 4, 8, 16);
                int iK3 = k(b0Var, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = b0Var.h(4) + 1;
                    b0Var.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i16 = 0; i16 < iH5; i16++) {
                        bArr2[i16] = (byte) b0Var.h(8);
                    }
                    bArr = bArr2;
                } else {
                    b0Var.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(w7.b0 b0Var) {
        b0Var.r(3);
        boolean zG = b0Var.g();
        if (zG) {
            b0Var.r(13);
        }
        return zG;
    }

    private static int j(w7.b0 b0Var) {
        int iH = b0Var.h(5);
        int iK = 0;
        for (int i15 = 0; i15 < iH + 1; i15++) {
            int iH2 = b0Var.h(3);
            iK += k(b0Var, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && b0Var.g()) {
                p(b0Var);
            }
        }
        return iK;
    }

    private static int k(w7.b0 b0Var, int i15, int i16, int i17) {
        zj.p.d(Math.max(Math.max(i15, i16), i17) <= 31);
        int i18 = (1 << i15) - 1;
        int i19 = (1 << i16) - 1;
        ck.c.a(ck.c.a(i18, i19), 1 << i17);
        if (b0Var.b() < i15) {
            return -1;
        }
        int iH = b0Var.h(i15);
        if (iH != i18) {
            return iH;
        }
        if (b0Var.b() < i16) {
            return -1;
        }
        int iH2 = b0Var.h(i16);
        int i25 = iH + iH2;
        if (iH2 != i19) {
            return i25;
        }
        if (b0Var.b() < i17) {
            return -1;
        }
        return i25 + b0Var.h(i17);
    }

    private static long l(w7.b0 b0Var, int i15, int i16, int i17) {
        zj.p.d(Math.max(Math.max(i15, i16), i17) <= 63);
        long j15 = (1 << i15) - 1;
        long j16 = (1 << i16) - 1;
        ck.d.a(ck.d.a(j15, j16), 1 << i17);
        if (b0Var.b() < i15) {
            return -1L;
        }
        long j17 = b0Var.j(i15);
        if (j17 != j15) {
            return j17;
        }
        if (b0Var.b() < i16) {
            return -1L;
        }
        long j18 = b0Var.j(i16);
        long j19 = j17 + j18;
        if (j18 != j16) {
            return j19;
        }
        if (b0Var.b() < i17) {
            return -1L;
        }
        return j19 + b0Var.j(i17);
    }

    private static void m(w7.b0 b0Var, int i15, int i16) {
        int iH;
        int iK = k(b0Var, 4, 8, 16) + 1;
        b0Var.q();
        for (int i17 = 0; i17 < iK; i17++) {
            int iH2 = b0Var.h(2);
            if (iH2 == 0) {
                i(b0Var);
                if (i16 > 0) {
                    o(b0Var);
                }
            } else if (iH2 == 1) {
                if (i(b0Var)) {
                    b0Var.q();
                }
                if (i16 > 0) {
                    o(b0Var);
                    iH = b0Var.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    b0Var.r(6);
                    int iH3 = b0Var.h(2);
                    b0Var.r(4);
                    if (b0Var.g()) {
                        b0Var.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        b0Var.r(6);
                    }
                    if (iH3 == 2) {
                        b0Var.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i15 - 1) / Math.log(2.0d))) + 1;
                int iH4 = b0Var.h(2);
                if (iH4 > 0 && b0Var.g()) {
                    b0Var.r(iFloor);
                }
                if (b0Var.g()) {
                    b0Var.r(iFloor);
                }
                if (i16 == 0 && iH4 == 0) {
                    b0Var.q();
                }
            } else if (iH2 == 3) {
                k(b0Var, 4, 8, 16);
                int iK2 = k(b0Var, 4, 8, 16);
                if (b0Var.g()) {
                    k(b0Var, 8, 16, 0);
                }
                b0Var.q();
                if (iK2 > 0) {
                    b0Var.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(w7.b0 b0Var, int i15) {
        int iH;
        boolean zG = b0Var.g();
        int i16 = zG ? 1 : 5;
        int i17 = zG ? 7 : 5;
        int i18 = zG ? 8 : 6;
        int i19 = 0;
        while (i19 < i15) {
            if (b0Var.g()) {
                b0Var.r(7);
                iH = 0;
            } else {
                if (b0Var.h(2) == 3 && b0Var.h(i17) * i16 != 0) {
                    b0Var.q();
                }
                iH = b0Var.h(i18) * i16;
                if (iH != 0 && iH != 180) {
                    b0Var.q();
                }
                b0Var.q();
            }
            if (iH != 0 && iH != 180 && b0Var.g()) {
                i19++;
            }
            i19++;
        }
    }

    private static void o(w7.b0 b0Var) {
        b0Var.r(3);
        b0Var.r(8);
        boolean zG = b0Var.g();
        boolean zG2 = b0Var.g();
        if (zG) {
            b0Var.r(5);
        }
        if (zG2) {
            b0Var.r(6);
        }
    }

    private static void p(w7.b0 b0Var) {
        int iH = b0Var.h(2);
        if (iH == 0) {
            b0Var.r(6);
            return;
        }
        int iK = k(b0Var, 5, 8, 16) + 1;
        if (iH == 1) {
            b0Var.r(iK * 7);
        } else if (iH == 2) {
            n(b0Var, iK);
        }
    }
}
