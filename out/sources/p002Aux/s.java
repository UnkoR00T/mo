package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f109h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, d dVar) {
        super(dVar);
        this.f109h = tVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f108g = obj;
        this.f110j |= PKIFailureInfo.systemUnavail;
        return this.f109h.a(null, 0, 0, this);
    }
}
