package rn0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrn0/e;", "", "", "Lrn0/b0;", "semesters", "Lrn0/a0;", "message", "<init>", "(Ljava/util/List;Lrn0/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lrn0/a0;", "()Lrn0/a0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEAttendanceSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BESemesterAttendanceSummary> semesters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESchoolFamilyMessage message;

    public BEAttendanceSummary(List<BESemesterAttendanceSummary> list, BESchoolFamilyMessage bESchoolFamilyMessage) {
        this.semesters = list;
        this.message = bESchoolFamilyMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BESchoolFamilyMessage getMessage() {
        return this.message;
    }

    public final List<BESemesterAttendanceSummary> b() {
        return this.semesters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEAttendanceSummary)) {
            return false;
        }
        BEAttendanceSummary bEAttendanceSummary = (BEAttendanceSummary) other;
        return fr.t.c(this.semesters, bEAttendanceSummary.semesters) && fr.t.c(this.message, bEAttendanceSummary.message);
    }

    public int hashCode() {
        List<BESemesterAttendanceSummary> list = this.semesters;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BESchoolFamilyMessage bESchoolFamilyMessage = this.message;
        return iHashCode + (bESchoolFamilyMessage != null ? bESchoolFamilyMessage.hashCode() : 0);
    }

    public String toString() {
        return "BEAttendanceSummary(semesters=" + this.semesters + ", message=" + this.message + ')';
    }
}
