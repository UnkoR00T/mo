package sv0;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: sv0.u0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lsv0/u0;", "", "Liy/b0;", "name", "Lxw/h;", "phoneNumber", "email", "<init>", "(Liy/b0;Lxw/h;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Lxw/h;", "c", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCompanyOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    public VehicleCompanyOwner(iy.b0 b0Var, PhoneNumber phoneNumber, iy.b0 b0Var2) {
        this.name = b0Var;
        this.phoneNumber = phoneNumber;
        this.email = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCompanyOwner)) {
            return false;
        }
        VehicleCompanyOwner vehicleCompanyOwner = (VehicleCompanyOwner) other;
        return fr.t.c(this.name, vehicleCompanyOwner.name) && fr.t.c(this.phoneNumber, vehicleCompanyOwner.phoneNumber) && fr.t.c(this.email, vehicleCompanyOwner.email);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        PhoneNumber phoneNumber = this.phoneNumber;
        int iHashCode2 = (iHashCode + (phoneNumber == null ? 0 : phoneNumber.hashCode())) * 31;
        iy.b0 b0Var = this.email;
        return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCompanyOwner(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ")";
    }
}
