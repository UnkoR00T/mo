package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;", "", "number", "", "firstName", "secondName", "lastName", "numberOfParliamentCadence", "releaseDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getFirstName", "getSecondName", "getLastName", "getNumberOfParliamentCadence", "getReleaseDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeputyCardContainerDto {

    @c("n")
    private final String firstName;

    @c("su")
    private final String lastName;

    @c("no")
    private final String number;

    @c("pTNo")
    private final String numberOfParliamentCadence;

    @c("rD")
    private final String releaseDate;

    @c("s")
    private final String secondName;

    public DeputyCardContainerDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.number = str;
        this.firstName = str2;
        this.secondName = str3;
        this.lastName = str4;
        this.numberOfParliamentCadence = str5;
        this.releaseDate = str6;
    }

    public static /* synthetic */ DeputyCardContainerDto copy$default(DeputyCardContainerDto deputyCardContainerDto, String str, String str2, String str3, String str4, String str5, String str6, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = deputyCardContainerDto.number;
        }
        if ((i15 & 2) != 0) {
            str2 = deputyCardContainerDto.firstName;
        }
        if ((i15 & 4) != 0) {
            str3 = deputyCardContainerDto.secondName;
        }
        if ((i15 & 8) != 0) {
            str4 = deputyCardContainerDto.lastName;
        }
        if ((i15 & 16) != 0) {
            str5 = deputyCardContainerDto.numberOfParliamentCadence;
        }
        if ((i15 & 32) != 0) {
            str6 = deputyCardContainerDto.releaseDate;
        }
        String str7 = str5;
        String str8 = str6;
        return deputyCardContainerDto.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNumberOfParliamentCadence() {
        return this.numberOfParliamentCadence;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReleaseDate() {
        return this.releaseDate;
    }

    public final DeputyCardContainerDto copy(String number, String firstName, String secondName, String lastName, String numberOfParliamentCadence, String releaseDate) {
        return new DeputyCardContainerDto(number, firstName, secondName, lastName, numberOfParliamentCadence, releaseDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeputyCardContainerDto)) {
            return false;
        }
        DeputyCardContainerDto deputyCardContainerDto = (DeputyCardContainerDto) other;
        return t.c(this.number, deputyCardContainerDto.number) && t.c(this.firstName, deputyCardContainerDto.firstName) && t.c(this.secondName, deputyCardContainerDto.secondName) && t.c(this.lastName, deputyCardContainerDto.lastName) && t.c(this.numberOfParliamentCadence, deputyCardContainerDto.numberOfParliamentCadence) && t.c(this.releaseDate, deputyCardContainerDto.releaseDate);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getNumberOfParliamentCadence() {
        return this.numberOfParliamentCadence;
    }

    public final String getReleaseDate() {
        return this.releaseDate;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.numberOfParliamentCadence;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.releaseDate;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "DeputyCardContainerDto(number=" + this.number + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", numberOfParliamentCadence=" + this.numberOfParliamentCadence + ", releaseDate=" + this.releaseDate + ')';
    }
}
