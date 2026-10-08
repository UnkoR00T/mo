package or0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Lor0/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lor0/p;", "a", "Lor0/p;", "e", "()Lor0/p;", "status", "Lor0/x;", "b", "Lor0/x;", "()Lor0/x;", "documentSchema", "Lor0/i0;", "c", "Lor0/i0;", "()Lor0/i0;", "documentToDownload", "Lor0/e;", "d", "Lor0/e;", "()Lor0/e;", "downloadingErrorMessage", "Lor0/z0;", "Lor0/z0;", "()Lor0/z0;", "multiDocumentSchema", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentGenerationResultDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final p status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentSchema")
    private final DocumentSchemaDtoDto documentSchema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentToDownload")
    private final DocumentToDownloadDtoDto documentToDownload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("downloadingErrorMessage")
    private final AsyncErrorResponseDtoDto downloadingErrorMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentSchema")
    private final MultiDocumentSchemaDtoDto multiDocumentSchema;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentSchemaDtoDto getDocumentSchema() {
        return this.documentSchema;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentToDownloadDtoDto getDocumentToDownload() {
        return this.documentToDownload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AsyncErrorResponseDtoDto getDownloadingErrorMessage() {
        return this.downloadingErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MultiDocumentSchemaDtoDto getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentGenerationResultDtoDto)) {
            return false;
        }
        AsyncDocumentGenerationResultDtoDto asyncDocumentGenerationResultDtoDto = (AsyncDocumentGenerationResultDtoDto) other;
        return this.status == asyncDocumentGenerationResultDtoDto.status && fr.t.c(this.documentSchema, asyncDocumentGenerationResultDtoDto.documentSchema) && fr.t.c(this.documentToDownload, asyncDocumentGenerationResultDtoDto.documentToDownload) && fr.t.c(this.downloadingErrorMessage, asyncDocumentGenerationResultDtoDto.downloadingErrorMessage) && fr.t.c(this.multiDocumentSchema, asyncDocumentGenerationResultDtoDto.multiDocumentSchema);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        DocumentSchemaDtoDto documentSchemaDtoDto = this.documentSchema;
        int iHashCode2 = (iHashCode + (documentSchemaDtoDto == null ? 0 : documentSchemaDtoDto.hashCode())) * 31;
        DocumentToDownloadDtoDto documentToDownloadDtoDto = this.documentToDownload;
        int iHashCode3 = (iHashCode2 + (documentToDownloadDtoDto == null ? 0 : documentToDownloadDtoDto.hashCode())) * 31;
        AsyncErrorResponseDtoDto asyncErrorResponseDtoDto = this.downloadingErrorMessage;
        int iHashCode4 = (iHashCode3 + (asyncErrorResponseDtoDto == null ? 0 : asyncErrorResponseDtoDto.hashCode())) * 31;
        MultiDocumentSchemaDtoDto multiDocumentSchemaDtoDto = this.multiDocumentSchema;
        return iHashCode4 + (multiDocumentSchemaDtoDto != null ? multiDocumentSchemaDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "AsyncDocumentGenerationResultDtoDto(status=" + this.status + ", documentSchema=" + this.documentSchema + ", documentToDownload=" + this.documentToDownload + ", downloadingErrorMessage=" + this.downloadingErrorMessage + ", multiDocumentSchema=" + this.multiDocumentSchema + ')';
    }
}
