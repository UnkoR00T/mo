package g40;

import java.time.LocalDate;
import java.time.ZoneOffset;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lg40/b;", "Lg40/a;", "Ljava/time/LocalDate;", "minDate", "maxDate", "Lez/c;", "dateConverter", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lez/c;)V", "", "currentCalendarDate", "", "a", "(J)Z", "Ljava/time/LocalDate;", "getMinDate", "()Ljava/time/LocalDate;", "b", "getMaxDate", "c", "Lez/c;", "getDateConverter", "()Lez/c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocalDate minDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalDate maxDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    public b(LocalDate localDate, LocalDate localDate2, ez.c cVar) {
        this.minDate = localDate;
        this.maxDate = localDate2;
        this.dateConverter = cVar;
    }

    @Override // g40.a
    public boolean a(long currentCalendarDate) {
        LocalDate localDateN = this.dateConverter.n(currentCalendarDate, ZoneOffset.UTC);
        LocalDate localDate = this.minDate;
        if (!(localDate != null ? localDate.isBefore(localDateN) : true)) {
            LocalDate localDate2 = this.minDate;
            if (!(localDate2 != null ? localDate2.isEqual(localDateN) : true)) {
                return false;
            }
        }
        LocalDate localDate3 = this.maxDate;
        if (!(localDate3 != null ? localDate3.isAfter(localDateN) : true)) {
            LocalDate localDate4 = this.maxDate;
            if (!(localDate4 != null ? localDate4.isEqual(localDateN) : true)) {
                return false;
            }
        }
        return true;
    }
}
