package wl0;

import ge4.x;
import gm0.PassportAgreementDetailsResponse;
import gm0.PassportAgreementResponse;
import gm0.PassportChildAgreementAttachmentConfigOutput;
import gm0.PassportChildAgreementGetChildDataResponse;
import gm0.PassportChildAgreementGetParentDataResponse;
import gm0.PassportChildAgreementInvalidateSignedRequest;
import gm0.PassportChildAgreementXmlRequest;
import gm0.PassportChildAgreementXmlResponse;
import gm0.SubmitPassportChildAgreementRequest;
import gm0.VerifyPassportChildAgreementRequest;
import gm0.VerifyPassportChildAgreementResponse;
import gm0.n5;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0005J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J*\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lwl0/f;", "", "Lge4/x;", "Lgm0/i3;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "agreementId", "Lgm0/c3;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lgm0/v3;", "passportChildAgreementInvalidateSignedRequest", "Loq/i0;", "i", "(Lgm0/v3;Ltq/e;)Ljava/lang/Object;", "Lgm0/s3;", "b", "Lgm0/n5;", "passportType", "childId", "Lgm0/r3;", "a", "(Lgm0/n5;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "externalAuthorizationToken", "Lgm0/w3;", "passportChildAgreementXmlRequest", "Lgm0/x3;", "e", "(Ljava/lang/String;Lgm0/w3;Ltq/e;)Ljava/lang/Object;", "Lgm0/m3;", "g", "(Lgm0/n5;Ltq/e;)Ljava/lang/Object;", "Lgm0/z6;", "submitPassportChildAgreementRequest", "d", "(Lgm0/z6;Ltq/e;)Ljava/lang/Object;", "Lgm0/h7;", "verifyPassportChildAgreementRequest", "Lgm0/i7;", "f", "(Lgm0/n5;Lgm0/h7;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    @ie4.f("document-management/mobile/api/passports/child/agreement/child-data/{passportType}/{childId}")
    Object a(@ie4.s("passportType") n5 n5Var, @ie4.s("childId") String str, tq.e<? super x<PassportChildAgreementGetChildDataResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/agreement/parent-data")
    Object b(tq.e<? super x<PassportChildAgreementGetParentDataResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/agreement/passport-agreements")
    Object c(tq.e<? super x<PassportAgreementResponse>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/agreement/submit")
    Object d(@ie4.a SubmitPassportChildAgreementRequest submitPassportChildAgreementRequest, tq.e<? super x<i0>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/agreement/generate-xml")
    Object e(@ie4.i("External-Authorization-Token") String str, @ie4.a PassportChildAgreementXmlRequest passportChildAgreementXmlRequest, tq.e<? super x<PassportChildAgreementXmlResponse>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/agreement/child-agreement/{passportType}/verify")
    Object f(@ie4.s("passportType") n5 n5Var, @ie4.a VerifyPassportChildAgreementRequest verifyPassportChildAgreementRequest, tq.e<? super x<VerifyPassportChildAgreementResponse>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/agreement/{passportType}/attachments/config")
    Object g(@ie4.s("passportType") n5 n5Var, tq.e<? super x<PassportChildAgreementAttachmentConfigOutput>> eVar);

    @ie4.f("document-management/mobile/api/passports/child/agreement/passport-agreement/{agreementId}")
    Object h(@ie4.s("agreementId") String str, tq.e<? super x<PassportAgreementDetailsResponse>> eVar);

    @ie4.o("document-management/mobile/api/passports/child/agreement/invalidate")
    Object i(@ie4.a PassportChildAgreementInvalidateSignedRequest passportChildAgreementInvalidateSignedRequest, tq.e<? super x<i0>> eVar);
}
