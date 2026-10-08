package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.XoodyakDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class XoodyakEngine extends AEADBaseEngine {
    private static final int ModeHash = 1;
    private static final int ModeKeyed = 0;
    private static final int PhaseDown = 1;
    private static final int PhaseUp = 2;
    private static final int[] RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 416, 18};
    private static final int f_bPrime_1 = 47;
    private byte[] K;
    private byte aadcd;
    private boolean encrypted;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149069iv;
    private int mode;
    private int phase;
    private final byte[] state;

    public XoodyakEngine() {
        this.algorithmName = "Xoodyak AEAD";
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.BlockSize = 24;
        this.AADBufferSize = 44;
        this.state = new byte[48];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void AbsorbAny(byte[] bArr, int i15, int i16, int i17) {
        if (this.phase != 2) {
            up(this.mode, this.state, 0);
        }
        int i18 = i15;
        int i19 = i17;
        while (true) {
            int iMin = Math.min(i16, this.AADBufferSize);
            byte[] bArr2 = bArr;
            down(this.mode, this.state, bArr2, i18, iMin, i19);
            this.phase = 1;
            i18 += iMin;
            i16 -= iMin;
            if (i16 == 0) {
                return;
            }
            i19 = 0;
            bArr = bArr2;
        }
    }

    private static void down(int i15, byte[] bArr, byte[] bArr2, int i16, int i17, int i18) {
        Bytes.xorTo(i17, bArr2, i16, bArr);
        bArr[i17] = (byte) (bArr[i17] ^ 1);
        int i19 = bArr[47];
        if (i15 == 1) {
            i18 &= 1;
        }
        bArr[47] = (byte) (i19 ^ i18);
    }

    private static void up(int i15, byte[] bArr, int i16) {
        if (i15 != 1) {
            bArr[47] = (byte) (bArr[47] ^ i16);
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int i17 = 12;
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 28);
        int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 32);
        int i18 = 0;
        int i19 = iLittleEndianToInt8;
        int iRotateLeft = iLittleEndianToInt9;
        int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 36);
        int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 40);
        int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 44);
        while (i18 < i17) {
            int i25 = (iLittleEndianToInt ^ iLittleEndianToInt5) ^ iRotateLeft;
            int i26 = (iLittleEndianToInt2 ^ iLittleEndianToInt6) ^ iLittleEndianToInt10;
            int i27 = i18;
            int i28 = (iLittleEndianToInt3 ^ iLittleEndianToInt7) ^ iLittleEndianToInt11;
            int i29 = iLittleEndianToInt12;
            int i35 = (iLittleEndianToInt4 ^ i19) ^ i29;
            int i36 = iLittleEndianToInt11;
            int iRotateLeft2 = Integers.rotateLeft(i35, 5) ^ Integers.rotateLeft(i35, 14);
            int iRotateLeft3 = Integers.rotateLeft(i25, 5) ^ Integers.rotateLeft(i25, 14);
            int iRotateLeft4 = Integers.rotateLeft(i26, 5) ^ Integers.rotateLeft(i26, 14);
            int iRotateLeft5 = Integers.rotateLeft(i28, 5) ^ Integers.rotateLeft(i28, 14);
            int i37 = iLittleEndianToInt ^ iRotateLeft2;
            int i38 = iLittleEndianToInt5 ^ iRotateLeft2;
            int i39 = iRotateLeft ^ iRotateLeft2;
            int i45 = iLittleEndianToInt2 ^ iRotateLeft3;
            int i46 = iLittleEndianToInt6 ^ iRotateLeft3;
            int i47 = iRotateLeft3 ^ iLittleEndianToInt10;
            int i48 = iLittleEndianToInt3 ^ iRotateLeft4;
            int i49 = iLittleEndianToInt7 ^ iRotateLeft4;
            int i55 = iLittleEndianToInt4 ^ iRotateLeft5;
            int i56 = i19 ^ iRotateLeft5;
            int iRotateLeft6 = Integers.rotateLeft(i39, 11);
            int iRotateLeft7 = Integers.rotateLeft(i47, 11);
            int iRotateLeft8 = Integers.rotateLeft(i36 ^ iRotateLeft4, 11);
            int iRotateLeft9 = Integers.rotateLeft(i29 ^ iRotateLeft5, 11);
            int i57 = i37 ^ RC[i27];
            int i58 = ((~i56) & iRotateLeft6) ^ i57;
            int i59 = ((~i38) & iRotateLeft7) ^ i45;
            int i65 = ((~i46) & iRotateLeft8) ^ i48;
            int i66 = ((~i49) & iRotateLeft9) ^ i55;
            int i67 = ((~iRotateLeft6) & i57) ^ i56;
            int i68 = i38 ^ ((~iRotateLeft7) & i45);
            int i69 = ((~iRotateLeft8) & i48) ^ i46;
            int i75 = ((~iRotateLeft9) & i55) ^ i49;
            int i76 = iRotateLeft6 ^ ((~i57) & i56);
            int i77 = iRotateLeft7 ^ ((~i45) & i38);
            int i78 = iRotateLeft8 ^ ((~i48) & i46);
            int i79 = iRotateLeft9 ^ ((~i55) & i49);
            iLittleEndianToInt5 = Integers.rotateLeft(i67, 1);
            int iRotateLeft10 = Integers.rotateLeft(i68, 1);
            int iRotateLeft11 = Integers.rotateLeft(i69, 1);
            int iRotateLeft12 = Integers.rotateLeft(i75, 1);
            iRotateLeft = Integers.rotateLeft(i78, 8);
            iLittleEndianToInt10 = Integers.rotateLeft(i79, 8);
            iLittleEndianToInt11 = Integers.rotateLeft(i76, 8);
            iLittleEndianToInt12 = Integers.rotateLeft(i77, 8);
            iLittleEndianToInt = i58;
            iLittleEndianToInt6 = iRotateLeft10;
            iLittleEndianToInt3 = i65;
            i17 = 12;
            iLittleEndianToInt7 = iRotateLeft11;
            i18 = i27 + 1;
            iLittleEndianToInt2 = i59;
            i19 = iRotateLeft12;
            iLittleEndianToInt4 = i66;
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr, 0);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr, 4);
        Pack.intToLittleEndian(iLittleEndianToInt3, bArr, 8);
        Pack.intToLittleEndian(iLittleEndianToInt4, bArr, 12);
        Pack.intToLittleEndian(iLittleEndianToInt5, bArr, 16);
        Pack.intToLittleEndian(iLittleEndianToInt6, bArr, 20);
        Pack.intToLittleEndian(iLittleEndianToInt7, bArr, 24);
        Pack.intToLittleEndian(i19, bArr, 28);
        Pack.intToLittleEndian(iRotateLeft, bArr, 32);
        Pack.intToLittleEndian(iLittleEndianToInt10, bArr, 36);
        Pack.intToLittleEndian(iLittleEndianToInt11, bArr, 40);
        Pack.intToLittleEndian(iLittleEndianToInt12, bArr, 44);
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
        AbsorbAny(bArr, i15, this.AADBufferSize, this.aadcd);
        this.aadcd = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i15, bArr2, i16);
        down(this.mode, this.state, bArr2, i16, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i15, bArr2, i16);
        down(this.mode, this.state, bArr, i15, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
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
        AbsorbAny(this.m_aad, 0, this.m_aadPos, this.aadcd);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        if (this.m_bufPos != 0 || !this.encrypted) {
            up(this.mode, this.state, this.encrypted ? 0 : 128);
            Bytes.xor(this.m_bufPos, this.state, this.m_buf, 0, bArr, i15);
            if (this.forEncryption) {
                down(this.mode, this.state, this.m_buf, 0, this.m_bufPos, 0);
            } else {
                down(this.mode, this.state, bArr, i15, this.m_bufPos, 0);
            }
            this.phase = 1;
        }
        up(this.mode, this.state, 64);
        System.arraycopy(this.state, 0, this.mac, 0, this.MAC_SIZE);
        this.phase = 2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void down(XoodyakDigest.Friend friend, int i15, byte[] bArr, byte[] bArr2, int i16, int i17, int i18) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        down(i15, bArr, bArr2, i16, i17, i18);
    }

    public static void up(XoodyakDigest.Friend friend, int i15, byte[] bArr, int i16) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        up(i15, bArr, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        this.K = bArr;
        this.f149069iv = bArr2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        Arrays.fill(this.state, (byte) 0);
        this.encrypted = false;
        this.phase = 2;
        this.aadcd = (byte) 3;
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.f149069iv.length;
        byte[] bArr2 = new byte[this.AADBufferSize];
        this.mode = 0;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.f149069iv, 0, bArr2, length, length2);
        int i15 = length + length2;
        bArr2[i15] = (byte) length2;
        AbsorbAny(bArr2, 0, i15 + 1, 2);
    }
}
