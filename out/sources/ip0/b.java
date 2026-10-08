package ip0;

import ge4.x;
import ie4.o;
import lp0.CommonRequestGetPackageRequestDto;
import lp0.CommonRequestInstitutionAndCertDataRequestDto;
import lp0.CommonRequestInstitutionDataRequestDtoDto;
import lp0.CommonRequestSetPackageDownloadedRequestDto;
import lp0.GetPackageResponseDto;
import lp0.InstitutionAndCertDataResponseDto;
import lp0.InstitutionDataResponseDtoDto;
import lp0.SetPackageDownloadedResponseDto;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lip0/b;", "", "Llp0/i;", "commonRequestInstitutionAndCertDataRequestDto", "Lge4/x;", "Llp0/w;", "c", "(Llp0/i;Ltq/e;)Ljava/lang/Object;", "Llp0/j;", "commonRequestInstitutionDataRequestDtoDto", "Llp0/b0;", "a", "(Llp0/j;Ltq/e;)Ljava/lang/Object;", "Llp0/h;", "commonRequestGetPackageRequestDto", "Llp0/s;", "b", "(Llp0/h;Ltq/e;)Ljava/lang/Object;", "Llp0/k;", "commonRequestSetPackageDownloadedRequestDto", "Llp0/k0;", "d", "(Llp0/k;Ltq/e;)Ljava/lang/Object;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @o("FrontSrv/rs/post/getInstitutionData")
    Object a(@ie4.a CommonRequestInstitutionDataRequestDtoDto commonRequestInstitutionDataRequestDtoDto, e<? super x<InstitutionDataResponseDtoDto>> eVar);

    @o("FrontSrv/rs/post/getPackage")
    Object b(@ie4.a CommonRequestGetPackageRequestDto commonRequestGetPackageRequestDto, e<? super x<GetPackageResponseDto>> eVar);

    @o("FrontSrv/rs/post/getInstitutionCardAndCert")
    Object c(@ie4.a CommonRequestInstitutionAndCertDataRequestDto commonRequestInstitutionAndCertDataRequestDto, e<? super x<InstitutionAndCertDataResponseDto>> eVar);

    @o("FrontSrv/rs/post/setPackageDownloaded")
    Object d(@ie4.a CommonRequestSetPackageDownloadedRequestDto commonRequestSetPackageDownloadedRequestDto, e<? super x<SetPackageDownloadedResponseDto>> eVar);
}
