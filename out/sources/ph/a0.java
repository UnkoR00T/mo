package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f157539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ e0 f157540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f157541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(e0 e0Var, tq.e eVar) {
        super(eVar);
        this.f157540e = e0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f157539d = obj;
        this.f157541f |= PKIFailureInfo.systemUnavail;
        return this.f157540e.c9(null, this);
    }
}
