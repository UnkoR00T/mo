package ni0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ni0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lni0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "maxCharacters", "b", "maxQuestions", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationLimitsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxCharacters")
    private final int maxCharacters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxQuestions")
    private final int maxQuestions;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaxCharacters() {
        return this.maxCharacters;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxQuestions() {
        return this.maxQuestions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationLimitsDto)) {
            return false;
        }
        ConversationLimitsDto conversationLimitsDto = (ConversationLimitsDto) other;
        return this.maxCharacters == conversationLimitsDto.maxCharacters && this.maxQuestions == conversationLimitsDto.maxQuestions;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxCharacters) * 31) + Integer.hashCode(this.maxQuestions);
    }

    public String toString() {
        return "ConversationLimitsDto(maxCharacters=" + this.maxCharacters + ", maxQuestions=" + this.maxQuestions + ')';
    }
}
