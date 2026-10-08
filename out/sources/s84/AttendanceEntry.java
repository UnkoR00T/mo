package s84;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s84.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Ls84/b;", "", "Ljava/time/OffsetDateTime;", "fromTime", "", "subjectName", "toTime", "<init>", "(Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "b", "Ljava/lang/String;", "c", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttendanceEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime toTime;

    public AttendanceEntry(OffsetDateTime offsetDateTime, String str, OffsetDateTime offsetDateTime2) {
        this.fromTime = offsetDateTime;
        this.subjectName = str;
        this.toTime = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getFromTime() {
        return this.fromTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubjectName() {
        return this.subjectName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getToTime() {
        return this.toTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttendanceEntry)) {
            return false;
        }
        AttendanceEntry attendanceEntry = (AttendanceEntry) other;
        return t.c(this.fromTime, attendanceEntry.fromTime) && t.c(this.subjectName, attendanceEntry.subjectName) && t.c(this.toTime, attendanceEntry.toTime);
    }

    public int hashCode() {
        return (((this.fromTime.hashCode() * 31) + this.subjectName.hashCode()) * 31) + this.toTime.hashCode();
    }

    public String toString() {
        return "AttendanceEntry(fromTime=" + this.fromTime + ", subjectName=" + this.subjectName + ", toTime=" + this.toTime + ')';
    }
}
