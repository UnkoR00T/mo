package hx0;

import fr.t;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: renamed from: hx0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhx0/c;", "", "Lhx0/a;", "addingDocument", "Lw30/a;", "checkboxData", "<init>", "(Lhx0/a;Lw30/a;)V", "a", "(Lhx0/a;Lw30/a;)Lhx0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhx0/a;", "c", "()Lhx0/a;", "b", "Lw30/a;", "d", "()Lw30/a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableDocumentCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddingDocument addingDocument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckBoxSingleData checkboxData;

    public AvailableDocumentCardData(AddingDocument addingDocument, CheckBoxSingleData checkBoxSingleData) {
        this.addingDocument = addingDocument;
        this.checkboxData = checkBoxSingleData;
    }

    public static /* synthetic */ AvailableDocumentCardData b(AvailableDocumentCardData availableDocumentCardData, AddingDocument addingDocument, CheckBoxSingleData checkBoxSingleData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            addingDocument = availableDocumentCardData.addingDocument;
        }
        if ((i15 & 2) != 0) {
            checkBoxSingleData = availableDocumentCardData.checkboxData;
        }
        return availableDocumentCardData.a(addingDocument, checkBoxSingleData);
    }

    public final AvailableDocumentCardData a(AddingDocument addingDocument, CheckBoxSingleData checkboxData) {
        return new AvailableDocumentCardData(addingDocument, checkboxData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddingDocument getAddingDocument() {
        return this.addingDocument;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CheckBoxSingleData getCheckboxData() {
        return this.checkboxData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableDocumentCardData)) {
            return false;
        }
        AvailableDocumentCardData availableDocumentCardData = (AvailableDocumentCardData) other;
        return t.c(this.addingDocument, availableDocumentCardData.addingDocument) && t.c(this.checkboxData, availableDocumentCardData.checkboxData);
    }

    public int hashCode() {
        return (this.addingDocument.hashCode() * 31) + this.checkboxData.hashCode();
    }

    public String toString() {
        return "AvailableDocumentCardData(addingDocument=" + this.addingDocument + ", checkboxData=" + this.checkboxData + ')';
    }
}
