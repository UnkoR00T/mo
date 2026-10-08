package oo0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001f"}, d2 = {"Loo0/r;", "", "", "Loo0/i;", "ideas", "Ljava/time/OffsetDateTime;", "activeRoundEndDate", "", "activeRoundMobileName", "", "activeRoundEndDaysCounter", "<init>", "(Ljava/util/List;Ljava/time/OffsetDateTime;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "Ljava/lang/String;", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeasRoundDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Idea> ideas;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime activeRoundEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeRoundMobileName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int activeRoundEndDaysCounter;

    public IdeasRoundDetails(List<Idea> list, OffsetDateTime offsetDateTime, String str, int i15) {
        this.ideas = list;
        this.activeRoundEndDate = offsetDateTime;
        this.activeRoundMobileName = str;
        this.activeRoundEndDaysCounter = i15;
    }

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

    public final List<Idea> d() {
        return this.ideas;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeasRoundDetails)) {
            return false;
        }
        IdeasRoundDetails ideasRoundDetails = (IdeasRoundDetails) other;
        return fr.t.c(this.ideas, ideasRoundDetails.ideas) && fr.t.c(this.activeRoundEndDate, ideasRoundDetails.activeRoundEndDate) && fr.t.c(this.activeRoundMobileName, ideasRoundDetails.activeRoundMobileName) && this.activeRoundEndDaysCounter == ideasRoundDetails.activeRoundEndDaysCounter;
    }

    public int hashCode() {
        return (((((this.ideas.hashCode() * 31) + this.activeRoundEndDate.hashCode()) * 31) + this.activeRoundMobileName.hashCode()) * 31) + Integer.hashCode(this.activeRoundEndDaysCounter);
    }

    public String toString() {
        return "IdeasRoundDetails(ideas=" + this.ideas + ", activeRoundEndDate=" + this.activeRoundEndDate + ", activeRoundMobileName=" + this.activeRoundMobileName + ", activeRoundEndDaysCounter=" + this.activeRoundEndDaysCounter + ")";
    }
}
