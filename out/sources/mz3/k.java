package mz3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmz3/k;", "", "Lmz3/k$a;", "Lmz3/k$b;", "b", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends gz.b {

    /* JADX INFO: renamed from: mz3.k$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001d"}, d2 = {"Lmz3/k$a;", "Lgz/b$a;", "Lrq0/b;", "documentToDownload", "Llz3/d;", "documentDownloadMethod", "", "previousDocumentId", "<init>", "(Lrq0/b;Llz3/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "()Lrq0/b;", "b", "Llz3/d;", "r", "()Llz3/d;", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentToDownload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final lz3.d documentDownloadMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousDocumentId;

        public Params(rq0.b bVar, lz3.d dVar, String str) {
            this.documentToDownload = bVar;
            this.documentDownloadMethod = dVar;
            this.previousDocumentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b getDocumentToDownload() {
            return this.documentToDownload;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPreviousDocumentId() {
            return this.previousDocumentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentToDownload, params.documentToDownload) && this.documentDownloadMethod == params.documentDownloadMethod && fr.t.c(this.previousDocumentId, params.previousDocumentId);
        }

        public int hashCode() {
            int iHashCode = ((this.documentToDownload.hashCode() * 31) + this.documentDownloadMethod.hashCode()) * 31;
            String str = this.previousDocumentId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final lz3.d getDocumentDownloadMethod() {
            return this.documentDownloadMethod;
        }

        public String toString() {
            return "Params(documentToDownload=" + this.documentToDownload + ", documentDownloadMethod=" + this.documentDownloadMethod + ", previousDocumentId=" + this.previousDocumentId + ")";
        }
    }

    /* JADX INFO: renamed from: mz3.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lmz3/k$b;", "", "", "taskID", "documentID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taskID;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentID;

        public Result(String str, String str2) {
            this.taskID = str;
            this.documentID = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentID() {
            return this.documentID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTaskID() {
            return this.taskID;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.taskID, result.taskID) && fr.t.c(this.documentID, result.documentID);
        }

        public int hashCode() {
            return (this.taskID.hashCode() * 31) + this.documentID.hashCode();
        }

        public String toString() {
            return "Result(taskID=" + this.taskID + ", documentID=" + this.documentID + ")";
        }
    }
}
