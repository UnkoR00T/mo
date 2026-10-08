package zu0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"Lzu0/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "isParticipant", "b", "Ljava/lang/String;", "lastName", "c", "name", "d", "pesel", "e", "email", "Lzu0/l;", "Lzu0/l;", "()Lzu0/l;", "phone", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicantDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isParticipant")
    private final boolean isParticipant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phone")
    private final PhoneContactDetailsDto phone;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PhoneContactDetailsDto getPhone() {
        return this.phone;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicantDto)) {
            return false;
        }
        ApplicantDto applicantDto = (ApplicantDto) other;
        return this.isParticipant == applicantDto.isParticipant && fr.t.c(this.lastName, applicantDto.lastName) && fr.t.c(this.name, applicantDto.name) && fr.t.c(this.pesel, applicantDto.pesel) && fr.t.c(this.email, applicantDto.email) && fr.t.c(this.phone, applicantDto.phone);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isParticipant) * 31) + this.lastName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.pesel.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhoneContactDetailsDto phoneContactDetailsDto = this.phone;
        return iHashCode2 + (phoneContactDetailsDto != null ? phoneContactDetailsDto.hashCode() : 0);
    }

    public String toString() {
        return "ApplicantDto(isParticipant=" + this.isParticipant + ", lastName=" + this.lastName + ", name=" + this.name + ", pesel=" + this.pesel + ", email=" + this.email + ", phone=" + this.phone + ')';
    }
}
