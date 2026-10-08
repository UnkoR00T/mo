package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f38150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, vq.d dVar) {
        super(dVar);
        this.f38150e = jVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38149d = obj;
        this.f38151f |= PKIFailureInfo.systemUnavail;
        return this.f38150e.c(null, this);
    }
}
