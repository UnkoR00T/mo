package oo0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Loo0/g;", "", "Loo0/j;", "category", "", "id", "", "topic", "", "votes", "<init>", "(Loo0/j;JLjava/lang/String;I)V", "a", "Loo0/j;", "()Loo0/j;", "b", "J", "getId", "()J", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "I", "()I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdeaCategory category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String topic;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int votes;

    public g(IdeaCategory ideaCategory, long j15, String str, int i15) {
        this.category = ideaCategory;
        this.id = j15;
        this.topic = str;
        this.votes = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdeaCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getVotes() {
        return this.votes;
    }
}
