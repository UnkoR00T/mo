package gk;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends nk.d<sk.i> {

    class a extends nk.m<fk.a, sk.i> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fk.a a(sk.i iVar) {
            return new tk.b(iVar.Z().C(), iVar.a0().Y());
        }
    }

    class b extends nk.d.a<sk.j, sk.i> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<sk.j>> c() {
            HashMap map = new HashMap();
            fk.l.b bVar = fk.l.b.TINK;
            map.put("AES128_EAX", h.l(16, 16, bVar));
            fk.l.b bVar2 = fk.l.b.RAW;
            map.put("AES128_EAX_RAW", h.l(16, 16, bVar2));
            map.put("AES256_EAX", h.l(32, 16, bVar));
            map.put("AES256_EAX_RAW", h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.i a(sk.j jVar) {
            return sk.i.c0().G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(jVar.Y()))).H(jVar.Z()).I(h.this.m()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.j d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.j.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.j jVar) throws GeneralSecurityException {
            tk.r.a(jVar.Y());
            if (jVar.Z().Y() != 12 && jVar.Z().Y() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    h() {
        super(sk.i.class, new a(fk.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nk.d.a.C3379a<sk.j> l(int i15, int i16, fk.l.b bVar) {
        return new nk.d.a.C3379a<>(sk.j.a0().G(i15).H(sk.k.Z().G(i16).build()).build(), bVar);
    }

    public static void o(boolean z15) {
        fk.x.l(new h(), z15);
        n.c();
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // nk.d
    public nk.d.a<sk.j, sk.i> f() {
        return new b(sk.j.class);
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
    public sk.i h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.i.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(sk.i iVar) throws GeneralSecurityException {
        tk.r.c(iVar.b0(), m());
        tk.r.a(iVar.Z().size());
        if (iVar.a0().Y() != 12 && iVar.a0().Y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
