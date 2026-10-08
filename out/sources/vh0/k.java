package vh0;

import ge4.x;
import ie4.o;
import java.util.List;
import p071kotlin.Metadata;
import xh0.GenerateCertResponseDto;
import xh0.GenerateCertificateSignedRequestDto;
import xh0.RevokeUserCertificateMobileApiSignedRequestDto;
import xh0.RevokedCertificateMobileApiDtoDto;
import xh0.UserCertificateMobileApiDtoDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lvh0/k;", "", "Lxh0/o;", "generateCertificateSignedRequestDto", "Lge4/x;", "Lxh0/n;", "c", "(Lxh0/o;Ltq/e;)Ljava/lang/Object;", "a", "", "Lxh0/a0;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lxh0/x;", "revokeUserCertificateMobileApiSignedRequestDto", "Lxh0/y;", "d", "(Lxh0/x;Ltq/e;)Ljava/lang/Object;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    @o("authentication/mobile/api/user-certificates/refugee/generate")
    Object a(@ie4.a GenerateCertificateSignedRequestDto generateCertificateSignedRequestDto, tq.e<? super x<GenerateCertResponseDto>> eVar);

    @ie4.f("authentication/mobile/api/user-certificates")
    Object b(tq.e<? super x<List<UserCertificateMobileApiDtoDto>>> eVar);

    @o("authentication/mobile/api/user-certificates/generate")
    Object c(@ie4.a GenerateCertificateSignedRequestDto generateCertificateSignedRequestDto, tq.e<? super x<GenerateCertResponseDto>> eVar);

    @o("authentication/mobile/api/user-certificates/revoke")
    Object d(@ie4.a RevokeUserCertificateMobileApiSignedRequestDto revokeUserCertificateMobileApiSignedRequestDto, tq.e<? super x<RevokedCertificateMobileApiDtoDto>> eVar);
}
