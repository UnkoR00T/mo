package pt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lpt3/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpt3/o;", "a", "Lpt3/o;", "()Lpt3/o;", "documentToGenerateDto", "b", "Ljava/lang/String;", "taskId", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncUpdateDocumentResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentToGenerateDto")
    private final DocumentToGenerateDto documentToGenerateDto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("taskId")
    private final String taskId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentToGenerateDto getDocumentToGenerateDto() {
        return this.documentToGenerateDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncUpdateDocumentResponse)) {
            return false;
        }
        AsyncUpdateDocumentResponse asyncUpdateDocumentResponse = (AsyncUpdateDocumentResponse) other;
        return fr.t.c(this.documentToGenerateDto, asyncUpdateDocumentResponse.documentToGenerateDto) && fr.t.c(this.taskId, asyncUpdateDocumentResponse.taskId);
    }

    public int hashCode() {
        return (this.documentToGenerateDto.hashCode() * 31) + this.taskId.hashCode();
    }

    public String toString() {
        return "AsyncUpdateDocumentResponse(documentToGenerateDto=" + this.documentToGenerateDto + ", taskId=" + this.taskId + ')';
    }
}
