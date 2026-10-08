package sv0;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: sv0.w0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001c"}, d2 = {"Lsv0/w0;", "", "Liy/b0;", "name", "surname", "Lxw/h;", "phoneNumber", "email", "<init>", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "d", "c", "Lxw/h;", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehiclePhysicalOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    public VehiclePhysicalOwner(iy.b0 b0Var, iy.b0 b0Var2, PhoneNumber phoneNumber, iy.b0 b0Var3) {
        this.name = b0Var;
        this.surname = b0Var2;
        this.phoneNumber = phoneNumber;
        this.email = b0Var3;
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

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehiclePhysicalOwner)) {
            return false;
        }
        VehiclePhysicalOwner vehiclePhysicalOwner = (VehiclePhysicalOwner) other;
        return fr.t.c(this.name, vehiclePhysicalOwner.name) && fr.t.c(this.surname, vehiclePhysicalOwner.surname) && fr.t.c(this.phoneNumber, vehiclePhysicalOwner.phoneNumber) && fr.t.c(this.email, vehiclePhysicalOwner.email);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.surname.hashCode()) * 31;
        PhoneNumber phoneNumber = this.phoneNumber;
        int iHashCode2 = (iHashCode + (phoneNumber == null ? 0 : phoneNumber.hashCode())) * 31;
        iy.b0 b0Var = this.email;
        return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public String toString() {
        return "VehiclePhysicalOwner(name=" + this.name + ", surname=" + this.surname + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ")";
    }
}
