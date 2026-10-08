package so0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\"\u0010\u0004R\u001a\u0010%\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010 R\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0007¨\u0006)"}, d2 = {"Lso0/n;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lso0/m;", "a", "Lso0/m;", "()Lso0/m;", "category", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "createdAt", "c", "Ljava/lang/String;", "description", "", "d", "J", "()J", "id", "e", "Z", "()Z", "sentByUser", "f", "topic", "g", "votedByUser", "h", "I", "votes", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("category")
    private final IdeaCategoryDtoDto category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("createdAt")
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sentByUser")
    private final boolean sentByUser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topic")
    private final String topic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("votedByUser")
    private final boolean votedByUser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("votes")
    private final int votes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaCategoryDtoDto getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSentByUser() {
        return this.sentByUser;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaDtoDto)) {
            return false;
        }
        IdeaDtoDto ideaDtoDto = (IdeaDtoDto) other;
        return fr.t.c(this.category, ideaDtoDto.category) && fr.t.c(this.createdAt, ideaDtoDto.createdAt) && fr.t.c(this.description, ideaDtoDto.description) && this.id == ideaDtoDto.id && this.sentByUser == ideaDtoDto.sentByUser && fr.t.c(this.topic, ideaDtoDto.topic) && this.votedByUser == ideaDtoDto.votedByUser && this.votes == ideaDtoDto.votes;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getVotedByUser() {
        return this.votedByUser;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getVotes() {
        return this.votes;
    }

    public int hashCode() {
        return (((((((((((((this.category.hashCode() * 31) + this.createdAt.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Boolean.hashCode(this.sentByUser)) * 31) + this.topic.hashCode()) * 31) + Boolean.hashCode(this.votedByUser)) * 31) + Integer.hashCode(this.votes);
    }

    public String toString() {
        return "IdeaDtoDto(category=" + this.category + ", createdAt=" + this.createdAt + ", description=" + this.description + ", id=" + this.id + ", sentByUser=" + this.sentByUser + ", topic=" + this.topic + ", votedByUser=" + this.votedByUser + ", votes=" + this.votes + ')';
    }
}
