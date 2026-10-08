package gm0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.y, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lgm0/y;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "date", "Lgm0/g2;", "Lgm0/g2;", "c", "()Lgm0/g2;", "gender", "Ljava/lang/String;", "d", "place", "certificateNumber", "Lgm0/x;", "e", "Lgm0/x;", "()Lgm0/x;", "registrationAuthority", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationBirthDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gender")
    private final g2 gender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("place")
    private final String place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateNumber")
    private final String certificateNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthority")
    private final ChildBirthRegistrationAuthorityDataDto registrationAuthority;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCertificateNumber() {
        return this.certificateNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g2 getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChildBirthRegistrationAuthorityDataDto getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationBirthDataDto)) {
            return false;
        }
        ChildBirthRegistrationBirthDataDto childBirthRegistrationBirthDataDto = (ChildBirthRegistrationBirthDataDto) other;
        return fr.t.c(this.date, childBirthRegistrationBirthDataDto.date) && this.gender == childBirthRegistrationBirthDataDto.gender && fr.t.c(this.place, childBirthRegistrationBirthDataDto.place) && fr.t.c(this.certificateNumber, childBirthRegistrationBirthDataDto.certificateNumber) && fr.t.c(this.registrationAuthority, childBirthRegistrationBirthDataDto.registrationAuthority);
    }

    public int hashCode() {
        int iHashCode = ((((this.date.hashCode() * 31) + this.gender.hashCode()) * 31) + this.place.hashCode()) * 31;
        String str = this.certificateNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto = this.registrationAuthority;
        return iHashCode2 + (childBirthRegistrationAuthorityDataDto != null ? childBirthRegistrationAuthorityDataDto.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationBirthDataDto(date=" + this.date + ", gender=" + this.gender + ", place=" + this.place + ", certificateNumber=" + this.certificateNumber + ", registrationAuthority=" + this.registrationAuthority + ')';
    }
}
