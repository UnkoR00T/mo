package so0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lso0/s;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lso0/u;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "endedIdeaVoteRounds", "Lso0/r;", "Lso0/r;", "()Lso0/r;", "activeIdeaVoteRounds", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaVoteRoundResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("endedIdeaVoteRounds")
    private final List<IdeaVoteRoundWithPromotedIdeasDtoDto> endedIdeaVoteRounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeIdeaVoteRounds")
    private final IdeaVoteRoundDtoDto activeIdeaVoteRounds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaVoteRoundDtoDto getActiveIdeaVoteRounds() {
        return this.activeIdeaVoteRounds;
    }

    public final List<IdeaVoteRoundWithPromotedIdeasDtoDto> b() {
        return this.endedIdeaVoteRounds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaVoteRoundResponseDto)) {
            return false;
        }
        IdeaVoteRoundResponseDto ideaVoteRoundResponseDto = (IdeaVoteRoundResponseDto) other;
        return fr.t.c(this.endedIdeaVoteRounds, ideaVoteRoundResponseDto.endedIdeaVoteRounds) && fr.t.c(this.activeIdeaVoteRounds, ideaVoteRoundResponseDto.activeIdeaVoteRounds);
    }

    public int hashCode() {
        int iHashCode = this.endedIdeaVoteRounds.hashCode() * 31;
        IdeaVoteRoundDtoDto ideaVoteRoundDtoDto = this.activeIdeaVoteRounds;
        return iHashCode + (ideaVoteRoundDtoDto == null ? 0 : ideaVoteRoundDtoDto.hashCode());
    }

    public String toString() {
        return "IdeaVoteRoundResponseDto(endedIdeaVoteRounds=" + this.endedIdeaVoteRounds + ", activeIdeaVoteRounds=" + this.activeIdeaVoteRounds + ')';
    }
}
