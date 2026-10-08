package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends nk.d<sk.d> {

    class a extends nk.m<fk.a, sk.d> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.d dVar) {
            return new tk.h((tk.l) new f().e(dVar.Z(), tk.l.class), (fk.t) new ok.k().e(dVar.a0(), fk.t.class), dVar.a0().b0().a0());
        }
    }

    class b extends nk.d.a<sk.e, sk.d> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.e>> c() {
            HashMap map = new HashMap();
            sk.u uVar = sk.u.SHA256;
            fk.l.b bVar = fk.l.b.TINK;
            map.put("AES128_CTR_HMAC_SHA256", e.l(16, 16, 32, 16, uVar, bVar));
            fk.l.b bVar2 = fk.l.b.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", e.l(16, 16, 32, 16, uVar, bVar2));
            map.put("AES256_CTR_HMAC_SHA256", e.l(32, 16, 32, 32, uVar, bVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.d a(sk.e eVar) {
            sk.f fVar = (sk.f) new f().f().a(eVar.Y());
            return sk.d.c0().G(fVar).H((sk.v) new ok.k().f().a(eVar.Z())).I(e.this.n()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.e d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.e.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.e eVar) throws InvalidAlgorithmParameterException {
            new f().f().e(eVar.Y());
            new ok.k().f().e(eVar.Z());
            tk.r.a(eVar.Y().Z());
        }
    }

    e() {
        super(sk.d.class, new a(fk.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nk.d.a.C3379a<sk.e> l(int i15, int i16, int i17, int i18, sk.u uVar, fk.l.b bVar) {
        return new nk.d.a.C3379a<>(m(i15, i16, i17, i18, uVar), bVar);
    }

    private static sk.e m(int i15, int i16, int i17, int i18, sk.u uVar) {
        sk.g gVarBuild = sk.g.b0().H(sk.h.Z().G(i16).build()).G(i15).build();
        return sk.e.a0().G(gVarBuild).H(sk.w.b0().H(sk.x.b0().G(uVar).H(i18).build()).G(i17).build()).build();
    }

    public static void p(boolean z15) {
        fk.x.l(new e(), z15);
    }

    @Override // nk.d
    public kk.b.EnumC2684b a() {
        return kk.b.EnumC2684b.f111286b;
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // nk.d
    public nk.d.a<sk.e, sk.d> f() {
        return new b(sk.e.class);
    }

    @Override // nk.d
    public sk.y.c g() {
        return sk.y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public sk.d h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.d.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(sk.d dVar) throws GeneralSecurityException {
        tk.r.c(dVar.b0(), n());
        new f().j(dVar.Z());
        new ok.k().j(dVar.a0());
    }
}
