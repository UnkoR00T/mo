package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/AdvocateCardContainerDto;", "", "number", "", "memberInstitution", "releaseDate", "Ljava/util/Date;", "expiredDate", "permissionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getMemberInstitution", "getReleaseDate", "()Ljava/util/Date;", "getExpiredDate", "getPermissionType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateCardContainerDto {

    @c("eD")
    private final Date expiredDate;

    @c("mi")
    private final String memberInstitution;

    @c("eNo")
    private final String number;

    @c("pk")
    private final String permissionType;

    @c("rd")
    private final Date releaseDate;

    public AdvocateCardContainerDto(String str, String str2, Date date, Date date2, String str3) {
        this.number = str;
        this.memberInstitution = str2;
        this.releaseDate = date;
        this.expiredDate = date2;
        this.permissionType = str3;
    }

    public static /* synthetic */ AdvocateCardContainerDto copy$default(AdvocateCardContainerDto advocateCardContainerDto, String str, String str2, Date date, Date date2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = advocateCardContainerDto.number;
        }
        if ((i15 & 2) != 0) {
            str2 = advocateCardContainerDto.memberInstitution;
        }
        if ((i15 & 4) != 0) {
            date = advocateCardContainerDto.releaseDate;
        }
        if ((i15 & 8) != 0) {
            date2 = advocateCardContainerDto.expiredDate;
        }
        if ((i15 & 16) != 0) {
            str3 = advocateCardContainerDto.permissionType;
        }
        String str4 = str3;
        Date date3 = date;
        return advocateCardContainerDto.copy(str, str2, date3, date2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberInstitution() {
        return this.memberInstitution;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getReleaseDate() {
        return this.releaseDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPermissionType() {
        return this.permissionType;
    }

    public final AdvocateCardContainerDto copy(String number, String memberInstitution, Date releaseDate, Date expiredDate, String permissionType) {
        return new AdvocateCardContainerDto(number, memberInstitution, releaseDate, expiredDate, permissionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateCardContainerDto)) {
            return false;
        }
        AdvocateCardContainerDto advocateCardContainerDto = (AdvocateCardContainerDto) other;
        return t.c(this.number, advocateCardContainerDto.number) && t.c(this.memberInstitution, advocateCardContainerDto.memberInstitution) && t.c(this.releaseDate, advocateCardContainerDto.releaseDate) && t.c(this.expiredDate, advocateCardContainerDto.expiredDate) && t.c(this.permissionType, advocateCardContainerDto.permissionType);
    }

    public final Date getExpiredDate() {
        return this.expiredDate;
    }

    public final String getMemberInstitution() {
        return this.memberInstitution;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPermissionType() {
        return this.permissionType;
    }

    public final Date getReleaseDate() {
        return this.releaseDate;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberInstitution;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.releaseDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiredDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str3 = this.permissionType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AdvocateCardContainerDto(number=" + this.number + ", memberInstitution=" + this.memberInstitution + ", releaseDate=" + this.releaseDate + ", expiredDate=" + this.expiredDate + ", permissionType=" + this.permissionType + ')';
    }
}
