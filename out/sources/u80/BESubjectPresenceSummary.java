package u80;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: u80.f0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lu80/f0;", "", "", "attendancePercentage", "Lu80/e0;", "subjectIcon", "", "subjectName", "<init>", "(ILu80/e0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lu80/e0;", "()Lu80/e0;", "c", "Ljava/lang/String;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESubjectPresenceSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int attendancePercentage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e0 subjectIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectName;

    public BESubjectPresenceSummary(int i15, e0 e0Var, String str) {
        this.attendancePercentage = i15;
        this.subjectIcon = e0Var;
        this.subjectName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAttendancePercentage() {
        return this.attendancePercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getSubjectIcon() {
        return this.subjectIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubjectName() {
        return this.subjectName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESubjectPresenceSummary)) {
            return false;
        }
        BESubjectPresenceSummary bESubjectPresenceSummary = (BESubjectPresenceSummary) other;
        return this.attendancePercentage == bESubjectPresenceSummary.attendancePercentage && this.subjectIcon == bESubjectPresenceSummary.subjectIcon && fr.t.c(this.subjectName, bESubjectPresenceSummary.subjectName);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.attendancePercentage) * 31) + this.subjectIcon.hashCode()) * 31) + this.subjectName.hashCode();
    }

    public String toString() {
        return "BESubjectPresenceSummary(attendancePercentage=" + this.attendancePercentage + ", subjectIcon=" + this.subjectIcon + ", subjectName=" + this.subjectName + ')';
    }
}
