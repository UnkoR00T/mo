package z7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f233213a;

    public final void k(int i15) {
        this.f233213a = i15 | this.f233213a;
    }

    public void l() {
        this.f233213a = 0;
    }

    protected final boolean n(int i15) {
        return (this.f233213a & i15) == i15;
    }

    public final boolean o() {
        return n(268435456);
    }

    public final boolean p() {
        return n(4);
    }

    public final boolean q() {
        return n(134217728);
    }

    public final boolean r() {
        return n(1);
    }

    public final boolean s() {
        return n(PKIFailureInfo.duplicateCertReq);
    }

    public final boolean t() {
        return n(67108864);
    }

    public final void v(int i15) {
        this.f233213a = i15;
    }
}
