package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f53736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f53737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, vq.d dVar) {
        super(dVar);
        this.f53737e = fVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53736d = obj;
        this.f53738f |= PKIFailureInfo.systemUnavail;
        return this.f53737e.c(null, this);
    }
}
