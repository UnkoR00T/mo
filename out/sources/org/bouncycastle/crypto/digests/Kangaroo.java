package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public final class Kangaroo {
    private static final int DIGESTLEN = 32;

    static abstract class KangarooBase implements ExtendedDigest, Xof {
        private static final int BLKSIZE = 8192;
        private final byte[] singleByte = new byte[1];
        private boolean squeezing;
        private final int theChainLen;
        private int theCurrNode;
        private final KangarooSponge theLeaf;
        private byte[] thePersonal;
        private int theProcessed;
        private final KangarooSponge theTree;
        private static final byte[] SINGLE = {7};
        private static final byte[] INTERMEDIATE = {11};
        private static final byte[] FINAL = {-1, -1, 6};
        private static final byte[] FIRST = {3, 0, 0, 0, 0, 0, 0, 0};

        KangarooBase(int i15, int i16, int i17, CryptoServicePurpose cryptoServicePurpose) {
            this.theTree = new KangarooSponge(i15, i16);
            this.theLeaf = new KangarooSponge(i15, i16);
            this.theChainLen = i15 >> 2;
            buildPersonal(null);
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i15, cryptoServicePurpose));
        }

        private void buildPersonal(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] bArrLengthEncode = lengthEncode(length);
            byte[] bArrCopyOf = bArr == null ? new byte[bArrLengthEncode.length + length] : Arrays.copyOf(bArr, bArrLengthEncode.length + length);
            this.thePersonal = bArrCopyOf;
            System.arraycopy(bArrLengthEncode, 0, bArrCopyOf, length, bArrLengthEncode.length);
        }

        private static byte[] lengthEncode(long j15) {
            byte b15;
            if (j15 != 0) {
                long j16 = j15;
                b15 = 1;
                while (true) {
                    j16 >>= 8;
                    if (j16 == 0) {
                        break;
                    }
                    b15 = (byte) (b15 + 1);
                }
            } else {
                b15 = 0;
            }
            byte[] bArr = new byte[b15 + 1];
            bArr[b15] = b15;
            for (int i15 = 0; i15 < b15; i15++) {
                bArr[i15] = (byte) (j15 >> (((b15 - i15) - 1) * 8));
            }
            return bArr;
        }

        private void processData(byte[] bArr, int i15, int i16) {
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            KangarooSponge kangarooSponge = this.theCurrNode == 0 ? this.theTree : this.theLeaf;
            int i17 = 8192 - this.theProcessed;
            if (i17 >= i16) {
                kangarooSponge.absorb(bArr, i15, i16);
                this.theProcessed += i16;
                return;
            }
            if (i17 > 0) {
                kangarooSponge.absorb(bArr, i15, i17);
                this.theProcessed += i17;
            }
            while (i17 < i16) {
                if (this.theProcessed == 8192) {
                    switchLeaf(true);
                }
                int iMin = Math.min(i16 - i17, 8192);
                this.theLeaf.absorb(bArr, i15 + i17, iMin);
                this.theProcessed += iMin;
                i17 += iMin;
            }
        }

        private void switchFinal() {
            switchLeaf(false);
            byte[] bArrLengthEncode = lengthEncode(this.theCurrNode);
            this.theTree.absorb(bArrLengthEncode, 0, bArrLengthEncode.length);
            KangarooSponge kangarooSponge = this.theTree;
            byte[] bArr = FINAL;
            kangarooSponge.absorb(bArr, 0, bArr.length);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchLeaf(boolean z15) {
            if (this.theCurrNode == 0) {
                KangarooSponge kangarooSponge = this.theTree;
                byte[] bArr = FIRST;
                kangarooSponge.absorb(bArr, 0, bArr.length);
            } else {
                KangarooSponge kangarooSponge2 = this.theLeaf;
                byte[] bArr2 = INTERMEDIATE;
                kangarooSponge2.absorb(bArr2, 0, bArr2.length);
                int i15 = this.theChainLen;
                byte[] bArr3 = new byte[i15];
                this.theLeaf.squeeze(bArr3, 0, i15);
                this.theTree.absorb(bArr3, 0, this.theChainLen);
                this.theLeaf.initSponge();
            }
            if (z15) {
                this.theCurrNode++;
            }
            this.theProcessed = 0;
        }

        private void switchSingle() {
            this.theTree.absorb(SINGLE, 0, 1);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchToSqueezing() {
            byte[] bArr = this.thePersonal;
            processData(bArr, 0, bArr.length);
            if (this.theCurrNode == 0) {
                switchSingle();
            } else {
                switchFinal();
            }
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i15) {
            return doFinal(bArr, i15, getDigestSize());
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i15, int i16) {
            if (!this.squeezing) {
                switchToSqueezing();
            }
            if (i16 < 0) {
                throw new IllegalArgumentException("Invalid output length");
            }
            this.theTree.squeeze(bArr, i15, i16);
            return i16;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.theTree.theRateBytes;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.theChainLen >> 1;
        }

        public void init(KangarooParameters kangarooParameters) {
            buildPersonal(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.theTree.initSponge();
            this.theLeaf.initSponge();
            this.theCurrNode = 0;
            this.theProcessed = 0;
            this.squeezing = false;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b15) {
            byte[] bArr = this.singleByte;
            bArr[0] = b15;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i15, int i16) {
            if (this.squeezing) {
                throw new IllegalStateException("Already outputting");
            }
            int iDoOutput = doOutput(bArr, i15, i16);
            reset();
            return iDoOutput;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i15, int i16) {
            processData(bArr, i15, i16);
        }
    }

    public static class KangarooParameters implements CipherParameters {
        private byte[] thePersonal;

        public static class Builder {
            private byte[] thePersonal;

            public KangarooParameters build() {
                KangarooParameters kangarooParameters = new KangarooParameters();
                byte[] bArr = this.thePersonal;
                if (bArr != null) {
                    kangarooParameters.thePersonal = bArr;
                }
                return kangarooParameters;
            }

            public Builder setPersonalisation(byte[] bArr) {
                this.thePersonal = Arrays.clone(bArr);
                return this;
            }
        }

        public byte[] getPersonalisation() {
            return Arrays.clone(this.thePersonal);
        }
    }

    private static class KangarooSponge {
        private static final long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private int bytesInQueue;
        private boolean squeezing;
        private final byte[] theQueue;
        private final int theRateBytes;
        private final int theRounds;
        private final long[] theState = new long[25];

        KangarooSponge(int i15, int i16) {
            int i17 = (1600 - (i15 << 1)) >> 3;
            this.theRateBytes = i17;
            this.theRounds = i16;
            this.theQueue = new byte[i17];
            initSponge();
        }

        private void KangarooAbsorb(byte[] bArr, int i15) {
            int i16 = this.theRateBytes >> 3;
            for (int i17 = 0; i17 < i16; i17++) {
                long[] jArr = this.theState;
                jArr[i17] = jArr[i17] ^ Pack.littleEndianToLong(bArr, i15);
                i15 += 8;
            }
            KangarooPermutation();
        }

        private void KangarooExtract() {
            Pack.longToLittleEndian(this.theState, 0, this.theRateBytes >> 3, this.theQueue, 0);
        }

        private void KangarooPermutation() {
            KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.theState;
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = jArr[2];
            char c15 = 3;
            long j18 = jArr[3];
            char c16 = 4;
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
            long j59 = jArr[24];
            int length = KeccakRoundConstants.length - kangarooSponge.theRounds;
            int i15 = 0;
            while (i15 < kangarooSponge.theRounds) {
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
                char c17 = c15;
                long j116 = (j96 << 44) | (j96 >>> 20);
                char c18 = c16;
                long j117 = (j111 << 20) | (j111 >>> 44);
                long j118 = (j104 << 61) | (j104 >>> c17);
                long j119 = (j112 << 39) | (j112 >>> 25);
                long j120 = (j89 << 18) | (j89 >>> 46);
                int i16 = i15;
                long j121 = (j100 << 62) | (j100 >>> 2);
                long j122 = (j102 << 43) | (j102 >>> 21);
                long j123 = (j107 << 25) | (j107 >>> 39);
                long j124 = (j113 << 8) | (j113 >>> 56);
                long j125 = (j109 << 56) | (j109 >>> 8);
                long j126 = (j88 << 41) | (j88 >>> 23);
                long j127 = (j110 << 27) | (j110 >>> 37);
                long j128 = (j114 << 14) | (j114 >>> 50);
                long j129 = (j99 << 2) | (j99 >>> 62);
                long j130 = (j106 << 55) | (j106 >>> 9);
                long j131 = (j98 << 45) | (j98 >>> 19);
                long j132 = (j86 << 36) | (j86 >>> 28);
                long j133 = (j105 << 28) | (j105 >>> 36);
                long j134 = (j108 << 21) | (j108 >>> 43);
                long j135 = (j103 << 15) | (j103 >>> 49);
                long j136 = (j97 << 10) | (j97 >>> 54);
                long j137 = (j101 << 6) | (j101 >>> 58);
                long j138 = (j87 << c17) | (j87 >>> 61);
                long j139 = ((~j116) & j122) ^ j85;
                long j140 = ((~j122) & j134) ^ j116;
                long j141 = j122 ^ ((~j134) & j128);
                long j142 = j134 ^ ((~j128) & j85);
                long j143 = ((~j85) & j116) ^ j128;
                long j144 = j133 ^ ((~j117) & j138);
                long j145 = ((~j138) & j131) ^ j117;
                int i17 = length;
                long j146 = ((~j131) & j118) ^ j138;
                j28 = j131 ^ ((~j118) & j133);
                long j147 = ((~j133) & j117) ^ j118;
                j35 = j115 ^ ((~j137) & j123);
                long j148 = ((~j123) & j124) ^ j137;
                long j149 = ((~j124) & j120) ^ j123;
                j38 = j124 ^ ((~j120) & j115);
                long j150 = ((~j115) & j137) ^ j120;
                long j151 = j127 ^ ((~j132) & j136);
                long j152 = ((~j136) & j135) ^ j132;
                long j153 = j136 ^ ((~j135) & j125);
                long j154 = j135 ^ ((~j125) & j127);
                long j155 = j125 ^ ((~j127) & j132);
                long j156 = j121 ^ ((~j130) & j119);
                long j157 = ((~j119) & j126) ^ j130;
                long j158 = j119 ^ ((~j126) & j129);
                j58 = j126 ^ ((~j129) & j121);
                j59 = j129 ^ ((~j121) & j130);
                j15 = j139 ^ KeccakRoundConstants[i17 + i16];
                j37 = j149;
                j27 = j146;
                jArr = jArr;
                c15 = c17;
                j26 = j145;
                length = i17;
                j49 = j155;
                j46 = j152;
                j36 = j148;
                j48 = j154;
                j39 = j150;
                j55 = j156;
                j56 = j157;
                j57 = j158;
                j29 = j147;
                j19 = j143;
                j47 = j153;
                j45 = j151;
                j18 = j142;
                c16 = c18;
                j25 = j144;
                j17 = j141;
                j16 = j140;
                i15 = i16 + 1;
                kangarooSponge = this;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j15;
            jArr2[1] = j16;
            jArr2[2] = j17;
            jArr2[c15] = j18;
            jArr2[c16] = j19;
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
            jArr2[24] = j59;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void absorb(byte[] bArr, int i15, int i16) {
            int i17;
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            int i18 = 0;
            while (i18 < i16) {
                if (this.bytesInQueue == this.theRateBytes) {
                    KangarooAbsorb(this.theQueue, 0);
                    this.bytesInQueue = 0;
                }
                int i19 = this.bytesInQueue;
                if (i19 != 0 || i18 > i16 - this.theRateBytes) {
                    int iMin = Math.min(this.theRateBytes - i19, i16 - i18);
                    System.arraycopy(bArr, i15 + i18, this.theQueue, this.bytesInQueue, iMin);
                    this.bytesInQueue += iMin;
                    i18 += iMin;
                } else {
                    do {
                        KangarooAbsorb(bArr, i15 + i18);
                        i17 = this.theRateBytes;
                        i18 += i17;
                    } while (i18 <= i16 - i17);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initSponge() {
            Arrays.fill(this.theState, 0L);
            Arrays.fill(this.theQueue, (byte) 0);
            this.bytesInQueue = 0;
            this.squeezing = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void padAndSwitchToSqueezingPhase() {
            int i15 = this.bytesInQueue;
            while (true) {
                int i16 = this.theRateBytes;
                if (i15 >= i16) {
                    byte[] bArr = this.theQueue;
                    int i17 = i16 - 1;
                    bArr[i17] = (byte) (bArr[i17] ^ 128);
                    KangarooAbsorb(bArr, 0);
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                    this.squeezing = true;
                    return;
                }
                this.theQueue[i15] = 0;
                i15++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void squeeze(byte[] bArr, int i15, int i16) {
            if (!this.squeezing) {
                padAndSwitchToSqueezingPhase();
            }
            int i17 = 0;
            while (i17 < i16) {
                if (this.bytesInQueue == 0) {
                    KangarooPermutation();
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                }
                int iMin = Math.min(this.bytesInQueue, i16 - i17);
                System.arraycopy(this.theQueue, this.theRateBytes - this.bytesInQueue, bArr, i15 + i17, iMin);
                this.bytesInQueue -= iMin;
                i17 += iMin;
            }
        }
    }

    public static class KangarooTwelve extends KangarooBase {
        public KangarooTwelve() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
            return super.doFinal(bArr, i15);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i15, int i16) {
            return super.doOutput(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "KangarooTwelve";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b15) {
            super.update(b15);
        }

        public KangarooTwelve(int i15, CryptoServicePurpose cryptoServicePurpose) {
            super(128, 12, i15, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15, int i16) {
            return super.doFinal(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i15, int i16) {
            super.update(bArr, i15, i16);
        }

        public KangarooTwelve(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static class MarsupilamiFourteen extends KangarooBase {
        public MarsupilamiFourteen() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
            return super.doFinal(bArr, i15);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i15, int i16) {
            return super.doOutput(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "MarsupilamiFourteen";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b15) {
            super.update(b15);
        }

        public MarsupilamiFourteen(int i15, CryptoServicePurpose cryptoServicePurpose) {
            super(256, 14, i15, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15, int i16) {
            return super.doFinal(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i15, int i16) {
            super.update(bArr, i15, i16);
        }

        public MarsupilamiFourteen(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }
}
