package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class z extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, d dVar) {
        super(dVar);
        this.f134f = a0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f133e = obj;
        this.f135g |= PKIFailureInfo.systemUnavail;
        return this.f134f.a(null, 0, 0, this);
    }
}
