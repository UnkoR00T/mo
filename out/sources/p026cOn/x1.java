package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1 f24760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, d dVar) {
        super(dVar);
        this.f24760e = y1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24759d = obj;
        this.f24761f |= PKIFailureInfo.systemUnavail;
        return this.f24760e.f(this);
    }
}
