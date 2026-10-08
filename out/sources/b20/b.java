package b20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import lr.i;
import p071kotlin.Metadata;
import pq.l0;
import pq.m0;
import pq.s0;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lb20/b;", "Lez/b;", "Lez/a;", "currentTimeProvider", "Lez/c;", "dateConverter", "<init>", "(Lez/a;Lez/c;)V", "Ljava/time/DayOfWeek;", "dayOfWeek", "Lfz/b$c;", "fromDate", "f", "(Ljava/time/DayOfWeek;Lfz/b$c;)Lfz/b$c;", "firstDayInWeekDate", "Lfz/b$i;", "c", "(Lfz/b$c;)Lfz/b$i;", "startDate", "endDate", "", "a", "(Lfz/b$c;Lfz/b$c;)I", "", "timestamp", "Lgu/b;", "timeToPass", "", "d", "(JJ)Z", "Ljava/util/Date;", "date", "e", "(Ljava/util/Date;)J", "Lfz/b$f;", "b", "(Lfz/b$f;)J", "Lez/a;", "getCurrentTimeProvider", "()Lez/a;", "Lez/c;", "getDateConverter", "()Lez/c;", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ez.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"b20/b$a", "Lpq/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l0<LocalDate, YearMonth> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f16135a;

        public a(Iterable iterable) {
            this.f16135a = iterable;
        }

        @Override // pq.l0
        public YearMonth a(LocalDate element) {
            return YearMonth.from(element);
        }

        @Override // pq.l0
        public Iterator<LocalDate> b() {
            return this.f16135a.iterator();
        }
    }

    public b(ez.a aVar, ez.c cVar) {
        this.currentTimeProvider = aVar;
        this.dateConverter = cVar;
    }

    @Override // ez.b
    public int a(fz.b.LocalDate startDate, fz.b.LocalDate endDate) {
        return (int) ChronoUnit.WEEKS.between(startDate.getDate(), endDate.getDate());
    }

    @Override // ez.b
    public long b(fz.b.OffsetDateTime date) {
        return ChronoUnit.DAYS.between(this.currentTimeProvider.c(), date.getDate().toLocalDate());
    }

    @Override // ez.b
    public fz.b.YearMonth c(fz.b.LocalDate firstDayInWeekDate) {
        i iVar = new i(0, 6);
        ArrayList arrayList = new ArrayList(v.y(iVar, 10));
        Iterator<Integer> it = iVar.iterator();
        while (it.hasNext()) {
            arrayList.add(firstDayInWeekDate.getDate().plusDays(((s0) it).nextInt()));
        }
        Iterator it4 = m0.a(new a(arrayList)).entrySet().iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it4.next();
        if (it4.hasNext()) {
            int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
            do {
                Object next2 = it4.next();
                int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                if (iIntValue < iIntValue2) {
                    next = next2;
                    iIntValue = iIntValue2;
                }
            } while (it4.hasNext());
        }
        return new fz.b.YearMonth((YearMonth) ((Map.Entry) next).getKey());
    }

    @Override // ez.b
    public boolean d(long timestamp, long timeToPass) {
        return this.currentTimeProvider.a() - timestamp >= gu.b.c0(timeToPass, gu.e.MILLISECONDS);
    }

    @Override // ez.b
    public long e(Date date) {
        return ChronoUnit.DAYS.between(this.currentTimeProvider.c(), this.dateConverter.l(date));
    }

    @Override // ez.b
    public fz.b.LocalDate f(DayOfWeek dayOfWeek, fz.b.LocalDate fromDate) {
        return new fz.b.LocalDate(fromDate.getDate().with(TemporalAdjusters.previousOrSame(dayOfWeek)));
    }
}
