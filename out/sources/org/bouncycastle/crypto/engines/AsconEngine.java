package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class AsconEngine extends AsconBaseEngine {
    private long K2;
    private final AsconParameters asconParameters;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.AsconEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters = iArr;
            try {
                iArr[AsconParameters.ascon80pq.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
    }

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[asconParameters.ordinal()];
        if (i15 == 1) {
            this.KEY_SIZE = 20;
            this.BlockSize = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (i15 == 2) {
            this.KEY_SIZE = 16;
            this.BlockSize = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (i15 != 3) {
                throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
            }
            this.KEY_SIZE = 16;
            this.BlockSize = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i16 = this.BlockSize;
        this.f149014nr = i16 == 8 ? 6 : 8;
        this.AADBufferSize = i16;
        this.dsep = 1L;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void ascon_aeadinit() {
        this.f149015p.set(this.ASCON_IV, this.K1, this.K2, this.N0, this.N1);
        if (this.KEY_SIZE == 20) {
            this.f149015p.f149016x0 ^= this.K0;
        }
        this.f149015p.p(12);
        if (this.KEY_SIZE == 20) {
            this.f149015p.f149018x2 ^= this.K0;
        }
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
        asconPermutation.f149019x3 ^= this.K1;
        asconPermutation.f149020x4 ^= this.K2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    protected void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation;
        long j15;
        long j16;
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[this.asconParameters.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                asconPermutation = this.f149015p;
                asconPermutation.f149018x2 ^= this.K1;
                j15 = asconPermutation.f149019x3;
                j16 = this.K2;
            } else {
                if (i15 != 3) {
                    throw new IllegalStateException();
                }
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f149015p;
                asconPermutation2.f149017x1 ^= this.K1;
                asconPermutation2.f149018x2 ^= this.K2;
            }
            this.f149015p.p(12);
            AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f149015p;
            asconPermutation3.f149019x3 ^= this.K1;
            asconPermutation3.f149020x4 ^= this.K2;
            this.m_state = state;
        }
        asconPermutation = this.f149015p;
        long j17 = asconPermutation.f149017x1;
        long j18 = this.K0 << 32;
        long j19 = this.K1;
        asconPermutation.f149017x1 = j17 ^ (j18 | (j19 >> 32));
        long j25 = asconPermutation.f149018x2;
        long j26 = j19 << 32;
        long j27 = this.K2;
        asconPermutation.f149018x2 = j25 ^ (j26 | (j27 >> 32));
        j15 = asconPermutation.f149019x3;
        j16 = j27 << 32;
        asconPermutation.f149019x3 = j15 ^ j16;
        this.f149015p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation4 = this.f149015p;
        asconPermutation4.f149019x3 ^= this.K1;
        asconPermutation4.f149020x4 ^= this.K2;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.2";
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
        return Pack.bigEndianToLong(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected long pad(int i15) {
        return 128 << (56 - (i15 << 3));
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
        byte[] bArr = this.m_aad;
        int i15 = this.m_aadPos;
        bArr[i15] = -128;
        if (i15 < 8) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
            asconPermutation.f149016x0 = (((-1) << (56 - (this.m_aadPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ asconPermutation.f149016x0;
            return;
        }
        this.f149015p.f149016x0 ^= Pack.bigEndianToLong(bArr, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f149015p;
        asconPermutation2.f149017x1 = (((-1) << (56 - ((this.m_aadPos - 8) << 3))) & Pack.bigEndianToLong(this.m_aad, 8)) ^ asconPermutation2.f149017x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void processFinalDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (i15 >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
            long j15 = asconPermutation.f149016x0 ^ jBigEndianToLong;
            asconPermutation.f149016x0 = j15;
            Pack.longToBigEndian(j15, bArr2, i16);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f149015p;
            asconPermutation2.f149016x0 = jBigEndianToLong;
            int i17 = i16 + 8;
            int i18 = i15 - 8;
            asconPermutation2.f149017x1 ^= pad(i18);
            if (i18 != 0) {
                long jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, 8, i18);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f149015p;
                long j16 = asconPermutation3.f149017x1 ^ jLittleEndianToLong_High;
                asconPermutation3.f149017x1 = j16;
                Pack.longToLittleEndian_High(j16, bArr2, i17, i18);
                AsconPermutationFriend.AsconPermutation asconPermutation4 = this.f149015p;
                asconPermutation4.f149017x1 = (asconPermutation4.f149017x1 & ((-1) >>> (i18 << 3))) ^ jLittleEndianToLong_High;
            }
        } else {
            this.f149015p.f149016x0 ^= pad(i15);
            if (i15 != 0) {
                long jLittleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, 0, i15);
                AsconPermutationFriend.AsconPermutation asconPermutation5 = this.f149015p;
                long j17 = asconPermutation5.f149016x0 ^ jLittleEndianToLong_High2;
                asconPermutation5.f149016x0 = j17;
                Pack.longToLittleEndian_High(j17, bArr2, i16, i15);
                AsconPermutationFriend.AsconPermutation asconPermutation6 = this.f149015p;
                asconPermutation6.f149016x0 = (asconPermutation6.f149016x0 & ((-1) >>> (i15 << 3))) ^ jLittleEndianToLong_High2;
            }
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void processFinalEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long j15;
        if (i15 >= 8) {
            this.f149015p.f149016x0 ^= Pack.bigEndianToLong(bArr, 0);
            Pack.longToBigEndian(this.f149015p.f149016x0, bArr2, i16);
            i16 += 8;
            i15 -= 8;
            this.f149015p.f149017x1 ^= pad(i15);
            if (i15 != 0) {
                this.f149015p.f149017x1 ^= Pack.littleEndianToLong_High(bArr, 8, i15);
                j15 = this.f149015p.f149017x1;
                Pack.longToLittleEndian_High(j15, bArr2, i16, i15);
            }
        } else {
            this.f149015p.f149016x0 ^= pad(i15);
            if (i15 != 0) {
                this.f149015p.f149016x0 ^= Pack.littleEndianToLong_High(bArr, 0, i15);
                j15 = this.f149015p.f149016x0;
                Pack.longToLittleEndian_High(j15, bArr2, i16, i15);
            }
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    protected void setBytes(long j15, byte[] bArr, int i15) {
        Pack.longToBigEndian(j15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        long jBigEndianToLong;
        this.N0 = Pack.bigEndianToLong(bArr2, 0);
        this.N1 = Pack.bigEndianToLong(bArr2, 8);
        int i15 = this.KEY_SIZE;
        if (i15 == 16) {
            this.K1 = Pack.bigEndianToLong(bArr, 0);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 8);
        } else {
            if (i15 != 20) {
                throw new IllegalStateException();
            }
            this.K0 = Pack.bigEndianToInt(bArr, 0);
            this.K1 = Pack.bigEndianToLong(bArr, 4);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 12);
        }
        this.K2 = jBigEndianToLong;
    }
}
