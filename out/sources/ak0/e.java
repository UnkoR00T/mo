package ak0;

import ck0.CompanyActivityCategoriesDto;
import ck0.ElectronicDeliveryNonPublicSuppliersDto;
import ck0.SocialInsuranceFundsDto;
import ck0.TaxOfficesDto;
import ge4.x;
import ie4.f;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lak0/e;", "", "Lge4/x;", "Lck0/a;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lck0/b1;", "c", "Lck0/n1;", "e", "Lck0/p1;", "f", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @f("company/mobile/api/dictionaries/pkd")
    Object b(tq.e<? super x<CompanyActivityCategoriesDto>> eVar);

    @f("company/mobile/api/dictionaries/non-public-supplier")
    Object c(tq.e<? super x<ElectronicDeliveryNonPublicSuppliersDto>> eVar);

    @f("company/mobile/api/dictionaries/krus")
    Object e(tq.e<? super x<SocialInsuranceFundsDto>> eVar);

    @f("company/mobile/api/dictionaries/us")
    Object f(tq.e<? super x<TaxOfficesDto>> eVar);
}
