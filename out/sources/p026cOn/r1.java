package p026cOn;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f24742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f24744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, d dVar) {
        super(dVar);
        this.f24744f = s1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f24743e = obj;
        this.f24745g |= PKIFailureInfo.systemUnavail;
        return this.f24744f.d(null, null, this);
    }
}
