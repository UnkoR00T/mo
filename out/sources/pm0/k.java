package pm0;

import al0.GroupedPassports;
import al0.InvalidatePassportRequest;
import al0.InvalidatedPassportResponse;
import al0.PassportVisualization;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0002H¦@¢\u0006\u0004\b\t\u0010\u0006J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lpm0/k;", "", "Ldx/i;", "Ldx/b;", "Lal0/a0;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "Lal0/t0;", "b", "Lal0/g0;", "invalidationPassportRequest", "Lal0/h0;", "c", "(Lal0/g0;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    Object a(tq.e<? super dx.i<? extends dx.b, GroupedPassports>> eVar);

    Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<PassportVisualization>>> eVar);

    Object c(InvalidatePassportRequest invalidatePassportRequest, tq.e<? super dx.i<? extends dx.b, InvalidatedPassportResponse>> eVar);
}
