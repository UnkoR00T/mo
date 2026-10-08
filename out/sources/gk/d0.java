package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public class d0 extends nk.d<sk.e0> {

    class a extends nk.m<fk.a, sk.e0> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.e0 e0Var) {
            String strX = e0Var.Y().X();
            return fk.s.a(strX).b(strX);
        }
    }

    class b extends nk.d.a<sk.f0, sk.e0> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.e0 a(sk.f0 f0Var) {
            return sk.e0.a0().G(f0Var).H(d0.this.k()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.f0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.f0.Y(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.f0 f0Var) {
        }
    }

    d0() {
        super(sk.e0.class, new a(fk.a.class));
    }

    public static void m(boolean z15) {
        fk.x.l(new d0(), z15);
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // nk.d
    public nk.d.a<sk.f0, sk.e0> f() {
        return new b(sk.f0.class);
    }

    @Override // nk.d
    public sk.y.c g() {
        return sk.y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public sk.e0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.e0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(sk.e0 e0Var) throws GeneralSecurityException {
        tk.r.c(e0Var.Z(), k());
    }
}
