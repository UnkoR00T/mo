package so0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0004R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lso0/v;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "activeRoundEndDate", "b", "I", "activeRoundEndDaysCounter", "c", "Ljava/lang/String;", "activeRoundMobileName", "", "Lso0/n;", "d", "Ljava/util/List;", "()Ljava/util/List;", "ideas", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeasResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeRoundEndDate")
    private final OffsetDateTime activeRoundEndDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeRoundEndDaysCounter")
    private final int activeRoundEndDaysCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeRoundMobileName")
    private final String activeRoundMobileName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("ideas")
    private final List<IdeaDtoDto> ideas;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getActiveRoundEndDate() {
        return this.activeRoundEndDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getActiveRoundEndDaysCounter() {
        return this.activeRoundEndDaysCounter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActiveRoundMobileName() {
        return this.activeRoundMobileName;
    }

    public final List<IdeaDtoDto> d() {
        return this.ideas;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeasResponseDto)) {
            return false;
        }
        IdeasResponseDto ideasResponseDto = (IdeasResponseDto) other;
        return fr.t.c(this.activeRoundEndDate, ideasResponseDto.activeRoundEndDate) && this.activeRoundEndDaysCounter == ideasResponseDto.activeRoundEndDaysCounter && fr.t.c(this.activeRoundMobileName, ideasResponseDto.activeRoundMobileName) && fr.t.c(this.ideas, ideasResponseDto.ideas);
    }

    public int hashCode() {
        return (((((this.activeRoundEndDate.hashCode() * 31) + Integer.hashCode(this.activeRoundEndDaysCounter)) * 31) + this.activeRoundMobileName.hashCode()) * 31) + this.ideas.hashCode();
    }

    public String toString() {
        return "IdeasResponseDto(activeRoundEndDate=" + this.activeRoundEndDate + ", activeRoundEndDaysCounter=" + this.activeRoundEndDaysCounter + ", activeRoundMobileName=" + this.activeRoundMobileName + ", ideas=" + this.ideas + ')';
    }
}
