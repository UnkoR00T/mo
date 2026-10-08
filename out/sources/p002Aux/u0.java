package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0 f126h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, d dVar) {
        super(dVar);
        this.f126h = v0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f125g = obj;
        this.f127j |= PKIFailureInfo.systemUnavail;
        return this.f126h.a(null, 0, 0, this);
    }
}
