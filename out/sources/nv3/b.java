package nv3;

import dx.i;
import java.security.cert.X509Certificate;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;
import xw.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lnv3/b;", "", "", "withValidCert", "Ldx/i;", "Ldx/b;", "Lpv3/a;", "a", "(ZLtq/e;)Ljava/lang/Object;", "identityType", "Lry/c;", "c", "(Lpv3/a;Ltq/e;)Ljava/lang/Object;", "Ljava/security/cert/X509Certificate;", "x509Cert", "Lxw/g;", "b", "(Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    static /* synthetic */ Object d(b bVar, boolean z15, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMainIdentityType");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return bVar.a(z15, eVar);
    }

    Object a(boolean z15, e<? super i<? extends dx.b, ? extends pv3.a>> eVar);

    Object b(X509Certificate x509Certificate, e<? super i<? extends dx.b, g>> eVar);

    Object c(pv3.a aVar, e<? super i<? extends dx.b, CertKeyPair>> eVar);
}
