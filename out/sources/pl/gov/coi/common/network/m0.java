package pl.gov.coi.common.network;

import java.security.cert.X509Certificate;
import org.bouncycastle.cert.ocsp.SingleResp;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/m0;", "", "", "ocspUrl", "Ljava/security/cert/X509Certificate;", "cert", "issuer", "Ldx/i;", "Ldx/b;", "Lorg/bouncycastle/cert/ocsp/SingleResp;", "a", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m0 {
    Object a(String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, tq.e<? super dx.i<? extends dx.b, ? extends SingleResp>> eVar);
}
