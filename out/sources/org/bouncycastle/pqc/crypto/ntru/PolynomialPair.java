package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes5.dex */
class PolynomialPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Polynomial f149515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Polynomial f149516b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f149515a = polynomial;
        this.f149516b = polynomial2;
    }

    public Polynomial f() {
        return this.f149515a;
    }

    public Polynomial g() {
        return this.f149516b;
    }

    public Polynomial m() {
        return this.f149516b;
    }

    public Polynomial r() {
        return this.f149515a;
    }
}
