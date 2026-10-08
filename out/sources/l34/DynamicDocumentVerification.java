package l34;

import fr.t;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l34.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR+\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll34/b;", "", "", "documentName", "title", "expirationDate", "", "Loq/r;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getTitle", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentVerification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r<String, String>> attributes;

    public DynamicDocumentVerification(String str, String str2, String str3, List<r<String, String>> list) {
        this.documentName = str;
        this.title = str2;
        this.expirationDate = str3;
        this.attributes = list;
    }

    public final List<r<String, String>> a() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentVerification)) {
            return false;
        }
        DynamicDocumentVerification dynamicDocumentVerification = (DynamicDocumentVerification) other;
        return t.c(this.documentName, dynamicDocumentVerification.documentName) && t.c(this.title, dynamicDocumentVerification.title) && t.c(this.expirationDate, dynamicDocumentVerification.expirationDate) && t.c(this.attributes, dynamicDocumentVerification.attributes);
    }

    public int hashCode() {
        int iHashCode = this.documentName.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "DynamicDocumentVerification(documentName=" + this.documentName + ", title=" + this.title + ", expirationDate=" + this.expirationDate + ", attributes=" + this.attributes + ")";
    }
}
