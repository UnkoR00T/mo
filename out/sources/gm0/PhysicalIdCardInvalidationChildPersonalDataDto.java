package gm0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.f6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lgm0/f6;", "", "Ljava/time/LocalDate;", "dateOfBirth", "", "firstName", "maidenName", "placeOfBirth", "surname", "secondName", "seriesAndNumber", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "getDateOfBirth", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "getFirstName", "c", "getMaidenName", "d", "getPlaceOfBirth", "e", "getSurname", "f", "getSecondName", "g", "getSeriesAndNumber", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardInvalidationChildPersonalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateOfBirth")
    private final LocalDate dateOfBirth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maidenName")
    private final String maidenName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeOfBirth")
    private final String placeOfBirth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("seriesAndNumber")
    private final String seriesAndNumber;

    public PhysicalIdCardInvalidationChildPersonalDataDto(LocalDate localDate, String str, String str2, String str3, String str4, String str5, String str6) {
        this.dateOfBirth = localDate;
        this.firstName = str;
        this.maidenName = str2;
        this.placeOfBirth = str3;
        this.surname = str4;
        this.secondName = str5;
        this.seriesAndNumber = str6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardInvalidationChildPersonalDataDto)) {
            return false;
        }
        PhysicalIdCardInvalidationChildPersonalDataDto physicalIdCardInvalidationChildPersonalDataDto = (PhysicalIdCardInvalidationChildPersonalDataDto) other;
        return fr.t.c(this.dateOfBirth, physicalIdCardInvalidationChildPersonalDataDto.dateOfBirth) && fr.t.c(this.firstName, physicalIdCardInvalidationChildPersonalDataDto.firstName) && fr.t.c(this.maidenName, physicalIdCardInvalidationChildPersonalDataDto.maidenName) && fr.t.c(this.placeOfBirth, physicalIdCardInvalidationChildPersonalDataDto.placeOfBirth) && fr.t.c(this.surname, physicalIdCardInvalidationChildPersonalDataDto.surname) && fr.t.c(this.secondName, physicalIdCardInvalidationChildPersonalDataDto.secondName) && fr.t.c(this.seriesAndNumber, physicalIdCardInvalidationChildPersonalDataDto.seriesAndNumber);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.dateOfBirth.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.maidenName.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.secondName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.seriesAndNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardInvalidationChildPersonalDataDto(dateOfBirth=" + this.dateOfBirth + ", firstName=" + this.firstName + ", maidenName=" + this.maidenName + ", placeOfBirth=" + this.placeOfBirth + ", surname=" + this.surname + ", secondName=" + this.secondName + ", seriesAndNumber=" + this.seriesAndNumber + ')';
    }
}
