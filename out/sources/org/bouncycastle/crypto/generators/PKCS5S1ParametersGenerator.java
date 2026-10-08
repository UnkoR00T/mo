package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class PKCS5S1ParametersGenerator extends PBEParametersGenerator {
    private Digest digest;

    public PKCS5S1ParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    private byte[] generateDerivedKey() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        Digest digest = this.digest;
        byte[] bArr2 = this.password;
        digest.update(bArr2, 0, bArr2.length);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.salt;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, 0);
        for (int i15 = 1; i15 < this.iterationCount; i15++) {
            this.digest.update(bArr, 0, digestSize);
            this.digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i15) {
        return generateDerivedParameters(i15);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15) {
        int i16 = i15 / 8;
        if (i16 <= this.digest.getDigestSize()) {
            return new KeyParameter(generateDerivedKey(), 0, i16);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i16 + " bytes long.");
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15, int i16) {
        int i17 = i15 / 8;
        int i18 = i16 / 8;
        int i19 = i17 + i18;
        if (i19 <= this.digest.getDigestSize()) {
            byte[] bArrGenerateDerivedKey = generateDerivedKey();
            return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i17), bArrGenerateDerivedKey, i17, i18);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i19 + " bytes long.");
    }
}
