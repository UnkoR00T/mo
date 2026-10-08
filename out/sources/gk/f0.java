package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public class f0 extends nk.d<sk.g0> {

    class a extends nk.m<fk.a, sk.g0> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.g0 g0Var) {
            String strY = g0Var.Y().Y();
            return new e0(g0Var.Y().X(), fk.s.a(strY).b(strY));
        }
    }

    class b extends nk.d.a<sk.h0, sk.g0> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.g0 a(sk.h0 h0Var) {
            return sk.g0.a0().G(h0Var).H(f0.this.k()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.h0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.h0.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.h0 h0Var) throws GeneralSecurityException {
            if (h0Var.Y().isEmpty() || !h0Var.Z()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    f0() {
        super(sk.g0.class, new a(fk.a.class));
    }

    public static void m(boolean z15) {
        fk.x.l(new f0(), z15);
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // nk.d
    public nk.d.a<sk.h0, sk.g0> f() {
        return new b(sk.h0.class);
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
    public sk.g0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.g0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(sk.g0 g0Var) throws GeneralSecurityException {
        tk.r.c(g0Var.Z(), k());
    }
}
