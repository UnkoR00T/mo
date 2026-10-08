package hs0;

import ge4.x;
import ie4.o;
import ie4.s;
import ie4.t;
import js0.CardPaymentResponse;
import js0.StartCardPaymentRequest;
import js0.StartCardPaymentResponse;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lhs0/b;", "", "", "transactionId", "institutionId", "Lge4/x;", "Ljs0/i;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljs0/t0;", "startCardPaymentRequest", "Ljs0/u0;", "b", "(Ljs0/t0;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @ie4.f("payment/mobile/api/card-payments/{transactionId}")
    Object a(@s("transactionId") String str, @t("institutionId") String str2, tq.e<? super x<CardPaymentResponse>> eVar);

    @o("payment/mobile/api/card-payments")
    Object b(@ie4.a StartCardPaymentRequest startCardPaymentRequest, tq.e<? super x<StartCardPaymentResponse>> eVar);

    @o("payment/mobile/api/card-payments/{transactionId}/error")
    Object c(@s("transactionId") String str, tq.e<? super x<i0>> eVar);
}
