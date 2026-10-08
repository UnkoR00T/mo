package org.conscrypt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSslMlKemPrivateKey implements PrivateKey {
    static final int PRIVATE_KEY_SIZE_BYTES = 64;
    private static final long serialVersionUID = 1;
    private final MlKemAlgorithm algorithm;
    private byte[] seed;

    /* JADX INFO: renamed from: org.conscrypt.OpenSslMlKemPrivateKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$MlKemAlgorithm;

        static {
            int[] iArr = new int[MlKemAlgorithm.values().length];
            $SwitchMap$org$conscrypt$MlKemAlgorithm = iArr;
            try {
                iArr[MlKemAlgorithm.ML_KEM_768.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$MlKemAlgorithm[MlKemAlgorithm.ML_KEM_1024.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public OpenSslMlKemPrivateKey(byte[] bArr, MlKemAlgorithm mlKemAlgorithm) {
        if (bArr.length != 64) {
            throw new IllegalArgumentException("Invalid key size");
        }
        this.seed = (byte[]) bArr.clone();
        this.algorithm = mlKemAlgorithm;
    }

    private static byte[] getPkcs8Preamble(MlKemAlgorithm mlKemAlgorithm) {
        int i15 = AnonymousClass1.$SwitchMap$org$conscrypt$MlKemAlgorithm[mlKemAlgorithm.ordinal()];
        if (i15 == 1) {
            return OpenSslMlKemKeyFactory.pkcs8PreambleMlKem768;
        }
        if (i15 == 2) {
            return OpenSslMlKemKeyFactory.pkcs8PreambleMlKem1024;
        }
        throw new IllegalArgumentException("Unsupported algorithm: " + mlKemAlgorithm);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.seed;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.seed = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslMlKemPrivateKey) {
            return MessageDigest.isEqual(this.seed, ((OpenSslMlKemPrivateKey) obj).seed);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ML-KEM";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return ArrayUtils.concat(getPkcs8Preamble(this.algorithm), this.seed);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    MlKemAlgorithm getMlKemAlgorithm() {
        return this.algorithm;
    }

    byte[] getSeed() {
        byte[] bArr = this.seed;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(this.seed) ^ this.algorithm.hashCode();
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.seed == null;
    }
}
