package df0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldf0/n;", "Lgz/b;", "Ldf0/n$a;", "Ldx/i;", "Ldx/b;", "Ldf0/n$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends gz.b<Params, dx.i<? extends dx.b, ? extends Response>> {

    /* JADX INFO: renamed from: df0.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Ldf0/n$a;", "Lgz/b$a;", "Lcf0/c;", "documentType", "", "updatedParentDocumentId", "<init>", "(Lcf0/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcf0/c;", "()Lcf0/c;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cf0.c documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String updatedParentDocumentId;

        public Params(cf0.c cVar, String str) {
            this.documentType = cVar;
            this.updatedParentDocumentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cf0.c getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUpdatedParentDocumentId() {
            return this.updatedParentDocumentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.documentType == params.documentType && t.c(this.updatedParentDocumentId, params.updatedParentDocumentId);
        }

        public int hashCode() {
            return (this.documentType.hashCode() * 31) + this.updatedParentDocumentId.hashCode();
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", updatedParentDocumentId=" + this.updatedParentDocumentId + ")";
        }
    }

    /* JADX INFO: renamed from: df0.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Ldf0/n$b;", "", "", "documentToGenerateId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Response {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentToGenerateId;

        public Response(String str) {
            this.documentToGenerateId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentToGenerateId() {
            return this.documentToGenerateId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && t.c(this.documentToGenerateId, ((Response) other).documentToGenerateId);
        }

        public int hashCode() {
            return this.documentToGenerateId.hashCode();
        }

        public String toString() {
            return "Response(documentToGenerateId=" + this.documentToGenerateId + ")";
        }
    }
}
