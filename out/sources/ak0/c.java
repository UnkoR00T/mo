package ak0;

import ck0.OrderApplicationRequest;
import ck0.OrderApplicationResponse;
import ge4.x;
import ie4.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lak0/c;", "", "Lck0/i1;", "orderApplicationRequest", "Lge4/x;", "Lck0/j1;", "a", "(Lck0/i1;Ltq/e;)Ljava/lang/Object;", "c", "b", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @o("company/mobile/api/applications/order")
    Object a(@ie4.a OrderApplicationRequest orderApplicationRequest, tq.e<? super x<OrderApplicationResponse>> eVar);

    @o("company/mobile/api/applications/order/suspension")
    Object b(@ie4.a OrderApplicationRequest orderApplicationRequest, tq.e<? super x<OrderApplicationResponse>> eVar);

    @o("company/mobile/api/applications/order/resumption")
    Object c(@ie4.a OrderApplicationRequest orderApplicationRequest, tq.e<? super x<OrderApplicationResponse>> eVar);
}
