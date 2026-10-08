package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f16e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, d dVar) {
        super(dVar);
        this.f16e = nVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f15d = obj;
        this.f17f |= PKIFailureInfo.systemUnavail;
        return this.f16e.c(null, this);
    }
}
