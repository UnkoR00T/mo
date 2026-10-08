package lz3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lz3.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Llz3/k;", "", "", "mainDocumentId", "", "asyncDownloadTerminationInterval", "previousMainDocumentId", "Llz3/b;", "asyncErrorResponse", "<init>", "(Ljava/lang/String;JLjava/lang/String;Llz3/b;)V", "a", "(Ljava/lang/String;JLjava/lang/String;Llz3/b;)Llz3/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "J", "c", "()J", "f", "d", "Llz3/b;", "()Llz3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaskIncludedDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainDocumentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long asyncDownloadTerminationInterval;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String previousMainDocumentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AsyncErrorResponse asyncErrorResponse;

    public TaskIncludedDocumentData(String str, long j15, String str2, AsyncErrorResponse asyncErrorResponse) {
        this.mainDocumentId = str;
        this.asyncDownloadTerminationInterval = j15;
        this.previousMainDocumentId = str2;
        this.asyncErrorResponse = asyncErrorResponse;
    }

    public static /* synthetic */ TaskIncludedDocumentData b(TaskIncludedDocumentData taskIncludedDocumentData, String str, long j15, String str2, AsyncErrorResponse asyncErrorResponse, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = taskIncludedDocumentData.mainDocumentId;
        }
        if ((i15 & 2) != 0) {
            j15 = taskIncludedDocumentData.asyncDownloadTerminationInterval;
        }
        if ((i15 & 4) != 0) {
            str2 = taskIncludedDocumentData.previousMainDocumentId;
        }
        if ((i15 & 8) != 0) {
            asyncErrorResponse = taskIncludedDocumentData.asyncErrorResponse;
        }
        return taskIncludedDocumentData.a(str, j15, str2, asyncErrorResponse);
    }

    public final TaskIncludedDocumentData a(String mainDocumentId, long asyncDownloadTerminationInterval, String previousMainDocumentId, AsyncErrorResponse asyncErrorResponse) {
        return new TaskIncludedDocumentData(mainDocumentId, asyncDownloadTerminationInterval, previousMainDocumentId, asyncErrorResponse);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAsyncDownloadTerminationInterval() {
        return this.asyncDownloadTerminationInterval;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AsyncErrorResponse getAsyncErrorResponse() {
        return this.asyncErrorResponse;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMainDocumentId() {
        return this.mainDocumentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskIncludedDocumentData)) {
            return false;
        }
        TaskIncludedDocumentData taskIncludedDocumentData = (TaskIncludedDocumentData) other;
        return t.c(this.mainDocumentId, taskIncludedDocumentData.mainDocumentId) && this.asyncDownloadTerminationInterval == taskIncludedDocumentData.asyncDownloadTerminationInterval && t.c(this.previousMainDocumentId, taskIncludedDocumentData.previousMainDocumentId) && t.c(this.asyncErrorResponse, taskIncludedDocumentData.asyncErrorResponse);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPreviousMainDocumentId() {
        return this.previousMainDocumentId;
    }

    public int hashCode() {
        int iHashCode = ((this.mainDocumentId.hashCode() * 31) + Long.hashCode(this.asyncDownloadTerminationInterval)) * 31;
        String str = this.previousMainDocumentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AsyncErrorResponse asyncErrorResponse = this.asyncErrorResponse;
        return iHashCode2 + (asyncErrorResponse != null ? asyncErrorResponse.hashCode() : 0);
    }

    public String toString() {
        return "TaskIncludedDocumentData(mainDocumentId=" + this.mainDocumentId + ", asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", previousMainDocumentId=" + this.previousMainDocumentId + ", asyncErrorResponse=" + this.asyncErrorResponse + ")";
    }

    public /* synthetic */ TaskIncludedDocumentData(String str, long j15, String str2, AsyncErrorResponse asyncErrorResponse, int i15, fr.k kVar) {
        this(str, j15, str2, (i15 & 8) != 0 ? null : asyncErrorResponse);
    }
}
