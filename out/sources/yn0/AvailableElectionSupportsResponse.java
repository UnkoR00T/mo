package yn0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yn0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lyn0/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hasVotingRights", "", "Lyn0/c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "possibleSupports", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableElectionSupportsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("hasVotingRights")
    private final boolean hasVotingRights;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("possibleSupports")
    private final List<AvailableElectionSupportsResponsePossibleElectionSupportDto> possibleSupports;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasVotingRights() {
        return this.hasVotingRights;
    }

    public final List<AvailableElectionSupportsResponsePossibleElectionSupportDto> b() {
        return this.possibleSupports;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableElectionSupportsResponse)) {
            return false;
        }
        AvailableElectionSupportsResponse availableElectionSupportsResponse = (AvailableElectionSupportsResponse) other;
        return this.hasVotingRights == availableElectionSupportsResponse.hasVotingRights && t.c(this.possibleSupports, availableElectionSupportsResponse.possibleSupports);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.hasVotingRights) * 31) + this.possibleSupports.hashCode();
    }

    public String toString() {
        return "AvailableElectionSupportsResponse(hasVotingRights=" + this.hasVotingRights + ", possibleSupports=" + this.possibleSupports + ')';
    }
}
