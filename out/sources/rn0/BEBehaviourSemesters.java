package rn0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrn0/m;", "", "Lrn0/l;", "currentSemester", "", "previousSemesters", "Lrn0/a0;", "message", "<init>", "(Lrn0/l;Ljava/util/List;Lrn0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrn0/l;", "()Lrn0/l;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lrn0/a0;", "()Lrn0/a0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEBehaviourSemesters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEBehaviourSemesterDetails currentSemester;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEBehaviourSemesterDetails> previousSemesters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESchoolFamilyMessage message;

    public BEBehaviourSemesters(BEBehaviourSemesterDetails bEBehaviourSemesterDetails, List<BEBehaviourSemesterDetails> list, BESchoolFamilyMessage bESchoolFamilyMessage) {
        this.currentSemester = bEBehaviourSemesterDetails;
        this.previousSemesters = list;
        this.message = bESchoolFamilyMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEBehaviourSemesterDetails getCurrentSemester() {
        return this.currentSemester;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BESchoolFamilyMessage getMessage() {
        return this.message;
    }

    public final List<BEBehaviourSemesterDetails> c() {
        return this.previousSemesters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEBehaviourSemesters)) {
            return false;
        }
        BEBehaviourSemesters bEBehaviourSemesters = (BEBehaviourSemesters) other;
        return fr.t.c(this.currentSemester, bEBehaviourSemesters.currentSemester) && fr.t.c(this.previousSemesters, bEBehaviourSemesters.previousSemesters) && fr.t.c(this.message, bEBehaviourSemesters.message);
    }

    public int hashCode() {
        BEBehaviourSemesterDetails bEBehaviourSemesterDetails = this.currentSemester;
        int iHashCode = (bEBehaviourSemesterDetails == null ? 0 : bEBehaviourSemesterDetails.hashCode()) * 31;
        List<BEBehaviourSemesterDetails> list = this.previousSemesters;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BESchoolFamilyMessage bESchoolFamilyMessage = this.message;
        return iHashCode2 + (bESchoolFamilyMessage != null ? bESchoolFamilyMessage.hashCode() : 0);
    }

    public String toString() {
        return "BEBehaviourSemesters(currentSemester=" + this.currentSemester + ", previousSemesters=" + this.previousSemesters + ", message=" + this.message + ')';
    }
}
