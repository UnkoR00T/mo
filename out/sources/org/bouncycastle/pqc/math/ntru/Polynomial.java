package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    static short bothNegativeMask(short s15, short s16) {
        return (short) ((s15 & s16) >>> 15);
    }

    static byte mod3(byte b15) {
        return (byte) ((b15 & 255) % 3);
    }

    static int modQ(int i15, int i16) {
        return i15 % i16;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i15 = 0; i15 < length; i15++) {
            polynomial3.coeffs[i15] = (short) (-polynomial2.coeffs[i15]);
        }
        for (int i16 = 0; i16 < length; i16++) {
            this.coeffs[i16] = polynomial.coeffs[i16];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int iN = this.params.n();
        for (int i15 = 0; i15 < iN; i15++) {
            short[] sArr = this.coeffs;
            sArr[i15] = mod3((short) (sArr[i15] + (sArr[iN - 1] * 2)));
        }
    }

    public void modQPhiN() {
        int iN = this.params.n();
        for (int i15 = 0; i15 < iN; i15++) {
            short[] sArr = this.coeffs;
            sArr[i15] = (short) (sArr[i15] - sArr[iN - 1]);
        }
    }

    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i15;
        int length = this.coeffs.length;
        int i16 = 0;
        while (i16 < length) {
            this.coeffs[i16] = 0;
            for (int i17 = 1; i17 < length - i16; i17++) {
                short[] sArr = this.coeffs;
                sArr[i16] = (short) (sArr[i16] + (polynomial.coeffs[i16 + i17] * polynomial2.coeffs[length - i17]));
            }
            int i18 = 0;
            while (true) {
                i15 = i16 + 1;
                if (i18 < i15) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i16] = (short) (sArr2[i16] + (polynomial.coeffs[i16 - i18] * polynomial2.coeffs[i18]));
                    i18++;
                }
            }
            i16 = i15;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i15 = length - 1;
        this.coeffs[i15] = 0;
        for (int i16 = 0; i16 < this.params.packDegree(); i16++) {
            short[] sArr = this.coeffs;
            sArr[i15] = (short) (sArr[i15] - sArr[i16]);
        }
    }

    public byte[] rqSumZeroToBytes(int i15) {
        return sqToBytes(i15);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i15 = 0; i15 < length; i15++) {
            this.coeffs[i15] = (short) modQ(polynomial.coeffs[i15] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sLogQ = (short) (this.coeffs[i15] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i15] = (short) (sArr[i15] + (sLogQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i15 = 0; i15 < this.params.packDegree() / 5; i15++) {
            byte b15 = bArr[i15];
            short[] sArr = this.coeffs;
            int i16 = i15 * 5;
            sArr[i16] = b15;
            int i17 = b15 & 255;
            sArr[i16 + 1] = (short) ((i17 * 171) >>> 9);
            sArr[i16 + 2] = (short) ((i17 * 57) >>> 9);
            sArr[i16 + 3] = (short) ((i17 * 19) >>> 9);
            sArr[i16 + 4] = (short) ((i17 * 203) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            byte b16 = bArr[iPackDegree];
            int i18 = 0;
            while (true) {
                int i19 = (iPackDegree * 5) + i18;
                if (i19 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i19] = b16;
                b16 = (byte) (((b16 & 255) * 171) >> 9);
                i18++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public void s3ToBytes(byte[] bArr, int i15) {
        int iPackDegree = this.params.packDegree();
        int i16 = iPackDegree - 5;
        int i17 = 0;
        while (i17 <= i16) {
            short[] sArr = this.coeffs;
            int i18 = sArr[i17] & 255;
            int i19 = (sArr[i17 + 1] & 255) * 3;
            int i25 = (sArr[i17 + 2] & 255) * 9;
            bArr[i15] = (byte) (i18 + i19 + i25 + ((sArr[i17 + 3] & 255) * 27) + ((sArr[i17 + 4] & 255) * 81));
            i17 += 5;
            i15++;
        }
        if (i17 >= iPackDegree) {
            return;
        }
        int i26 = iPackDegree - 1;
        int i27 = this.coeffs[i26] & 255;
        while (true) {
            i26--;
            if (i26 < i17) {
                bArr[i15] = (byte) i27;
                return;
            }
            i27 = (i27 * 3) + (this.coeffs[i26] & 255);
        }
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i15);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i15 = 0; i15 < length; i15++) {
            short[] sArr = this.coeffs;
            sArr[i15] = (short) modQ(sArr[i15] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short[] sArr2 = this.coeffs;
            short s15 = sArr2[i15];
            sArr2[i15] = (short) ((s15 ^ (s15 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i15 = 0; i15 < length; i15++) {
            short[] sArr = this.coeffs;
            short s15 = sArr[i15];
            sArr[i15] = (short) (s15 | ((-(s15 >>> 1)) & (this.params.q() - 1)));
        }
    }

    static short mod3(short s15) {
        return (short) ((s15 & HPKE.aead_EXPORT_ONLY) % 3);
    }

    void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i15;
        int length = this.coeffs.length;
        short s15 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i16 = 0; i16 < length; i16++) {
            polynomial2.coeffs[i16] = 1;
        }
        int i17 = 0;
        while (true) {
            i15 = length - 1;
            if (i17 >= i15) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i17] = (short) ((sArr[i15] ^ sArr[i17]) & 1);
            i17++;
        }
        polynomial3.coeffs[i15] = 0;
        int i18 = 0;
        short s16 = 1;
        for (short s17 = 1; i18 < (i15 * 2) - s17; s17 = 1) {
            for (int i19 = i15; i19 > 0; i19--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i19] = sArr2[i19 - 1];
            }
            polynomial4.coeffs[s15] = s15;
            short s18 = polynomial3.coeffs[s15];
            short s19 = (short) (polynomial2.coeffs[s15] & s18);
            int i25 = -s16;
            short sBothNegativeMask = bothNegativeMask((short) i25, (short) (-s18));
            s16 = (short) (((short) (s16 ^ ((i25 ^ s16) & sBothNegativeMask))) + s17);
            int i26 = s15;
            short s25 = s15;
            while (i26 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s26 = sArr3[i26];
                short s27 = s25;
                short[] sArr4 = polynomial3.coeffs;
                short s28 = (short) (sBothNegativeMask & (s26 ^ sArr4[i26]));
                sArr3[i26] = (short) (s26 ^ s28);
                sArr4[i26] = (short) (s28 ^ sArr4[i26]);
                short[] sArr5 = polynomial4.coeffs;
                short s29 = sArr5[i26];
                short[] sArr6 = polynomial5.coeffs;
                short s35 = (short) ((sArr6[i26] ^ s29) & sBothNegativeMask);
                sArr5[i26] = (short) (s29 ^ s35);
                sArr6[i26] = (short) (sArr6[i26] ^ s35);
                i26++;
                s25 = s27 == true ? 1 : 0;
            }
            short s36 = s25;
            for (int i27 = s25; i27 < length; i27++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i27] = (short) (sArr7[i27] ^ (polynomial2.coeffs[i27] & s19));
            }
            for (int i28 = s36; i28 < length; i28++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i28] = (short) (sArr8[i28] ^ (polynomial4.coeffs[i28] & s19));
            }
            int i29 = s36;
            while (i29 < i15) {
                short[] sArr9 = polynomial3.coeffs;
                int i35 = i29 + 1;
                sArr9[i29] = sArr9[i35];
                i29 = i35;
            }
            polynomial3.coeffs[i15] = s36;
            i18++;
            s15 = s36;
        }
        short s37 = s15;
        for (int i36 = s37; i36 < i15; i36++) {
            this.coeffs[i36] = polynomial4.coeffs[(length - 2) - i36];
        }
        this.coeffs[i15] = s37;
    }

    void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i15;
        int length = this.coeffs.length;
        short s15 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i16 = 0; i16 < length; i16++) {
            polynomial2.coeffs[i16] = 1;
        }
        int i17 = 0;
        while (true) {
            i15 = length - 1;
            if (i17 >= i15) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i17] = mod3((short) ((sArr[i17] & 3) + ((sArr[i15] & 3) * 2)));
            i17++;
        }
        polynomial3.coeffs[i15] = 0;
        int i18 = 0;
        short s16 = 1;
        for (short s17 = 1; i18 < (i15 * 2) - s17; s17 = 1) {
            for (int i19 = i15; i19 > 0; i19--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i19] = sArr2[i19 - 1];
            }
            polynomial4.coeffs[s15] = s15;
            short sMod3 = mod3((byte) (polynomial3.coeffs[s15] * 2 * polynomial2.coeffs[s15]));
            int i25 = -s16;
            short sBothNegativeMask = bothNegativeMask((short) i25, (short) (-polynomial3.coeffs[s15]));
            s16 = (short) (((short) (s16 ^ ((i25 ^ s16) & sBothNegativeMask))) + s17);
            int i26 = s15;
            short s18 = s15;
            while (i26 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s19 = sArr3[i26];
                short s25 = s18;
                short[] sArr4 = polynomial3.coeffs;
                short s26 = (short) (sBothNegativeMask & (s19 ^ sArr4[i26]));
                sArr3[i26] = (short) (s19 ^ s26);
                sArr4[i26] = (short) (s26 ^ sArr4[i26]);
                short[] sArr5 = polynomial4.coeffs;
                short s27 = sArr5[i26];
                short[] sArr6 = polynomial5.coeffs;
                short s28 = (short) ((sArr6[i26] ^ s27) & sBothNegativeMask);
                sArr5[i26] = (short) (s27 ^ s28);
                sArr6[i26] = (short) (sArr6[i26] ^ s28);
                i26++;
                s18 = s25 == true ? 1 : 0;
            }
            short s29 = s18;
            for (int i27 = s18; i27 < length; i27++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i27] = mod3((byte) (sArr7[i27] + (polynomial2.coeffs[i27] * sMod3)));
            }
            for (int i28 = s29; i28 < length; i28++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i28] = mod3((byte) (sArr8[i28] + (polynomial4.coeffs[i28] * sMod3)));
            }
            int i29 = s29;
            while (i29 < i15) {
                short[] sArr9 = polynomial3.coeffs;
                int i35 = i29 + 1;
                sArr9[i29] = sArr9[i35];
                i29 = i35;
            }
            polynomial3.coeffs[i15] = s29;
            i18++;
            s15 = s29;
        }
        short s35 = s15;
        short s36 = polynomial2.coeffs[s35];
        for (int i36 = s35; i36 < i15; i36++) {
            this.coeffs[i36] = mod3((byte) (polynomial4.coeffs[(length - 2) - i36] * s36));
        }
        this.coeffs[i15] = s35;
    }

    public byte[] s3ToBytes(int i15) {
        byte[] bArr = new byte[i15];
        s3ToBytes(bArr, 0);
        return bArr;
    }
}
