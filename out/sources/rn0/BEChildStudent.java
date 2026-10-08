package rn0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001b\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lrn0/n;", "", "", "id", "name", "schoolName", "schoolClass", "picture", "Lrn0/t;", "latestGrade", "Lrn0/s;", "latestAbsence", "Lrn0/x;", "nextLesson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrn0/t;Lrn0/s;Lrn0/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "h", "g", "e", "f", "Lrn0/t;", "()Lrn0/t;", "Lrn0/s;", "()Lrn0/s;", "Lrn0/x;", "()Lrn0/x;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildStudent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BELatestGrade latestGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BELatestAbsence latestAbsence;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BENextLesson nextLesson;

    public BEChildStudent(String str, String str2, String str3, String str4, String str5, BELatestGrade bELatestGrade, BELatestAbsence bELatestAbsence, BENextLesson bENextLesson) {
        this.id = str;
        this.name = str2;
        this.schoolName = str3;
        this.schoolClass = str4;
        this.picture = str5;
        this.latestGrade = bELatestGrade;
        this.latestAbsence = bELatestAbsence;
        this.nextLesson = bENextLesson;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BELatestAbsence getLatestAbsence() {
        return this.latestAbsence;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BELatestGrade getLatestGrade() {
        return this.latestGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BENextLesson getNextLesson() {
        return this.nextLesson;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildStudent)) {
            return false;
        }
        BEChildStudent bEChildStudent = (BEChildStudent) other;
        return fr.t.c(this.id, bEChildStudent.id) && fr.t.c(this.name, bEChildStudent.name) && fr.t.c(this.schoolName, bEChildStudent.schoolName) && fr.t.c(this.schoolClass, bEChildStudent.schoolClass) && fr.t.c(this.picture, bEChildStudent.picture) && fr.t.c(this.latestGrade, bEChildStudent.latestGrade) && fr.t.c(this.latestAbsence, bEChildStudent.latestAbsence) && fr.t.c(this.nextLesson, bEChildStudent.nextLesson);
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
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.schoolName.hashCode()) * 31) + this.schoolClass.hashCode()) * 31;
        String str = this.picture;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BELatestGrade bELatestGrade = this.latestGrade;
        int iHashCode3 = (iHashCode2 + (bELatestGrade == null ? 0 : bELatestGrade.hashCode())) * 31;
        BELatestAbsence bELatestAbsence = this.latestAbsence;
        int iHashCode4 = (iHashCode3 + (bELatestAbsence == null ? 0 : bELatestAbsence.hashCode())) * 31;
        BENextLesson bENextLesson = this.nextLesson;
        return iHashCode4 + (bENextLesson != null ? bENextLesson.hashCode() : 0);
    }

    public String toString() {
        return "BEChildStudent(id=" + this.id + ", name=" + this.name + ", schoolName=" + this.schoolName + ", schoolClass=" + this.schoolClass + ", picture=" + this.picture + ", latestGrade=" + this.latestGrade + ", latestAbsence=" + this.latestAbsence + ", nextLesson=" + this.nextLesson + ')';
    }
}
