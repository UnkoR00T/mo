package nz3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nz3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lnz3/c;", "", "", "asyncDownloadTerminationInterval", "", "mainDocumentId", "Lnz3/a;", "asyncErrorResponse", "previousMainDocumentId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lnz3/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "c", "Lnz3/a;", "()Lnz3/a;", "d", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaskIncludedDocumentDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("asyncDownloadTerminationInterval")
    private final Long asyncDownloadTerminationInterval;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mainDocumentId")
    private final String mainDocumentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("asyncErrorResponse")
    private final AsyncErrorResponseDto asyncErrorResponse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("previousMainDocumentId")
    private final String previousMainDocumentId;

    public TaskIncludedDocumentDataDto(Long l15, String str, AsyncErrorResponseDto asyncErrorResponseDto, String str2) {
        this.asyncDownloadTerminationInterval = l15;
        this.mainDocumentId = str;
        this.asyncErrorResponse = asyncErrorResponseDto;
        this.previousMainDocumentId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAsyncDownloadTerminationInterval() {
        return this.asyncDownloadTerminationInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AsyncErrorResponseDto getAsyncErrorResponse() {
        return this.asyncErrorResponse;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMainDocumentId() {
        return this.mainDocumentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPreviousMainDocumentId() {
        return this.previousMainDocumentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskIncludedDocumentDataDto)) {
            return false;
        }
        TaskIncludedDocumentDataDto taskIncludedDocumentDataDto = (TaskIncludedDocumentDataDto) other;
        return t.c(this.asyncDownloadTerminationInterval, taskIncludedDocumentDataDto.asyncDownloadTerminationInterval) && t.c(this.mainDocumentId, taskIncludedDocumentDataDto.mainDocumentId) && t.c(this.asyncErrorResponse, taskIncludedDocumentDataDto.asyncErrorResponse) && t.c(this.previousMainDocumentId, taskIncludedDocumentDataDto.previousMainDocumentId);
    }

    public int hashCode() {
        Long l15 = this.asyncDownloadTerminationInterval;
        int iHashCode = (((l15 == null ? 0 : l15.hashCode()) * 31) + this.mainDocumentId.hashCode()) * 31;
        AsyncErrorResponseDto asyncErrorResponseDto = this.asyncErrorResponse;
        int iHashCode2 = (iHashCode + (asyncErrorResponseDto == null ? 0 : asyncErrorResponseDto.hashCode())) * 31;
        String str = this.previousMainDocumentId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TaskIncludedDocumentDataDto(asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", mainDocumentId=" + this.mainDocumentId + ", asyncErrorResponse=" + this.asyncErrorResponse + ", previousMainDocumentId=" + this.previousMainDocumentId + ')';
    }
}
