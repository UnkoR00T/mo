package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes5.dex */
public class SNTRUPrimeParameters implements KEMParameters {
    private final String name;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f149521p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f149522q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f149523w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters("sntrup653", 653, 4621, 288, 994, 865, 994, 1518, 32);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters("sntrup857", 857, 5167, 322, 1322, 1152, 1322, 1999, 32);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters("sntrup953", 953, 6343, 396, 1505, 1317, 1505, 2254, 32);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters("sntrup1013", 1013, 7177, 448, 1623, 1423, 1623, 2417, 32);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters("sntrup1277", 1277, 7879, 492, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
        this.name = str;
        this.f149521p = i15;
        this.f149522q = i16;
        this.f149523w = i17;
        this.rqPolynomialBytes = i18;
        this.roundedPolynomialBytes = i19;
        this.publicKeyBytes = i25;
        this.privateKeyBytes = i26;
        this.sharedKeyBytes = i27;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f149521p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f149522q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.f149523w;
    }
}
