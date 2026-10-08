package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1 f24753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, d dVar) {
        super(dVar);
        this.f24753e = w1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24752d = obj;
        this.f24754f |= PKIFailureInfo.systemUnavail;
        return this.f24753e.c(null, this);
    }
}
