package lk;

import fk.e;
import fk.v;
import fk.w;
import fk.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import nk.f;
import nk.g;

/* JADX INFO: loaded from: classes4.dex */
public class c implements w<e, e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f118648a = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f118649b = new c();

    private static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v<e> f118650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qk.b.a f118651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qk.b.a f118652c;

        public a(v<e> vVar) {
            this.f118650a = vVar;
            if (!vVar.i()) {
                qk.b.a aVar = f.f137050a;
                this.f118651b = aVar;
                this.f118652c = aVar;
            } else {
                qk.b bVarA = g.b().a();
                qk.c cVarA = f.a(vVar);
                this.f118651b = bVarA.a(cVarA, "daead", "encrypt");
                this.f118652c = bVarA.a(cVarA, "daead", "decrypt");
            }
        }

        @Override // fk.e
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = tk.f.a(this.f118650a.e().b(), this.f118650a.e().g().a(bArr, bArr2));
                this.f118651b.a(this.f118650a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e15) {
                this.f118651b.b();
                throw e15;
            }
        }

        @Override // fk.e
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c<e> cVar : this.f118650a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = cVar.g().b(bArrCopyOfRange, bArr2);
                        this.f118652c.a(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e15) {
                        c.f118648a.info("ciphertext prefix matches a key, but cannot decrypt: " + e15);
                    }
                }
            }
            for (v.c<e> cVar2 : this.f118650a.h()) {
                try {
                    byte[] bArrB2 = cVar2.g().b(bArr, bArr2);
                    this.f118652c.a(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f118652c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        x.n(f118649b);
    }

    @Override // fk.w
    public Class<e> b() {
        return e.class;
    }

    @Override // fk.w
    public Class<e> c() {
        return e.class;
    }

    @Override // fk.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a(v<e> vVar) {
        return new a(vVar);
    }
}
