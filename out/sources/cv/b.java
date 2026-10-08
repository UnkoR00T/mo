package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f38121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f38123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f38124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f38125h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f38126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f38127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f38128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38129m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, vq.d dVar) {
        super(dVar);
        this.f38128l = eVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38127k = obj;
        this.f38129m |= PKIFailureInfo.systemUnavail;
        return this.f38128l.a(null, null, null, this);
    }
}
