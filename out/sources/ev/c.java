package ev;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f53739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f53740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f53741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f53742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53743h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, vq.d dVar) {
        super(dVar);
        this.f53742g = fVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53741f = obj;
        this.f53743h |= PKIFailureInfo.systemUnavail;
        return this.f53742g.a(null, null, null, this);
    }
}
