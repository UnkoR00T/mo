package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
public enum MlDsaAlgorithm {
    ML_DSA_44("ML-DSA-44", 1312),
    ML_DSA_65("ML-DSA-65", 1952),
    ML_DSA_87("ML-DSA-87", 2592);

    private final String name;
    private final int publicKeySize;

    MlDsaAlgorithm(String str, int i15) {
        this.name = str;
        this.publicKeySize = i15;
    }

    public static MlDsaAlgorithm parse(String str) {
        str.getClass();
        switch (str) {
            case "ML-DSA-44":
                return ML_DSA_44;
            case "ML-DSA-65":
                return ML_DSA_65;
            case "ML-DSA-87":
                return ML_DSA_87;
            default:
                throw new IllegalArgumentException("Unsupported algorithm: " + str);
        }
    }

    public int publicKeySize() {
        return this.publicKeySize;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
