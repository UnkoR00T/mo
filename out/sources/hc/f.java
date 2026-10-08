package hc;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f83063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f83064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, vq.d dVar) {
        super(dVar);
        this.f83064f = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83063e = obj;
        this.f83065g |= PKIFailureInfo.systemUnavail;
        return g.i(this.f83064f, this);
    }
}
