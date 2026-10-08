package gs;

import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mr.c<? extends e> f76600a;

    public f(mr.c<? extends e> cVar) {
        this.f76600a = cVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && t.c(this.f76600a, ((f) obj).f76600a);
    }

    public int hashCode() {
        return this.f76600a.hashCode();
    }

    public String toString() {
        return dr.a.b(this.f76600a).getName();
    }
}
