package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
public class ECSchnorrZKP {
    private final ECPoint V;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final BigInteger f148933r;

    ECSchnorrZKP(ECPoint eCPoint, BigInteger bigInteger) {
        this.V = eCPoint;
        this.f148933r = bigInteger;
    }

    public ECPoint getV() {
        return this.V;
    }

    public BigInteger getr() {
        return this.f148933r;
    }
}
