package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f92d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f93e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f96h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f97j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f98k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, d dVar) {
        super(dVar);
        this.f97j = p0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f96h = obj;
        this.f98k |= PKIFailureInfo.systemUnavail;
        return this.f97j.a(null, 0, 0, this);
    }
}
