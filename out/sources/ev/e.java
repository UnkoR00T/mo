package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f53750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f53751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f53752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, vq.d dVar) {
        super(dVar);
        this.f53752f = fVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53751e = obj;
        this.f53753g |= PKIFailureInfo.systemUnavail;
        return this.f53752f.d(null, null, this);
    }
}
