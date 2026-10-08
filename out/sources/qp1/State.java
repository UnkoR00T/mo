package qp1;

import fr.t;
import l30.w;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qp1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lqp1/b;", "", "Lfz/b$i;", "dominantYearMonth", "Lfz/b$c;", "firstDayInCurrentWeekDate", "currentDate", "selectedDate", "Ll30/w;", "scrollTrigger", "<init>", "(Lfz/b$i;Lfz/b$c;Lfz/b$c;Lfz/b$c;Ll30/w;)V", "a", "(Lfz/b$i;Lfz/b$c;Lfz/b$c;Lfz/b$c;Ll30/w;)Lqp1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfz/b$i;", "d", "()Lfz/b$i;", "b", "Lfz/b$c;", "e", "()Lfz/b$c;", "c", "g", "Ll30/w;", "f", "()Ll30/w;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f167866f = fz.b.LocalDate.f68860b | fz.b.YearMonth.f68872b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.YearMonth dominantYearMonth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate firstDayInCurrentWeekDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate currentDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate selectedDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final w scrollTrigger;

    public State(fz.b.YearMonth yearMonth, fz.b.LocalDate localDate, fz.b.LocalDate localDate2, fz.b.LocalDate localDate3, w wVar) {
        this.dominantYearMonth = yearMonth;
        this.firstDayInCurrentWeekDate = localDate;
        this.currentDate = localDate2;
        this.selectedDate = localDate3;
        this.scrollTrigger = wVar;
    }

    public static /* synthetic */ State b(State state, fz.b.YearMonth yearMonth, fz.b.LocalDate localDate, fz.b.LocalDate localDate2, fz.b.LocalDate localDate3, w wVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            yearMonth = state.dominantYearMonth;
        }
        if ((i15 & 2) != 0) {
            localDate = state.firstDayInCurrentWeekDate;
        }
        if ((i15 & 4) != 0) {
            localDate2 = state.currentDate;
        }
        if ((i15 & 8) != 0) {
            localDate3 = state.selectedDate;
        }
        if ((i15 & 16) != 0) {
            wVar = state.scrollTrigger;
        }
        w wVar2 = wVar;
        fz.b.LocalDate localDate4 = localDate2;
        return state.a(yearMonth, localDate, localDate4, localDate3, wVar2);
    }

    public final State a(fz.b.YearMonth dominantYearMonth, fz.b.LocalDate firstDayInCurrentWeekDate, fz.b.LocalDate currentDate, fz.b.LocalDate selectedDate, w scrollTrigger) {
        return new State(dominantYearMonth, firstDayInCurrentWeekDate, currentDate, selectedDate, scrollTrigger);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDate getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.YearMonth getDominantYearMonth() {
        return this.dominantYearMonth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.LocalDate getFirstDayInCurrentWeekDate() {
        return this.firstDayInCurrentWeekDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.dominantYearMonth, state.dominantYearMonth) && t.c(this.firstDayInCurrentWeekDate, state.firstDayInCurrentWeekDate) && t.c(this.currentDate, state.currentDate) && t.c(this.selectedDate, state.selectedDate) && t.c(this.scrollTrigger, state.scrollTrigger);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w getScrollTrigger() {
        return this.scrollTrigger;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final fz.b.LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public int hashCode() {
        int iHashCode = ((((((this.dominantYearMonth.hashCode() * 31) + this.firstDayInCurrentWeekDate.hashCode()) * 31) + this.currentDate.hashCode()) * 31) + this.selectedDate.hashCode()) * 31;
        w wVar = this.scrollTrigger;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public String toString() {
        return "State(dominantYearMonth=" + this.dominantYearMonth + ", firstDayInCurrentWeekDate=" + this.firstDayInCurrentWeekDate + ", currentDate=" + this.currentDate + ", selectedDate=" + this.selectedDate + ", scrollTrigger=" + this.scrollTrigger + ')';
    }

    public /* synthetic */ State(fz.b.YearMonth yearMonth, fz.b.LocalDate localDate, fz.b.LocalDate localDate2, fz.b.LocalDate localDate3, w wVar, int i15, fr.k kVar) {
        this(yearMonth, localDate, localDate2, localDate3, (i15 & 16) != 0 ? null : wVar);
    }
}
