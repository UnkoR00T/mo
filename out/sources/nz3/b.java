package nz3;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0014\u0010\u001f¨\u0006 "}, d2 = {"Lnz3/b;", "", "", "taskId", "documentDownloadMethod", "", "startTimestamp", "", "taskCompleted", "", "mainDocumentAuthToken", "", "Lnz3/c;", "includedDocuments", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZ[CLjava/util/Map;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "J", "d", "()J", "Z", "e", "()Z", "[C", "()[C", "Ljava/util/Map;", "()Ljava/util/Map;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @vl.c("taskId")
    private final String taskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @vl.c("documentDownloadMethod")
    private final String documentDownloadMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @vl.c("startTimestamp")
    private final long startTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @vl.c("taskCompleted")
    private final boolean taskCompleted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @vl.c("mainDocumentAuthToken")
    private final char[] mainDocumentAuthToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @vl.c("includedDocuments")
    private final Map<String, TaskIncludedDocumentDataDto> includedDocuments;

    public b(String str, String str2, long j15, boolean z15, char[] cArr, Map<String, TaskIncludedDocumentDataDto> map) {
        this.taskId = str;
        this.documentDownloadMethod = str2;
        this.startTimestamp = j15;
        this.taskCompleted = z15;
        this.mainDocumentAuthToken = cArr;
        this.includedDocuments = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentDownloadMethod() {
        return this.documentDownloadMethod;
    }

    public final Map<String, TaskIncludedDocumentDataDto> b() {
        return this.includedDocuments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final char[] getMainDocumentAuthToken() {
        return this.mainDocumentAuthToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTaskCompleted() {
        return this.taskCompleted;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }
}
