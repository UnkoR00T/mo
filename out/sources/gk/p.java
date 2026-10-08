package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends nk.d<sk.l> {

    class a extends nk.m<fk.a, sk.l> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.l lVar) {
            return new tk.c(lVar.Y().C());
        }
    }

    class b extends nk.d.a<sk.m, sk.l> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.m>> c() {
            HashMap map = new HashMap();
            fk.l.b bVar = fk.l.b.TINK;
            map.put("AES128_GCM", p.l(16, bVar));
            fk.l.b bVar2 = fk.l.b.RAW;
            map.put("AES128_GCM_RAW", p.l(16, bVar2));
            map.put("AES256_GCM", p.l(32, bVar));
            map.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.l a(sk.m mVar) {
            return sk.l.a0().G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(mVar.X()))).H(p.this.m()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.m d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.m.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.m mVar) throws InvalidAlgorithmParameterException {
            tk.r.a(mVar.X());
        }
    }

    p() {
        super(sk.l.class, new a(fk.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nk.d.a.C3379a<sk.m> l(int i15, fk.l.b bVar) {
        return new nk.d.a.C3379a<>(sk.m.Y().G(i15).build(), bVar);
    }

    public static void o(boolean z15) {
        fk.x.l(new p(), z15);
        s.c();
    }

    @Override // nk.d
    public kk.b.EnumC2684b a() {
        return kk.b.EnumC2684b.f111286b;
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // nk.d
    public nk.d.a<sk.m, sk.l> f() {
        return new b(sk.m.class);
    }

    @Override // nk.d
    public sk.y.c g() {
        return sk.y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public sk.l h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.l.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(sk.l lVar) throws GeneralSecurityException {
        tk.r.c(lVar.Z(), m());
        tk.r.a(lVar.Y().size());
    }
}
