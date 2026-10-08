package hc;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f83055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f83056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83057g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, vq.d dVar) {
        super(dVar);
        this.f83056f = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83055e = obj;
        this.f83057g |= PKIFailureInfo.systemUnavail;
        return g.d(this.f83056f, this);
    }
}
