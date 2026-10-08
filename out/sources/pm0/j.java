package pm0;

import al0.ChildData;
import al0.s0;
import cl0.BEPassportChildApplicationAttachmentConfigResponse;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.BEPassportChildApplicationParentData;
import cl0.BEPassportChildApplicationStatusResponse;
import cl0.BEPassportChildApplicationSubmitOnlinePaymentResponse;
import cl0.BEPassportChildApplicationXmlRequest;
import cl0.PassportChildApplicationGetChildData;
import cl0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddress;
import cl0.g0;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0002H¦@¢\u0006\u0004\b\t\u0010\u0006J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0006J,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001cH¦@¢\u0006\u0004\b#\u0010$J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001cH¦@¢\u0006\u0004\b&\u0010$J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u00022\u0006\u0010'\u001a\u00020\fH¦@¢\u0006\u0004\b)\u0010*J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\fH¦@¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020.0\u00022\u0006\u0010+\u001a\u00020\fH¦@¢\u0006\u0004\b/\u0010*¨\u00060À\u0006\u0003"}, d2 = {"Lpm0/j;", "", "Ldx/i;", "Ldx/b;", "Lcl0/r;", "k", "(Ltq/e;)Ljava/lang/Object;", "", "Lal0/u;", "d", "Lal0/s0;", "passportType", "", "childId", "Lcl0/k0;", "e", "(Lal0/s0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcl0/g0;", "passportOfficePlace", "Lcl0/q;", "i", "(Lcl0/g0;Ltq/e;)Ljava/lang/Object;", "Lcl0/o;", "a", "Liy/b0;", "externalAuthorizationToken", "Lcl0/d0;", "passportChildApplicationXmlRequest", "Lry/a;", "c", "(Liy/b0;Lcl0/d0;Ltq/e;)Ljava/lang/Object;", "Lcl0/h;", "b", "(Lal0/s0;Ltq/e;)Ljava/lang/Object;", "signedRequest", "h", "(Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lcl0/b0;", "l", "recipientOfficeUnitCode", "Lcl0/l0;", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "applicationId", "g", "(Liy/b0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcl0/a0;", "f", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportChildApplicationCountryDictionary>>> eVar);

    Object b(s0 s0Var, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationAttachmentConfigResponse>> eVar);

    Object c(b0 b0Var, BEPassportChildApplicationXmlRequest bEPassportChildApplicationXmlRequest, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar);

    Object d(tq.e<? super dx.i<? extends dx.b, ? extends List<ChildData>>> eVar);

    Object e(s0 s0Var, String str, tq.e<? super dx.i<? extends dx.b, PassportChildApplicationGetChildData>> eVar);

    Object f(String str, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationStatusResponse>> eVar);

    Object g(b0 b0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar);

    Object h(b0 b0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, String>> eVar);

    Object i(g0 g0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<BEPassportChildApplicationOfficeDictionary>>> eVar);

    Object j(String str, tq.e<? super dx.i<? extends dx.b, PassportChildApplicationVerifyOfficeElectronicDeliveryAddress>> eVar);

    Object k(tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationParentData>> eVar);

    Object l(b0 b0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, BEPassportChildApplicationSubmitOnlinePaymentResponse>> eVar);
}
