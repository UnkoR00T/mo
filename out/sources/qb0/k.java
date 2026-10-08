package qb0;

import p071kotlin.Metadata;
import sb0.BitmapsByFieldReference;
import sb0.DynamicDocumentBottomSheetData;
import vf0.MainDocumentPhotoData;
import yf0.DocumentSchema;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lqb0/k;", "", "d", "c", "a", "e", "b", "Lqb0/k$a;", "Lqb0/k$c;", "Lqb0/k$d;", "Lqb0/k$e;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    /* JADX INFO: renamed from: qb0.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqb0/k$a;", "Lqb0/k;", "Lqb0/k$b;", "data", "<init>", "(Lqb0/k$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqb0/k$b;", "()Lqb0/k$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeletingDocument implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentData data;

        public DeletingDocument(DocumentData documentData) {
            this.data = documentData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeletingDocument) && fr.t.c(this.data, ((DeletingDocument) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "DeletingDocument(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: qb0.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b%\u0010,R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b\u001d\u00102¨\u00063"}, d2 = {"Lqb0/k$b;", "", "", "documentId", "parentDocumentId", "Lvf0/d;", "documentType", "Lvf0/e;", "documentPhoto", "Lvf0/c;", "documentStatus", "Lyf0/e;", "documentSchema", "scopeName", "Liy/b0;", "rawDocumentData", "Lsb0/a;", "bitmapsByFieldReference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvf0/d;Lvf0/e;Lvf0/c;Lyf0/e;Ljava/lang/String;Liy/b0;Lsb0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "g", "c", "Lvf0/d;", "f", "()Lvf0/d;", "d", "Lvf0/e;", "()Lvf0/e;", "e", "Lvf0/c;", "()Lvf0/c;", "Lyf0/e;", "()Lyf0/e;", "i", "h", "Liy/b0;", "()Liy/b0;", "Lsb0/a;", "()Lsb0/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf0.d documentType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final MainDocumentPhotoData documentPhoto;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf0.c documentStatus;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentSchema documentSchema;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopeName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 rawDocumentData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final BitmapsByFieldReference bitmapsByFieldReference;

        public DocumentData(String str, String str2, vf0.d dVar, MainDocumentPhotoData mainDocumentPhotoData, vf0.c cVar, DocumentSchema documentSchema, String str3, iy.b0 b0Var, BitmapsByFieldReference bitmapsByFieldReference) {
            this.documentId = str;
            this.parentDocumentId = str2;
            this.documentType = dVar;
            this.documentPhoto = mainDocumentPhotoData;
            this.documentStatus = cVar;
            this.documentSchema = documentSchema;
            this.scopeName = str3;
            this.rawDocumentData = b0Var;
            this.bitmapsByFieldReference = bitmapsByFieldReference;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BitmapsByFieldReference getBitmapsByFieldReference() {
            return this.bitmapsByFieldReference;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final MainDocumentPhotoData getDocumentPhoto() {
            return this.documentPhoto;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DocumentSchema getDocumentSchema() {
            return this.documentSchema;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final vf0.c getDocumentStatus() {
            return this.documentStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentData)) {
                return false;
            }
            DocumentData documentData = (DocumentData) other;
            return fr.t.c(this.documentId, documentData.documentId) && fr.t.c(this.parentDocumentId, documentData.parentDocumentId) && this.documentType == documentData.documentType && fr.t.c(this.documentPhoto, documentData.documentPhoto) && this.documentStatus == documentData.documentStatus && fr.t.c(this.documentSchema, documentData.documentSchema) && fr.t.c(this.scopeName, documentData.scopeName) && fr.t.c(this.rawDocumentData, documentData.rawDocumentData) && fr.t.c(this.bitmapsByFieldReference, documentData.bitmapsByFieldReference);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final vf0.d getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final iy.b0 getRawDocumentData() {
            return this.rawDocumentData;
        }

        public int hashCode() {
            int iHashCode = ((((this.documentId.hashCode() * 31) + this.parentDocumentId.hashCode()) * 31) + this.documentType.hashCode()) * 31;
            MainDocumentPhotoData mainDocumentPhotoData = this.documentPhoto;
            return ((((((((((iHashCode + (mainDocumentPhotoData == null ? 0 : mainDocumentPhotoData.hashCode())) * 31) + this.documentStatus.hashCode()) * 31) + this.documentSchema.hashCode()) * 31) + this.scopeName.hashCode()) * 31) + this.rawDocumentData.hashCode()) * 31) + this.bitmapsByFieldReference.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getScopeName() {
            return this.scopeName;
        }

        public String toString() {
            return "DocumentData(documentId=" + this.documentId + ", parentDocumentId=" + this.parentDocumentId + ", documentType=" + this.documentType + ", documentPhoto=" + this.documentPhoto + ", documentStatus=" + this.documentStatus + ", documentSchema=" + this.documentSchema + ", scopeName=" + this.scopeName + ", rawDocumentData=" + this.rawDocumentData + ", bitmapsByFieldReference=" + this.bitmapsByFieldReference + ')';
        }
    }

    /* JADX INFO: renamed from: qb0.k$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lqb0/k$d;", "Lqb0/k;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingDocument implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public LoadingDocument(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingDocument) && fr.t.c(this.documentId, ((LoadingDocument) other).documentId);
        }

        public int hashCode() {
            String str = this.documentId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LoadingDocument(documentId=" + this.documentId + ')';
        }
    }

    /* JADX INFO: renamed from: qb0.k$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqb0/k$e;", "Lqb0/k;", "Lqb0/k$b;", "data", "<init>", "(Lqb0/k$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqb0/k$b;", "()Lqb0/k$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdatingDocument implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentData data;

        public UpdatingDocument(DocumentData documentData) {
            this.data = documentData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdatingDocument) && fr.t.c(this.data, ((UpdatingDocument) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UpdatingDocument(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: qb0.k$c, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lqb0/k$c;", "Lqb0/k;", "Lcb4/i;", "dialogVMSAdapter", "Lg30/v;", "bottomSheetValue", "Lsb0/b;", "bottomSheetContentData", "Lqb0/k$b;", "data", "<init>", "(Lcb4/i;Lg30/v;Lsb0/b;Lqb0/k$b;)V", "a", "(Lcb4/i;Lg30/v;Lsb0/b;Lqb0/k$b;)Lqb0/k$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcb4/i;", "f", "()Lcb4/i;", "b", "Lg30/v;", "d", "()Lg30/v;", "c", "Lsb0/b;", "()Lsb0/b;", "Lqb0/k$b;", "e", "()Lqb0/k$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentDisplayed implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentData data;

        public DocumentDisplayed(cb4.i iVar, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, DocumentData documentData) {
            this.dialogVMSAdapter = iVar;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = dynamicDocumentBottomSheetData;
            this.data = documentData;
        }

        public static /* synthetic */ DocumentDisplayed b(DocumentDisplayed documentDisplayed, cb4.i iVar, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, DocumentData documentData, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                iVar = documentDisplayed.dialogVMSAdapter;
            }
            if ((i15 & 2) != 0) {
                vVar = documentDisplayed.bottomSheetValue;
            }
            if ((i15 & 4) != 0) {
                dynamicDocumentBottomSheetData = documentDisplayed.bottomSheetContentData;
            }
            if ((i15 & 8) != 0) {
                documentData = documentDisplayed.data;
            }
            return documentDisplayed.a(iVar, vVar, dynamicDocumentBottomSheetData, documentData);
        }

        public final DocumentDisplayed a(cb4.i dialogVMSAdapter, g30.v bottomSheetValue, DynamicDocumentBottomSheetData bottomSheetContentData, DocumentData data) {
            return new DocumentDisplayed(dialogVMSAdapter, bottomSheetValue, bottomSheetContentData, data);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DynamicDocumentBottomSheetData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DocumentData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentDisplayed)) {
                return false;
            }
            DocumentDisplayed documentDisplayed = (DocumentDisplayed) other;
            return fr.t.c(this.dialogVMSAdapter, documentDisplayed.dialogVMSAdapter) && this.bottomSheetValue == documentDisplayed.bottomSheetValue && fr.t.c(this.bottomSheetContentData, documentDisplayed.bottomSheetContentData) && fr.t.c(this.data, documentDisplayed.data);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public int hashCode() {
            cb4.i iVar = this.dialogVMSAdapter;
            int iHashCode = (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
            DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
            return ((iHashCode + (dynamicDocumentBottomSheetData != null ? dynamicDocumentBottomSheetData.hashCode() : 0)) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "DocumentDisplayed(dialogVMSAdapter=" + this.dialogVMSAdapter + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", data=" + this.data + ')';
        }

        public /* synthetic */ DocumentDisplayed(cb4.i iVar, g30.v vVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, DocumentData documentData, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : iVar, (i15 & 2) != 0 ? g30.v.HIDDEN : vVar, (i15 & 4) != 0 ? null : dynamicDocumentBottomSheetData, documentData);
        }
    }
}
