package oo0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Loo0/n;", "", "", "id", "Ljava/time/OffsetDateTime;", "startDate", "endDate", "", "Loo0/o;", "ideaVoteRoundConfigurations", "<init>", "(JLjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "()J", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "d", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaVoteRound {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<IdeaVoteRoundConfiguration> ideaVoteRoundConfigurations;

    public IdeaVoteRound(long j15, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, List<IdeaVoteRoundConfiguration> list) {
        this.id = j15;
        this.startDate = offsetDateTime;
        this.endDate = offsetDateTime2;
        this.ideaVoteRoundConfigurations = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getEndDate() {
        return this.endDate;
    }

    public final List<IdeaVoteRoundConfiguration> b() {
        return this.ideaVoteRoundConfigurations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaVoteRound)) {
            return false;
        }
        IdeaVoteRound ideaVoteRound = (IdeaVoteRound) other;
        return this.id == ideaVoteRound.id && fr.t.c(this.startDate, ideaVoteRound.startDate) && fr.t.c(this.endDate, ideaVoteRound.endDate) && fr.t.c(this.ideaVoteRoundConfigurations, ideaVoteRound.ideaVoteRoundConfigurations);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.ideaVoteRoundConfigurations.hashCode();
    }

    public String toString() {
        return "IdeaVoteRound(id=" + this.id + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", ideaVoteRoundConfigurations=" + this.ideaVoteRoundConfigurations + ")";
    }
}
