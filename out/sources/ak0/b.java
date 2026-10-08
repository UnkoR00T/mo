package ak0;

import ck0.CompanyDetailsResponseDto;
import ck0.CompanyPrintoutDto;
import ge4.x;
import ie4.f;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lak0/b;", "", "Lge4/x;", "Lck0/p0;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lck0/t0;", "b", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("company/mobile/api/company-details")
    Object a(tq.e<? super x<CompanyDetailsResponseDto>> eVar);

    @f("company/mobile/api/printout")
    Object b(tq.e<? super x<CompanyPrintoutDto>> eVar);
}
