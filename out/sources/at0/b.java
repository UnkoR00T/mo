package at0;

import dx.i;
import java.time.LocalDate;
import p071kotlin.Metadata;
import tq.e;
import ts0.RestrictionChecksPage;
import ts0.RestrictionStatusChangesPage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000f\u0010\tJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lat0/b;", "", "Ljava/time/LocalDate;", "dateFrom", "dateTo", "Ldx/i;", "Ldx/b;", "Lts0/j;", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "pageId", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lts0/o;", "c", "d", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, e<? super i<? extends dx.b, RestrictionChecksPage>> eVar);

    Object b(LocalDate localDate, LocalDate localDate2, e<? super i<? extends dx.b, RestrictionChecksPage>> eVar);

    Object c(LocalDate localDate, LocalDate localDate2, e<? super i<? extends dx.b, RestrictionStatusChangesPage>> eVar);

    Object d(String str, e<? super i<? extends dx.b, RestrictionStatusChangesPage>> eVar);
}
