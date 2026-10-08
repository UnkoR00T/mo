package lk;

import com.google.crypto.tink.shaded.protobuf.h;
import fk.e;
import fk.l;
import fk.x;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nk.d;
import nk.m;
import sk.p;
import sk.q;
import sk.y;
import tk.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends d<p> {

    /* JADX INFO: renamed from: lk.a$a, reason: collision with other inner class name */
    class C2883a extends m<e, p> {
        C2883a(Class cls) {
            super(cls);
        }

        @Override // nk.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(p pVar) {
            return new tk.d(pVar.Y().C());
        }
    }

    class b extends d.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        @Override // nk.d.a
        public Map<String, d.a.C3379a<q>> c() {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new d.a.C3379a(q.Y().G(64).build(), l.b.TINK));
            map.put("AES256_SIV_RAW", new d.a.C3379a(q.Y().G(64).build(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return p.a0().G(h.i(tk.p.c(qVar.X()))).H(a.this.k()).build();
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(h hVar) {
            return q.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // nk.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) throws InvalidAlgorithmParameterException {
            if (qVar.X() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.X() + ". Valid keys must have 64 bytes.");
        }
    }

    a() {
        super(p.class, new C2883a(e.class));
    }

    public static void m(boolean z15) {
        x.l(new a(), z15);
    }

    @Override // nk.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // nk.d
    public d.a<q, p> f() {
        return new b(q.class);
    }

    @Override // nk.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // nk.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p h(h hVar) {
        return p.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // nk.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) throws GeneralSecurityException {
        r.c(pVar.Z(), k());
        if (pVar.Y().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.Y().size() + ". Valid keys must have 64 bytes.");
    }
}
