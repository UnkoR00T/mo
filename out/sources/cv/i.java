package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f38153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, vq.d dVar) {
        super(dVar);
        this.f38153e = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38152d = obj;
        this.f38154f |= PKIFailureInfo.systemUnavail;
        return this.f38153e.b(null, null, null, this);
    }
}
