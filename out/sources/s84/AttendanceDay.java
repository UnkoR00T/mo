package s84;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s84.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ls84/a;", "", "", "Ls84/b;", "attendances", "Ljava/time/OffsetDateTime;", "date", "<init>", "(Ljava/util/List;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttendanceDay {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AttendanceEntry> attendances;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    public AttendanceDay(List<AttendanceEntry> list, OffsetDateTime offsetDateTime) {
        this.attendances = list;
        this.date = offsetDateTime;
    }

    public final List<AttendanceEntry> a() {
        return this.attendances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttendanceDay)) {
            return false;
        }
        AttendanceDay attendanceDay = (AttendanceDay) other;
        return t.c(this.attendances, attendanceDay.attendances) && t.c(this.date, attendanceDay.date);
    }

    public int hashCode() {
        return (this.attendances.hashCode() * 31) + this.date.hashCode();
    }

    public String toString() {
        return "AttendanceDay(attendances=" + this.attendances + ", date=" + this.date + ')';
    }
}
