package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.p1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Ljo0/p1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "attachmentId", "b", "getWarning", "warning", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SaveEdeliveryDraftMessageAttachmentResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachmentId")
    private final String attachmentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warning")
    private final String warning;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveEdeliveryDraftMessageAttachmentResponseDto)) {
            return false;
        }
        SaveEdeliveryDraftMessageAttachmentResponseDto saveEdeliveryDraftMessageAttachmentResponseDto = (SaveEdeliveryDraftMessageAttachmentResponseDto) other;
        return fr.t.c(this.attachmentId, saveEdeliveryDraftMessageAttachmentResponseDto.attachmentId) && fr.t.c(this.warning, saveEdeliveryDraftMessageAttachmentResponseDto.warning);
    }

    public int hashCode() {
        int iHashCode = this.attachmentId.hashCode() * 31;
        String str = this.warning;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SaveEdeliveryDraftMessageAttachmentResponseDto(attachmentId=" + this.attachmentId + ", warning=" + this.warning + ')';
    }
}
