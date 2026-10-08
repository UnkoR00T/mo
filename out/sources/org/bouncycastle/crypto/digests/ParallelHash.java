package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class ParallelHash implements Xof, Digest {
    private static final byte[] N_PARALLEL_HASH = Strings.toByteArray("ParallelHash");
    private final int B;
    private final int bitLength;
    private int bufOff;
    private final byte[] buffer;
    private final CSHAKEDigest compressor;
    private final byte[] compressorBuffer;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private int nCount;
    private final int outputLength;
    private final CryptoServicePurpose purpose;

    public ParallelHash(int i15, byte[] bArr, int i16) {
        this(i15, bArr, i16, i15 * 2, CryptoServicePurpose.ANY);
    }

    private void compress() {
        compress(this.buffer, 0, this.bufOff);
        this.bufOff = 0;
    }

    private void wrapUp(int i15) {
        if (this.bufOff != 0) {
            compress();
        }
        byte[] bArrRightEncode = XofUtils.rightEncode(this.nCount);
        byte[] bArrRightEncode2 = XofUtils.rightEncode(i15 * 8);
        this.cshake.update(bArrRightEncode, 0, bArrRightEncode.length);
        this.cshake.update(bArrRightEncode2, 0, bArrRightEncode2.length);
        this.firstOutput = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int iDoFinal = this.cshake.doFinal(bArr, i15, getDigestSize());
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i15, int i16) {
        if (this.firstOutput) {
            wrapUp(0);
        }
        return this.cshake.doOutput(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "ParallelHash" + this.cshake.getAlgorithmName().substring(6);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.cshake.reset();
        Arrays.clear(this.buffer);
        byte[] bArrLeftEncode = XofUtils.leftEncode(this.B);
        this.cshake.update(bArrLeftEncode, 0, bArrLeftEncode.length);
        this.nCount = 0;
        this.bufOff = 0;
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        byte[] bArr = this.buffer;
        int i15 = this.bufOff;
        int i16 = i15 + 1;
        this.bufOff = i16;
        bArr[i15] = b15;
        if (i16 == bArr.length) {
            compress();
        }
    }

    public ParallelHash(int i15, byte[] bArr, int i16, int i17) {
        this(i15, bArr, i16, i17, CryptoServicePurpose.ANY);
    }

    private void compress(byte[] bArr, int i15, int i16) {
        this.compressor.update(bArr, i15, i16);
        CSHAKEDigest cSHAKEDigest = this.compressor;
        byte[] bArr2 = this.compressorBuffer;
        cSHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        CSHAKEDigest cSHAKEDigest2 = this.cshake;
        byte[] bArr3 = this.compressorBuffer;
        cSHAKEDigest2.update(bArr3, 0, bArr3.length);
        this.nCount++;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i15, int i16) {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int iDoFinal = this.cshake.doFinal(bArr, i15, i16);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        int iMax = Math.max(0, i16);
        if (this.bufOff != 0) {
            while (i17 < iMax) {
                int i18 = this.bufOff;
                byte[] bArr2 = this.buffer;
                if (i18 == bArr2.length) {
                    break;
                }
                this.bufOff = i18 + 1;
                bArr2[i18] = bArr[i17 + i15];
                i17++;
            }
            if (this.bufOff == this.buffer.length) {
                compress();
            }
        }
        if (i17 < iMax) {
            while (true) {
                int i19 = iMax - i17;
                int i25 = this.B;
                if (i19 < i25) {
                    break;
                }
                compress(bArr, i15 + i17, i25);
                i17 += this.B;
            }
        }
        while (i17 < iMax) {
            update(bArr[i17 + i15]);
            i17++;
        }
    }

    public ParallelHash(int i15, byte[] bArr, int i16, int i17, CryptoServicePurpose cryptoServicePurpose) {
        if (i16 <= 0) {
            throw new IllegalArgumentException("block size should be greater than 0");
        }
        this.cshake = new CSHAKEDigest(i15, N_PARALLEL_HASH, bArr);
        this.compressor = new CSHAKEDigest(i15, new byte[0], new byte[0]);
        this.bitLength = i15;
        this.B = i16;
        this.outputLength = (i17 + 7) / 8;
        this.buffer = new byte[i16];
        this.compressorBuffer = new byte[(i15 * 2) / 8];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i15, cryptoServicePurpose));
        reset();
    }

    public ParallelHash(ParallelHash parallelHash) {
        this.cshake = new CSHAKEDigest(parallelHash.cshake);
        this.compressor = new CSHAKEDigest(parallelHash.compressor);
        int i15 = parallelHash.bitLength;
        this.bitLength = i15;
        this.B = parallelHash.B;
        this.outputLength = parallelHash.outputLength;
        this.buffer = Arrays.clone(parallelHash.buffer);
        this.compressorBuffer = Arrays.clone(parallelHash.compressorBuffer);
        CryptoServicePurpose cryptoServicePurpose = parallelHash.purpose;
        this.purpose = cryptoServicePurpose;
        this.firstOutput = parallelHash.firstOutput;
        this.nCount = parallelHash.nCount;
        this.bufOff = parallelHash.bufOff;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i15, cryptoServicePurpose));
    }
}
