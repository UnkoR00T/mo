package ms0;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import ur0.BEAlias;
import ur0.BEStartBlikPaymentRequest;
import ur0.BEStartOneClickBlikPaymentRequest;
import ur0.BEStartPaymentResult;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lms0/a;", "", "Ldx/i;", "Ldx/b;", "", "Lur0/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "transactionId", "Lur0/b;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lur0/e;", "startBlikPaymentRequest", "Lur0/g;", "c", "(Lur0/e;Ltq/e;)Ljava/lang/Object;", "Lur0/f;", "startOneClickBlikPaymentRequest", "d", "(Lur0/f;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(tq.e<? super i<? extends dx.b, ? extends List<BEAlias>>> eVar);

    Object b(String str, tq.e<? super i<? extends dx.b, ? extends ur0.b>> eVar);

    Object c(BEStartBlikPaymentRequest bEStartBlikPaymentRequest, tq.e<? super i<? extends dx.b, BEStartPaymentResult>> eVar);

    Object d(BEStartOneClickBlikPaymentRequest bEStartOneClickBlikPaymentRequest, tq.e<? super i<? extends dx.b, BEStartPaymentResult>> eVar);
}
