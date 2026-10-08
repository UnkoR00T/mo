package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f149141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f149142d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f149143h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f149141c = bigInteger;
        this.f149142d = bigInteger2;
        this.f149143h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f149141c) && cramerShoupPublicKeyParameters.getD().equals(this.f149142d) && cramerShoupPublicKeyParameters.getH().equals(this.f149143h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f149141c;
    }

    public BigInteger getD() {
        return this.f149142d;
    }

    public BigInteger getH() {
        return this.f149143h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f149141c.hashCode() ^ this.f149142d.hashCode()) ^ this.f149143h.hashCode()) ^ super.hashCode();
    }
}
