package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f38157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, vq.d dVar) {
        super(dVar);
        this.f38157e = lVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38156d = obj;
        this.f38158f |= PKIFailureInfo.systemUnavail;
        return this.f38157e.f(this);
    }
}
