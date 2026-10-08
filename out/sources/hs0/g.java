package hs0;

import ge4.x;
import ie4.t;
import java.util.List;
import js0.InstitutionDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lhs0/g;", "", "", "commitmentTypeCode", "city", "", "pageNumber", "Lge4/x;", "", "Ljs0/x;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    @ie4.f("payment/mobile/api/institutions")
    Object a(@t("commitmentTypeCode") String str, @t("city") String str2, @t("pageNumber") Integer num, tq.e<? super x<List<InstitutionDto>>> eVar);
}
