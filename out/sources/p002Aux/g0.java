package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f65d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f66e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f69h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f70j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f71k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, d dVar) {
        super(dVar);
        this.f70j = h0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f69h = obj;
        this.f71k |= PKIFailureInfo.systemUnavail;
        return this.f70j.a(null, 0, 0, this);
    }
}
