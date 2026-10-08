package tt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltt0/q;", "", "", "name", "Ltt0/i;", "address", "<init>", "(Ljava/lang/String;Ltt0/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ltt0/i;", "()Ltt0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedProductInterventionBusiness {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportedAddress address;

    public BEReportedProductInterventionBusiness(String str, BEReportedAddress bEReportedAddress) {
        this.name = str;
        this.address = bEReportedAddress;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEReportedAddress getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedProductInterventionBusiness)) {
            return false;
        }
        BEReportedProductInterventionBusiness bEReportedProductInterventionBusiness = (BEReportedProductInterventionBusiness) other;
        return fr.t.c(this.name, bEReportedProductInterventionBusiness.name) && fr.t.c(this.address, bEReportedProductInterventionBusiness.address);
    }

    public int hashCode() {
        String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "BEReportedProductInterventionBusiness(name=" + this.name + ", address=" + this.address + ")";
    }
}
