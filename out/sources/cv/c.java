package cv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p028con.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3 f38130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f38132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f38133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f38134h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f38135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f38136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f38137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, vq.d dVar) {
        super(dVar);
        this.f38137l = eVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f38136k = obj;
        this.f38138m |= PKIFailureInfo.systemUnavail;
        return this.f38137l.b(null, null, null, this);
    }
}
