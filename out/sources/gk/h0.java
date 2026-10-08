package gk;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sk.l0;

/* JADX INFO: loaded from: classes4.dex */
public class h0 extends nk.d<sk.k0> {

    class a extends nk.m<fk.a, sk.k0> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.k0 k0Var) {
            return new tk.s(k0Var.Y().C());
        }
    }

    class b extends nk.d.a<l0, sk.k0> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<l0>> c() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new nk.d.a.C3379a(l0.W(), fk.l.b.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new nk.d.a.C3379a(l0.W(), fk.l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.k0 a(l0 l0Var) {
            return sk.k0.a0().H(h0.this.k()).G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(32))).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public l0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return l0.X(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(l0 l0Var) {
        }
    }

    h0() {
        super(sk.k0.class, new a(fk.a.class));
    }

    public static void m(boolean z15) {
        fk.x.l(new h0(), z15);
        k0.c();
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // nk.d
    public nk.d.a<l0, sk.k0> f() {
        return new b(l0.class);
    }

    @Override // nk.d
    public sk.y.c g() {
        return sk.y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public sk.k0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.k0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(sk.k0 k0Var) throws GeneralSecurityException {
        tk.r.c(k0Var.Z(), k());
        if (k0Var.Y().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
