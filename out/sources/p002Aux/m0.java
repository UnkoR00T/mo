package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f86d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f89g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f90h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, d dVar) {
        super(dVar);
        this.f90h = n0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f89g = obj;
        this.f91j |= PKIFailureInfo.systemUnavail;
        return this.f90h.a(null, 0, 0, this);
    }
}
