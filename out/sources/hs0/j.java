package hs0;

import ge4.x;
import ie4.o;
import ie4.s;
import ie4.t;
import java.util.List;
import js0.CommitmentTypeDto;
import js0.CreateStampDutyRequestDto;
import js0.StampDutyDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lhs0/j;", "", "Ljs0/r;", "createStampDutyRequestDto", "Lge4/x;", "Ljs0/r0;", "b", "(Ljs0/r;Ltq/e;)Ljava/lang/Object;", "", "commitmentTypeName", "", "pageNumber", "", "Ljs0/q;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "paymentId", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    @o("payment/mobile/api/stamp-duty/{paymentId}/reject")
    Object a(@s("paymentId") String str, tq.e<? super x<i0>> eVar);

    @o("payment/mobile/api/stamp-duty")
    Object b(@ie4.a CreateStampDutyRequestDto createStampDutyRequestDto, tq.e<? super x<StampDutyDto>> eVar);

    @ie4.f("payment/mobile/api/stamp-duty/commitment-types")
    Object c(@t("commitmentTypeName") String str, @t("pageNumber") Integer num, tq.e<? super x<List<CommitmentTypeDto>>> eVar);
}
