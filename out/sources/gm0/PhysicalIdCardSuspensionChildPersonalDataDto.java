package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.q6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lgm0/q6;", "", "", "firstName", "pesel", "surname", "secondName", "seriesAndNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getPesel", "c", "getSurname", "d", "getSecondName", "e", "getSeriesAndNumber", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardSuspensionChildPersonalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("seriesAndNumber")
    private final String seriesAndNumber;

    public PhysicalIdCardSuspensionChildPersonalDataDto(String str, String str2, String str3, String str4, String str5) {
        this.firstName = str;
        this.pesel = str2;
        this.surname = str3;
        this.secondName = str4;
        this.seriesAndNumber = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardSuspensionChildPersonalDataDto)) {
            return false;
        }
        PhysicalIdCardSuspensionChildPersonalDataDto physicalIdCardSuspensionChildPersonalDataDto = (PhysicalIdCardSuspensionChildPersonalDataDto) other;
        return fr.t.c(this.firstName, physicalIdCardSuspensionChildPersonalDataDto.firstName) && fr.t.c(this.pesel, physicalIdCardSuspensionChildPersonalDataDto.pesel) && fr.t.c(this.surname, physicalIdCardSuspensionChildPersonalDataDto.surname) && fr.t.c(this.secondName, physicalIdCardSuspensionChildPersonalDataDto.secondName) && fr.t.c(this.seriesAndNumber, physicalIdCardSuspensionChildPersonalDataDto.seriesAndNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.firstName.hashCode() * 31) + this.pesel.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.secondName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.seriesAndNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardSuspensionChildPersonalDataDto(firstName=" + this.firstName + ", pesel=" + this.pesel + ", surname=" + this.surname + ", secondName=" + this.secondName + ", seriesAndNumber=" + this.seriesAndNumber + ')';
    }
}
