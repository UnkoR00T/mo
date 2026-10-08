package eo3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo3.o, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Leo3/o;", "", "Leo3/i;", "leftTab", "rightTab", "Leo3/v;", "verificationSelector", "<init>", "(Leo3/i;Leo3/i;Leo3/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo3/i;", "getLeftTab", "()Leo3/i;", "b", "getRightTab", "c", "Leo3/v;", "()Leo3/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final VerificationSelector getVerificationSelector() {
        return this.verificationSelector;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSchema)) {
            return false;
        }
        MultiDocumentSchema multiDocumentSchema = (MultiDocumentSchema) other;
        return fr.t.c(this.leftTab, multiDocumentSchema.leftTab) && fr.t.c(this.rightTab, multiDocumentSchema.rightTab) && fr.t.c(this.verificationSelector, multiDocumentSchema.verificationSelector);
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
        return "MultiDocumentSchema(leftTab=" + this.leftTab + ", rightTab=" + this.rightTab + ", verificationSelector=" + this.verificationSelector + ')';
    }
}
