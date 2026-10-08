package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.o3;
import p028con.p3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o3 f36d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p3 f37e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f39g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, d dVar) {
        super(dVar);
        this.f39g = rVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38f = obj;
        this.f40h |= PKIFailureInfo.systemUnavail;
        return this.f39g.a(null, null, null, this);
    }
}
