package pl.gov.coi.common.network;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/common/network/f;", "Lpl/gov/coi/common/network/e;", "Liy/d0;", "signatureVerifier", "Lpx/d;", "remoteLogger", "<init>", "(Liy/d0;Lpx/d;)V", "Ljava/security/cert/X509CRL;", "crl", "Ljava/security/cert/X509Certificate;", "issuer", "", "a", "(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;)Z", "Liy/d0;", "b", "Lpx/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.d0 signatureVerifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    public f(iy.d0 d0Var, px.d dVar) {
        this.signatureVerifier = d0Var;
        this.remoteLogger = dVar;
    }

    @Override // pl.gov.coi.common.network.e
    public boolean a(X509CRL crl, X509Certificate issuer) {
        try {
            ry.n nVarA = u0.a(crl.getSigAlgOID());
            if (nVarA != null) {
                return this.signatureVerifier.a(crl.getTBSCertList(), crl.getSignature(), issuer.getPublicKey(), nVarA);
            }
            px.b.y5(this.remoteLogger, "Unsupported CRL signature algorithm: " + crl.getSigAlgOID(), null, px.c.a(this), 2, null);
            return false;
        } catch (CancellationException e15) {
            throw e15;
        } catch (Exception e16) {
            this.remoteLogger.T6("CRL signature verification error: " + e16.getMessage(), e16, px.c.a(this));
            return false;
        }
    }
}
