package y00;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly00/g0;", "Ly00/f0;", "Ly00/h0;", "securityProviderFactory", "Lpx/b;", "logger", "<init>", "(Ly00/h0;Lpx/b;)V", "Loq/i0;", "a", "()V", "", "c", "()Z", "Ly00/h0;", "b", "Lpx/b;", "Z", "initialized", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.b logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile boolean initialized;

    public g0(h0 h0Var, px.b bVar) {
        this.securityProviderFactory = h0Var;
        this.logger = bVar;
    }

    @Override // y00.l0
    public void a() {
        synchronized (this) {
            try {
                if (this.initialized) {
                    return;
                }
                try {
                    for (Provider provider : Security.getProviders()) {
                        if (fr.t.c(provider.getName(), BouncyCastleProvider.PROVIDER_NAME)) {
                            Security.removeProvider(provider.getName());
                        }
                    }
                    Security.insertProviderAt(this.securityProviderFactory.b(), 1);
                    Security.insertProviderAt(this.securityProviderFactory.c(), 1);
                    this.initialized = true;
                } catch (Exception e15) {
                    this.initialized = false;
                    this.logger.T6("Couldn't initialize early SecurityProvider: " + e15.getMessage(), e15, px.c.a(this));
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // y00.l0
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getInitialized() {
        return this.initialized;
    }
}
