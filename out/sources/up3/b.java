package up3;

import oo0.EndedIdeaVoteRound;
import oo0.EndedRoundVotingResult;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lup3/b;", "", "b", "c", "a", "Lup3/b$b;", "Lup3/b$c;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lup3/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PROMOTED,
        OTHER;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f199837d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: up3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lup3/b$b;", "Lup3/b;", "Loo0/e;", "roundData", "<init>", "(Loo0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo0/e;", "()Loo0/e;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EndedIdeaVoteRound roundData;

        public Initial(EndedIdeaVoteRound endedIdeaVoteRound) {
            this.roundData = endedIdeaVoteRound;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EndedIdeaVoteRound getRoundData() {
            return this.roundData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.roundData, ((Initial) other).roundData);
        }

        public int hashCode() {
            return this.roundData.hashCode();
        }

        public String toString() {
            return "Initial(roundData=" + this.roundData + ')';
        }
    }

    /* JADX INFO: renamed from: up3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lup3/b$c;", "Lup3/b;", "Loo0/f;", "results", "Lup3/b$a;", "filterSelected", "Loo0/e;", "roundData", "<init>", "(Loo0/f;Lup3/b$a;Loo0/e;)V", "a", "(Loo0/f;Lup3/b$a;Loo0/e;)Lup3/b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo0/f;", "d", "()Loo0/f;", "b", "Lup3/b$a;", "c", "()Lup3/b$a;", "Loo0/e;", "e", "()Loo0/e;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EndedRoundVotingResult results;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a filterSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EndedIdeaVoteRound roundData;

        public Initialized(EndedRoundVotingResult endedRoundVotingResult, a aVar, EndedIdeaVoteRound endedIdeaVoteRound) {
            this.results = endedRoundVotingResult;
            this.filterSelected = aVar;
            this.roundData = endedIdeaVoteRound;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, EndedRoundVotingResult endedRoundVotingResult, a aVar, EndedIdeaVoteRound endedIdeaVoteRound, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                endedRoundVotingResult = initialized.results;
            }
            if ((i15 & 2) != 0) {
                aVar = initialized.filterSelected;
            }
            if ((i15 & 4) != 0) {
                endedIdeaVoteRound = initialized.roundData;
            }
            return initialized.a(endedRoundVotingResult, aVar, endedIdeaVoteRound);
        }

        public final Initialized a(EndedRoundVotingResult results, a filterSelected, EndedIdeaVoteRound roundData) {
            return new Initialized(results, filterSelected, roundData);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getFilterSelected() {
            return this.filterSelected;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EndedRoundVotingResult getResults() {
            return this.results;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EndedIdeaVoteRound getRoundData() {
            return this.roundData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.results, initialized.results) && this.filterSelected == initialized.filterSelected && fr.t.c(this.roundData, initialized.roundData);
        }

        public int hashCode() {
            return (((this.results.hashCode() * 31) + this.filterSelected.hashCode()) * 31) + this.roundData.hashCode();
        }

        public String toString() {
            return "Initialized(results=" + this.results + ", filterSelected=" + this.filterSelected + ", roundData=" + this.roundData + ')';
        }

        public /* synthetic */ Initialized(EndedRoundVotingResult endedRoundVotingResult, a aVar, EndedIdeaVoteRound endedIdeaVoteRound, int i15, fr.k kVar) {
            this(endedRoundVotingResult, (i15 & 2) != 0 ? a.PROMOTED : aVar, endedIdeaVoteRound);
        }
    }
}
