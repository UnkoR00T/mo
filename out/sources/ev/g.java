package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.p3;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3 f53755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f53756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f53757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, vq.d dVar) {
        super(dVar);
        this.f53757f = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53756e = obj;
        this.f53758g |= PKIFailureInfo.systemUnavail;
        return this.f53757f.a(null, null, null, this);
    }
}
