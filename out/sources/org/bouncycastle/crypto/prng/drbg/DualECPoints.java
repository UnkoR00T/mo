package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ECPoint f149201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ECPoint f149202q;
    private final int securityStrength;

    public DualECPoints(int i15, ECPoint eCPoint, ECPoint eCPoint2, int i16) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i15;
        this.f149201p = eCPoint;
        this.f149202q = eCPoint2;
        this.cofactor = i16;
    }

    private static int log2(int i15) {
        int i16 = 0;
        while (true) {
            i15 >>= 1;
            if (i15 == 0) {
                return i16;
            }
            i16++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f149201p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f149201p;
    }

    public ECPoint getQ() {
        return this.f149202q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f149201p.getCurve().getFieldSize();
    }
}
