package pm0;

import al0.PassportChildAgreementGetChildData;
import al0.s0;
import er.p;
import iy.b0;
import java.util.List;
import jl0.BEPassportAgreement;
import jl0.BEPassportAgreementDetails;
import jl0.PassportChildAgreementAttachmentConfigOutputModel;
import jl0.PassportChildAgreementParentData;
import jl0.PassportChildAgreementXmlRequest;
import jl0.SubmitPassportChildAgreementRequest;
import jl0.VerifyPassportChildApplicationAgreementRequest;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2.\u0010\u0012\u001a*\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0007J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b!\u0010\"J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010)\u001a\u00020(H¦@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0\u00022\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lpm0/i;", "", "Ldx/i;", "Ldx/b;", "", "Ljl0/a;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "agreementId", "Ljl0/c;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "challenge", "Lkotlin/Function2;", "Liy/b0;", "Ltq/e;", "Lry/a;", "signBase64", "Loq/i0;", "f", "(Ljava/lang/String;Ljava/lang/String;Ler/p;Ltq/e;)Ljava/lang/Object;", "Ljl0/w;", "e", "Lal0/s0;", "passportType", "childId", "Lal0/k0;", "i", "(Lal0/s0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljl0/z;", "request", "", "j", "(Lal0/s0;Ljl0/z;Ltq/e;)Ljava/lang/Object;", "externalAuthorizationToken", "Ljl0/x;", "passportChildAgreementXmlRequest", "d", "(Liy/b0;Ljl0/x;Ltq/e;)Ljava/lang/Object;", "Ljl0/y;", "submitPassportChildAgreementRequest", "g", "(Ljl0/y;Ltq/e;)Ljava/lang/Object;", "Ljl0/s;", "b", "(Lal0/s0;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    Object b(s0 s0Var, tq.e<? super dx.i<? extends dx.b, PassportChildAgreementAttachmentConfigOutputModel>> eVar);

    Object c(tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportAgreement>>> eVar);

    Object d(b0 b0Var, PassportChildAgreementXmlRequest passportChildAgreementXmlRequest, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar);

    Object e(tq.e<? super dx.i<? extends dx.b, PassportChildAgreementParentData>> eVar);

    Object f(String str, String str2, p<? super b0, ? super tq.e<? super dx.i<? extends dx.b, ry.a>>, ? extends Object> pVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object g(SubmitPassportChildAgreementRequest submitPassportChildAgreementRequest, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object h(String str, tq.e<? super dx.i<? extends dx.b, BEPassportAgreementDetails>> eVar);

    Object i(s0 s0Var, String str, tq.e<? super dx.i<? extends dx.b, PassportChildAgreementGetChildData>> eVar);

    Object j(s0 s0Var, VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar);
}
