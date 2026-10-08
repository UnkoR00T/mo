package oo0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Loo0/h;", "", "Loo0/j;", "category", "", "description", "", "id", "Loo0/l;", "status", "topic", "", "votes", "<init>", "(Loo0/j;Ljava/lang/String;JLoo0/l;Ljava/lang/String;I)V", "a", "Loo0/j;", "()Loo0/j;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "J", "()J", "d", "Loo0/l;", "()Loo0/l;", "e", "f", "I", "()I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdeaCategory category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final IdeaStatus status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String topic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int votes;

    public h(IdeaCategory ideaCategory, String str, long j15, IdeaStatus ideaStatus, String str2, int i15) {
        this.category = ideaCategory;
        this.description = str;
        this.id = j15;
        this.status = ideaStatus;
        this.topic = str2;
        this.votes = i15;
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
    public final IdeaStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getVotes() {
        return this.votes;
    }
}
