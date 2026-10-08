package org.conscrypt;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;

/* JADX INFO: loaded from: classes5.dex */
public class ScryptSecretKeyFactory extends SecretKeyFactorySpi {

    private static class NotImplementedException extends RuntimeException {
        private static final long serialVersionUID = -7755435858585859108L;

        NotImplementedException() {
            super("Not implemented");
        }
    }

    private static class ScryptKey implements SecretKey {
        private static final long serialVersionUID = 2024924811854189128L;
        private final byte[] key;

        public ScryptKey(byte[] bArr) {
            this.key = bArr;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return "SCRYPT";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.key;
        }

        @Override // java.security.Key
        public String getFormat() {
            return "RAW";
        }
    }

    private Object getValue(KeySpec keySpec, String str) {
        return keySpec.getClass().getMethod(str, null).invoke(keySpec, null);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        char[] password;
        byte[] salt;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (keySpec instanceof ScryptKeySpec) {
            ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
            password = scryptKeySpec.getPassword();
            salt = scryptKeySpec.getSalt();
            iIntValue = scryptKeySpec.getCostParameter();
            iIntValue2 = scryptKeySpec.getBlockSize();
            iIntValue3 = scryptKeySpec.getParallelizationParameter();
            iIntValue4 = scryptKeySpec.getKeyLength();
        } else {
            try {
                password = (char[]) getValue(keySpec, "getPassword");
                salt = (byte[]) getValue(keySpec, "getSalt");
                iIntValue = ((Integer) getValue(keySpec, "getCostParameter")).intValue();
                iIntValue2 = ((Integer) getValue(keySpec, "getBlockSize")).intValue();
                iIntValue3 = ((Integer) getValue(keySpec, "getParallelizationParameter")).intValue();
                iIntValue4 = ((Integer) getValue(keySpec, "getKeyLength")).intValue();
            } catch (Exception e15) {
                throw new InvalidKeySpecException("Not a valid scrypt KeySpec", e15);
            }
        }
        int i15 = iIntValue3;
        int i16 = iIntValue2;
        int i17 = iIntValue;
        byte[] bArr = salt;
        if (iIntValue4 % 8 == 0) {
            return new ScryptKey(NativeCrypto.Scrypt_generate_key(new String(password).getBytes(StandardCharsets.UTF_8), bArr, i17, i16, i15, iIntValue4 / 8));
        }
        throw new InvalidKeySpecException("Cannot produce fractional-byte outputs");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (secretKey == null) {
            throw new InvalidKeySpecException("Null KeySpec");
        }
        throw new NotImplementedException();
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("Null SecretKey");
        }
        throw new NotImplementedException();
    }
}
