package wl0;

import ge4.x;
import gm0.PassportChildApplicationAttachmentConfigResponse;
import gm0.PassportChildApplicationCountryDictionaryDto;
import gm0.PassportChildApplicationGetChildDataResponse;
import gm0.PassportChildApplicationGetChildrenResponse;
import gm0.PassportChildApplicationGetParentDataResponse;
import gm0.PassportChildApplicationOfficeDictionaryDto;
import gm0.PassportChildApplicationStatusResponse;
import gm0.PassportChildApplicationSubmitOnlinePaymentResponse;
import gm0.PassportChildApplicationSubmitResponse;
import gm0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto;
import gm0.PassportChildApplicationXmlRequest;
import gm0.PassportChildApplicationXmlResponse;
import gm0.SubmitPassportChildApplicationAfterOnlinePaymentRequest;
import gm0.SubmitPassportChildApplicationRequest;
import gm0.j5;
import gm0.n5;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@¢\u0006\u0004\b\r\u0010\u000bJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0007J*\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b%\u0010&J*\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'H§@¢\u0006\u0004\b*\u0010+J*\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'H§@¢\u0006\u0004\b-\u0010+J*\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020.H§@¢\u0006\u0004\b0\u00101¨\u00062À\u0006\u0003"}, d2 = {"Lwl0/g;", "", "", "applicationId", "Lge4/x;", "Lgm0/x4;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Lgm0/i4;", "l", "(Ltq/e;)Ljava/lang/Object;", "Lgm0/n4;", "j", "Lgm0/n5;", "passportType", "childId", "Lgm0/k4;", "b", "(Lgm0/n5;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lgm0/l4;", "k", "Lgm0/z3;", "d", "(Lgm0/n5;Ltq/e;)Ljava/lang/Object;", "Lgm0/j5;", "officePlace", "Lgm0/o4;", "g", "(Lgm0/j5;Ltq/e;)Ljava/lang/Object;", "recipientOfficeUnitCode", "Lgm0/b5;", "f", "externalAuthorizationToken", "Lgm0/c5;", "passportChildApplicationXmlRequest", "Lgm0/e5;", "a", "(Ljava/lang/String;Lgm0/c5;Ltq/e;)Ljava/lang/Object;", "Lgm0/b7;", "submitPassportChildApplicationRequest", "Lgm0/a5;", "h", "(Ljava/lang/String;Lgm0/b7;Ltq/e;)Ljava/lang/Object;", "Lgm0/y4;", "i", "Lgm0/a7;", "submitPassportChildApplicationAfterOnlinePaymentRequest", "c", "(Ljava/lang/String;Lgm0/a7;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    @ie4.o("document-management/mobile/api/passports/child/application/generate-xml")
    Object a(@ie4.i("External-Authorization-Token") String str, @ie4.a PassportChildApplicationXmlRequest passportChildApplicationXmlRequest, tq.e<? super x<PassportChildApplicationXmlResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/child-data/{passportType}/{childId}")
    Object b(@ie4.s("passportType") n5 n5Var, @ie4.s("childId") String str, tq.e<? super x<PassportChildApplicationGetChildDataResponse>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/application/submit/after-online-payment")
    Object c(@ie4.i("External-Authorization-Token") String str, @ie4.a SubmitPassportChildApplicationAfterOnlinePaymentRequest submitPassportChildApplicationAfterOnlinePaymentRequest, tq.e<? super x<PassportChildApplicationSubmitResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/{passportType}/attachments/config")
    Object d(@ie4.s("passportType") n5 n5Var, tq.e<? super x<PassportChildApplicationAttachmentConfigResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/{applicationId}/status")
    Object e(@ie4.s("applicationId") String str, tq.e<? super x<PassportChildApplicationStatusResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/offices/{recipientOfficeUnitCode}/verify-edor")
    Object f(@ie4.s("recipientOfficeUnitCode") String str, tq.e<? super x<PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/offices/{officePlace}")
    Object g(@ie4.s("officePlace") j5 j5Var, tq.e<? super x<List<PassportChildApplicationOfficeDictionaryDto>>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/application/submit")
    Object h(@ie4.i("External-Authorization-Token") String str, @ie4.a SubmitPassportChildApplicationRequest submitPassportChildApplicationRequest, tq.e<? super x<PassportChildApplicationSubmitResponse>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/application/submit/online-payment")
    Object i(@ie4.i("External-Authorization-Token") String str, @ie4.a SubmitPassportChildApplicationRequest submitPassportChildApplicationRequest, tq.e<? super x<PassportChildApplicationSubmitOnlinePaymentResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/parent-data")
    Object j(tq.e<? super x<PassportChildApplicationGetParentDataResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/children")
    Object k(tq.e<? super x<PassportChildApplicationGetChildrenResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/application/countries")
    Object l(tq.e<? super x<List<PassportChildApplicationCountryDictionaryDto>>> eVar);
}
