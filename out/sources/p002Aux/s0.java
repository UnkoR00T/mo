package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t0 f115h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f116j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, d dVar) {
        super(dVar);
        this.f115h = t0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f114g = obj;
        this.f116j |= PKIFailureInfo.systemUnavail;
        return this.f115h.a(null, 0, 0, this);
    }
}
