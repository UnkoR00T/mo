package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.o3;
import p028con.p3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o3 f24747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p3 f24748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f24749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w1 f24750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(w1 w1Var, d dVar) {
        super(dVar);
        this.f24750g = w1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24749f = obj;
        this.f24751h |= PKIFailureInfo.systemUnavail;
        return this.f24750g.a(null, null, null, this);
    }
}
