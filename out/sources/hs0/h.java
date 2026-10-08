package hs0;

import ge4.x;
import ie4.s;
import js0.PaymentsPackageDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lhs0/h;", "", "", "paymentPackageId", "Lge4/x;", "Ljs0/l0;", "a", "(JLtq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    @ie4.f("payment/mobile/api/v2/payments-packages/{paymentPackageId}")
    Object a(@s("paymentPackageId") long j15, tq.e<? super x<PaymentsPackageDto>> eVar);
}
