package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class AsconAEAD128 extends AsconBaseEngine {
    public AsconAEAD128() {
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.ASCON_IV = 17594342703105L;
        this.algorithmName = "Ascon-AEAD128";
        this.f149014nr = 8;
        this.dsep = Long.MIN_VALUE;
        this.macSizeLowerBound = 4;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.DataLimit, AEADBaseEngine.DataOperatorType.DataLimit);
        this.dataLimitCounter.init(54);
        this.decryptionFailureCounter = new AEADBaseEngine.DecryptionFailureCounter();
    }

    private void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
        asconPermutation.f149018x2 ^= this.K0;
        asconPermutation.f149019x3 ^= this.K1;
        asconPermutation.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f149015p;
        asconPermutation2.f149019x3 ^= this.K0;
        asconPermutation2.f149020x4 ^= this.K1;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void ascon_aeadinit() {
        this.f149015p.set(this.ASCON_IV, this.K0, this.K1, this.N0, this.N1);
        this.f149015p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
        asconPermutation.f149019x3 ^= this.K0;
        asconPermutation.f149020x4 ^= this.K1;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.3";
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

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected long loadBytes(byte[] bArr, int i15) {
        return Pack.littleEndianToLong(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected long pad(int i15) {
        return 1 << (i15 << 3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b15) {
        super.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i15, int i16) {
        super.processAADBytes(bArr, i15, i16);
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
        if (this.m_aadPos == this.BlockSize) {
            this.f149015p.f149016x0 ^= loadBytes(this.m_aad, 0);
            this.f149015p.f149017x1 ^= loadBytes(this.m_aad, 8);
            this.m_aadPos -= this.BlockSize;
            this.f149015p.p(this.f149014nr);
        }
        Arrays.fill(this.m_aad, this.m_aadPos, this.AADBufferSize, (byte) 0);
        if (this.m_aadPos < 8) {
            this.f149015p.f149016x0 ^= Pack.littleEndianToLong(this.m_aad, 0) ^ pad(this.m_aadPos);
            return;
        }
        this.f149015p.f149016x0 ^= Pack.littleEndianToLong(this.m_aad, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
        asconPermutation.f149017x1 = (Pack.littleEndianToLong(this.m_aad, 8) ^ pad(this.m_aadPos)) ^ asconPermutation.f149017x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void processFinalDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (i15 >= 8) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, 0);
            int i17 = i15 - 8;
            long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, 8, i17);
            Pack.longToLittleEndian(this.f149015p.f149016x0 ^ jLittleEndianToLong, bArr2, i16);
            Pack.longToLittleEndian(this.f149015p.f149017x1 ^ jLittleEndianToLong2, bArr2, i16 + 8, i17);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
            asconPermutation.f149016x0 = jLittleEndianToLong;
            long j15 = (asconPermutation.f149017x1 & (-(1 << (i17 << 3)))) | jLittleEndianToLong2;
            asconPermutation.f149017x1 = j15;
            asconPermutation.f149017x1 = j15 ^ pad(i17);
        } else {
            if (i15 != 0) {
                long jLittleEndianToLong3 = Pack.littleEndianToLong(bArr, 0, i15);
                Pack.longToLittleEndian(this.f149015p.f149016x0 ^ jLittleEndianToLong3, bArr2, i16, i15);
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f149015p;
                asconPermutation2.f149016x0 = (asconPermutation2.f149016x0 & (-(1 << (i15 << 3)))) | jLittleEndianToLong3;
            }
            this.f149015p.f149016x0 ^= pad(i15);
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void processFinalEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (i15 >= 8) {
            this.f149015p.f149016x0 ^= Pack.littleEndianToLong(bArr, 0);
            int i17 = i15 - 8;
            this.f149015p.f149017x1 ^= Pack.littleEndianToLong(bArr, 8, i17);
            Pack.longToLittleEndian(this.f149015p.f149016x0, bArr2, i16);
            Pack.longToLittleEndian(this.f149015p.f149017x1, bArr2, i16 + 8);
            this.f149015p.f149017x1 ^= pad(i17);
        } else {
            if (i15 != 0) {
                this.f149015p.f149016x0 ^= Pack.littleEndianToLong(bArr, 0, i15);
                Pack.longToLittleEndian(this.f149015p.f149016x0, bArr2, i16, i15);
            }
            this.f149015p.f149016x0 ^= pad(i15);
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void setBytes(long j15, byte[] bArr, int i15) {
        Pack.longToLittleEndian(j15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        int i15 = (this.MAC_SIZE << 3) - 32;
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, 0);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, 8);
        this.decryptionFailureCounter.init(i15);
        if (this.K0 != jLittleEndianToLong || this.K1 != jLittleEndianToLong2) {
            this.dataLimitCounter.reset();
            this.decryptionFailureCounter.reset();
            this.K0 = jLittleEndianToLong;
            this.K1 = jLittleEndianToLong2;
        }
        this.N0 = Pack.littleEndianToLong(bArr2, 0);
        this.N1 = Pack.littleEndianToLong(bArr2, 8);
    }
}
