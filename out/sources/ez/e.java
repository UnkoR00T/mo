package ez;

import fz.FormattedRangeDate;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lez/e;", "", "Lfz/b;", "dateType", "Lfz/c;", "formatType", "", "d", "(Lfz/b;Lfz/c;)Ljava/lang/String;", "Lfz/e;", "date", "Lfz/d;", "a", "(Lfz/e;)Lfz/d;", "Lfz/b$c;", "b", "(Lfz/b$c;)Ljava/lang/String;", "Ljava/time/OffsetDateTime;", "c", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    FormattedRangeDate a(fz.e date);

    String b(fz.b.LocalDate date);

    String c(OffsetDateTime date);

    String d(fz.b dateType, fz.c formatType);
}
