package bs;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends u implements qs.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.c f21220a;

    public b0(zs.c cVar) {
        this.f21220a = cVar;
    }

    @Override // qs.d
    public boolean F() {
        return false;
    }

    @Override // qs.d
    public qs.a H(zs.c cVar) {
        return null;
    }

    @Override // qs.u
    public Collection<qs.g> J(er.l<? super zs.f, Boolean> lVar) {
        return pq.v.n();
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && fr.t.c(g(), ((b0) obj).g());
    }

    @Override // qs.u
    public zs.c g() {
        return this.f21220a;
    }

    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return b0.class.getName() + ": " + g();
    }

    @Override // qs.u
    public Collection<qs.u> w() {
        return pq.v.n();
    }

    @Override // qs.d
    public List<qs.a> getAnnotations() {
        return pq.v.n();
    }
}
