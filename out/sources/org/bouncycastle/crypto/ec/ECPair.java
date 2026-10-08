package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
public class ECPair {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ECPoint f148994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ECPoint f148995y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f148994x = eCPoint;
        this.f148995y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f148994x;
    }

    public ECPoint getY() {
        return this.f148995y;
    }

    public int hashCode() {
        return this.f148994x.hashCode() + (this.f148995y.hashCode() * 37);
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
