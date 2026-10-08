package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Ljt3/k;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCurrent", "()Z", "current", "", "Ljt3/h;", "b", "Ljava/util/List;", "()Ljava/util/List;", "grades", "c", "Ljava/lang/String;", "d", "title", "Ljt3/m;", "Ljt3/m;", "()Ljt3/m;", "gradeInfo", "Ljt3/l;", "e", "Ljt3/l;", "()Ljt3/l;", "semesterGrade", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BehaviourSemesterDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("current")
    private final boolean current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("grades")
    private final List<BehaviourGradeDto> grades;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gradeInfo")
    private final BehaviourSemesterGradeInfoDto gradeInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("semesterGrade")
    private final BehaviourSemesterGradeDto semesterGrade;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BehaviourSemesterGradeInfoDto getGradeInfo() {
        return this.gradeInfo;
    }

    public final List<BehaviourGradeDto> b() {
        return this.grades;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BehaviourSemesterGradeDto getSemesterGrade() {
        return this.semesterGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviourSemesterDto)) {
            return false;
        }
        BehaviourSemesterDto behaviourSemesterDto = (BehaviourSemesterDto) other;
        return this.current == behaviourSemesterDto.current && fr.t.c(this.grades, behaviourSemesterDto.grades) && fr.t.c(this.title, behaviourSemesterDto.title) && fr.t.c(this.gradeInfo, behaviourSemesterDto.gradeInfo) && fr.t.c(this.semesterGrade, behaviourSemesterDto.semesterGrade);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.current) * 31) + this.grades.hashCode()) * 31) + this.title.hashCode()) * 31;
        BehaviourSemesterGradeInfoDto behaviourSemesterGradeInfoDto = this.gradeInfo;
        int iHashCode2 = (iHashCode + (behaviourSemesterGradeInfoDto == null ? 0 : behaviourSemesterGradeInfoDto.hashCode())) * 31;
        BehaviourSemesterGradeDto behaviourSemesterGradeDto = this.semesterGrade;
        return iHashCode2 + (behaviourSemesterGradeDto != null ? behaviourSemesterGradeDto.hashCode() : 0);
    }

    public String toString() {
        return "BehaviourSemesterDto(current=" + this.current + ", grades=" + this.grades + ", title=" + this.title + ", gradeInfo=" + this.gradeInfo + ", semesterGrade=" + this.semesterGrade + ')';
    }
}
