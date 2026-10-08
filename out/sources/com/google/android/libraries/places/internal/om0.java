package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f33193a = Logger.getLogger(om0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f33194b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private om0() {
    }

    public static byte[][] a(a80 a80Var) {
        int length;
        int i15;
        byte[][] bArrC = p60.c(a80Var);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            length = bArrC.length;
            if (i16 >= length) {
                break;
            }
            byte[] bArr = bArrC[i16];
            byte[] bArr2 = bArrC[i16 + 1];
            if (c(bArr, f33194b)) {
                i15 = i17 + 2;
                bArrC[i17] = bArr;
                bArrC[i17 + 1] = p60.f33275b.f(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else {
                int length2 = bArr2.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length2) {
                        i15 = i17 + 2;
                        bArrC[i17] = bArr;
                        bArrC[i17 + 1] = bArr2;
                    } else {
                        byte b15 = bArr2[i18];
                        if (b15 < 32 || b15 > 126) {
                            String str = new String(bArr, StandardCharsets.US_ASCII);
                            Logger logger = f33193a;
                            Level level = Level.WARNING;
                            String string = Arrays.toString(bArr2);
                            StringBuilder sb5 = new StringBuilder(str.length() + 21 + String.valueOf(string).length() + 34);
                            sb5.append("Metadata key=");
                            sb5.append(str);
                            sb5.append(", value=");
                            sb5.append(string);
                            sb5.append(" contains invalid ASCII characters");
                            logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb5.toString());
                        } else {
                            i18++;
                        }
                    }
                    i16 += 2;
                }
            }
            i17 = i15;
            i16 += 2;
        }
        return i17 == length ? bArrC : (byte[][]) Arrays.copyOfRange(bArrC, 0, i17);
    }

    public static byte[][] b(byte[][] bArr) {
        int i15 = 0;
        while (i15 < bArr.length) {
            byte[] bArr2 = bArr[i15];
            int i16 = i15 + 1;
            byte[] bArr3 = bArr[i16];
            byte[] bArr4 = f33194b;
            if (c(bArr2, bArr4)) {
                for (byte b15 : bArr3) {
                    if (b15 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i17 = 0; i17 < i15; i17++) {
                            arrayList.add(bArr[i17]);
                        }
                        while (i15 < bArr.length) {
                            byte[] bArr5 = bArr[i15];
                            byte[] bArr6 = bArr[i15 + 1];
                            if (c(bArr5, bArr4)) {
                                int i18 = 0;
                                int i19 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i18 <= length) {
                                        if (i18 == length || bArr6[i18] == 44) {
                                            byte[] bArrC = bk.a.b().c(new String(bArr6, i19, i18 - i19, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrC);
                                            i19 = i18 + 1;
                                        }
                                        i18++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i15 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i16] = bk.a.b().c(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i15 += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i15 = length; i15 < bArr.length; i15++) {
            if (bArr[i15] != bArr2[i15 - length]) {
                return false;
            }
        }
        return true;
    }
}
