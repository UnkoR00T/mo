package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Leo0/n;", "", "Leo0/y;", "attachmentId", "", "fileName", "", "fileSize", "", "tooBigToDownload", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMessageDetailsAttachment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String attachmentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fileSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tooBigToDownload;

    public /* synthetic */ DeliveryMessageDetailsAttachment(String str, String str2, int i15, boolean z15, fr.k kVar) {
        this(str, str2, i15, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTooBigToDownload() {
        return this.tooBigToDownload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMessageDetailsAttachment)) {
            return false;
        }
        DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment = (DeliveryMessageDetailsAttachment) other;
        return y.d(this.attachmentId, deliveryMessageDetailsAttachment.attachmentId) && fr.t.c(this.fileName, deliveryMessageDetailsAttachment.fileName) && this.fileSize == deliveryMessageDetailsAttachment.fileSize && this.tooBigToDownload == deliveryMessageDetailsAttachment.tooBigToDownload;
    }

    public int hashCode() {
        return (((((y.e(this.attachmentId) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31) + Boolean.hashCode(this.tooBigToDownload);
    }

    public String toString() {
        return "DeliveryMessageDetailsAttachment(attachmentId=" + y.f(this.attachmentId) + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", tooBigToDownload=" + this.tooBigToDownload + ")";
    }

    private DeliveryMessageDetailsAttachment(String str, String str2, int i15, boolean z15) {
        this.attachmentId = str;
        this.fileName = str2;
        this.fileSize = i15;
        this.tooBigToDownload = z15;
    }
}
