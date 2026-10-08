package hc;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f83035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f83036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, vq.d dVar) {
        super(dVar);
        this.f83036f = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83035e = obj;
        this.f83037g |= PKIFailureInfo.systemUnavail;
        return g.c(this.f83036f, null, this);
    }
}
