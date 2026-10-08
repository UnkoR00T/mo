package b20;

import android.annotation.SuppressLint;
import fr.k;
import fz.FormattedRangeDate;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lb20/e;", "Lez/e;", "Lez/c;", "dateConverter", "Lez/f;", "dateLabelProvider", "Lfz/b$c;", "nowDate", "<init>", "(Lez/c;Lez/f;Lfz/b$c;)V", "Lfz/e$a;", "Lfz/d;", "e", "(Lfz/e$a;)Lfz/d;", "Lfz/b;", "dateType", "Lfz/c;", "formatType", "", "d", "(Lfz/b;Lfz/c;)Ljava/lang/String;", "Lfz/e;", "date", "a", "(Lfz/e;)Lfz/d;", "b", "(Lfz/b$c;)Ljava/lang/String;", "Ljava/time/OffsetDateTime;", "c", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "Lez/c;", "getDateConverter", "()Lez/c;", "Lez/f;", "getDateLabelProvider", "()Lez/f;", "Lfz/b$c;", "getNowDate", "()Lfz/b$c;", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements ez.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.f dateLabelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fz.b.LocalDate nowDate;

    public e(ez.c cVar, ez.f fVar, fz.b.LocalDate localDate) {
        this.dateConverter = cVar;
        this.dateLabelProvider = fVar;
        this.nowDate = localDate;
    }

    private final FormattedRangeDate e(fz.e.LocalDate localDate) {
        return new FormattedRangeDate(d(new fz.b.LocalDate(localDate.getStart()), localDate.getStart().getYear() == localDate.getEnd().getYear() ? fz.c.MONTH_DATE_DOT : fz.c.DOTTED), d(new fz.b.LocalDate(localDate.getEnd()), fz.c.DOTTED));
    }

    @Override // ez.e
    public FormattedRangeDate a(fz.e date) {
        if (date instanceof fz.e.LocalDate) {
            return e((fz.e.LocalDate) date);
        }
        throw new p();
    }

    @Override // ez.e
    public String b(fz.b.LocalDate date) {
        if (date.getDate().isEqual(this.nowDate.getDate())) {
            return this.dateLabelProvider.b().getText() + ", " + d(date, fz.c.DOTTED);
        }
        if (!date.getDate().isEqual(this.nowDate.getDate().minusDays(1L))) {
            return date.getDate().isAfter(this.nowDate.getDate().minusDays(8L)) ? dz.e.b(d(date, fz.c.FULLDAY_DATEDOT), null, 1, null) : d(date, fz.c.DOTTED);
        }
        return this.dateLabelProvider.c().getText() + ", " + d(date, fz.c.DOTTED);
    }

    @Override // ez.e
    public String c(OffsetDateTime date) {
        LocalDate localDate = date.toLocalDate();
        long jBetween = ChronoUnit.DAYS.between(this.nowDate.getDate(), localDate);
        if (jBetween == 0) {
            return this.dateLabelProvider.b().getText();
        }
        if (jBetween == -1) {
            return this.dateLabelProvider.c().getText();
        }
        if (jBetween == 1) {
            return this.dateLabelProvider.a().getText();
        }
        return ((-6 > jBetween || jBetween >= -1) && (2 > jBetween || jBetween >= 7)) ? d(new fz.b.LocalDate(localDate), fz.c.DOTTED) : dz.e.b(d(new fz.b.LocalDate(localDate), fz.c.FULLDAY_DATEDOT), null, 1, null);
    }

    @Override // ez.e
    @SuppressLint({"SimpleDateFormat"})
    public String d(fz.b dateType, fz.c formatType) {
        Date dateM;
        Date date;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatType.getFormat());
            if (dateType instanceof fz.b.OffsetDateTime) {
                dateM = this.dateConverter.d(((fz.b.OffsetDateTime) dateType).getDate());
            } else if (dateType instanceof fz.b.OffsetTime) {
                dateM = this.dateConverter.g(((fz.b.OffsetTime) dateType).getDate());
            } else if (dateType instanceof fz.b.Date) {
                dateM = ((fz.b.Date) dateType).getDate();
            } else if (dateType instanceof fz.b.LocalDate) {
                dateM = this.dateConverter.f(((fz.b.LocalDate) dateType).getDate());
            } else if (dateType instanceof fz.b.LocalDateTime) {
                dateM = this.dateConverter.h(((fz.b.LocalDateTime) dateType).getDate());
            } else {
                if (dateType instanceof fz.b.String) {
                    fz.c formatType2 = ((fz.b.String) dateType).getFormatType();
                    if (formatType2 != null) {
                        if (((fz.b.String) dateType).getUseDailySavings()) {
                            Date date2 = new SimpleDateFormat(formatType2.getFormat()).parse(((fz.b.String) dateType).getDate());
                            Calendar calendar = Calendar.getInstance();
                            if (date2 != null) {
                                calendar.setTime(date2);
                            }
                            calendar.add(11, calendar.getTimeZone().inDaylightTime(date2) ? 2 : 1);
                            date = calendar.getTime();
                        } else {
                            date = new SimpleDateFormat(formatType2.getFormat()).parse(((fz.b.String) dateType).getDate());
                        }
                        if (date != null) {
                            dateM = date;
                        }
                    }
                    dateM = simpleDateFormat.parse(((fz.b.String) dateType).getDate());
                } else if (dateType instanceof fz.b.Long) {
                    date = new Date(new Timestamp(((fz.b.Long) dateType).getDate()).getTime());
                    dateM = date;
                } else if (dateType instanceof fz.b.YearMonth) {
                    dateM = this.dateConverter.f(((fz.b.YearMonth) dateType).getYearMonth().atDay(1));
                } else {
                    if (!(dateType instanceof fz.b.C1545b)) {
                        throw new p();
                    }
                    dateM = this.dateConverter.m(((fz.b.C1545b) dateType).a());
                }
            }
            return simpleDateFormat.format(dateM);
        } catch (Exception unused) {
            return "";
        }
    }

    public /* synthetic */ e(ez.c cVar, ez.f fVar, fz.b.LocalDate localDate, int i15, k kVar) {
        this(cVar, fVar, (i15 & 4) != 0 ? new fz.b.LocalDate(LocalDate.now()) : localDate);
    }
}
