package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class NTRUOWCPA {
    private final NTRUParameterSet params;
    private final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (GF2Field.MASK << (8 - ((this.params.logQ() * this.params.packDegree()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s15 = 0;
        short s16 = 0;
        for (int i15 = 0; i15 < this.params.n() - 1; i15++) {
            short s17 = hPSPolynomial.coeffs[i15];
            s15 = (short) (s15 + (s17 & 1));
            s16 = (short) (s16 + (s17 & 2));
        }
        return (((~(((s16 >>> 1) ^ s15) | (((NTRUHPSParameterSet) this.params).weight() ^ s16))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int iQ = 0;
        for (int i15 = 0; i15 < this.params.n() - 1; i15++) {
            short s15 = polynomial.coeffs[i15];
            iQ = iQ | ((s15 + 1) & (this.params.q() - 4)) | ((s15 + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.n() - 1] | iQ)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.params.owcpaMsgBytes()];
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial4 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.s3FromBytes(bArr2);
        polynomialCreatePolynomial2.z3ToZq();
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial, polynomialCreatePolynomial2);
        polynomialCreatePolynomial2.rqToS3(polynomialCreatePolynomial3);
        polynomialCreatePolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        polynomialCreatePolynomial4.s3Mul(polynomialCreatePolynomial2, polynomialCreatePolynomial3);
        polynomialCreatePolynomial4.s3ToBytes(bArr3, this.params.packTrinaryBytes());
        int iCheckCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            iCheckCiphertext |= checkM((HPSPolynomial) polynomialCreatePolynomial4);
        }
        polynomialCreatePolynomial2.lift(polynomialCreatePolynomial4);
        for (int i15 = 0; i15 < this.params.n(); i15++) {
            short[] sArr = polynomialCreatePolynomial.coeffs;
            sArr[i15] = (short) (sArr[i15] - polynomialCreatePolynomial2.coeffs[i15]);
        }
        polynomialCreatePolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        polynomialCreatePolynomial4.sqMul(polynomialCreatePolynomial, polynomialCreatePolynomial3);
        int iCheckR = iCheckCiphertext | checkR(polynomialCreatePolynomial4);
        polynomialCreatePolynomial4.trinaryZqToZ3();
        polynomialCreatePolynomial4.s3ToBytes(bArr3, 0);
        return new OWCPADecryptResult(bArr3, iCheckR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.rqMul(polynomial, polynomialCreatePolynomial);
        polynomialCreatePolynomial.lift(polynomial2);
        for (int i15 = 0; i15 < this.params.n(); i15++) {
            short[] sArr = polynomialCreatePolynomial2.coeffs;
            sArr[i15] = (short) (sArr[i15] + polynomialCreatePolynomial.coeffs[i15]);
        }
        return polynomialCreatePolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int iOwcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[iOwcpaSecretKeyBytes];
        int iN = this.params.n();
        this.params.q();
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        PolynomialPair polynomialPairSampleFg = this.sampling.sampleFg(bArr);
        Polynomial polynomialF = polynomialPairSampleFg.f();
        Polynomial polynomialG = polynomialPairSampleFg.g();
        polynomialCreatePolynomial.s3Inv(polynomialF);
        polynomialF.s3ToBytes(bArr2, 0);
        polynomialCreatePolynomial.s3ToBytes(bArr2, this.params.packTrinaryBytes());
        polynomialF.z3ToZq();
        polynomialG.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            for (int i15 = iN - 1; i15 > 0; i15--) {
                short[] sArr = polynomialG.coeffs;
                sArr[i15] = (short) ((sArr[i15 - 1] - sArr[i15]) * 3);
            }
            short[] sArr2 = polynomialG.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i16 = 0; i16 < iN; i16++) {
                short[] sArr3 = polynomialG.coeffs;
                sArr3[i16] = (short) (sArr3[i16] * 3);
            }
        }
        polynomialCreatePolynomial.rqMul(polynomialG, polynomialF);
        polynomialCreatePolynomial2.rqInv(polynomialCreatePolynomial);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialF);
        polynomialCreatePolynomial.sqMul(polynomialCreatePolynomial3, polynomialF);
        byte[] bArrSqToBytes = polynomialCreatePolynomial.sqToBytes(iOwcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(bArrSqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, bArrSqToBytes.length);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialG);
        polynomialCreatePolynomial.rqMul(polynomialCreatePolynomial3, polynomialG);
        return new OWCPAKeyPair(polynomialCreatePolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
