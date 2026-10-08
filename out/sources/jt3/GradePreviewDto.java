package jt3;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.q, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010 \u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, d2 = {"Ljt3/q;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "category", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "createdAt", "c", "grade", "Ljt3/o;", "d", "Ljt3/o;", "()Ljt3/o;", "icon", "e", "id", "f", "Z", "()Z", "newGrade", "g", "getTeacher", "teacher", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GradePreviewDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("createdAt")
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("grade")
    private final String grade;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("icon")
    private final GradeIconDto icon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("newGrade")
    private final boolean newGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("teacher")
    private final String teacher;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GradeIconDto getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradePreviewDto)) {
            return false;
        }
        GradePreviewDto gradePreviewDto = (GradePreviewDto) other;
        return fr.t.c(this.category, gradePreviewDto.category) && fr.t.c(this.createdAt, gradePreviewDto.createdAt) && fr.t.c(this.grade, gradePreviewDto.grade) && fr.t.c(this.icon, gradePreviewDto.icon) && fr.t.c(this.id, gradePreviewDto.id) && this.newGrade == gradePreviewDto.newGrade && fr.t.c(this.teacher, gradePreviewDto.teacher);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNewGrade() {
        return this.newGrade;
    }

    public int hashCode() {
        return (((((((((((this.category.hashCode() * 31) + this.createdAt.hashCode()) * 31) + this.grade.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.newGrade)) * 31) + this.teacher.hashCode();
    }

    public String toString() {
        return "GradePreviewDto(category=" + this.category + ", createdAt=" + this.createdAt + ", grade=" + this.grade + ", icon=" + this.icon + ", id=" + this.id + ", newGrade=" + this.newGrade + ", teacher=" + this.teacher + ')';
    }
}
