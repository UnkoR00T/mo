package wl0;

import ge4.x;
import gm0.BankRestrictionDrivingLicenceResponse;
import gm0.BankRestrictionPassportDocumentRestrictionDto;
import gm0.BankRestrictionPassportDto;
import gm0.BankRestrictionsSettingsDto;
import gm0.PhysicalIdCardRestrictionsDto;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\nJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0007J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0004H§@¢\u0006\u0004\b\u0012\u0010\nJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H§@¢\u0006\u0004\b\u0014\u0010\nJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0007¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lwl0/a;", "", "", "documentId", "Lge4/x;", "Loq/i0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lgm0/p;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lgm0/k;", "c", "passportId", "Lgm0/m;", "d", "", "Lgm0/n;", "e", "Lgm0/m6;", "a", "f", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @ie4.f("document-management/mobile/api/bank-restrictions/physical-id-card")
    Object a(tq.e<? super x<PhysicalIdCardRestrictionsDto>> eVar);

    @ie4.f("document-management/mobile/api/bank-restrictions/settings")
    Object b(tq.e<? super x<BankRestrictionsSettingsDto>> eVar);

    @ie4.f("document-management/mobile/api/bank-restrictions/driving-licences")
    Object c(tq.e<? super x<BankRestrictionDrivingLicenceResponse>> eVar);

    @ie4.f("document-management/mobile/api/bank-restrictions/passports/{passportId}")
    Object d(@ie4.s("passportId") String str, tq.e<? super x<BankRestrictionPassportDocumentRestrictionDto>> eVar);

    @ie4.f("document-management/mobile/api/bank-restrictions/passports")
    Object e(tq.e<? super x<List<BankRestrictionPassportDto>>> eVar);

    @ie4.o("document-management/mobile/api/bank-restrictions/{documentId}")
    Object f(@ie4.s("documentId") String str, tq.e<? super x<i0>> eVar);

    @ie4.b("document-management/mobile/api/bank-restrictions/{documentId}")
    Object g(@ie4.s("documentId") String str, tq.e<? super x<i0>> eVar);
}
