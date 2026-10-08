package y00;

import java.security.Provider;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ly00/h0;", "", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Lz00/g;", "ocspCrlCertRevocationChecker", "Ljava/security/Provider;", "a", "(Liy/t;Ly00/i;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Lz00/g;)Ljava/security/Provider;", "c", "()Ljava/security/Provider;", "b", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h0 {
    Provider a(iy.t keyStoreProvider, i certUpdater, CertPinManager certPinManager, x nonCTTrustManagerProvider, z00.e ctVerificationChecker, z00.g ocspCrlCertRevocationChecker);

    Provider b();

    Provider c();
}
