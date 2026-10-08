package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f19e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, d dVar) {
        super(dVar);
        this.f19e = nVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f18d = obj;
        this.f20f |= PKIFailureInfo.systemUnavail;
        return this.f19e.e(null, this);
    }
}
