package hs0;

import ge4.x;
import ie4.o;
import ie4.s;
import js0.GooglePaySendPaymentTokenRequest;
import js0.GooglePaySendPaymentTokenResponse;
import js0.StartGooglePayPaymentRequest;
import js0.StartGooglePayPaymentResponse;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lhs0/e;", "", "", "transactionId", "Lge4/x;", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljs0/t;", "googlePaySendPaymentTokenRequest", "Ljs0/u;", "b", "(Ljs0/t;Ltq/e;)Ljava/lang/Object;", "Ljs0/x0;", "startGooglePayPaymentRequest", "Ljs0/y0;", "c", "(Ljs0/x0;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @o("payment/mobile/api/payments/google-pay/{transactionId}/error")
    Object a(@s("transactionId") String str, tq.e<? super x<i0>> eVar);

    @o("payment/mobile/api/payments/google-pay/send-payment-token")
    Object b(@ie4.a GooglePaySendPaymentTokenRequest googlePaySendPaymentTokenRequest, tq.e<? super x<GooglePaySendPaymentTokenResponse>> eVar);

    @o("payment/mobile/api/payments/google-pay")
    Object c(@ie4.a StartGooglePayPaymentRequest startGooglePayPaymentRequest, tq.e<? super x<StartGooglePayPaymentResponse>> eVar);
}
