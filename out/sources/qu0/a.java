package qu0;

import ge4.x;
import ie4.f;
import ie4.t;
import java.util.List;
import p071kotlin.Metadata;
import su0.TicketDto;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lqu0/a;", "", "", "pageNumber", "paymentStatus", "Lge4/x;", "", "Lsu0/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "taxservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("tax/mobile/api/v2/tickets")
    Object a(@t("pageNumber") String str, @t("paymentStatus") String str2, e<? super x<List<TicketDto>>> eVar);
}
