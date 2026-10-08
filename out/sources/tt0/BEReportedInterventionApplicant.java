package tt0;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: tt0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltt0/k;", "", "", "firstName", "lastName", "eDeliveryAddress", "email", "Lxw/h;", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxw/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "Lxw/h;", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedInterventionApplicant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eDeliveryAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    public BEReportedInterventionApplicant(String str, String str2, String str3, String str4, PhoneNumber phoneNumber) {
        this.firstName = str;
        this.lastName = str2;
        this.eDeliveryAddress = str3;
        this.email = str4;
        this.phoneNumber = phoneNumber;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEDeliveryAddress() {
        return this.eDeliveryAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedInterventionApplicant)) {
            return false;
        }
        BEReportedInterventionApplicant bEReportedInterventionApplicant = (BEReportedInterventionApplicant) other;
        return fr.t.c(this.firstName, bEReportedInterventionApplicant.firstName) && fr.t.c(this.lastName, bEReportedInterventionApplicant.lastName) && fr.t.c(this.eDeliveryAddress, bEReportedInterventionApplicant.eDeliveryAddress) && fr.t.c(this.email, bEReportedInterventionApplicant.email) && fr.t.c(this.phoneNumber, bEReportedInterventionApplicant.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31;
        String str = this.eDeliveryAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PhoneNumber phoneNumber = this.phoneNumber;
        return iHashCode3 + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    }

    public String toString() {
        return "BEReportedInterventionApplicant(firstName=" + this.firstName + ", lastName=" + this.lastName + ", eDeliveryAddress=" + this.eDeliveryAddress + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ")";
    }
}
