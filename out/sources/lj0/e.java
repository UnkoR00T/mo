package lj0;

import ge4.x;
import ie4.s;
import ie4.t;
import nj0.MyCaseAdditionalDataDto;
import nj0.MyCasesResponseDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Llj0/e;", "", "", "caseId", "Lge4/x;", "Lnj0/c0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "pageId", "Lnj0/e0;", "a", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @ie4.f("citizen/mobile/api/my-cases")
    Object a(@t("pageId") String str, tq.e<? super x<MyCasesResponseDto>> eVar);

    @ie4.f("citizen/mobile/api/my-cases/{caseId}/additional-data")
    Object b(@s("caseId") String str, tq.e<? super x<MyCaseAdditionalDataDto>> eVar);
}
