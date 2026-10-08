package org.bouncycastle.crypto.engines;

import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
public class ElephantEngine extends AEADBaseEngine {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private byte[] f149034ad;
    private int adOff;
    private int adlen;
    private final byte[] buffer;
    private byte[] current_mask;
    private byte[] expanded_key;
    private final Permutation instance;
    private int nb_its;
    private byte[] next_mask;
    private byte[] npub;
    private byte[] previous_mask;
    private final byte[] previous_outputMessage;
    private final byte[] tag_buffer;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.ElephantEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters;

        static {
            int[] iArr = new int[ElephantParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters = iArr;
            try {
                iArr[ElephantParameters.elephant160.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant176.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant200.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class Delirium implements Permutation {
        private static final int nRounds = 18;
        private final int[] KeccakRhoOffsets;
        private final byte[] KeccakRoundConstants;

        private Delirium() {
            this.KeccakRoundConstants = new byte[]{1, -126, -118, 0, -117, 1, -127, 9, -118, -120, 9, 10, -117, -117, -119, 3, 2, -128};
            this.KeccakRhoOffsets = new int[]{0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};
        }

        private void KeccakP200Round(byte[] bArr, int i15) {
            byte[] bArr2 = new byte[25];
            for (int i16 = 0; i16 < 5; i16++) {
                for (int i17 = 0; i17 < 5; i17++) {
                    bArr2[i16] = (byte) (bArr2[i16] ^ bArr[index(i16, i17)]);
                }
            }
            int i18 = 0;
            while (i18 < 5) {
                int i19 = i18 + 1;
                bArr2[i18 + 5] = (byte) (bArr2[(i18 + 4) % 5] ^ ROL8(bArr2[i19 % 5], 1));
                i18 = i19;
            }
            for (int i25 = 0; i25 < 5; i25++) {
                for (int i26 = 0; i26 < 5; i26++) {
                    int iIndex = index(i25, i26);
                    bArr[iIndex] = (byte) (bArr[iIndex] ^ bArr2[i25 + 5]);
                }
            }
            for (int i27 = 0; i27 < 5; i27++) {
                for (int i28 = 0; i28 < 5; i28++) {
                    bArr2[index(i27, i28)] = ROL8(bArr[index(i27, i28)], this.KeccakRhoOffsets[index(i27, i28)]);
                }
            }
            for (int i29 = 0; i29 < 5; i29++) {
                for (int i35 = 0; i35 < 5; i35++) {
                    bArr[index(i35, ((i29 * 2) + (i35 * 3)) % 5)] = bArr2[index(i29, i35)];
                }
            }
            for (int i36 = 0; i36 < 5; i36++) {
                int i37 = 0;
                while (i37 < 5) {
                    int i38 = i37 + 1;
                    bArr2[i37] = (byte) (bArr[index(i37, i36)] ^ ((~bArr[index(i38 % 5, i36)]) & bArr[index((i37 + 2) % 5, i36)]));
                    i37 = i38;
                }
                for (int i39 = 0; i39 < 5; i39++) {
                    bArr[index(i39, i36)] = bArr2[i39];
                }
            }
            bArr[0] = (byte) (this.KeccakRoundConstants[i15] ^ bArr[0]);
        }

        private byte ROL8(byte b15, int i15) {
            return (byte) (((b15 & GF2Field.MASK) >>> (8 - i15)) | (b15 << i15));
        }

        private int index(int i15, int i16) {
            return i15 + (i16 * 5);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            int i15 = elephantEngine.BlockSize - 1;
            byte bRotl = elephantEngine.rotl(elephantEngine.current_mask[0]);
            ElephantEngine elephantEngine2 = ElephantEngine.this;
            bArr[i15] = (byte) ((bRotl ^ elephantEngine2.rotl(elephantEngine2.current_mask[2])) ^ (ElephantEngine.this.current_mask[13] << 1));
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            for (int i15 = 0; i15 < 18; i15++) {
                KeccakP200Round(bArr, i15);
            }
        }

        /* synthetic */ Delirium(ElephantEngine elephantEngine, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private class Dumbo extends Spongent {
        public Dumbo() {
            super(160, 20, 80, (byte) 117);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) (((((elephantEngine.current_mask[0] & 255) << 3) | ((ElephantEngine.this.current_mask[0] & 255) >>> 5)) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[13] & 255) >>> 7));
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    private class Jumbo extends Spongent {
        public Jumbo() {
            super(176, 22, 90, (byte) 69);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) ((elephantEngine.rotl(elephantEngine.current_mask[0]) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[19] & 255) >>> 7));
        }
    }

    private interface Permutation {
        void lfsr_step();

        void permutation(byte[] bArr);
    }

    private static abstract class Spongent implements Permutation {
        private final byte lfsrIV;
        private final int nBits;
        private final int nRounds;
        private final int nSBox;
        private final byte[] sBoxLayer = {-18, -19, -21, -32, -30, -31, -28, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, -77, -74, 14, 13, 11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, 32, 34, 33, 36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 30, 29, 27, 16, 18, 17, 20, 31, 23, 26, 24, 21, 25, 28, 19, 22, 78, 77, 75, 64, 66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, 112, 114, 113, 116, 127, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, -85, -96, -94, -95, -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, -114, -115, -117, -128, -126, -127, -124, -113, -121, -118, -120, -123, -119, -116, -125, -122, 94, 93, 91, 80, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, -55, -52, -61, -58, 62, 61, 59, 48, 50, 49, 52, 63, 55, 58, 56, 53, 57, 60, 51, 54, 110, 109, 107, 96, 98, 97, 100, 111, 103, 106, 104, 101, 105, 108, 99, 102};

        public Spongent(int i15, int i16, int i17, byte b15) {
            this.nRounds = i17;
            this.nSBox = i16;
            this.lfsrIV = b15;
            this.nBits = i15;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            int i15;
            byte b15 = this.lfsrIV;
            byte[] bArr2 = new byte[this.nSBox];
            for (int i16 = 0; i16 < this.nRounds; i16++) {
                bArr[0] = (byte) (bArr[0] ^ b15);
                int i17 = this.nSBox - 1;
                int i18 = b15 & 32;
                int i19 = b15 & 64;
                bArr[i17] = (byte) (bArr[i17] ^ ((byte) (((((((((b15 & 1) << 7) | ((b15 & 2) << 5)) | ((b15 & 4) << 3)) | ((b15 & 8) << 1)) | ((b15 & 16) >>> 1)) | (i18 >>> 3)) | (i19 >>> 5)) | ((b15 & 128) >>> 7))));
                b15 = (byte) (((b15 << 1) | ((i19 >>> 6) ^ (i18 >>> 5))) & CertificateBody.profileType);
                for (int i25 = 0; i25 < this.nSBox; i25++) {
                    bArr[i25] = this.sBoxLayer[bArr[i25] & 255];
                }
                Arrays.fill(bArr2, (byte) 0);
                int i26 = 0;
                while (true) {
                    i15 = this.nSBox;
                    if (i26 < i15) {
                        for (int i27 = 0; i27 < 8; i27++) {
                            int i28 = (i26 << 3) + i27;
                            int i29 = this.nBits;
                            if (i28 != i29 - 1) {
                                i28 = ((i28 * i29) >> 2) % (i29 - 1);
                            }
                            int i35 = i28 >>> 3;
                            bArr2[i35] = (byte) (((((bArr[i26] & 255) >>> i27) & 1) << (i28 & 7)) ^ bArr2[i35]);
                        }
                        i26++;
                    }
                }
                System.arraycopy(bArr2, 0, bArr, 0, i15);
            }
        }
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[elephantParameters.ordinal()];
        if (i15 == 1) {
            this.BlockSize = 20;
            this.instance = new Dumbo();
            this.MAC_SIZE = 8;
            this.algorithmName = "Elephant 160 AEAD";
        } else if (i15 == 2) {
            this.BlockSize = 22;
            this.instance = new Jumbo();
            this.algorithmName = "Elephant 176 AEAD";
            this.MAC_SIZE = 8;
        } else {
            if (i15 != 3) {
                throw new IllegalArgumentException("Invalid parameter settings for Elephant");
            }
            this.BlockSize = 25;
            this.instance = new Delirium(this, null);
            this.algorithmName = "Elephant 200 AEAD";
            this.MAC_SIZE = 16;
        }
        int i16 = this.BlockSize;
        this.tag_buffer = new byte[i16];
        this.previous_mask = new byte[i16];
        this.current_mask = new byte[i16];
        this.next_mask = new byte[i16];
        this.buffer = new byte[i16];
        this.previous_outputMessage = new byte[i16];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void absorbAAD() {
        processAADBytes(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void absorbCiphertext() {
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void computeCipherBlock(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        System.arraycopy(this.npub, 0, this.buffer, 0, this.IV_SIZE);
        Arrays.fill(this.buffer, this.IV_SIZE, this.BlockSize, (byte) 0);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        Bytes.xorTo(i16, bArr, i15, this.buffer);
        System.arraycopy(this.buffer, 0, bArr2, i17, i16);
    }

    private void lfsr_step() {
        this.instance.lfsr_step();
        System.arraycopy(this.current_mask, 1, this.next_mask, 0, this.BlockSize - 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    private void processAADBytes(byte[] bArr) {
        int i15;
        AEADBaseEngine.State state;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25 = this.m_state.ord;
        if (i25 != 1) {
            if (i25 == 2) {
                if (this.adOff == this.adlen) {
                    Arrays.fill(bArr, 0, this.BlockSize, (byte) 0);
                    bArr[0] = 1;
                    return;
                }
            } else if (i25 == 5) {
                System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BlockSize);
                System.arraycopy(this.npub, 0, bArr, 0, this.IV_SIZE);
                i15 = this.IV_SIZE;
                state = AEADBaseEngine.State.DecAad;
            } else if (i25 == 6) {
                if (this.adOff == this.adlen) {
                    Arrays.fill(bArr, 0, this.BlockSize, (byte) 0);
                    bArr[0] = 1;
                    return;
                }
            }
            i15 = 0;
            i16 = this.BlockSize - i15;
            int i26 = this.adlen;
            i17 = this.adOff;
            i18 = i26 - i17;
            if (i16 <= i18) {
                System.arraycopy(this.f149034ad, i17, bArr, i15, i16);
                this.adOff += i16;
                return;
            }
            if (i18 > 0) {
                System.arraycopy(this.f149034ad, i17, bArr, i15, i18);
                this.adOff += i18;
            }
            int i27 = i18 + i15;
            Arrays.fill(bArr, i27, i15 + i16, (byte) 0);
            bArr[i27] = 1;
            i19 = this.m_state.ord;
            if (i19 != 2) {
                this.m_state = AEADBaseEngine.State.EncData;
            } else {
                if (i19 != 6) {
                    return;
                }
                this.m_state = AEADBaseEngine.State.DecData;
            }
        }
        System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BlockSize);
        System.arraycopy(this.npub, 0, bArr, 0, this.IV_SIZE);
        i15 = this.IV_SIZE;
        state = AEADBaseEngine.State.EncAad;
        this.m_state = state;
        i16 = this.BlockSize - i15;
        int i28 = this.adlen;
        i17 = this.adOff;
        i18 = i28 - i17;
        if (i16 <= i18) {
            System.arraycopy(this.f149034ad, i17, bArr, i15, i16);
            this.adOff += i16;
            return;
        }
        if (i18 > 0) {
            System.arraycopy(this.f149034ad, i17, bArr, i15, i18);
            this.adOff += i18;
        }
        int i29 = i18 + i15;
        Arrays.fill(bArr, i29, i15 + i16, (byte) 0);
        bArr[i29] = 1;
        i19 = this.m_state.ord;
        if (i19 != 2) {
            this.m_state = AEADBaseEngine.State.EncData;
        } else {
            if (i19 != 6) {
                return;
            }
            this.m_state = AEADBaseEngine.State.DecData;
        }
    }

    private void processBuffer(byte[] bArr, int i15, byte[] bArr2, int i16, AEADBaseEngine.State state) {
        AEADBaseEngine.State state2 = this.m_state;
        if (state2 == AEADBaseEngine.State.DecInit || state2 == AEADBaseEngine.State.EncInit) {
            processFinalAAD();
        }
        lfsr_step();
        computeCipherBlock(bArr, i15, this.BlockSize, bArr2, i16);
        if (this.nb_its > 0) {
            System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, this.BlockSize);
            absorbCiphertext();
        }
        if (this.m_state != state) {
            absorbAAD();
        }
        swapMasks();
        this.nb_its++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte rotl(byte b15) {
        return (byte) (((b15 & 255) >>> 7) | (b15 << 1));
    }

    private void swapMasks() {
        byte[] bArr = this.previous_mask;
        this.previous_mask = this.current_mask;
        this.current_mask = this.next_mask;
        this.next_mask = bArr;
    }

    public static void xorTo(int i15, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i16 = 0; i16 < i15; i16++) {
            bArr3[i16] = (byte) (bArr3[i16] ^ (bArr[i16] ^ bArr2[i16]));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void checkAAD() {
        int i15 = this.m_state.ord;
        if (i15 == 3) {
            throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size");
        }
        if (i15 == 4) {
            throw new IllegalArgumentException(this.algorithmName + " cannot be reused for encryption");
        }
        if (i15 != 7) {
            return;
        }
        throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the plaintext to be processed exceeds the a block size");
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected boolean checkData(boolean z15) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        finishAAD2(state);
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
    public int getOutputSize(int i15) {
        int i16 = this.m_state.ord;
        if (i16 == 0) {
            throw new IllegalArgumentException(this.algorithmName + " needs call init function before getUpdateOutputSize");
        }
        if (i16 == 1 || i16 == 2 || i16 == 3) {
            return i15 + this.m_bufPos + this.MAC_SIZE;
        }
        if (i16 == 4 || i16 == 8) {
            return 0;
        }
        return Math.max(0, (i15 + this.m_bufPos) - this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        switch (this.m_state.ord) {
            case 0:
                throw new IllegalArgumentException(this.algorithmName + " needs call init function before getUpdateOutputSize");
            case 1:
            case 2:
            case 3:
                int i16 = this.m_bufPos + i15;
                return i16 - (i16 % this.BlockSize);
            case 4:
            case 8:
                return 0;
            case 5:
            case 6:
            case 7:
                int iMax = Math.max(0, (this.m_bufPos + i15) - this.MAC_SIZE);
                return iMax - (iMax % this.BlockSize);
            default:
                return Math.max(0, (i15 + this.m_bufPos) - this.MAC_SIZE);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z15, CipherParameters cipherParameters) {
        super.init(z15, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b15) {
        super.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferAAD(byte[] bArr, int i15) {
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBuffer(bArr, i15, bArr2, i16, AEADBaseEngine.State.DecData);
        System.arraycopy(bArr, i15, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBuffer(bArr, i15, bArr2, i16, AEADBaseEngine.State.EncData);
        System.arraycopy(bArr2, i16, this.previous_outputMessage, 0, this.BlockSize);
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
        if (this.adOff == -1) {
            this.f149034ad = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
            this.adOff = 0;
            this.adlen = this.aadOperator.getLen();
            this.aadOperator.reset();
        }
        int i15 = this.m_state.ord;
        if (i15 == 1 || i15 == 5) {
            processAADBytes(this.tag_buffer);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        processFinalAAD();
        int i16 = this.BlockSize;
        int i17 = len / i16;
        int i18 = i17 + 1;
        int i19 = len % i16 != 0 ? i18 : i17;
        int i25 = (this.IV_SIZE + this.adlen) / i16;
        processBytes(this.m_buf, bArr, i15, Math.max(i17 + 2, i25), i19, i18, len, i25 + 1);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        this.instance.permutation(this.tag_buffer);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        System.arraycopy(this.tag_buffer, 0, this.mac, 0, this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private void processBytes(byte[] bArr, byte[] bArr2, int i15, int i16, int i17, int i18, int i19, int i25) {
        byte[] bArr3 = new byte[this.BlockSize];
        int i26 = this.nb_its;
        int i27 = i15;
        int i28 = 0;
        while (i26 < i16) {
            int i29 = i26 == i17 + (-1) ? i19 - (this.BlockSize * i26) : this.BlockSize;
            lfsr_step();
            if (i26 < i17) {
                computeCipherBlock(bArr, i28, i29, bArr2, i27);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, bArr3, 0, i29);
                } else {
                    System.arraycopy(bArr, i28, bArr3, 0, i29);
                }
                i27 += i29;
                i28 += i29;
            }
            if (i26 > 0 && i26 <= i18) {
                int i35 = this.BlockSize;
                int i36 = (i26 - 1) * i35;
                if (i36 == i19) {
                    Arrays.fill(this.buffer, 1, i35, (byte) 0);
                    this.buffer[0] = 1;
                } else {
                    int i37 = i19 - i36;
                    if (i35 <= i37) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i35);
                    } else if (i37 > 0) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i37);
                        Arrays.fill(this.buffer, i37, this.BlockSize, (byte) 0);
                        this.buffer[i37] = 1;
                    }
                }
                absorbCiphertext();
            }
            i26++;
            if (i26 < i25) {
                absorbAAD();
            }
            swapMasks();
            System.arraycopy(bArr3, 0, this.previous_outputMessage, 0, this.BlockSize);
        }
        this.nb_its = i26;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        byte[] bArr3 = new byte[this.BlockSize];
        this.expanded_key = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, this.KEY_SIZE);
        this.instance.permutation(this.expanded_key);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i15, int i16) {
        super.processAADBytes(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        Arrays.fill(this.tag_buffer, (byte) 0);
        Arrays.fill(this.previous_outputMessage, (byte) 0);
        this.nb_its = 0;
        this.adOff = -1;
    }
}
