package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, d dVar) {
        super(dVar);
        this.f8e = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f7d = obj;
        this.f9f |= PKIFailureInfo.systemUnavail;
        return this.f8e.f(this);
    }
}
