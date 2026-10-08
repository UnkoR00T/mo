package oo0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b!\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Loo0/i;", "", "", "id", "", "description", "Loo0/j;", "category", "", "votes", "topic", "Ljava/time/OffsetDateTime;", "createdAtOffsetDateTime", "", "votedByUser", "sentByUser", "<init>", "(JLjava/lang/String;Loo0/j;ILjava/lang/String;Ljava/time/OffsetDateTime;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "Loo0/j;", "()Loo0/j;", "d", "I", "f", "e", "Ljava/time/OffsetDateTime;", "getCreatedAtOffsetDateTime", "()Ljava/time/OffsetDateTime;", "g", "Z", "()Z", "h", "getSentByUser", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Idea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdeaCategory category;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int votes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAtOffsetDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean votedByUser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sentByUser;

    public Idea(long j15, String str, IdeaCategory ideaCategory, int i15, String str2, OffsetDateTime offsetDateTime, boolean z15, boolean z16) {
        this.id = j15;
        this.description = str;
        this.category = ideaCategory;
        this.votes = i15;
        this.topic = str2;
        this.createdAtOffsetDateTime = offsetDateTime;
        this.votedByUser = z15;
        this.sentByUser = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getVotedByUser() {
        return this.votedByUser;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Idea)) {
            return false;
        }
        Idea idea = (Idea) other;
        return this.id == idea.id && fr.t.c(this.description, idea.description) && fr.t.c(this.category, idea.category) && this.votes == idea.votes && fr.t.c(this.topic, idea.topic) && fr.t.c(this.createdAtOffsetDateTime, idea.createdAtOffsetDateTime) && this.votedByUser == idea.votedByUser && this.sentByUser == idea.sentByUser;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getVotes() {
        return this.votes;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.id) * 31) + this.description.hashCode()) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.votes)) * 31) + this.topic.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.createdAtOffsetDateTime;
        return ((((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + Boolean.hashCode(this.votedByUser)) * 31) + Boolean.hashCode(this.sentByUser);
    }

    public String toString() {
        return "Idea(id=" + this.id + ", description=" + this.description + ", category=" + this.category + ", votes=" + this.votes + ", topic=" + this.topic + ", createdAtOffsetDateTime=" + this.createdAtOffsetDateTime + ", votedByUser=" + this.votedByUser + ", sentByUser=" + this.sentByUser + ")";
    }
}
