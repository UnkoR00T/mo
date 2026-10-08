package dt3;

import et3.GenerateCertResponse;
import et3.GenerateCertificateSignedRequest;
import et3.RevokeUserCertificateMobileApiSignedRequest;
import et3.RevokedCertificateMobileApiDto;
import ge4.x;
import ie4.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Ldt3/e;", "", "Let3/i;", "generateCertificateSignedRequest", "Lge4/x;", "Let3/h;", "a", "(Let3/i;Ltq/e;)Ljava/lang/Object;", "Let3/m;", "revokeUserCertificateMobileApiSignedRequest", "Let3/n;", "b", "(Let3/m;Ltq/e;)Ljava/lang/Object;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @o("authentication/mobile/api/user-certificates/junior/generate")
    Object a(@ie4.a GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super x<GenerateCertResponse>> eVar);

    @o("authentication/mobile/api/user-certificates/revoke")
    Object b(@ie4.a RevokeUserCertificateMobileApiSignedRequest revokeUserCertificateMobileApiSignedRequest, tq.e<? super x<RevokedCertificateMobileApiDto>> eVar);
}
