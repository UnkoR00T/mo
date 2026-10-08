package ji2;

import ii2.d;
import ii2.e;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.InvalidKeySpecException;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f103401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103404d;

    /* JADX INFO: renamed from: ji2.a$a, reason: collision with other inner class name */
    public static final class C2442a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Provider f103405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f103406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f103407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f103408d;

        /* JADX INFO: Access modifiers changed from: private */
        public String f() {
            return this.f103406b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g() {
            return this.f103407c.intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            return this.f103408d.intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Provider i() {
            return this.f103405a;
        }

        public a e() {
            return new a(this);
        }

        public C2442a j(String str) {
            this.f103406b = str;
            return this;
        }

        public C2442a k(int i15) {
            this.f103407c = Integer.valueOf(i15);
            return this;
        }

        public C2442a l(int i15) {
            this.f103408d = Integer.valueOf(i15);
            return this;
        }

        public C2442a m(Provider provider) {
            this.f103405a = provider;
            return this;
        }

        private C2442a() {
        }
    }

    public static C2442a b() {
        return new C2442a();
    }

    private SecretKeyFactory c(String str) {
        try {
            Provider provider = this.f103401a;
            return provider != null ? SecretKeyFactory.getInstance(str, provider) : SecretKeyFactory.getInstance(str);
        } catch (NoSuchAlgorithmException e15) {
            throw new d(String.format("Failed to obtain %s SecretKeyFactory instance.", str), e15);
        }
    }

    public SecretKey a(char[] cArr, byte[] bArr) {
        try {
            return c(this.f103402b).generateSecret(new PBEKeySpec(cArr, bArr, this.f103403c, this.f103404d));
        } catch (InvalidKeySpecException e15) {
            throw new e(e15);
        }
    }

    private a(C2442a c2442a) {
        this.f103401a = c2442a.i();
        String strF = c2442a.f();
        Objects.requireNonNull(strF);
        this.f103402b = strF;
        this.f103403c = c2442a.g();
        this.f103404d = c2442a.h();
    }
}
