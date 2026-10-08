package k24;

import fr.t;
import g24.DocumentSchema;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lk24/n;", "", "Lk24/n$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends gz.b {

    /* JADX INFO: renamed from: k24.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*¨\u0006+"}, d2 = {"Lk24/n$a;", "Lgz/b$a;", "", "documentTypeFirstEvent", "", "documentId", "parentDocumentId", "Lfz/b$c;", "documentExpirationDate", "dataScope", "Lf24/i;", "documentType", "Lg24/h;", "documentSchema", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lfz/b$c;Ljava/lang/String;Lf24/i;Lg24/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "Ljava/lang/String;", "c", "i", "d", "Lfz/b$c;", "()Lfz/b$c;", "e", "f", "Lf24/i;", "()Lf24/i;", "g", "Lg24/h;", "()Lg24/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean documentTypeFirstEvent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate documentExpirationDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dataScope;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final f24.i documentType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentSchema documentSchema;

        public Params(boolean z15, String str, String str2, fz.b.LocalDate localDate, String str3, f24.i iVar, DocumentSchema documentSchema) {
            this.documentTypeFirstEvent = z15;
            this.documentId = str;
            this.parentDocumentId = str2;
            this.documentExpirationDate = localDate;
            this.dataScope = str3;
            this.documentType = iVar;
            this.documentSchema = documentSchema;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDataScope() {
            return this.dataScope;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.b.LocalDate getDocumentExpirationDate() {
            return this.documentExpirationDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DocumentSchema getDocumentSchema() {
            return this.documentSchema;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.documentTypeFirstEvent == params.documentTypeFirstEvent && t.c(this.documentId, params.documentId) && t.c(this.parentDocumentId, params.parentDocumentId) && t.c(this.documentExpirationDate, params.documentExpirationDate) && t.c(this.dataScope, params.dataScope) && this.documentType == params.documentType && t.c(this.documentSchema, params.documentSchema);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final f24.i getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getDocumentTypeFirstEvent() {
            return this.documentTypeFirstEvent;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.documentTypeFirstEvent) * 31) + this.documentId.hashCode()) * 31;
            String str = this.parentDocumentId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            fz.b.LocalDate localDate = this.documentExpirationDate;
            int iHashCode3 = (((((iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.dataScope.hashCode()) * 31) + this.documentType.hashCode()) * 31;
            DocumentSchema documentSchema = this.documentSchema;
            return iHashCode3 + (documentSchema != null ? documentSchema.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        public String toString() {
            return "Params(documentTypeFirstEvent=" + this.documentTypeFirstEvent + ", documentId=" + this.documentId + ", parentDocumentId=" + this.parentDocumentId + ", documentExpirationDate=" + this.documentExpirationDate + ", dataScope=" + this.dataScope + ", documentType=" + this.documentType + ", documentSchema=" + this.documentSchema + ")";
        }
    }
}
