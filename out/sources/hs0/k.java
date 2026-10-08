package hs0;

import fv.e0;
import ge4.x;
import ie4.s;
import ie4.t;
import java.util.List;
import js0.TransactionDetailsDto;
import js0.TransactionDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ>\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lhs0/k;", "", "", "paymentId", "transactionId", "Lge4/x;", "Lfv/e0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljs0/c1;", "a", "", "pageNumber", "pageSize", "", "Ljs0/d1;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    @ie4.f("payment/mobile/api/payments/{paymentId}/transactions/{transactionId}")
    Object a(@s("paymentId") String str, @s("transactionId") String str2, tq.e<? super x<TransactionDetailsDto>> eVar);

    @ie4.f("payment/mobile/api/payments/{paymentId}/transactions/{transactionId}/confirmation")
    Object b(@s("paymentId") String str, @s("transactionId") String str2, tq.e<? super x<e0>> eVar);

    @ie4.f("payment/mobile/api/payments/{paymentId}/transactions")
    Object c(@s("paymentId") String str, @t("pageNumber") Integer num, @t("pageSize") Integer num2, tq.e<? super x<List<TransactionDto>>> eVar);
}
