package yn0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yn0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyn0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "jwtToken", "", "Lyn0/q;", "b", "Ljava/util/List;", "()Ljava/util/List;", "permissions", "Lyn0/p;", "c", "Lyn0/p;", "()Lyn0/p;", "trustedProfileStatus", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionActionEligibilityResponseProfileAccessDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("jwtToken")
    private final String jwtToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("permissions")
    private final List<q> permissions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("trustedProfileStatus")
    private final p trustedProfileStatus;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJwtToken() {
        return this.jwtToken;
    }

    public final List<q> b() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p getTrustedProfileStatus() {
        return this.trustedProfileStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectionActionEligibilityResponseProfileAccessDto)) {
            return false;
        }
        ElectionActionEligibilityResponseProfileAccessDto electionActionEligibilityResponseProfileAccessDto = (ElectionActionEligibilityResponseProfileAccessDto) other;
        return t.c(this.jwtToken, electionActionEligibilityResponseProfileAccessDto.jwtToken) && t.c(this.permissions, electionActionEligibilityResponseProfileAccessDto.permissions) && this.trustedProfileStatus == electionActionEligibilityResponseProfileAccessDto.trustedProfileStatus;
    }

    public int hashCode() {
        return (((this.jwtToken.hashCode() * 31) + this.permissions.hashCode()) * 31) + this.trustedProfileStatus.hashCode();
    }

    public String toString() {
        return "ElectionActionEligibilityResponseProfileAccessDto(jwtToken=" + this.jwtToken + ", permissions=" + this.permissions + ", trustedProfileStatus=" + this.trustedProfileStatus + ')';
    }
}
