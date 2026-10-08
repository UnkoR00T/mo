package f43;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f43.f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lf43/f;", "", "", "id", "grade", "subject", "Ljava/time/OffsetDateTime;", "createdAt", "Lf43/b;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Lf43/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Lf43/b;", "()Lf43/b;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LatestGrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subject;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final GradeIcon icon;

    public LatestGrade(String str, String str2, String str3, OffsetDateTime offsetDateTime, GradeIcon gradeIcon) {
        this.id = str;
        this.grade = str2;
        this.subject = str3;
        this.createdAt = offsetDateTime;
        this.icon = gradeIcon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GradeIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestGrade)) {
            return false;
        }
        LatestGrade latestGrade = (LatestGrade) other;
        return t.c(this.id, latestGrade.id) && t.c(this.grade, latestGrade.grade) && t.c(this.subject, latestGrade.subject) && t.c(this.createdAt, latestGrade.createdAt) && t.c(this.icon, latestGrade.icon);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.grade.hashCode()) * 31) + this.subject.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "LatestGrade(id=" + this.id + ", grade=" + this.grade + ", subject=" + this.subject + ", createdAt=" + this.createdAt + ", icon=" + this.icon + ')';
    }
}
