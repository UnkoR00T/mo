package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f38119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, vq.d dVar) {
        super(dVar);
        this.f38119e = eVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38118d = obj;
        this.f38120f |= PKIFailureInfo.systemUnavail;
        return this.f38119e.c(null, this);
    }
}
