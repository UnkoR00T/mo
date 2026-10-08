package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ISAPEngine extends AEADBaseEngine {
    private static final int ISAP_STATE_SZ = 40;
    private final ISAP_AEAD ISAPAEAD;
    private int ISAP_rH;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149046k;
    private byte[] npub;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.ISAPEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType;

        static {
            int[] iArr = new int[IsapType.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType = iArr;
            try {
                iArr[IsapType.ISAP_A_128A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_A_128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private abstract class ISAPAEAD_A implements ISAP_AEAD {
        protected long ISAP_IV1_64;
        protected long ISAP_IV2_64;
        protected long ISAP_IV3_64;

        /* JADX INFO: renamed from: k64, reason: collision with root package name */
        protected long[] f149047k64;
        AsconPermutationFriend.AsconPermutation mac;
        protected long[] npub64;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        AsconPermutationFriend.AsconPermutation f149048p;

        public ISAPAEAD_A() {
            ISAPEngine.this.ISAP_rH = 64;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
            this.f149048p = new AsconPermutationFriend.AsconPermutation();
            this.mac = new AsconPermutationFriend.AsconPermutation();
        }

        private int getLongSize(int i15) {
            return (i15 + 7) >>> 3;
        }

        private void isap_rk(AsconPermutationFriend.AsconPermutation asconPermutation, long j15, byte[] bArr, int i15) {
            long[] jArr = this.f149047k64;
            asconPermutation.set(jArr[0], jArr[1], j15, 0L, 0L);
            asconPermutation.p(12);
            for (int i16 = 0; i16 < (i15 << 3) - 1; i16++) {
                asconPermutation.f149016x0 ^= (((long) (((bArr[i16 >>> 3] >>> (7 - (i16 & 7))) & 1) << 7)) & 255) << 56;
                PX2(asconPermutation);
            }
            asconPermutation.f149016x0 ^= (((long) bArr[i15 - 1]) & 1) << 63;
            asconPermutation.p(12);
        }

        protected abstract void PX1(AsconPermutationFriend.AsconPermutation asconPermutation);

        protected abstract void PX2(AsconPermutationFriend.AsconPermutation asconPermutation);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i15 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i16 = iSAPEngine.m_aadPos;
                if (i15 >= i16) {
                    AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
                    asconPermutation.f149016x0 = (128 << ((7 - i16) << 3)) ^ asconPermutation.f149016x0;
                    asconPermutation.p(12);
                    this.mac.f149020x4 ^= 1;
                    return;
                }
                this.mac.f149016x0 ^= (((long) iSAPEngine.m_aad[i15]) & 255) << ((7 - i15) << 3);
                i15++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i15) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
            asconPermutation.f149016x0 = Pack.bigEndianToLong(bArr, i15) ^ asconPermutation.f149016x0;
            this.mac.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.npub64 = new long[getLongSize(ISAPEngine.this.npub.length)];
            this.f149047k64 = new long[getLongSize(ISAPEngine.this.f149046k.length)];
            Pack.bigEndianToLong(ISAPEngine.this.npub, 0, this.npub64);
            Pack.bigEndianToLong(ISAPEngine.this.f149046k, 0, this.f149047k64);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
            Pack.longToBigEndian(Pack.bigEndianToLong(bArr, i15) ^ this.f149048p.f149016x0, bArr2, i16);
            PX1(this.f149048p);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i15) {
            byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(this.f149048p.f149016x0);
            ISAPEngine iSAPEngine = ISAPEngine.this;
            int i16 = iSAPEngine.m_bufPos;
            Bytes.xor(i16, bArrLongToLittleEndian, iSAPEngine.BlockSize - i16, iSAPEngine.m_buf, 0, bArr, i15);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i15, int i16, byte[] bArr2) {
            int i17 = i15;
            int i18 = 0;
            while (i18 < i16) {
                this.mac.f149016x0 ^= (((long) bArr[i17]) & 255) << ((7 - i18) << 3);
                i18++;
                i17++;
            }
            AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
            asconPermutation.f149016x0 ^= 128 << ((7 - i16) << 3);
            asconPermutation.p(12);
            Pack.longToBigEndian(this.mac.f149016x0, bArr2, 0);
            Pack.longToBigEndian(this.mac.f149017x1, bArr2, 8);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
            long j15 = asconPermutation2.f149018x2;
            long j16 = asconPermutation2.f149019x3;
            long j17 = asconPermutation2.f149020x4;
            isap_rk(asconPermutation2, this.ISAP_IV2_64, bArr2, ISAPEngine.this.KEY_SIZE);
            AsconPermutationFriend.AsconPermutation asconPermutation3 = this.mac;
            asconPermutation3.f149018x2 = j15;
            asconPermutation3.f149019x3 = j16;
            asconPermutation3.f149020x4 = j17;
            asconPermutation3.p(12);
            Pack.longToBigEndian(this.mac.f149016x0, bArr2, 0);
            Pack.longToBigEndian(this.mac.f149017x1, bArr2, 8);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            isap_rk(this.f149048p, this.ISAP_IV3_64, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149048p;
            long[] jArr = this.npub64;
            asconPermutation.f149019x3 = jArr[0];
            asconPermutation.f149020x4 = jArr[1];
            PX1(asconPermutation);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
            long[] jArr2 = this.npub64;
            asconPermutation2.set(jArr2[0], jArr2[1], this.ISAP_IV1_64, 0L, 0L);
            this.mac.p(12);
        }
    }

    private class ISAPAEAD_A_128 extends ISAPAEAD_A {
        public ISAPAEAD_A_128() {
            super();
            this.ISAP_IV1_64 = 108156764298152972L;
            this.ISAP_IV2_64 = 180214358336080908L;
            this.ISAP_IV3_64 = 252271952374008844L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }
    }

    private class ISAPAEAD_A_128A extends ISAPAEAD_A {
        public ISAPAEAD_A_128A() {
            super();
            this.ISAP_IV1_64 = 108156764297430540L;
            this.ISAP_IV2_64 = 180214358335358476L;
            this.ISAP_IV3_64 = 252271952373286412L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(6);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.round(75L);
        }
    }

    private abstract class ISAPAEAD_K implements ISAP_AEAD {
        protected short[] ISAP_IV1_16;
        protected short[] ISAP_IV2_16;
        protected short[] ISAP_IV3_16;
        protected final int ISAP_STATE_SZ_CRYPTO_NPUBBYTES;
        protected short[] iv16;
        protected short[] k16;
        private final int[] KeccakF400RoundConstants = {1, 32898, 32906, 32768, 32907, 1, 32897, 32777, 138, 136, 32777, 10, 32907, 139, 32905, 32771, 32770, 128, 32778, 10};
        protected short[] SX = new short[25];
        protected short[] macSX = new short[25];
        protected short[] E = new short[25];
        protected short[] C = new short[5];
        protected short[] macE = new short[25];
        protected short[] macC = new short[5];

        public ISAPAEAD_K() {
            this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES = 40 - ISAPEngine.this.IV_SIZE;
            ISAPEngine.this.ISAP_rH = 144;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
        }

        private short ROL16(short s15, int i15) {
            int i16 = s15 & 65535;
            return (short) ((i16 >>> (16 - i15)) ^ (i16 << i15));
        }

        private void byteToShortXor(byte[] bArr, int i15, short[] sArr, int i16) {
            for (int i17 = 0; i17 < i16; i17++) {
                sArr[i17] = (short) (sArr[i17] ^ Pack.littleEndianToShort(bArr, (i17 << 1) + i15));
            }
        }

        protected abstract void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3);

        protected abstract void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3);

        protected abstract void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i15 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i16 = iSAPEngine.m_aadPos;
                if (i15 >= i16) {
                    short[] sArr = this.macSX;
                    int i17 = i16 >> 1;
                    sArr[i17] = (short) ((128 << ((i16 & 1) << 3)) ^ sArr[i17]);
                    PermuteRoundsHX(sArr, this.macE, this.macC);
                    short[] sArr2 = this.macSX;
                    sArr2[24] = (short) (sArr2[24] ^ 256);
                    return;
                }
                short[] sArr3 = this.macSX;
                int i18 = i15 >> 1;
                sArr3[i18] = (short) (((iSAPEngine.m_aad[i15] & 255) << ((i15 & 1) << 3)) ^ sArr3[i18]);
                i15++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i15) {
            byteToShortXor(bArr, i15, this.macSX, ISAPEngine.this.BlockSize >> 1);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.k16 = new short[ISAPEngine.this.f149046k.length >> 1];
            byte[] bArr = ISAPEngine.this.f149046k;
            short[] sArr = this.k16;
            Pack.littleEndianToShort(bArr, 0, sArr, 0, sArr.length);
            this.iv16 = new short[ISAPEngine.this.npub.length >> 1];
            byte[] bArr2 = ISAPEngine.this.npub;
            short[] sArr2 = this.iv16;
            Pack.littleEndianToShort(bArr2, 0, sArr2, 0, sArr2.length);
        }

        public void isap_rk(short[] sArr, byte[] bArr, int i15, short[] sArr2, int i16, short[] sArr3) {
            short[] sArr4 = new short[25];
            short[] sArr5 = new short[25];
            System.arraycopy(this.k16, 0, sArr4, 0, 8);
            System.arraycopy(sArr, 0, sArr4, 8, 4);
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            for (int i17 = 0; i17 < (i15 << 3) - 1; i17++) {
                sArr4[0] = (short) (sArr4[0] ^ (((bArr[i17 >> 3] >>> (7 - (i17 & 7))) & 1) << 7));
                PermuteRoundsBX(sArr4, sArr5, sArr3);
            }
            sArr4[0] = (short) (sArr4[0] ^ ((bArr[i15 - 1] & 1) << 7));
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            System.arraycopy(sArr4, 0, sArr2, 0, i16 == this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES ? 17 : 8);
        }

        protected void prepareThetaX(short[] sArr, short[] sArr2) {
            sArr2[0] = (short) ((((sArr[0] ^ sArr[5]) ^ sArr[10]) ^ sArr[15]) ^ sArr[20]);
            sArr2[1] = (short) ((((sArr[1] ^ sArr[6]) ^ sArr[11]) ^ sArr[16]) ^ sArr[21]);
            sArr2[2] = (short) ((((sArr[2] ^ sArr[7]) ^ sArr[12]) ^ sArr[17]) ^ sArr[22]);
            sArr2[3] = (short) ((((sArr[3] ^ sArr[8]) ^ sArr[13]) ^ sArr[18]) ^ sArr[23]);
            sArr2[4] = (short) (sArr[24] ^ (((sArr[4] ^ sArr[9]) ^ sArr[14]) ^ sArr[19]));
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
            int i17 = 0;
            while (i17 < ISAPEngine.this.BlockSize) {
                bArr2[i16] = (byte) (bArr[i15] ^ (this.SX[i17 >> 1] >>> ((i17 & 1) << 3)));
                i17++;
                i16++;
                i15++;
            }
            PermuteRoundsKX(this.SX, this.E, this.C);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i15) {
            int i16 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                if (i16 >= iSAPEngine.m_bufPos) {
                    return;
                }
                bArr[i15] = (byte) (iSAPEngine.m_buf[i16] ^ (this.SX[i16 >> 1] >>> ((i16 & 1) << 3)));
                i16++;
                i15++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i15, int i16, byte[] bArr2) {
            int i17 = 0;
            while (i17 < i16) {
                short[] sArr = this.macSX;
                int i18 = i17 >> 1;
                sArr[i18] = (short) (((bArr[i15] & GF2Field.MASK) << ((i17 & 1) << 3)) ^ sArr[i18]);
                i17++;
                i15++;
            }
            short[] sArr2 = this.macSX;
            int i19 = i16 >> 1;
            sArr2[i19] = (short) ((128 << ((i16 & 1) << 3)) ^ sArr2[i19]);
            PermuteRoundsHX(sArr2, this.macE, this.macC);
            Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
            short[] sArr3 = this.ISAP_IV2_16;
            int i25 = ISAPEngine.this.KEY_SIZE;
            isap_rk(sArr3, bArr2, i25, this.macSX, i25, this.macC);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
            Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            Arrays.fill(this.SX, (short) 0);
            isap_rk(this.ISAP_IV3_16, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE, this.SX, this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES, this.C);
            System.arraycopy(this.iv16, 0, this.SX, 17, 8);
            PermuteRoundsKX(this.SX, this.E, this.C);
            Arrays.fill(this.macSX, 12, 25, (short) 0);
            System.arraycopy(this.iv16, 0, this.macSX, 0, 8);
            System.arraycopy(this.ISAP_IV1_16, 0, this.macSX, 8, 4);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        protected void rounds12X(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        protected void rounds_12_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(12, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(13, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(14, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(15, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(16, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(17, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(18, sArr, sArr2, sArr3);
            thetaRhoPiChiIota(sArr2, sArr, sArr3);
        }

        protected void rounds_4_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(4, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(5, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(6, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(7, sArr2, sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        protected void rounds_8_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(8, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(9, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(10, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(11, sArr2, sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }

        protected void thetaRhoPiChiIota(short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL17 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL18 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL19 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL110 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s15 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s15;
            short s16 = (short) (sArr[6] ^ sROL17);
            sArr[6] = s16;
            short sROL111 = ROL16(s16, 12);
            short s17 = (short) (sArr[12] ^ sROL18);
            sArr[12] = s17;
            short sROL112 = ROL16(s17, 11);
            short s18 = (short) (sArr[18] ^ sROL19);
            sArr[18] = s18;
            short sROL113 = ROL16(s18, 5);
            short s19 = (short) (sArr[24] ^ sROL110);
            sArr[24] = s19;
            short sROL114 = ROL16(s19, 14);
            sArr2[0] = (short) (this.KeccakF400RoundConstants[19] ^ (((~sROL111) & sROL112) ^ s15));
            sArr2[1] = (short) (((~sROL112) & sROL113) ^ sROL111);
            sArr2[2] = (short) (((~sROL113) & sROL114) ^ sROL112);
            sArr2[3] = (short) (((~sROL114) & s15) ^ sROL113);
            sArr2[4] = (short) (((~s15) & sROL111) ^ sROL114);
            short s25 = (short) (sArr[3] ^ sROL19);
            sArr[3] = s25;
            short sROL115 = ROL16(s25, 12);
            short s26 = (short) (sArr[9] ^ sROL110);
            sArr[9] = s26;
            short sROL116 = ROL16(s26, 4);
            short s27 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s27;
            short sROL117 = ROL16(s27, 3);
            short s28 = (short) (sArr[16] ^ sROL17);
            sArr[16] = s28;
            short sROL118 = ROL16(s28, 13);
            short s29 = (short) (sArr[22] ^ sROL18);
            sArr[22] = s29;
            short sROL119 = ROL16(s29, 13);
            sArr2[5] = (short) (((~sROL116) & sROL117) ^ sROL115);
            sArr2[6] = (short) (((~sROL117) & sROL118) ^ sROL116);
            sArr2[7] = (short) (sROL117 ^ ((~sROL118) & sROL119));
            sArr2[8] = (short) (((~sROL119) & sROL115) ^ sROL118);
            sArr2[9] = (short) (((~sROL115) & sROL116) ^ sROL119);
            short s35 = (short) (sArr[1] ^ sROL17);
            sArr[1] = s35;
            short sROL120 = ROL16(s35, 1);
            short s36 = (short) (sArr[7] ^ sROL18);
            sArr[7] = s36;
            short sROL121 = ROL16(s36, 6);
            short s37 = (short) (sArr[13] ^ sROL19);
            sArr[13] = s37;
            short sROL122 = ROL16(s37, 9);
            short s38 = (short) (sArr[19] ^ sROL110);
            sArr[19] = s38;
            short sROL123 = ROL16(s38, 8);
            short s39 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s39;
            short sROL124 = ROL16(s39, 2);
            sArr2[10] = (short) (((~sROL121) & sROL122) ^ sROL120);
            sArr2[11] = (short) (((~sROL122) & sROL123) ^ sROL121);
            sArr2[12] = (short) (((~sROL123) & sROL124) ^ sROL122);
            sArr2[13] = (short) (((~sROL124) & sROL120) ^ sROL123);
            sArr2[14] = (short) (((~sROL120) & sROL121) ^ sROL124);
            short s45 = (short) (sArr[4] ^ sROL110);
            sArr[4] = s45;
            short sROL125 = ROL16(s45, 11);
            short s46 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s46;
            short sROL126 = ROL16(s46, 4);
            short s47 = (short) (sArr[11] ^ sROL17);
            sArr[11] = s47;
            short sROL127 = ROL16(s47, 10);
            short s48 = (short) (sArr[17] ^ sROL18);
            sArr[17] = s48;
            short sROL128 = ROL16(s48, 15);
            short s49 = (short) (sArr[23] ^ sROL19);
            sArr[23] = s49;
            short sROL129 = ROL16(s49, 8);
            sArr2[15] = (short) (((~sROL126) & sROL127) ^ sROL125);
            sArr2[16] = (short) (((~sROL127) & sROL128) ^ sROL126);
            sArr2[17] = (short) (sROL127 ^ ((~sROL128) & sROL129));
            sArr2[18] = (short) (((~sROL129) & sROL125) ^ sROL128);
            sArr2[19] = (short) ((sROL126 & (~sROL125)) ^ sROL129);
            short s55 = (short) (sArr[2] ^ sROL18);
            sArr[2] = s55;
            short sROL130 = ROL16(s55, 14);
            short s56 = (short) (sArr[8] ^ sROL19);
            sArr[8] = s56;
            short sROL131 = ROL16(s56, 7);
            short s57 = (short) (sArr[14] ^ sROL110);
            sArr[14] = s57;
            short sROL132 = ROL16(s57, 7);
            short s58 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s58;
            short sROL133 = ROL16(s58, 9);
            short s59 = (short) (sROL17 ^ sArr[21]);
            sArr[21] = s59;
            short sROL134 = ROL16(s59, 2);
            sArr2[20] = (short) (((~sROL131) & sROL132) ^ sROL130);
            sArr2[21] = (short) (((~sROL132) & sROL133) ^ sROL131);
            sArr2[22] = (short) (sROL132 ^ ((~sROL133) & sROL134));
            sArr2[23] = (short) (sROL133 ^ ((~sROL134) & sROL130));
            sArr2[24] = (short) (((~sROL130) & sROL131) ^ sROL134);
        }

        protected void thetaRhoPiChiIotaPrepareTheta(int i15, short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL17 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL18 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL19 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL110 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s15 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s15;
            short s16 = (short) (sArr[6] ^ sROL17);
            sArr[6] = s16;
            short sROL111 = ROL16(s16, 12);
            short s17 = (short) (sArr[12] ^ sROL18);
            sArr[12] = s17;
            short sROL112 = ROL16(s17, 11);
            short s18 = (short) (sArr[18] ^ sROL19);
            sArr[18] = s18;
            short sROL113 = ROL16(s18, 5);
            short s19 = (short) (sArr[24] ^ sROL110);
            sArr[24] = s19;
            short sROL114 = ROL16(s19, 14);
            short s25 = (short) (this.KeccakF400RoundConstants[i15] ^ (((~sROL111) & sROL112) ^ s15));
            sArr2[0] = s25;
            sArr3[0] = s25;
            short s26 = (short) (((~sROL112) & sROL113) ^ sROL111);
            sArr2[1] = s26;
            sArr3[1] = s26;
            short s27 = (short) (((~sROL113) & sROL114) ^ sROL112);
            sArr2[2] = s27;
            sArr3[2] = s27;
            short s28 = (short) (((~sROL114) & s15) ^ sROL113);
            sArr2[3] = s28;
            sArr3[3] = s28;
            short s29 = (short) (((~s15) & sROL111) ^ sROL114);
            sArr2[4] = s29;
            sArr3[4] = s29;
            short s35 = (short) (sArr[3] ^ sROL19);
            sArr[3] = s35;
            short sROL115 = ROL16(s35, 12);
            short s36 = (short) (sArr[9] ^ sROL110);
            sArr[9] = s36;
            short sROL116 = ROL16(s36, 4);
            short s37 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s37;
            short sROL117 = ROL16(s37, 3);
            short s38 = (short) (sArr[16] ^ sROL17);
            sArr[16] = s38;
            short sROL118 = ROL16(s38, 13);
            short s39 = (short) (sArr[22] ^ sROL18);
            sArr[22] = s39;
            short sROL119 = ROL16(s39, 13);
            short s45 = (short) (((~sROL116) & sROL117) ^ sROL115);
            sArr2[5] = s45;
            sArr3[0] = (short) (sArr3[0] ^ s45);
            short s46 = (short) (((~sROL117) & sROL118) ^ sROL116);
            sArr2[6] = s46;
            sArr3[1] = (short) (sArr3[1] ^ s46);
            short s47 = (short) (((~sROL118) & sROL119) ^ sROL117);
            sArr2[7] = s47;
            sArr3[2] = (short) (sArr3[2] ^ s47);
            short s48 = (short) (((~sROL119) & sROL115) ^ sROL118);
            sArr2[8] = s48;
            sArr3[3] = (short) (sArr3[3] ^ s48);
            short s49 = (short) (((~sROL115) & sROL116) ^ sROL119);
            sArr2[9] = s49;
            sArr3[4] = (short) (s49 ^ sArr3[4]);
            short s55 = (short) (sArr[1] ^ sROL17);
            sArr[1] = s55;
            short sROL120 = ROL16(s55, 1);
            short s56 = (short) (sArr[7] ^ sROL18);
            sArr[7] = s56;
            short sROL121 = ROL16(s56, 6);
            short s57 = (short) (sArr[13] ^ sROL19);
            sArr[13] = s57;
            short sROL122 = ROL16(s57, 9);
            short s58 = (short) (sArr[19] ^ sROL110);
            sArr[19] = s58;
            short sROL123 = ROL16(s58, 8);
            short s59 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s59;
            short sROL124 = ROL16(s59, 2);
            short s65 = (short) (((~sROL121) & sROL122) ^ sROL120);
            sArr2[10] = s65;
            sArr3[0] = (short) (sArr3[0] ^ s65);
            short s66 = (short) (((~sROL122) & sROL123) ^ sROL121);
            sArr2[11] = s66;
            sArr3[1] = (short) (sArr3[1] ^ s66);
            short s67 = (short) (((~sROL123) & sROL124) ^ sROL122);
            sArr2[12] = s67;
            sArr3[2] = (short) (s67 ^ sArr3[2]);
            short s68 = (short) (((~sROL124) & sROL120) ^ sROL123);
            sArr2[13] = s68;
            sArr3[3] = (short) (s68 ^ sArr3[3]);
            short s69 = (short) (((~sROL120) & sROL121) ^ sROL124);
            sArr2[14] = s69;
            sArr3[4] = (short) (s69 ^ sArr3[4]);
            short s75 = (short) (sArr[4] ^ sROL110);
            sArr[4] = s75;
            short sROL125 = ROL16(s75, 11);
            short s76 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s76;
            short sROL126 = ROL16(s76, 4);
            short s77 = (short) (sArr[11] ^ sROL17);
            sArr[11] = s77;
            short sROL127 = ROL16(s77, 10);
            short s78 = (short) (sArr[17] ^ sROL18);
            sArr[17] = s78;
            short sROL128 = ROL16(s78, 15);
            short s79 = (short) (sArr[23] ^ sROL19);
            sArr[23] = s79;
            short sROL129 = ROL16(s79, 8);
            short s85 = (short) (((~sROL126) & sROL127) ^ sROL125);
            sArr2[15] = s85;
            sArr3[0] = (short) (sArr3[0] ^ s85);
            short s86 = (short) (((~sROL127) & sROL128) ^ sROL126);
            sArr2[16] = s86;
            sArr3[1] = (short) (sArr3[1] ^ s86);
            short s87 = (short) (sROL127 ^ ((~sROL128) & sROL129));
            sArr2[17] = s87;
            sArr3[2] = (short) (s87 ^ sArr3[2]);
            short s88 = (short) (((~sROL129) & sROL125) ^ sROL128);
            sArr2[18] = s88;
            sArr3[3] = (short) (s88 ^ sArr3[3]);
            short s89 = (short) (((~sROL125) & sROL126) ^ sROL129);
            sArr2[19] = s89;
            sArr3[4] = (short) (s89 ^ sArr3[4]);
            short s95 = (short) (sArr[2] ^ sROL18);
            sArr[2] = s95;
            short sROL130 = ROL16(s95, 14);
            short s96 = (short) (sArr[8] ^ sROL19);
            sArr[8] = s96;
            short sROL131 = ROL16(s96, 7);
            short s97 = (short) (sArr[14] ^ sROL110);
            sArr[14] = s97;
            short sROL132 = ROL16(s97, 7);
            short s98 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s98;
            short sROL133 = ROL16(s98, 9);
            short s99 = (short) (sROL17 ^ sArr[21]);
            sArr[21] = s99;
            short sROL134 = ROL16(s99, 2);
            short s100 = (short) (((~sROL131) & sROL132) ^ sROL130);
            sArr2[20] = s100;
            sArr3[0] = (short) (s100 ^ sArr3[0]);
            short s101 = (short) (((~sROL132) & sROL133) ^ sROL131);
            sArr2[21] = s101;
            sArr3[1] = (short) (s101 ^ sArr3[1]);
            short s102 = (short) (sROL132 ^ ((~sROL133) & sROL134));
            sArr2[22] = s102;
            sArr3[2] = (short) (s102 ^ sArr3[2]);
            short s103 = (short) (sROL133 ^ ((~sROL134) & sROL130));
            sArr2[23] = s103;
            sArr3[3] = (short) (s103 ^ sArr3[3]);
            short s104 = (short) (((~sROL130) & sROL131) ^ sROL134);
            sArr2[24] = s104;
            sArr3[4] = (short) (s104 ^ sArr3[4]);
        }
    }

    private class ISAPAEAD_K_128 extends ISAPAEAD_K {
        public ISAPAEAD_K_128() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 3092, 3084};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 3092, 3084};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 3092, 3084};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(0, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(1, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(2, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(3, sArr2, sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }
    }

    private class ISAPAEAD_K_128A extends ISAPAEAD_K {
        public ISAPAEAD_K_128A() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 272, 2056};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 272, 2056};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 272, 2056};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(19, sArr, sArr2, sArr3);
            System.arraycopy(sArr2, 0, sArr, 0, sArr2.length);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }
    }

    private interface ISAP_AEAD {
        void absorbFinalAADBlock();

        void absorbMacBlock(byte[] bArr, int i15);

        void init();

        void processEncBlock(byte[] bArr, int i15, byte[] bArr2, int i16);

        void processEncFinalBlock(byte[] bArr, int i15);

        void processMACFinal(byte[] bArr, int i15, int i16, byte[] bArr2);

        void reset();
    }

    public enum IsapType {
        ISAP_A_128A,
        ISAP_K_128A,
        ISAP_A_128,
        ISAP_K_128
    }

    public ISAPEngine(IsapType isapType) {
        String str;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[isapType.ordinal()];
        if (i15 == 1) {
            this.ISAPAEAD = new ISAPAEAD_A_128A();
            str = "ISAP-A-128A AEAD";
        } else if (i15 == 2) {
            this.ISAPAEAD = new ISAPAEAD_K_128A();
            str = "ISAP-K-128A AEAD";
        } else if (i15 == 3) {
            this.ISAPAEAD = new ISAPAEAD_A_128();
            str = "ISAP-A-128 AEAD";
        } else {
            if (i15 != 4) {
                throw new IllegalArgumentException("Incorrect ISAP parameter");
            }
            this.ISAPAEAD = new ISAPAEAD_K_128();
            str = "ISAP-K-128 AEAD";
        }
        this.algorithmName = str;
        this.AADBufferSize = this.BlockSize;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        finishAAD3(state, z15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i15) {
        return super.getOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i15) {
        return super.getUpdateOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z15, CipherParameters cipherParameters) {
        super.init(z15, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b15) {
        super.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i15, int i16) {
        super.processAADBytes(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferAAD(byte[] bArr, int i15) {
        this.ISAPAEAD.absorbMacBlock(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.ISAPAEAD.processEncBlock(bArr, i15, bArr2, i16);
        this.ISAPAEAD.absorbMacBlock(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.ISAPAEAD.processEncBlock(bArr, i15, bArr2, i16);
        this.ISAPAEAD.absorbMacBlock(bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b15, byte[] bArr, int i15) {
        return super.processByte(b15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        return super.processBytes(bArr, i15, i16, bArr2, i17);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalAAD() {
        this.ISAPAEAD.absorbFinalAADBlock();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        this.ISAPAEAD.processEncFinalBlock(bArr, i15);
        if (this.forEncryption) {
            this.ISAPAEAD.processMACFinal(bArr, i15, this.m_bufPos, this.mac);
        } else {
            this.ISAPAEAD.processMACFinal(this.m_buf, 0, this.m_bufPos, this.mac);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.f149046k = bArr;
        this.ISAPAEAD.init();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        this.ISAPAEAD.reset();
    }
}
