package y00;

import java.security.InvalidParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 &2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J7\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006'"}, d2 = {"Ly00/x;", "", "Lpx/b;", "logger", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "<init>", "(Lpx/b;Liy/t;Ly00/i;)V", "Liy/f0;", "storeType", "Ldx/i;", "Ldx/b;", "Ljavax/net/ssl/X509TrustManager;", "i", "(Liy/f0;)Ldx/i;", "Ljava/security/KeyStore;", "keyStore", "Ldx/b$e;", "d", "(Ljava/security/KeyStore;)Ldx/i;", "f", "Lkotlin/Function1;", "", "", "predicate", "h", "(Ljava/security/KeyStore;Ler/l;)Ldx/i;", "c", "()Ldx/i;", "a", "Lpx/b;", "b", "Liy/t;", "Ly00/i;", "Ljavax/net/ssl/X509TrustManager;", "trustManagerCache", "e", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.b logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i certUpdater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private X509TrustManager trustManagerCache;

    public x(px.b bVar, iy.t tVar, i iVar) {
        this.logger = bVar;
        this.keyStoreProvider = tVar;
        this.certUpdater = iVar;
    }

    private final dx.i<dx.b.Generic, X509TrustManager> d(KeyStore keyStore) {
        dx.i<dx.b.Generic, X509TrustManager> iVarH = h(keyStore, new er.l() { // from class: y00.v
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(x.e((String) obj));
            }
        });
        if (iVarH instanceof dx.i.Left) {
            return f(keyStore);
        }
        if (iVarH instanceof dx.i.Right) {
            return new dx.i.Right((X509TrustManager) ((dx.i.Right) iVarH).b());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(String str) {
        return fr.t.c(str, "AndroidNSSP");
    }

    private final dx.i<dx.b.Generic, X509TrustManager> f(KeyStore keyStore) {
        dx.i<dx.b.Generic, X509TrustManager> iVarH = h(keyStore, new er.l() { // from class: y00.w
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(x.g((String) obj));
            }
        });
        if (iVarH instanceof dx.i.Left) {
            return new dx.i.Left((dx.b.Generic) ((dx.i.Left) iVarH).b());
        }
        if (iVarH instanceof dx.i.Right) {
            return new dx.i.Right((X509TrustManager) ((dx.i.Right) iVarH).b());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(String str) {
        return !fr.t.c(str, "CertificateTransparencyProvider");
    }

    private final dx.i<dx.b.Generic, X509TrustManager> h(KeyStore keyStore, er.l<? super String, Boolean> predicate) {
        try {
            String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            for (Provider provider : Security.getProviders("TrustManagerFactory." + defaultAlgorithm)) {
                if (predicate.b(provider.getName()).booleanValue()) {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm, provider);
                    trustManagerFactory.init(keyStore);
                    for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                        if (trustManager instanceof X509TrustManager) {
                            return new dx.i.Right((X509TrustManager) trustManager);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (InvalidParameterException e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        } catch (IllegalArgumentException e16) {
            return new dx.i.Left(new dx.b.Generic(e16));
        } catch (NullPointerException e17) {
            return new dx.i.Left(new dx.b.Generic(e17));
        } catch (KeyStoreException e18) {
            return new dx.i.Left(new dx.b.Generic(e18));
        } catch (NoSuchAlgorithmException e19) {
            return new dx.i.Left(new dx.b.Generic(e19));
        } catch (NoSuchElementException e25) {
            return new dx.i.Left(new dx.b.Generic(e25));
        }
    }

    private final dx.i<dx.b, X509TrustManager> i(iy.f0 storeType) {
        dx.i iVarA = iy.t.a(this.keyStoreProvider, storeType, null, null, 6, null);
        if (iVarA instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVarA).b());
        }
        if (!(iVarA instanceof dx.i.Right)) {
            throw new oq.p();
        }
        dx.i<dx.b.Generic, X509TrustManager> iVarD = d(this.certUpdater.a((KeyStore) ((dx.i.Right) iVarA).b()));
        if (iVarD instanceof dx.i.Left) {
            return new dx.i.Left((dx.b.Generic) ((dx.i.Left) iVarD).b());
        }
        if (!(iVarD instanceof dx.i.Right)) {
            throw new oq.p();
        }
        X509TrustManager x509TrustManager = (X509TrustManager) ((dx.i.Right) iVarD).b();
        this.logger.n7("Used tm: " + x509TrustManager, px.c.a(this));
        this.trustManagerCache = x509TrustManager;
        return new dx.i.Right(x509TrustManager);
    }

    public final dx.i<dx.b, X509TrustManager> c() {
        X509TrustManager x509TrustManager = this.trustManagerCache;
        return x509TrustManager == null ? i(iy.f0.ANDROID_CA_STORE) : new dx.i.Right(x509TrustManager);
    }
}
