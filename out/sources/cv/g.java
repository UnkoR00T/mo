package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.p3;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3 f38145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f38147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, vq.d dVar) {
        super(dVar);
        this.f38147f = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38146e = obj;
        this.f38148g |= PKIFailureInfo.systemUnavail;
        return this.f38147f.a(null, null, null, this);
    }
}
