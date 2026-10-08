package ok;

import fk.t;
import fk.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sk.y;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends nk.d<sk.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.l<ok.a, g> f146395d = nk.l.b(new nk.l.b() { // from class: ok.b
        @Override // nk.l.b
        public final Object a(fk.g gVar) {
            return new pk.b((a) gVar);
        }
    }, ok.a.class, g.class);

    class a extends nk.m<t, sk.a> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(sk.a aVar) {
            return new tk.o(new tk.m(aVar.Z().C()), aVar.a0().Y());
        }
    }

    class b extends nk.d.a<sk.b, sk.a> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.b>> c() {
            HashMap map = new HashMap();
            sk.b bVarBuild = sk.b.a0().G(32).H(sk.c.Z().G(16).build()).build();
            fk.l.b bVar = fk.l.b.TINK;
            map.put("AES_CMAC", new nk.d.a.C3379a(bVarBuild, bVar));
            map.put("AES256_CMAC", new nk.d.a.C3379a(sk.b.a0().G(32).H(sk.c.Z().G(16).build()).build(), bVar));
            map.put("AES256_CMAC_RAW", new nk.d.a.C3379a(sk.b.a0().G(32).H(sk.c.Z().G(16).build()).build(), fk.l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.a a(sk.b bVar) {
            return sk.a.c0().I(0).G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(bVar.Y()))).H(bVar.Z()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.b d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.b.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.b bVar) throws GeneralSecurityException {
            c.q(bVar.Z());
            c.r(bVar.Y());
        }
    }

    c() {
        super(sk.a.class, new a(t.class));
    }

    public static void o(boolean z15) {
        x.l(new c(), z15);
        f.c();
        nk.h.c().d(f146395d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(sk.c cVar) throws GeneralSecurityException {
        if (cVar.Y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cVar.Y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i15) throws GeneralSecurityException {
        if (i15 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // nk.d
    public nk.d.a<sk.b, sk.a> f() {
        return new b(sk.b.class);
    }

    @Override // nk.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public sk.a h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.a.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(sk.a aVar) throws GeneralSecurityException {
        tk.r.c(aVar.b0(), m());
        r(aVar.Z().size());
        q(aVar.a0());
    }
}
