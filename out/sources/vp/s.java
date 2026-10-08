package vp;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends t {
    s(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    @Override // vp.r
    void j() {
        new a(this).u(q());
    }

    public int p() {
        return D1().x4(bp.i.f20924x5);
    }

    public String q() {
        return o(f(bp.i.f20863r9));
    }

    public boolean r() {
        return D1().t4(bp.i.f20900v3, 16777216);
    }

    public boolean s() {
        return D1().t4(bp.i.f20900v3, PKIFailureInfo.badCertTemplate);
    }

    public boolean t() {
        return D1().t4(bp.i.f20900v3, PKIFailureInfo.certConfirmed);
    }

    public boolean u() {
        return D1().t4(bp.i.f20900v3, PKIFailureInfo.certRevoked);
    }
}
