package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f38139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f38141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, vq.d dVar) {
        super(dVar);
        this.f38141f = eVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38140e = obj;
        this.f38142g |= PKIFailureInfo.systemUnavail;
        return this.f38141f.d(null, null, this);
    }
}
