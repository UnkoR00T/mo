package cf0;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cf0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b\u001e\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b-\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b\"\u0010/¨\u00060"}, d2 = {"Lcf0/b;", "", "", "documentId", "Lcf0/c;", "documentType", "", "asyncDownloadTerminationInterval", "", "multiDocument", "Lcf0/a;", "status", "Lcf0/d;", "asyncErrorResponse", "previousDocumentId", "Lcf0/e;", "documentDownloadMethod", "<init>", "(Ljava/lang/String;Lcf0/c;JZLcf0/a;Lcf0/d;Ljava/lang/String;Lcf0/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcf0/c;", "e", "()Lcf0/c;", "c", "J", "()J", "Z", "f", "()Z", "Lcf0/a;", "h", "()Lcf0/a;", "Lcf0/d;", "()Lcf0/d;", "g", "Lcf0/e;", "()Lcf0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentToGenerate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long asyncDownloadTerminationInterval;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean multiDocument;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a status;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AsyncErrorResponse asyncErrorResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String previousDocumentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final e documentDownloadMethod;

    public AsyncDocumentToGenerate(String str, c cVar, long j15, boolean z15, a aVar, AsyncErrorResponse asyncErrorResponse, String str2, e eVar) {
        this.documentId = str;
        this.documentType = cVar;
        this.asyncDownloadTerminationInterval = j15;
        this.multiDocument = z15;
        this.status = aVar;
        this.asyncErrorResponse = asyncErrorResponse;
        this.previousDocumentId = str2;
        this.documentDownloadMethod = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAsyncDownloadTerminationInterval() {
        return this.asyncDownloadTerminationInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AsyncErrorResponse getAsyncErrorResponse() {
        return this.asyncErrorResponse;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getDocumentDownloadMethod() {
        return this.documentDownloadMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDocumentType() {
        return this.documentType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentToGenerate)) {
            return false;
        }
        AsyncDocumentToGenerate asyncDocumentToGenerate = (AsyncDocumentToGenerate) other;
        return t.c(this.documentId, asyncDocumentToGenerate.documentId) && this.documentType == asyncDocumentToGenerate.documentType && this.asyncDownloadTerminationInterval == asyncDocumentToGenerate.asyncDownloadTerminationInterval && this.multiDocument == asyncDocumentToGenerate.multiDocument && this.status == asyncDocumentToGenerate.status && t.c(this.asyncErrorResponse, asyncDocumentToGenerate.asyncErrorResponse) && t.c(this.previousDocumentId, asyncDocumentToGenerate.previousDocumentId) && this.documentDownloadMethod == asyncDocumentToGenerate.documentDownloadMethod;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getMultiDocument() {
        return this.multiDocument;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPreviousDocumentId() {
        return this.previousDocumentId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.documentId.hashCode() * 31) + this.documentType.hashCode()) * 31) + Long.hashCode(this.asyncDownloadTerminationInterval)) * 31) + Boolean.hashCode(this.multiDocument)) * 31) + this.status.hashCode()) * 31;
        AsyncErrorResponse asyncErrorResponse = this.asyncErrorResponse;
        int iHashCode2 = (iHashCode + (asyncErrorResponse == null ? 0 : asyncErrorResponse.hashCode())) * 31;
        String str = this.previousDocumentId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.documentDownloadMethod;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "AsyncDocumentToGenerate(documentId=" + this.documentId + ", documentType=" + this.documentType + ", asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", multiDocument=" + this.multiDocument + ", status=" + this.status + ", asyncErrorResponse=" + this.asyncErrorResponse + ", previousDocumentId=" + this.previousDocumentId + ", documentDownloadMethod=" + this.documentDownloadMethod + ")";
    }

    public /* synthetic */ AsyncDocumentToGenerate(String str, c cVar, long j15, boolean z15, a aVar, AsyncErrorResponse asyncErrorResponse, String str2, e eVar, int i15, k kVar) {
        this(str, cVar, j15, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? a.NOT_READY : aVar, (i15 & 32) != 0 ? null : asyncErrorResponse, (i15 & 64) != 0 ? null : str2, (i15 & 128) != 0 ? null : eVar);
    }
}
