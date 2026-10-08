package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsv0/r;", "", "", "insurerId", "insurerName", "Liy/b0;", "insuranceNumber", "", "insuranceAddedManually", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liy/b0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Liy/b0;", "()Liy/b0;", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Insurance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insurerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insurerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 insuranceNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean insuranceAddedManually;

    public Insurance(String str, String str2, iy.b0 b0Var, boolean z15) {
        this.insurerId = str;
        this.insurerName = str2;
        this.insuranceNumber = b0Var;
        this.insuranceAddedManually = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInsuranceAddedManually() {
        return this.insuranceAddedManually;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getInsuranceNumber() {
        return this.insuranceNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInsurerId() {
        return this.insurerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInsurerName() {
        return this.insurerName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insurance)) {
            return false;
        }
        Insurance insurance = (Insurance) other;
        return fr.t.c(this.insurerId, insurance.insurerId) && fr.t.c(this.insurerName, insurance.insurerName) && fr.t.c(this.insuranceNumber, insurance.insuranceNumber) && this.insuranceAddedManually == insurance.insuranceAddedManually;
    }

    public int hashCode() {
        int iHashCode = ((this.insurerId.hashCode() * 31) + this.insurerName.hashCode()) * 31;
        iy.b0 b0Var = this.insuranceNumber;
        return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + Boolean.hashCode(this.insuranceAddedManually);
    }

    public String toString() {
        return "Insurance(insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", insuranceNumber=" + this.insuranceNumber + ", insuranceAddedManually=" + this.insuranceAddedManually + ")";
    }
}
