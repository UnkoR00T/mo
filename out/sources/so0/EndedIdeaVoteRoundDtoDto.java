package so0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lso0/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "endDate", "", "b", "J", "()J", "id", "c", "Ljava/lang/String;", "mobileName", "d", "startDate", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EndedIdeaVoteRoundDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("endDate")
    private final OffsetDateTime endDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobileName")
    private final String mobileName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("startDate")
    private final OffsetDateTime startDate;

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
        if (!(other instanceof EndedIdeaVoteRoundDtoDto)) {
            return false;
        }
        EndedIdeaVoteRoundDtoDto endedIdeaVoteRoundDtoDto = (EndedIdeaVoteRoundDtoDto) other;
        return fr.t.c(this.endDate, endedIdeaVoteRoundDtoDto.endDate) && this.id == endedIdeaVoteRoundDtoDto.id && fr.t.c(this.mobileName, endedIdeaVoteRoundDtoDto.mobileName) && fr.t.c(this.startDate, endedIdeaVoteRoundDtoDto.startDate);
    }

    public int hashCode() {
        return (((((this.endDate.hashCode() * 31) + Long.hashCode(this.id)) * 31) + this.mobileName.hashCode()) * 31) + this.startDate.hashCode();
    }

    public String toString() {
        return "EndedIdeaVoteRoundDtoDto(endDate=" + this.endDate + ", id=" + this.id + ", mobileName=" + this.mobileName + ", startDate=" + this.startDate + ')';
    }
}
