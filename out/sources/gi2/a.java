package gi2;

import ii2.e;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f73248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f73249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecureRandom f73250c;

    /* JADX INFO: renamed from: gi2.a$a, reason: collision with other inner class name */
    public static final class C1677a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Provider f73251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f73252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SecureRandom f73253c;

        /* JADX INFO: Access modifiers changed from: private */
        public c e() {
            return this.f73252b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider f() {
            return this.f73251a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SecureRandom g() {
            SecureRandom secureRandom = this.f73253c;
            return secureRandom != null ? secureRandom : li2.b.a();
        }

        public a d() {
            return new a(this);
        }

        public C1677a h(c cVar) {
            this.f73252b = cVar;
            return this;
        }

        public C1677a i(Provider provider) {
            this.f73251a = provider;
            return this;
        }

        private C1677a() {
        }
    }

    public a(C1677a c1677a) {
        Provider providerF = c1677a.f();
        this.f73248a = providerF;
        c cVarE = c1677a.e();
        Objects.requireNonNull(cVarE);
        this.f73249b = cVarE;
        this.f73250c = c1677a.g();
        if (providerF == null) {
            ki2.a.a("Cipher", cVarE.g());
        } else {
            ki2.a.b(providerF, "Cipher", cVarE.g());
        }
    }

    public static C1677a c() {
        return new C1677a();
    }

    private Cipher d() {
        try {
            return this.f73249b.k(this.f73248a);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e15) {
            throw new ii2.d(String.format("Failed to obtain %s Cipher instance.", this.f73249b.g()), e15);
        }
    }

    public byte[] a(byte[] bArr, SecretKey secretKey, int i15) {
        Cipher cipherD = d();
        try {
            this.f73249b.j(cipherD, 2, secretKey, Arrays.copyOfRange(bArr, bArr.length - this.f73249b.e(), bArr.length));
            byte[] bArrDoFinal = cipherD.doFinal(bArr, 0, bArr.length - this.f73249b.e());
            return i15 > 0 ? Arrays.copyOfRange(bArrDoFinal, i15, bArrDoFinal.length) : bArrDoFinal;
        } catch (GeneralSecurityException e15) {
            throw new e(e15);
        }
    }

    public byte[] b(byte[] bArr, SecretKey secretKey, int i15) {
        Cipher cipherD = d();
        byte[] bArrB = li2.a.b(this.f73249b.e(), this.f73250c);
        try {
            this.f73249b.j(cipherD, 1, secretKey, bArrB);
            return Arrays.concatenate(i15 > 0 ? cipherD.update(li2.a.b(i15, this.f73250c)) : null, cipherD.doFinal(bArr), bArrB);
        } catch (GeneralSecurityException e15) {
            throw new e(e15);
        }
    }
}
