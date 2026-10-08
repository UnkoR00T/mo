package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public class f extends nk.d<sk.f> {

    class a extends nk.m<tk.l, sk.f> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public tk.l a(sk.f fVar) {
            return new tk.a(fVar.a0().C(), fVar.b0().Y());
        }
    }

    class b extends nk.d.a<sk.g, sk.f> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public sk.f a(sk.g gVar) {
            return sk.f.d0().H(gVar.a0()).G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(gVar.Z()))).I(f.this.l()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public sk.g d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return sk.g.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(sk.g gVar) throws GeneralSecurityException {
            tk.r.a(gVar.Z());
            f.this.o(gVar.a0());
        }
    }

    f() {
        super(sk.f.class, new a(tk.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(sk.h hVar) throws GeneralSecurityException {
        if (hVar.Y() < 12 || hVar.Y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // nk.d
    public nk.d.a<sk.g, sk.f> f() {
        return new b(sk.g.class);
    }

    @Override // nk.d
    public sk.y.c g() {
        return sk.y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public sk.f h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return sk.f.e0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(sk.f fVar) {
        tk.r.c(fVar.c0(), l());
        tk.r.a(fVar.a0().size());
        o(fVar.b0());
    }
}
