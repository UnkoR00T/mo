package lz3;

import fr.t;
import iy.b0;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lz3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b%\u0010-¨\u0006."}, d2 = {"Llz3/i;", "", "", "taskId", "", "startTimestamp", "Llz3/d;", "documentDownloadMethod", "", "taskCompleted", "Liy/b0;", "mainDocumentAuthToken", "", "Lrq0/b;", "Llz3/k;", "includedDocuments", "<init>", "(Ljava/lang/String;JLlz3/d;ZLiy/b0;Ljava/util/Map;)V", "a", "(Ljava/lang/String;JLlz3/d;ZLiy/b0;Ljava/util/Map;)Llz3/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "J", "f", "()J", "c", "Llz3/d;", "()Llz3/d;", "d", "Z", "g", "()Z", "e", "Liy/b0;", "()Liy/b0;", "Ljava/util/Map;", "()Ljava/util/Map;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadTaskData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taskId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d documentDownloadMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean taskCompleted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 mainDocumentAuthToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<rq0.b, TaskIncludedDocumentData> includedDocuments;

    public DownloadTaskData(String str, long j15, d dVar, boolean z15, b0 b0Var, Map<rq0.b, TaskIncludedDocumentData> map) {
        this.taskId = str;
        this.startTimestamp = j15;
        this.documentDownloadMethod = dVar;
        this.taskCompleted = z15;
        this.mainDocumentAuthToken = b0Var;
        this.includedDocuments = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadTaskData b(DownloadTaskData downloadTaskData, String str, long j15, d dVar, boolean z15, b0 b0Var, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = downloadTaskData.taskId;
        }
        if ((i15 & 2) != 0) {
            j15 = downloadTaskData.startTimestamp;
        }
        if ((i15 & 4) != 0) {
            dVar = downloadTaskData.documentDownloadMethod;
        }
        if ((i15 & 8) != 0) {
            z15 = downloadTaskData.taskCompleted;
        }
        if ((i15 & 16) != 0) {
            b0Var = downloadTaskData.mainDocumentAuthToken;
        }
        if ((i15 & 32) != 0) {
            map = downloadTaskData.includedDocuments;
        }
        return downloadTaskData.a(str, j15, dVar, z15, b0Var, map);
    }

    public final DownloadTaskData a(String taskId, long startTimestamp, d documentDownloadMethod, boolean taskCompleted, b0 mainDocumentAuthToken, Map<rq0.b, TaskIncludedDocumentData> includedDocuments) {
        return new DownloadTaskData(taskId, startTimestamp, documentDownloadMethod, taskCompleted, mainDocumentAuthToken, includedDocuments);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getDocumentDownloadMethod() {
        return this.documentDownloadMethod;
    }

    public final Map<rq0.b, TaskIncludedDocumentData> d() {
        return this.includedDocuments;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getMainDocumentAuthToken() {
        return this.mainDocumentAuthToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadTaskData)) {
            return false;
        }
        DownloadTaskData downloadTaskData = (DownloadTaskData) other;
        return t.c(this.taskId, downloadTaskData.taskId) && this.startTimestamp == downloadTaskData.startTimestamp && this.documentDownloadMethod == downloadTaskData.documentDownloadMethod && this.taskCompleted == downloadTaskData.taskCompleted && t.c(this.mainDocumentAuthToken, downloadTaskData.mainDocumentAuthToken) && t.c(this.includedDocuments, downloadTaskData.includedDocuments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getTaskCompleted() {
        return this.taskCompleted;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.taskId.hashCode() * 31) + Long.hashCode(this.startTimestamp)) * 31) + this.documentDownloadMethod.hashCode()) * 31) + Boolean.hashCode(this.taskCompleted)) * 31;
        b0 b0Var = this.mainDocumentAuthToken;
        return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.includedDocuments.hashCode();
    }

    public String toString() {
        return "DownloadTaskData(taskId=" + this.taskId + ", startTimestamp=" + this.startTimestamp + ", documentDownloadMethod=" + this.documentDownloadMethod + ", taskCompleted=" + this.taskCompleted + ", mainDocumentAuthToken=" + this.mainDocumentAuthToken + ", includedDocuments=" + this.includedDocuments + ")";
    }

    public /* synthetic */ DownloadTaskData(String str, long j15, d dVar, boolean z15, b0 b0Var, Map map, int i15, fr.k kVar) {
        this(str, j15, dVar, (i15 & 8) != 0 ? false : z15, b0Var, map);
    }
}
