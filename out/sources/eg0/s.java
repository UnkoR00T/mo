package eg0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Leg0/s;", "", "Lgz/b$a$a;", "", "Leg0/s$a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s extends gz.b {

    /* JADX INFO: renamed from: eg0.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001b"}, d2 = {"Leg0/s$a;", "", "", "updateRequired", "Lvf0/d;", "documentType", "", "documentId", "<init>", "(ZLvf0/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getUpdateRequired", "()Z", "b", "Lvf0/d;", "()Lvf0/d;", "c", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefreshDocumentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean updateRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf0.d documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public RefreshDocumentData(boolean z15, vf0.d dVar, String str) {
            this.updateRequired = z15;
            this.documentType = dVar;
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final vf0.d getDocumentType() {
            return this.documentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshDocumentData)) {
                return false;
            }
            RefreshDocumentData refreshDocumentData = (RefreshDocumentData) other;
            return this.updateRequired == refreshDocumentData.updateRequired && this.documentType == refreshDocumentData.documentType && fr.t.c(this.documentId, refreshDocumentData.documentId);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.updateRequired) * 31) + this.documentType.hashCode()) * 31) + this.documentId.hashCode();
        }

        public String toString() {
            return "RefreshDocumentData(updateRequired=" + this.updateRequired + ", documentType=" + this.documentType + ", documentId=" + this.documentId + ")";
        }
    }
}
