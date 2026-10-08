package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.d0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001e\u0010\u0004¨\u0006 "}, d2 = {"Ljt3/d0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "current", "Ljt3/a0;", "b", "Ljt3/a0;", "()Ljt3/a0;", "presenceSummary", "c", "Ljava/lang/String;", "semesterId", "", "Ljt3/d;", "d", "Ljava/util/List;", "()Ljava/util/List;", "statusesSummary", "e", "title", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterAttendanceSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("current")
    private final boolean current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("presenceSummary")
    private final PresenceSummaryDto presenceSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("semesterId")
    private final String semesterId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusesSummary")
    private final List<AttendanceStatusSummaryDto> statusesSummary;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PresenceSummaryDto getPresenceSummary() {
        return this.presenceSummary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSemesterId() {
        return this.semesterId;
    }

    public final List<AttendanceStatusSummaryDto> d() {
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
        if (!(other instanceof SemesterAttendanceSummaryDto)) {
            return false;
        }
        SemesterAttendanceSummaryDto semesterAttendanceSummaryDto = (SemesterAttendanceSummaryDto) other;
        return this.current == semesterAttendanceSummaryDto.current && fr.t.c(this.presenceSummary, semesterAttendanceSummaryDto.presenceSummary) && fr.t.c(this.semesterId, semesterAttendanceSummaryDto.semesterId) && fr.t.c(this.statusesSummary, semesterAttendanceSummaryDto.statusesSummary) && fr.t.c(this.title, semesterAttendanceSummaryDto.title);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.current) * 31) + this.presenceSummary.hashCode()) * 31) + this.semesterId.hashCode()) * 31) + this.statusesSummary.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SemesterAttendanceSummaryDto(current=" + this.current + ", presenceSummary=" + this.presenceSummary + ", semesterId=" + this.semesterId + ", statusesSummary=" + this.statusesSummary + ", title=" + this.title + ')';
    }
}
