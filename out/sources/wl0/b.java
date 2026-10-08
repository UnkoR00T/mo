package wl0;

import ge4.x;
import gm0.ChildBirthRegistrationCivilRegistryOfficesResponse;
import gm0.ChildBirthRegistrationGenerateXmlRequest;
import gm0.ChildBirthRegistrationGenerateXmlResponse;
import gm0.ChildBirthRegistrationInitialDataResponse;
import gm0.ChildBirthRegistrationMunicipalOfficesResponse;
import gm0.ChildBirthRegistrationSubmitApplicationRequest;
import gm0.ChildBirthRegistrationSubmitApplicationResponse;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\nJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lwl0/b;", "", "Lge4/x;", "Lgm0/b1;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "territorialCode", "Lgm0/e1;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "municipalTerritorialCode", "Lgm0/a0;", "d", "Lgm0/x0;", "childBirthRegistrationGenerateXmlRequest", "Lgm0/y0;", "c", "(Lgm0/x0;Ltq/e;)Ljava/lang/Object;", "externalAuthorizationToken", "Lgm0/f1;", "childBirthRegistrationSubmitApplicationRequest", "Lgm0/g1;", "e", "(Ljava/lang/String;Lgm0/f1;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @ie4.f("document-management/mobile/api/children/birth-registration/init-data")
    Object a(tq.e<? super x<ChildBirthRegistrationInitialDataResponse>> eVar);

    @ie4.f("document-management/mobile/api/children/birth-registration/municipal-offices/{territorialCode}")
    Object b(@ie4.s("territorialCode") String str, tq.e<? super x<ChildBirthRegistrationMunicipalOfficesResponse>> eVar);

    @ie4.o("document-management/mobile/api/children/birth-registration/generate-xml")
    Object c(@ie4.a ChildBirthRegistrationGenerateXmlRequest childBirthRegistrationGenerateXmlRequest, tq.e<? super x<ChildBirthRegistrationGenerateXmlResponse>> eVar);

    @ie4.f("document-management/mobile/api/children/birth-registration/civil-registry-offices/{municipalTerritorialCode}")
    Object d(@ie4.s("municipalTerritorialCode") String str, tq.e<? super x<ChildBirthRegistrationCivilRegistryOfficesResponse>> eVar);

    @ie4.o("document-management/mobile/api/children/birth-registration/submit")
    Object e(@ie4.i("External-Authorization-Token") String str, @ie4.a ChildBirthRegistrationSubmitApplicationRequest childBirthRegistrationSubmitApplicationRequest, tq.e<? super x<ChildBirthRegistrationSubmitApplicationResponse>> eVar);
}
