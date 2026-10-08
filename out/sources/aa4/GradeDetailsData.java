package aa4;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import w94.GradeDetails;
import w94.GradeIcon;
import w94.PreviousGrade;
import w94.SemesterGrade;

/* JADX INFO: renamed from: aa4.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0001\u001cBg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b)\u00103¨\u00065"}, d2 = {"Laa4/a;", "", "", "id", "grade", "category", "Ljava/time/OffsetDateTime;", "createdAt", "teacher", "Lw94/b;", "icon", "", "descriptive", "comment", "subjectName", "newGrade", "Lw94/f;", "previousGrade", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lw94/b;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lw94/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "e", "c", "d", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "i", "f", "Lw94/b;", "()Lw94/b;", "g", "Z", "()Z", "h", "j", "Ljava/lang/Boolean;", "getNewGrade", "()Ljava/lang/Boolean;", "k", "Lw94/f;", "()Lw94/f;", "l", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GradeDetailsData {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5176m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String teacher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final GradeIcon icon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean descriptive;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean newGrade;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreviousGrade previousGrade;

    /* JADX INFO: renamed from: aa4.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laa4/a$a;", "", "<init>", "()V", "Lw94/a;", "gradeDetails", "Laa4/a;", "a", "(Lw94/a;)Laa4/a;", "Lw94/i;", "semesterGrade", "", "subjectName", "b", "(Lw94/i;Ljava/lang/String;)Laa4/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final GradeDetailsData a(GradeDetails gradeDetails) {
            return new GradeDetailsData(gradeDetails.getId(), gradeDetails.getGrade(), gradeDetails.getCategory(), gradeDetails.getCreatedAt(), gradeDetails.getTeacher(), gradeDetails.getIcon(), gradeDetails.getDescriptive(), gradeDetails.getComment(), gradeDetails.getSubjectName(), null, gradeDetails.getPreviousGrade());
        }

        public final GradeDetailsData b(SemesterGrade semesterGrade, String subjectName) {
            return new GradeDetailsData(null, semesterGrade.getGrade(), semesterGrade.getCategory(), semesterGrade.getCreatedAt(), semesterGrade.getTeacher(), semesterGrade.getIcon(), semesterGrade.getDescriptive(), semesterGrade.getComment(), subjectName, Boolean.valueOf(semesterGrade.getNewGrade()), null);
        }

        private Companion() {
        }
    }

    public GradeDetailsData(String str, String str2, String str3, OffsetDateTime offsetDateTime, String str4, GradeIcon gradeIcon, boolean z15, String str5, String str6, Boolean bool, PreviousGrade previousGrade) {
        this.id = str;
        this.grade = str2;
        this.category = str3;
        this.createdAt = offsetDateTime;
        this.teacher = str4;
        this.icon = gradeIcon;
        this.descriptive = z15;
        this.comment = str5;
        this.subjectName = str6;
        this.newGrade = bool;
        this.previousGrade = previousGrade;
    }

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
        if (!(other instanceof GradeDetailsData)) {
            return false;
        }
        GradeDetailsData gradeDetailsData = (GradeDetailsData) other;
        return t.c(this.id, gradeDetailsData.id) && t.c(this.grade, gradeDetailsData.grade) && t.c(this.category, gradeDetailsData.category) && t.c(this.createdAt, gradeDetailsData.createdAt) && t.c(this.teacher, gradeDetailsData.teacher) && t.c(this.icon, gradeDetailsData.icon) && this.descriptive == gradeDetailsData.descriptive && t.c(this.comment, gradeDetailsData.comment) && t.c(this.subjectName, gradeDetailsData.subjectName) && t.c(this.newGrade, gradeDetailsData.newGrade) && t.c(this.previousGrade, gradeDetailsData.previousGrade);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GradeIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PreviousGrade getPreviousGrade() {
        return this.previousGrade;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubjectName() {
        return this.subjectName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.grade.hashCode()) * 31) + this.category.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.teacher.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.descriptive)) * 31;
        String str2 = this.comment;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subjectName.hashCode()) * 31;
        Boolean bool = this.newGrade;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PreviousGrade previousGrade = this.previousGrade;
        return iHashCode3 + (previousGrade != null ? previousGrade.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTeacher() {
        return this.teacher;
    }

    public String toString() {
        return "GradeDetailsData(id=" + this.id + ", grade=" + this.grade + ", category=" + this.category + ", createdAt=" + this.createdAt + ", teacher=" + this.teacher + ", icon=" + this.icon + ", descriptive=" + this.descriptive + ", comment=" + this.comment + ", subjectName=" + this.subjectName + ", newGrade=" + this.newGrade + ", previousGrade=" + this.previousGrade + ')';
    }
}
