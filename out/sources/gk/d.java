package gk;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class d implements fk.w<fk.a, fk.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f73312a = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f73313b = new d();

    private static class b implements fk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fk.v<fk.a> f73314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qk.b.a f73315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qk.b.a f73316c;

        @Override // fk.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = tk.f.a(this.f73314a.e().b(), this.f73314a.e().g().a(bArr, bArr2));
                this.f73315b.a(this.f73314a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e15) {
                this.f73315b.b();
                throw e15;
            }
        }

        @Override // fk.a
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (fk.v.c<fk.a> cVar : this.f73314a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrDecrypt = cVar.g().decrypt(bArrCopyOfRange, bArr2);
                        this.f73316c.a(cVar.d(), bArrCopyOfRange.length);
                        return bArrDecrypt;
                    } catch (GeneralSecurityException e15) {
                        d.f73312a.info("ciphertext prefix matches a key, but cannot decrypt: " + e15);
                    }
                }
            }
            for (fk.v.c<fk.a> cVar2 : this.f73314a.h()) {
                try {
                    byte[] bArrDecrypt2 = cVar2.g().decrypt(bArr, bArr2);
                    this.f73316c.a(cVar2.d(), bArr.length);
                    return bArrDecrypt2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f73316c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        private b(fk.v<fk.a> vVar) {
            this.f73314a = vVar;
            if (!vVar.i()) {
                qk.b.a aVar = nk.f.f137050a;
                this.f73315b = aVar;
                this.f73316c = aVar;
            } else {
                qk.b bVarA = nk.g.b().a();
                qk.c cVarA = nk.f.a(vVar);
                this.f73315b = bVarA.a(cVarA, "aead", "encrypt");
                this.f73316c = bVarA.a(cVarA, "aead", "decrypt");
            }
        }
    }

    d() {
    }

    public static void e() {
        fk.x.n(f73313b);
    }

    @Override // fk.w
    public Class<fk.a> b() {
        return fk.a.class;
    }

    @Override // fk.w
    public Class<fk.a> c() {
        return fk.a.class;
    }

    @Override // fk.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public fk.a a(fk.v<fk.a> vVar) {
        return new b(vVar);
    }
}
