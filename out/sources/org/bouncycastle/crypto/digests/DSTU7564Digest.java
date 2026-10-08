package org.bouncycastle.crypto.digests;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {
    private static final int NB_1024 = 16;
    private static final int NB_512 = 8;
    private static final int NR_1024 = 14;
    private static final int NR_512 = 10;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, 127, -118, 39, -57, -64, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, 97};
    private int blockSize;
    private byte[] buf;
    private int bufOff;
    private int columns;
    private int hashSize;
    private long inputBlocks;
    private final CryptoServicePurpose purpose;
    private int rounds;
    private long[] state;
    private long[] tempState1;
    private long[] tempState2;

    public DSTU7564Digest(int i15) {
        this(i15, CryptoServicePurpose.ANY);
    }

    private void P(long[] jArr) {
        for (int i15 = 0; i15 < this.rounds; i15++) {
            long j15 = i15;
            for (int i16 = 0; i16 < this.columns; i16++) {
                jArr[i16] = jArr[i16] ^ j15;
                j15 += 16;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void Q(long[] jArr) {
        for (int i15 = 0; i15 < this.rounds; i15++) {
            long j15 = (((long) (((this.columns - 1) << 4) ^ i15)) << 56) | 67818912035696883L;
            for (int i16 = 0; i16 < this.columns; i16++) {
                jArr[i16] = jArr[i16] + j15;
                j15 -= 1152921504606846976L;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void copyIn(DSTU7564Digest dSTU7564Digest) {
        this.hashSize = dSTU7564Digest.hashSize;
        this.blockSize = dSTU7564Digest.blockSize;
        this.rounds = dSTU7564Digest.rounds;
        int i15 = this.columns;
        if (i15 <= 0 || i15 != dSTU7564Digest.columns) {
            this.columns = dSTU7564Digest.columns;
            this.state = Arrays.clone(dSTU7564Digest.state);
            int i16 = this.columns;
            this.tempState1 = new long[i16];
            this.tempState2 = new long[i16];
            this.buf = Arrays.clone(dSTU7564Digest.buf);
        } else {
            System.arraycopy(dSTU7564Digest.state, 0, this.state, 0, i15);
            System.arraycopy(dSTU7564Digest.buf, 0, this.buf, 0, this.blockSize);
        }
        this.inputBlocks = dSTU7564Digest.inputBlocks;
        this.bufOff = dSTU7564Digest.bufOff;
    }

    private static long mixColumn(long j15) {
        long j16 = ((9187201950435737471L & j15) << 1) ^ (((j15 & (-9187201950435737472L)) >>> 7) * 29);
        long jRotate = rotate(8, j15) ^ j15;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j15);
        long j17 = (j15 ^ jRotate2) ^ j16;
        return ((rotate(32, (((j17 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j17) >>> 6) * 29) ^ ((4557430888798830399L & j17) << 2))) ^ jRotate2) ^ rotate(40, j16)) ^ rotate(48, j16);
    }

    private void mixColumns(long[] jArr) {
        for (int i15 = 0; i15 < this.columns; i15++) {
            jArr[i15] = mixColumn(jArr[i15]);
        }
    }

    private void processBlock(byte[] bArr, int i15) {
        for (int i16 = 0; i16 < this.columns; i16++) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i15);
            i15 += 8;
            this.tempState1[i16] = this.state[i16] ^ jLittleEndianToLong;
            this.tempState2[i16] = jLittleEndianToLong;
        }
        P(this.tempState1);
        Q(this.tempState2);
        for (int i17 = 0; i17 < this.columns; i17++) {
            long[] jArr = this.state;
            jArr[i17] = jArr[i17] ^ (this.tempState1[i17] ^ this.tempState2[i17]);
        }
    }

    private static long rotate(int i15, long j15) {
        return (j15 << (-i15)) | (j15 >>> i15);
    }

    private void shiftRows(long[] jArr) {
        int i15 = this.columns;
        if (i15 == 8) {
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = jArr[2];
            long j18 = jArr[3];
            long j19 = jArr[4];
            long j25 = jArr[5];
            long j26 = jArr[6];
            long j27 = jArr[7];
            long j28 = (j15 ^ j19) & (-4294967296L);
            long j29 = j15 ^ j28;
            long j35 = j19 ^ j28;
            long j36 = (j16 ^ j25) & 72057594021150720L;
            long j37 = j16 ^ j36;
            long j38 = j25 ^ j36;
            long j39 = (j17 ^ j26) & 281474976645120L;
            long j45 = j17 ^ j39;
            long j46 = j26 ^ j39;
            long j47 = (j18 ^ j27) & 1099511627520L;
            long j48 = j18 ^ j47;
            long j49 = j27 ^ j47;
            long j55 = (j29 ^ j45) & (-281470681808896L);
            long j56 = j29 ^ j55;
            long j57 = j45 ^ j55;
            long j58 = (j37 ^ j48) & 72056494543077120L;
            long j59 = j37 ^ j58;
            long j65 = j48 ^ j58;
            long j66 = (j35 ^ j46) & (-281470681808896L);
            long j67 = j35 ^ j66;
            long j68 = j46 ^ j66;
            long j69 = (j38 ^ j49) & 72056494543077120L;
            long j75 = j38 ^ j69;
            long j76 = j49 ^ j69;
            long j77 = (j56 ^ j59) & (-71777214294589696L);
            long j78 = j56 ^ j77;
            long j79 = j59 ^ j77;
            long j85 = (j57 ^ j65) & (-71777214294589696L);
            long j86 = j57 ^ j85;
            long j87 = j65 ^ j85;
            long j88 = (j67 ^ j75) & (-71777214294589696L);
            long j89 = (j68 ^ j76) & (-71777214294589696L);
            jArr[0] = j78;
            jArr[1] = j79;
            jArr[2] = j86;
            jArr[3] = j87;
            jArr[4] = j67 ^ j88;
            jArr[5] = j75 ^ j88;
            jArr[6] = j68 ^ j89;
            jArr[7] = j76 ^ j89;
            return;
        }
        if (i15 != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
        long j95 = jArr[0];
        long j96 = jArr[1];
        long j97 = jArr[2];
        long j98 = jArr[3];
        long j99 = jArr[4];
        long j100 = jArr[5];
        long j101 = jArr[6];
        long j102 = jArr[7];
        long j103 = jArr[8];
        long j104 = jArr[9];
        long j105 = jArr[10];
        long j106 = jArr[11];
        long j107 = jArr[12];
        long j108 = jArr[13];
        long j109 = jArr[14];
        long j110 = jArr[15];
        long j111 = (j95 ^ j103) & (-72057594037927936L);
        long j112 = j95 ^ j111;
        long j113 = j103 ^ j111;
        long j114 = (j96 ^ j104) & (-72057594037927936L);
        long j115 = j96 ^ j114;
        long j116 = j104 ^ j114;
        long j117 = (j97 ^ j105) & (-281474976710656L);
        long j118 = j97 ^ j117;
        long j119 = j105 ^ j117;
        long j120 = (j98 ^ j106) & (-1099511627776L);
        long j121 = j98 ^ j120;
        long j122 = j106 ^ j120;
        long j123 = (j99 ^ j107) & (-4294967296L);
        long j124 = j99 ^ j123;
        long j125 = j107 ^ j123;
        long j126 = (j100 ^ j108) & 72057594021150720L;
        long j127 = j100 ^ j126;
        long j128 = j108 ^ j126;
        long j129 = (j101 ^ j109) & 72057594037862400L;
        long j130 = j101 ^ j129;
        long j131 = j109 ^ j129;
        long j132 = (j102 ^ j110) & 72057594037927680L;
        long j133 = j102 ^ j132;
        long j134 = j110 ^ j132;
        long j135 = (j112 ^ j124) & 72057589742960640L;
        long j136 = j112 ^ j135;
        long j137 = j124 ^ j135;
        long j138 = (j115 ^ j127) & (-16777216);
        long j139 = j115 ^ j138;
        long j140 = j127 ^ j138;
        long j141 = (j118 ^ j130) & (-71776119061282816L);
        long j142 = j118 ^ j141;
        long j143 = j130 ^ j141;
        long j144 = (j121 ^ j133) & (-72056494526300416L);
        long j145 = j121 ^ j144;
        long j146 = j133 ^ j144;
        long j147 = (j113 ^ j125) & 72057589742960640L;
        long j148 = j113 ^ j147;
        long j149 = j125 ^ j147;
        long j150 = (j116 ^ j128) & (-16777216);
        long j151 = j116 ^ j150;
        long j152 = j128 ^ j150;
        long j153 = (j119 ^ j131) & (-71776119061282816L);
        long j154 = j119 ^ j153;
        long j155 = j131 ^ j153;
        long j156 = (j122 ^ j134) & (-72056494526300416L);
        long j157 = j122 ^ j156;
        long j158 = j134 ^ j156;
        long j159 = (j136 ^ j142) & (-281470681808896L);
        long j160 = j136 ^ j159;
        long j161 = j142 ^ j159;
        long j162 = (j139 ^ j145) & 72056494543077120L;
        long j163 = j139 ^ j162;
        long j164 = j145 ^ j162;
        long j165 = (j137 ^ j143) & (-281470681808896L);
        long j166 = j137 ^ j165;
        long j167 = j143 ^ j165;
        long j168 = (j140 ^ j146) & 72056494543077120L;
        long j169 = j140 ^ j168;
        long j170 = j146 ^ j168;
        long j171 = (j148 ^ j154) & (-281470681808896L);
        long j172 = j148 ^ j171;
        long j173 = j154 ^ j171;
        long j174 = (j151 ^ j157) & 72056494543077120L;
        long j175 = j151 ^ j174;
        long j176 = j157 ^ j174;
        long j177 = (j149 ^ j155) & (-281470681808896L);
        long j178 = j149 ^ j177;
        long j179 = j155 ^ j177;
        long j180 = (j152 ^ j158) & 72056494543077120L;
        long j181 = j152 ^ j180;
        long j182 = j158 ^ j180;
        long j183 = (j160 ^ j163) & (-71777214294589696L);
        long j184 = j160 ^ j183;
        long j185 = j163 ^ j183;
        long j186 = (j161 ^ j164) & (-71777214294589696L);
        long j187 = j161 ^ j186;
        long j188 = j164 ^ j186;
        long j189 = (j166 ^ j169) & (-71777214294589696L);
        long j190 = j166 ^ j189;
        long j191 = j169 ^ j189;
        long j192 = (j167 ^ j170) & (-71777214294589696L);
        long j193 = j167 ^ j192;
        long j194 = j170 ^ j192;
        long j195 = (j172 ^ j175) & (-71777214294589696L);
        long j196 = j172 ^ j195;
        long j197 = j175 ^ j195;
        long j198 = (j173 ^ j176) & (-71777214294589696L);
        long j199 = j173 ^ j198;
        long j200 = j176 ^ j198;
        long j201 = (j178 ^ j181) & (-71777214294589696L);
        long j202 = (j179 ^ j182) & (-71777214294589696L);
        jArr[0] = j184;
        jArr[1] = j185;
        jArr[2] = j187;
        jArr[3] = j188;
        jArr[4] = j190;
        jArr[5] = j191;
        jArr[6] = j193;
        jArr[7] = j194;
        jArr[8] = j196;
        jArr[9] = j197;
        jArr[10] = j199;
        jArr[11] = j200;
        jArr[12] = j178 ^ j201;
        jArr[13] = j181 ^ j201;
        jArr[14] = j179 ^ j202;
        jArr[15] = j182 ^ j202;
    }

    private void subBytes(long[] jArr) {
        for (int i15 = 0; i15 < this.columns; i15++) {
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

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        int i16;
        int i17;
        int i18 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i19 = i18 + 1;
        this.bufOff = i19;
        bArr2[i18] = -128;
        int i25 = this.blockSize - 12;
        int i26 = 0;
        if (i19 > i25) {
            while (true) {
                int i27 = this.bufOff;
                if (i27 >= this.blockSize) {
                    break;
                }
                byte[] bArr3 = this.buf;
                this.bufOff = i27 + 1;
                bArr3[i27] = 0;
            }
            this.bufOff = 0;
            processBlock(this.buf, 0);
        }
        while (true) {
            i16 = this.bufOff;
            if (i16 >= i25) {
                break;
            }
            byte[] bArr4 = this.buf;
            this.bufOff = i16 + 1;
            bArr4[i16] = 0;
        }
        long j15 = (((this.inputBlocks & BodyPartID.bodyIdMax) * ((long) this.blockSize)) + ((long) i18)) << 3;
        Pack.intToLittleEndian((int) j15, this.buf, i16);
        int i28 = this.bufOff + 4;
        this.bufOff = i28;
        Pack.longToLittleEndian((j15 >>> 32) + (((this.inputBlocks >>> 32) * ((long) this.blockSize)) << 3), this.buf, i28);
        processBlock(this.buf, 0);
        System.arraycopy(this.state, 0, this.tempState1, 0, this.columns);
        P(this.tempState1);
        while (true) {
            i17 = this.columns;
            if (i26 >= i17) {
                break;
            }
            long[] jArr = this.state;
            jArr[i26] = jArr[i26] ^ this.tempState1[i26];
            i26++;
        }
        for (int i29 = i17 - (this.hashSize >>> 3); i29 < this.columns; i29++) {
            Pack.longToLittleEndian(this.state[i29], bArr, i15);
            i15 += 8;
        }
        reset();
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0L);
        this.state[0] = this.blockSize;
        this.inputBlocks = 0L;
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        byte[] bArr = this.buf;
        int i15 = this.bufOff;
        int i16 = i15 + 1;
        this.bufOff = i16;
        bArr[i15] = b15;
        if (i16 == this.blockSize) {
            processBlock(bArr, 0);
            this.bufOff = 0;
            this.inputBlocks++;
        }
    }

    public DSTU7564Digest(int i15, CryptoServicePurpose cryptoServicePurpose) {
        int i16;
        this.purpose = cryptoServicePurpose;
        if (i15 != 256 && i15 != 384 && i15 != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.hashSize = i15 >>> 3;
        if (i15 > 256) {
            this.columns = 16;
            i16 = 14;
        } else {
            this.columns = 8;
            i16 = 10;
        }
        this.rounds = i16;
        int i17 = this.columns;
        int i18 = i17 << 3;
        this.blockSize = i18;
        long[] jArr = new long[i17];
        this.state = jArr;
        jArr[0] = i18;
        this.tempState1 = new long[i17];
        this.tempState2 = new long[i17];
        this.buf = new byte[i18];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        while (this.bufOff != 0 && i16 > 0) {
            update(bArr[i15]);
            i16--;
            i15++;
        }
        if (i16 > 0) {
            while (i16 >= this.blockSize) {
                processBlock(bArr, i15);
                int i17 = this.blockSize;
                i15 += i17;
                i16 -= i17;
                this.inputBlocks++;
            }
            while (i16 > 0) {
                update(bArr[i15]);
                i16--;
                i15++;
            }
        }
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        this.purpose = dSTU7564Digest.purpose;
        copyIn(dSTU7564Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
