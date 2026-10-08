package ak0;

import ck0.CompanyApplicationResumptionRequest;
import ck0.CompanyApplicationResumptionV2Request;
import ck0.CompanyApplicationSetupCitizenDataDto;
import ck0.CompanyApplicationSuspensionRequest;
import ck0.CompanyApplicationSuspensionV2Request;
import ck0.GenerateApplicationResponse;
import ck0.GenerateApplicationSetupRequest;
import ck0.GenerateApplicationSetupV2Request;
import ge4.x;
import ie4.f;
import ie4.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lak0/a;", "", "Lck0/d1;", "generateApplicationSetupRequest", "Lge4/x;", "Lck0/c1;", "c", "(Lck0/d1;Ltq/e;)Ljava/lang/Object;", "Lck0/e1;", "generateApplicationSetupV2Request", "g", "(Lck0/e1;Ltq/e;)Ljava/lang/Object;", "Lck0/x;", "companyApplicationResumptionRequest", "d", "(Lck0/x;Ltq/e;)Ljava/lang/Object;", "Lck0/y;", "companyApplicationResumptionV2Request", "b", "(Lck0/y;Ltq/e;)Ljava/lang/Object;", "Lck0/f0;", "companyApplicationSuspensionRequest", "f", "(Lck0/f0;Ltq/e;)Ljava/lang/Object;", "Lck0/g0;", "companyApplicationSuspensionV2Request", "e", "(Lck0/g0;Ltq/e;)Ljava/lang/Object;", "Lck0/c0;", "a", "(Ltq/e;)Ljava/lang/Object;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("company/mobile/api/applications/citizen-data")
    Object a(tq.e<? super x<CompanyApplicationSetupCitizenDataDto>> eVar);

    @o("company/mobile/api/applications/generate/resumption/v2")
    Object b(@ie4.a CompanyApplicationResumptionV2Request companyApplicationResumptionV2Request, tq.e<? super x<GenerateApplicationResponse>> eVar);

    @o("company/mobile/api/applications/generate")
    @oq.a
    Object c(@ie4.a GenerateApplicationSetupRequest generateApplicationSetupRequest, tq.e<? super x<GenerateApplicationResponse>> eVar);

    @o("company/mobile/api/applications/generate/resumption")
    @oq.a
    Object d(@ie4.a CompanyApplicationResumptionRequest companyApplicationResumptionRequest, tq.e<? super x<GenerateApplicationResponse>> eVar);

    @o("company/mobile/api/applications/generate/suspension/v2")
    Object e(@ie4.a CompanyApplicationSuspensionV2Request companyApplicationSuspensionV2Request, tq.e<? super x<GenerateApplicationResponse>> eVar);

    @o("company/mobile/api/applications/generate/suspension")
    @oq.a
    Object f(@ie4.a CompanyApplicationSuspensionRequest companyApplicationSuspensionRequest, tq.e<? super x<GenerateApplicationResponse>> eVar);

    @o("company/mobile/api/applications/generate/v2")
    Object g(@ie4.a GenerateApplicationSetupV2Request generateApplicationSetupV2Request, tq.e<? super x<GenerateApplicationResponse>> eVar);
}
