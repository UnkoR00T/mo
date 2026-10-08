package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends nk.d<sk.n> {

    class a extends nk.m<fk.a, sk.n> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.n nVar) {
            return new ik.a(nVar.Y().C());
        }
    }

    class b extends nk.d.a<sk.o, sk.n> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.o>> c() {
            HashMap map = new HashMap();
            fk.l.b bVar = fk.l.b.TINK;
            map.put("AES128_GCM_SIV", u.m(16, bVar));
            fk.l.b bVar2 = fk.l.b.RAW;
            map.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            map.put("AES256_GCM_SIV", u.m(32, bVar));
            map.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.n a(sk.o oVar) {
            return sk.n.a0().G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(oVar.X()))).H(u.this.n()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.o d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.o.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.o oVar) throws InvalidAlgorithmParameterException {
            tk.r.a(oVar.X());
        }
    }

    u() {
        super(sk.n.class, new a(fk.a.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nk.d.a.C3379a<sk.o> m(int i15, fk.l.b bVar) {
        return new nk.d.a.C3379a<>(sk.o.Y().G(i15).build(), bVar);
    }

    public static void p(boolean z15) {
        if (l()) {
            fk.x.l(new u(), z15);
            x.c();
        }
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // nk.d
    public nk.d.a<sk.o, sk.n> f() {
        return new b(sk.o.class);
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
    public sk.n h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.n.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(sk.n nVar) throws GeneralSecurityException {
        tk.r.c(nVar.Z(), n());
        tk.r.a(nVar.Y().size());
    }
}
