package so;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class b extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private oo.h f182599g;

    private static class a implements oo.k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0 f182600a;

        a(n0 n0Var) {
            this.f182600a = n0Var;
        }
    }

    b(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws IOException {
        this.f182599g = new oo.k().e(i0Var.p((int) b()), new a(this.f182682f)).get(0);
        this.f182681e = true;
    }

    public oo.h j() {
        return this.f182599g;
    }
}
