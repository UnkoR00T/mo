package un0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: un0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lun0/c;", "", "", "isAdult", "Lun0/d;", "profileAccess", "<init>", "(ZLun0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lun0/d;", "()Lun0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionActionEligibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAdult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ElectionActionEligibilityProfileAccess profileAccess;

    public ElectionActionEligibility(boolean z15, ElectionActionEligibilityProfileAccess electionActionEligibilityProfileAccess) {
        this.isAdult = z15;
        this.profileAccess = electionActionEligibilityProfileAccess;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ElectionActionEligibilityProfileAccess getProfileAccess() {
        return this.profileAccess;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectionActionEligibility)) {
            return false;
        }
        ElectionActionEligibility electionActionEligibility = (ElectionActionEligibility) other;
        return this.isAdult == electionActionEligibility.isAdult && t.c(this.profileAccess, electionActionEligibility.profileAccess);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isAdult) * 31;
        ElectionActionEligibilityProfileAccess electionActionEligibilityProfileAccess = this.profileAccess;
        return iHashCode + (electionActionEligibilityProfileAccess == null ? 0 : electionActionEligibilityProfileAccess.hashCode());
    }

    public String toString() {
        return "ElectionActionEligibility(isAdult=" + this.isAdult + ", profileAccess=" + this.profileAccess + ")";
    }
}
