package ai0;

import java.util.List;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import th0.GenerateCertResponse;
import th0.GenerateCertificateSignedRequest;
import th0.RevokeUserCertificateMobileApiRequest;
import th0.RevokeUserCertificateMobileApiResponse;
import th0.UserCertificateMobileApi;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\r\u0010\fJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lai0/j;", "", "Ldx/i;", "Ldx/b;", "", "Lth0/t;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lth0/j;", "request", "Lth0/i;", "d", "(Lth0/j;Ltq/e;)Ljava/lang/Object;", "c", "Lth0/r;", "Lry/c;", "certKeyPair", "Lth0/s;", "b", "(Lth0/r;Lry/c;Ltq/e;)Ljava/lang/Object;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<UserCertificateMobileApi>>> eVar);

    Object b(RevokeUserCertificateMobileApiRequest revokeUserCertificateMobileApiRequest, CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, RevokeUserCertificateMobileApiResponse>> eVar);

    Object c(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super dx.i<? extends dx.b, GenerateCertResponse>> eVar);

    Object d(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super dx.i<? extends dx.b, GenerateCertResponse>> eVar);
}
