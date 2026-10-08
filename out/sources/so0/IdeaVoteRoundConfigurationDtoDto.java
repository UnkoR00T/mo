package so0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lso0/q;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lso0/m;", "a", "Lso0/m;", "()Lso0/m;", "category", "b", "I", "promotedIdeas", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaVoteRoundConfigurationDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final IdeaCategoryDtoDto category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("promotedIdeas")
    private final int promotedIdeas;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaCategoryDtoDto getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPromotedIdeas() {
        return this.promotedIdeas;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaVoteRoundConfigurationDtoDto)) {
            return false;
        }
        IdeaVoteRoundConfigurationDtoDto ideaVoteRoundConfigurationDtoDto = (IdeaVoteRoundConfigurationDtoDto) other;
        return fr.t.c(this.category, ideaVoteRoundConfigurationDtoDto.category) && this.promotedIdeas == ideaVoteRoundConfigurationDtoDto.promotedIdeas;
    }

    public int hashCode() {
        return (this.category.hashCode() * 31) + Integer.hashCode(this.promotedIdeas);
    }

    public String toString() {
        return "IdeaVoteRoundConfigurationDtoDto(category=" + this.category + ", promotedIdeas=" + this.promotedIdeas + ')';
    }
}
