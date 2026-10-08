package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f21d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f22e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f24g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, d dVar) {
        super(dVar);
        this.f24g = nVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f23f = obj;
        this.f25h |= PKIFailureInfo.systemUnavail;
        return this.f24g.a(null, null, null, this);
    }
}
