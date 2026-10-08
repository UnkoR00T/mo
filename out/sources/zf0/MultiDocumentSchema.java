package zf0;

import fr.t;
import p071kotlin.Metadata;
import yf0.DocumentsGroup;

/* JADX INFO: renamed from: zf0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lzf0/b;", "", "Lyf0/m;", "leftTab", "rightTab", "Lzf0/e;", "verificationSelector", "<init>", "(Lyf0/m;Lyf0/m;Lzf0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf0/m;", "getLeftTab", "()Lyf0/m;", "b", "getRightTab", "c", "Lzf0/e;", "getVerificationSelector", "()Lzf0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentsGroup leftTab;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentsGroup rightTab;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationSelector verificationSelector;

    public MultiDocumentSchema(DocumentsGroup documentsGroup, DocumentsGroup documentsGroup2, VerificationSelector verificationSelector) {
        this.leftTab = documentsGroup;
        this.rightTab = documentsGroup2;
        this.verificationSelector = verificationSelector;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSchema)) {
            return false;
        }
        MultiDocumentSchema multiDocumentSchema = (MultiDocumentSchema) other;
        return t.c(this.leftTab, multiDocumentSchema.leftTab) && t.c(this.rightTab, multiDocumentSchema.rightTab) && t.c(this.verificationSelector, multiDocumentSchema.verificationSelector);
    }

    public int hashCode() {
        DocumentsGroup documentsGroup = this.leftTab;
        int iHashCode = (documentsGroup == null ? 0 : documentsGroup.hashCode()) * 31;
        DocumentsGroup documentsGroup2 = this.rightTab;
        int iHashCode2 = (iHashCode + (documentsGroup2 == null ? 0 : documentsGroup2.hashCode())) * 31;
        VerificationSelector verificationSelector = this.verificationSelector;
        return iHashCode2 + (verificationSelector != null ? verificationSelector.hashCode() : 0);
    }

    public String toString() {
        return "MultiDocumentSchema(leftTab=" + this.leftTab + ", rightTab=" + this.rightTab + ", verificationSelector=" + this.verificationSelector + ")";
    }
}
