package lz3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lz3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Llz3/g;", "", "", "asyncDownloadTerminationInterval", "", "documentId", "Lrq0/b;", "documentType", "Llz3/g$a;", "generationStatus", "subType", "", "multiDocument", "<init>", "(JLjava/lang/String;Lrq0/b;Llz3/g$a;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getAsyncDownloadTerminationInterval", "()J", "b", "Ljava/lang/String;", "c", "Lrq0/b;", "()Lrq0/b;", "d", "Llz3/g$a;", "getGenerationStatus", "()Llz3/g$a;", "e", "getSubType", "f", "Ljava/lang/Boolean;", "getMultiDocument", "()Ljava/lang/Boolean;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentToGenerate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long asyncDownloadTerminationInterval;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a generationStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean multiDocument;

    /* JADX INFO: renamed from: lz3.g$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Llz3/g$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        CREATED("CREATED"),
        CREATING_ERROR("CREATING_ERROR"),
        SCOPES_CREATED("SCOPES_CREATED"),
        SCOPES_CREATING_ERROR("SCOPES_CREATING_ERROR"),
        SIGNED("SIGNED"),
        SIGNING_ERROR("SIGNING_ERROR"),
        READY_FOR_DOWNLOAD("READY_FOR_DOWNLOAD"),
        ENCRYPTING_ERROR("ENCRYPTING_ERROR"),
        DOWNLOADED("DOWNLOADED"),
        DOWNLOADING_ERROR("DOWNLOADING_ERROR"),
        MULTI_DOCUMENT_GENERATION_FINISHED("MULTI_DOCUMENT_GENERATION_FINISHED"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ wq.a f121749q = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public DocumentToGenerate(long j15, String str, rq0.b bVar, a aVar, String str2, Boolean bool) {
        this.asyncDownloadTerminationInterval = j15;
        this.documentId = str;
        this.documentType = bVar;
        this.generationStatus = aVar;
        this.subType = str2;
        this.multiDocument = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentToGenerate)) {
            return false;
        }
        DocumentToGenerate documentToGenerate = (DocumentToGenerate) other;
        return this.asyncDownloadTerminationInterval == documentToGenerate.asyncDownloadTerminationInterval && t.c(this.documentId, documentToGenerate.documentId) && t.c(this.documentType, documentToGenerate.documentType) && this.generationStatus == documentToGenerate.generationStatus && t.c(this.subType, documentToGenerate.subType) && t.c(this.multiDocument, documentToGenerate.multiDocument);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.asyncDownloadTerminationInterval) * 31) + this.documentId.hashCode()) * 31;
        rq0.b bVar = this.documentType;
        int iHashCode2 = (((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.generationStatus.hashCode()) * 31;
        String str = this.subType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.multiDocument;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DocumentToGenerate(asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", documentId=" + this.documentId + ", documentType=" + this.documentType + ", generationStatus=" + this.generationStatus + ", subType=" + this.subType + ", multiDocument=" + this.multiDocument + ")";
    }
}
