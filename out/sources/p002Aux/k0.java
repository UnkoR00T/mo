package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f79d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f80e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f83h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f84j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, d dVar) {
        super(dVar);
        this.f84j = l0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83h = obj;
        this.f85k |= PKIFailureInfo.systemUnavail;
        return this.f84j.a(null, 0, 0, this);
    }
}
