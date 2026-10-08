package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f53d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f54e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, d dVar) {
        super(dVar);
        this.f54e = d0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53d = obj;
        this.f55f |= PKIFailureInfo.systemUnavail;
        return this.f54e.a(null, 0, 0, this);
    }
}
