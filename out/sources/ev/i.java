package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.h3;
import p028con.j3;
import p028con.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h3 f53763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3 f53764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j3 f53765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f53766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f53767h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, vq.d dVar) {
        super(dVar);
        this.f53767h = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53766g = obj;
        this.f53768j |= PKIFailureInfo.systemUnavail;
        return this.f53767h.b(null, null, null, this);
    }
}
