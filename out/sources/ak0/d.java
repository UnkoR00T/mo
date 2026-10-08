package ak0;

import ck0.CompanyRepresentativesResponseDto;
import ck0.ModifyCompanyRepresentativeRequestDto;
import ck0.RepresentativeRemovalStatementResponseDto;
import ge4.x;
import ie4.f;
import ie4.p;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lak0/d;", "", "", "entryId", "representativeId", "Lge4/x;", "Lck0/l1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lck0/v0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lck0/g1;", "modifyCompanyRepresentativeRequestDto", "Loq/i0;", "c", "(Lck0/g1;Ltq/e;)Ljava/lang/Object;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @f("company/mobile/api/companies/{entryId}/representatives/{representativeId}/removal-statement")
    Object a(@s("entryId") String str, @s("representativeId") String str2, tq.e<? super x<RepresentativeRemovalStatementResponseDto>> eVar);

    @f("company/mobile/api/companies/{entryId}/representatives")
    Object b(@s("entryId") String str, tq.e<? super x<CompanyRepresentativesResponseDto>> eVar);

    @p("company/mobile/api/companies/representatives")
    Object c(@ie4.a ModifyCompanyRepresentativeRequestDto modifyCompanyRepresentativeRequestDto, tq.e<? super x<i0>> eVar);
}
