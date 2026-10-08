package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.a0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0007R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Ljt3/a0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "schoolYearAttendancePercentage", "b", "semesterAttendancePercentage", "", "Ljt3/l0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "subjects", "d", "Ljava/lang/String;", "title", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PresenceSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schoolYearAttendancePercentage")
    private final int schoolYearAttendancePercentage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("semesterAttendancePercentage")
    private final int semesterAttendancePercentage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subjects")
    private final List<SubjectPresenceSummaryDto> subjects;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSchoolYearAttendancePercentage() {
        return this.schoolYearAttendancePercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSemesterAttendancePercentage() {
        return this.semesterAttendancePercentage;
    }

    public final List<SubjectPresenceSummaryDto> c() {
        return this.subjects;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresenceSummaryDto)) {
            return false;
        }
        PresenceSummaryDto presenceSummaryDto = (PresenceSummaryDto) other;
        return this.schoolYearAttendancePercentage == presenceSummaryDto.schoolYearAttendancePercentage && this.semesterAttendancePercentage == presenceSummaryDto.semesterAttendancePercentage && fr.t.c(this.subjects, presenceSummaryDto.subjects) && fr.t.c(this.title, presenceSummaryDto.title);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.schoolYearAttendancePercentage) * 31) + Integer.hashCode(this.semesterAttendancePercentage)) * 31) + this.subjects.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "PresenceSummaryDto(schoolYearAttendancePercentage=" + this.schoolYearAttendancePercentage + ", semesterAttendancePercentage=" + this.semesterAttendancePercentage + ", subjects=" + this.subjects + ", title=" + this.title + ')';
    }
}
