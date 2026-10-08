package ag0;

import fr.k;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;
import vf0.d;
import zf0.MultiDocumentSchema;

/* JADX INFO: renamed from: ag0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lag0/b;", "", "", "documentId", "Lvf0/d;", "documentType", "Lvf0/e;", "documentPhoto", "", "Lag0/a;", "childDocuments", "Lzf0/b;", "multiDocumentSchema", "<init>", "(Ljava/lang/String;Lvf0/d;Lvf0/e;Ljava/util/List;Lzf0/b;)V", "a", "(Ljava/lang/String;Lvf0/d;Lvf0/e;Ljava/util/List;Lzf0/b;)Lag0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lvf0/d;", "f", "()Lvf0/d;", "c", "Lvf0/e;", "e", "()Lvf0/e;", "Ljava/util/List;", "()Ljava/util/List;", "Lzf0/b;", "getMultiDocumentSchema", "()Lzf0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicParentDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MainDocumentPhotoData documentPhoto;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DynamicDocument> childDocuments;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    public DynamicParentDocument(String str, d dVar, MainDocumentPhotoData mainDocumentPhotoData, List<DynamicDocument> list, MultiDocumentSchema multiDocumentSchema) {
        this.documentId = str;
        this.documentType = dVar;
        this.documentPhoto = mainDocumentPhotoData;
        this.childDocuments = list;
        this.multiDocumentSchema = multiDocumentSchema;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicParentDocument b(DynamicParentDocument dynamicParentDocument, String str, d dVar, MainDocumentPhotoData mainDocumentPhotoData, List list, MultiDocumentSchema multiDocumentSchema, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dynamicParentDocument.documentId;
        }
        if ((i15 & 2) != 0) {
            dVar = dynamicParentDocument.documentType;
        }
        if ((i15 & 4) != 0) {
            mainDocumentPhotoData = dynamicParentDocument.documentPhoto;
        }
        if ((i15 & 8) != 0) {
            list = dynamicParentDocument.childDocuments;
        }
        if ((i15 & 16) != 0) {
            multiDocumentSchema = dynamicParentDocument.multiDocumentSchema;
        }
        MultiDocumentSchema multiDocumentSchema2 = multiDocumentSchema;
        MainDocumentPhotoData mainDocumentPhotoData2 = mainDocumentPhotoData;
        return dynamicParentDocument.a(str, dVar, mainDocumentPhotoData2, list, multiDocumentSchema2);
    }

    public final DynamicParentDocument a(String documentId, d documentType, MainDocumentPhotoData documentPhoto, List<DynamicDocument> childDocuments, MultiDocumentSchema multiDocumentSchema) {
        return new DynamicParentDocument(documentId, documentType, documentPhoto, childDocuments, multiDocumentSchema);
    }

    public final List<DynamicDocument> c() {
        return this.childDocuments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final MainDocumentPhotoData getDocumentPhoto() {
        return this.documentPhoto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicParentDocument)) {
            return false;
        }
        DynamicParentDocument dynamicParentDocument = (DynamicParentDocument) other;
        return t.c(this.documentId, dynamicParentDocument.documentId) && this.documentType == dynamicParentDocument.documentType && t.c(this.documentPhoto, dynamicParentDocument.documentPhoto) && t.c(this.childDocuments, dynamicParentDocument.childDocuments) && t.c(this.multiDocumentSchema, dynamicParentDocument.multiDocumentSchema);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getDocumentType() {
        return this.documentType;
    }

    public int hashCode() {
        int iHashCode = ((this.documentId.hashCode() * 31) + this.documentType.hashCode()) * 31;
        MainDocumentPhotoData mainDocumentPhotoData = this.documentPhoto;
        return ((((iHashCode + (mainDocumentPhotoData == null ? 0 : mainDocumentPhotoData.hashCode())) * 31) + this.childDocuments.hashCode()) * 31) + this.multiDocumentSchema.hashCode();
    }

    public String toString() {
        return "DynamicParentDocument(documentId=" + this.documentId + ", documentType=" + this.documentType + ", documentPhoto=" + this.documentPhoto + ", childDocuments=" + this.childDocuments + ", multiDocumentSchema=" + this.multiDocumentSchema + ")";
    }

    public /* synthetic */ DynamicParentDocument(String str, d dVar, MainDocumentPhotoData mainDocumentPhotoData, List list, MultiDocumentSchema multiDocumentSchema, int i15, k kVar) {
        this(str, dVar, (i15 & 4) != 0 ? null : mainDocumentPhotoData, list, multiDocumentSchema);
    }
}
