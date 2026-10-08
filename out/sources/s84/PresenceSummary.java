package s84;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s84.i, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"Ls84/i;", "", "", "schoolYearAttendancePercentage", "semesterAttendancePercentage", "", "Ls84/m;", "subjects", "", "title", "<init>", "(IILjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PresenceSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int schoolYearAttendancePercentage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int semesterAttendancePercentage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SubjectPresenceSummary> subjects;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public PresenceSummary(int i15, int i16, List<SubjectPresenceSummary> list, String str) {
        this.schoolYearAttendancePercentage = i15;
        this.semesterAttendancePercentage = i16;
        this.subjects = list;
        this.title = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSchoolYearAttendancePercentage() {
        return this.schoolYearAttendancePercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSemesterAttendancePercentage() {
        return this.semesterAttendancePercentage;
    }

    public final List<SubjectPresenceSummary> c() {
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
        if (!(other instanceof PresenceSummary)) {
            return false;
        }
        PresenceSummary presenceSummary = (PresenceSummary) other;
        return this.schoolYearAttendancePercentage == presenceSummary.schoolYearAttendancePercentage && this.semesterAttendancePercentage == presenceSummary.semesterAttendancePercentage && t.c(this.subjects, presenceSummary.subjects) && t.c(this.title, presenceSummary.title);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.schoolYearAttendancePercentage) * 31) + Integer.hashCode(this.semesterAttendancePercentage)) * 31) + this.subjects.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "PresenceSummary(schoolYearAttendancePercentage=" + this.schoolYearAttendancePercentage + ", semesterAttendancePercentage=" + this.semesterAttendancePercentage + ", subjects=" + this.subjects + ", title=" + this.title + ')';
    }
}
