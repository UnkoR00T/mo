package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.s0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Ljo0/s0;", "", "", "", "attachmentIds", "directoryId", "messageId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAttachmentIds", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getDirectoryId", "c", "getMessageId", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForwardDetailsDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachmentIds")
    private final List<String> attachmentIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("directoryId")
    private final String directoryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("messageId")
    private final String messageId;

    public ForwardDetailsDtoDto(List<String> list, String str, String str2) {
        this.attachmentIds = list;
        this.directoryId = str;
        this.messageId = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForwardDetailsDtoDto)) {
            return false;
        }
        ForwardDetailsDtoDto forwardDetailsDtoDto = (ForwardDetailsDtoDto) other;
        return fr.t.c(this.attachmentIds, forwardDetailsDtoDto.attachmentIds) && fr.t.c(this.directoryId, forwardDetailsDtoDto.directoryId) && fr.t.c(this.messageId, forwardDetailsDtoDto.messageId);
    }

    public int hashCode() {
        return (((this.attachmentIds.hashCode() * 31) + this.directoryId.hashCode()) * 31) + this.messageId.hashCode();
    }

    public String toString() {
        return "ForwardDetailsDtoDto(attachmentIds=" + this.attachmentIds + ", directoryId=" + this.directoryId + ", messageId=" + this.messageId + ')';
    }
}
