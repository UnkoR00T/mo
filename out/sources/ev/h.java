package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.h3;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h3 f53759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f53760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f53761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, vq.d dVar) {
        super(dVar);
        this.f53761f = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53760e = obj;
        this.f53762g |= PKIFailureInfo.systemUnavail;
        return this.f53761f.c(null, this);
    }
}
