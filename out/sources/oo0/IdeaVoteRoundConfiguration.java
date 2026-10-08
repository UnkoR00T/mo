package oo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Loo0/o;", "", "Loo0/j;", "category", "", "promotedIdeas", "<init>", "(Loo0/j;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo0/j;", "()Loo0/j;", "b", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdeaVoteRoundConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdeaCategory category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int promotedIdeas;

    public IdeaVoteRoundConfiguration(IdeaCategory ideaCategory, int i15) {
        this.category = ideaCategory;
        this.promotedIdeas = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaCategory getCategory() {
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
        if (!(other instanceof IdeaVoteRoundConfiguration)) {
            return false;
        }
        IdeaVoteRoundConfiguration ideaVoteRoundConfiguration = (IdeaVoteRoundConfiguration) other;
        return fr.t.c(this.category, ideaVoteRoundConfiguration.category) && this.promotedIdeas == ideaVoteRoundConfiguration.promotedIdeas;
    }

    public int hashCode() {
        return (this.category.hashCode() * 31) + Integer.hashCode(this.promotedIdeas);
    }

    public String toString() {
        return "IdeaVoteRoundConfiguration(category=" + this.category + ", promotedIdeas=" + this.promotedIdeas + ")";
    }
}
