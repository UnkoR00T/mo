package ji2;

import ii2.d;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f103409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecureRandom f103410b;

    public c(Provider provider) {
        this(provider, li2.b.a());
    }

    private KeyPairGenerator b() {
        try {
            Provider provider = this.f103409a;
            return provider != null ? KeyPairGenerator.getInstance("RSA", provider) : KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e15) {
            throw new d("Failed to obtain RSA KeyPairGenerator instance.", e15);
        }
    }

    public KeyPair a(int i15) {
        KeyPairGenerator keyPairGeneratorB = b();
        keyPairGeneratorB.initialize(i15, this.f103410b);
        return keyPairGeneratorB.generateKeyPair();
    }

    public c(Provider provider, SecureRandom secureRandom) {
        Objects.requireNonNull(provider, "Provider must not be null.");
        this.f103409a = provider;
        Objects.requireNonNull(secureRandom, "Random must not be null.");
        this.f103410b = secureRandom;
        ki2.a.b(provider, "KeyPairGenerator", "RSA");
    }
}
