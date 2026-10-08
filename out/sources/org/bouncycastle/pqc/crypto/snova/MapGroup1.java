package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes5.dex */
class MapGroup1 {
    public final byte[][][] aAlpha;
    public final byte[][][] bAlpha;

    /* JADX INFO: renamed from: p11, reason: collision with root package name */
    public final byte[][][][] f149573p11;

    /* JADX INFO: renamed from: p12, reason: collision with root package name */
    public final byte[][][][] f149574p12;

    /* JADX INFO: renamed from: p21, reason: collision with root package name */
    public final byte[][][][] f149575p21;
    public final byte[][][] qAlpha1;
    public final byte[][][] qAlpha2;

    public MapGroup1(SnovaParameters snovaParameters) {
        int m15 = snovaParameters.getM();
        int v15 = snovaParameters.getV();
        int o15 = snovaParameters.getO();
        int alpha = snovaParameters.getAlpha();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.f149573p11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, v15, v15, lsq);
        this.f149574p12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, v15, o15, lsq);
        this.f149575p21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, o15, v15, lsq);
        this.aAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m15, alpha, lsq);
        this.bAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m15, alpha, lsq);
        this.qAlpha1 = (byte[][][]) Array.newInstance((Class<?>) cls, m15, alpha, lsq);
        this.qAlpha2 = (byte[][][]) Array.newInstance((Class<?>) cls, m15, alpha, lsq);
    }

    private static int decodeAlpha(byte[] bArr, int i15, byte[][][] bArr2, int i16) {
        int iDecodeArray = 0;
        for (byte[][] bArr3 : bArr2) {
            iDecodeArray += decodeArray(bArr, i15 + iDecodeArray, bArr3, i16 - iDecodeArray);
        }
        return iDecodeArray;
    }

    static int decodeArray(byte[] bArr, int i15, byte[][] bArr2, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 < bArr2.length; i18++) {
            int iMin = Math.min(bArr2[i18].length, i16 << 1);
            GF16.decode(bArr, i15 + i17, bArr2[i18], 0, iMin);
            int i19 = (iMin + 1) >> 1;
            i17 += i19;
            i16 -= i19;
        }
        return i17;
    }

    static int decodeP(byte[] bArr, int i15, byte[][][][] bArr2, int i16) {
        int iDecodeAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iDecodeAlpha += decodeAlpha(bArr, i15 + iDecodeAlpha, bArr3, i16);
        }
        return iDecodeAlpha;
    }

    static int fillAlpha(byte[] bArr, int i15, byte[][][] bArr2, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 < bArr2.length; i18++) {
            int i19 = 0;
            while (true) {
                byte[][] bArr3 = bArr2[i18];
                if (i19 < bArr3.length) {
                    int iMin = Math.min(bArr3[i19].length, i16 - i17);
                    System.arraycopy(bArr, i15 + i17, bArr2[i18][i19], 0, iMin);
                    i17 += iMin;
                    i19++;
                }
            }
        }
        return i17;
    }

    static int fillP(byte[] bArr, int i15, byte[][][][] bArr2, int i16) {
        int iFillAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iFillAlpha += fillAlpha(bArr, i15 + iFillAlpha, bArr3, i16 - iFillAlpha);
        }
        return iFillAlpha;
    }

    void decode(byte[] bArr, int i15, boolean z15) {
        int iDecodeP = decodeP(bArr, 0, this.f149573p11, i15);
        int iDecodeP2 = iDecodeP + decodeP(bArr, iDecodeP, this.f149574p12, i15 - iDecodeP);
        int iDecodeP3 = iDecodeP2 + decodeP(bArr, iDecodeP2, this.f149575p21, i15 - iDecodeP2);
        if (z15) {
            int iDecodeAlpha = iDecodeP3 + decodeAlpha(bArr, iDecodeP3, this.aAlpha, i15 - iDecodeP3);
            int iDecodeAlpha2 = iDecodeAlpha + decodeAlpha(bArr, iDecodeAlpha, this.bAlpha, i15 - iDecodeAlpha);
            int iDecodeAlpha3 = iDecodeAlpha2 + decodeAlpha(bArr, iDecodeAlpha2, this.qAlpha1, i15 - iDecodeAlpha2);
            decodeAlpha(bArr, iDecodeAlpha3, this.qAlpha2, i15 - iDecodeAlpha3);
        }
    }

    void fill(byte[] bArr, boolean z15) {
        int iFillP = fillP(bArr, 0, this.f149573p11, bArr.length);
        int iFillP2 = iFillP + fillP(bArr, iFillP, this.f149574p12, bArr.length - iFillP);
        int iFillP3 = iFillP2 + fillP(bArr, iFillP2, this.f149575p21, bArr.length - iFillP2);
        if (z15) {
            int iFillAlpha = iFillP3 + fillAlpha(bArr, iFillP3, this.aAlpha, bArr.length - iFillP3);
            int iFillAlpha2 = iFillAlpha + fillAlpha(bArr, iFillAlpha, this.bAlpha, bArr.length - iFillAlpha);
            int iFillAlpha3 = iFillAlpha2 + fillAlpha(bArr, iFillAlpha2, this.qAlpha1, bArr.length - iFillAlpha2);
            fillAlpha(bArr, iFillAlpha3, this.qAlpha2, bArr.length - iFillAlpha3);
        }
    }
}
