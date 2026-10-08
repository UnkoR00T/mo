package ni0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ni0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lni0/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "conversationId", "Lni0/e;", "b", "Lni0/e;", "()Lni0/e;", "limits", "Lni0/k;", "c", "Lni0/k;", "()Lni0/k;", "staticMessages", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("conversationId")
    private final String conversationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("limits")
    private final ConversationLimitsDto limits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("staticMessages")
    private final StaticMessagesDto staticMessages;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ConversationLimitsDto getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StaticMessagesDto getStaticMessages() {
        return this.staticMessages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationDto)) {
            return false;
        }
        ConversationDto conversationDto = (ConversationDto) other;
        return t.c(this.conversationId, conversationDto.conversationId) && t.c(this.limits, conversationDto.limits) && t.c(this.staticMessages, conversationDto.staticMessages);
    }

    public int hashCode() {
        return (((this.conversationId.hashCode() * 31) + this.limits.hashCode()) * 31) + this.staticMessages.hashCode();
    }

    public String toString() {
        return "ConversationDto(conversationId=" + this.conversationId + ", limits=" + this.limits + ", staticMessages=" + this.staticMessages + ')';
    }
}
