package x94;

import aa4.GradeDetailsData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lx94/v;", "", "a", "b", "Lx94/v$a;", "Lx94/v$b;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface v {

    /* JADX INFO: renamed from: x94.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lx94/v$a;", "Lx94/v;", "", "gradeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GradeById implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gradeId;

        public GradeById(String str) {
            this.gradeId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGradeId() {
            return this.gradeId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GradeById) && fr.t.c(this.gradeId, ((GradeById) other).gradeId);
        }

        public int hashCode() {
            return this.gradeId.hashCode();
        }

        public String toString() {
            return "GradeById(gradeId=" + this.gradeId + ')';
        }
    }

    /* JADX INFO: renamed from: x94.v$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx94/v$b;", "Lx94/v;", "Laa4/a;", "gradeDetails", "<init>", "(Laa4/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laa4/a;", "()Laa4/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GradeWithDetails implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GradeDetailsData gradeDetails;

        public GradeWithDetails(GradeDetailsData gradeDetailsData) {
            this.gradeDetails = gradeDetailsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GradeDetailsData getGradeDetails() {
            return this.gradeDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GradeWithDetails) && fr.t.c(this.gradeDetails, ((GradeWithDetails) other).gradeDetails);
        }

        public int hashCode() {
            return this.gradeDetails.hashCode();
        }

        public String toString() {
            return "GradeWithDetails(gradeDetails=" + this.gradeDetails + ')';
        }
    }
}
