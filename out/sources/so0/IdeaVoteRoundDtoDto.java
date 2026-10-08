package so0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lso0/r;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "endDate", "", "b", "J", "()J", "id", "", "Lso0/q;", "c", "Ljava/util/List;", "()Ljava/util/List;", "ideaVoteRoundConfigurations", "d", "startDate", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaVoteRoundDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("endDate")
    private final OffsetDateTime endDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("ideaVoteRoundConfigurations")
    private final List<IdeaVoteRoundConfigurationDtoDto> ideaVoteRoundConfigurations;

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

    public final List<IdeaVoteRoundConfigurationDtoDto> c() {
        return this.ideaVoteRoundConfigurations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaVoteRoundDtoDto)) {
            return false;
        }
        IdeaVoteRoundDtoDto ideaVoteRoundDtoDto = (IdeaVoteRoundDtoDto) other;
        return fr.t.c(this.endDate, ideaVoteRoundDtoDto.endDate) && this.id == ideaVoteRoundDtoDto.id && fr.t.c(this.ideaVoteRoundConfigurations, ideaVoteRoundDtoDto.ideaVoteRoundConfigurations) && fr.t.c(this.startDate, ideaVoteRoundDtoDto.startDate);
    }

    public int hashCode() {
        return (((((this.endDate.hashCode() * 31) + Long.hashCode(this.id)) * 31) + this.ideaVoteRoundConfigurations.hashCode()) * 31) + this.startDate.hashCode();
    }

    public String toString() {
        return "IdeaVoteRoundDtoDto(endDate=" + this.endDate + ", id=" + this.id + ", ideaVoteRoundConfigurations=" + this.ideaVoteRoundConfigurations + ", startDate=" + this.startDate + ')';
    }
}
