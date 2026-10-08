package p004CoN;

import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p013aUX.w0;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f246h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f247j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, d dVar) {
        super(dVar);
        this.f246h = d1Var;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f245g = obj;
        this.f247j |= PKIFailureInfo.systemUnavail;
        return this.f246h.b(null, this);
    }
}
