package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Ljo0/a0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "attachmentId", "b", "I", "fileSize", "c", "filename", "d", "Z", "()Z", "tooBigToDownload", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMessageDetailsAttachmentDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachmentId")
    private final String attachmentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileSize")
    private final int fileSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("filename")
    private final String filename;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tooBigToDownload")
    private final boolean tooBigToDownload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTooBigToDownload() {
        return this.tooBigToDownload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMessageDetailsAttachmentDtoDto)) {
            return false;
        }
        DeliveryMessageDetailsAttachmentDtoDto deliveryMessageDetailsAttachmentDtoDto = (DeliveryMessageDetailsAttachmentDtoDto) other;
        return fr.t.c(this.attachmentId, deliveryMessageDetailsAttachmentDtoDto.attachmentId) && this.fileSize == deliveryMessageDetailsAttachmentDtoDto.fileSize && fr.t.c(this.filename, deliveryMessageDetailsAttachmentDtoDto.filename) && this.tooBigToDownload == deliveryMessageDetailsAttachmentDtoDto.tooBigToDownload;
    }

    public int hashCode() {
        return (((((this.attachmentId.hashCode() * 31) + Integer.hashCode(this.fileSize)) * 31) + this.filename.hashCode()) * 31) + Boolean.hashCode(this.tooBigToDownload);
    }

    public String toString() {
        return "DeliveryMessageDetailsAttachmentDtoDto(attachmentId=" + this.attachmentId + ", fileSize=" + this.fileSize + ", filename=" + this.filename + ", tooBigToDownload=" + this.tooBigToDownload + ')';
    }
}
