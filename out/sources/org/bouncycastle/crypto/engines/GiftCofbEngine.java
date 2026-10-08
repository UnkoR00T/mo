package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
public class GiftCofbEngine extends AEADBaseEngine {
    private static final byte[] GIFT_RC = {1, 3, 7, 15, 31, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, 22, 44, 24, 48, 33, 2, 5, 11, 23, 46, 28, 56, 49, 35, 6, 13, 27, 54, 45, 26};
    private byte[] Y;
    private byte[] input;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149036k;
    private byte[] npub;
    private byte[] offset;

    public GiftCofbEngine() {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 16;
        this.MAC_SIZE = 16;
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.algorithmName = "GIFT-COFB AEAD";
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void double_half_block(byte[] bArr) {
        int i15 = 0;
        int i16 = ((bArr[0] & 255) >>> 7) * 27;
        while (i15 < 7) {
            int i17 = i15 + 1;
            bArr[i15] = (byte) (((bArr[i15] & 255) << 1) | ((bArr[i17] & 255) >>> 7));
            i15 = i17;
        }
        bArr[7] = (byte) (((bArr[7] & 255) << 1) ^ i16);
    }

    private void giftb128(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c15 = 0;
        int[] iArr = {((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255), ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255), ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8) | (bArr[11] & 255), ((bArr[13] & 255) << 16) | ((bArr[12] & 255) << 24) | ((bArr[14] & 255) << 8) | (bArr[15] & 255)};
        short[] sArr = {(short) (((bArr2[0] & 255) << 8) | (bArr2[1] & 255)), (short) (((bArr2[2] & 255) << 8) | (bArr2[3] & 255)), (short) (((bArr2[4] & 255) << 8) | (bArr2[5] & 255)), (short) (((bArr2[6] & 255) << 8) | (bArr2[7] & 255)), (short) (((bArr2[8] & 255) << 8) | (bArr2[9] & 255)), (short) (((bArr2[10] & 255) << 8) | (bArr2[11] & 255)), (short) (((bArr2[12] & 255) << 8) | (bArr2[13] & 255)), (short) (((bArr2[14] & 255) << 8) | (bArr2[15] & 255))};
        int i15 = 0;
        while (i15 < 40) {
            int i16 = iArr[1];
            int i17 = iArr[c15];
            int i18 = iArr[2];
            int i19 = i16 ^ (i17 & i18);
            iArr[1] = i19;
            int i25 = iArr[3];
            int i26 = i17 ^ (i19 & i25);
            iArr[c15] = i26;
            int i27 = i18 ^ (i26 | i19);
            iArr[2] = i27;
            char c16 = c15;
            int i28 = i25 ^ i27;
            iArr[3] = i28;
            int i29 = i19 ^ i28;
            iArr[1] = i29;
            int i35 = ~i28;
            iArr[3] = i35;
            iArr[2] = i27 ^ (i26 & i29);
            iArr[c16] = i35;
            iArr[3] = i26;
            iArr[c16] = rowperm(i35, 0, 3, 2, 1);
            iArr[1] = rowperm(iArr[1], 1, 0, 3, 2);
            iArr[2] = rowperm(iArr[2], 2, 1, 0, 3);
            int iRowperm = rowperm(iArr[3], 3, 2, 1, 0);
            iArr[3] = iRowperm;
            int i36 = iArr[2];
            short s15 = sArr[2];
            int i37 = (s15 & HPKE.aead_EXPORT_ONLY) << 16;
            short s16 = sArr[3];
            iArr[2] = i36 ^ (i37 | (s16 & HPKE.aead_EXPORT_ONLY));
            int i38 = iArr[1];
            short s17 = sArr[6];
            int i39 = (s17 & HPKE.aead_EXPORT_ONLY) << 16;
            short s18 = sArr[7];
            iArr[1] = i38 ^ (i39 | (s18 & HPKE.aead_EXPORT_ONLY));
            iArr[3] = iRowperm ^ ((GIFT_RC[i15] & 255) ^ PKIFailureInfo.systemUnavail);
            short s19 = (short) (((s17 & HPKE.aead_EXPORT_ONLY) >>> 2) | ((s17 & HPKE.aead_EXPORT_ONLY) << 14));
            short s25 = (short) (((s18 & HPKE.aead_EXPORT_ONLY) >>> 12) | ((s18 & HPKE.aead_EXPORT_ONLY) << 4));
            sArr[7] = sArr[5];
            sArr[6] = sArr[4];
            sArr[5] = s16;
            sArr[4] = s15;
            sArr[3] = sArr[1];
            sArr[2] = sArr[c16];
            sArr[1] = s25;
            sArr[c16] = s19;
            i15++;
            c15 = c16;
        }
        char c17 = c15;
        int i45 = iArr[c17];
        bArr3[c17] = (byte) (i45 >>> 24);
        bArr3[1] = (byte) (i45 >>> 16);
        bArr3[2] = (byte) (i45 >>> 8);
        bArr3[3] = (byte) i45;
        int i46 = iArr[1];
        bArr3[4] = (byte) (i46 >>> 24);
        bArr3[5] = (byte) (i46 >>> 16);
        bArr3[6] = (byte) (i46 >>> 8);
        bArr3[7] = (byte) i46;
        int i47 = iArr[2];
        bArr3[8] = (byte) (i47 >>> 24);
        bArr3[9] = (byte) (i47 >>> 16);
        bArr3[10] = (byte) (i47 >>> 8);
        bArr3[11] = (byte) i47;
        int i48 = iArr[3];
        bArr3[12] = (byte) (i48 >>> 24);
        bArr3[13] = (byte) (i48 >>> 16);
        bArr3[14] = (byte) (i48 >>> 8);
        bArr3[15] = (byte) i48;
    }

    private void pho1(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, int i16) {
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        if (i16 == 0) {
            bArr4[0] = -128;
        } else {
            System.arraycopy(bArr3, i15, bArr4, 0, i16);
            if (i16 < 16) {
                bArr4[i16] = -128;
            }
        }
        System.arraycopy(bArr2, 8, bArr5, 0, 8);
        int i17 = 0;
        while (i17 < 7) {
            int i18 = i17 + 8;
            int i19 = (bArr2[i17] & 255) << 1;
            i17++;
            bArr5[i18] = (byte) (((bArr2[i17] & 255) >>> 7) | i19);
        }
        bArr5[15] = (byte) (((bArr2[7] & 255) << 1) | ((bArr2[0] & 255) >>> 7));
        System.arraycopy(bArr5, 0, bArr2, 0, 16);
        Bytes.xor(16, bArr2, bArr4, bArr);
    }

    private int rowperm(int i15, int i16, int i17, int i18, int i19) {
        int i25 = 0;
        for (int i26 = 0; i26 < 8; i26++) {
            int i27 = i26 * 4;
            i25 = i25 | (((i15 >>> i27) & 1) << ((i16 * 8) + i26)) | (((i15 >>> (i27 + 1)) & 1) << ((i17 * 8) + i26)) | (((i15 >>> (i27 + 2)) & 1) << ((i18 * 8) + i26)) | (((i15 >>> (i27 + 3)) & 1) << ((8 * i19) + i26));
        }
        return i25;
    }

    private void triple_half_block(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 + 1;
            bArr2[i15] = (byte) (((bArr[i16] & 255) >>> 7) | ((bArr[i15] & 255) << 1));
            i15 = i16;
        }
        bArr2[7] = (byte) ((((bArr[0] & 255) >>> 7) * 27) ^ ((bArr[7] & 255) << 1));
        Bytes.xorTo(8, bArr2, bArr);
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
        pho1(this.input, this.Y, bArr, i15, 16);
        double_half_block(this.offset);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f149036k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i15, bArr2, i16);
        pho1(this.input, this.Y, bArr2, i16, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f149036k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i15, bArr2, i16);
        pho1(this.input, this.Y, bArr, i15, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f149036k, this.Y);
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
        AEADBaseEngine.State state;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        triple_half_block(this.offset);
        if ((this.m_aadPos & 15) != 0 || (state = this.m_state) == AEADBaseEngine.State.DecInit || state == AEADBaseEngine.State.EncInit) {
            triple_half_block(this.offset);
        }
        if (len == 0) {
            triple_half_block(this.offset);
            triple_half_block(this.offset);
        }
        pho1(this.input, this.Y, this.m_aad, 0, this.m_aadPos);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f149036k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        GiftCofbEngine giftCofbEngine;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        if (len != 0) {
            triple_half_block(this.offset);
            if ((len & 15) != 0) {
                triple_half_block(this.offset);
            }
            Bytes.xor(this.m_bufPos, this.Y, this.m_buf, 0, bArr, i15);
            if (this.forEncryption) {
                giftCofbEngine = this;
                giftCofbEngine.pho1(this.input, this.Y, this.m_buf, 0, this.m_bufPos);
            } else {
                giftCofbEngine = this;
                giftCofbEngine.pho1(giftCofbEngine.input, giftCofbEngine.Y, bArr, i15, giftCofbEngine.m_bufPos);
            }
            Bytes.xorTo(8, giftCofbEngine.offset, giftCofbEngine.input);
            giftb128(giftCofbEngine.input, giftCofbEngine.f149036k, giftCofbEngine.Y);
        } else {
            giftCofbEngine = this;
        }
        System.arraycopy(giftCofbEngine.Y, 0, giftCofbEngine.mac, 0, giftCofbEngine.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.f149036k = bArr;
        this.Y = new byte[this.BlockSize];
        this.input = new byte[16];
        this.offset = new byte[8];
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        System.arraycopy(this.npub, 0, this.input, 0, this.IV_SIZE);
        giftb128(this.input, this.f149036k, this.Y);
        System.arraycopy(this.Y, 0, this.offset, 0, 8);
    }
}
