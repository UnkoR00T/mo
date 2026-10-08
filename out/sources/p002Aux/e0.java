package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f59d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f60e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, d dVar) {
        super(dVar);
        this.f60e = f0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f59d = obj;
        this.f61f |= PKIFailureInfo.systemUnavail;
        return this.f60e.a(null, 0, 0, this);
    }
}
