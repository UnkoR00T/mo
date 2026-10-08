package ri0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ri0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lri0/b;", "", "Liy/b0;", "conversationId", "Lri0/i;", "staticMessages", "Lri0/c;", "limits", "<init>", "(Liy/b0;Lri0/i;Lri0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lri0/i;", "c", "()Lri0/i;", "Lri0/c;", "()Lri0/c;", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEConversationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 conversationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEStaticMessages staticMessages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BELimits limits;

    public BEConversationData(b0 b0Var, BEStaticMessages bEStaticMessages, BELimits bELimits) {
        this.conversationId = b0Var;
        this.staticMessages = bEStaticMessages;
        this.limits = bELimits;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BELimits getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEStaticMessages getStaticMessages() {
        return this.staticMessages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEConversationData)) {
            return false;
        }
        BEConversationData bEConversationData = (BEConversationData) other;
        return t.c(this.conversationId, bEConversationData.conversationId) && t.c(this.staticMessages, bEConversationData.staticMessages) && t.c(this.limits, bEConversationData.limits);
    }

    public int hashCode() {
        return (((this.conversationId.hashCode() * 31) + this.staticMessages.hashCode()) * 31) + this.limits.hashCode();
    }

    public String toString() {
        return "BEConversationData(conversationId=" + this.conversationId + ", staticMessages=" + this.staticMessages + ", limits=" + this.limits + ')';
    }
}
