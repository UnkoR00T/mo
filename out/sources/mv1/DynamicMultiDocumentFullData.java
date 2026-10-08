package mv1;

import fr.t;
import hv1.MultiDocumentSchema;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mv1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006 "}, d2 = {"Lmv1/d;", "", "", "parentId", "Lhv1/a;", "multiDocumentSchema", "", "Lmv1/c;", "documentsData", "mainDocumentPhoto", "mainDocumentPesel", "<init>", "(Ljava/lang/String;Lhv1/a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lhv1/a;", "d", "()Lhv1/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentFullData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DynamicDocumentData> documentsData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainDocumentPhoto;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainDocumentPesel;

    public DynamicMultiDocumentFullData(String str, MultiDocumentSchema multiDocumentSchema, List<DynamicDocumentData> list, String str2, String str3) {
        this.parentId = str;
        this.multiDocumentSchema = multiDocumentSchema;
        this.documentsData = list;
        this.mainDocumentPhoto = str2;
        this.mainDocumentPesel = str3;
    }

    public final List<DynamicDocumentData> a() {
        return this.documentsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMainDocumentPesel() {
        return this.mainDocumentPesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMainDocumentPhoto() {
        return this.mainDocumentPhoto;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MultiDocumentSchema getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocumentFullData)) {
            return false;
        }
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) other;
        return t.c(this.parentId, dynamicMultiDocumentFullData.parentId) && t.c(this.multiDocumentSchema, dynamicMultiDocumentFullData.multiDocumentSchema) && t.c(this.documentsData, dynamicMultiDocumentFullData.documentsData) && t.c(this.mainDocumentPhoto, dynamicMultiDocumentFullData.mainDocumentPhoto) && t.c(this.mainDocumentPesel, dynamicMultiDocumentFullData.mainDocumentPesel);
    }

    public int hashCode() {
        String str = this.parentId;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.multiDocumentSchema.hashCode()) * 31) + this.documentsData.hashCode()) * 31) + this.mainDocumentPhoto.hashCode()) * 31) + this.mainDocumentPesel.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocumentFullData(parentId=" + this.parentId + ", multiDocumentSchema=" + this.multiDocumentSchema + ", documentsData=" + this.documentsData + ", mainDocumentPhoto=" + this.mainDocumentPhoto + ", mainDocumentPesel=" + this.mainDocumentPesel + ')';
    }
}
