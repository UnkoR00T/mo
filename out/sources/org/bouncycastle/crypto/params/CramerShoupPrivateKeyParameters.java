package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private CramerShoupPublicKeyParameters f149135pk;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f149136x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f149137x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BigInteger f149138y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private BigInteger f149139y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BigInteger f149140z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f149136x1 = bigInteger;
        this.f149137x2 = bigInteger2;
        this.f149138y1 = bigInteger3;
        this.f149139y2 = bigInteger4;
        this.f149140z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f149136x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f149137x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f149138y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f149139y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f149140z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f149135pk;
    }

    public BigInteger getX1() {
        return this.f149136x1;
    }

    public BigInteger getX2() {
        return this.f149137x2;
    }

    public BigInteger getY1() {
        return this.f149138y1;
    }

    public BigInteger getY2() {
        return this.f149139y2;
    }

    public BigInteger getZ() {
        return this.f149140z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f149136x1.hashCode() ^ this.f149137x2.hashCode()) ^ this.f149138y1.hashCode()) ^ this.f149139y2.hashCode()) ^ this.f149140z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f149135pk = cramerShoupPublicKeyParameters;
    }
}
