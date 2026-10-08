package kf0;

import cf0.AsyncErrorResponse;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kf0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b \u0010\u000e¨\u0006\""}, d2 = {"Lkf0/b;", "", "Lkf0/b$a;", "status", "Lkf0/e;", "documentToDownload", "Lcf0/d;", "downloadingErrorMessage", "", "documentSchema", "multiDocumentSchema", "<init>", "(Lkf0/b$a;Lkf0/e;Lcf0/d;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkf0/b$a;", "e", "()Lkf0/b$a;", "b", "Lkf0/e;", "()Lkf0/e;", "c", "Lcf0/d;", "()Lcf0/d;", "d", "Ljava/lang/String;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncDocumentGenerationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentToDownload documentToDownload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AsyncErrorResponse downloadingErrorMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentSchema;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String multiDocumentSchema;

    /* JADX INFO: renamed from: kf0.b$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkf0/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        TO_DOWNLOAD("TO_DOWNLOAD"),
        ALREADY_DOWNLOADED("ALREADY_DOWNLOADED"),
        CREATING_ERROR("CREATING_ERROR"),
        ALL_DOWNLOADED("ALL_DOWNLOADED"),
        MULTI_DOCUMENT_GENERATION_FINISHED("MULTI_DOCUMENT_GENERATION_FINISHED"),
        TERMINAL_GLOBAL_ERROR("TERMINAL_GLOBAL_ERROR"),
        RETRY_GLOBAL_ERROR("RETRY_GLOBAL_ERROR"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ wq.a f110439l = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public AsyncDocumentGenerationResult(a aVar, DocumentToDownload documentToDownload, AsyncErrorResponse asyncErrorResponse, String str, String str2) {
        this.status = aVar;
        this.documentToDownload = documentToDownload;
        this.downloadingErrorMessage = asyncErrorResponse;
        this.documentSchema = str;
        this.multiDocumentSchema = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentSchema() {
        return this.documentSchema;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentToDownload getDocumentToDownload() {
        return this.documentToDownload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AsyncErrorResponse getDownloadingErrorMessage() {
        return this.downloadingErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDocumentGenerationResult)) {
            return false;
        }
        AsyncDocumentGenerationResult asyncDocumentGenerationResult = (AsyncDocumentGenerationResult) other;
        return this.status == asyncDocumentGenerationResult.status && t.c(this.documentToDownload, asyncDocumentGenerationResult.documentToDownload) && t.c(this.downloadingErrorMessage, asyncDocumentGenerationResult.downloadingErrorMessage) && t.c(this.documentSchema, asyncDocumentGenerationResult.documentSchema) && t.c(this.multiDocumentSchema, asyncDocumentGenerationResult.multiDocumentSchema);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        DocumentToDownload documentToDownload = this.documentToDownload;
        int iHashCode2 = (iHashCode + (documentToDownload == null ? 0 : documentToDownload.hashCode())) * 31;
        AsyncErrorResponse asyncErrorResponse = this.downloadingErrorMessage;
        int iHashCode3 = (iHashCode2 + (asyncErrorResponse == null ? 0 : asyncErrorResponse.hashCode())) * 31;
        String str = this.documentSchema;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.multiDocumentSchema;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AsyncDocumentGenerationResult(status=" + this.status + ", documentToDownload=" + this.documentToDownload + ", downloadingErrorMessage=" + this.downloadingErrorMessage + ", documentSchema=" + this.documentSchema + ", multiDocumentSchema=" + this.multiDocumentSchema + ')';
    }
}
