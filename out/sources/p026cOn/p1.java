package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f24732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f24733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f24734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f24735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, d dVar) {
        super(dVar);
        this.f24735g = s1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24734f = obj;
        this.f24736h |= PKIFailureInfo.systemUnavail;
        return this.f24735g.a(null, null, null, this);
    }
}
