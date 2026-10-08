package on0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: on0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b\u0018\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u001d\u0010\u0004¨\u0006&"}, d2 = {"Lon0/n;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "id", "b", "d", "name", "c", "g", "schoolClass", "h", "schoolName", "Lon0/t;", "e", "Lon0/t;", "()Lon0/t;", "latestAbsence", "Lon0/u;", "f", "Lon0/u;", "()Lon0/u;", "latestGrade", "Lon0/e0;", "Lon0/e0;", "()Lon0/e0;", "nextLesson", "picture", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildrenStudentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schoolClass")
    private final String schoolClass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("schoolName")
    private final String schoolName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latestAbsence")
    private final LatestAbsenceDto latestAbsence;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latestGrade")
    private final LatestGradeDto latestGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextLesson")
    private final NextLessonDto nextLesson;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("picture")
    private final String picture;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LatestAbsenceDto getLatestAbsence() {
        return this.latestAbsence;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LatestGradeDto getLatestGrade() {
        return this.latestGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NextLessonDto getNextLesson() {
        return this.nextLesson;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildrenStudentDto)) {
            return false;
        }
        ChildrenStudentDto childrenStudentDto = (ChildrenStudentDto) other;
        return fr.t.c(this.id, childrenStudentDto.id) && fr.t.c(this.name, childrenStudentDto.name) && fr.t.c(this.schoolClass, childrenStudentDto.schoolClass) && fr.t.c(this.schoolName, childrenStudentDto.schoolName) && fr.t.c(this.latestAbsence, childrenStudentDto.latestAbsence) && fr.t.c(this.latestGrade, childrenStudentDto.latestGrade) && fr.t.c(this.nextLesson, childrenStudentDto.nextLesson) && fr.t.c(this.picture, childrenStudentDto.picture);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSchoolClass() {
        return this.schoolClass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.schoolClass.hashCode()) * 31) + this.schoolName.hashCode()) * 31;
        LatestAbsenceDto latestAbsenceDto = this.latestAbsence;
        int iHashCode2 = (iHashCode + (latestAbsenceDto == null ? 0 : latestAbsenceDto.hashCode())) * 31;
        LatestGradeDto latestGradeDto = this.latestGrade;
        int iHashCode3 = (iHashCode2 + (latestGradeDto == null ? 0 : latestGradeDto.hashCode())) * 31;
        NextLessonDto nextLessonDto = this.nextLesson;
        int iHashCode4 = (iHashCode3 + (nextLessonDto == null ? 0 : nextLessonDto.hashCode())) * 31;
        String str = this.picture;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ChildrenStudentDto(id=" + this.id + ", name=" + this.name + ", schoolClass=" + this.schoolClass + ", schoolName=" + this.schoolName + ", latestAbsence=" + this.latestAbsence + ", latestGrade=" + this.latestGrade + ", nextLesson=" + this.nextLesson + ", picture=" + this.picture + ')';
    }
}
