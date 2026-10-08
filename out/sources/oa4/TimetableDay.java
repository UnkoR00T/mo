package oa4;

import fr.t;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oa4.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Loa4/f;", "", "Ljava/time/LocalDate;", "date", "", "numberOfLessons", "", "Loa4/g;", "slots", "<init>", "(Ljava/time/LocalDate;ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "I", "c", "Ljava/util/List;", "()Ljava/util/List;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimetableDay {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfLessons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TimetableSlot> slots;

    public TimetableDay(LocalDate localDate, int i15, List<TimetableSlot> list) {
        this.date = localDate;
        this.numberOfLessons = i15;
        this.slots = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNumberOfLessons() {
        return this.numberOfLessons;
    }

    public final List<TimetableSlot> c() {
        return this.slots;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimetableDay)) {
            return false;
        }
        TimetableDay timetableDay = (TimetableDay) other;
        return t.c(this.date, timetableDay.date) && this.numberOfLessons == timetableDay.numberOfLessons && t.c(this.slots, timetableDay.slots);
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + Integer.hashCode(this.numberOfLessons)) * 31) + this.slots.hashCode();
    }

    public String toString() {
        return "TimetableDay(date=" + this.date + ", numberOfLessons=" + this.numberOfLessons + ", slots=" + this.slots + ')';
    }
}
