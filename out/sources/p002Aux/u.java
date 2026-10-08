package p002Aux;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p005Con.g1;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g1 f118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f121h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, d dVar) {
        super(dVar);
        this.f120g = vVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f119f = obj;
        this.f121h |= PKIFailureInfo.systemUnavail;
        return this.f120g.a(null, 0, 0, this);
    }
}
