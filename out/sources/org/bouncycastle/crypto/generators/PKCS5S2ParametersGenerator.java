package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* JADX INFO: loaded from: classes5.dex */
public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {
    private Mac hMac;
    private byte[] state;

    public PKCS5S2ParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private void F(byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, int i16) {
        if (i15 == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.hMac.update(bArr, 0, bArr.length);
        }
        this.hMac.update(bArr2, 0, bArr2.length);
        this.hMac.doFinal(this.state, 0);
        byte[] bArr4 = this.state;
        System.arraycopy(bArr4, 0, bArr3, i16, bArr4.length);
        for (int i17 = 1; i17 < i15; i17++) {
            Mac mac = this.hMac;
            byte[] bArr5 = this.state;
            mac.update(bArr5, 0, bArr5.length);
            this.hMac.doFinal(this.state, 0);
            int i18 = 0;
            while (true) {
                byte[] bArr6 = this.state;
                if (i18 != bArr6.length) {
                    int i19 = i16 + i18;
                    bArr3[i19] = (byte) (bArr6[i18] ^ bArr3[i19]);
                    i18++;
                }
            }
        }
    }

    private byte[] generateDerivedKey(int i15) {
        int i16;
        int macSize = this.hMac.getMacSize();
        int i17 = ((i15 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i17 * macSize];
        this.hMac.init(new KeyParameter(this.password));
        int i18 = 0;
        for (int i19 = 1; i19 <= i17; i19++) {
            while (true) {
                byte b15 = (byte) (bArr[i16] + 1);
                bArr[i16] = b15;
                i16 = b15 == 0 ? i16 - 1 : 3;
            }
            F(this.salt, this.iterationCount, bArr, bArr2, i18);
            i18 += macSize;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i15) {
        return generateDerivedParameters(i15);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15) {
        int i16 = i15 / 8;
        return new KeyParameter(generateDerivedKey(i16), 0, i16);
    }

    public PKCS5S2ParametersGenerator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        this.state = new byte[hMac.getMacSize()];
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15, int i16) {
        int i17 = i15 / 8;
        int i18 = i16 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(i17 + i18);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i17), bArrGenerateDerivedKey, i17, i18);
    }
}
