package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes5.dex */
public class MLKEMParameters implements KEMParameters {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f149510k;
    private final String name;
    private final int sessionKeySize;
    public static final MLKEMParameters ml_kem_512 = new MLKEMParameters("ML-KEM-512", 2, 256);
    public static final MLKEMParameters ml_kem_768 = new MLKEMParameters("ML-KEM-768", 3, 256);
    public static final MLKEMParameters ml_kem_1024 = new MLKEMParameters("ML-KEM-1024", 4, 256);

    private MLKEMParameters(String str, int i15, int i16) {
        this.name = str;
        this.f149510k = i15;
        this.sessionKeySize = i16;
    }

    public MLKEMEngine getEngine() {
        return new MLKEMEngine(this.f149510k);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
