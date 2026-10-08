package hc;

import ic.q;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f83050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f83051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f83052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, vq.d dVar) {
        super(dVar);
        this.f83052f = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83051e = obj;
        this.f83053g |= PKIFailureInfo.systemUnavail;
        return this.f83052f.e(null, this);
    }
}
