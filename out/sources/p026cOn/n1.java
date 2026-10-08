package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f24727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(s1 s1Var, d dVar) {
        super(dVar);
        this.f24727e = s1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24726d = obj;
        this.f24728f |= PKIFailureInfo.systemUnavail;
        return this.f24727e.c(null, this);
    }
}
