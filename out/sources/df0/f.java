package df0;

import cf0.AsyncDocumentToGenerate;
import fr.t;
import iy.b0;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ldf0/f;", "", "Ldf0/f$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends gz.b {

    /* JADX INFO: renamed from: df0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Ldf0/f$a;", "Lgz/b$a;", "", "taskId", "Lcf0/e;", "documentDownloadMethod", "", "Lcf0/c;", "Lcf0/b;", "documentsToDownload", "Liy/b0;", "mainDocumentAuthToken", "<init>", "(Ljava/lang/String;Lcf0/e;Ljava/util/Map;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcf0/e;", "()Lcf0/e;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String taskId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cf0.e documentDownloadMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<cf0.c, AsyncDocumentToGenerate> documentsToDownload;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 mainDocumentAuthToken;

        public Params(String str, cf0.e eVar, Map<cf0.c, AsyncDocumentToGenerate> map, b0 b0Var) {
            this.taskId = str;
            this.documentDownloadMethod = eVar;
            this.documentsToDownload = map;
            this.mainDocumentAuthToken = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cf0.e getDocumentDownloadMethod() {
            return this.documentDownloadMethod;
        }

        public final Map<cf0.c, AsyncDocumentToGenerate> b() {
            return this.documentsToDownload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getMainDocumentAuthToken() {
            return this.mainDocumentAuthToken;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.taskId, params.taskId) && this.documentDownloadMethod == params.documentDownloadMethod && t.c(this.documentsToDownload, params.documentsToDownload) && t.c(this.mainDocumentAuthToken, params.mainDocumentAuthToken);
        }

        public int hashCode() {
            int iHashCode = ((((this.taskId.hashCode() * 31) + this.documentDownloadMethod.hashCode()) * 31) + this.documentsToDownload.hashCode()) * 31;
            b0 b0Var = this.mainDocumentAuthToken;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        public String toString() {
            return "Params(taskId=" + this.taskId + ", documentDownloadMethod=" + this.documentDownloadMethod + ", documentsToDownload=" + this.documentsToDownload + ", mainDocumentAuthToken=" + this.mainDocumentAuthToken + ")";
        }

        public /* synthetic */ Params(String str, cf0.e eVar, Map map, b0 b0Var, int i15, fr.k kVar) {
            this(str, eVar, map, (i15 & 8) != 0 ? null : b0Var);
        }
    }
}
