package pl.gov.coi.mobywatel.feature.userdata.data.model.passports;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportDiplomaticDataDto;", "", "number", "", "personalizationDate", "Ljava/time/LocalDate;", "body", "cityAndDate", "title", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getPersonalizationDate", "()Ljava/time/LocalDate;", "getBody", "getCityAndDate", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportDiplomaticDataDto {
    public static final int $stable = 8;

    @c("body")
    private final String body;

    @c("cityAndDate")
    private final String cityAndDate;

    @c("number")
    private final String number;

    @c("personalizationDate")
    private final LocalDate personalizationDate;

    @c("title")
    private final String title;

    public PassportDiplomaticDataDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PassportDiplomaticDataDto copy$default(PassportDiplomaticDataDto passportDiplomaticDataDto, String str, LocalDate localDate, String str2, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = passportDiplomaticDataDto.number;
        }
        if ((i15 & 2) != 0) {
            localDate = passportDiplomaticDataDto.personalizationDate;
        }
        if ((i15 & 4) != 0) {
            str2 = passportDiplomaticDataDto.body;
        }
        if ((i15 & 8) != 0) {
            str3 = passportDiplomaticDataDto.cityAndDate;
        }
        if ((i15 & 16) != 0) {
            str4 = passportDiplomaticDataDto.title;
        }
        String str5 = str4;
        String str6 = str2;
        return passportDiplomaticDataDto.copy(str, localDate, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getPersonalizationDate() {
        return this.personalizationDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCityAndDate() {
        return this.cityAndDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final PassportDiplomaticDataDto copy(String number, LocalDate personalizationDate, String body, String cityAndDate, String title) {
        return new PassportDiplomaticDataDto(number, personalizationDate, body, cityAndDate, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportDiplomaticDataDto)) {
            return false;
        }
        PassportDiplomaticDataDto passportDiplomaticDataDto = (PassportDiplomaticDataDto) other;
        return t.c(this.number, passportDiplomaticDataDto.number) && t.c(this.personalizationDate, passportDiplomaticDataDto.personalizationDate) && t.c(this.body, passportDiplomaticDataDto.body) && t.c(this.cityAndDate, passportDiplomaticDataDto.cityAndDate) && t.c(this.title, passportDiplomaticDataDto.title);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCityAndDate() {
        return this.cityAndDate;
    }

    public final String getNumber() {
        return this.number;
    }

    public final LocalDate getPersonalizationDate() {
        return this.personalizationDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.personalizationDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.body;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cityAndDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PassportDiplomaticDataDto(number=" + this.number + ", personalizationDate=" + this.personalizationDate + ", body=" + this.body + ", cityAndDate=" + this.cityAndDate + ", title=" + this.title + ')';
    }

    public PassportDiplomaticDataDto(String str, LocalDate localDate, String str2, String str3, String str4) {
        this.number = str;
        this.personalizationDate = localDate;
        this.body = str2;
        this.cityAndDate = str3;
        this.title = str4;
    }

    public /* synthetic */ PassportDiplomaticDataDto(String str, LocalDate localDate, String str2, String str3, String str4, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : localDate, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4);
    }
}
