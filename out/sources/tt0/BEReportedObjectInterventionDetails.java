package tt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltt0/o;", "", "", "carrierName", "facilityName", "Ltt0/i;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltt0/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ltt0/i;", "()Ltt0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedObjectInterventionDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carrierName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportedAddress address;

    public BEReportedObjectInterventionDetails(String str, String str2, BEReportedAddress bEReportedAddress) {
        this.carrierName = str;
        this.facilityName = str2;
        this.address = bEReportedAddress;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEReportedAddress getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCarrierName() {
        return this.carrierName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityName() {
        return this.facilityName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedObjectInterventionDetails)) {
            return false;
        }
        BEReportedObjectInterventionDetails bEReportedObjectInterventionDetails = (BEReportedObjectInterventionDetails) other;
        return fr.t.c(this.carrierName, bEReportedObjectInterventionDetails.carrierName) && fr.t.c(this.facilityName, bEReportedObjectInterventionDetails.facilityName) && fr.t.c(this.address, bEReportedObjectInterventionDetails.address);
    }

    public int hashCode() {
        String str = this.carrierName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.facilityName;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "BEReportedObjectInterventionDetails(carrierName=" + this.carrierName + ", facilityName=" + this.facilityName + ", address=" + this.address + ")";
    }
}
