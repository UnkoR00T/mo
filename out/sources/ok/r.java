package ok;

import fk.t;
import fk.v;
import fk.w;
import fk.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
class r implements w<t, t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f146456a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f146457b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f146458c = new r();

    private static class b implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v<t> f146459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qk.b.a f146460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qk.b.a f146461c;

        @Override // fk.t
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f146461c.b();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c<t> cVar : this.f146459a.f(bArrCopyOf)) {
                byte[] bArrA = cVar.f().equals(i0.LEGACY) ? tk.f.a(bArr2, r.f146457b) : bArr2;
                try {
                    cVar.g().a(bArrCopyOfRange, bArrA);
                    this.f146461c.a(cVar.d(), bArrA.length);
                    return;
                } catch (GeneralSecurityException e15) {
                    r.f146456a.info("tag prefix matches a key, but cannot verify: " + e15);
                }
            }
            for (v.c<t> cVar2 : this.f146459a.h()) {
                try {
                    cVar2.g().a(bArr, bArr2);
                    this.f146461c.a(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f146461c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // fk.t
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.f146459a.e().f().equals(i0.LEGACY)) {
                bArr = tk.f.a(bArr, r.f146457b);
            }
            try {
                byte[] bArrA = tk.f.a(this.f146459a.e().b(), this.f146459a.e().g().b(bArr));
                this.f146460b.a(this.f146459a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e15) {
                this.f146460b.b();
                throw e15;
            }
        }

        private b(v<t> vVar) {
            this.f146459a = vVar;
            if (!vVar.i()) {
                qk.b.a aVar = nk.f.f137050a;
                this.f146460b = aVar;
                this.f146461c = aVar;
            } else {
                qk.b bVarA = nk.g.b().a();
                qk.c cVarA = nk.f.a(vVar);
                this.f146460b = bVarA.a(cVarA, "mac", "compute");
                this.f146461c = bVarA.a(cVarA, "mac", "verify");
            }
        }
    }

    r() {
    }

    public static void f() {
        x.n(f146458c);
    }

    private void g(v<t> vVar) throws GeneralSecurityException {
        Iterator<List<v.c<t>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<t> cVar : it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    uk.a aVarA = uk.a.a(cVar.b());
                    if (!aVarA.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
    }

    @Override // fk.w
    public Class<t> b() {
        return t.class;
    }

    @Override // fk.w
    public Class<t> c() {
        return t.class;
    }

    @Override // fk.w
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t a(v<t> vVar) throws GeneralSecurityException {
        g(vVar);
        return new b(vVar);
    }
}
