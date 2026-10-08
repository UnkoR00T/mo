package bn3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bn3.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lbn3/h;", "", "Lbn3/b;", "document", "Lbn3/i;", "scope", "<init>", "(Lbn3/b;Lbn3/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbn3/b;", "()Lbn3/b;", "b", "Lbn3/i;", "()Lbn3/i;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleDocumentScope scope;

    public VehicleDocumentData(Document bVar, VehicleDocumentScope iVar) {
        this.document = bVar;
        this.scope = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleDocumentScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDocumentData)) {
            return false;
        }
        VehicleDocumentData vehicleDocumentData = (VehicleDocumentData) other;
        return t.c(this.document, vehicleDocumentData.document) && t.c(this.scope, vehicleDocumentData.scope);
    }

    public int hashCode() {
        Document bVar = this.document;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "VehicleDocumentData(document=" + this.document + ", scope=" + this.scope + ')';
    }
}
