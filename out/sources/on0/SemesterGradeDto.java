package on0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: on0.k0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\"\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006%"}, d2 = {"Lon0/k0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "category", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "createdAt", "Z", "d", "()Z", "descriptive", "e", "grade", "Lon0/q;", "Lon0/q;", "f", "()Lon0/q;", "icon", "g", "newGrade", "h", "teacher", "comment", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterGradeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("createdAt")
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("descriptive")
    private final boolean descriptive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("grade")
    private final String grade;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("icon")
    private final GradeIconDto icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("newGrade")
    private final boolean newGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("teacher")
    private final String teacher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("comment")
    private final String comment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDescriptive() {
        return this.descriptive;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterGradeDto)) {
            return false;
        }
        SemesterGradeDto semesterGradeDto = (SemesterGradeDto) other;
        return fr.t.c(this.category, semesterGradeDto.category) && fr.t.c(this.createdAt, semesterGradeDto.createdAt) && this.descriptive == semesterGradeDto.descriptive && fr.t.c(this.grade, semesterGradeDto.grade) && fr.t.c(this.icon, semesterGradeDto.icon) && this.newGrade == semesterGradeDto.newGrade && fr.t.c(this.teacher, semesterGradeDto.teacher) && fr.t.c(this.comment, semesterGradeDto.comment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GradeIconDto getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNewGrade() {
        return this.newGrade;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTeacher() {
        return this.teacher;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.category.hashCode() * 31) + this.createdAt.hashCode()) * 31) + Boolean.hashCode(this.descriptive)) * 31) + this.grade.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.newGrade)) * 31) + this.teacher.hashCode()) * 31;
        String str = this.comment;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SemesterGradeDto(category=" + this.category + ", createdAt=" + this.createdAt + ", descriptive=" + this.descriptive + ", grade=" + this.grade + ", icon=" + this.icon + ", newGrade=" + this.newGrade + ", teacher=" + this.teacher + ", comment=" + this.comment + ')';
    }
}
