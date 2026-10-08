package o8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f143168a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f143169b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f143170c = {64, 112, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, PKIFailureInfo.certConfirmed, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f143171d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f143172e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f143173f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f143174g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f143175h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f143176i = {5, 8, 10, 12};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f143181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f143182f;

        private b(String str, int i15, int i16, int i17, long j15, int i18) {
            this.f143177a = str;
            this.f143179c = i15;
            this.f143178b = i16;
            this.f143180d = i17;
            this.f143181e = j15;
            this.f143182f = i18;
        }
    }

    private static void a(byte[] bArr, int i15) throws t7.x {
        int i16 = i15 - 2;
        if (((bArr[i15 - 1] & 255) | ((bArr[i16] << 8) & 65535)) != w7.o0.u(bArr, 0, i16, 65535)) {
            throw t7.x.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i15;
        byte b15;
        int i16;
        int i17;
        byte b16;
        boolean z15 = false;
        byte b17 = bArr[0];
        if (b17 != -2) {
            if (b17 == -1) {
                i17 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b16 = bArr[9];
            } else if (b17 != 31) {
                i15 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b15 = bArr[7];
            } else {
                i17 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b16 = bArr[8];
            }
            i16 = (((b16 & 60) >> 2) | i17) + 1;
            z15 = true;
            if (z15) {
                return (i16 * 16) / 14;
            }
            return i16;
        }
        i15 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b15 = bArr[6];
        i16 = (((b15 & 240) >> 4) | i15) + 1;
        if (z15) {
            return (i16 * 16) / 14;
        }
        return i16;
    }

    public static int c(int i15) {
        if (i15 == 2147385345 || i15 == -25230976 || i15 == 536864768 || i15 == -14745368) {
            return 1;
        }
        if (i15 == 1683496997 || i15 == 622876772) {
            return 2;
        }
        if (i15 == 1078008818 || i15 == -233094848) {
            return 3;
        }
        return (i15 == 1908687592 || i15 == -398277519) ? 4 : 0;
    }

    private static w7.b0 d(byte[] bArr) {
        byte b15 = bArr[0];
        if (b15 == 127 || b15 == 100 || b15 == 64 || b15 == 113) {
            return new w7.b0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i15 = 0; i15 < bArrCopyOf.length - 1; i15 += 2) {
                byte b16 = bArrCopyOf[i15];
                int i16 = i15 + 1;
                bArrCopyOf[i15] = bArrCopyOf[i16];
                bArrCopyOf[i16] = b16;
            }
        }
        w7.b0 b0Var = new w7.b0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            w7.b0 b0Var2 = new w7.b0(bArrCopyOf);
            while (b0Var2.b() >= 16) {
                b0Var2.r(2);
                b0Var.f(b0Var2.h(14), 14);
            }
        }
        b0Var.n(bArrCopyOf);
        return b0Var;
    }

    private static boolean e(byte[] bArr) {
        byte b15 = bArr[0];
        return b15 == -2 || b15 == -1 || b15 == 37 || b15 == -14 || b15 == -24;
    }

    public static boolean f(q qVar, int i15) {
        w7.c0 c0Var = new w7.c0(i15);
        if (!qVar.e(c0Var.f(), 0, i15, true)) {
            return false;
        }
        qVar.g();
        if (c(c0Var.p()) != 1 || c0Var.a() < 10) {
            return false;
        }
        byte[] bArr = new byte[10];
        c0Var.u(bArr, 0, 10);
        c0Var.f0(0);
        int iB = b(bArr);
        if (iB > 0 && c0Var.a() >= iB + 4) {
            c0Var.g0(iB);
            if (c(c0Var.z()) == 2) {
                return true;
            }
        }
        return false;
    }

    public static int g(ByteBuffer byteBuffer) {
        int i15;
        byte b15;
        int i16;
        byte b16;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return PKIFailureInfo.certConfirmed;
        }
        int iPosition = byteBuffer.position();
        byte b17 = byteBuffer.get(iPosition);
        if (b17 != -2) {
            if (b17 == -1) {
                i15 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b16 = byteBuffer.get(iPosition + 7);
            } else if (b17 != 31) {
                i15 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b15 = byteBuffer.get(iPosition + 5);
            } else {
                i15 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b16 = byteBuffer.get(iPosition + 6);
            }
            i16 = b16 & 60;
            return (((i16 >> 2) | i15) + 1) * 32;
        }
        i15 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b15 = byteBuffer.get(iPosition + 4);
        i16 = b15 & 252;
        return (((i16 >> 2) | i15) + 1) * 32;
    }

    public static int h(byte[] bArr) {
        int i15;
        byte b15;
        int i16;
        byte b16;
        byte b17 = bArr[0];
        if (b17 != -2) {
            if (b17 == -1) {
                i15 = (bArr[4] & 7) << 4;
                b16 = bArr[7];
            } else if (b17 != 31) {
                i15 = (bArr[4] & 1) << 6;
                b15 = bArr[5];
            } else {
                i15 = (bArr[5] & 7) << 4;
                b16 = bArr[6];
            }
            i16 = b16 & 60;
            return (((i16 >> 2) | i15) + 1) * 32;
        }
        i15 = (bArr[5] & 1) << 6;
        b15 = bArr[4];
        i16 = b15 & 252;
        return (((i16 >> 2) | i15) + 1) * 32;
    }

    public static t7.p i(byte[] bArr, String str, String str2, int i15, String str3, t7.l lVar) {
        w7.b0 b0VarD = d(bArr);
        b0VarD.r(60);
        int i16 = f143168a[b0VarD.h(6)];
        int i17 = f143169b[b0VarD.h(4)];
        int iH = b0VarD.h(5);
        int[] iArr = f143170c;
        int i18 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        b0VarD.r(10);
        return new t7.p.b().k0(str).X(str3).A0("audio/vnd.dts").T(i18).U(i16 + (b0VarD.h(2) > 0 ? 1 : 0)).B0(i17).d0(lVar).o0(str2).y0(i15).Q();
    }

    public static b j(byte[] bArr) throws t7.x {
        int i15;
        int i16;
        int iH;
        int i17;
        long jU0;
        int i18;
        w7.b0 b0VarD = d(bArr);
        b0VarD.r(40);
        int iH2 = b0VarD.h(2);
        if (b0VarD.g()) {
            i15 = 20;
            i16 = 12;
        } else {
            i15 = 16;
            i16 = 8;
        }
        b0VarD.r(i16);
        int iH3 = b0VarD.h(i15) + 1;
        boolean zG = b0VarD.g();
        int iH4 = -1;
        int i19 = 0;
        if (zG) {
            iH = b0VarD.h(2);
            int iH5 = (b0VarD.h(3) + 1) * 512;
            if (b0VarD.g()) {
                b0VarD.r(36);
            }
            int iH6 = b0VarD.h(3) + 1;
            int iH7 = b0VarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw t7.x.c("Multiple audio presentations or assets not supported");
            }
            int i25 = iH2 + 1;
            int iH8 = b0VarD.h(i25);
            for (int i26 = 0; i26 < i25; i26++) {
                if (((iH8 >> i26) & 1) == 1) {
                    b0VarD.r(8);
                }
            }
            if (b0VarD.g()) {
                b0VarD.r(2);
                int iH9 = (b0VarD.h(2) + 1) << 2;
                int iH10 = b0VarD.h(2) + 1;
                while (i19 < iH10) {
                    b0VarD.r(iH9);
                    i19++;
                }
            }
            i19 = iH5;
        } else {
            iH = -1;
        }
        b0VarD.r(i15);
        b0VarD.r(12);
        if (zG) {
            if (b0VarD.g()) {
                b0VarD.r(4);
            }
            if (b0VarD.g()) {
                b0VarD.r(24);
            }
            if (b0VarD.g()) {
                b0VarD.s(b0VarD.h(10) + 1);
            }
            b0VarD.r(5);
            i17 = f143171d[b0VarD.h(4)];
            iH4 = b0VarD.h(8) + 1;
        } else {
            i17 = -2147483647;
        }
        int i27 = i17;
        if (zG) {
            if (iH == 0) {
                i18 = 32000;
            } else if (iH == 1) {
                i18 = 44100;
            } else {
                if (iH != 2) {
                    throw t7.x.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i18 = 48000;
            }
            jU0 = w7.o0.U0(i19, 1000000L, i18);
        } else {
            jU0 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i27, iH3, jU0, 0);
    }

    public static int k(byte[] bArr) {
        w7.b0 b0VarD = d(bArr);
        b0VarD.r(42);
        return b0VarD.h(b0VarD.g() ? 12 : 8) + 1;
    }

    public static b l(byte[] bArr, AtomicInteger atomicInteger) throws t7.x {
        int iH;
        long jU0;
        AtomicInteger atomicInteger2;
        int i15;
        int i16;
        w7.b0 b0VarD = d(bArr);
        int i17 = b0VarD.h(32) == 1078008818 ? 1 : 0;
        int iN = n(b0VarD, f143172e, true) + 1;
        if (i17 == 0) {
            iH = -2147483647;
            jU0 = -9223372036854775807L;
        } else {
            if (!b0VarD.g()) {
                throw t7.x.c("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iN);
            int iH2 = b0VarD.h(2);
            if (iH2 == 0) {
                i15 = 512;
            } else if (iH2 == 1) {
                i15 = 480;
            } else {
                if (iH2 != 2) {
                    throw t7.x.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i15 = MLKEMEngine.KyberPolyBytes;
            }
            int iH3 = i15 * (b0VarD.h(3) + 1);
            int iH4 = b0VarD.h(2);
            if (iH4 == 0) {
                i16 = 32000;
            } else if (iH4 == 1) {
                i16 = 44100;
            } else {
                if (iH4 != 2) {
                    throw t7.x.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i16 = 48000;
            }
            if (b0VarD.g()) {
                b0VarD.r(36);
            }
            iH = (1 << b0VarD.h(2)) * i16;
            jU0 = w7.o0.U0(iH3, 1000000L, i16);
        }
        int i18 = iH;
        long j15 = jU0;
        int iN2 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            iN2 += n(b0VarD, f143173f, true);
        }
        if (i17 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(n(b0VarD, f143174g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i18, iN + iN2 + (atomicInteger2.get() != 0 ? n(b0VarD, f143175h, true) : 0), j15, 0);
    }

    public static int m(byte[] bArr) {
        w7.b0 b0VarD = d(bArr);
        b0VarD.r(32);
        return n(b0VarD, f143176i, true) + 1;
    }

    private static int n(w7.b0 b0Var, int[] iArr, boolean z15) {
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 3 && b0Var.g(); i17++) {
            i16++;
        }
        if (z15) {
            int i18 = 0;
            while (i15 < i16) {
                i18 += 1 << iArr[i15];
                i15++;
            }
            i15 = i18;
        }
        return i15 + b0Var.h(iArr[i16]);
    }
}
