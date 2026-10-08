package un0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: un0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lun0/b;", "", "", "hasVotingRights", "", "Lun0/a;", "possibleSupports", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableElectionSupports {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasVotingRights;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableElectionSupport> possibleSupports;

    public AvailableElectionSupports(boolean z15, List<AvailableElectionSupport> list) {
        this.hasVotingRights = z15;
        this.possibleSupports = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasVotingRights() {
        return this.hasVotingRights;
    }

    public final List<AvailableElectionSupport> b() {
        return this.possibleSupports;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableElectionSupports)) {
            return false;
        }
        AvailableElectionSupports availableElectionSupports = (AvailableElectionSupports) other;
        return this.hasVotingRights == availableElectionSupports.hasVotingRights && t.c(this.possibleSupports, availableElectionSupports.possibleSupports);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.hasVotingRights) * 31) + this.possibleSupports.hashCode();
    }

    public String toString() {
        return "AvailableElectionSupports(hasVotingRights=" + this.hasVotingRights + ", possibleSupports=" + this.possibleSupports + ")";
    }
}
