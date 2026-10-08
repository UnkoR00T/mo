package k0;

import b0.r;
import java.util.UUID;
import v.t2;
import v.u2;
import v.w3;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
class h implements w3.b<g, i, h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2 f107155a;

    h() {
        this(u2.l0());
    }

    @Override // o.j0
    public t2 a() {
        return this.f107155a;
    }

    @Override // v.w3.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i d() {
        return new i(z2.k0(this.f107155a));
    }

    public h c(x3.b bVar) {
        a().m(w3.L, bVar);
        return this;
    }

    public h e(Class<g> cls) {
        a().m(r.f15616c, cls);
        if (a().f(r.f15615b, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public h f(String str) {
        a().m(r.f15615b, str);
        return this;
    }

    h(u2 u2Var) {
        this.f107155a = u2Var;
        Class cls = (Class) u2Var.f(r.f15616c, null);
        if (cls == null || cls.equals(g.class)) {
            c(x3.b.STREAM_SHARING);
            e(g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
