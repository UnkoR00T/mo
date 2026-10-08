package pt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Lpt3/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpt3/i;", "a", "Lpt3/i;", "e", "()Lpt3/i;", "status", "Lpt3/l;", "b", "Lpt3/l;", "()Lpt3/l;", "documentSchema", "Lpt3/n;", "c", "Lpt3/n;", "()Lpt3/n;", "documentToDownload", "Lpt3/d;", "d", "Lpt3/d;", "()Lpt3/d;", "downloadingErrorMessage", "Lpt3/x;", "Lpt3/x;", "()Lpt3/x;", "multiDocumentSchema", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentGenerationResultDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final i status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentSchema")
    private final DocumentSchemaDto documentSchema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentToDownload")
    private final DocumentToDownloadDto documentToDownload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("downloadingErrorMessage")
    private final AsyncErrorResponseDto downloadingErrorMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentSchema")
    private final MultiDocumentSchemaDto multiDocumentSchema;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentSchemaDto getDocumentSchema() {
        return this.documentSchema;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentToDownloadDto getDocumentToDownload() {
        return this.documentToDownload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AsyncErrorResponseDto getDownloadingErrorMessage() {
        return this.downloadingErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MultiDocumentSchemaDto getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentGenerationResultDto)) {
            return false;
        }
        AsyncDocumentGenerationResultDto asyncDocumentGenerationResultDto = (AsyncDocumentGenerationResultDto) other;
        return this.status == asyncDocumentGenerationResultDto.status && fr.t.c(this.documentSchema, asyncDocumentGenerationResultDto.documentSchema) && fr.t.c(this.documentToDownload, asyncDocumentGenerationResultDto.documentToDownload) && fr.t.c(this.downloadingErrorMessage, asyncDocumentGenerationResultDto.downloadingErrorMessage) && fr.t.c(this.multiDocumentSchema, asyncDocumentGenerationResultDto.multiDocumentSchema);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        DocumentSchemaDto documentSchemaDto = this.documentSchema;
        int iHashCode2 = (iHashCode + (documentSchemaDto == null ? 0 : documentSchemaDto.hashCode())) * 31;
        DocumentToDownloadDto documentToDownloadDto = this.documentToDownload;
        int iHashCode3 = (iHashCode2 + (documentToDownloadDto == null ? 0 : documentToDownloadDto.hashCode())) * 31;
        AsyncErrorResponseDto asyncErrorResponseDto = this.downloadingErrorMessage;
        int iHashCode4 = (iHashCode3 + (asyncErrorResponseDto == null ? 0 : asyncErrorResponseDto.hashCode())) * 31;
        MultiDocumentSchemaDto multiDocumentSchemaDto = this.multiDocumentSchema;
        return iHashCode4 + (multiDocumentSchemaDto != null ? multiDocumentSchemaDto.hashCode() : 0);
    }

    public String toString() {
        return "AsyncDocumentGenerationResultDto(status=" + this.status + ", documentSchema=" + this.documentSchema + ", documentToDownload=" + this.documentToDownload + ", downloadingErrorMessage=" + this.downloadingErrorMessage + ", multiDocumentSchema=" + this.multiDocumentSchema + ')';
    }
}
