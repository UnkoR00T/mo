package hc;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f83067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f83068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vq.d dVar) {
        super(dVar);
        this.f83068e = iVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83067d = obj;
        this.f83069f |= PKIFailureInfo.systemUnavail;
        return this.f83068e.a(null, this);
    }
}
