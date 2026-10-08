package pm0;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import al0.BankRestrictionsSettings;
import al0.PhysicalIdCardRestrictions;
import dl0.BEBankRestrictionDrivingLicence;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0006J\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0006J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0012\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0014\u0010\u000bJ\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0006¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lpm0/e;", "", "Ldx/i;", "Ldx/b;", "Lal0/v0;", "d", "(Ltq/e;)Ljava/lang/Object;", "", "documentId", "Loq/i0;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "g", "Lal0/r;", "b", "", "Lal0/o;", "e", "passportId", "Lal0/p;", "h", "Ldl0/a;", "c", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object b(tq.e<? super dx.i<? extends dx.b, BankRestrictionsSettings>> eVar);

    Object c(tq.e<? super dx.i<? extends dx.b, BEBankRestrictionDrivingLicence>> eVar);

    Object d(tq.e<? super dx.i<? extends dx.b, PhysicalIdCardRestrictions>> eVar);

    Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<BankRestrictionPassport>>> eVar);

    Object f(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object g(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object h(String str, tq.e<? super dx.i<? extends dx.b, BankRestrictionPassportDocumentRestriction>> eVar);
}
