package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
public enum MlKemAlgorithm {
    ML_KEM_768("ML-KEM-768", 1184),
    ML_KEM_1024("ML-KEM-1024", 1568);

    private final String name;
    private final int publicKeySize;

    MlKemAlgorithm(String str, int i15) {
        this.name = str;
        this.publicKeySize = i15;
    }

    public int publicKeySize() {
        return this.publicKeySize;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
