package x94;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: x94.u, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lx94/u;", "", "", "semesterId", "subjectId", "subjectTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectSubject {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semesterId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectTitle;

    public SelectSubject(String str, String str2, String str3) {
        this.semesterId = str;
        this.subjectId = str2;
        this.subjectTitle = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSemesterId() {
        return this.semesterId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubjectTitle() {
        return this.subjectTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectSubject)) {
            return false;
        }
        SelectSubject selectSubject = (SelectSubject) other;
        return fr.t.c(this.semesterId, selectSubject.semesterId) && fr.t.c(this.subjectId, selectSubject.subjectId) && fr.t.c(this.subjectTitle, selectSubject.subjectTitle);
    }

    public int hashCode() {
        return (((this.semesterId.hashCode() * 31) + this.subjectId.hashCode()) * 31) + this.subjectTitle.hashCode();
    }

    public String toString() {
        return "SelectSubject(semesterId=" + this.semesterId + ", subjectId=" + this.subjectId + ", subjectTitle=" + this.subjectTitle + ')';
    }
}
