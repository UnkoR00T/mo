package nj0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b!\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b%\u0010\u0004¨\u0006'"}, d2 = {"Lnj0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "changeVoteAreaAvailability", "b", "Ljava/lang/String;", "commune", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "electionsDate", "d", "electionsName", "e", "number", "Lnj0/f;", "f", "Lnj0/f;", "()Lnj0/f;", "okwAddress", "g", "okwName", "h", "temporaryOkwAddress", "i", "temporaryOkwName", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionsAreaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("changeVoteAreaAvailability")
    private final boolean changeVoteAreaAvailability;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commune")
    private final String commune;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionsDate")
    private final LocalDate electionsDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionsName")
    private final String electionsName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("okwAddress")
    private final CitizenAddressDto okwAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("okwName")
    private final String okwName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryOkwAddress")
    private final CitizenAddressDto temporaryOkwAddress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryOkwName")
    private final String temporaryOkwName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChangeVoteAreaAvailability() {
        return this.changeVoteAreaAvailability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommune() {
        return this.commune;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getElectionsDate() {
        return this.electionsDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getElectionsName() {
        return this.electionsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectionsAreaDto)) {
            return false;
        }
        ElectionsAreaDto electionsAreaDto = (ElectionsAreaDto) other;
        return this.changeVoteAreaAvailability == electionsAreaDto.changeVoteAreaAvailability && fr.t.c(this.commune, electionsAreaDto.commune) && fr.t.c(this.electionsDate, electionsAreaDto.electionsDate) && fr.t.c(this.electionsName, electionsAreaDto.electionsName) && fr.t.c(this.number, electionsAreaDto.number) && fr.t.c(this.okwAddress, electionsAreaDto.okwAddress) && fr.t.c(this.okwName, electionsAreaDto.okwName) && fr.t.c(this.temporaryOkwAddress, electionsAreaDto.temporaryOkwAddress) && fr.t.c(this.temporaryOkwName, electionsAreaDto.temporaryOkwName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CitizenAddressDto getOkwAddress() {
        return this.okwAddress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOkwName() {
        return this.okwName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CitizenAddressDto getTemporaryOkwAddress() {
        return this.temporaryOkwAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.changeVoteAreaAvailability) * 31) + this.commune.hashCode()) * 31) + this.electionsDate.hashCode()) * 31) + this.electionsName.hashCode()) * 31) + this.number.hashCode()) * 31) + this.okwAddress.hashCode()) * 31) + this.okwName.hashCode()) * 31;
        CitizenAddressDto citizenAddressDto = this.temporaryOkwAddress;
        int iHashCode2 = (iHashCode + (citizenAddressDto == null ? 0 : citizenAddressDto.hashCode())) * 31;
        String str = this.temporaryOkwName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTemporaryOkwName() {
        return this.temporaryOkwName;
    }

    public String toString() {
        return "ElectionsAreaDto(changeVoteAreaAvailability=" + this.changeVoteAreaAvailability + ", commune=" + this.commune + ", electionsDate=" + this.electionsDate + ", electionsName=" + this.electionsName + ", number=" + this.number + ", okwAddress=" + this.okwAddress + ", okwName=" + this.okwName + ", temporaryOkwAddress=" + this.temporaryOkwAddress + ", temporaryOkwName=" + this.temporaryOkwName + ')';
    }
}
