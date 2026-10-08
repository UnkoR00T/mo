package gk;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class z extends nk.d<sk.r> {

    class a extends nk.m<fk.a, sk.r> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.r rVar) {
            return new tk.g(rVar.Y().C());
        }
    }

    class b extends nk.d.a<sk.s, sk.r> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.s>> c() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new nk.d.a.C3379a(sk.s.W(), fk.l.b.TINK));
            map.put("CHACHA20_POLY1305_RAW", new nk.d.a.C3379a(sk.s.W(), fk.l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.r a(sk.s sVar) {
            return sk.r.a0().H(z.this.k()).G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(32))).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.s d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.s.X(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.s sVar) {
        }
    }

    z() {
        super(sk.r.class, new a(fk.a.class));
    }

    public static void m(boolean z15) {
        fk.x.l(new z(), z15);
        c0.c();
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // nk.d
    public nk.d.a<sk.s, sk.r> f() {
        return new b(sk.s.class);
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
    public sk.r h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.r.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(sk.r rVar) throws GeneralSecurityException {
        tk.r.c(rVar.Z(), k());
        if (rVar.Y().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
