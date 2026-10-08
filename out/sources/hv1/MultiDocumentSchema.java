package hv1;

import fr.t;
import gv1.DocumentsGroup;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hv1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhv1/a;", "", "Lgv1/r;", "leftTab", "rightTab", "Lhv1/d;", "verificationSelector", "<init>", "(Lgv1/r;Lgv1/r;Lhv1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgv1/r;", "()Lgv1/r;", "b", "c", "Lhv1/d;", "getVerificationSelector", "()Lhv1/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentsGroup getLeftTab() {
        return this.leftTab;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentsGroup getRightTab() {
        return this.rightTab;
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
