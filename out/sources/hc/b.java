package hc;

import ic.q;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f83039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f83040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f83041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f83042h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f83046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f83047n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f83048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83049q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, vq.d dVar) {
        super(dVar);
        this.f83048p = gVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83047n = obj;
        this.f83049q |= PKIFailureInfo.systemUnavail;
        return g.b(this.f83048p, null, null, null, this);
    }
}
