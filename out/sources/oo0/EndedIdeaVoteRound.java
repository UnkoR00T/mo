package oo0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Loo0/e;", "", "", "id", "Ljava/time/OffsetDateTime;", "startDate", "endDate", "", "mobileName", "<init>", "(JLjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/time/OffsetDateTime;", "d", "()Ljava/time/OffsetDateTime;", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EndedIdeaVoteRound {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mobileName;

    public EndedIdeaVoteRound() {
        this(0L, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMobileName() {
        return this.mobileName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndedIdeaVoteRound)) {
            return false;
        }
        EndedIdeaVoteRound endedIdeaVoteRound = (EndedIdeaVoteRound) other;
        return this.id == endedIdeaVoteRound.id && fr.t.c(this.startDate, endedIdeaVoteRound.startDate) && fr.t.c(this.endDate, endedIdeaVoteRound.endDate) && fr.t.c(this.mobileName, endedIdeaVoteRound.mobileName);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.mobileName.hashCode();
    }

    public String toString() {
        return "EndedIdeaVoteRound(id=" + this.id + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", mobileName=" + this.mobileName + ")";
    }

    public EndedIdeaVoteRound(long j15, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str) {
        this.id = j15;
        this.startDate = offsetDateTime;
        this.endDate = offsetDateTime2;
        this.mobileName = str;
    }

    public /* synthetic */ EndedIdeaVoteRound(long j15, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? 0L : j15, (i15 & 2) != 0 ? OffsetDateTime.now() : offsetDateTime, (i15 & 4) != 0 ? OffsetDateTime.now() : offsetDateTime2, (i15 & 8) != 0 ? "" : str);
    }
}
