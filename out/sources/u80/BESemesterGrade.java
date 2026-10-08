package u80;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u80.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b!\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006'"}, d2 = {"Lu80/z;", "", "", "category", "Ljava/time/OffsetDateTime;", "createdAt", "", "descriptive", "grade", "Lu80/o;", "icon", "newGrade", "teacher", "comment", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;ZLjava/lang/String;Lu80/o;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "Z", "d", "()Z", "e", "Lu80/o;", "f", "()Lu80/o;", "g", "h", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESemesterGrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean descriptive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGradeIcon icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String teacher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    public BESemesterGrade(String str, OffsetDateTime offsetDateTime, boolean z15, String str2, BEGradeIcon bEGradeIcon, boolean z16, String str3, String str4) {
        this.category = str;
        this.createdAt = offsetDateTime;
        this.descriptive = z15;
        this.grade = str2;
        this.icon = bEGradeIcon;
        this.newGrade = z16;
        this.teacher = str3;
        this.comment = str4;
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
        if (!(other instanceof BESemesterGrade)) {
            return false;
        }
        BESemesterGrade bESemesterGrade = (BESemesterGrade) other;
        return fr.t.c(this.category, bESemesterGrade.category) && fr.t.c(this.createdAt, bESemesterGrade.createdAt) && this.descriptive == bESemesterGrade.descriptive && fr.t.c(this.grade, bESemesterGrade.grade) && fr.t.c(this.icon, bESemesterGrade.icon) && this.newGrade == bESemesterGrade.newGrade && fr.t.c(this.teacher, bESemesterGrade.teacher) && fr.t.c(this.comment, bESemesterGrade.comment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEGradeIcon getIcon() {
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
        return "BESemesterGrade(category=" + this.category + ", createdAt=" + this.createdAt + ", descriptive=" + this.descriptive + ", grade=" + this.grade + ", icon=" + this.icon + ", newGrade=" + this.newGrade + ", teacher=" + this.teacher + ", comment=" + this.comment + ')';
    }
}
