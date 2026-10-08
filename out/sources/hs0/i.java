package hs0;

import fv.e0;
import ge4.x;
import ie4.o;
import ie4.s;
import ie4.t;
import java.util.List;
import js0.CheckWalletPaymentStatusResponse;
import js0.PaymentDetailsDto;
import js0.PaymentDto;
import js0.PaymentWidgetDataResponse;
import js0.h0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lhs0/i;", "", "", "transactionId", "Lge4/x;", "Ljs0/p;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "id", "Lfv/e0;", "c", "Ljs0/b0;", "d", "Ljs0/k0;", "e", "(Ltq/e;)Ljava/lang/Object;", "Ljs0/h0;", "paymentStatusGroup", "", "pageNumber", "", "Ljs0/c0;", "f", "(Ljs0/h0;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    @o("payment/mobile/api/payments/wallet/{transactionId}")
    Object b(@s("transactionId") String str, tq.e<? super x<CheckWalletPaymentStatusResponse>> eVar);

    @ie4.f("payment/mobile/api/payments/{id}/confirmation")
    Object c(@s("id") String str, tq.e<? super x<e0>> eVar);

    @ie4.f("payment/mobile/api/v3/payments/{id}")
    Object d(@s("id") String str, tq.e<? super x<PaymentDetailsDto>> eVar);

    @ie4.f("payment/mobile/api/payments-widget-data")
    Object e(tq.e<? super x<PaymentWidgetDataResponse>> eVar);

    @ie4.f("payment/mobile/api/v4/payments")
    Object f(@t("paymentStatusGroup") h0 h0Var, @t("pageNumber") Integer num, tq.e<? super x<List<PaymentDto>>> eVar);
}
