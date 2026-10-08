package z00;

import iy.t;
import java.security.Provider;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;
import y00.i;
import y00.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz00/b;", "Ljava/security/Provider;", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Lz00/g;", "ocspCrlCertRevocationChecker", "<init>", "(Liy/t;Ly00/i;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Lz00/g;)V", "a", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends Provider {
    public b(t tVar, i iVar, CertPinManager certPinManager, x xVar, e eVar, g gVar) {
        super("CertificateTransparencyProvider", 1.0d, "CT provider based on Conscrypt. Provides custom http trust manager factory.");
        putService(new c(this, tVar, iVar, certPinManager, xVar, eVar, gVar));
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> b() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> c() {
        return super.keySet();
    }

    public /* bridge */ int e() {
        return super.size();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return b();
    }

    public /* bridge */ Collection<Object> g() {
        return super.values();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return c();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return g();
    }
}
