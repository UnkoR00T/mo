package wn;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Provider f214167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Provider f214168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Provider f214169e;

    public b() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f214168d;
        return provider != null ? provider : a();
    }

    public Provider e() {
        Provider provider = this.f214167c;
        return provider != null ? provider : a();
    }

    public Provider f() {
        Provider provider = this.f214169e;
        return provider != null ? provider : a();
    }

    public b(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f214167c = provider2;
        this.f214168d = provider3;
        this.f214169e = provider4;
    }
}
