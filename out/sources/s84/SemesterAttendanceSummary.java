package s84;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s84.k, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Ls84/k;", "", "", "current", "Ls84/i;", "presenceSummary", "", "semesterId", "", "Ls84/e;", "statusesSummary", "title", "<init>", "(ZLs84/i;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ls84/i;", "()Ls84/i;", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterAttendanceSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PresenceSummary presenceSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semesterId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AttendanceStatusSummary> statusesSummary;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public SemesterAttendanceSummary(boolean z15, PresenceSummary presenceSummary, String str, List<AttendanceStatusSummary> list, String str2) {
        this.current = z15;
        this.presenceSummary = presenceSummary;
        this.semesterId = str;
        this.statusesSummary = list;
        this.title = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PresenceSummary getPresenceSummary() {
        return this.presenceSummary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSemesterId() {
        return this.semesterId;
    }

    public final List<AttendanceStatusSummary> d() {
        return this.statusesSummary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterAttendanceSummary)) {
            return false;
        }
        SemesterAttendanceSummary semesterAttendanceSummary = (SemesterAttendanceSummary) other;
        return this.current == semesterAttendanceSummary.current && t.c(this.presenceSummary, semesterAttendanceSummary.presenceSummary) && t.c(this.semesterId, semesterAttendanceSummary.semesterId) && t.c(this.statusesSummary, semesterAttendanceSummary.statusesSummary) && t.c(this.title, semesterAttendanceSummary.title);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.current) * 31) + this.presenceSummary.hashCode()) * 31) + this.semesterId.hashCode()) * 31) + this.statusesSummary.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SemesterAttendanceSummary(current=" + this.current + ", presenceSummary=" + this.presenceSummary + ", semesterId=" + this.semesterId + ", statusesSummary=" + this.statusesSummary + ", title=" + this.title + ')';
    }
}
