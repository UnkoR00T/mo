package yn0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yn0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lyn0/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "isAdult", "Lyn0/e;", "Lyn0/e;", "()Lyn0/e;", "profileAccess", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionActionEligibilityResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isAdult")
    private final boolean isAdult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("profileAccess")
    private final ElectionActionEligibilityResponseProfileAccessDto profileAccess;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ElectionActionEligibilityResponseProfileAccessDto getProfileAccess() {
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
        if (!(other instanceof ElectionActionEligibilityResponse)) {
            return false;
        }
        ElectionActionEligibilityResponse electionActionEligibilityResponse = (ElectionActionEligibilityResponse) other;
        return this.isAdult == electionActionEligibilityResponse.isAdult && t.c(this.profileAccess, electionActionEligibilityResponse.profileAccess);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isAdult) * 31;
        ElectionActionEligibilityResponseProfileAccessDto electionActionEligibilityResponseProfileAccessDto = this.profileAccess;
        return iHashCode + (electionActionEligibilityResponseProfileAccessDto == null ? 0 : electionActionEligibilityResponseProfileAccessDto.hashCode());
    }

    public String toString() {
        return "ElectionActionEligibilityResponse(isAdult=" + this.isAdult + ", profileAccess=" + this.profileAccess + ')';
    }
}
