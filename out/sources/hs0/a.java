package hs0;

import ge4.x;
import ie4.o;
import ie4.s;
import java.util.List;
import js0.AliasDto;
import js0.BlikTransactionDto;
import js0.StartBlikPaymentRequestDto;
import js0.StartOneClickBlikPaymentRequestDto;
import js0.StartPaymentResultDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lhs0/a;", "", "Lge4/x;", "", "Ljs0/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "encodedTransactionId", "Ljs0/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljs0/z0;", "startOneClickBlikPaymentRequestDto", "Ljs0/a1;", "c", "(Ljs0/z0;Ltq/e;)Ljava/lang/Object;", "Ljs0/s0;", "startBlikPaymentRequestDto", "d", "(Ljs0/s0;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @ie4.f("payment/mobile/api/payments/blik/aliases")
    Object a(tq.e<? super x<List<AliasDto>>> eVar);

    @ie4.f("payment/mobile/api/payments/blik/{encodedTransactionId}")
    Object b(@s("encodedTransactionId") String str, tq.e<? super x<BlikTransactionDto>> eVar);

    @o("payment/mobile/api/payments/blik/one-click")
    Object c(@ie4.a StartOneClickBlikPaymentRequestDto startOneClickBlikPaymentRequestDto, tq.e<? super x<StartPaymentResultDto>> eVar);

    @o("payment/mobile/api/payments/blik")
    Object d(@ie4.a StartBlikPaymentRequestDto startBlikPaymentRequestDto, tq.e<? super x<StartPaymentResultDto>> eVar);
}
