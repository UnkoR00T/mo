package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f72d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f73e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f76h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f77j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, d dVar) {
        super(dVar);
        this.f77j = j0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f76h = obj;
        this.f78k |= PKIFailureInfo.systemUnavail;
        return this.f77j.a(null, 0, 0, this);
    }
}
