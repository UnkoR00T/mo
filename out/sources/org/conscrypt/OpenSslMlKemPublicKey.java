package org.conscrypt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSslMlKemPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private final MlKemAlgorithm algorithm;
    private final byte[] raw;

    /* JADX INFO: renamed from: org.conscrypt.OpenSslMlKemPublicKey$1, reason: invalid class name */
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

    public OpenSslMlKemPublicKey(byte[] bArr, MlKemAlgorithm mlKemAlgorithm) {
        if (!mlKemAlgorithm.equals(MlKemAlgorithm.ML_KEM_768) && !mlKemAlgorithm.equals(MlKemAlgorithm.ML_KEM_1024)) {
            throw new IllegalArgumentException("Unsupported algorithm");
        }
        if (bArr.length == mlKemAlgorithm.publicKeySize()) {
            this.raw = (byte[]) bArr.clone();
            this.algorithm = mlKemAlgorithm;
        } else {
            throw new IllegalArgumentException("Invalid raw key of length " + bArr.length);
        }
    }

    private static byte[] getX509Preamble(MlKemAlgorithm mlKemAlgorithm) {
        int i15 = AnonymousClass1.$SwitchMap$org$conscrypt$MlKemAlgorithm[mlKemAlgorithm.ordinal()];
        if (i15 == 1) {
            return OpenSslMlKemKeyFactory.x509PreambleMlKem768;
        }
        if (i15 == 2) {
            return OpenSslMlKemKeyFactory.x509PreambleMlKem1024;
        }
        throw new IllegalArgumentException("Unsupported algorithm: " + mlKemAlgorithm);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    public boolean equals(Object obj) {
        byte[] bArr = this.raw;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslMlKemPublicKey) {
            return Arrays.equals(bArr, ((OpenSslMlKemPublicKey) obj).raw);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ML-KEM";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return ArrayUtils.concat(getX509Preamble(this.algorithm), this.raw);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    MlKemAlgorithm getMlKemAlgorithm() {
        return this.algorithm;
    }

    byte[] getRaw() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            return Arrays.hashCode(bArr) ^ this.algorithm.hashCode();
        }
        throw new IllegalStateException("key is destroyed");
    }
}
