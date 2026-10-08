package st;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends r1<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr.h f184124a;

    public t(wr.h hVar) {
        this.f184124a = hVar;
    }

    @Override // st.r1
    public mr.c<? extends t> b() {
        return fr.q0.c(t.class);
    }

    @Override // st.r1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t a(t tVar) {
        return tVar == null ? this : new t(wr.j.a(this.f184124a, tVar.f184124a));
    }

    public final wr.h e() {
        return this.f184124a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            return fr.t.c(((t) obj).f184124a, this.f184124a);
        }
        return false;
    }

    @Override // st.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public t c(t tVar) {
        if (fr.t.c(tVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f184124a.hashCode();
    }
}
