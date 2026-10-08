package y54;

import java.time.LocalDate;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/time/LocalDate;", "Ly54/f;", "period", "a", "(Ljava/time/LocalDate;Ly54/f;)Ljava/time/LocalDate;", "localnotifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final LocalDate a(LocalDate localDate, f fVar) {
        if (fVar instanceof f.After) {
            return localDate.plusDays(((f.After) fVar).getDays());
        }
        if (fVar instanceof f.Before) {
            return localDate.minusDays(((f.Before) fVar).getDays());
        }
        if (fVar instanceof f.OnTime) {
            return localDate;
        }
        throw new p();
    }
}
