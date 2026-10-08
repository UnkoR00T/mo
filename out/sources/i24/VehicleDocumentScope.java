package i24;

import j24.IdentityDataHeader;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.y0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Li24/y0;", "", "Lj24/b;", "dataHeader", "Li24/w0;", "data", "<init>", "(Lj24/b;Li24/w0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj24/b;", "b", "()Lj24/b;", "Li24/w0;", "()Li24/w0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDocumentScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentityDataHeader dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleDocumentContainerData data;

    public VehicleDocumentScope(IdentityDataHeader identityDataHeader, VehicleDocumentContainerData w0Var) {
        this.dataHeader = identityDataHeader;
        this.data = w0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleDocumentContainerData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IdentityDataHeader getDataHeader() {
        return this.dataHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDocumentScope)) {
            return false;
        }
        VehicleDocumentScope vehicleDocumentScope = (VehicleDocumentScope) other;
        return fr.t.c(this.dataHeader, vehicleDocumentScope.dataHeader) && fr.t.c(this.data, vehicleDocumentScope.data);
    }

    public int hashCode() {
        int iHashCode = this.dataHeader.hashCode() * 31;
        VehicleDocumentContainerData w0Var = this.data;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }

    public String toString() {
        return "VehicleDocumentScope(dataHeader=" + this.dataHeader + ", data=" + this.data + ")";
    }
}
