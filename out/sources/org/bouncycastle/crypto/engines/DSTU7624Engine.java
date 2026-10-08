package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class DSTU7624Engine implements BlockCipher {
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, 127, -118, 39, -57, -64, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, 97};
    private static final byte[] T0 = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, 18, 111, 40, -51, -118, 112, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, 44, 75, 29, -127, 21, -12, 35, -42, -22, -31, 103, -15, 127, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, 16, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, PSSSigner.TRAILER_IMPLICIT, 11, 84, 26, -90, -69, 38, -128, 72, -108, 50, 125, -89, 63, -82, 34, 61, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, -28, 52, 45, -106, -58, 58, -19, -107, 14, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};
    private static final byte[] T1 = {-125, -14, 42, -21, -23, -65, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, 61, -120, 104, 6, 57, 17, 76, 14, -96, 86, 64, -110, 21, PSSSigner.TRAILER_IMPLICIT, -77, -36, 111, -8, 38, -70, -66, -67, 49, -5, -61, -2, -128, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, 93, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, 16, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, 25, 53, -26, 127, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, -16, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, 37, 28, 33, 51, 15, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] T2 = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, 30, 17, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, 49, 44, 71, 106, -103, -82, -56, 127, -7, 79, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, 16, -52, 60, 84, 74, 82, -108, 14, -64, 40, -10, 86, 96, -94, -29, 15, -20, -99, 36, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, 39, -11, -128, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, 43, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, 13, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};
    private static final byte[] T3 = {-78, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, 14, 59, -3, -54, -101, 13, 15, 121, -116, 16, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, 33, 87, 80, 78, -87, -128, -39, -17, 100, 65, -49, 60, -18, 46, 19, 41, -70, 52, 90, -82, -118, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, 127, -41, 49, 43, 102, 111, -1, 114, -122, -16, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, -65, -124, 123, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, 36, 83, -33, -13, -125, 40, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private boolean forEncryption;
    private long[] internalState;
    private long[][] roundKeys;
    private int roundsAmount;
    private int wordsInBlock;
    private int wordsInKey;
    private long[] workingKey;

    public DSTU7624Engine(int i15) {
        if (i15 != 128 && i15 != 256 && i15 != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i16 = i15 >>> 6;
        this.wordsInBlock = i16;
        this.internalState = new long[i16];
    }

    private void addRoundKey(int i15) {
        long[] jArr = this.roundKeys[i15];
        for (int i16 = 0; i16 < this.wordsInBlock; i16++) {
            long[] jArr2 = this.internalState;
            jArr2[i16] = jArr2[i16] + jArr[i16];
        }
    }

    private void decryptBlock_128(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i15);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i15 + 8);
        long[][] jArr = this.roundKeys;
        int i17 = this.roundsAmount;
        long[] jArr2 = jArr[i17];
        char c15 = 0;
        long j15 = jLittleEndianToLong - jArr2[0];
        char c16 = 1;
        long j16 = jLittleEndianToLong2 - jArr2[1];
        while (true) {
            long jMixColumnInv = mixColumnInv(j15);
            long jMixColumnInv2 = mixColumnInv(j16);
            int i18 = (int) jMixColumnInv;
            int i19 = (int) (jMixColumnInv >>> 32);
            int i25 = (int) jMixColumnInv2;
            int i26 = (int) (jMixColumnInv2 >>> 32);
            byte[] bArr3 = T0;
            byte b15 = bArr3[i18 & GF2Field.MASK];
            byte[] bArr4 = T1;
            byte b16 = bArr4[(i18 >>> 8) & GF2Field.MASK];
            byte[] bArr5 = T2;
            char c17 = c15;
            byte b17 = bArr5[(i18 >>> 16) & GF2Field.MASK];
            byte[] bArr6 = T3;
            char c18 = c16;
            long j17 = (((long) ((bArr6[i18 >>> 24] << 24) | ((b17 & 255) << 16) | (b15 & 255) | ((b16 & 255) << 8))) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i26 >>> 24] << 24) | (((bArr3[i26 & GF2Field.MASK] & 255) | ((bArr4[(i26 >>> 8) & GF2Field.MASK] & 255) << 8)) | ((bArr5[(i26 >>> 16) & GF2Field.MASK] & 255) << 16)))) << 32);
            long j18 = (((long) ((bArr6[i25 >>> 24] << 24) | (bArr3[i25 & GF2Field.MASK] & 255) | ((bArr4[(i25 >>> 8) & GF2Field.MASK] & 255) << 8) | ((bArr5[(i25 >>> 16) & GF2Field.MASK] & 255) << 16))) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i19 >>> 24] << 24) | (((bArr3[i19 & GF2Field.MASK] & 255) | ((bArr4[(i19 >>> 8) & GF2Field.MASK] & 255) << 8)) | ((bArr5[(i19 >>> 16) & GF2Field.MASK] & 255) << 16)))) << 32);
            i17--;
            long[][] jArr3 = this.roundKeys;
            if (i17 == 0) {
                long[] jArr4 = jArr3[c17];
                long j19 = j17 - jArr4[c17];
                long j25 = j18 - jArr4[c18];
                Pack.longToLittleEndian(j19, bArr2, i16);
                Pack.longToLittleEndian(j25, bArr2, i16 + 8);
                return;
            }
            long[] jArr5 = jArr3[i17];
            long j26 = jArr5[c17] ^ j17;
            j16 = j18 ^ jArr5[c18];
            j15 = j26;
            c15 = c17;
            c16 = c18;
        }
    }

    private void encryptBlock_128(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i15);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i15 + 8);
        char c15 = 0;
        long[] jArr = this.roundKeys[0];
        long j15 = jLittleEndianToLong + jArr[0];
        char c16 = 1;
        long j16 = jLittleEndianToLong2 + jArr[1];
        int i17 = 0;
        while (true) {
            int i18 = (int) j15;
            int i19 = (int) (j15 >>> 32);
            int i25 = (int) j16;
            int i26 = (int) (j16 >>> 32);
            byte[] bArr3 = S0;
            byte b15 = bArr3[i18 & GF2Field.MASK];
            byte[] bArr4 = S1;
            byte b16 = bArr4[(i18 >>> 8) & GF2Field.MASK];
            byte[] bArr5 = S2;
            char c17 = c15;
            byte b17 = bArr5[(i18 >>> 16) & GF2Field.MASK];
            byte[] bArr6 = S3;
            char c18 = c16;
            long j17 = (((long) (((b17 & 255) << 16) | (b15 & 255) | ((b16 & 255) << 8) | (bArr6[i18 >>> 24] << 24))) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i26 >>> 24] << 24) | (((bArr3[i26 & GF2Field.MASK] & 255) | ((bArr4[(i26 >>> 8) & GF2Field.MASK] & 255) << 8)) | ((bArr5[(i26 >>> 16) & GF2Field.MASK] & 255) << 16)))) << 32);
            long j18 = (((long) ((bArr6[i25 >>> 24] << 24) | (bArr3[i25 & GF2Field.MASK] & 255) | ((bArr4[(i25 >>> 8) & GF2Field.MASK] & 255) << 8) | ((bArr5[(i25 >>> 16) & GF2Field.MASK] & 255) << 16))) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i19 >>> 24] << 24) | (((bArr3[i19 & GF2Field.MASK] & 255) | ((bArr4[(i19 >>> 8) & GF2Field.MASK] & 255) << 8)) | ((bArr5[(i19 >>> 16) & GF2Field.MASK] & 255) << 16)))) << 32);
            long jMixColumn = mixColumn(j17);
            long jMixColumn2 = mixColumn(j18);
            i17++;
            int i27 = this.roundsAmount;
            if (i17 == i27) {
                long[] jArr2 = this.roundKeys[i27];
                long j19 = jMixColumn + jArr2[c17];
                long j25 = jMixColumn2 + jArr2[c18];
                Pack.longToLittleEndian(j19, bArr2, i16);
                Pack.longToLittleEndian(j25, bArr2, i16 + 8);
                return;
            }
            long[] jArr3 = this.roundKeys[i17];
            long j26 = jMixColumn ^ jArr3[c17];
            j16 = jMixColumn2 ^ jArr3[c18];
            j15 = j26;
            c15 = c17;
            c16 = c18;
        }
    }

    private void invShiftRows() {
        int i15 = this.wordsInBlock;
        if (i15 == 2) {
            long[] jArr = this.internalState;
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = (-4294967296L) & (j15 ^ j16);
            jArr[0] = j15 ^ j17;
            jArr[1] = j17 ^ j16;
            return;
        }
        if (i15 == 4) {
            long[] jArr2 = this.internalState;
            long j18 = jArr2[0];
            long j19 = jArr2[1];
            long j25 = jArr2[2];
            long j26 = jArr2[3];
            long j27 = (j18 ^ j19) & (-281470681808896L);
            long j28 = j18 ^ j27;
            long j29 = j19 ^ j27;
            long j35 = (j25 ^ j26) & (-281470681808896L);
            long j36 = j25 ^ j35;
            long j37 = j26 ^ j35;
            long j38 = (j28 ^ j36) & (-4294967296L);
            long j39 = j28 ^ j38;
            long j45 = (j29 ^ j37) & 281474976645120L;
            jArr2[0] = j39;
            jArr2[1] = j29 ^ j45;
            jArr2[2] = j36 ^ j38;
            jArr2[3] = j45 ^ j37;
            return;
        }
        if (i15 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j46 = jArr3[0];
        long j47 = jArr3[1];
        long j48 = jArr3[2];
        long j49 = jArr3[3];
        long j55 = jArr3[4];
        long j56 = jArr3[5];
        long j57 = jArr3[6];
        long j58 = jArr3[7];
        long j59 = (j46 ^ j47) & (-71777214294589696L);
        long j65 = j46 ^ j59;
        long j66 = j47 ^ j59;
        long j67 = (j48 ^ j49) & (-71777214294589696L);
        long j68 = j48 ^ j67;
        long j69 = j49 ^ j67;
        long j75 = (j55 ^ j56) & (-71777214294589696L);
        long j76 = j55 ^ j75;
        long j77 = j56 ^ j75;
        long j78 = (j57 ^ j58) & (-71777214294589696L);
        long j79 = j57 ^ j78;
        long j85 = j58 ^ j78;
        long j86 = (j65 ^ j68) & (-281470681808896L);
        long j87 = j65 ^ j86;
        long j88 = j68 ^ j86;
        long j89 = (j66 ^ j69) & 72056494543077120L;
        long j95 = j66 ^ j89;
        long j96 = j69 ^ j89;
        long j97 = (j76 ^ j79) & (-281470681808896L);
        long j98 = j76 ^ j97;
        long j99 = j79 ^ j97;
        long j100 = (j77 ^ j85) & 72056494543077120L;
        long j101 = j77 ^ j100;
        long j102 = j85 ^ j100;
        long j103 = (j87 ^ j98) & (-4294967296L);
        long j104 = j87 ^ j103;
        long j105 = j98 ^ j103;
        long j106 = (j95 ^ j101) & 72057594021150720L;
        long j107 = j95 ^ j106;
        long j108 = (j88 ^ j99) & 281474976645120L;
        long j109 = j88 ^ j108;
        long j110 = j108 ^ j99;
        long j111 = (j96 ^ j102) & 1099511627520L;
        jArr3[0] = j104;
        jArr3[1] = j107;
        jArr3[2] = j109;
        jArr3[3] = j96 ^ j111;
        jArr3[4] = j105;
        jArr3[5] = j101 ^ j106;
        jArr3[6] = j110;
        jArr3[7] = j102 ^ j111;
    }

    private void invSubBytes() {
        for (int i15 = 0; i15 < this.wordsInBlock; i15++) {
            long[] jArr = this.internalState;
            long j15 = jArr[i15];
            int i16 = (int) j15;
            int i17 = (int) (j15 >>> 32);
            byte[] bArr = T0;
            byte b15 = bArr[i16 & GF2Field.MASK];
            byte[] bArr2 = T1;
            byte b16 = bArr2[(i16 >>> 8) & GF2Field.MASK];
            byte[] bArr3 = T2;
            byte b17 = bArr3[(i16 >>> 16) & GF2Field.MASK];
            byte[] bArr4 = T3;
            int i18 = (bArr4[i16 >>> 24] << 24) | (b15 & 255) | ((b16 & 255) << 8) | ((b17 & 255) << 16);
            byte b18 = bArr[i17 & GF2Field.MASK];
            byte b19 = bArr2[(i17 >>> 8) & GF2Field.MASK];
            byte b25 = bArr3[(i17 >>> 16) & GF2Field.MASK];
            jArr[i15] = (((long) i18) & BodyPartID.bodyIdMax) | (((long) ((bArr4[i17 >>> 24] << 24) | (((b18 & 255) | ((b19 & 255) << 8)) | ((b25 & 255) << 16)))) << 32);
        }
    }

    private static long mixColumn(long j15) {
        long jMulX = mulX(j15);
        long jRotate = rotate(8, j15) ^ j15;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j15);
        return ((rotate(32, mulX2((j15 ^ jRotate2) ^ jMulX)) ^ jRotate2) ^ rotate(40, jMulX)) ^ rotate(48, jMulX);
    }

    private static long mixColumnInv(long j15) {
        long jRotate = rotate(8, j15) ^ j15;
        long jRotate2 = (jRotate ^ rotate(32, jRotate)) ^ rotate(48, j15);
        long j16 = jRotate2 ^ j15;
        long jRotate3 = rotate(48, j15);
        long jRotate4 = rotate(56, j15);
        long jMulX = mulX(j16 ^ jRotate4) ^ rotate(56, j16);
        long jMulX2 = mulX(rotate(40, mulX(jMulX) ^ j15) ^ (rotate(16, j16) ^ j15)) ^ (j16 ^ jRotate3);
        return mulX(rotate(40, ((j15 ^ rotate(32, j16)) ^ jRotate4) ^ mulX(((jRotate3 ^ (rotate(24, j15) ^ j16)) ^ jRotate4) ^ mulX(mulX(jMulX2) ^ rotate(16, jRotate2))))) ^ jRotate2;
    }

    private void mixColumns() {
        for (int i15 = 0; i15 < this.wordsInBlock; i15++) {
            long[] jArr = this.internalState;
            jArr[i15] = mixColumn(jArr[i15]);
        }
    }

    private void mixColumnsInv() {
        for (int i15 = 0; i15 < this.wordsInBlock; i15++) {
            long[] jArr = this.internalState;
            jArr[i15] = mixColumnInv(jArr[i15]);
        }
    }

    private static long mulX(long j15) {
        return (((j15 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j15) << 1);
    }

    private static long mulX2(long j15) {
        return (((j15 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j15) << 2) ^ ((((-9187201950435737472L) & j15) >>> 6) * 29));
    }

    private static long rotate(int i15, long j15) {
        return (j15 << (-i15)) | (j15 >>> i15);
    }

    private void rotateLeft(long[] jArr, long[] jArr2) {
        int i15 = this.wordsInBlock;
        if (i15 == 2) {
            long j15 = jArr[0];
            long j16 = jArr[1];
            jArr2[0] = (j15 >>> 56) | (j16 << 8);
            jArr2[1] = (j15 << 8) | (j16 >>> 56);
            return;
        }
        if (i15 == 4) {
            long j17 = jArr[0];
            long j18 = jArr[1];
            long j19 = jArr[2];
            long j25 = jArr[3];
            jArr2[0] = (j18 >>> 24) | (j19 << 40);
            jArr2[1] = (j19 >>> 24) | (j25 << 40);
            jArr2[2] = (j25 >>> 24) | (j17 << 40);
            jArr2[3] = (j17 >>> 24) | (j18 << 40);
            return;
        }
        if (i15 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long j26 = jArr[0];
        long j27 = jArr[1];
        long j28 = jArr[2];
        long j29 = jArr[3];
        long j35 = jArr[4];
        long j36 = jArr[5];
        long j37 = jArr[6];
        long j38 = jArr[7];
        jArr2[0] = (j28 >>> 24) | (j29 << 40);
        jArr2[1] = (j29 >>> 24) | (j35 << 40);
        jArr2[2] = (j35 >>> 24) | (j36 << 40);
        jArr2[3] = (j36 >>> 24) | (j37 << 40);
        jArr2[4] = (j37 >>> 24) | (j38 << 40);
        jArr2[5] = (j38 >>> 24) | (j26 << 40);
        jArr2[6] = (j26 >>> 24) | (j27 << 40);
        jArr2[7] = (j27 >>> 24) | (j28 << 40);
    }

    private void shiftRows() {
        int i15 = this.wordsInBlock;
        if (i15 == 2) {
            long[] jArr = this.internalState;
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = (-4294967296L) & (j15 ^ j16);
            jArr[0] = j15 ^ j17;
            jArr[1] = j17 ^ j16;
            return;
        }
        if (i15 == 4) {
            long[] jArr2 = this.internalState;
            long j18 = jArr2[0];
            long j19 = jArr2[1];
            long j25 = jArr2[2];
            long j26 = jArr2[3];
            long j27 = (j18 ^ j25) & (-4294967296L);
            long j28 = j18 ^ j27;
            long j29 = j25 ^ j27;
            long j35 = (j19 ^ j26) & 281474976645120L;
            long j36 = j19 ^ j35;
            long j37 = j26 ^ j35;
            long j38 = (j28 ^ j36) & (-281470681808896L);
            long j39 = (j29 ^ j37) & (-281470681808896L);
            jArr2[0] = j28 ^ j38;
            jArr2[1] = j36 ^ j38;
            jArr2[2] = j29 ^ j39;
            jArr2[3] = j37 ^ j39;
            return;
        }
        if (i15 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j45 = jArr3[0];
        long j46 = jArr3[1];
        long j47 = jArr3[2];
        long j48 = jArr3[3];
        long j49 = jArr3[4];
        long j55 = jArr3[5];
        long j56 = jArr3[6];
        long j57 = jArr3[7];
        long j58 = (j45 ^ j49) & (-4294967296L);
        long j59 = j45 ^ j58;
        long j65 = j49 ^ j58;
        long j66 = (j46 ^ j55) & 72057594021150720L;
        long j67 = j46 ^ j66;
        long j68 = j55 ^ j66;
        long j69 = (j47 ^ j56) & 281474976645120L;
        long j75 = j47 ^ j69;
        long j76 = j56 ^ j69;
        long j77 = (j48 ^ j57) & 1099511627520L;
        long j78 = j48 ^ j77;
        long j79 = j57 ^ j77;
        long j85 = (j59 ^ j75) & (-281470681808896L);
        long j86 = j59 ^ j85;
        long j87 = j75 ^ j85;
        long j88 = (j67 ^ j78) & 72056494543077120L;
        long j89 = j67 ^ j88;
        long j95 = j78 ^ j88;
        long j96 = (j65 ^ j76) & (-281470681808896L);
        long j97 = j65 ^ j96;
        long j98 = j76 ^ j96;
        long j99 = (j68 ^ j79) & 72056494543077120L;
        long j100 = j68 ^ j99;
        long j101 = j79 ^ j99;
        long j102 = (j86 ^ j89) & (-71777214294589696L);
        long j103 = j86 ^ j102;
        long j104 = j89 ^ j102;
        long j105 = (j87 ^ j95) & (-71777214294589696L);
        long j106 = j87 ^ j105;
        long j107 = j95 ^ j105;
        long j108 = (j97 ^ j100) & (-71777214294589696L);
        long j109 = j97 ^ j108;
        long j110 = j100 ^ j108;
        long j111 = (j98 ^ j101) & (-71777214294589696L);
        jArr3[0] = j103;
        jArr3[1] = j104;
        jArr3[2] = j106;
        jArr3[3] = j107;
        jArr3[4] = j109;
        jArr3[5] = j110;
        jArr3[6] = j98 ^ j111;
        jArr3[7] = j101 ^ j111;
    }

    private void subBytes() {
        for (int i15 = 0; i15 < this.wordsInBlock; i15++) {
            long[] jArr = this.internalState;
            long j15 = jArr[i15];
            int i16 = (int) j15;
            int i17 = (int) (j15 >>> 32);
            byte[] bArr = S0;
            byte b15 = bArr[i16 & GF2Field.MASK];
            byte[] bArr2 = S1;
            byte b16 = bArr2[(i16 >>> 8) & GF2Field.MASK];
            byte[] bArr3 = S2;
            byte b17 = bArr3[(i16 >>> 16) & GF2Field.MASK];
            byte[] bArr4 = S3;
            int i18 = (bArr4[i16 >>> 24] << 24) | (b15 & 255) | ((b16 & 255) << 8) | ((b17 & 255) << 16);
            byte b18 = bArr[i17 & GF2Field.MASK];
            byte b19 = bArr2[(i17 >>> 8) & GF2Field.MASK];
            byte b25 = bArr3[(i17 >>> 16) & GF2Field.MASK];
            jArr[i15] = (((long) i18) & BodyPartID.bodyIdMax) | (((long) ((bArr4[i17 >>> 24] << 24) | (((b18 & 255) | ((b19 & 255) << 8)) | ((b25 & 255) << 16)))) << 32);
        }
    }

    private void subRoundKey(int i15) {
        long[] jArr = this.roundKeys[i15];
        for (int i16 = 0; i16 < this.wordsInBlock; i16++) {
            long[] jArr2 = this.internalState;
            jArr2[i16] = jArr2[i16] - jArr[i16];
        }
    }

    private void workingKeyExpandEven(long[] jArr, long[] jArr2) {
        int i15;
        int i16;
        int i17 = this.wordsInKey;
        long[] jArr3 = new long[i17];
        long[] jArr4 = new long[this.wordsInBlock];
        System.arraycopy(jArr, 0, jArr3, 0, i17);
        long j15 = 281479271743489L;
        int i18 = 0;
        while (true) {
            for (int i19 = 0; i19 < this.wordsInBlock; i19++) {
                jArr4[i19] = jArr2[i19] + j15;
            }
            for (int i25 = 0; i25 < this.wordsInBlock; i25++) {
                this.internalState[i25] = jArr3[i25] + jArr4[i25];
            }
            subBytes();
            shiftRows();
            mixColumns();
            for (int i26 = 0; i26 < this.wordsInBlock; i26++) {
                long[] jArr5 = this.internalState;
                jArr5[i26] = jArr5[i26] ^ jArr4[i26];
            }
            subBytes();
            shiftRows();
            mixColumns();
            int i27 = 0;
            while (true) {
                i15 = this.wordsInBlock;
                if (i27 >= i15) {
                    break;
                }
                long[] jArr6 = this.internalState;
                jArr6[i27] = jArr6[i27] + jArr4[i27];
                i27++;
            }
            System.arraycopy(this.internalState, 0, this.roundKeys[i18], 0, i15);
            if (this.roundsAmount == i18) {
                return;
            }
            if (this.wordsInBlock != this.wordsInKey) {
                i18 += 2;
                j15 <<= 1;
                for (int i28 = 0; i28 < this.wordsInBlock; i28++) {
                    jArr4[i28] = jArr2[i28] + j15;
                }
                int i29 = 0;
                while (true) {
                    int i35 = this.wordsInBlock;
                    if (i29 >= i35) {
                        break;
                    }
                    this.internalState[i29] = jArr3[i35 + i29] + jArr4[i29];
                    i29++;
                }
                subBytes();
                shiftRows();
                mixColumns();
                for (int i36 = 0; i36 < this.wordsInBlock; i36++) {
                    long[] jArr7 = this.internalState;
                    jArr7[i36] = jArr7[i36] ^ jArr4[i36];
                }
                subBytes();
                shiftRows();
                mixColumns();
                int i37 = 0;
                while (true) {
                    i16 = this.wordsInBlock;
                    if (i37 >= i16) {
                        break;
                    }
                    long[] jArr8 = this.internalState;
                    jArr8[i37] = jArr8[i37] + jArr4[i37];
                    i37++;
                }
                System.arraycopy(this.internalState, 0, this.roundKeys[i18], 0, i16);
                if (this.roundsAmount == i18) {
                    return;
                }
            }
            i18 += 2;
            j15 <<= 1;
            long j16 = jArr3[0];
            for (int i38 = 1; i38 < i17; i38++) {
                jArr3[i38 - 1] = jArr3[i38];
            }
            jArr3[i17 - 1] = j16;
        }
    }

    private void workingKeyExpandKT(long[] jArr, long[] jArr2) {
        int i15 = this.wordsInBlock;
        long[] jArr3 = new long[i15];
        long[] jArr4 = new long[i15];
        long[] jArr5 = new long[i15];
        this.internalState = jArr5;
        long j15 = jArr5[0];
        int i16 = this.wordsInKey;
        jArr5[0] = j15 + ((long) (i15 + i16 + 1));
        System.arraycopy(jArr, 0, jArr3, 0, i15);
        if (i15 == i16) {
            System.arraycopy(jArr, 0, jArr4, 0, i15);
        } else {
            int i17 = this.wordsInBlock;
            System.arraycopy(jArr, i17, jArr4, 0, i17);
        }
        int i18 = 0;
        while (true) {
            long[] jArr6 = this.internalState;
            if (i18 >= jArr6.length) {
                break;
            }
            jArr6[i18] = jArr6[i18] + jArr3[i18];
            i18++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i19 = 0;
        while (true) {
            long[] jArr7 = this.internalState;
            if (i19 >= jArr7.length) {
                break;
            }
            jArr7[i19] = jArr7[i19] ^ jArr4[i19];
            i19++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i25 = 0;
        while (true) {
            long[] jArr8 = this.internalState;
            if (i25 >= jArr8.length) {
                subBytes();
                shiftRows();
                mixColumns();
                System.arraycopy(this.internalState, 0, jArr2, 0, this.wordsInBlock);
                return;
            }
            jArr8[i25] = jArr8[i25] + jArr3[i25];
            i25++;
        }
    }

    private void workingKeyExpandOdd() {
        for (int i15 = 1; i15 < this.roundsAmount; i15 += 2) {
            long[][] jArr = this.roundKeys;
            rotateLeft(jArr[i15 - 1], jArr[i15]);
        }
    }

    private void xorRoundKey(int i15) {
        long[] jArr = this.roundKeys[i15];
        for (int i16 = 0; i16 < this.wordsInBlock; i16++) {
            long[] jArr2 = this.internalState;
            jArr2[i16] = jArr2[i16] ^ jArr[i16];
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.wordsInBlock << 3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b A[LOOP:0: B:26:0x0086->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[EDGE_INSN: B:37:0x0094->B:29:0x0094 BREAK  A[LOOP:0: B:26:0x0086->B:28:0x008b], SYNTHETIC] */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        DefaultServiceProperties defaultServiceProperties;
        int i15;
        long[][] jArr;
        long[] jArr2;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Engine init");
        }
        this.forEncryption = z15;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length << 3;
        int i16 = this.wordsInBlock << 6;
        if (length != 128 && length != 256 && length != 512) {
            throw new IllegalArgumentException("unsupported key length: only 128/256/512 are allowed");
        }
        if (length != i16 && length != i16 * 2) {
            throw new IllegalArgumentException("Unsupported key length");
        }
        if (length == 128) {
            this.roundsAmount = 10;
            defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15));
        } else {
            if (length != 256) {
                if (length == 512) {
                    this.roundsAmount = 18;
                    defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z15));
                }
                this.wordsInKey = length >>> 6;
                this.roundKeys = new long[this.roundsAmount + 1][];
                i15 = 0;
                while (true) {
                    jArr = this.roundKeys;
                    if (i15 < jArr.length) {
                        break;
                    }
                    jArr[i15] = new long[this.wordsInBlock];
                    i15++;
                }
                jArr2 = new long[this.wordsInKey];
                this.workingKey = jArr2;
                if (key.length == (length >>> 3)) {
                    throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
                }
                Pack.littleEndianToLong(key, 0, jArr2);
                long[] jArr3 = new long[this.wordsInBlock];
                workingKeyExpandKT(this.workingKey, jArr3);
                workingKeyExpandEven(this.workingKey, jArr3);
                workingKeyExpandOdd();
            }
            this.roundsAmount = 14;
            defaultServiceProperties = new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z15));
        }
        CryptoServicesRegistrar.checkConstraints(defaultServiceProperties);
        this.wordsInKey = length >>> 6;
        this.roundKeys = new long[this.roundsAmount + 1][];
        i15 = 0;
        while (true) {
            jArr = this.roundKeys;
            if (i15 < jArr.length) {
                break;
                break;
            } else {
                jArr[i15] = new long[this.wordsInBlock];
                i15++;
            }
        }
        jArr2 = new long[this.wordsInKey];
        this.workingKey = jArr2;
        if (key.length == (length >>> 3)) {
            throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
        }
        Pack.littleEndianToLong(key, 0, jArr2);
        long[] jArr4 = new long[this.wordsInBlock];
        workingKeyExpandKT(this.workingKey, jArr4);
        workingKeyExpandEven(this.workingKey, jArr4);
        workingKeyExpandOdd();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        if (this.workingKey == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i15 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i16 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i18 = 0;
        if (this.forEncryption) {
            if (this.wordsInBlock != 2) {
                Pack.littleEndianToLong(bArr, i15, this.internalState);
                addRoundKey(0);
                while (true) {
                    subBytes();
                    shiftRows();
                    mixColumns();
                    i18++;
                    i17 = this.roundsAmount;
                    if (i18 == i17) {
                        break;
                    }
                    xorRoundKey(i18);
                }
                addRoundKey(i17);
                Pack.longToLittleEndian(this.internalState, bArr2, i16);
            } else {
                encryptBlock_128(bArr, i15, bArr2, i16);
            }
        } else if (this.wordsInBlock != 2) {
            Pack.littleEndianToLong(bArr, i15, this.internalState);
            subRoundKey(this.roundsAmount);
            int i19 = this.roundsAmount;
            while (true) {
                mixColumnsInv();
                invShiftRows();
                invSubBytes();
                i19--;
                if (i19 == 0) {
                    break;
                }
                xorRoundKey(i19);
            }
            subRoundKey(0);
            Pack.longToLittleEndian(this.internalState, bArr2, i16);
        } else {
            decryptBlock_128(bArr, i15, bArr2, i16);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.internalState, 0L);
    }
}
