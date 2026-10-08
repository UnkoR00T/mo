package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Grain128AEADEngine extends AEADBaseEngine {
    private static final int STATE_SIZE = 4;
    private final int[] authAcc;
    private final int[] authSr;
    private final int[] lfsr;
    private final int[] nfsr;
    private byte[] workingIV;
    private byte[] workingKey;

    public Grain128AEADEngine() {
        this.algorithmName = "Grain-128 AEAD";
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        this.MAC_SIZE = 8;
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.StreamCipher);
    }

    private void absorbAadData(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            byte b15 = bArr[i15 + i17];
            for (int i18 = 0; i18 < 8; i18++) {
                shift();
                updateInternalState((b15 >> i18) & 1);
            }
        }
    }

    private int getByteKeyStream() {
        int output = getOutput();
        shift();
        return output;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i15 = iArr[0];
        int i16 = i15 >>> 12;
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = i18 >>> 9;
        int i25 = i18 >>> 25;
        int i26 = i18 >>> 31;
        int[] iArr2 = this.lfsr;
        int i27 = iArr2[0];
        int i28 = iArr2[1];
        int i29 = iArr2[2];
        int i35 = (i27 >>> 20) & (i27 >>> 13);
        return (((i18 ^ (((((((((i35 ^ ((i27 >>> 8) & i16)) ^ (i26 & (i28 >>> 10))) ^ ((i28 >>> 28) & (i29 >>> 15))) ^ ((i16 & i26) & (i29 >>> 30))) ^ (i29 >>> 29)) ^ (i15 >>> 2)) ^ (i15 >>> 15)) ^ (i17 >>> 4)) ^ (i17 >>> 13))) ^ i19) ^ i25) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i15 = iArr[0];
        int i16 = iArr[1] >>> 6;
        int i17 = iArr[2];
        return (iArr[3] ^ ((((i15 ^ (i15 >>> 7)) ^ i16) ^ (i17 >>> 6)) ^ (i17 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i15 = iArr[0];
        int i16 = i15 >>> 25;
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = ((i15 >>> 26) ^ i15) ^ (i17 >>> 24);
        return (((((((((((iArr[3] ^ (i19 ^ (i18 >>> 27))) ^ ((i15 & i18) >>> 3)) ^ ((i15 >>> 11) & (i15 >>> 13))) ^ ((i15 >>> 17) & (i15 >>> 18))) ^ ((i15 & i17) >>> 27)) ^ ((i17 >>> 8) & (i17 >>> 16))) ^ ((i17 >>> 29) & (i18 >>> 1))) ^ ((i18 >>> 4) & (i18 >>> 20))) ^ (((i15 >>> 22) & (i15 >>> 24)) & i16)) ^ (((i18 >>> 6) & (i18 >>> 14)) & (i18 >>> 18))) ^ ((((i18 >>> 24) & (i18 >>> 28)) & (i18 >>> 29)) & (i18 >>> 31))) & 1;
    }

    private void initGrain(int[] iArr) {
        for (int i15 = 0; i15 < 2; i15++) {
            for (int i16 = 0; i16 < 32; i16++) {
                iArr[i15] = iArr[i15] | (getByteKeyStream() << i16);
            }
        }
    }

    private void shift() {
        shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
        shift(this.lfsr, getOutputLFSR() & 1);
    }

    private void updateInternalState(int i15) {
        int i16 = -i15;
        int[] iArr = this.authAcc;
        int i17 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i17 ^ (iArr2[0] & i16);
        iArr[1] = (i16 & iArr2[1]) ^ iArr[1];
        int byteKeyStream = getByteKeyStream();
        int[] iArr3 = this.authSr;
        int i18 = iArr3[0] >>> 1;
        int i19 = iArr3[1];
        iArr3[0] = i18 | (i19 << 31);
        iArr3[1] = (byteKeyStream << 31) | (i19 >>> 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        finishAAD1(state);
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
    public int getUpdateOutputSize(int i15) {
        return getTotalBytesForUpdate(i15);
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
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int len = this.dataOperator.getLen();
        for (int i17 = 0; i17 < len; i17++) {
            byte b15 = bArr[i15 + i17];
            byte byteKeyStream = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                byteKeyStream = (byte) (byteKeyStream | ((((b15 >> i18) & 1) ^ getByteKeyStream()) << i18));
                updateInternalState((byteKeyStream >> i18) & 1);
            }
            bArr2[i16 + i17] = byteKeyStream;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int len = this.dataOperator.getLen();
        for (int i17 = 0; i17 < len; i17++) {
            byte b15 = bArr[i15 + i17];
            byte byteKeyStream = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = (b15 >> i18) & 1;
                byteKeyStream = (byte) (byteKeyStream | ((getByteKeyStream() ^ i19) << i18));
                updateInternalState(i19);
            }
            bArr2[i16 + i17] = byteKeyStream;
        }
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
        int i15;
        int i16;
        int len = this.aadOperator.getLen();
        byte[] bytes = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
        byte[] bArr = new byte[5];
        if (len < 128) {
            i16 = 4;
            bArr[4] = (byte) len;
        } else {
            int i17 = len;
            int i18 = 5;
            while (true) {
                i15 = i18 - 1;
                bArr[i15] = (byte) i17;
                i17 >>>= 8;
                if (i17 == 0) {
                    break;
                } else {
                    i18 = i15;
                }
            }
            int i19 = i18 - 2;
            bArr[i19] = (byte) ((5 - i15) | 128);
            i16 = i19;
        }
        absorbAadData(bArr, i16, 5 - i16);
        absorbAadData(bytes, 0, len);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        int[] iArr = this.authAcc;
        int i16 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i16 ^ iArr2[0];
        iArr[1] = iArr2[1] ^ iArr[1];
        Pack.intToLittleEndian(iArr, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private void shift(int[] iArr, int i15) {
        int i16 = iArr[0] >>> 1;
        int i17 = iArr[1];
        iArr[0] = i16 | (i17 << 31);
        int i18 = i17 >>> 1;
        int i19 = iArr[2];
        iArr[1] = i18 | (i19 << 31);
        int i25 = iArr[3];
        iArr[2] = (i19 >>> 1) | (i25 << 31);
        iArr[3] = (i15 << 31) | (i25 >>> 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        this.workingIV = bArr3;
        this.workingKey = bArr;
        System.arraycopy(bArr2, 0, bArr3, 0, this.IV_SIZE);
        byte[] bArr4 = this.workingIV;
        bArr4[12] = -1;
        bArr4[13] = -1;
        bArr4[14] = -1;
        bArr4[15] = 127;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        Pack.littleEndianToInt(this.workingKey, 0, this.nfsr);
        Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
        Arrays.clear(this.authAcc);
        Arrays.clear(this.authSr);
        for (int i15 = 0; i15 < 320; i15++) {
            int output = getOutput();
            shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ output) & 1);
            shift(this.lfsr, (output ^ getOutputLFSR()) & 1);
        }
        for (int i16 = 0; i16 < 8; i16++) {
            for (int i17 = 0; i17 < 8; i17++) {
                int output2 = getOutput();
                shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ output2) ^ (this.workingKey[i16] >> i17)) & 1);
                shift(this.lfsr, ((output2 ^ getOutputLFSR()) ^ (this.workingKey[i16 + 8] >> i17)) & 1);
            }
        }
        initGrain(this.authAcc);
        initGrain(this.authSr);
    }
}
