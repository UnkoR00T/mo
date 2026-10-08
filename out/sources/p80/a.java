package p80;

import dx.b;
import dx.i;
import java.security.cert.X509Certificate;
import k80.GetVerificationSessionStatusResponse;
import k80.QrCode;
import k80.UserDataRequest;
import k80.VerificationCertificate;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\bJ<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\b¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lp80/a;", "", "", "sessionId", "Ldx/i;", "Ldx/b;", "Lk80/j;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "code", "Lk80/c;", "b", "sessionUuid", "Lk80/i;", "dataRequest", "Ljava/security/cert/X509Certificate;", "certificate", "Lry/c;", "certKeyPair", "Loq/i0;", "d", "(Ljava/lang/String;Lk80/i;Ljava/security/cert/X509Certificate;Lry/c;Ltq/e;)Ljava/lang/Object;", "Lk80/b;", "a", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, e<? super i<? extends b, GetVerificationSessionStatusResponse>> eVar);

    Object b(String str, e<? super i<? extends b, QrCode>> eVar);

    Object c(String str, e<? super i<? extends b, VerificationCertificate>> eVar);

    Object d(String str, UserDataRequest userDataRequest, X509Certificate x509Certificate, CertKeyPair certKeyPair, e<? super i<? extends b, i0>> eVar);
}
