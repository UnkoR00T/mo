package rn0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.h0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrn0/h0;", "", "", "Lrn0/r;", "grades", "Lrn0/d0;", "semesterGrade", "<init>", "(Ljava/util/List;Lrn0/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lrn0/d0;", "()Lrn0/d0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESubjectGrades {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEGradePreview> grades;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESemesterGrade semesterGrade;

    public BESubjectGrades(List<BEGradePreview> list, BESemesterGrade bESemesterGrade) {
        this.grades = list;
        this.semesterGrade = bESemesterGrade;
    }

    public final List<BEGradePreview> a() {
        return this.grades;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BESemesterGrade getSemesterGrade() {
        return this.semesterGrade;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESubjectGrades)) {
            return false;
        }
        BESubjectGrades bESubjectGrades = (BESubjectGrades) other;
        return fr.t.c(this.grades, bESubjectGrades.grades) && fr.t.c(this.semesterGrade, bESubjectGrades.semesterGrade);
    }

    public int hashCode() {
        int iHashCode = this.grades.hashCode() * 31;
        BESemesterGrade bESemesterGrade = this.semesterGrade;
        return iHashCode + (bESemesterGrade == null ? 0 : bESemesterGrade.hashCode());
    }

    public String toString() {
        return "BESubjectGrades(grades=" + this.grades + ", semesterGrade=" + this.semesterGrade + ')';
    }
}
