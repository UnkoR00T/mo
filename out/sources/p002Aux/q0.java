package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f99d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0 f103h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, d dVar) {
        super(dVar);
        this.f103h = r0Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f102g = obj;
        this.f104j |= PKIFailureInfo.systemUnavail;
        return this.f103h.a(null, 0, 0, this);
    }
}
