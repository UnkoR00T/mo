package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f24730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, d dVar) {
        super(dVar);
        this.f24730e = s1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24729d = obj;
        this.f24731f |= PKIFailureInfo.systemUnavail;
        return this.f24730e.e(null, this);
    }
}
