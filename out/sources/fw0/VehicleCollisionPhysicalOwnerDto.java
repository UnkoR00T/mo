package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.d3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfw0/d3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "name", "d", "surname", "c", "email", "Lfw0/c3;", "Lfw0/c3;", "()Lfw0/c3;", "phoneNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionPhysicalOwnerDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final VehicleCollisionPhoneNumberDataDto phoneNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleCollisionPhoneNumberDataDto getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionPhysicalOwnerDto)) {
            return false;
        }
        VehicleCollisionPhysicalOwnerDto vehicleCollisionPhysicalOwnerDto = (VehicleCollisionPhysicalOwnerDto) other;
        return fr.t.c(this.name, vehicleCollisionPhysicalOwnerDto.name) && fr.t.c(this.surname, vehicleCollisionPhysicalOwnerDto.surname) && fr.t.c(this.email, vehicleCollisionPhysicalOwnerDto.email) && fr.t.c(this.phoneNumber, vehicleCollisionPhysicalOwnerDto.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.surname.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        VehicleCollisionPhoneNumberDataDto vehicleCollisionPhoneNumberDataDto = this.phoneNumber;
        return iHashCode2 + (vehicleCollisionPhoneNumberDataDto != null ? vehicleCollisionPhoneNumberDataDto.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCollisionPhysicalOwnerDto(name=" + this.name + ", surname=" + this.surname + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
