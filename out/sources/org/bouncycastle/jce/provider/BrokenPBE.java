package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* JADX INFO: loaded from: classes5.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        private static PBEParametersGenerator makePBEGenerator(int i15, int i16) {
            if (i15 == 0) {
                if (i16 == 0) {
                    return new PKCS5S1ParametersGenerator(new MD5Digest());
                }
                if (i16 == 1) {
                    return new PKCS5S1ParametersGenerator(new SHA1Digest());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
            }
            if (i15 == 1) {
                return new PKCS5S2ParametersGenerator();
            }
            if (i15 == 3) {
                if (i16 == 0) {
                    return new OldPKCS12ParametersGenerator(new MD5Digest());
                }
                if (i16 == 1) {
                    return new OldPKCS12ParametersGenerator(new SHA1Digest());
                }
                if (i16 == 2) {
                    return new OldPKCS12ParametersGenerator(new RIPEMD160Digest());
                }
                throw new IllegalStateException("unknown digest scheme for PBE encryption.");
            }
            if (i16 == 0) {
                return new PKCS12ParametersGenerator(new MD5Digest());
            }
            if (i16 == 1) {
                return new PKCS12ParametersGenerator(new SHA1Digest());
            }
            if (i16 == 2) {
                return new PKCS12ParametersGenerator(new RIPEMD160Digest());
            }
            throw new IllegalStateException("unknown digest scheme for PBE encryption.");
        }

        static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i15, int i16, int i17) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i15, i16);
            byte[] encoded = bCPBEKey.getEncoded();
            pBEParametersGeneratorMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedMacParameters = pBEParametersGeneratorMakePBEGenerator.generateDerivedMacParameters(i17);
            for (int i18 = 0; i18 != encoded.length; i18++) {
                encoded[i18] = 0;
            }
            return cipherParametersGenerateDerivedMacParameters;
        }

        static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i15, int i16, String str, int i17, int i18) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorMakePBEGenerator = makePBEGenerator(i15, i16);
            byte[] encoded = bCPBEKey.getEncoded();
            pBEParametersGeneratorMakePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = i18 != 0 ? pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i17, i18) : pBEParametersGeneratorMakePBEGenerator.generateDerivedParameters(i17);
            if (str.startsWith("DES")) {
                if (cipherParametersGenerateDerivedParameters instanceof ParametersWithIV) {
                    setOddParity(((KeyParameter) ((ParametersWithIV) cipherParametersGenerateDerivedParameters).getParameters()).getKey());
                } else {
                    setOddParity(((KeyParameter) cipherParametersGenerateDerivedParameters).getKey());
                }
            }
            for (int i19 = 0; i19 != encoded.length; i19++) {
                encoded[i19] = 0;
            }
            return cipherParametersGenerateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i15 = 0; i15 < bArr.length; i15++) {
                byte b15 = bArr[i15];
                bArr[i15] = (byte) ((((b15 >> 7) ^ ((((((b15 >> 1) ^ (b15 >> 2)) ^ (b15 >> 3)) ^ (b15 >> 4)) ^ (b15 >> 5)) ^ (b15 >> 6))) ^ 1) | (b15 & 254));
            }
        }
    }
}
