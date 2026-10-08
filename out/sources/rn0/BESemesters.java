package rn0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.f0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrn0/f0;", "", "Lrn0/c0;", "currentSemester", "", "Lrn0/e0;", "previousSemesters", "Lrn0/a0;", "message", "<init>", "(Lrn0/c0;Ljava/util/List;Lrn0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrn0/c0;", "()Lrn0/c0;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lrn0/a0;", "()Lrn0/a0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESemesters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESemesterDetails currentSemester;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BESemesterPreview> previousSemesters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESchoolFamilyMessage message;

    public BESemesters(BESemesterDetails bESemesterDetails, List<BESemesterPreview> list, BESchoolFamilyMessage bESchoolFamilyMessage) {
        this.currentSemester = bESemesterDetails;
        this.previousSemesters = list;
        this.message = bESchoolFamilyMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BESemesterDetails getCurrentSemester() {
        return this.currentSemester;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BESchoolFamilyMessage getMessage() {
        return this.message;
    }

    public final List<BESemesterPreview> c() {
        return this.previousSemesters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESemesters)) {
            return false;
        }
        BESemesters bESemesters = (BESemesters) other;
        return fr.t.c(this.currentSemester, bESemesters.currentSemester) && fr.t.c(this.previousSemesters, bESemesters.previousSemesters) && fr.t.c(this.message, bESemesters.message);
    }

    public int hashCode() {
        BESemesterDetails bESemesterDetails = this.currentSemester;
        int iHashCode = (bESemesterDetails == null ? 0 : bESemesterDetails.hashCode()) * 31;
        List<BESemesterPreview> list = this.previousSemesters;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BESchoolFamilyMessage bESchoolFamilyMessage = this.message;
        return iHashCode2 + (bESchoolFamilyMessage != null ? bESchoolFamilyMessage.hashCode() : 0);
    }

    public String toString() {
        return "BESemesters(currentSemester=" + this.currentSemester + ", previousSemesters=" + this.previousSemesters + ", message=" + this.message + ')';
    }
}
