package ua4;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import oa4.TimetableDay;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ua4.e, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, d2 = {"Lua4/e;", "", "", "Loa4/f;", "cachedDays", "Ljava/time/OffsetDateTime;", "currentTime", "Lfz/b$c;", "calendarAnchorDate", "Lfz/b$i;", "dominantYearMonth", "", "Ljava/time/LocalDate;", "cachedWeekStarts", "<init>", "(Ljava/util/List;Ljava/time/OffsetDateTime;Lfz/b$c;Lfz/b$i;Ljava/util/Set;)V", "a", "(Ljava/util/List;Ljava/time/OffsetDateTime;Lfz/b$c;Lfz/b$i;Ljava/util/Set;)Lua4/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/time/OffsetDateTime;", "f", "()Ljava/time/OffsetDateTime;", "Lfz/b$c;", "e", "()Lfz/b$c;", "d", "Lfz/b$i;", "g", "()Lfz/b$i;", "Ljava/util/Set;", "()Ljava/util/Set;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimetableContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TimetableDay> cachedDays;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime currentTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate calendarAnchorDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.YearMonth dominantYearMonth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<LocalDate> cachedWeekStarts;

    public TimetableContext(List<TimetableDay> list, OffsetDateTime offsetDateTime, fz.b.LocalDate localDate, fz.b.YearMonth yearMonth, Set<LocalDate> set) {
        this.cachedDays = list;
        this.currentTime = offsetDateTime;
        this.calendarAnchorDate = localDate;
        this.dominantYearMonth = yearMonth;
        this.cachedWeekStarts = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimetableContext b(TimetableContext timetableContext, List list, OffsetDateTime offsetDateTime, fz.b.LocalDate localDate, fz.b.YearMonth yearMonth, Set set, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = timetableContext.cachedDays;
        }
        if ((i15 & 2) != 0) {
            offsetDateTime = timetableContext.currentTime;
        }
        if ((i15 & 4) != 0) {
            localDate = timetableContext.calendarAnchorDate;
        }
        if ((i15 & 8) != 0) {
            yearMonth = timetableContext.dominantYearMonth;
        }
        if ((i15 & 16) != 0) {
            set = timetableContext.cachedWeekStarts;
        }
        Set set2 = set;
        fz.b.LocalDate localDate2 = localDate;
        return timetableContext.a(list, offsetDateTime, localDate2, yearMonth, set2);
    }

    public final TimetableContext a(List<TimetableDay> cachedDays, OffsetDateTime currentTime, fz.b.LocalDate calendarAnchorDate, fz.b.YearMonth dominantYearMonth, Set<LocalDate> cachedWeekStarts) {
        return new TimetableContext(cachedDays, currentTime, calendarAnchorDate, dominantYearMonth, cachedWeekStarts);
    }

    public final List<TimetableDay> c() {
        return this.cachedDays;
    }

    public final Set<LocalDate> d() {
        return this.cachedWeekStarts;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.LocalDate getCalendarAnchorDate() {
        return this.calendarAnchorDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimetableContext)) {
            return false;
        }
        TimetableContext timetableContext = (TimetableContext) other;
        return fr.t.c(this.cachedDays, timetableContext.cachedDays) && fr.t.c(this.currentTime, timetableContext.currentTime) && fr.t.c(this.calendarAnchorDate, timetableContext.calendarAnchorDate) && fr.t.c(this.dominantYearMonth, timetableContext.dominantYearMonth) && fr.t.c(this.cachedWeekStarts, timetableContext.cachedWeekStarts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final fz.b.YearMonth getDominantYearMonth() {
        return this.dominantYearMonth;
    }

    public int hashCode() {
        return (((((((this.cachedDays.hashCode() * 31) + this.currentTime.hashCode()) * 31) + this.calendarAnchorDate.hashCode()) * 31) + this.dominantYearMonth.hashCode()) * 31) + this.cachedWeekStarts.hashCode();
    }

    public String toString() {
        return "TimetableContext(cachedDays=" + this.cachedDays + ", currentTime=" + this.currentTime + ", calendarAnchorDate=" + this.calendarAnchorDate + ", dominantYearMonth=" + this.dominantYearMonth + ", cachedWeekStarts=" + this.cachedWeekStarts + ')';
    }
}
