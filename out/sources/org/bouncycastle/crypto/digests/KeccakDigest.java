package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class KeccakDigest implements ExtendedDigest {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected CryptoServicePurpose purpose;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    public KeccakDigest() {
        this(288, CryptoServicePurpose.ANY);
    }

    private void KeccakAbsorb(byte[] bArr, int i15) {
        int i16 = this.rate >>> 6;
        for (int i17 = 0; i17 < i16; i17++) {
            long[] jArr = this.state;
            jArr[i17] = jArr[i17] ^ Pack.littleEndianToLong(bArr, i15);
            i15 += 8;
        }
        KeccakPermutation();
    }

    private void KeccakExtract() {
        KeccakPermutation();
        Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
        this.bitsInQueue = this.rate;
    }

    private void KeccakPermutation() {
        long[] jArr = this.state;
        long j15 = jArr[0];
        long j16 = jArr[1];
        char c15 = 2;
        long j17 = jArr[2];
        char c16 = 3;
        long j18 = jArr[3];
        char c17 = 4;
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = jArr[7];
        long j28 = jArr[8];
        long j29 = jArr[9];
        long j35 = jArr[10];
        long j36 = jArr[11];
        long j37 = jArr[12];
        long j38 = jArr[13];
        long j39 = jArr[14];
        long j45 = jArr[15];
        long j46 = jArr[16];
        long j47 = jArr[17];
        long j48 = jArr[18];
        long j49 = jArr[19];
        long j55 = jArr[20];
        long j56 = jArr[21];
        long j57 = jArr[22];
        long j58 = jArr[23];
        int i15 = 24;
        long j59 = jArr[24];
        int i16 = 0;
        while (i16 < i15) {
            long j65 = (((j15 ^ j25) ^ j35) ^ j45) ^ j55;
            long j66 = (((j16 ^ j26) ^ j36) ^ j46) ^ j56;
            long j67 = (((j17 ^ j27) ^ j37) ^ j47) ^ j57;
            long j68 = (((j18 ^ j28) ^ j38) ^ j48) ^ j58;
            long j69 = (((j19 ^ j29) ^ j39) ^ j49) ^ j59;
            long j75 = ((j66 << 1) | (j66 >>> (-1))) ^ j69;
            long j76 = ((j67 << 1) | (j67 >>> (-1))) ^ j65;
            long j77 = ((j68 << 1) | (j68 >>> (-1))) ^ j66;
            long j78 = ((j69 << 1) | (j69 >>> (-1))) ^ j67;
            long j79 = ((j65 << 1) | (j65 >>> (-1))) ^ j68;
            long j85 = j15 ^ j75;
            long j86 = j25 ^ j75;
            long j87 = j35 ^ j75;
            long j88 = j45 ^ j75;
            long j89 = j55 ^ j75;
            long j95 = j16 ^ j76;
            long j96 = j26 ^ j76;
            long j97 = j36 ^ j76;
            long j98 = j46 ^ j76;
            long j99 = j56 ^ j76;
            long j100 = j17 ^ j77;
            long j101 = j27 ^ j77;
            long j102 = j37 ^ j77;
            long j103 = j47 ^ j77;
            long j104 = j57 ^ j77;
            long j105 = j18 ^ j78;
            long j106 = j28 ^ j78;
            long j107 = j38 ^ j78;
            long j108 = j48 ^ j78;
            long j109 = j58 ^ j78;
            long j110 = j19 ^ j79;
            long j111 = j29 ^ j79;
            long j112 = j39 ^ j79;
            long j113 = j49 ^ j79;
            long j114 = j59 ^ j79;
            long j115 = (j95 << 1) | (j95 >>> 63);
            char c18 = c15;
            long j116 = (j96 << 44) | (j96 >>> 20);
            char c19 = c16;
            long j117 = (j111 << 20) | (j111 >>> 44);
            char c25 = c17;
            long j118 = (j104 << 61) | (j104 >>> c19);
            int i17 = i15;
            long j119 = (j112 << 39) | (j112 >>> 25);
            long j120 = (j89 << 18) | (j89 >>> 46);
            int i18 = i16;
            long j121 = (j100 << 62) | (j100 >>> c18);
            long j122 = (j102 << 43) | (j102 >>> 21);
            long j123 = (j107 << 25) | (j107 >>> 39);
            long j124 = (j113 << 8) | (j113 >>> 56);
            long j125 = (j109 << 56) | (j109 >>> 8);
            long j126 = (j88 << 41) | (j88 >>> 23);
            long j127 = (j110 << 27) | (j110 >>> 37);
            long j128 = (j114 << 14) | (j114 >>> 50);
            long j129 = (j99 << c18) | (j99 >>> 62);
            long j130 = (j106 << 55) | (j106 >>> 9);
            long j131 = (j98 << 45) | (j98 >>> 19);
            long j132 = (j86 << 36) | (j86 >>> 28);
            long j133 = (j105 << 28) | (j105 >>> 36);
            long j134 = (j108 << 21) | (j108 >>> 43);
            long j135 = (j103 << 15) | (j103 >>> 49);
            long j136 = (j97 << 10) | (j97 >>> 54);
            long j137 = (j101 << 6) | (j101 >>> 58);
            long j138 = (j87 << c19) | (j87 >>> 61);
            long j139 = j85 ^ ((~j116) & j122);
            j16 = ((~j122) & j134) ^ j116;
            long j140 = j122 ^ ((~j134) & j128);
            long j141 = j134 ^ ((~j128) & j85);
            long j142 = j128 ^ ((~j85) & j116);
            long j143 = j133 ^ ((~j117) & j138);
            long j144 = ((~j138) & j131) ^ j117;
            long j145 = ((~j131) & j118) ^ j138;
            long j146 = j131 ^ ((~j118) & j133);
            long j147 = ((~j133) & j117) ^ j118;
            j35 = j115 ^ ((~j137) & j123);
            long j148 = ((~j123) & j124) ^ j137;
            long j149 = ((~j124) & j120) ^ j123;
            long j150 = j124 ^ ((~j120) & j115);
            j39 = j120 ^ ((~j115) & j137);
            long j151 = j127 ^ ((~j132) & j136);
            long j152 = j132 ^ ((~j136) & j135);
            long j153 = ((~j135) & j125) ^ j136;
            long j154 = j135 ^ ((~j125) & j127);
            long j155 = ((~j127) & j132) ^ j125;
            long j156 = j121 ^ ((~j130) & j119);
            long j157 = ((~j119) & j126) ^ j130;
            long j158 = j119 ^ ((~j126) & j129);
            j58 = j126 ^ ((~j129) & j121);
            j46 = j152;
            j27 = j145;
            j56 = j157;
            j55 = j156;
            j57 = j158;
            j29 = j147;
            j28 = j146;
            j47 = j153;
            j38 = j150;
            j49 = j155;
            j25 = j143;
            j37 = j149;
            j26 = j144;
            c17 = c25;
            c15 = c18;
            j59 = j129 ^ ((~j121) & j130);
            jArr = jArr;
            i16 = i18 + 1;
            j15 = j139 ^ KeccakRoundConstants[i18];
            j18 = j141;
            j19 = j142;
            j36 = j148;
            i15 = i17;
            j48 = j154;
            j45 = j151;
            c16 = c19;
            j17 = j140;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j15;
        jArr2[1] = j16;
        jArr2[c15] = j17;
        jArr2[c16] = j18;
        jArr2[c17] = j19;
        jArr2[5] = j25;
        jArr2[6] = j26;
        jArr2[7] = j27;
        jArr2[8] = j28;
        jArr2[9] = j29;
        jArr2[10] = j35;
        jArr2[11] = j36;
        jArr2[12] = j37;
        jArr2[13] = j38;
        jArr2[14] = j39;
        jArr2[15] = j45;
        jArr2[16] = j46;
        jArr2[17] = j47;
        jArr2[18] = j48;
        jArr2[19] = j49;
        jArr2[20] = j55;
        jArr2[21] = j56;
        jArr2[22] = j57;
        jArr2[23] = j58;
        jArr2[i15] = j59;
    }

    private static CryptoServicePurpose getCryptoServicePurpose(byte b15) {
        return CryptoServicePurpose.values()[b15];
    }

    private void init(int i15) {
        if (i15 != 128 && i15 != 224 && i15 != 256 && i15 != 288 && i15 != 384 && i15 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        initSponge(1600 - (i15 << 1));
    }

    private void initSponge(int i15) {
        if (i15 <= 0 || i15 >= 1600 || i15 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.rate = i15;
        int i16 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i16 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i15) / 2;
                return;
            }
            jArr[i16] = 0;
            i16++;
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        byte[] bArr = this.dataQueue;
        int i15 = this.bitsInQueue;
        int i16 = i15 >>> 3;
        bArr[i16] = (byte) (bArr[i16] | ((byte) (1 << (i15 & 7))));
        int i17 = i15 + 1;
        this.bitsInQueue = i17;
        if (i17 == this.rate) {
            KeccakAbsorb(bArr, 0);
        } else {
            int i18 = i17 >>> 6;
            int i19 = i17 & 63;
            int i25 = 0;
            for (int i26 = 0; i26 < i18; i26++) {
                long[] jArr = this.state;
                jArr[i26] = jArr[i26] ^ Pack.littleEndianToLong(this.dataQueue, i25);
                i25 += 8;
            }
            if (i19 > 0) {
                long[] jArr2 = this.state;
                jArr2[i18] = (((1 << i19) - 1) & Pack.littleEndianToLong(this.dataQueue, i25)) ^ jArr2[i18];
            }
        }
        long[] jArr3 = this.state;
        int i27 = (this.rate - 1) >>> 6;
        jArr3[i27] = jArr3[i27] ^ Long.MIN_VALUE;
        this.bitsInQueue = 0;
        this.squeezing = true;
    }

    protected void absorb(byte b15) {
        int i15 = this.bitsInQueue;
        if (i15 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.dataQueue;
        bArr[i15 >>> 3] = b15;
        int i16 = i15 + 8;
        this.bitsInQueue = i16;
        if (i16 == this.rate) {
            KeccakAbsorb(bArr, 0);
            this.bitsInQueue = 0;
        }
    }

    protected void absorbBits(int i15, int i16) {
        if (i16 < 1 || i16 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i17 = this.bitsInQueue;
        if (i17 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.dataQueue[i17 >>> 3] = (byte) (i15 & ((1 << i16) - 1));
        this.bitsInQueue = i17 + i16;
    }

    protected void copyIn(KeccakDigest keccakDigest) {
        if (this.purpose != keccakDigest.purpose) {
            throw new IllegalArgumentException("attempt to copy digest of different purpose");
        }
        long[] jArr = keccakDigest.state;
        System.arraycopy(jArr, 0, this.state, 0, jArr.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, getDigestSize() * 8, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        squeeze(bArr, i15, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    protected byte[] getEncodedState(byte[] bArr) {
        bArr[0] = (byte) this.purpose.ordinal();
        int i15 = 1;
        int i16 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i16 == jArr.length) {
                byte[] bArr2 = this.dataQueue;
                System.arraycopy(bArr2, 0, bArr, i15, bArr2.length);
                int length = i15 + this.dataQueue.length;
                Pack.intToBigEndian(this.rate, bArr, length);
                Pack.intToBigEndian(this.bitsInQueue, bArr, length + 4);
                Pack.intToBigEndian(this.fixedOutputLength, bArr, length + 8);
                bArr[length + 12] = this.squeezing;
                return bArr;
            }
            Pack.longToBigEndian(jArr[i16], bArr, i15);
            i15 += 8;
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    protected void squeeze(byte[] bArr, int i15, long j15) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j16 = 0;
        if (j15 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j16 < j15) {
            if (this.bitsInQueue == 0) {
                KeccakExtract();
            }
            int iMin = (int) Math.min(this.bitsInQueue, j15 - j16);
            System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j16 / 8)) + i15, iMin / 8);
            this.bitsInQueue -= iMin;
            j16 += (long) iMin;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        absorb(b15);
    }

    public KeccakDigest(int i15) {
        this(i15, CryptoServicePurpose.ANY);
    }

    protected void absorb(byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        int i19 = this.bitsInQueue;
        if (i19 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i25 = i19 >>> 3;
        int i26 = this.rate >>> 3;
        int i27 = i26 - i25;
        if (i16 < i27) {
            System.arraycopy(bArr, i15, this.dataQueue, i25, i16);
            i18 = this.bitsInQueue + (i16 << 3);
        } else {
            if (i25 > 0) {
                System.arraycopy(bArr, i15, this.dataQueue, i25, i27);
                KeccakAbsorb(this.dataQueue, 0);
            } else {
                i27 = 0;
            }
            while (true) {
                i17 = i16 - i27;
                if (i17 < i26) {
                    break;
                }
                KeccakAbsorb(bArr, i15 + i27);
                i27 += i26;
            }
            System.arraycopy(bArr, i15 + i27, this.dataQueue, 0, i17);
            i18 = i17 << 3;
        }
        this.bitsInQueue = i18;
    }

    protected int doFinal(byte[] bArr, int i15, byte b15, int i16) {
        if (i16 > 0) {
            absorbBits(b15, i16);
        }
        squeeze(bArr, i15, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        absorb(bArr, i15, i16);
    }

    public KeccakDigest(int i15, CryptoServicePurpose cryptoServicePurpose) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        this.purpose = cryptoServicePurpose;
        init(i15);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(288, cryptoServicePurpose);
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[192];
        this.purpose = keccakDigest.purpose;
        long[] jArr2 = keccakDigest.state;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    protected KeccakDigest(byte[] bArr) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        this.purpose = getCryptoServicePurpose(bArr[0]);
        long[] jArr = this.state;
        Pack.bigEndianToLong(bArr, 1, jArr, 0, jArr.length);
        int length = (this.state.length * 8) + 1;
        byte[] bArr2 = this.dataQueue;
        System.arraycopy(bArr, length, bArr2, 0, bArr2.length);
        int length2 = length + this.dataQueue.length;
        this.rate = Pack.bigEndianToInt(bArr, length2);
        this.bitsInQueue = Pack.bigEndianToInt(bArr, length2 + 4);
        this.fixedOutputLength = Pack.bigEndianToInt(bArr, length2 + 8);
        this.squeezing = bArr[length2 + 12] != 0;
    }

    protected KeccakDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this(bArr);
        if (!this.purpose.equals(cryptoServicePurpose)) {
            throw new IllegalStateException("digest encoded for a different purpose");
        }
    }
}
