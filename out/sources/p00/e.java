package p00;

import ay.k;
import fv.d0;
import fv.w;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lp00/e;", "Lfv/w;", "Lay/k;", "networkConnectionManager", "<init>", "(Lay/k;)V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Lay/k;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k networkConnectionManager;

    public e(k kVar) {
        this.networkConnectionManager = kVar;
    }

    @Override // fv.w
    public d0 a(w.a chain) throws o00.b, o00.c {
        if (!this.networkConnectionManager.e()) {
            throw new o00.b();
        }
        try {
            return chain.a(chain.C().i().b());
        } catch (Exception e15) {
            px.f.f163100a.d("Network error:", e15, px.c.a(this));
            throw new o00.c(chain.C().getUrl().getUrl(), e15);
        }
    }
}
