package p001AuX;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f41d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f42e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, d dVar) {
        super(dVar);
        this.f42e = rVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f41d = obj;
        this.f43f |= PKIFailureInfo.systemUnavail;
        return this.f42e.c(null, this);
    }
}
