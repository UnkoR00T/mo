package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.h3;
import p028con.o3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h3 f44d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3 f45e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f46f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f47g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, d dVar) {
        super(dVar);
        this.f47g = rVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f46f = obj;
        this.f48h |= PKIFailureInfo.systemUnavail;
        return this.f47g.b(null, null, null, this);
    }
}
