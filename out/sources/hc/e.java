package hc;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f83059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f83060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, vq.d dVar) {
        super(dVar);
        this.f83060f = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83059e = obj;
        this.f83061g |= PKIFailureInfo.systemUnavail;
        return g.h(this.f83060f, this);
    }
}
