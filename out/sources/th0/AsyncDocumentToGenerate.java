package th0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lth0/d;", "", "", "asyncDownloadTerminationInterval", "", "documentId", "taskId", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentToGenerate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long asyncDownloadTerminationInterval;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taskId;

    public AsyncDocumentToGenerate(long j15, String str, String str2) {
        this.asyncDownloadTerminationInterval = j15;
        this.documentId = str;
        this.taskId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAsyncDownloadTerminationInterval() {
        return this.asyncDownloadTerminationInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentToGenerate)) {
            return false;
        }
        AsyncDocumentToGenerate asyncDocumentToGenerate = (AsyncDocumentToGenerate) other;
        return this.asyncDownloadTerminationInterval == asyncDocumentToGenerate.asyncDownloadTerminationInterval && fr.t.c(this.documentId, asyncDocumentToGenerate.documentId) && fr.t.c(this.taskId, asyncDocumentToGenerate.taskId);
    }

    public int hashCode() {
        return (((Long.hashCode(this.asyncDownloadTerminationInterval) * 31) + this.documentId.hashCode()) * 31) + this.taskId.hashCode();
    }

    public String toString() {
        return "AsyncDocumentToGenerate(asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", documentId=" + this.documentId + ", taskId=" + this.taskId + ")";
    }
}
