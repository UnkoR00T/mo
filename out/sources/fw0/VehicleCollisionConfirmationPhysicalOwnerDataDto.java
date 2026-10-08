package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.k2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfw0/k2;", "", "", "name", "surname", "email", "Lfw0/j2;", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfw0/j2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getSurname", "c", "getEmail", "d", "Lfw0/j2;", "getPhoneNumber", "()Lfw0/j2;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionConfirmationPhysicalOwnerDataDto {

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
    private final VehicleCollisionConfirmationPhoneNumberDataDto phoneNumber;

    public VehicleCollisionConfirmationPhysicalOwnerDataDto(String str, String str2, String str3, VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto) {
        this.name = str;
        this.surname = str2;
        this.email = str3;
        this.phoneNumber = vehicleCollisionConfirmationPhoneNumberDataDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionConfirmationPhysicalOwnerDataDto)) {
            return false;
        }
        VehicleCollisionConfirmationPhysicalOwnerDataDto vehicleCollisionConfirmationPhysicalOwnerDataDto = (VehicleCollisionConfirmationPhysicalOwnerDataDto) other;
        return fr.t.c(this.name, vehicleCollisionConfirmationPhysicalOwnerDataDto.name) && fr.t.c(this.surname, vehicleCollisionConfirmationPhysicalOwnerDataDto.surname) && fr.t.c(this.email, vehicleCollisionConfirmationPhysicalOwnerDataDto.email) && fr.t.c(this.phoneNumber, vehicleCollisionConfirmationPhysicalOwnerDataDto.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.surname.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto = this.phoneNumber;
        return iHashCode2 + (vehicleCollisionConfirmationPhoneNumberDataDto != null ? vehicleCollisionConfirmationPhoneNumberDataDto.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCollisionConfirmationPhysicalOwnerDataDto(name=" + this.name + ", surname=" + this.surname + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
