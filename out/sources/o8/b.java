package o8;

import java.nio.ByteBuffer;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f143006a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f143007b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f143008c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f143009d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f143010e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f143011f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: o8.b$b, reason: collision with other inner class name */
    public static final class C3544b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f143016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f143017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f143018g;

        private C3544b(String str, int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f143012a = str;
            this.f143013b = i15;
            this.f143015d = i16;
            this.f143014c = i17;
            this.f143016e = i18;
            this.f143017f = i19;
            this.f143018g = i25;
        }
    }

    private static int a(int i15, int i16, int i17) {
        return (i15 * i16) / (i17 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i15 = iPosition; i15 <= iLimit; i15++) {
            if ((w7.o0.O(byteBuffer, i15 + 4) & (-2)) == -126718022) {
                return i15 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i15, int i16) {
        int i17 = i16 / 2;
        if (i15 < 0) {
            return -1;
        }
        int[] iArr = f143007b;
        if (i15 >= iArr.length || i16 < 0) {
            return -1;
        }
        int[] iArr2 = f143011f;
        if (i17 >= iArr2.length) {
            return -1;
        }
        int i18 = iArr[i15];
        if (i18 == 44100) {
            return (iArr2[i17] + (i16 % 2)) * 2;
        }
        int i19 = f143010e[i17];
        return i18 == 32000 ? i19 * 6 : i19 * 4;
    }

    public static t7.p d(w7.c0 c0Var, String str, String str2, t7.l lVar) {
        w7.b0 b0Var = new w7.b0();
        b0Var.m(c0Var);
        int i15 = f143007b[b0Var.h(2)];
        b0Var.r(8);
        int i16 = f143009d[b0Var.h(3)];
        if (b0Var.h(1) != 0) {
            i16++;
        }
        int i17 = f143010e[b0Var.h(5)] * 1000;
        b0Var.c();
        c0Var.f0(b0Var.d());
        return new t7.p.b().k0(str).A0("audio/ac3").U(i16).B0(i15).d0(lVar).o0(str2).T(i17).u0(i17).Q();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f143006a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C3544b f(w7.b0 b0Var) {
        int iC;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int iE = b0Var.e();
        b0Var.r(40);
        boolean z15 = b0Var.h(5) > 10;
        b0Var.p(iE);
        int i29 = -1;
        if (z15) {
            b0Var.r(16);
            int iH = b0Var.h(2);
            if (iH == 0) {
                i29 = 0;
            } else if (iH == 1) {
                i29 = 1;
            } else if (iH == 2) {
                i29 = 2;
            }
            b0Var.r(3);
            iC = (b0Var.h(11) + 1) * 2;
            int iH2 = b0Var.h(2);
            if (iH2 == 3) {
                i15 = f143008c[b0Var.h(2)];
                i19 = 3;
                i25 = 6;
            } else {
                int iH3 = b0Var.h(2);
                int i35 = f143006a[iH3];
                i19 = iH3;
                i15 = f143007b[iH2];
                i25 = i35;
            }
            i17 = i25 * 256;
            int iA = a(iC, i15, i25);
            int iH4 = b0Var.h(3);
            boolean zG = b0Var.g();
            i16 = f143009d[iH4] + (zG ? 1 : 0);
            b0Var.r(10);
            if (b0Var.g()) {
                b0Var.r(8);
            }
            if (iH4 == 0) {
                b0Var.r(5);
                if (b0Var.g()) {
                    b0Var.r(8);
                }
            }
            if (i29 == 1 && b0Var.g()) {
                b0Var.r(16);
            }
            if (b0Var.g()) {
                if (iH4 > 2) {
                    b0Var.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i27 = 6;
                } else {
                    i27 = 6;
                    b0Var.r(6);
                }
                if ((iH4 & 4) != 0) {
                    b0Var.r(i27);
                }
                if (zG && b0Var.g()) {
                    b0Var.r(5);
                }
                if (i29 == 0) {
                    if (b0Var.g()) {
                        i28 = 6;
                        b0Var.r(6);
                    } else {
                        i28 = 6;
                    }
                    if (iH4 == 0 && b0Var.g()) {
                        b0Var.r(i28);
                    }
                    if (b0Var.g()) {
                        b0Var.r(i28);
                    }
                    int iH5 = b0Var.h(2);
                    if (iH5 == 1) {
                        b0Var.r(5);
                    } else if (iH5 == 2) {
                        b0Var.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = b0Var.h(5);
                        if (b0Var.g()) {
                            b0Var.r(5);
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                b0Var.r(4);
                            }
                            if (b0Var.g()) {
                                if (b0Var.g()) {
                                    b0Var.r(4);
                                }
                                if (b0Var.g()) {
                                    b0Var.r(4);
                                }
                            }
                        }
                        if (b0Var.g()) {
                            b0Var.r(5);
                            if (b0Var.g()) {
                                b0Var.r(7);
                                if (b0Var.g()) {
                                    b0Var.r(8);
                                }
                            }
                        }
                        b0Var.r((iH6 + 2) * 8);
                        b0Var.c();
                    }
                    if (iH4 < 2) {
                        if (b0Var.g()) {
                            b0Var.r(14);
                        }
                        if (iH4 == 0 && b0Var.g()) {
                            b0Var.r(14);
                        }
                    }
                    if (b0Var.g()) {
                        if (i19 == 0) {
                            b0Var.r(5);
                        } else {
                            for (int i36 = 0; i36 < i25; i36++) {
                                if (b0Var.g()) {
                                    b0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (b0Var.g()) {
                b0Var.r(5);
                if (iH4 == 2) {
                    b0Var.r(4);
                }
                if (iH4 >= 6) {
                    b0Var.r(2);
                }
                if (b0Var.g()) {
                    b0Var.r(8);
                }
                if (iH4 == 0 && b0Var.g()) {
                    b0Var.r(8);
                }
                if (iH2 < 3) {
                    b0Var.q();
                }
            }
            if (i29 == 0 && i19 != 3) {
                b0Var.q();
            }
            if (i29 == 2 && (i19 == 3 || b0Var.g())) {
                i26 = 6;
                b0Var.r(6);
            } else {
                i26 = 6;
            }
            str = (b0Var.g() && b0Var.h(i26) == 1 && b0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i18 = iA;
        } else {
            b0Var.r(32);
            int iH7 = b0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = b0Var.h(6);
            int i37 = f143010e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            b0Var.r(8);
            int iH9 = b0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                b0Var.r(2);
            }
            if ((iH9 & 4) != 0) {
                b0Var.r(2);
            }
            if (iH9 == 2) {
                b0Var.r(2);
            }
            int[] iArr = f143007b;
            i15 = iH7 < iArr.length ? iArr[iH7] : -1;
            i16 = f143009d[iH9] + (b0Var.g() ? 1 : 0);
            i17 = 1536;
            str = str2;
            i18 = i37;
        }
        return new C3544b(str, i29, i16, i15, iC, i17, i18);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b15 = bArr[4];
        return c((b15 & 192) >> 6, b15 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static t7.p h(w7.c0 c0Var, String str, String str2, t7.l lVar) {
        String str3;
        w7.b0 b0Var = new w7.b0();
        b0Var.m(c0Var);
        int iH = b0Var.h(13) * 1000;
        b0Var.r(3);
        int i15 = f143007b[b0Var.h(2)];
        b0Var.r(10);
        int i16 = f143009d[b0Var.h(3)];
        if (b0Var.h(1) != 0) {
            i16++;
        }
        b0Var.r(3);
        int iH2 = b0Var.h(4);
        b0Var.r(1);
        if (iH2 > 0) {
            b0Var.r(6);
            if (b0Var.h(1) != 0) {
                i16 += 2;
            }
            b0Var.r(1);
        }
        if (b0Var.b() > 7) {
            b0Var.r(7);
            if (b0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        b0Var.c();
        c0Var.f0(b0Var.d());
        return new t7.p.b().k0(str).A0(str3).U(i16).B0(i15).d0(lVar).o0(str2).u0(iH).Q();
    }

    public static int i(ByteBuffer byteBuffer, int i15) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b15 = bArr[7];
            if ((b15 & 254) == 186) {
                return 40 << ((bArr[(b15 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
