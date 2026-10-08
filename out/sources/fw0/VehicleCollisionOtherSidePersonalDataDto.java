package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.x2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001d"}, d2 = {"Lfw0/x2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lfw0/z2;", "a", "Ljava/util/List;", "()Ljava/util/List;", "drivingLicenses", "b", "Ljava/lang/String;", "firstName", "c", "pesel", "d", "picture", "e", "f", "surname", "secondName", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionOtherSidePersonalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("drivingLicenses")
    private final List<VehicleCollisionParticipantDrivingLicenseDto> drivingLicenses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("picture")
    private final String picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    public final List<VehicleCollisionParticipantDrivingLicenseDto> a() {
        return this.drivingLicenses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionOtherSidePersonalDataDto)) {
            return false;
        }
        VehicleCollisionOtherSidePersonalDataDto vehicleCollisionOtherSidePersonalDataDto = (VehicleCollisionOtherSidePersonalDataDto) other;
        return fr.t.c(this.drivingLicenses, vehicleCollisionOtherSidePersonalDataDto.drivingLicenses) && fr.t.c(this.firstName, vehicleCollisionOtherSidePersonalDataDto.firstName) && fr.t.c(this.pesel, vehicleCollisionOtherSidePersonalDataDto.pesel) && fr.t.c(this.picture, vehicleCollisionOtherSidePersonalDataDto.picture) && fr.t.c(this.surname, vehicleCollisionOtherSidePersonalDataDto.surname) && fr.t.c(this.secondName, vehicleCollisionOtherSidePersonalDataDto.secondName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.drivingLicenses.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VehicleCollisionOtherSidePersonalDataDto(drivingLicenses=" + this.drivingLicenses + ", firstName=" + this.firstName + ", pesel=" + this.pesel + ", picture=" + this.picture + ", surname=" + this.surname + ", secondName=" + this.secondName + ')';
    }
}
