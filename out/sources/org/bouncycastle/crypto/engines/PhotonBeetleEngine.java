package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.PhotonBeetleDigest;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
public class PhotonBeetleEngine extends AEADBaseEngine {
    private static final int D = 8;
    private byte[] K;
    private final int LAST_THREE_BITS_OFFSET;
    private byte[] N;
    private final int RATE_INBYTES_HALF;
    private final int STATE_INBYTES;
    private boolean input_empty;
    private byte[] state;
    private static final byte[][] RC = {new byte[]{1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 4, 11}, new byte[]{2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 2, 13}, new byte[]{14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 10, 5}, new byte[]{15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 13, 2}};
    private static final byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, 13, 7, 7, 5, 2}, new byte[]{4, 4, 13, 13, 9, 4, 13, 9}, new byte[]{1, 6, 5, 1, 12, 13, 15, 14}, new byte[]{15, 12, 9, 13, 14, 5, 14, 13}, new byte[]{9, 14, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, 14}, new byte[]{15, 1, 13, 10, 5, 10, 2, 3}};
    private static final byte[] sbox = {12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 15, 8, 4, 7, 1, 2};

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.PhotonBeetleEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters;

        static {
            int[] iArr = new int[PhotonBeetleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters = iArr;
            try {
                iArr[PhotonBeetleParameters.pb32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[PhotonBeetleParameters.pb128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum PhotonBeetleParameters {
        pb32,
        pb128
    }

    public PhotonBeetleEngine(PhotonBeetleParameters photonBeetleParameters) {
        int i15;
        int i16;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int i17 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[photonBeetleParameters.ordinal()];
        if (i17 != 1) {
            i15 = i17 != 2 ? 0 : 128;
            i16 = i15;
        } else {
            i15 = 32;
            i16 = BERTags.FLAGS;
        }
        int i18 = i15 + 7;
        int i19 = i18 >>> 3;
        this.BlockSize = i19;
        this.AADBufferSize = i19;
        this.RATE_INBYTES_HALF = i18 >>> 4;
        int i25 = i15 + i16;
        int i26 = (i25 + 7) >>> 3;
        this.STATE_INBYTES = i26;
        this.LAST_THREE_BITS_OFFSET = (i25 - ((i26 - 1) << 3)) - 3;
        this.algorithmName = "Photon-Beetle AEAD";
        this.state = new byte[i26];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Counter, AEADBaseEngine.DataOperatorType.Counter);
    }

    public static void photonPermutation(PhotonBeetleDigest.Friend friend, byte[] bArr) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by PhotonBeetleDigest");
        }
        photonPermutation(bArr);
    }

    private void rhoohr(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        photonPermutation(this.state);
        byte[] bArr3 = new byte[8];
        int iMin = Math.min(i17, this.RATE_INBYTES_HALF);
        int i18 = 0;
        while (true) {
            int i19 = this.RATE_INBYTES_HALF;
            if (i18 >= i19 - 1) {
                byte[] bArr4 = this.state;
                bArr3[i19 - 1] = (byte) (((bArr4[0] & 1) << 7) | ((bArr4[i18] & 255) >>> 1));
                Bytes.xor(iMin, bArr4, i19, bArr2, i16, bArr, i15);
                Bytes.xor(i17 - iMin, bArr3, iMin - this.RATE_INBYTES_HALF, bArr2, i16 + iMin, bArr, i15 + iMin);
                return;
            }
            byte[] bArr5 = this.state;
            int i25 = i18 + 1;
            bArr3[i18] = (byte) (((bArr5[i25] & 1) << 7) | ((bArr5[i18] & 255) >>> 1));
            i18 = i25;
        }
    }

    private byte select(boolean z15, boolean z16, byte b15, byte b16) {
        if (z15 && z16) {
            return (byte) 1;
        }
        if (z15) {
            return (byte) 2;
        }
        return z16 ? b15 : b16;
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
        photonPermutation(this.state);
        Bytes.xorTo(this.BlockSize, bArr, i15, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        rhoohr(bArr2, i16, bArr, i15, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr2, i16, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        rhoohr(bArr2, i16, bArr, i15, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr, i15, this.state);
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
        int len = this.aadOperator.getLen();
        if (len != 0) {
            if (this.m_aadPos != 0) {
                photonPermutation(this.state);
                Bytes.xorTo(this.m_aadPos, this.m_aad, this.state);
                int i15 = this.m_aadPos;
                if (i15 < this.BlockSize) {
                    byte[] bArr = this.state;
                    bArr[i15] = (byte) (bArr[i15] ^ 1);
                }
            }
            byte[] bArr2 = this.state;
            int i16 = this.STATE_INBYTES - 1;
            bArr2[i16] = (byte) ((select(this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE) > 0, len % this.BlockSize == 0, (byte) 3, (byte) 4) << this.LAST_THREE_BITS_OFFSET) ^ bArr2[i16]);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        PhotonBeetleEngine photonBeetleEngine;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        int i16 = this.m_bufPos;
        int len2 = this.aadOperator.getLen();
        if (len2 != 0 || len != 0) {
            this.input_empty = false;
        }
        byte bSelect = select(len2 != 0, len % this.BlockSize == 0, (byte) 5, (byte) 6);
        if (len != 0) {
            if (i16 != 0) {
                photonBeetleEngine = this;
                photonBeetleEngine.rhoohr(bArr, i15, this.m_buf, 0, i16);
                if (photonBeetleEngine.forEncryption) {
                    Bytes.xorTo(i16, photonBeetleEngine.m_buf, photonBeetleEngine.state);
                } else {
                    Bytes.xorTo(i16, bArr, i15, photonBeetleEngine.state);
                }
                if (i16 < photonBeetleEngine.BlockSize) {
                    byte[] bArr2 = photonBeetleEngine.state;
                    bArr2[i16] = (byte) (bArr2[i16] ^ 1);
                }
            } else {
                photonBeetleEngine = this;
            }
            byte[] bArr3 = photonBeetleEngine.state;
            int i17 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr3[i17] = (byte) (bArr3[i17] ^ (bSelect << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        } else {
            photonBeetleEngine = this;
            if (photonBeetleEngine.input_empty) {
                byte[] bArr4 = photonBeetleEngine.state;
                int i18 = photonBeetleEngine.STATE_INBYTES - 1;
                bArr4[i18] = (byte) (bArr4[i18] ^ (1 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
            }
        }
        photonPermutation(photonBeetleEngine.state);
        System.arraycopy(photonBeetleEngine.state, 0, photonBeetleEngine.mac, 0, photonBeetleEngine.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private static void photonPermutation(byte[] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);
        for (int i15 = 0; i15 < 64; i15++) {
            bArr2[i15 >>> 3][i15 & 7] = (byte) (((bArr[i15 >> 1] & 255) >>> ((i15 & 1) * 4)) & 15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            for (int i17 = 0; i17 < 8; i17++) {
                byte[] bArr3 = bArr2[i17];
                bArr3[0] = (byte) (bArr3[0] ^ RC[i17][i16]);
            }
            for (int i18 = 0; i18 < 8; i18++) {
                for (int i19 = 0; i19 < 8; i19++) {
                    byte[] bArr4 = bArr2[i18];
                    bArr4[i19] = sbox[bArr4[i19]];
                }
            }
            for (int i25 = 1; i25 < 8; i25++) {
                System.arraycopy(bArr2[i25], 0, bArr, 0, 8);
                int i26 = 8 - i25;
                System.arraycopy(bArr, i25, bArr2[i25], 0, i26);
                System.arraycopy(bArr, 0, bArr2[i25], i26, i25);
            }
            for (int i27 = 0; i27 < 8; i27++) {
                for (int i28 = 0; i28 < 8; i28++) {
                    int i29 = 0;
                    for (int i35 = 0; i35 < 8; i35++) {
                        byte b15 = MixColMatrix[i28][i35];
                        byte b16 = bArr2[i35][i27];
                        i29 = (((i29 ^ ((b16 & 1) * b15)) ^ ((b16 & 2) * b15)) ^ ((b16 & 4) * b15)) ^ (b15 * (b16 & 8));
                    }
                    int i36 = i29 >>> 4;
                    int i37 = (i36 << 1) ^ ((i29 & 15) ^ i36);
                    int i38 = i37 >>> 4;
                    bArr[i28] = (byte) (((i37 & 15) ^ i38) ^ (i38 << 1));
                }
                for (int i39 = 0; i39 < 8; i39++) {
                    bArr2[i39][i27] = bArr[i39];
                }
            }
        }
        for (int i45 = 0; i45 < 64; i45 += 2) {
            byte[] bArr5 = bArr2[i45 >>> 3];
            bArr[i45 >>> 1] = (byte) (((bArr5[(i45 + 1) & 7] & 15) << 4) | (bArr5[i45 & 7] & 15));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.K = bArr;
        this.N = bArr2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        this.input_empty = true;
        byte[] bArr = this.K;
        System.arraycopy(bArr, 0, this.state, 0, bArr.length);
        byte[] bArr2 = this.N;
        System.arraycopy(bArr2, 0, this.state, this.K.length, bArr2.length);
    }
}
