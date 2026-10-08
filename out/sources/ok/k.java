package ok;

import fk.t;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import sk.u;
import sk.v;
import sk.w;
import sk.x;
import sk.y;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends nk.d<v> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.l<i, g> f146423d = nk.l.b(new nk.l.b() { // from class: ok.j
        @Override // nk.l.b
        public final Object a(fk.g gVar) {
            return new pk.c((i) gVar);
        }
    }, i.class, g.class);

    class a extends nk.m<t, v> {
        a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) throws GeneralSecurityException {
            u uVarZ = vVar.b0().Z();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.a0().C(), "HMAC");
            int iA0 = vVar.b0().a0();
            int i15 = c.f146425a[uVarZ.ordinal()];
            if (i15 == 1) {
                return new tk.o(new tk.n("HMACSHA1", secretKeySpec), iA0);
            }
            if (i15 == 2) {
                return new tk.o(new tk.n("HMACSHA224", secretKeySpec), iA0);
            }
            if (i15 == 3) {
                return new tk.o(new tk.n("HMACSHA256", secretKeySpec), iA0);
            }
            if (i15 == 4) {
                return new tk.o(new tk.n("HMACSHA384", secretKeySpec), iA0);
            }
            if (i15 == 5) {
                return new tk.o(new tk.n("HMACSHA512", secretKeySpec), iA0);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    class b extends nk.d.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, nk.d.a.C3379a<w>> c() {
            HashMap map = new HashMap();
            u uVar = u.SHA256;
            fk.l.b bVar = fk.l.b.TINK;
            map.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            fk.l.b bVar2 = fk.l.b.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            map.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            map.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            map.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            map.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return v.d0().I(k.this.n()).H(wVar.a0()).G(com.google.crypto.tink.shaded.protobuf.h.i(tk.p.c(wVar.Z()))).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return w.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) throws GeneralSecurityException {
            if (wVar.Z() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.a0());
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146425a;

        static {
            int[] iArr = new int[u.values().length];
            f146425a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146425a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146425a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f146425a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f146425a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nk.d.a.C3379a<w> m(int i15, int i16, u uVar, fk.l.b bVar) {
        return new nk.d.a.C3379a<>(w.b0().H(x.b0().G(uVar).H(i16).build()).G(i15).build(), bVar);
    }

    public static void p(boolean z15) {
        fk.x.l(new k(), z15);
        n.c();
        nk.h.c().d(f146423d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) throws GeneralSecurityException {
        if (xVar.a0() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i15 = c.f146425a[xVar.Z().ordinal()];
        if (i15 == 1) {
            if (xVar.a0() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i15 == 2) {
            if (xVar.a0() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i15 == 3) {
            if (xVar.a0() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i15 == 4) {
            if (xVar.a0() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i15 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.a0() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // nk.d
    public kk.b.EnumC2684b a() {
        return kk.b.EnumC2684b.f111286b;
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // nk.d
    public nk.d.a<w, v> f() {
        return new b(w.class);
    }

    @Override // nk.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public v h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return v.e0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        tk.r.c(vVar.c0(), n());
        if (vVar.a0().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.b0());
    }
}
