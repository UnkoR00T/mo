package wn;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Provider f214165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecureRandom f214166b;

    public a() {
        this(null, null);
    }

    public Provider a() {
        return this.f214165a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f214166b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    public void c(Provider provider) {
        this.f214165a = provider;
    }

    public a(Provider provider, SecureRandom secureRandom) {
        this.f214165a = provider;
        this.f214166b = secureRandom;
    }
}
