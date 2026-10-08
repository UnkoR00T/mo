package eg0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Leg0/t;", "", "Leg0/t$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t extends gz.b {

    /* JADX INFO: renamed from: eg0.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u001e"}, d2 = {"Leg0/t$a;", "Lgz/b$a;", "", "documentId", "parentDocumentId", "Lvf0/d;", "documentType", "dataScope", "dataSchema", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvf0/d;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "f", "Lvf0/d;", "d", "()Lvf0/d;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf0.d documentType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dataScope;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dataSchema;

        public Params(String str, String str2, vf0.d dVar, String str3, String str4) {
            this.documentId = str;
            this.parentDocumentId = str2;
            this.documentType = dVar;
            this.dataScope = str3;
            this.dataSchema = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDataSchema() {
            return this.dataSchema;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDataScope() {
            return this.dataScope;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final vf0.d getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentId, params.documentId) && fr.t.c(this.parentDocumentId, params.parentDocumentId) && this.documentType == params.documentType && fr.t.c(this.dataScope, params.dataScope) && fr.t.c(this.dataSchema, params.dataSchema);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        public int hashCode() {
            int iHashCode = this.documentId.hashCode() * 31;
            String str = this.parentDocumentId;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.documentType.hashCode()) * 31) + this.dataScope.hashCode()) * 31;
            String str2 = this.dataSchema;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Params(documentId=" + this.documentId + ", parentDocumentId=" + this.parentDocumentId + ", documentType=" + this.documentType + ", dataScope=" + this.dataScope + ", dataSchema=" + this.dataSchema + ")";
        }
    }
}
