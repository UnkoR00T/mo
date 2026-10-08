package pl.gov.coi.mobywatel.feature.userdata.data.model.passports;

import androidx.annotation.Keep;
import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportsDataDto;", "", "date", "Ljava/time/OffsetDateTime;", "groupedPassports", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;", "<init>", "(Ljava/time/OffsetDateTime;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;)V", "getDate", "()Ljava/time/OffsetDateTime;", "getGroupedPassports", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportsDataDto {
    public static final int $stable = 8;

    @c("date")
    private final OffsetDateTime date;

    @c("groupedPassports")
    private final GroupedPassportsDto groupedPassports;

    public PassportsDataDto(OffsetDateTime offsetDateTime, GroupedPassportsDto groupedPassportsDto) {
        this.date = offsetDateTime;
        this.groupedPassports = groupedPassportsDto;
    }

    public static /* synthetic */ PassportsDataDto copy$default(PassportsDataDto passportsDataDto, OffsetDateTime offsetDateTime, GroupedPassportsDto groupedPassportsDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            offsetDateTime = passportsDataDto.date;
        }
        if ((i15 & 2) != 0) {
            groupedPassportsDto = passportsDataDto.groupedPassports;
        }
        return passportsDataDto.copy(offsetDateTime, groupedPassportsDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroupedPassportsDto getGroupedPassports() {
        return this.groupedPassports;
    }

    public final PassportsDataDto copy(OffsetDateTime date, GroupedPassportsDto groupedPassports) {
        return new PassportsDataDto(date, groupedPassports);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportsDataDto)) {
            return false;
        }
        PassportsDataDto passportsDataDto = (PassportsDataDto) other;
        return t.c(this.date, passportsDataDto.date) && t.c(this.groupedPassports, passportsDataDto.groupedPassports);
    }

    public final OffsetDateTime getDate() {
        return this.date;
    }

    public final GroupedPassportsDto getGroupedPassports() {
        return this.groupedPassports;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.groupedPassports.hashCode();
    }

    public String toString() {
        return "PassportsDataDto(date=" + this.date + ", groupedPassports=" + this.groupedPassports + ')';
    }
}
