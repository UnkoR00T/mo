package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f26d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f27e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f28f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f29g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, d dVar) {
        super(dVar);
        this.f29g = nVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f28f = obj;
        this.f30h |= PKIFailureInfo.systemUnavail;
        return this.f29g.b(null, null, null, this);
    }
}
