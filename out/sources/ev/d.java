package ev;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f53744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f53745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f53746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f53747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f53748h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53749j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, vq.d dVar) {
        super(dVar);
        this.f53748h = fVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f53747g = obj;
        this.f53749j |= PKIFailureInfo.systemUnavail;
        return this.f53748h.b(null, null, null, this);
    }
}
