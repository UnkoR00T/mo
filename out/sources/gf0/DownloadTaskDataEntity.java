package gf0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gf0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\r¨\u0006\u001e"}, d2 = {"Lgf0/g;", "", "", "taskId", "documentDownloadMethod", "", "startTimestamp", "", "taskCompleted", "mainDocumentAuthToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "J", "()J", "d", "Z", "()Z", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadTaskDataEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentDownloadMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean taskCompleted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainDocumentAuthToken;

    public DownloadTaskDataEntity(String str, String str2, long j15, boolean z15, String str3) {
        this.taskId = str;
        this.documentDownloadMethod = str2;
        this.startTimestamp = j15;
        this.taskCompleted = z15;
        this.mainDocumentAuthToken = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentDownloadMethod() {
        return this.documentDownloadMethod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMainDocumentAuthToken() {
        return this.mainDocumentAuthToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTaskCompleted() {
        return this.taskCompleted;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadTaskDataEntity)) {
            return false;
        }
        DownloadTaskDataEntity downloadTaskDataEntity = (DownloadTaskDataEntity) other;
        return t.c(this.taskId, downloadTaskDataEntity.taskId) && t.c(this.documentDownloadMethod, downloadTaskDataEntity.documentDownloadMethod) && this.startTimestamp == downloadTaskDataEntity.startTimestamp && this.taskCompleted == downloadTaskDataEntity.taskCompleted && t.c(this.mainDocumentAuthToken, downloadTaskDataEntity.mainDocumentAuthToken);
    }

    public int hashCode() {
        int iHashCode = ((((((this.taskId.hashCode() * 31) + this.documentDownloadMethod.hashCode()) * 31) + Long.hashCode(this.startTimestamp)) * 31) + Boolean.hashCode(this.taskCompleted)) * 31;
        String str = this.mainDocumentAuthToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DownloadTaskDataEntity(taskId=" + this.taskId + ", documentDownloadMethod=" + this.documentDownloadMethod + ", startTimestamp=" + this.startTimestamp + ", taskCompleted=" + this.taskCompleted + ", mainDocumentAuthToken=" + this.mainDocumentAuthToken + ')';
    }
}
