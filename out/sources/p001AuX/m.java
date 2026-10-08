package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f31d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f33f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, d dVar) {
        super(dVar);
        this.f33f = nVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f32e = obj;
        this.f34g |= PKIFailureInfo.systemUnavail;
        return this.f33f.d(null, null, this);
    }
}
