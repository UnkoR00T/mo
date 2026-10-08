package fp0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fp0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lfp0/a;", "", "Liy/b0;", "fullName", "address", "email", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicantDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 phoneNumber;

    public ApplicantDetails() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicantDetails)) {
            return false;
        }
        ApplicantDetails applicantDetails = (ApplicantDetails) other;
        return t.c(this.fullName, applicantDetails.fullName) && t.c(this.address, applicantDetails.address) && t.c(this.email, applicantDetails.email) && t.c(this.phoneNumber, applicantDetails.phoneNumber);
    }

    public int hashCode() {
        return (((((this.fullName.hashCode() * 31) + this.address.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "ApplicantDetails(fullName=" + this.fullName + ", address=" + this.address + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public ApplicantDetails(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.fullName = b0Var;
        this.address = b0Var2;
        this.email = b0Var3;
        this.phoneNumber = b0Var4;
    }

    public /* synthetic */ ApplicantDetails(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var3, (i15 & 8) != 0 ? b0.INSTANCE.a() : b0Var4);
    }
}
